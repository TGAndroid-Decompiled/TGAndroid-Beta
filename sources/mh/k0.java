package mh;

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
    public static final HashMap f17944g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f17945a;
    public final int f17946b;
    public final long f17947c;
    public final DownloadManager d;
    public final ArrayList f17948e = new ArrayList();
    public j0 f17949f;

    public k0(Context context, int i9, long j10) {
        this.f17945a = context;
        this.f17946b = i9;
        this.f17947c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i9, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    j0 j0Var = new j0(this, new JSONObject(str));
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        this.f17948e.add(j0Var);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            context.getSharedPreferences("botdownloads_" + i9, 0).edit().clear().apply();
        }
        f17944g.clear();
    }

    public static k0 c(Context context, int i9, long j10) {
        Pair pair = new Pair(Integer.valueOf(i9), Long.valueOf(j10));
        HashMap hashMap = f17944g;
        k0 k0Var = (k0) hashMap.get(pair);
        if (k0Var == null) {
            k0 k0Var2 = new k0(context, i9, j10);
            hashMap.put(pair, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public final void b(String str, String str2) {
        j0 d = d(str);
        if (d != null) {
            this.f17949f = d;
            d.f17922k = true;
            e();
            return;
        }
        j0 j0Var = new j0(this, str, str2);
        this.f17949f = j0Var;
        j0Var.f17923l = false;
        this.f17948e.add(j0Var);
        f();
        e();
    }

    public final j0 d(String str) {
        ArrayList arrayList = this.f17948e;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            j0 j0Var = (j0) obj;
            if (TextUtils.equals(j0Var.f17915b, str) && j0Var.h) {
                return j0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f17946b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i9 = 0;
        SharedPreferences.Editor edit = this.f17945a.getSharedPreferences("botdownloads_" + this.f17946b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f17948e;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            j0 j0Var = (j0) obj;
            j0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", j0Var.f17915b);
                jSONObject.put("file_name", j0Var.f17916c);
                jSONObject.put("size", j0Var.f17919g);
                File file = j0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", j0Var.h);
                jSONObject.put("mime", j0Var.f17917e);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f17947c, hashSet);
        edit.apply();
    }
}
