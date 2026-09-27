package ei;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import ci.qc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class k0 {
    public Long f8398a;
    public final String f8399b;
    public final String f8400c;
    public File d;
    public final String e;
    public long f8401f;
    public long f8402g;
    public boolean h;
    public boolean f8403i;
    public long f8404j;
    public boolean f8405k;
    public boolean f8406l;
    public final Runnable f8407m = new qc(this, 8);
    public final l0 f8408n;

    public k0(l0 l0Var, String str, String str2) {
        this.f8408n = l0Var;
        this.f8399b = str;
        this.f8400c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f8453b).getUser(Long.valueOf(l0Var.f8454c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f8398a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f8408n;
        l0Var.getClass();
        this.f8403i = true;
        Long l4 = this.f8398a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f8398a = null;
        }
        l0Var.e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f8402g), Long.valueOf(this.f8402g));
        }
        if (this.f8398a != null && !this.f8403i) {
            if (System.currentTimeMillis() - this.f8404j < 150) {
                return new Pair(Long.valueOf(this.f8401f), Long.valueOf(this.f8402g));
            }
            d();
            return new Pair(Long.valueOf(this.f8401f), Long.valueOf(this.f8402g));
        }
        return new Pair(Long.valueOf(this.f8401f), Long.valueOf(this.f8402g));
    }

    public final boolean c() {
        if (!this.h && this.f8398a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f8408n = l0Var;
        this.f8399b = jSONObject.optString("url");
        this.f8400c = jSONObject.optString("file_name");
        this.f8402g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
