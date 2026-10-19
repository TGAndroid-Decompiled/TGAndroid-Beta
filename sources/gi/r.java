package gi;

import ai.cb;
import ai.r5;
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
    public static final WeakHashMap f11408k = new WeakHashMap();
    public static KeyStore f11409l;
    public final Context f11410a;
    public final int f11411b;
    public final long f11412c;
    public boolean d;
    public boolean e;
    public boolean f11413f;
    public String f11414g;
    public String h;
    public qb.c f11415i;
    public r5 f11416j;

    public r(Context context, int i10, long j10) {
        this.f11410a = context;
        this.f11411b = i10;
        this.f11412c = j10;
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
        f11408k.clear();
    }

    public static r c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f11408k;
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
            if (c10.e && c10.f11413f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new cb(i10, arrayList, hashMap, callback, 2));
        }
    }

    public final boolean a() {
        return this.f11413f;
    }

    public final SecretKey e() {
        if (f11409l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f11409l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f11409l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f11412c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f11409l;
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
        throw new UnsupportedOperationException("Method not decompiled: gi.r.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f11410a.getSharedPreferences("2botbiometry_" + this.f11411b, 0);
        long j10 = this.f11412c;
        this.f11414g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f11414g != null) {
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
        this.f11413f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z10) {
                cipher.init(2, e, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.u(cipher);
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.u uVar;
        int i10;
        this.f11416j = null;
        try {
            if (this.f11415i == null) {
                this.f11415i = new qb.c(LaunchActivity.H1, f0.c.d(this.f11410a), new p(this));
            }
            androidx.biometric.u i11 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f11411b).getUser(Long.valueOf(this.f11412c));
            j6.l lVar = new j6.l(1);
            lVar.f14289b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            int i12 = 15;
            lVar.f14288a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.f14290c = str;
            }
            j6.l a2 = lVar.a();
            if (i11 != null) {
                Cipher cipher = i11.f2837b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f11414g = null;
                        } else {
                            this.f11414g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
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
                uVar = i11;
            } else {
                uVar = null;
            }
            this.f11416j = new r5(7, callback3, uVar);
            if (i11 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                qb.c cVar = this.f11415i;
                cVar.getClass();
                int i13 = a2.f14288a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i10 < 30 && v7.k.a(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.c(a2, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f11415i.c(a2, null);
        } catch (Exception e7) {
            FileLog.e(e7);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f11410a.getSharedPreferences("2botbiometry_" + this.f11411b, 0).edit();
        boolean z10 = this.f11413f;
        long j10 = this.f11412c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.f11414g;
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

    public final void l(String str, final String str2, final ai.a4 a4Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                r rVar = r.this;
                rVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            rVar.f11414g = null;
                            rVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                uVar = rVar.i(false);
                            }
                            if (uVar != null) {
                                Cipher cipher = uVar.f2837b;
                                rVar.f11414g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
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
                a4Var.run(bool);
            }
        });
    }
}
