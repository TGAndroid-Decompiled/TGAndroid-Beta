package hi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import fi.v9;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class f0 {
    public Long f14640a;
    public final String f14641b;
    public final String f14642c;
    public File d;
    public final String f14643e;
    public long f14644f;
    public long f14645g;
    public boolean h;
    public boolean f14646i;
    public long f14647j;
    public boolean f14648k;
    public boolean f14649l;
    public final Runnable f14650m = new v9(this, 12);
    public final g0 f14651n;

    public f0(g0 g0Var, String str, String str2) {
        this.f14651n = g0Var;
        this.f14641b = str;
        this.f14642c = str2;
        TLRPC.User a22 = qp.s1(g0Var.f14670b).a2(Long.valueOf(g0Var.f14671c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(t10.p(a22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f14640a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f14651n;
        g0Var.getClass();
        this.f14646i = true;
        Long l10 = this.f14640a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f14640a = null;
        }
        g0Var.f14672e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f14645g), Long.valueOf(this.f14645g));
        }
        if (this.f14640a != null && !this.f14646i) {
            if (System.currentTimeMillis() - this.f14647j < 150) {
                return new Pair(Long.valueOf(this.f14644f), Long.valueOf(this.f14645g));
            }
            d();
            return new Pair(Long.valueOf(this.f14644f), Long.valueOf(this.f14645g));
        }
        return new Pair(Long.valueOf(this.f14644f), Long.valueOf(this.f14645g));
    }

    public final boolean c() {
        if (!this.h && this.f14640a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: hi.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f14651n = g0Var;
        this.f14641b = jSONObject.optString("url");
        this.f14642c = jSONObject.optString("file_name");
        this.f14645g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f14643e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
