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
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
public final class g0 {
    public static final HashMap f14666g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f14667a;
    public final int f14668b;
    public final long f14669c;
    public final DownloadManager d;
    public final ArrayList f14670e = new ArrayList();
    public f0 f14671f;

    public g0(Context context, int i7, long j3) {
        this.f14667a = context;
        this.f14668b = i7;
        this.f14669c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i7, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    f0 f0Var = new f0(this, new JSONObject(str));
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        this.f14670e.add(f0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.f25555b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botdownloads_" + i7, 0).edit().clear().apply();
        }
        f14666g.clear();
    }

    public static g0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f14666g;
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
            this.f14671f = d;
            d.f14646k = true;
            e();
            return;
        }
        f0 f0Var = new f0(this, str, str2);
        this.f14671f = f0Var;
        f0Var.f14647l = false;
        this.f14670e.add(f0Var);
        f();
        e();
    }

    public final f0 d(String str) {
        ArrayList arrayList = this.f14670e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var = (f0) obj;
            if (TextUtils.equals(f0Var.f14639b, str) && f0Var.h) {
                return f0Var;
            }
        }
        return null;
    }

    public final void e() {
        qs.f(this.f14668b).k(qs.J3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i7 = 0;
        SharedPreferences.Editor edit = this.f14667a.getSharedPreferences("botdownloads_" + this.f14668b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f14670e;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", f0Var.f14639b);
                jSONObject.put("file_name", f0Var.f14640c);
                jSONObject.put("size", f0Var.f14643g);
                File file = f0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", f0Var.h);
                jSONObject.put("mime", f0Var.f14641e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f14669c, hashSet);
        edit.apply();
    }
}
