package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class up0 {
    public static final WeakHashMap k = new WeakHashMap();
    public static KeyStore l;
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public k6d i;
    public lf2 j;

    public up0(Context context, int i, long j) {
        this.a = context;
        this.b = i;
        this.c = j;
        f();
    }

    public static void a() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("2botbiometry_" + i, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static up0 b(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        WeakHashMap weakHashMap = k;
        up0 up0Var = (up0) weakHashMap.get(pair);
        if (up0Var == null) {
            up0 up0Var2 = new up0(context, i, j);
            weakHashMap.put(pair, up0Var2);
            return up0Var2;
        }
        return up0Var;
    }

    public static void c(Activity activity, int i, qac qacVar) {
        int i2 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l2 = (Long) obj;
            up0 b = b(activity, i, l2.longValue());
            if (b.e && b.f) {
                hashMap.put(l2, Boolean.valueOf(!b.d));
            }
        }
        if (arrayList.isEmpty()) {
            qacVar.a(new ArrayList());
        } else {
            cf7.Y(i).a.c(new up6(i, arrayList, hashMap, qacVar));
        }
    }

    public final SecretKey d() {
        if (l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = l;
        StringBuilder sb = new StringBuilder("9bot_");
        long j = this.c;
        sb.append(j);
        if (keyStore2.containsAlias(sb.toString())) {
            KeyStore keyStore3 = l;
            return (SecretKey) keyStore3.getKey("9bot_" + j, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(kt6.n(j, "9bot_"), 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up0.e():org.json.JSONObject");
    }

    public final void f() {
        boolean z;
        SharedPreferences k2 = aq1.k(new StringBuilder("2botbiometry_"), this.b, this.a, 0);
        long j = this.c;
        this.g = k2.getString(String.valueOf(j), null);
        this.h = k2.getString(String.valueOf(j) + "_iv", null);
        boolean z2 = true;
        if (this.g != null) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (!z) {
            if (!k2.getBoolean(j + "_requested", false)) {
                z2 = false;
            }
        }
        this.f = z2;
        this.d = k2.getBoolean(j + "_disabled", false);
    }

    public final gk0 g(boolean z) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey d = d();
            if (z) {
                cipher.init(2, d, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, d);
            }
            return new gk0(cipher);
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final void h(String str, boolean z, String str2, lac lacVar) {
        gk0 gk0Var;
        int i;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new k6d(LaunchActivity.H1, rs.g(this.a), new sp0(this, (byte) 0));
            }
            gk0 g = g(z);
            TLRPC.User W1 = oc7.r1(this.b).W1(Long.valueOf(this.c));
            hk0 hk0Var = new hk0();
            hk0Var.a = m9c.r(W1);
            hk0Var.c = jb6.M0(2131753721, null);
            hk0Var.d = (byte) 15;
            if (!TextUtils.isEmpty(str)) {
                hk0Var.b = str;
            }
            hk0 a = hk0Var.a();
            if (g != null) {
                Cipher cipher = g.b;
                if (!z && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else {
                            this.g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        i();
                        lacVar.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        g = g(z);
                    }
                }
            }
            if (g != null && Build.VERSION.SDK_INT < 30) {
                gk0Var = g;
            } else {
                gk0Var = null;
            }
            this.j = new lf2(lacVar, gk0Var, (byte) 5);
            if (g != null && (i = Build.VERSION.SDK_INT) < 30) {
                k6d k6dVar = this.i;
                k6dVar.getClass();
                int a2 = zod.a(a, g);
                if ((a2 & 255) != 255) {
                    if (i < 30 && zod.b(a2)) {
                        u36.j("Crypto-based authentication is not supported for device credential prior to API 30.");
                        return;
                    } else {
                        k6dVar.n(a, g);
                        return;
                    }
                }
                u36.j("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                return;
            }
            this.i.n(a, null);
        } catch (Exception e2) {
            fc4.g(e2, true);
            lacVar.a(Boolean.FALSE, null, null);
        }
    }

    public final void i() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z = this.f;
        long j = this.c;
        if (z) {
            edit.putBoolean(j + "_requested", true);
        } else {
            edit.remove(j + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j);
            String str = this.g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j));
            edit.remove(String.valueOf(j) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j + "_disabled", true);
        } else {
            edit.remove(j + "_disabled");
        }
        edit.apply();
    }

    public final void j(String str, final String str2, final iu iuVar) {
        h(str, false, str2, new lac() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                fk0 fk0Var = (fk0) obj2;
                gk0 gk0Var = (gk0) obj3;
                up0 up0Var = up0.this;
                up0Var.getClass();
                if (fk0Var != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            up0Var.g = null;
                            up0Var.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                gk0Var = up0Var.g(false);
                            }
                            if (gk0Var != null) {
                                Cipher cipher = gk0Var.b;
                                up0Var.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                up0Var.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        up0Var.i();
                    } catch (Exception e) {
                        fc4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                iuVar.a(bool);
            }
        });
    }
}
