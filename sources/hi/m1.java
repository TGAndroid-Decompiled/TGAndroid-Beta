package hi;

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
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
public final class m1 {
    public final int f14793a;
    public final long f14794b;
    public final long f14795c;
    public final boolean d;
    public String f14796e;

    public m1(int i7, long j3, long j10, boolean z9) {
        this.f14793a = i7;
        this.f14794b = j10;
        this.f14795c = j3;
        this.d = z9;
    }

    public static File b() {
        try {
            File filesDir = org.telegram.messenger.t0.f25570b.getFilesDir();
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
                    obj.f14780a = next;
                    obj.f14781b = jSONObject2.getLong("user_id");
                    obj.f14782c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.f14783e = jSONObject2.getLong("edited_at");
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
                jSONObject2.put("user_id", ((l1) entry.getValue()).f14781b);
                jSONObject2.put("user_name", ((l1) entry.getValue()).f14782c);
                jSONObject2.put("created_at", ((l1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((l1) entry.getValue()).f14783e);
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
        boolean z9 = this.d;
        if (z9) {
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
            if (z9) {
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
        long j3;
        if (this.d && TextUtils.isEmpty(this.f14796e)) {
            HashMap i7 = i();
            Iterator it = i7.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j3 = this.f14795c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((l1) entry.getValue()).f14781b == j3) {
                    this.f14796e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.f14796e)) {
                String uuid = UUID.randomUUID().toString();
                this.f14796e = uuid;
                ?? obj = new Object();
                obj.f14780a = uuid;
                obj.f14781b = j3;
                obj.f14782c = m5.m(p10.i(this.f14793a).f());
                long currentTimeMillis = System.currentTimeMillis();
                obj.f14783e = currentTimeMillis;
                obj.d = currentTimeMillis;
                i7.put(this.f14796e, obj);
                k(i7);
            }
        }
        return d(this.f14796e);
    }

    public final File d(String str) {
        String str2;
        File b10 = b();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f14795c;
        boolean z9 = this.d;
        Object obj = str;
        if (!z9) {
            obj = Long.valueOf(j3);
        }
        sb2.append(obj);
        sb2.append("_");
        long j10 = this.f14794b;
        sb2.append(j10);
        String str3 = "";
        if (!z9) {
            str2 = "";
        } else {
            str2 = "_s";
        }
        sb2.append(str2);
        File file = new File(b10, sb2.toString());
        File b11 = b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j10);
        if (z9) {
            str3 = "_s";
        }
        sb3.append(str3);
        File file2 = new File(b11, sb3.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z9) {
            File b12 = b();
            File file3 = new File(b12, j3 + "_" + j10 + "_s");
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
        boolean z9 = false;
        if (this.d && optString == null && !e10.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i7 = 0; i7 < 4; i7++) {
                p10 i10 = p10.i(i7);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new j1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((l1) it.next()).f14780a);
                    if (d.exists() && e(d).has(str)) {
                        z9 = true;
                        break;
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z9));
    }

    public final ArrayList h(String str) {
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i7 = 0; i7 < 4; i7++) {
                p10 i10 = p10.i(i7);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            for (l1 l1Var : (Set) Collection.EL.stream(i().values()).filter(new j1(hashSet, 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(l1Var.f14780a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(l1Var);
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
            for (int i7 = 0; i7 < 4; i7++) {
                p10 i10 = p10.i(i7);
                if (i10.p()) {
                    hashSet.add(Long.valueOf(i10.e()));
                }
            }
            HashMap i11 = i();
            l1 l1Var = (l1) i11.get(str);
            if (l1Var != null) {
                l1Var.f14781b = this.f14795c;
                l1Var.f14782c = m5.m(p10.i(this.f14793a).f());
                l1Var.f14783e = System.currentTimeMillis();
                k(i11);
                this.f14796e = l1Var.f14780a;
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
                boolean z9 = this.d;
                if (length > 10 && z9) {
                    throw new RuntimeException("QUOTA_EXCEEDED");
                }
                m(e10);
                if (z9) {
                    try {
                        HashMap i7 = i();
                        l1 l1Var = (l1) i7.get(this.f14796e);
                        if (l1Var != null) {
                            l1Var.f14783e = System.currentTimeMillis();
                            k(i7);
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
