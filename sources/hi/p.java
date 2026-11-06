package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.p5;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.x10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class p {
    public static final WeakHashMap f14843k = new WeakHashMap();
    public static KeyStore f14844l;
    public final Context f14845a;
    public final int f14846b;
    public final long f14847c;
    public boolean d;
    public boolean f14848e;
    public boolean f14849f;
    public String f14850g;
    public String h;
    public cb.c f14851i;
    public p5 f14852j;

    public p(Context context, int i7, long j3) {
        this.f14845a = context;
        this.f14846b = i7;
        this.f14847c = j3;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.f25555b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("2botbiometry_" + i7, 0).edit().clear().apply();
        }
        f14843k.clear();
    }

    public static p c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        WeakHashMap weakHashMap = f14843k;
        p pVar = (p) weakHashMap.get(pair);
        if (pVar == null) {
            p pVar2 = new p(context, i7, j3);
            weakHashMap.put(pair, pVar2);
            return pVar2;
        }
        return pVar;
    }

    public static void d(Activity activity, int i7, c20 c20Var) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i7, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            p c10 = c(activity, i7, l10.longValue());
            if (c10.f14848e && c10.f14849f) {
                hashMap.put(l10, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            c20Var.a(new ArrayList());
        } else {
            yr.a0(i7).f26688a.c(new ai.a1(i7, arrayList, hashMap, c20Var, 4));
        }
    }

    public final boolean a() {
        return this.f14849f;
    }

    public final SecretKey e() {
        if (f14844l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f14844l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f14844l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f14847c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f14844l;
            return (SecretKey) keyStore3.getKey("9bot_" + j3, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j3, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i7 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: hi.p.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f14848e;
    }

    public final void h() {
        boolean z9;
        SharedPreferences sharedPreferences = this.f14845a.getSharedPreferences("2botbiometry_" + this.f14846b, 0);
        long j3 = this.f14847c;
        this.f14850g = sharedPreferences.getString(String.valueOf(j3), null);
        this.h = sharedPreferences.getString(String.valueOf(j3) + "_iv", null);
        boolean z10 = true;
        if (this.f14850g != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f14848e = z9;
        if (!z9) {
            if (!sharedPreferences.getBoolean(j3 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f14849f = z10;
        this.d = sharedPreferences.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.v i(boolean z9) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e10 = e();
            if (z9) {
                cipher.init(2, e10, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, e10);
            }
            return new androidx.biometric.v(cipher);
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public final void j(String str, boolean z9, String str2, x10 x10Var) {
        androidx.biometric.v vVar;
        int i7;
        this.f14852j = null;
        try {
            if (this.f14851i == null) {
                this.f14851i = new cb.c(LaunchActivity.G1, f0.d.e(this.f14845a), new n(this, 0));
            }
            androidx.biometric.v i10 = i(z9);
            TLRPC.User a22 = qp.s1(this.f14846b).a2(Long.valueOf(this.f14847c));
            m6.n nVar = new m6.n(1);
            nVar.f19918b = t10.p(a22);
            nVar.d = hd.M0(2131753756, null);
            int i11 = 15;
            nVar.f19917a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.f19919c = str;
            }
            m6.n b10 = nVar.b();
            if (i10 != null) {
                Cipher cipher = i10.f2024b;
                if (!z9 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f14850g = null;
                        } else {
                            this.f14850g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        x10Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i10 = i(z9);
                    }
                }
            }
            if (i10 != null && Build.VERSION.SDK_INT < 30) {
                vVar = i10;
            } else {
                vVar = null;
            }
            this.f14852j = new p5(7, x10Var, vVar);
            if (i10 != null && (i7 = Build.VERSION.SDK_INT) < 30) {
                cb.c cVar = this.f14851i;
                cVar.getClass();
                int i12 = b10.f19917a;
                if (i12 != 0) {
                    i11 = i12;
                }
                if ((i11 & 255) != 255) {
                    if (i7 < 30 && a8.k1.a(i11)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.l(b10, i10);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f14851i.l(b10, null);
        } catch (Exception e11) {
            a8.g(e11, true);
            x10Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f14845a.getSharedPreferences("2botbiometry_" + this.f14846b, 0).edit();
        boolean z9 = this.f14849f;
        long j3 = this.f14847c;
        if (z9) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.f14848e) {
            String valueOf = String.valueOf(j3);
            String str = this.f14850g;
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

    public final void l(String str, final String str2, final bi.v3 v3Var) {
        j(str, false, str2, new x10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                p pVar = p.this;
                pVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            pVar.f14850g = null;
                            pVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = pVar.i(false);
                            }
                            if (vVar != null) {
                                Cipher cipher = vVar.f2024b;
                                pVar.f14850g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                pVar.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        pVar.k();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        bool = Boolean.FALSE;
                    }
                }
                v3Var.a(bool);
            }
        });
    }
}
