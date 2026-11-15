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
import org.telegram.messenger.ns;
public final class i0 {
    public static final HashMap f18354g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f18355a;
    public final int f18356b;
    public final long f18357c;
    public final DownloadManager d;
    public final ArrayList f18358e = new ArrayList();
    public h0 f18359f;

    public i0(Context context, int i7, long j3) {
        this.f18355a = context;
        this.f18356b = i7;
        this.f18357c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i7, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    h0 h0Var = new h0(this, new JSONObject(str));
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        this.f18358e.add(h0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.f26609b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botdownloads_" + i7, 0).edit().clear().apply();
        }
        f18354g.clear();
    }

    public static i0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f18354g;
        i0 i0Var = (i0) hashMap.get(pair);
        if (i0Var == null) {
            i0 i0Var2 = new i0(context, i7, j3);
            hashMap.put(pair, i0Var2);
            return i0Var2;
        }
        return i0Var;
    }

    public final void b(String str, String str2) {
        h0 d = d(str);
        if (d != null) {
            this.f18359f = d;
            d.f18334k = true;
            e();
            return;
        }
        h0 h0Var = new h0(this, str, str2);
        this.f18359f = h0Var;
        h0Var.f18335l = false;
        this.f18358e.add(h0Var);
        f();
        e();
    }

    public final h0 d(String str) {
        ArrayList arrayList = this.f18358e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h0 h0Var = (h0) obj;
            if (TextUtils.equals(h0Var.f18327b, str) && h0Var.h) {
                return h0Var;
            }
        }
        return null;
    }

    public final void e() {
        ns.f(this.f18356b).k(ns.J3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i7 = 0;
        SharedPreferences.Editor edit = this.f18355a.getSharedPreferences("botdownloads_" + this.f18356b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f18358e;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", h0Var.f18327b);
                jSONObject.put("file_name", h0Var.f18328c);
                jSONObject.put("size", h0Var.f18331g);
                File file = h0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", h0Var.h);
                jSONObject.put("mime", h0Var.f18329e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f18357c, hashSet);
        edit.apply();
    }
}
