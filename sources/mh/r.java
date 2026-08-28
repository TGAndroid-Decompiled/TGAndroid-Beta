package mh;

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
import org.telegram.ui.eb0;
public final class r {
    public static final WeakHashMap f18059k = new WeakHashMap();
    public static KeyStore f18060l;
    public final Context f18061a;
    public final int f18062b;
    public final long f18063c;
    public boolean d;
    public boolean f18064e;
    public boolean f18065f;
    public String f18066g;
    public String h;
    public xa.c f18067i;
    public bg.y0 f18068j;

    public r(Context context, int i9, long j10) {
        this.f18061a = context;
        this.f18062b = i9;
        this.f18063c = j10;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            context.getSharedPreferences("2botbiometry_" + i9, 0).edit().clear().apply();
        }
        f18059k.clear();
    }

    public static r c(Context context, int i9, long j10) {
        Pair pair = new Pair(Integer.valueOf(i9), Long.valueOf(j10));
        WeakHashMap weakHashMap = f18059k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar == null) {
            r rVar2 = new r(context, i9, j10);
            weakHashMap.put(pair, rVar2);
            return rVar2;
        }
        return rVar;
    }

    public static void d(Activity activity, int i9, Utilities.Callback callback) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i9, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            r c10 = c(activity, i9, l10.longValue());
            if (c10.f18064e && c10.f18065f) {
                hashMap.put(l10, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i9).getStorageQueue().postRunnable(new c3.d(i9, arrayList, hashMap, callback, 3));
        }
    }

    public final boolean a() {
        return this.f18065f;
    }

    public final SecretKey e() {
        if (f18060l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f18060l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f18060l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f18063c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f18060l;
            return (SecretKey) keyStore3.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i9 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: mh.r.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f18064e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f18061a.getSharedPreferences("2botbiometry_" + this.f18062b, 0);
        long j10 = this.f18063c;
        this.f18066g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f18066g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18064e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f18065f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                SecretKey e10 = e();
                if (z10) {
                    cipher.init(2, e10, new IvParameterSpec(Utilities.hexToBytes(this.h)));
                } else {
                    cipher.init(1, e10);
                }
                return new androidx.biometric.u(cipher);
            }
            return null;
        } catch (Exception e11) {
            FileLog.e(e11);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.u uVar;
        int i9;
        int i10;
        this.f18068j = null;
        try {
            if (this.f18067i == null) {
                this.f18067i = new xa.c(LaunchActivity.C1, f0.e.e(this.f18061a), new p(this));
            }
            androidx.biometric.u i11 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f18062b).getUser(Long.valueOf(this.f18063c));
            d5.w wVar = new d5.w();
            wVar.f4402b = UserObject.getUserName(user);
            wVar.d = LocaleController.getString(R.string.Back);
            int i12 = 15;
            wVar.f4401a = 15;
            if (!TextUtils.isEmpty(str)) {
                wVar.f4403c = str;
            }
            t5.l e10 = wVar.e();
            if (i11 != null) {
                Cipher cipher = i11.f563b;
                if (!z10 && (i10 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f18066g = null;
                        } else if (i10 < 23) {
                            this.f18066g = str2;
                        } else {
                            this.f18066g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        i11 = i(z10);
                    }
                }
            }
            if (i11 != null && Build.VERSION.SDK_INT < 30) {
                uVar = i11;
            } else {
                uVar = null;
            }
            this.f18068j = new bg.y0(9, callback3, uVar);
            if (i11 != null && (i9 = Build.VERSION.SDK_INT) < 30) {
                xa.c cVar = this.f18067i;
                cVar.getClass();
                int i13 = e10.f47699a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i9 < 30 && f7.m.a(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.b(e10, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f18067i.b(e10, null);
        } catch (Exception e12) {
            FileLog.e(e12);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f18061a.getSharedPreferences("2botbiometry_" + this.f18062b, 0).edit();
        boolean z10 = this.f18065f;
        long j10 = this.f18063c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.f18064e) {
            String valueOf = String.valueOf(j10);
            String str = this.f18066g;
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

    public final void l(String str, final String str2, final eb0 eb0Var) {
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
                            rVar.f18066g = null;
                            rVar.h = null;
                        } else {
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 23) {
                                rVar.f18066g = str3;
                                rVar.h = null;
                            } else {
                                if (i9 >= 30) {
                                    uVar = rVar.i(false);
                                }
                                if (uVar != null) {
                                    Cipher cipher = uVar.f563b;
                                    rVar.f18066g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                    rVar.h = Utilities.bytesToHex(cipher.getIV());
                                } else {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                            }
                        }
                        rVar.k();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bool = Boolean.FALSE;
                    }
                }
                eb0Var.run(bool);
            }
        });
    }
}
