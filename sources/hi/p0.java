package hi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import fi.ua;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class p0 {
    public Long f13189a;
    public final String f13190b;
    public final String f13191c;
    public File d;
    public final String e;
    public long f13192f;
    public long f13193g;
    public boolean h;
    public boolean f13194i;
    public long f13195j;
    public boolean f13196k;
    public boolean f13197l;
    public final Runnable f13198m = new ua(this, 9);
    public final q0 f13199n;

    public p0(q0 q0Var, String str, String str2) {
        this.f13199n = q0Var;
        this.f13190b = str;
        this.f13191c = str2;
        TLRPC.User user = MessagesController.getInstance(q0Var.f13226b).getUser(Long.valueOf(q0Var.f13227c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f13189a = Long.valueOf(q0Var.d.enqueue(request));
    }

    public final void a() {
        q0 q0Var = this.f13199n;
        q0Var.getClass();
        this.f13194i = true;
        Long l4 = this.f13189a;
        if (l4 != null) {
            q0Var.d.remove(l4.longValue());
            this.f13189a = null;
        }
        q0Var.e.remove(this);
        q0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f13193g), Long.valueOf(this.f13193g));
        }
        if (this.f13189a != null && !this.f13194i) {
            if (System.currentTimeMillis() - this.f13195j < 150) {
                return new Pair(Long.valueOf(this.f13192f), Long.valueOf(this.f13193g));
            }
            d();
            return new Pair(Long.valueOf(this.f13192f), Long.valueOf(this.f13193g));
        }
        return new Pair(Long.valueOf(this.f13192f), Long.valueOf(this.f13193g));
    }

    public final boolean c() {
        if (!this.h && this.f13189a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: hi.p0.d():void");
    }

    public p0(q0 q0Var, JSONObject jSONObject) {
        this.f13199n = q0Var;
        this.f13190b = jSONObject.optString("url");
        this.f13191c = jSONObject.optString("file_name");
        this.f13193g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
