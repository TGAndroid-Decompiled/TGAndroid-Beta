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
    public Long f8413a;
    public final String f8414b;
    public final String f8415c;
    public File d;
    public final String e;
    public long f8416f;
    public long f8417g;
    public boolean h;
    public boolean f8418i;
    public long f8419j;
    public boolean f8420k;
    public boolean f8421l;
    public final Runnable f8422m = new uc(this, 8);
    public final l0 f8423n;

    public k0(l0 l0Var, String str, String str2) {
        this.f8423n = l0Var;
        this.f8414b = str;
        this.f8415c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f8468b).getUser(Long.valueOf(l0Var.f8469c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f8413a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f8423n;
        l0Var.getClass();
        this.f8418i = true;
        Long l4 = this.f8413a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f8413a = null;
        }
        l0Var.e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f8417g), Long.valueOf(this.f8417g));
        }
        if (this.f8413a != null && !this.f8418i) {
            if (System.currentTimeMillis() - this.f8419j < 150) {
                return new Pair(Long.valueOf(this.f8416f), Long.valueOf(this.f8417g));
            }
            d();
            return new Pair(Long.valueOf(this.f8416f), Long.valueOf(this.f8417g));
        }
        return new Pair(Long.valueOf(this.f8416f), Long.valueOf(this.f8417g));
    }

    public final boolean c() {
        if (!this.h && this.f8413a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f8423n = l0Var;
        this.f8414b = jSONObject.optString("url");
        this.f8415c = jSONObject.optString("file_name");
        this.f8417g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
