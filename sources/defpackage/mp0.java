package defpackage;

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
import org.telegram.messenger.a;
public final class mp0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public lp0 f;

    public mp0(Context context, int i, long j) {
        this.a = context;
        this.b = i;
        this.c = j;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i, 0).getStringSet(String.valueOf(j), null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    lp0 lp0Var = new lp0(this, new JSONObject(str));
                    File file = lp0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(lp0Var);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public static void a() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botdownloads_" + i, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static mp0 c(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap hashMap = g;
        mp0 mp0Var = (mp0) hashMap.get(pair);
        if (mp0Var == null) {
            mp0 mp0Var2 = new mp0(context, i, j);
            hashMap.put(pair, mp0Var2);
            return mp0Var2;
        }
        return mp0Var;
    }

    public final void b(String str, String str2) {
        lp0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
            return;
        }
        lp0 lp0Var = new lp0(this, str, str2);
        this.f = lp0Var;
        lp0Var.l = false;
        this.e.add(lp0Var);
        f();
        e();
    }

    public final lp0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lp0 lp0Var = (lp0) obj;
            if (TextUtils.equals(lp0Var.b, str) && lp0Var.h) {
                return lp0Var;
            }
        }
        return null;
    }

    public final void e() {
        kk7.f(this.b).k(kk7.L3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lp0 lp0Var = (lp0) obj;
            lp0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", lp0Var.b);
                jSONObject.put("file_name", lp0Var.c);
                jSONObject.put("size", lp0Var.g);
                File file = lp0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", lp0Var.h);
                jSONObject.put("mime", lp0Var.e);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet(String.valueOf(this.c), hashSet);
        edit.apply();
    }
}
