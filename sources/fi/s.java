package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.k8;
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
public final class s {
    public static final WeakHashMap f9964k = new WeakHashMap();
    public static KeyStore f9965l;
    public final Context f9966a;
    public final int f9967b;
    public final long f9968c;
    public boolean d;
    public boolean f9969e;
    public boolean f9970f;
    public String f9971g;
    public String h;
    public a4.m f9972i;
    public bi.f0 f9973j;

    public s(Context context, int i10, long j3) {
        this.f9966a = context;
        this.f9967b = i10;
        this.f9968c = j3;
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
        f9964k.clear();
    }

    public static s c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        WeakHashMap weakHashMap = f9964k;
        s sVar = (s) weakHashMap.get(pair);
        if (sVar == null) {
            s sVar2 = new s(context, i10, j3);
            weakHashMap.put(pair, sVar2);
            return sVar2;
        }
        return sVar;
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
            s c10 = c(activity, i10, l4.longValue());
            if (c10.f9969e && c10.f9970f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new k8(i10, arrayList, hashMap, callback));
        }
    }

    public final boolean a() {
        return this.f9970f;
    }

    public final SecretKey e() {
        if (f9965l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f9965l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f9965l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f9968c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f9965l;
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
        throw new UnsupportedOperationException("Method not decompiled: fi.s.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f9969e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f9966a.getSharedPreferences("2botbiometry_" + this.f9967b, 0);
        long j3 = this.f9968c;
        this.f9971g = sharedPreferences.getString(String.valueOf(j3), null);
        this.h = sharedPreferences.getString(String.valueOf(j3) + "_iv", null);
        boolean z11 = true;
        if (this.f9971g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9969e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j3 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f9970f = z11;
        this.d = sharedPreferences.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                SecretKey e7 = e();
                if (z10) {
                    cipher.init(2, e7, new IvParameterSpec(Utilities.hexToBytes(this.h)));
                } else {
                    cipher.init(1, e7);
                }
                return new androidx.biometric.u(cipher);
            }
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.u uVar;
        int i10;
        int i11;
        this.f9973j = null;
        try {
            if (this.f9972i == null) {
                this.f9972i = new a4.m(LaunchActivity.G1, f0.e.e(this.f9966a), new q(this));
            }
            androidx.biometric.u i12 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f9967b).getUser(Long.valueOf(this.f9968c));
            j6.l lVar = new j6.l(1);
            lVar.f13577b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            int i13 = 15;
            lVar.f13576a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.f13578c = str;
            }
            j6.l b10 = lVar.b();
            if (i12 != null) {
                Cipher cipher = i12.f1071b;
                if (!z10 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f9971g = null;
                        } else if (i11 < 23) {
                            this.f9971g = str2;
                        } else {
                            this.f9971g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i12 = i(z10);
                    }
                }
            }
            if (i12 != null && Build.VERSION.SDK_INT < 30) {
                uVar = i12;
            } else {
                uVar = null;
            }
            this.f9973j = new bi.f0(3, callback3, uVar);
            if (i12 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                a4.m mVar = this.f9972i;
                mVar.getClass();
                int i14 = b10.f13576a;
                if (i14 != 0) {
                    i13 = i14;
                }
                if ((i13 & 255) != 255) {
                    if (i10 < 30 && v7.m.a(i13)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    mVar.h0(b10, i12);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f9972i.h0(b10, null);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f9966a.getSharedPreferences("2botbiometry_" + this.f9967b, 0).edit();
        boolean z10 = this.f9970f;
        long j3 = this.f9968c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.f9969e) {
            String valueOf = String.valueOf(j3);
            String str = this.f9971g;
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

    public final void l(String str, final String str2, final bi.o4 o4Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                s sVar = s.this;
                sVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            sVar.f9971g = null;
                            sVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                sVar.f9971g = str3;
                                sVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    uVar = sVar.i(false);
                                }
                                if (uVar != null) {
                                    Cipher cipher = uVar.f1071b;
                                    sVar.f9971g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                    sVar.h = Utilities.bytesToHex(cipher.getIV());
                                } else {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                            }
                        }
                        sVar.k();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bool = Boolean.FALSE;
                    }
                }
                o4Var.run(bool);
            }
        });
    }
}
