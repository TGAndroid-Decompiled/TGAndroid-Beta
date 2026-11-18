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
    public Long f18679a;
    public final String f18680b;
    public final String f18681c;
    public File d;
    public final String f18682e;
    public long f18683f;
    public long f18684g;
    public boolean h;
    public boolean f18685i;
    public long f18686j;
    public boolean f18687k;
    public boolean f18688l;
    public final Runnable f18689m = new kg.j0(this, 8);
    public final h0 f18690n;

    public g0(h0 h0Var, String str, String str2) {
        this.f18690n = h0Var;
        this.f18680b = str;
        this.f18681c = str2;
        TLRPC.User c22 = mp.u1(h0Var.f18707b).c2(Long.valueOf(h0Var.f18708c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(o10.q(c22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a8.p0.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18679a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f18690n;
        h0Var.getClass();
        this.f18685i = true;
        Long l10 = this.f18679a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f18679a = null;
        }
        h0Var.f18709e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18684g), Long.valueOf(this.f18684g));
        }
        if (this.f18679a != null && !this.f18685i) {
            if (System.currentTimeMillis() - this.f18686j < 150) {
                return new Pair(Long.valueOf(this.f18683f), Long.valueOf(this.f18684g));
            }
            d();
            return new Pair(Long.valueOf(this.f18683f), Long.valueOf(this.f18684g));
        }
        return new Pair(Long.valueOf(this.f18683f), Long.valueOf(this.f18684g));
    }

    public final boolean c() {
        if (!this.h && this.f18679a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f18690n = h0Var;
        this.f18680b = jSONObject.optString("url");
        this.f18681c = jSONObject.optString("file_name");
        this.f18684g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18682e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
