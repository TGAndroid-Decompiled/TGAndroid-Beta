package fi;

import android.os.Build;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
public final class t1 {
    public final int f9967a;
    public final long f9968b;
    public final long f9969c;
    public final boolean d;
    public String f9970e;

    public t1(long j3, long j10, int i10, boolean z10) {
        this.f9967a = i10;
        this.f9968b = j10;
        this.f9969c = j3;
        this.d = z10;
    }

    public static File b() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
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
        if (Build.VERSION.SDK_INT >= 23) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias("MiniAppsKey")) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
                keyGenerator.generateKey();
            }
            return (SecretKey) keyStore.getKey("MiniAppsKey", null);
        }
        throw new RuntimeException("UNSUPPORTED");
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
                    obj.f9949a = next;
                    obj.f9950b = jSONObject2.getLong("user_id");
                    obj.f9951c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.f9952e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, obj);
                }
                return hashMap;
            } catch (OutOfMemoryError e7) {
                FileLog.e(e7);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((s1) entry.getValue()).f9950b);
                jSONObject2.put("user_name", ((s1) entry.getValue()).f9951c);
                jSONObject2.put("created_at", ((s1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((s1) entry.getValue()).f9952e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    l(file, "{}".getBytes());
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            return bArr2;
        } catch (OutOfMemoryError e10) {
            FileLog.e(e10);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File c() {
        long j3;
        if (this.d && TextUtils.isEmpty(this.f9970e)) {
            HashMap i10 = i();
            Iterator it = i10.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j3 = this.f9969c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((s1) entry.getValue()).f9950b == j3) {
                    this.f9970e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.f9970e)) {
                String uuid = UUID.randomUUID().toString();
                this.f9970e = uuid;
                ?? obj = new Object();
                obj.f9949a = uuid;
                obj.f9950b = j3;
                obj.f9951c = DialogObject.getName(UserConfig.getInstance(this.f9967a).getCurrentUser());
                long currentTimeMillis = System.currentTimeMillis();
                obj.f9952e = currentTimeMillis;
                obj.d = currentTimeMillis;
                i10.put(this.f9970e, obj);
                k(i10);
            }
        }
        return d(this.f9970e);
    }

    public final File d(String str) {
        String str2;
        File b10 = b();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f9969c;
        boolean z10 = this.d;
        Object obj = str;
        if (!z10) {
            obj = Long.valueOf(j3);
        }
        sb2.append(obj);
        sb2.append("_");
        long j10 = this.f9968b;
        sb2.append(j10);
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
        sb3.append(j10);
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
            } catch (Exception e7) {
                FileLog.e(e7);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final Pair f(String str) {
        boolean z10 = this.d;
        if (z10 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject e7 = e(c());
        String optString = e7.optString(str);
        boolean z11 = false;
        if (z10 && optString == null && !e7.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new q1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((s1) it.next()).f9949a);
                    if (d.exists() && e(d).has(str)) {
                        z11 = true;
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z11));
    }

    public final ArrayList h(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            for (s1 s1Var : (Set) Collection.EL.stream(i().values()).filter(new q1(hashSet, 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(s1Var.f9949a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(s1Var);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            return arrayList;
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void j(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (!e(c()).keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            HashMap i11 = i();
            s1 s1Var = (s1) i11.get(str);
            if (s1Var != null) {
                s1Var.f9950b = this.f9969c;
                s1Var.f9951c = DialogObject.getName(UserConfig.getInstance(this.f9967a).getCurrentUser());
                s1Var.f9952e = System.currentTimeMillis();
                k(i11);
                this.f9970e = s1Var.f9949a;
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
            } catch (Exception e7) {
                FileLog.e(e7);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            throw new RuntimeException("QUOTA_EXCEEDED");
        } catch (Exception e10) {
            FileLog.e(e10);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e11) {
            FileLog.e(e11);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        boolean z10 = this.d;
        if (z10 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str2.length() + str.length() <= 5242880) {
            JSONObject e7 = e(c());
            try {
                e7.put(str, str2);
                if (e7.length() > 10 && z10) {
                    throw new RuntimeException("QUOTA_EXCEEDED");
                }
                m(e7);
                if (z10) {
                    try {
                        HashMap i10 = i();
                        s1 s1Var = (s1) i10.get(this.f9970e);
                        if (s1Var != null) {
                            s1Var.f9952e = System.currentTimeMillis();
                            k(i10);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        throw new RuntimeException("QUOTA_EXCEEDED");
    }
}
