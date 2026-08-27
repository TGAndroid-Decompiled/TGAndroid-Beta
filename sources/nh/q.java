package nh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;
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
import org.telegram.ui.ib0;

public final class q {

    public static final WeakHashMap f18885k = new WeakHashMap();

    public static KeyStore f18886l;

    public final Context f18887a;

    public final int f18888b;

    public final long f18889c;
    public boolean d;

    public boolean f18890e;

    public boolean f18891f;

    public String f18892g;
    public String h;

    public a9.i f18893i;

    public cg.u0 f18894j;

    public q(Context context, int i10, long j10) {
        this.f18887a = context;
        this.f18888b = i10;
        this.f18889c = j10;
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
        f18885k.clear();
    }

    public static q c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f18885k;
        q qVar = (q) weakHashMap.get(pair);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(context, i10, j10);
        weakHashMap.put(pair, qVar2);
        return qVar2;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l10 = (Long) obj;
            q qVarC = c(activity, i10, l10.longValue());
            if (qVarC.f18890e && qVarC.f18891f) {
                map.put(l10, Boolean.valueOf(!qVarC.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new ag.k0(i10, arrayList, map, callback));
        }
    }

    public final boolean a() {
        return this.f18891f;
    }

    public final SecretKey e() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (f18886l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f18886l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f18886l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f18889c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            return (SecretKey) f18886l.getKey("9bot_" + j10, null);
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

    public final JSONObject f() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context context = this.f18887a;
        try {
            str = new a5.n(new androidx.biometric.s(context, 0)).g(15) != 0 ? null : "unknown";
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (str != null) {
            jSONObject.put("available", true);
            jSONObject.put("type", str);
        } else {
            jSONObject.put("available", false);
        }
        jSONObject.put("access_requested", this.f18891f);
        jSONObject.put("access_granted", this.f18890e && !this.d);
        jSONObject.put("token_saved", !TextUtils.isEmpty(this.f18892g));
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.f18888b, 0);
        StringBuilder sb2 = new StringBuilder("device_id");
        long j10 = this.f18889c;
        sb2.append(j10);
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string == null) {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String strL = a9.p.l(j10, "device_id");
            string = Utilities.bytesToHex(bArr);
            editorEdit.putString(strL, string).apply();
        }
        jSONObject.put("device_id", string);
        return jSONObject;
    }

    public final boolean g() {
        return this.f18890e;
    }

    public final void h() {
        SharedPreferences sharedPreferences = this.f18887a.getSharedPreferences("2botbiometry_" + this.f18888b, 0);
        long j10 = this.f18889c;
        this.f18892g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z10 = true;
        boolean z11 = this.f18892g != null;
        this.f18890e = z11;
        if (!z11) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f18891f = z10;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey secretKeyE = e();
            if (z10) {
                cipher.init(2, secretKeyE, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, secretKeyE);
            }
            return new androidx.biometric.u(cipher);
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        int i10;
        int i11;
        this.f18894j = null;
        try {
            if (this.f18893i == null) {
                this.f18893i = new a9.i(LaunchActivity.C1, f0.e.e(this.f18887a), new o(this));
            }
            androidx.biometric.u uVarI = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f18888b).getUser(Long.valueOf(this.f18889c));
            d5.x xVar = new d5.x();
            xVar.f4850b = UserObject.getUserName(user);
            xVar.d = LocaleController.getString(R.string.Back);
            xVar.f4849a = 15;
            if (!TextUtils.isEmpty(str)) {
                xVar.f4851c = str;
            }
            u5.k kVarE = xVar.e();
            if (uVarI != null) {
                Cipher cipher = uVarI.f1067b;
                if (!z10 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f18892g = null;
                        } else if (i11 < 23) {
                            this.f18892g = str2;
                        } else {
                            this.f18892g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        uVarI = i(z10);
                    }
                }
            }
            this.f18894j = new cg.u0(9, callback3, (uVarI == null || Build.VERSION.SDK_INT >= 30) ? null : uVarI);
            if (uVarI == null || (i10 = Build.VERSION.SDK_INT) >= 30) {
                this.f18893i.L(kVarE, null);
                return;
            }
            a9.i iVar = this.f18893i;
            iVar.getClass();
            int i12 = kVarE.f48421a;
            int i13 = i12 != 0 ? i12 : 15;
            if ((i13 & 255) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i10 < 30 && com.google.android.gms.internal.play_billing.r1.a(i13)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            iVar.L(kVarE, uVarI);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor editorEdit = this.f18887a.getSharedPreferences("2botbiometry_" + this.f18888b, 0).edit();
        boolean z10 = this.f18891f;
        long j10 = this.f18889c;
        if (z10) {
            editorEdit.putBoolean(j10 + "_requested", true);
        } else {
            editorEdit.remove(j10 + "_requested");
        }
        if (this.f18890e) {
            String strValueOf = String.valueOf(j10);
            String str = this.f18892g;
            if (str == null) {
                str = "";
            }
            editorEdit.putString(strValueOf, str);
            String str2 = String.valueOf(j10) + "_iv";
            String str3 = this.h;
            editorEdit.putString(str2, str3 != null ? str3 : "");
        } else {
            editorEdit.remove(String.valueOf(j10));
            editorEdit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            editorEdit.putBoolean(j10 + "_disabled", true);
        } else {
            editorEdit.remove(j10 + "_disabled");
        }
        editorEdit.apply();
    }

    public final void l(String str, final String str2, final ib0 ib0Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVarI = (androidx.biometric.u) obj3;
                q qVar = this.f18819a;
                qVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            qVar.f18892g = null;
                            qVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                qVar.f18892g = str3;
                                qVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    uVarI = qVar.i(false);
                                }
                                if (uVarI == null) {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                                Cipher cipher = uVarI.f1067b;
                                qVar.f18892g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                qVar.h = Utilities.bytesToHex(cipher.getIV());
                            }
                        }
                        qVar.k();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        bool = Boolean.FALSE;
                    }
                }
                ib0Var.run(bool);
            }
        });
    }
}
