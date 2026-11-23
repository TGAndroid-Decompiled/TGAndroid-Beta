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
    public Long f18692a;
    public final String f18693b;
    public final String f18694c;
    public File d;
    public final String f18695e;
    public long f18696f;
    public long f18697g;
    public boolean h;
    public boolean f18698i;
    public long f18699j;
    public boolean f18700k;
    public boolean f18701l;
    public final Runnable f18702m = new kg.i0(this, 8);
    public final g0 f18703n;

    public f0(g0 g0Var, String str, String str2) {
        this.f18703n = g0Var;
        this.f18693b = str;
        this.f18694c = str2;
        TLRPC.User c22 = np.u1(g0Var.f18720b).c2(Long.valueOf(g0Var.f18721c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(p10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18692a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f18703n;
        g0Var.getClass();
        this.f18698i = true;
        Long l10 = this.f18692a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f18692a = null;
        }
        g0Var.f18722e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18697g), Long.valueOf(this.f18697g));
        }
        if (this.f18692a != null && !this.f18698i) {
            if (System.currentTimeMillis() - this.f18699j < 150) {
                return new Pair(Long.valueOf(this.f18696f), Long.valueOf(this.f18697g));
            }
            d();
            return new Pair(Long.valueOf(this.f18696f), Long.valueOf(this.f18697g));
        }
        return new Pair(Long.valueOf(this.f18696f), Long.valueOf(this.f18697g));
    }

    public final boolean c() {
        if (!this.h && this.f18692a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f18703n = g0Var;
        this.f18693b = jSONObject.optString("url");
        this.f18694c = jSONObject.optString("file_name");
        this.f18697g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18695e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
