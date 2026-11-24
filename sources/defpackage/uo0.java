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
public final class uo0 {
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
    public i4d i;
    public ae2 j;

    public uo0(Context context, int i, long j) {
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

    public static uo0 b(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        WeakHashMap weakHashMap = k;
        uo0 uo0Var = (uo0) weakHashMap.get(pair);
        if (uo0Var == null) {
            uo0 uo0Var2 = new uo0(context, i, j);
            weakHashMap.put(pair, uo0Var2);
            return uo0Var2;
        }
        return uo0Var;
    }

    public static void c(Activity activity, int i, p8c p8cVar) {
        int i2 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l2 = (Long) obj;
            uo0 b = b(activity, i, l2.longValue());
            if (b.e && b.f) {
                hashMap.put(l2, Boolean.valueOf(!b.d));
            }
        }
        if (arrayList.isEmpty()) {
            p8cVar.a(new ArrayList());
        } else {
            ad7.Y(i).a.c(new tn6(i, arrayList, hashMap, p8cVar));
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
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(ls6.n(j, "9bot_"), 3);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo0.e():org.json.JSONObject");
    }

    public final void f() {
        boolean z;
        SharedPreferences k2 = oo1.k(new StringBuilder("2botbiometry_"), this.b, this.a, 0);
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

    public final gj0 g(boolean z) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey d = d();
            if (z) {
                cipher.init(2, d, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, d);
            }
            return new gj0(cipher);
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public final void h(String str, boolean z, String str2, k8c k8cVar) {
        gj0 gj0Var;
        int i;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new i4d(LaunchActivity.H1, rr.g(this.a), new so0(this, (byte) 0));
            }
            gj0 g = g(z);
            TLRPC.User V1 = na7.q1(this.b).V1(Long.valueOf(this.c));
            hj0 hj0Var = new hj0();
            hj0Var.a = l7c.r(V1);
            hj0Var.c = k96.M0(2131753753, null);
            hj0Var.d = (byte) 15;
            if (!TextUtils.isEmpty(str)) {
                hj0Var.b = str;
            }
            hj0 a = hj0Var.a();
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
                        k8cVar.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        g = g(z);
                    }
                }
            }
            if (g != null && Build.VERSION.SDK_INT < 30) {
                gj0Var = g;
            } else {
                gj0Var = null;
            }
            this.j = new ae2(k8cVar, gj0Var, (byte) 3);
            if (g != null && (i = Build.VERSION.SDK_INT) < 30) {
                i4d i4dVar = this.i;
                i4dVar.getClass();
                int a2 = wmd.a(a, g);
                if ((a2 & 255) != 255) {
                    if (i < 30 && wmd.b(a2)) {
                        w26.j("Crypto-based authentication is not supported for device credential prior to API 30.");
                        return;
                    } else {
                        i4dVar.I2(a, g);
                        return;
                    }
                }
                w26.j("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                return;
            }
            this.i.I2(a, null);
        } catch (Exception e2) {
            fa4.g(e2, true);
            k8cVar.a(Boolean.FALSE, null, null);
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

    public final void j(String str, final String str2, final ht htVar) {
        h(str, false, str2, new k8c() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                fj0 fj0Var = (fj0) obj2;
                gj0 gj0Var = (gj0) obj3;
                uo0 uo0Var = uo0.this;
                uo0Var.getClass();
                if (fj0Var != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            uo0Var.g = null;
                            uo0Var.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                gj0Var = uo0Var.g(false);
                            }
                            if (gj0Var != null) {
                                Cipher cipher = gj0Var.b;
                                uo0Var.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                uo0Var.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        uo0Var.i();
                    } catch (Exception e) {
                        fa4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                htVar.a(bool);
            }
        });
    }
}
