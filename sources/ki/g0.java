package ki;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
public final class g0 {
    public static final HashMap f18684g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f18685a;
    public final int f18686b;
    public final long f18687c;
    public final DownloadManager d;
    public final ArrayList f18688e = new ArrayList();
    public f0 f18689f;

    public g0(Context context, int i7, long j3) {
        this.f18685a = context;
        this.f18686b = i7;
        this.f18687c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i7, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    f0 f0Var = new f0(this, new JSONObject(str));
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        this.f18688e.add(f0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.f26895b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botdownloads_" + i7, 0).edit().clear().apply();
        }
        f18684g.clear();
    }

    public static g0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f18684g;
        g0 g0Var = (g0) hashMap.get(pair);
        if (g0Var == null) {
            g0 g0Var2 = new g0(context, i7, j3);
            hashMap.put(pair, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    public final void b(String str, String str2) {
        f0 d = d(str);
        if (d != null) {
            this.f18689f = d;
            d.f18666k = true;
            e();
            return;
        }
        f0 f0Var = new f0(this, str, str2);
        this.f18689f = f0Var;
        f0Var.f18667l = false;
        this.f18688e.add(f0Var);
        f();
        e();
    }

    public final f0 d(String str) {
        ArrayList arrayList = this.f18688e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var = (f0) obj;
            if (TextUtils.equals(f0Var.f18659b, str) && f0Var.h) {
                return f0Var;
            }
        }
        return null;
    }

    public final void e() {
        ls.f(this.f18686b).k(ls.M3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i7 = 0;
        SharedPreferences.Editor edit = this.f18685a.getSharedPreferences("botdownloads_" + this.f18686b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f18688e;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", f0Var.f18659b);
                jSONObject.put("file_name", f0Var.f18660c);
                jSONObject.put("size", f0Var.f18663g);
                File file = f0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", f0Var.h);
                jSONObject.put("mime", f0Var.f18661e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f18687c, hashSet);
        edit.apply();
    }
}
