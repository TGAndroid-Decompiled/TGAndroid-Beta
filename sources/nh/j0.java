package nh;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

public final class j0 {

    public static final HashMap f18767g = new HashMap();
    public static final HashMap h = new HashMap();

    public final Context f18768a;

    public final int f18769b;

    public final long f18770c;
    public final DownloadManager d;

    public final ArrayList f18771e = new ArrayList();

    public i0 f18772f;

    public j0(Context context, int i10, long j10) {
        this.f18768a = context;
        this.f18769b = i10;
        this.f18770c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    i0 i0Var = new i0(this, new JSONObject(it.next()));
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        this.f18771e.add(i0Var);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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
        f18767g.clear();
    }

    public static j0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap map = f18767g;
        j0 j0Var = (j0) map.get(pair);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(context, i10, j10);
        map.put(pair, j0Var2);
        return j0Var2;
    }

    public final void b(String str, String str2) {
        i0 i0VarD = d(str);
        if (i0VarD != null) {
            this.f18772f = i0VarD;
            i0VarD.f18745k = true;
            e();
        } else {
            i0 i0Var = new i0(this, str, str2);
            this.f18772f = i0Var;
            i0Var.f18746l = false;
            this.f18771e.add(i0Var);
            f();
            e();
        }
    }

    public final i0 d(String str) {
        ArrayList arrayList = this.f18771e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (TextUtils.equals(i0Var.f18738b, str) && i0Var.h) {
                return i0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f18769b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        int i10 = 0;
        SharedPreferences.Editor editorEdit = this.f18768a.getSharedPreferences("botdownloads_" + this.f18769b, 0).edit();
        editorEdit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f18771e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            i0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", i0Var.f18738b);
                jSONObject.put("file_name", i0Var.f18739c);
                jSONObject.put("size", i0Var.f18742g);
                File file = i0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", i0Var.h);
                jSONObject.put("mime", i0Var.f18740e);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            hashSet.add(jSONObject.toString());
        }
        editorEdit.putStringSet("" + this.f18770c, hashSet);
        editorEdit.apply();
    }
}
