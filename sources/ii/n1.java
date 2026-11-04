package ii;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.m5;
public final class n1 {
    public final int f15091a;
    public final long f15092b;
    public final long f15093c;
    public final boolean d;
    public String f15094e;

    public n1(int i3, long j10, long j11, boolean z10) {
        this.f15091a = i3;
        this.f15092b = j11;
        this.f15093c = j10;
        this.d = z10;
    }

    public static File b() {
        try {
            File filesDir = org.telegram.messenger.t0.f25457b.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static HashMap i() {
        HashMap hashMap = new HashMap();
        try {
            File file = new File(b(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    ?? obj = new Object();
                    obj.f15073a = next;
                    obj.f15074b = jSONObject2.getLong("user_id");
                    obj.f15075c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.f15076e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, obj);
                }
                return hashMap;
            } catch (OutOfMemoryError e10) {
                a8.g(e10, true);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((m1) entry.getValue()).f15074b);
                jSONObject2.put("user_name", ((m1) entry.getValue()).f15075c);
                jSONObject2.put("created_at", ((m1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((m1) entry.getValue()).f15076e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z10 = this.d;
        if (z10) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (z10) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                    return cipher.doFinal(bArr2);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    l(file, "{}".getBytes());
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            return bArr2;
        } catch (OutOfMemoryError e11) {
            a8.g(e11, true);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File c() {
        long j10;
        if (this.d && TextUtils.isEmpty(this.f15094e)) {
            HashMap i3 = i();
            Iterator it = i3.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j10 = this.f15093c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((m1) entry.getValue()).f15074b == j10) {
                    this.f15094e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.f15094e)) {
                String uuid = UUID.randomUUID().toString();
                this.f15094e = uuid;
                ?? obj = new Object();
                obj.f15073a = uuid;
                obj.f15074b = j10;
                obj.f15075c = m5.m(h10.i(this.f15091a).f());
                long currentTimeMillis = System.currentTimeMillis();
                obj.f15076e = currentTimeMillis;
                obj.d = currentTimeMillis;
                i3.put(this.f15094e, obj);
                k(i3);
            }
        }
        return d(this.f15094e);
    }

    public final File d(String str) {
        String str2;
        File b10 = b();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f15093c;
        boolean z10 = this.d;
        Object obj = str;
        if (!z10) {
            obj = Long.valueOf(j10);
        }
        sb2.append(obj);
        sb2.append("_");
        long j11 = this.f15092b;
        sb2.append(j11);
        String str3 = "";
        if (!z10) {
            str2 = "";
        } else {
            str2 = "_s";
        }
        sb2.append(str2);
        File file = new File(b10, sb2.toString());
        File b11 = b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j11);
        if (z10) {
            str3 = "_s";
        }
        sb3.append(str3);
        File file2 = new File(b11, sb3.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z10) {
            File b12 = b();
            File file3 = new File(b12, j10 + "_" + j11 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject e(File file) {
        if (file.exists() && file.length() <= 5242880) {
            try {
                return new JSONObject(new String(a(file)));
            } catch (Exception e10) {
                a8.g(e10, true);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final Pair f(String str) {
        JSONObject e10 = e(c());
        String optString = e10.optString(str);
        boolean z10 = false;
        if (this.d && optString == null && !e10.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < 4; i3++) {
                h10 i10 = h10.i(i3);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new k1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((m1) it.next()).f15073a);
                    if (d.exists() && e(d).has(str)) {
                        z10 = true;
                        break;
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z10));
    }

    public final ArrayList h(String str) {
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < 4; i3++) {
                h10 i10 = h10.i(i3);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            for (m1 m1Var : (Set) Collection.EL.stream(i().values()).filter(new k1(hashSet, 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(m1Var.f15073a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(m1Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            return arrayList;
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void j(String str) {
        if (!e(c()).keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < 4; i3++) {
                h10 i10 = h10.i(i3);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            HashMap i11 = i();
            m1 m1Var = (m1) i11.get(str);
            if (m1Var != null) {
                m1Var.f15074b = this.f15093c;
                m1Var.f15075c = m5.m(h10.i(this.f15091a).f());
                m1Var.f15076e = System.currentTimeMillis();
                k(i11);
                this.f15094e = m1Var.f15073a;
                return;
            }
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void l(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.d) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, g());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e10) {
                a8.g(e10, true);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void m(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length <= 5242880) {
                try {
                    l(c(), bytes);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            throw new RuntimeException("QUOTA_EXCEEDED");
        } catch (Exception e11) {
            a8.g(e11, true);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e12) {
            a8.g(e12, true);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        if (str2.length() + str.length() <= 5242880) {
            JSONObject e10 = e(c());
            try {
                e10.put(str, str2);
                int length = e10.length();
                boolean z10 = this.d;
                if (length > 10 && z10) {
                    throw new RuntimeException("QUOTA_EXCEEDED");
                }
                m(e10);
                if (z10) {
                    try {
                        HashMap i3 = i();
                        m1 m1Var = (m1) i3.get(this.f15094e);
                        if (m1Var != null) {
                            m1Var.f15076e = System.currentTimeMillis();
                            k(i3);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            } catch (Exception e11) {
                a8.g(e11, true);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        throw new RuntimeException("QUOTA_EXCEEDED");
    }
}
