package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.system.Os;
import android.system.OsConstants;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
public final class k35 {
    public static final Object g = new Object();
    public static final HashMap h = new HashMap();
    public static final ExecutorService i = Executors.newSingleThreadExecutor(new y20((byte) 3));
    public static final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final Context a;
    public final int b;
    public final String c;
    public final File d;
    public final String e;
    public volatile Exception f;

    public k35(int i2, Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.a = context;
            this.b = i2;
            this.c = str;
            try {
                String p = p(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), p.concat(".json"));
                this.e = qd4.y("gramwallet_v2_", p, "_");
                return;
            } catch (Exception e) {
                vr9.l(e);
                throw null;
            }
        }
        lq5.j("context/address");
        throw null;
    }

    public static synchronized void A(a25 a25Var) {
        synchronized (k35.class) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable == null || runnable == a25Var) {
                    j.remove(weakReference);
                }
            }
        }
    }

    public static byte[] B(String str) {
        if (str != null && str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 << 1;
                int digit = Character.digit(str.charAt(i3), 16);
                int digit2 = Character.digit(str.charAt(i3 + 1), 16);
                if (digit >= 0 && digit2 >= 0) {
                    bArr[i2] = (byte) ((digit << 4) | digit2);
                } else {
                    su3.e("hex digit");
                    return null;
                }
            }
            return bArr;
        }
        su3.e("hex length");
        return null;
    }

    public static boolean i(Context context) {
        String str;
        if (context != null && (str = xea.r) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public static ArrayList o(Context context, long j2) {
        ArrayList arrayList;
        int i2;
        synchronized (g) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(x(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            k35 k35Var = new k35(0, context, string);
                            if (k35Var.d.equals(file)) {
                                j35 v = k35Var.v(jSONObject);
                                if (v.d == j2 && !((LinkedHashMap) v.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    if (name.endsWith(".xml.bak")) {
                        i2 = 8;
                    } else if (name.endsWith(".xml")) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    if (name.startsWith("gramwallet_") && i2 != 0) {
                        String substring = name.substring(11, name.length() - i2);
                        try {
                            k35 k35Var2 = new k35(0, context, substring);
                            if (!k35Var2.d.exists()) {
                                j35 s = k35Var2.s();
                                if (s.d == j2 && !((LinkedHashMap) s.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String p(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 << 1;
            byte b = bArr[i2];
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean u(java.lang.Exception r1) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k35.u(java.lang.Exception):boolean");
    }

    public static byte[] x(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    if (byteArrayOutputStream.size() + read <= 4194304) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        throw new IOException("wallet too large");
                    }
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean z(j35 j35Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) j35Var.e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public final void C() {
        synchronized (g) {
            HashMap hashMap = h;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            hl.c3(new qu2(file.getAbsolutePath(), (byte) 6));
            try {
                this.f = null;
                j35 j35Var = new j35();
                j35Var.b = i(this.a);
                w(j35Var, new LinkedHashMap());
                d(j35Var);
            } catch (Exception e) {
                m(e);
            }
        }
    }

    public final byte[] a(j35 j35Var, String str) {
        return ("GramWallet:2\n" + this.c + "\n" + j35Var.d + "\n" + str + "\n" + j35Var.b).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j2, boolean z) {
        String str;
        rj4 rj4Var;
        Object obj = g;
        synchronized (obj) {
            c(j2);
        }
        String absolutePath = this.d.getAbsolutePath();
        i02 i02Var = new i02(this, j2, (byte) 7);
        p35 p35Var = new p35();
        p35Var.d = absolutePath;
        hl.c3(new ds6(p35Var, i02Var, z, (byte) 23));
        try {
            if (!p35Var.a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                p35Var.b = true;
                rj4Var = new rj4(p35Var, (byte) 23);
            } else {
                str = p35Var.c;
                p35Var.b = true;
                rj4Var = new rj4(p35Var, (byte) 23);
            }
            hl.c3(rj4Var);
            synchronized (obj) {
                c(j2);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th) {
            p35Var.b = true;
            hl.c3(new rj4(p35Var, (byte) 23));
            throw th;
        }
    }

    public final void c(long j2) {
        if (j2 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(j35 j35Var) {
        String str = this.c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.e) && !z(j35Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!j35Var.c) {
                if (r().edit().clear().commit()) {
                    keyStore.deleteEntry("gramwallet_free_" + str);
                    keyStore.deleteEntry("gramwallet_lock_" + str);
                    return;
                }
                throw new IOException("legacy cleanup");
            }
        } catch (Exception e) {
            m(e);
        }
    }

    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            synchronized (g) {
                try {
                    j35 s = s();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        String str = (String) obj;
                        if (!z(s, str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (Exception e) {
                    m(e);
                }
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr != null && bArr.length != 0) {
            synchronized (g) {
                try {
                    containsKey = ((LinkedHashMap) s().e).containsKey(p(bArr));
                } catch (Exception e) {
                    this.m(e);
                    return false;
                }
            }
            return containsKey;
        }
        return false;
    }

    public final byte[] g(j35 j35Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) j35Var.e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = r().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (j35Var.b) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    Key key2 = keyStore.getKey(str2 + this.c, null);
                    if (key2 instanceof SecretKey) {
                        key = (SecretKey) key2;
                    } else {
                        su3.e("legacy key missing");
                        return null;
                    }
                }
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, key, new IvParameterSpec(B(jSONObject.getString("iv"))));
                return cipher.doFinal(B(jSONObject.getString("ciphertext")));
            }
            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher2.init(2, y(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher2.updateAAD(a(j35Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        su3.e("record missing");
        return null;
    }

    public final c35 h(j35 j35Var, String str, long j2) {
        byte[] g2;
        try {
            g2 = g(j35Var, str);
        } catch (Exception e) {
            if (j35Var.b && u(e)) {
                this.b(j2, false);
                try {
                    g2 = this.g(j35Var, str);
                } catch (Exception e2) {
                    if (u(e2)) {
                        this.b(j2, true);
                        g2 = this.g(j35Var, str);
                    } else {
                        throw e2;
                    }
                }
            } else {
                throw e;
            }
        }
        try {
            return new c35(g2);
        } finally {
            Arrays.fill(g2, (byte) 0);
        }
    }

    public final JSONObject j(j35 j35Var, String str, c35 c35Var, ArrayList arrayList, long j2) {
        Cipher k;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(j35Var.b);
        if (j35Var.b) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i2 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k = k(j35Var, str, put);
        } catch (Exception e) {
            if (j35Var.b && u(e)) {
                this.b(j2, false);
                try {
                    k = this.k(j35Var, str, put);
                } catch (Exception e2) {
                    if (u(e2)) {
                        this.b(j2, true);
                        k = this.k(j35Var, str, put);
                    } else {
                        throw e2;
                    }
                }
            } else {
                throw e;
            }
        }
        byte[] c = c35Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k.doFinal(c), 2));
            put.put("iv", Base64.encodeToString(k.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c, (byte) 0);
        }
    }

    public final Cipher k(j35 j35Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, y(jSONObject));
        cipher.updateAAD(a(j35Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (g) {
            Long l = (Long) h.get(this.d.getAbsolutePath());
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
        }
        return longValue;
    }

    public final void m(Exception exc) {
        this.f = exc;
        cc4.g(exc, true);
    }

    public final byte[][] n() {
        byte[][] bArr;
        synchronized (g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : ((LinkedHashMap) s().e).keySet()) {
                    arrayList.add(B(str));
                }
                bArr = (byte[][]) arrayList.toArray(new byte[0]);
            } catch (Exception e) {
                m(e);
                return new byte[0];
            }
        }
        return bArr;
    }

    public final void q(long j2, byte[] bArr, c35 c35Var, pcc pccVar) {
        c35 b;
        String p;
        if (c35Var == null) {
            b = null;
        } else {
            b = c35Var.b();
        }
        c35 c35Var2 = b;
        if (bArr == null) {
            p = "";
        } else {
            p = p(bArr);
        }
        i.execute(new h35(this, p, c35Var2, l(), j2, pccVar));
    }

    public final SharedPreferences r() {
        return this.a.getSharedPreferences("gramwallet_" + this.c, 0);
    }

    public final j35 s() {
        File file = this.d;
        if (file.exists()) {
            return v(new JSONObject(new String(x(file), StandardCharsets.UTF_8)));
        }
        j35 j35Var = new j35();
        SharedPreferences r = r();
        j35Var.b = r.getBoolean("locked", i(this.a));
        j35Var.d = r.getLong("userId", 0L);
        j35Var.a = r.getInt("lastUsageDate", 0);
        if (r.contains("phrase")) {
            String p = p(B(r.getString("pubkey", "")));
            if (!p.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", r.getString("phrase", null));
                jSONObject.put("iv", r.getString("iv", null));
                ((LinkedHashMap) j35Var.e).put(p, jSONObject);
                j35Var.c = true;
                return j35Var;
            }
            su3.e("legacy public key missing");
            return null;
        }
        return j35Var;
    }

    public final void t(j35 j35Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j2) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) j35Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                c35 h2 = h(j35Var, str2, j2);
                linkedHashMap.put(str2, h2);
                linkedHashMap2.put(str2, j(j35Var, str2, h2, arrayList, j2));
            }
        }
        j35Var.c = false;
    }

    public final j35 v(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.c.equals(jSONObject.getString("address"))) {
                j35 j35Var = new j35();
                j35Var.d = jSONObject.getLong("userId");
                j35Var.a = jSONObject.getInt("lastUsage");
                j35Var.b = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(p(B(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) j35Var.e).put(next, jSONObject3);
                        j35Var.c |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        su3.e("public key encoding");
                        return null;
                    }
                }
                return j35Var;
            }
        }
        su3.e("wallet format/address");
        return null;
    }

    public final void w(j35 j35Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            su3.e("wallet directory");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) j35Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.c).put("userId", j35Var.d).put("lastUsage", j35Var.a).put("locked", j35Var.b).put("records", jSONObject).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = jSONObject2.getBytes(charset);
        if (bytes.length <= 4194304) {
            File file2 = new File(parentFile, file.getName() + ".pending");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                byte[] x = x(file2);
                if (Arrays.equals(bytes, x)) {
                    j35 v = v(new JSONObject(new String(x, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c = ((c35) entry2.getValue()).c();
                        byte[] g2 = g(v, (String) entry2.getKey());
                        if (MessageDigest.isEqual(c, g2)) {
                            Arrays.fill(c, (byte) 0);
                            if (g2 != null) {
                                Arrays.fill(g2, (byte) 0);
                            }
                        } else {
                            throw new IOException("wallet decryption mismatch");
                        }
                    }
                    Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                    hl.c3(new jm3((byte) 11));
                    if (exists) {
                        if (!delete) {
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IOException("wallet read-back mismatch");
            } finally {
                if (file2.exists() && !file2.delete()) {
                    cc4.g(new IOException("wallet staging cleanup"), true);
                }
            }
        }
        su3.e("wallet too large");
    }

    public final SecretKey y(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (string.startsWith(this.e)) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(string, null);
            if (key != null) {
                if (jSONObject.has("wrappedKey")) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(2, key);
                    byte[] doFinal = cipher.doFinal(Base64.decode(jSONObject.getString("wrappedKey"), 2));
                    try {
                        if (doFinal.length == 32) {
                            return new SecretKeySpec(doFinal, "AES");
                        }
                        throw new IOException("wrapped key length");
                    } finally {
                        Arrays.fill(doFinal, (byte) 0);
                    }
                } else if (key instanceof SecretKey) {
                    return (SecretKey) key;
                } else {
                    su3.e("keystore key type");
                    return null;
                }
            }
            su3.e("keystore key missing");
            return null;
        }
        su3.e("key alias outside wallet");
        return null;
    }
}
