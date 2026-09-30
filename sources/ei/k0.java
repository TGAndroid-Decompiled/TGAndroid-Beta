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
    public Long f8396a;
    public final String f8397b;
    public final String f8398c;
    public File d;
    public final String e;
    public long f8399f;
    public long f8400g;
    public boolean h;
    public boolean f8401i;
    public long f8402j;
    public boolean f8403k;
    public boolean f8404l;
    public final Runnable f8405m = new rc(this, 8);
    public final l0 f8406n;

    public k0(l0 l0Var, String str, String str2) {
        this.f8406n = l0Var;
        this.f8397b = str;
        this.f8398c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f8451b).getUser(Long.valueOf(l0Var.f8452c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f8396a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f8406n;
        l0Var.getClass();
        this.f8401i = true;
        Long l4 = this.f8396a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f8396a = null;
        }
        l0Var.e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f8400g), Long.valueOf(this.f8400g));
        }
        if (this.f8396a != null && !this.f8401i) {
            if (System.currentTimeMillis() - this.f8402j < 150) {
                return new Pair(Long.valueOf(this.f8399f), Long.valueOf(this.f8400g));
            }
            d();
            return new Pair(Long.valueOf(this.f8399f), Long.valueOf(this.f8400g));
        }
        return new Pair(Long.valueOf(this.f8399f), Long.valueOf(this.f8400g));
    }

    public final boolean c() {
        if (!this.h && this.f8396a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f8406n = l0Var;
        this.f8397b = jSONObject.optString("url");
        this.f8398c = jSONObject.optString("file_name");
        this.f8400g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
