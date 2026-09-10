package di;

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
public final class o0 {
    public static final HashMap f6820g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f6821a;
    public final int f6822b;
    public final long f6823c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public n0 f6824f;

    public o0(Context context, int i10, long j3) {
        this.f6821a = context;
        this.f6822b = i10;
        this.f6823c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j3, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    n0 n0Var = new n0(this, new JSONObject(str));
                    File file = n0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(n0Var);
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
        f6820g.clear();
    }

    public static o0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f6820g;
        o0 o0Var = (o0) hashMap.get(pair);
        if (o0Var == null) {
            o0 o0Var2 = new o0(context, i10, j3);
            hashMap.put(pair, o0Var2);
            return o0Var2;
        }
        return o0Var;
    }

    public final void b(String str, String str2) {
        n0 d = d(str);
        if (d != null) {
            this.f6824f = d;
            d.f6777k = true;
            e();
            return;
        }
        n0 n0Var = new n0(this, str, str2);
        this.f6824f = n0Var;
        n0Var.f6778l = false;
        this.e.add(n0Var);
        f();
        e();
    }

    public final n0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n0 n0Var = (n0) obj;
            if (TextUtils.equals(n0Var.f6771b, str) && n0Var.h) {
                return n0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f6822b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f6821a.getSharedPreferences("botdownloads_" + this.f6822b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n0 n0Var = (n0) obj;
            n0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", n0Var.f6771b);
                jSONObject.put("file_name", n0Var.f6772c);
                jSONObject.put("size", n0Var.f6774g);
                File file = n0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", n0Var.h);
                jSONObject.put("mime", n0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f6823c, hashSet);
        edit.apply();
    }
}
