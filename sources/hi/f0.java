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
    public Long f14638a;
    public final String f14639b;
    public final String f14640c;
    public File d;
    public final String f14641e;
    public long f14642f;
    public long f14643g;
    public boolean h;
    public boolean f14644i;
    public long f14645j;
    public boolean f14646k;
    public boolean f14647l;
    public final Runnable f14648m = new v9(this, 12);
    public final g0 f14649n;

    public f0(g0 g0Var, String str, String str2) {
        this.f14649n = g0Var;
        this.f14639b = str;
        this.f14640c = str2;
        TLRPC.User a22 = qp.s1(g0Var.f14668b).a2(Long.valueOf(g0Var.f14669c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(t10.p(a22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f14638a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f14649n;
        g0Var.getClass();
        this.f14644i = true;
        Long l10 = this.f14638a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f14638a = null;
        }
        g0Var.f14670e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f14643g), Long.valueOf(this.f14643g));
        }
        if (this.f14638a != null && !this.f14644i) {
            if (System.currentTimeMillis() - this.f14645j < 150) {
                return new Pair(Long.valueOf(this.f14642f), Long.valueOf(this.f14643g));
            }
            d();
            return new Pair(Long.valueOf(this.f14642f), Long.valueOf(this.f14643g));
        }
        return new Pair(Long.valueOf(this.f14642f), Long.valueOf(this.f14643g));
    }

    public final boolean c() {
        if (!this.h && this.f14638a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: hi.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f14649n = g0Var;
        this.f14639b = jSONObject.optString("url");
        this.f14640c = jSONObject.optString("file_name");
        this.f14643g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f14641e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
