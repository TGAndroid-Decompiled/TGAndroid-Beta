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
import org.telegram.messenger.ks;
public final class h0 {
    public static final HashMap f18705g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f18706a;
    public final int f18707b;
    public final long f18708c;
    public final DownloadManager d;
    public final ArrayList f18709e = new ArrayList();
    public g0 f18710f;

    public h0(Context context, int i7, long j3) {
        this.f18706a = context;
        this.f18707b = i7;
        this.f18708c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i7, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    g0 g0Var = new g0(this, new JSONObject(str));
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        this.f18709e.add(g0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.f26913b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botdownloads_" + i7, 0).edit().clear().apply();
        }
        f18705g.clear();
    }

    public static h0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f18705g;
        h0 h0Var = (h0) hashMap.get(pair);
        if (h0Var == null) {
            h0 h0Var2 = new h0(context, i7, j3);
            hashMap.put(pair, h0Var2);
            return h0Var2;
        }
        return h0Var;
    }

    public final void b(String str, String str2) {
        g0 d = d(str);
        if (d != null) {
            this.f18710f = d;
            d.f18687k = true;
            e();
            return;
        }
        g0 g0Var = new g0(this, str, str2);
        this.f18710f = g0Var;
        g0Var.f18688l = false;
        this.f18709e.add(g0Var);
        f();
        e();
    }

    public final g0 d(String str) {
        ArrayList arrayList = this.f18709e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g0 g0Var = (g0) obj;
            if (TextUtils.equals(g0Var.f18680b, str) && g0Var.h) {
                return g0Var;
            }
        }
        return null;
    }

    public final void e() {
        ks.f(this.f18707b).k(ks.M3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i7 = 0;
        SharedPreferences.Editor edit = this.f18706a.getSharedPreferences("botdownloads_" + this.f18707b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f18709e;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g0 g0Var = (g0) obj;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", g0Var.f18680b);
                jSONObject.put("file_name", g0Var.f18681c);
                jSONObject.put("size", g0Var.f18684g);
                File file = g0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", g0Var.h);
                jSONObject.put("mime", g0Var.f18682e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f18708c, hashSet);
        edit.apply();
    }
}
