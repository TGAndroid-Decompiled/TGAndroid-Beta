package ki;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
public final class f0 {
    public Long f18689a;
    public final String f18690b;
    public final String f18691c;
    public File d;
    public final String f18692e;
    public long f18693f;
    public long f18694g;
    public boolean h;
    public boolean f18695i;
    public long f18696j;
    public boolean f18697k;
    public boolean f18698l;
    public final Runnable f18699m = new kg.i0(this, 8);
    public final g0 f18700n;

    public f0(g0 g0Var, String str, String str2) {
        this.f18700n = g0Var;
        this.f18690b = str;
        this.f18691c = str2;
        TLRPC.User c22 = mp.u1(g0Var.f18717b).c2(Long.valueOf(g0Var.f18718c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(o10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18689a = Long.valueOf(g0Var.d.enqueue(request));
    }

    public final void a() {
        g0 g0Var = this.f18700n;
        g0Var.getClass();
        this.f18695i = true;
        Long l10 = this.f18689a;
        if (l10 != null) {
            g0Var.d.remove(l10.longValue());
            this.f18689a = null;
        }
        g0Var.f18719e.remove(this);
        g0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18694g), Long.valueOf(this.f18694g));
        }
        if (this.f18689a != null && !this.f18695i) {
            if (System.currentTimeMillis() - this.f18696j < 150) {
                return new Pair(Long.valueOf(this.f18693f), Long.valueOf(this.f18694g));
            }
            d();
            return new Pair(Long.valueOf(this.f18693f), Long.valueOf(this.f18694g));
        }
        return new Pair(Long.valueOf(this.f18693f), Long.valueOf(this.f18694g));
    }

    public final boolean c() {
        if (!this.h && this.f18689a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.f0.d():void");
    }

    public f0(g0 g0Var, JSONObject jSONObject) {
        this.f18700n = g0Var;
        this.f18690b = jSONObject.optString("url");
        this.f18691c = jSONObject.optString("file_name");
        this.f18694g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18692e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
