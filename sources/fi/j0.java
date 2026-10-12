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
    public Long f9324a;
    public final String f9325b;
    public final String f9326c;
    public File d;
    public final String e;
    public long f9327f;
    public long f9328g;
    public boolean h;
    public boolean f9329i;
    public long f9330j;
    public boolean f9331k;
    public boolean f9332l;
    public final Runnable f9333m = new x8(this, 14);
    public final k0 f9334n;

    public j0(k0 k0Var, String str, String str2) {
        this.f9334n = k0Var;
        this.f9325b = str;
        this.f9326c = str2;
        TLRPC.User user = MessagesController.getInstance(k0Var.f9347b).getUser(Long.valueOf(k0Var.f9348c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9324a = Long.valueOf(k0Var.d.enqueue(request));
    }

    public final void a() {
        k0 k0Var = this.f9334n;
        k0Var.getClass();
        this.f9329i = true;
        Long l4 = this.f9324a;
        if (l4 != null) {
            k0Var.d.remove(l4.longValue());
            this.f9324a = null;
        }
        k0Var.e.remove(this);
        k0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9328g), Long.valueOf(this.f9328g));
        }
        if (this.f9324a != null && !this.f9329i) {
            if (System.currentTimeMillis() - this.f9330j < 150) {
                return new Pair(Long.valueOf(this.f9327f), Long.valueOf(this.f9328g));
            }
            d();
            return new Pair(Long.valueOf(this.f9327f), Long.valueOf(this.f9328g));
        }
        return new Pair(Long.valueOf(this.f9327f), Long.valueOf(this.f9328g));
    }

    public final boolean c() {
        if (!this.h && this.f9324a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: fi.j0.d():void");
    }

    public j0(k0 k0Var, JSONObject jSONObject) {
        this.f9334n = k0Var;
        this.f9325b = jSONObject.optString("url");
        this.f9326c = jSONObject.optString("file_name");
        this.f9328g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
