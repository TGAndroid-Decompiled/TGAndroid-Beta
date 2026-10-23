package gi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import ei.bc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class i0 {
    public Long f11272a;
    public final String f11273b;
    public final String f11274c;
    public File d;
    public final String e;
    public long f11275f;
    public long f11276g;
    public boolean h;
    public boolean f11277i;
    public long f11278j;
    public boolean f11279k;
    public boolean f11280l;
    public final Runnable f11281m = new bc(this, 4);
    public final j0 f11282n;

    public i0(j0 j0Var, String str, String str2) {
        this.f11282n = j0Var;
        this.f11273b = str;
        this.f11274c = str2;
        TLRPC.User user = MessagesController.getInstance(j0Var.f11296b).getUser(Long.valueOf(j0Var.f11297c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f11272a = Long.valueOf(j0Var.d.enqueue(request));
    }

    public final void a() {
        j0 j0Var = this.f11282n;
        j0Var.getClass();
        this.f11277i = true;
        Long l4 = this.f11272a;
        if (l4 != null) {
            j0Var.d.remove(l4.longValue());
            this.f11272a = null;
        }
        j0Var.e.remove(this);
        j0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f11276g), Long.valueOf(this.f11276g));
        }
        if (this.f11272a != null && !this.f11277i) {
            if (System.currentTimeMillis() - this.f11278j < 150) {
                return new Pair(Long.valueOf(this.f11275f), Long.valueOf(this.f11276g));
            }
            d();
            return new Pair(Long.valueOf(this.f11275f), Long.valueOf(this.f11276g));
        }
        return new Pair(Long.valueOf(this.f11275f), Long.valueOf(this.f11276g));
    }

    public final boolean c() {
        if (!this.h && this.f11272a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.d():void");
    }

    public i0(j0 j0Var, JSONObject jSONObject) {
        this.f11282n = j0Var;
        this.f11273b = jSONObject.optString("url");
        this.f11274c = jSONObject.optString("file_name");
        this.f11276g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
