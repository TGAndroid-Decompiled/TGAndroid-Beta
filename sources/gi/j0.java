package gi;

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
public final class j0 {
    public static final HashMap f11294g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f11295a;
    public final int f11296b;
    public final long f11297c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public i0 f11298f;

    public j0(Context context, int i10, long j10) {
        this.f11295a = context;
        this.f11296b = i10;
        this.f11297c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    i0 i0Var = new i0(this, new JSONObject(str));
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(i0Var);
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
        f11294g.clear();
    }

    public static j0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f11294g;
        j0 j0Var = (j0) hashMap.get(pair);
        if (j0Var == null) {
            j0 j0Var2 = new j0(context, i10, j10);
            hashMap.put(pair, j0Var2);
            return j0Var2;
        }
        return j0Var;
    }

    public final void b(String str, String str2) {
        i0 d = d(str);
        if (d != null) {
            this.f11298f = d;
            d.f11279k = true;
            e();
            return;
        }
        i0 i0Var = new i0(this, str, str2);
        this.f11298f = i0Var;
        i0Var.f11280l = false;
        this.e.add(i0Var);
        f();
        e();
    }

    public final i0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (TextUtils.equals(i0Var.f11273b, str) && i0Var.h) {
                return i0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f11296b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f11295a.getSharedPreferences("botdownloads_" + this.f11296b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            i0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", i0Var.f11273b);
                jSONObject.put("file_name", i0Var.f11274c);
                jSONObject.put("size", i0Var.f11276g);
                File file = i0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", i0Var.h);
                jSONObject.put("mime", i0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f11297c, hashSet);
        edit.apply();
    }
}
