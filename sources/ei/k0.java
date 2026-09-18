package ei;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import ci.uc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class k0 {
    public Long f8414a;
    public final String f8415b;
    public final String f8416c;
    public File d;
    public final String e;
    public long f8417f;
    public long f8418g;
    public boolean h;
    public boolean f8419i;
    public long f8420j;
    public boolean f8421k;
    public boolean f8422l;
    public final Runnable f8423m = new uc(this, 8);
    public final l0 f8424n;

    public k0(l0 l0Var, String str, String str2) {
        this.f8424n = l0Var;
        this.f8415b = str;
        this.f8416c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f8469b).getUser(Long.valueOf(l0Var.f8470c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f8414a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f8424n;
        l0Var.getClass();
        this.f8419i = true;
        Long l4 = this.f8414a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f8414a = null;
        }
        l0Var.e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f8418g), Long.valueOf(this.f8418g));
        }
        if (this.f8414a != null && !this.f8419i) {
            if (System.currentTimeMillis() - this.f8420j < 150) {
                return new Pair(Long.valueOf(this.f8417f), Long.valueOf(this.f8418g));
            }
            d();
            return new Pair(Long.valueOf(this.f8417f), Long.valueOf(this.f8418g));
        }
        return new Pair(Long.valueOf(this.f8417f), Long.valueOf(this.f8418g));
    }

    public final boolean c() {
        if (!this.h && this.f8414a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f8424n = l0Var;
        this.f8415b = jSONObject.optString("url");
        this.f8416c = jSONObject.optString("file_name");
        this.f8418g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
