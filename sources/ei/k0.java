package ei;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import ci.rc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class k0 {
    public Long f9138a;
    public final String f9139b;
    public final String f9140c;
    public File d;
    public final String f9141e;
    public long f9142f;
    public long f9143g;
    public boolean h;
    public boolean f9144i;
    public long f9145j;
    public boolean f9146k;
    public boolean f9147l;
    public final Runnable f9148m = new rc(this, 8);
    public final l0 f9149n;

    public k0(l0 l0Var, String str, String str2) {
        this.f9149n = l0Var;
        this.f9139b = str;
        this.f9140c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f9196b).getUser(Long.valueOf(l0Var.f9197c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9138a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f9149n;
        l0Var.getClass();
        this.f9144i = true;
        Long l4 = this.f9138a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f9138a = null;
        }
        l0Var.f9198e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9143g), Long.valueOf(this.f9143g));
        }
        if (this.f9138a != null && !this.f9144i) {
            if (System.currentTimeMillis() - this.f9145j < 150) {
                return new Pair(Long.valueOf(this.f9142f), Long.valueOf(this.f9143g));
            }
            d();
            return new Pair(Long.valueOf(this.f9142f), Long.valueOf(this.f9143g));
        }
        return new Pair(Long.valueOf(this.f9142f), Long.valueOf(this.f9143g));
    }

    public final boolean c() {
        if (!this.h && this.f9138a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f9149n = l0Var;
        this.f9139b = jSONObject.optString("url");
        this.f9140c = jSONObject.optString("file_name");
        this.f9143g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9141e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
