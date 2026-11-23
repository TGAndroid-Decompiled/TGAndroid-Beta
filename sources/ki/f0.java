package ki;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class f0 {
    public Long f18739a;
    public final String f18740b;
    public final String f18741c;
    public File d;
    public final String f18742e;
    public long f18743f;
    public long f18744g;
    public boolean h;
    public boolean f18745i;
    public long f18746j;
    public boolean f18747k;
    public boolean f18748l;
    public final Runnable f18749m = new kg.i0(this, 8);
    public final g0 f18750n;

    public f0(g0 g0Var, String str, String str2) {
        this.f18750n = g0Var;
        this.f18740b = str;
        this.f18741c = str2;
        TLRPC.User c22 = mp.u1(g0Var.f18790b).c2(Long.valueOf(g0Var.f18791c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(n10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18739a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f18750n;
        g0Var.getClass();
        this.f18745i = true;
        Long l10 = this.f18739a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f18739a = null;
        }
        g0Var.f18792e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18744g), Long.valueOf(this.f18744g));
        }
        if (this.f18739a != null && !this.f18745i) {
            if (System.currentTimeMillis() - this.f18746j < 150) {
                return new Pair(Long.valueOf(this.f18743f), Long.valueOf(this.f18744g));
            }
            d();
            return new Pair(Long.valueOf(this.f18743f), Long.valueOf(this.f18744g));
        }
        return new Pair(Long.valueOf(this.f18743f), Long.valueOf(this.f18744g));
    }

    public final boolean c() {
        if (!this.h && this.f18739a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f18750n = g0Var;
        this.f18740b = jSONObject.optString("url");
        this.f18741c = jSONObject.optString("file_name");
        this.f18744g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18742e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
