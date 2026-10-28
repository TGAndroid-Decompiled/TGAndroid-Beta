package hi;

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
public final class q0 {
    public static final HashMap f13223g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f13224a;
    public final int f13225b;
    public final long f13226c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public p0 f13227f;

    public q0(Context context, int i10, long j10) {
        this.f13224a = context;
        this.f13225b = i10;
        this.f13226c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    p0 p0Var = new p0(this, new JSONObject(str));
                    File file = p0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(p0Var);
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
        f13223g.clear();
    }

    public static q0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f13223g;
        q0 q0Var = (q0) hashMap.get(pair);
        if (q0Var == null) {
            q0 q0Var2 = new q0(context, i10, j10);
            hashMap.put(pair, q0Var2);
            return q0Var2;
        }
        return q0Var;
    }

    public final void b(String str, String str2) {
        p0 d = d(str);
        if (d != null) {
            this.f13227f = d;
            d.f13195k = true;
            e();
            return;
        }
        p0 p0Var = new p0(this, str, str2);
        this.f13227f = p0Var;
        p0Var.f13196l = false;
        this.e.add(p0Var);
        f();
        e();
    }

    public final p0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            if (TextUtils.equals(p0Var.f13189b, str) && p0Var.h) {
                return p0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f13225b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f13224a.getSharedPreferences("botdownloads_" + this.f13225b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            p0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", p0Var.f13189b);
                jSONObject.put("file_name", p0Var.f13190c);
                jSONObject.put("size", p0Var.f13192g);
                File file = p0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", p0Var.h);
                jSONObject.put("mime", p0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f13226c, hashSet);
        edit.apply();
    }
}
