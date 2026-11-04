package ii;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import gi.f6;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
public final class h0 {
    public Long f14974a;
    public final String f14975b;
    public final String f14976c;
    public File d;
    public final String f14977e;
    public long f14978f;
    public long f14979g;
    public boolean h;
    public boolean f14980i;
    public long f14981j;
    public boolean f14982k;
    public boolean f14983l;
    public final Runnable f14984m = new f6(this, 16);
    public final i0 f14985n;

    public h0(i0 i0Var, String str, String str2) {
        this.f14985n = i0Var;
        this.f14975b = str;
        this.f14976c = str2;
        TLRPC.User a22 = hp.s1(i0Var.f15001b).a2(Long.valueOf(i0Var.f15002c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(l10.p(a22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f14974a = Long.valueOf(i0Var.d.enqueue(request));
    }

    public final void a() {
        i0 i0Var = this.f14985n;
        i0Var.getClass();
        this.f14980i = true;
        Long l10 = this.f14974a;
        if (l10 != null) {
            i0Var.d.remove(l10.longValue());
            this.f14974a = null;
        }
        i0Var.f15003e.remove(this);
        i0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f14979g), Long.valueOf(this.f14979g));
        }
        if (this.f14974a != null && !this.f14980i) {
            if (System.currentTimeMillis() - this.f14981j < 150) {
                return new Pair(Long.valueOf(this.f14978f), Long.valueOf(this.f14979g));
            }
            d();
            return new Pair(Long.valueOf(this.f14978f), Long.valueOf(this.f14979g));
        }
        return new Pair(Long.valueOf(this.f14978f), Long.valueOf(this.f14979g));
    }

    public final boolean c() {
        if (!this.h && this.f14974a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ii.h0.d():void");
    }

    public h0(i0 i0Var, JSONObject jSONObject) {
        this.f14985n = i0Var;
        this.f14975b = jSONObject.optString("url");
        this.f14976c = jSONObject.optString("file_name");
        this.f14979g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f14977e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
