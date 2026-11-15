package ki;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class h0 {
    public Long f18326a;
    public final String f18327b;
    public final String f18328c;
    public File d;
    public final String f18329e;
    public long f18330f;
    public long f18331g;
    public boolean h;
    public boolean f18332i;
    public long f18333j;
    public boolean f18334k;
    public boolean f18335l;
    public final Runnable f18336m = new kg.j1(this, 4);
    public final i0 f18337n;

    public h0(i0 i0Var, String str, String str2) {
        this.f18337n = i0Var;
        this.f18327b = str;
        this.f18328c = str2;
        TLRPC.User a22 = np.s1(i0Var.f18356b).a2(Long.valueOf(i0Var.f18357c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(q10.p(a22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18326a = Long.valueOf(i0Var.d.enqueue(request));
    }

    public final void a() {
        i0 i0Var = this.f18337n;
        i0Var.getClass();
        this.f18332i = true;
        Long l10 = this.f18326a;
        if (l10 != null) {
            i0Var.d.remove(l10.longValue());
            this.f18326a = null;
        }
        i0Var.f18358e.remove(this);
        i0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18331g), Long.valueOf(this.f18331g));
        }
        if (this.f18326a != null && !this.f18332i) {
            if (System.currentTimeMillis() - this.f18333j < 150) {
                return new Pair(Long.valueOf(this.f18330f), Long.valueOf(this.f18331g));
            }
            d();
            return new Pair(Long.valueOf(this.f18330f), Long.valueOf(this.f18331g));
        }
        return new Pair(Long.valueOf(this.f18330f), Long.valueOf(this.f18331g));
    }

    public final boolean c() {
        if (!this.h && this.f18326a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h0.d():void");
    }

    public h0(i0 i0Var, JSONObject jSONObject) {
        this.f18337n = i0Var;
        this.f18327b = jSONObject.optString("url");
        this.f18328c = jSONObject.optString("file_name");
        this.f18331g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18329e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
