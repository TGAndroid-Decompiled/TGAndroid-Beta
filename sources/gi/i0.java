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
    public Long f11251a;
    public final String f11252b;
    public final String f11253c;
    public File d;
    public final String e;
    public long f11254f;
    public long f11255g;
    public boolean h;
    public boolean f11256i;
    public long f11257j;
    public boolean f11258k;
    public boolean f11259l;
    public final Runnable f11260m = new bc(this, 4);
    public final j0 f11261n;

    public i0(j0 j0Var, String str, String str2) {
        this.f11261n = j0Var;
        this.f11252b = str;
        this.f11253c = str2;
        TLRPC.User user = MessagesController.getInstance(j0Var.f11275b).getUser(Long.valueOf(j0Var.f11276c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f11251a = Long.valueOf(j0Var.d.enqueue(request));
    }

    public final void a() {
        j0 j0Var = this.f11261n;
        j0Var.getClass();
        this.f11256i = true;
        Long l4 = this.f11251a;
        if (l4 != null) {
            j0Var.d.remove(l4.longValue());
            this.f11251a = null;
        }
        j0Var.e.remove(this);
        j0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f11255g), Long.valueOf(this.f11255g));
        }
        if (this.f11251a != null && !this.f11256i) {
            if (System.currentTimeMillis() - this.f11257j < 150) {
                return new Pair(Long.valueOf(this.f11254f), Long.valueOf(this.f11255g));
            }
            d();
            return new Pair(Long.valueOf(this.f11254f), Long.valueOf(this.f11255g));
        }
        return new Pair(Long.valueOf(this.f11254f), Long.valueOf(this.f11255g));
    }

    public final boolean c() {
        if (!this.h && this.f11251a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.d():void");
    }

    public i0(j0 j0Var, JSONObject jSONObject) {
        this.f11261n = j0Var;
        this.f11252b = jSONObject.optString("url");
        this.f11253c = jSONObject.optString("file_name");
        this.f11255g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
