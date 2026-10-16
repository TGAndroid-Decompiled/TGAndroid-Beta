package fi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import di.x8;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class j0 {
    public Long f9327a;
    public final String f9328b;
    public final String f9329c;
    public File d;
    public final String e;
    public long f9330f;
    public long f9331g;
    public boolean h;
    public boolean f9332i;
    public long f9333j;
    public boolean f9334k;
    public boolean f9335l;
    public final Runnable f9336m = new x8(this, 14);
    public final k0 f9337n;

    public j0(k0 k0Var, String str, String str2) {
        this.f9337n = k0Var;
        this.f9328b = str;
        this.f9329c = str2;
        TLRPC.User user = MessagesController.getInstance(k0Var.f9350b).getUser(Long.valueOf(k0Var.f9351c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9327a = Long.valueOf(k0Var.d.enqueue(request));
    }

    public final void a() {
        k0 k0Var = this.f9337n;
        k0Var.getClass();
        this.f9332i = true;
        Long l4 = this.f9327a;
        if (l4 != null) {
            k0Var.d.remove(l4.longValue());
            this.f9327a = null;
        }
        k0Var.e.remove(this);
        k0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9331g), Long.valueOf(this.f9331g));
        }
        if (this.f9327a != null && !this.f9332i) {
            if (System.currentTimeMillis() - this.f9333j < 150) {
                return new Pair(Long.valueOf(this.f9330f), Long.valueOf(this.f9331g));
            }
            d();
            return new Pair(Long.valueOf(this.f9330f), Long.valueOf(this.f9331g));
        }
        return new Pair(Long.valueOf(this.f9330f), Long.valueOf(this.f9331g));
    }

    public final boolean c() {
        if (!this.h && this.f9327a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: fi.j0.d():void");
    }

    public j0(k0 k0Var, JSONObject jSONObject) {
        this.f9337n = k0Var;
        this.f9328b = jSONObject.optString("url");
        this.f9329c = jSONObject.optString("file_name");
        this.f9331g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
