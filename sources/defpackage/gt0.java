package defpackage;

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
import org.telegram.messenger.a;
public final class gt0 {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;
    public String e;

    public gt0(int i, long j, long j2, boolean z) {
        this.a = i;
        this.b = j2;
        this.c = j;
        this.d = z;
    }

    public static File b() {
        try {
            File filesDir = a.b.getFilesDir();
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
                    obj.a = next;
                    obj.b = jSONObject2.getLong("user_id");
                    obj.c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, obj);
                }
                return hashMap;
            } catch (OutOfMemoryError e) {
                fa4.g(e, true);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((ft0) entry.getValue()).b);
                jSONObject2.put("user_name", ((ft0) entry.getValue()).c);
                jSONObject2.put("created_at", ((ft0) entry.getValue()).d);
                jSONObject2.put("edited_at", ((ft0) entry.getValue()).e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z = this.d;
        if (z) {
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
            if (z) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                    return cipher.doFinal(bArr2);
                } catch (Exception e) {
                    fa4.g(e, true);
                    this.l(file, "{}".getBytes());
                    wn4.j("UNKNOWN_ERROR");
                    return null;
                }
            }
            return bArr2;
        } catch (OutOfMemoryError e2) {
            fa4.g(e2, true);
            wn4.j("QUOTA_EXCEEDED");
            return null;
        }
    }

    public final File c() {
        long j;
        if (this.d && TextUtils.isEmpty(this.e)) {
            HashMap i = i();
            Iterator it = i.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j = this.c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((ft0) entry.getValue()).b == j) {
                    this.e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.e)) {
                String uuid = UUID.randomUUID().toString();
                this.e = uuid;
                ?? obj = new Object();
                obj.a = uuid;
                obj.b = j;
                obj.c = cf3.l(y6c.h(this.a).f());
                long currentTimeMillis = System.currentTimeMillis();
                obj.e = currentTimeMillis;
                obj.d = currentTimeMillis;
                i.put(this.e, obj);
                k(i);
            }
        }
        return d(this.e);
    }

    public final File d(String str) {
        String str2;
        File b = b();
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        boolean z = this.d;
        Object obj = str;
        if (!z) {
            obj = Long.valueOf(j);
        }
        sb.append(obj);
        sb.append("_");
        long j2 = this.b;
        sb.append(j2);
        String str3 = "";
        if (!z) {
            str2 = "";
        } else {
            str2 = "_s";
        }
        sb.append(str2);
        File file = new File(b, sb.toString());
        File b2 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j2);
        if (z) {
            str3 = "_s";
        }
        sb2.append(str3);
        File file2 = new File(b2, sb2.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z) {
            File b3 = b();
            File file3 = new File(b3, j + "_" + j2 + "_s");
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
            } catch (Exception e) {
                fa4.g(e, true);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final Pair f(String str) {
        JSONObject e = e(c());
        String optString = e.optString(str);
        boolean z = false;
        if (this.d && optString == null && !e.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                y6c h = y6c.h(i);
                if (h.o()) {
                    hashSet.add(Long.valueOf(h.e()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new dt0(hashSet, (byte) 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((ft0) it.next()).a);
                    if (d.exists() && e(d).has(str)) {
                        z = true;
                        break;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z));
    }

    public final ArrayList h(String str) {
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                y6c h = y6c.h(i);
                if (h.o()) {
                    hashSet.add(Long.valueOf(h.e()));
                }
            }
            for (ft0 ft0Var : (Set) Collection.EL.stream(i().values()).filter(new dt0(hashSet, (byte) 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(ft0Var.a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(ft0Var);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            return arrayList;
        }
        wn4.j("STORAGE_NOT_EMPTY");
        return null;
    }

    public final void j(String str) {
        if (!e(c()).keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                y6c h = y6c.h(i);
                if (h.o()) {
                    hashSet.add(Long.valueOf(h.e()));
                }
            }
            HashMap i2 = i();
            ft0 ft0Var = (ft0) i2.get(str);
            if (ft0Var != null) {
                ft0Var.b = this.c;
                ft0Var.c = cf3.l(y6c.h(this.a).f());
                ft0Var.e = System.currentTimeMillis();
                k(i2);
                this.e = ft0Var.a;
                return;
            }
            wn4.j("STORAGE_NOT_FOUND");
            return;
        }
        wn4.j("STORAGE_NOT_EMPTY");
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
            } catch (Exception e) {
                fa4.g(e, true);
                wn4.j("UNKNOWN_ERROR");
                return;
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
                } catch (Exception e) {
                    fa4.g(e, true);
                    wn4.j("UNKNOWN_ERROR");
                    return;
                }
            }
            wn4.j("QUOTA_EXCEEDED");
        } catch (Exception e2) {
            fa4.g(e2, true);
            wn4.j("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e3) {
            fa4.g(e3, true);
            wn4.j("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        if (str2.length() + str.length() <= 5242880) {
            JSONObject e = e(c());
            try {
                e.put(str, str2);
                int length = e.length();
                boolean z = this.d;
                if (length > 10 && z) {
                    wn4.j("QUOTA_EXCEEDED");
                    return;
                }
                m(e);
                if (z) {
                    try {
                        HashMap i = i();
                        ft0 ft0Var = (ft0) i.get(this.e);
                        if (ft0Var != null) {
                            ft0Var.e = System.currentTimeMillis();
                            k(i);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            } catch (Exception e2) {
                fa4.g(e2, true);
                wn4.j("UNKNOWN_ERROR");
                return;
            }
        }
        wn4.j("QUOTA_EXCEEDED");
    }
}
