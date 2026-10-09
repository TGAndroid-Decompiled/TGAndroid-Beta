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
    public Long f9139a;
    public final String f9140b;
    public final String f9141c;
    public File d;
    public final String f9142e;
    public long f9143f;
    public long f9144g;
    public boolean h;
    public boolean f9145i;
    public long f9146j;
    public boolean f9147k;
    public boolean f9148l;
    public final Runnable f9149m = new rc(this, 8);
    public final l0 f9150n;

    public k0(l0 l0Var, String str, String str2) {
        this.f9150n = l0Var;
        this.f9140b = str;
        this.f9141c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f9197b).getUser(Long.valueOf(l0Var.f9198c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9139a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f9150n;
        l0Var.getClass();
        this.f9145i = true;
        Long l4 = this.f9139a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f9139a = null;
        }
        l0Var.f9199e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9144g), Long.valueOf(this.f9144g));
        }
        if (this.f9139a != null && !this.f9145i) {
            if (System.currentTimeMillis() - this.f9146j < 150) {
                return new Pair(Long.valueOf(this.f9143f), Long.valueOf(this.f9144g));
            }
            d();
            return new Pair(Long.valueOf(this.f9143f), Long.valueOf(this.f9144g));
        }
        return new Pair(Long.valueOf(this.f9143f), Long.valueOf(this.f9144g));
    }

    public final boolean c() {
        if (!this.h && this.f9139a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f9150n = l0Var;
        this.f9140b = jSONObject.optString("url");
        this.f9141c = jSONObject.optString("file_name");
        this.f9144g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9142e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
