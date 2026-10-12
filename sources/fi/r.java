package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.n8;
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
    public static final WeakHashMap f9501k = new WeakHashMap();
    public static KeyStore f9502l;
    public final Context f9503a;
    public final int f9504b;
    public final long f9505c;
    public boolean d;
    public boolean e;
    public boolean f9506f;
    public String f9507g;
    public String h;
    public k6.h f9508i;
    public bi.f0 f9509j;

    public r(Context context, int i10, long j10) {
        this.f9503a = context;
        this.f9504b = i10;
        this.f9505c = j10;
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
        f9501k.clear();
    }

    public static r c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f9501k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar == null) {
            r rVar2 = new r(context, i10, j10);
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
                } catch (Exception e) {
                    FileLog.e(e);
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
            if (c10.e && c10.f9506f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new n8(i10, arrayList, hashMap, callback));
        }
    }

    public final boolean a() {
        return this.f9506f;
    }

    public final SecretKey e() {
        if (f9502l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f9502l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f9502l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f9505c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f9502l;
            return (SecretKey) keyStore3.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
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
        throw new UnsupportedOperationException("Method not decompiled: fi.r.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f9503a.getSharedPreferences("2botbiometry_" + this.f9504b, 0);
        long j10 = this.f9505c;
        this.f9507g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f9507g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f9506f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.v i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z10) {
                cipher.init(2, e, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.v(cipher);
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.v vVar;
        int i10;
        this.f9509j = null;
        try {
            if (this.f9508i == null) {
                this.f9508i = new k6.h(LaunchActivity.G1, f0.c.d(this.f9503a), new p(this));
            }
            androidx.biometric.v i11 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f9504b).getUser(Long.valueOf(this.f9505c));
            j6.l lVar = new j6.l(1);
            lVar.f12873b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            int i12 = 15;
            lVar.f12872a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.f12874c = str;
            }
            j6.l a2 = lVar.a();
            if (i11 != null) {
                Cipher cipher = i11.f1219b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f9507g = null;
                        } else {
                            this.f9507g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i11 = i(z10);
                    }
                }
            }
            if (i11 != null && Build.VERSION.SDK_INT < 30) {
                vVar = i11;
            } else {
                vVar = null;
            }
            this.f9509j = new bi.f0(3, callback3, vVar);
            if (i11 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                k6.h hVar = this.f9508i;
                hVar.getClass();
                int i13 = a2.f12872a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i10 < 30 && v7.k.a(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    hVar.k(a2, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f9508i.k(a2, null);
        } catch (Exception e7) {
            FileLog.e(e7);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f9503a.getSharedPreferences("2botbiometry_" + this.f9504b, 0).edit();
        boolean z10 = this.f9506f;
        long j10 = this.f9505c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.f9507g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j10) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j10));
            edit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j10 + "_disabled", true);
        } else {
            edit.remove(j10 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final bi.q4 q4Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                r rVar = r.this;
                rVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            rVar.f9507g = null;
                            rVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = rVar.i(false);
                            }
                            if (vVar != null) {
                                Cipher cipher = vVar.f1219b;
                                rVar.f9507g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                rVar.h = Utilities.bytesToHex(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        rVar.k();
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                q4Var.run(bool);
            }
        });
    }
}
