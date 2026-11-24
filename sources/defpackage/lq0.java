package defpackage;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
public final class lq0 {
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
    public final Runnable m = new f00(this, (byte) 21);
    public final mq0 n;

    public lq0(mq0 mq0Var, String str, String str2) {
        String o;
        this.n = mq0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User W1 = oc7.r1(mq0Var.b).W1(Long.valueOf(mq0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(m9c.r(W1));
        if (TextUtils.isEmpty(str2)) {
            o = "Downloading file...";
        } else {
            o = kt6.o("Downloading ", str2, "...");
        }
        request.setDescription(o);
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(mq0Var.d.enqueue(request));
    }

    public final void a() {
        mq0 mq0Var = this.n;
        mq0Var.getClass();
        this.i = true;
        Long l = this.a;
        if (l != null) {
            mq0Var.d.remove(l.longValue());
            this.a = null;
        }
        mq0Var.e.remove(this);
        mq0Var.e();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq0.d():void");
    }

    public lq0(mq0 mq0Var, JSONObject jSONObject) {
        this.n = mq0Var;
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
