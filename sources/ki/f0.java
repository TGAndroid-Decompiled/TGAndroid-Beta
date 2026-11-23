package ki;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
public final class f0 {
    public Long f18658a;
    public final String f18659b;
    public final String f18660c;
    public File d;
    public final String f18661e;
    public long f18662f;
    public long f18663g;
    public boolean h;
    public boolean f18664i;
    public long f18665j;
    public boolean f18666k;
    public boolean f18667l;
    public final Runnable f18668m = new kg.s0(this, 7);
    public final g0 f18669n;

    public f0(g0 g0Var, String str, String str2) {
        this.f18669n = g0Var;
        this.f18659b = str;
        this.f18660c = str2;
        TLRPC.User c22 = np.u1(g0Var.f18686b).c2(Long.valueOf(g0Var.f18687c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(p10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18658a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f18669n;
        g0Var.getClass();
        this.f18664i = true;
        Long l10 = this.f18658a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f18658a = null;
        }
        g0Var.f18688e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18663g), Long.valueOf(this.f18663g));
        }
        if (this.f18658a != null && !this.f18664i) {
            if (System.currentTimeMillis() - this.f18665j < 150) {
                return new Pair(Long.valueOf(this.f18662f), Long.valueOf(this.f18663g));
            }
            d();
            return new Pair(Long.valueOf(this.f18662f), Long.valueOf(this.f18663g));
        }
        return new Pair(Long.valueOf(this.f18662f), Long.valueOf(this.f18663g));
    }

    public final boolean c() {
        if (!this.h && this.f18658a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f18669n = g0Var;
        this.f18659b = jSONObject.optString("url");
        this.f18660c = jSONObject.optString("file_name");
        this.f18663g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18661e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
