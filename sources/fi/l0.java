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
public final class l0 {
    public static final HashMap f9797g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f9798a;
    public final int f9799b;
    public final long f9800c;
    public final DownloadManager d;
    public final ArrayList f9801e = new ArrayList();
    public k0 f9802f;

    public l0(Context context, int i10, long j3) {
        this.f9798a = context;
        this.f9799b = i10;
        this.f9800c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    k0 k0Var = new k0(this, new JSONObject(str));
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        this.f9801e.add(k0Var);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
        f9797g.clear();
    }

    public static l0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f9797g;
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
            this.f9802f = d;
            d.f9753k = true;
            e();
            return;
        }
        k0 k0Var = new k0(this, str, str2);
        this.f9802f = k0Var;
        k0Var.f9754l = false;
        this.f9801e.add(k0Var);
        f();
        e();
    }

    public final k0 d(String str) {
        ArrayList arrayList = this.f9801e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (TextUtils.equals(k0Var.f9746b, str) && k0Var.h) {
                return k0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f9799b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f9798a.getSharedPreferences("botdownloads_" + this.f9799b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f9801e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            k0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", k0Var.f9746b);
                jSONObject.put("file_name", k0Var.f9747c);
                jSONObject.put("size", k0Var.f9750g);
                File file = k0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", k0Var.h);
                jSONObject.put("mime", k0Var.f9748e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f9800c, hashSet);
        edit.apply();
    }
}
