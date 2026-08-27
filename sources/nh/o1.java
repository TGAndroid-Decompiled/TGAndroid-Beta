package nh;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
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

public final class o1 {

    public final int f18852a;

    public final long f18853b;

    public final long f18854c;
    public final boolean d;

    public String f18855e;

    public o1(long j10, long j11, int i10, boolean z10) {
        this.f18852a = i10;
        this.f18853b = j11;
        this.f18854c = j10;
        this.d = z10;
    }

    public static File b() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if ((filesDir.exists() || filesDir.mkdirs()) && filesDir.canWrite()) {
                    return file;
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey g() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
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
        HashMap map = new HashMap();
        try {
            File file = new File(b(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    n1 n1Var = new n1();
                    n1Var.f18832a = next;
                    n1Var.f18833b = jSONObject2.getLong("user_id");
                    n1Var.f18834c = jSONObject2.getString("user_name");
                    n1Var.d = jSONObject2.getLong("created_at");
                    n1Var.f18835e = jSONObject2.getLong("edited_at");
                    map.put(next, n1Var);
                }
                return map;
            } catch (OutOfMemoryError e9) {
                FileLog.e(e9);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return map;
        }
    }

    public static void k(HashMap map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((n1) entry.getValue()).f18833b);
                jSONObject2.put("user_name", ((n1) entry.getValue()).f18834c);
                jSONObject2.put("created_at", ((n1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((n1) entry.getValue()).f18835e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final byte[] a(File file) throws IOException {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z10 = this.d;
        if (z10) {
            int i10 = fileInputStream.read();
            bArr = new byte[i10];
            length = (length - 1) - i10;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!z10) {
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                return cipher.doFinal(bArr2);
            } catch (Exception e9) {
                FileLog.e(e9);
                l(file, "{}".getBytes());
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (OutOfMemoryError e10) {
            FileLog.e(e10);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File c() {
        long j10;
        if (this.d && TextUtils.isEmpty(this.f18855e)) {
            HashMap mapI = i();
            Iterator it = mapI.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                j10 = this.f18854c;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((n1) entry.getValue()).f18833b == j10) {
                    this.f18855e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.f18855e)) {
                String string = UUID.randomUUID().toString();
                this.f18855e = string;
                n1 n1Var = new n1();
                n1Var.f18832a = string;
                n1Var.f18833b = j10;
                n1Var.f18834c = DialogObject.getName(UserConfig.getInstance(this.f18852a).getCurrentUser());
                long jCurrentTimeMillis = System.currentTimeMillis();
                n1Var.f18835e = jCurrentTimeMillis;
                n1Var.d = jCurrentTimeMillis;
                mapI.put(this.f18855e, n1Var);
                k(mapI);
            }
        }
        return d(this.f18855e);
    }

    public final File d(String str) {
        File fileB = b();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f18854c;
        boolean z10 = this.d;
        Object objValueOf = str;
        if (!z10) {
            objValueOf = Long.valueOf(j10);
        }
        sb2.append(objValueOf);
        sb2.append("_");
        long j11 = this.f18853b;
        sb2.append(j11);
        sb2.append(z10 ? "_s" : "");
        File file = new File(fileB, sb2.toString());
        File fileB2 = b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j11);
        sb3.append(z10 ? "_s" : "");
        File file2 = new File(fileB2, sb3.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z10) {
            File file3 = new File(b(), j10 + "_" + j11 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject e(File file) {
        if (!file.exists() || file.length() > 5242880) {
            return new JSONObject();
        }
        try {
            return new JSONObject(new String(a(file)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return new JSONObject();
        }
    }

    public final Pair f(String str) {
        boolean z10 = this.d;
        if (z10 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject jSONObjectE = e(c());
        String strOptString = jSONObjectE.optString(str);
        boolean z11 = false;
        if (z10 && strOptString == null && !jSONObjectE.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new l1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (it.hasNext()) {
                try {
                    File fileD = d(((n1) it.next()).f18832a);
                    if (fileD.exists() && e(fileD).has(str)) {
                        z11 = true;
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        return new Pair(strOptString, Boolean.valueOf(z11));
    }

    public final ArrayList h(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (e(c()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < 4; i10++) {
            UserConfig userConfig = UserConfig.getInstance(i10);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        for (n1 n1Var : (Set) Collection.EL.stream(i().values()).filter(new l1(hashSet, 1)).collect(Collectors.toSet())) {
            try {
                File fileD = d(n1Var.f18832a);
                if (fileD.exists() && e(fileD).has(str)) {
                    arrayList.add(n1Var);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return arrayList;
    }

    public final void j(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (e(c()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < 4; i10++) {
            UserConfig userConfig = UserConfig.getInstance(i10);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        HashMap mapI = i();
        n1 n1Var = (n1) mapI.get(str);
        if (n1Var == null) {
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        n1Var.f18833b = this.f18854c;
        n1Var.f18834c = DialogObject.getName(UserConfig.getInstance(this.f18852a).getCurrentUser());
        n1Var.f18835e = System.currentTimeMillis();
        k(mapI);
        this.f18855e = n1Var.f18832a;
    }

    public final void l(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.d) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, g());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e9) {
                FileLog.e(e9);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void m(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length > 5242880) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            try {
                l(c(), bytes);
            } catch (Exception e9) {
                FileLog.e(e9);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
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
        if (str2.length() + str.length() > 5242880) {
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
        JSONObject jSONObjectE = e(c());
        try {
            jSONObjectE.put(str, str2);
            if (jSONObjectE.length() > 10 && z10) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            m(jSONObjectE);
            if (z10) {
                try {
                    HashMap mapI = i();
                    n1 n1Var = (n1) mapI.get(this.f18855e);
                    if (n1Var != null) {
                        n1Var.f18835e = System.currentTimeMillis();
                        k(mapI);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            throw new RuntimeException("UNKNOWN_ERROR");
        }
    }
}
