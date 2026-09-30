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
    public Long f8408a;
    public final String f8409b;
    public final String f8410c;
    public File d;
    public final String e;
    public long f8411f;
    public long f8412g;
    public boolean h;
    public boolean f8413i;
    public long f8414j;
    public boolean f8415k;
    public boolean f8416l;
    public final Runnable f8417m = new rc(this, 8);
    public final l0 f8418n;

    public k0(l0 l0Var, String str, String str2) {
        this.f8418n = l0Var;
        this.f8409b = str;
        this.f8410c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f8463b).getUser(Long.valueOf(l0Var.f8464c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f8408a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f8418n;
        l0Var.getClass();
        this.f8413i = true;
        Long l4 = this.f8408a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f8408a = null;
        }
        l0Var.e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f8412g), Long.valueOf(this.f8412g));
        }
        if (this.f8408a != null && !this.f8413i) {
            if (System.currentTimeMillis() - this.f8414j < 150) {
                return new Pair(Long.valueOf(this.f8411f), Long.valueOf(this.f8412g));
            }
            d();
            return new Pair(Long.valueOf(this.f8411f), Long.valueOf(this.f8412g));
        }
        return new Pair(Long.valueOf(this.f8411f), Long.valueOf(this.f8412g));
    }

    public final boolean c() {
        if (!this.h && this.f8408a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f8418n = l0Var;
        this.f8409b = jSONObject.optString("url");
        this.f8410c = jSONObject.optString("file_name");
        this.f8412g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
