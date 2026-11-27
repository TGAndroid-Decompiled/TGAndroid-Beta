package defpackage;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
public final class lp0 {
    public Long a;
    public final String b;
    public final String c;
    public File d;
    public final String e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public long j;
    public boolean k;
    public boolean l;
    public final Runnable m = new pz(this, (byte) 20);
    public final mp0 n;

    public lp0(mp0 mp0Var, String str, String str2) {
        String y;
        this.n = mp0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User X1 = uc7.s1(mp0Var.b).X1(Long.valueOf(mp0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(lbc.r(X1));
        if (TextUtils.isEmpty(str2)) {
            y = "Downloading file...";
        } else {
            y = qd4.y("Downloading ", str2, "...");
        }
        request.setDescription(y);
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(mp0Var.d.enqueue(request));
    }

    public final void a() {
        mp0 mp0Var = this.n;
        mp0Var.getClass();
        this.i = true;
        Long l = this.a;
        if (l != null) {
            mp0Var.d.remove(l.longValue());
            this.a = null;
        }
        mp0Var.e.remove(this);
        mp0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.g), Long.valueOf(this.g));
        }
        if (this.a != null && !this.i) {
            if (System.currentTimeMillis() - this.j < 150) {
                return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
            }
            d();
            return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
        }
        return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
    }

    public final boolean c() {
        if (!this.h && this.a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp0.d():void");
    }

    public lp0(mp0 mp0Var, JSONObject jSONObject) {
        this.n = mp0Var;
        this.b = jSONObject.optString("url");
        this.c = jSONObject.optString("file_name");
        this.g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
