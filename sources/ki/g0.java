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
public final class g0 {
    public Long f18682a;
    public final String f18683b;
    public final String f18684c;
    public File d;
    public final String f18685e;
    public long f18686f;
    public long f18687g;
    public boolean h;
    public boolean f18688i;
    public long f18689j;
    public boolean f18690k;
    public boolean f18691l;
    public final Runnable f18692m = new kg.j0(this, 8);
    public final h0 f18693n;

    public g0(h0 h0Var, String str, String str2) {
        this.f18693n = h0Var;
        this.f18683b = str;
        this.f18684c = str2;
        TLRPC.User c22 = mp.u1(h0Var.f18710b).c2(Long.valueOf(h0Var.f18711c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(o10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18682a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f18693n;
        h0Var.getClass();
        this.f18688i = true;
        Long l10 = this.f18682a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f18682a = null;
        }
        h0Var.f18712e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18687g), Long.valueOf(this.f18687g));
        }
        if (this.f18682a != null && !this.f18688i) {
            if (System.currentTimeMillis() - this.f18689j < 150) {
                return new Pair(Long.valueOf(this.f18686f), Long.valueOf(this.f18687g));
            }
            d();
            return new Pair(Long.valueOf(this.f18686f), Long.valueOf(this.f18687g));
        }
        return new Pair(Long.valueOf(this.f18686f), Long.valueOf(this.f18687g));
    }

    public final boolean c() {
        if (!this.h && this.f18682a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f18693n = h0Var;
        this.f18683b = jSONObject.optString("url");
        this.f18684c = jSONObject.optString("file_name");
        this.f18687g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18685e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
