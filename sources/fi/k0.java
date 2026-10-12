package fi;

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
public final class k0 {
    public static final HashMap f9345g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f9346a;
    public final int f9347b;
    public final long f9348c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public j0 f9349f;

    public k0(Context context, int i10, long j10) {
        this.f9346a = context;
        this.f9347b = i10;
        this.f9348c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    j0 j0Var = new j0(this, new JSONObject(str));
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(j0Var);
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
        f9345g.clear();
    }

    public static k0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f9345g;
        k0 k0Var = (k0) hashMap.get(pair);
        if (k0Var == null) {
            k0 k0Var2 = new k0(context, i10, j10);
            hashMap.put(pair, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public final void b(String str, String str2) {
        j0 d = d(str);
        if (d != null) {
            this.f9349f = d;
            d.f9331k = true;
            e();
            return;
        }
        j0 j0Var = new j0(this, str, str2);
        this.f9349f = j0Var;
        j0Var.f9332l = false;
        this.e.add(j0Var);
        f();
        e();
    }

    public final j0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            if (TextUtils.equals(j0Var.f9325b, str) && j0Var.h) {
                return j0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f9347b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f9346a.getSharedPreferences("botdownloads_" + this.f9347b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            j0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", j0Var.f9325b);
                jSONObject.put("file_name", j0Var.f9326c);
                jSONObject.put("size", j0Var.f9328g);
                File file = j0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", j0Var.h);
                jSONObject.put("mime", j0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f9348c, hashSet);
        edit.apply();
    }
}
