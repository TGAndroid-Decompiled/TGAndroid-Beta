package ii;

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
import org.telegram.messenger.hs;
public final class i0 {
    public static final HashMap f14999g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f15000a;
    public final int f15001b;
    public final long f15002c;
    public final DownloadManager d;
    public final ArrayList f15003e = new ArrayList();
    public h0 f15004f;

    public i0(Context context, int i3, long j10) {
        this.f15000a = context;
        this.f15001b = i3;
        this.f15002c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i3, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    h0 h0Var = new h0(this, new JSONObject(str));
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        this.f15003e.add(h0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.f25457b;
        if (context == null) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("botdownloads_" + i3, 0).edit().clear().apply();
        }
        f14999g.clear();
    }

    public static i0 c(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        HashMap hashMap = f14999g;
        i0 i0Var = (i0) hashMap.get(pair);
        if (i0Var == null) {
            i0 i0Var2 = new i0(context, i3, j10);
            hashMap.put(pair, i0Var2);
            return i0Var2;
        }
        return i0Var;
    }

    public final void b(String str, String str2) {
        h0 d = d(str);
        if (d != null) {
            this.f15004f = d;
            d.f14982k = true;
            e();
            return;
        }
        h0 h0Var = new h0(this, str, str2);
        this.f15004f = h0Var;
        h0Var.f14983l = false;
        this.f15003e.add(h0Var);
        f();
        e();
    }

    public final h0 d(String str) {
        ArrayList arrayList = this.f15003e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h0 h0Var = (h0) obj;
            if (TextUtils.equals(h0Var.f14975b, str) && h0Var.h) {
                return h0Var;
            }
        }
        return null;
    }

    public final void e() {
        hs.f(this.f15001b).k(hs.J3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i3 = 0;
        SharedPreferences.Editor edit = this.f15000a.getSharedPreferences("botdownloads_" + this.f15001b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f15003e;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", h0Var.f14975b);
                jSONObject.put("file_name", h0Var.f14976c);
                jSONObject.put("size", h0Var.f14979g);
                File file = h0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", h0Var.h);
                jSONObject.put("mime", h0Var.f14977e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f15002c, hashSet);
        edit.apply();
    }
}
