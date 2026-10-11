package ei;

import ai.d9;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class r {
    public static final WeakHashMap f9313k = new WeakHashMap();
    public static KeyStore f9314l;
    public final Context f9315a;
    public final int f9316b;
    public final long f9317c;
    public boolean d;
    public boolean f9318e;
    public boolean f9319f;
    public String f9320g;
    public String h;
    public pb.c f9321i;
    public ai.m0 f9322j;

    public r(Context context, int i10, long j3) {
        this.f9315a = context;
        this.f9316b = i10;
        this.f9317c = j3;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        f9313k.clear();
    }

    public static r c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        WeakHashMap weakHashMap = f9313k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar == null) {
            r rVar2 = new r(context, i10, j3);
            weakHashMap.put(pair, rVar2);
            return rVar2;
        }
        return rVar;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l4 = (Long) obj;
            r c10 = c(activity, i10, l4.longValue());
            if (c10.f9318e && c10.f9319f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new d9(i10, arrayList, hashMap, callback));
        }
    }

    public final boolean a() {
        return this.f9319f;
    }

    public final SecretKey e() {
        if (f9314l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f9314l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f9314l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f9317c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f9314l;
            return (SecretKey) keyStore3.getKey("9bot_" + j3, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j3, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i10 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: ei.r.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f9318e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f9315a.getSharedPreferences("2botbiometry_" + this.f9316b, 0);
        long j3 = this.f9317c;
        this.f9320g = sharedPreferences.getString(String.valueOf(j3), null);
        this.h = sharedPreferences.getString(String.valueOf(j3) + "_iv", null);
        boolean z11 = true;
        if (this.f9320g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9318e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j3 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f9319f = z11;
        this.d = sharedPreferences.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.t i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e7 = e();
            if (z10) {
                cipher.init(2, e7, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e7);
            }
            return new androidx.biometric.t(cipher);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.t tVar;
        int i10;
        this.f9322j = null;
        try {
            if (this.f9321i == null) {
                this.f9321i = new pb.c(LaunchActivity.G1, f0.c.d(this.f9315a), new p(this));
            }
            androidx.biometric.t i11 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f9316b).getUser(Long.valueOf(this.f9317c));
            j6.l lVar = new j6.l(2);
            lVar.f14061b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            int i12 = 15;
            lVar.f14060a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.f14062c = str;
            }
            j6.l b10 = lVar.b();
            if (i11 != null) {
                Cipher cipher = i11.f2321b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f9320g = null;
                        } else {
                            this.f9320g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i11 = i(z10);
                    }
                }
            }
            if (i11 != null && Build.VERSION.SDK_INT < 30) {
                tVar = i11;
            } else {
                tVar = null;
            }
            this.f9322j = new ai.m0(3, callback3, tVar);
            if (i11 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                pb.c cVar = this.f9321i;
                cVar.getClass();
                int i13 = b10.f14060a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i10 < 30 && te.b.b(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.z(b10, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f9321i.z(b10, null);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f9315a.getSharedPreferences("2botbiometry_" + this.f9316b, 0).edit();
        boolean z10 = this.f9319f;
        long j3 = this.f9317c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.f9318e) {
            String valueOf = String.valueOf(j3);
            String str = this.f9320g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j3) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j3));
            edit.remove(String.valueOf(j3) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j3 + "_disabled", true);
        } else {
            edit.remove(j3 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final ai.d5 d5Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                r rVar = r.this;
                rVar.getClass();
                if (sVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            rVar.f9320g = null;
                            rVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                tVar = rVar.i(false);
                            }
                            if (tVar != null) {
                                Cipher cipher = tVar.f2321b;
                                rVar.f9320g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                rVar.h = Utilities.bytesToHex(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        rVar.k();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bool = Boolean.FALSE;
                    }
                }
                d5Var.run(bool);
            }
        });
    }
}
