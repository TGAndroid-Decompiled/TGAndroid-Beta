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
public final class m0 {
    public static final HashMap f9191g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f9192a;
    public final int f9193b;
    public final long f9194c;
    public final DownloadManager d;
    public final ArrayList f9195e = new ArrayList();
    public l0 f9196f;

    public m0(Context context, int i10, long j3) {
        this.f9192a = context;
        this.f9193b = i10;
        this.f9194c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    l0 l0Var = new l0(this, new JSONObject(str));
                    File file = l0Var.d;
                    if (file != null && file.exists()) {
                        this.f9195e.add(l0Var);
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
        f9191g.clear();
    }

    public static m0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f9191g;
        m0 m0Var = (m0) hashMap.get(pair);
        if (m0Var == null) {
            m0 m0Var2 = new m0(context, i10, j3);
            hashMap.put(pair, m0Var2);
            return m0Var2;
        }
        return m0Var;
    }

    public final void b(String str, String str2) {
        l0 d = d(str);
        if (d != null) {
            this.f9196f = d;
            d.f9144k = true;
            e();
            return;
        }
        l0 l0Var = new l0(this, str, str2);
        this.f9196f = l0Var;
        l0Var.f9145l = false;
        this.f9195e.add(l0Var);
        f();
        e();
    }

    public final l0 d(String str) {
        ArrayList arrayList = this.f9195e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            if (TextUtils.equals(l0Var.f9137b, str) && l0Var.h) {
                return l0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f9193b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f9192a.getSharedPreferences("botdownloads_" + this.f9193b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f9195e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            l0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", l0Var.f9137b);
                jSONObject.put("file_name", l0Var.f9138c);
                jSONObject.put("size", l0Var.f9141g);
                File file = l0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", l0Var.h);
                jSONObject.put("mime", l0Var.f9139e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f9194c, hashSet);
        edit.apply();
    }
}
