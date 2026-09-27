package ei;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class l0 {
    public static final HashMap f8451g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f8452a;
    public final int f8453b;
    public final long f8454c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public k0 f8455f;

    public l0(Context context, int i10, long j3) {
        this.f8452a = context;
        this.f8453b = i10;
        this.f8454c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    k0 k0Var = new k0(this, new JSONObject(str));
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(k0Var);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        f8451g.clear();
    }

    public static l0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f8451g;
        l0 l0Var = (l0) hashMap.get(pair);
        if (l0Var == null) {
            l0 l0Var2 = new l0(context, i10, j3);
            hashMap.put(pair, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public final void b(String str, String str2) {
        k0 d = d(str);
        if (d != null) {
            this.f8455f = d;
            d.f8405k = true;
            e();
            return;
        }
        k0 k0Var = new k0(this, str, str2);
        this.f8455f = k0Var;
        k0Var.f8406l = false;
        this.e.add(k0Var);
        f();
        e();
    }

    public final k0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (TextUtils.equals(k0Var.f8399b, str) && k0Var.h) {
                return k0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f8453b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f8452a.getSharedPreferences("botdownloads_" + this.f8453b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            k0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", k0Var.f8399b);
                jSONObject.put("file_name", k0Var.f8400c);
                jSONObject.put("size", k0Var.f8402g);
                File file = k0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", k0Var.h);
                jSONObject.put("mime", k0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f8454c, hashSet);
        edit.apply();
    }
}
