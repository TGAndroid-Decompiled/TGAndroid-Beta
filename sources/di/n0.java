package di;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import bi.wc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class n0 {
    public Long f6770a;
    public final String f6771b;
    public final String f6772c;
    public File d;
    public final String e;
    public long f6773f;
    public long f6774g;
    public boolean h;
    public boolean f6775i;
    public long f6776j;
    public boolean f6777k;
    public boolean f6778l;
    public final Runnable f6779m = new wc(this, 14);
    public final o0 f6780n;

    public n0(o0 o0Var, String str, String str2) {
        this.f6780n = o0Var;
        this.f6771b = str;
        this.f6772c = str2;
        TLRPC.User user = MessagesController.getInstance(o0Var.f6822b).getUser(Long.valueOf(o0Var.f6823c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f6770a = Long.valueOf(o0Var.d.enqueue(request));
    }

    public final void a() {
        o0 o0Var = this.f6780n;
        o0Var.getClass();
        this.f6775i = true;
        Long l4 = this.f6770a;
        if (l4 != null) {
            o0Var.d.remove(l4.longValue());
            this.f6770a = null;
        }
        o0Var.e.remove(this);
        o0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f6774g), Long.valueOf(this.f6774g));
        }
        if (this.f6770a != null && !this.f6775i) {
            if (System.currentTimeMillis() - this.f6776j < 150) {
                return new Pair(Long.valueOf(this.f6773f), Long.valueOf(this.f6774g));
            }
            d();
            return new Pair(Long.valueOf(this.f6773f), Long.valueOf(this.f6774g));
        }
        return new Pair(Long.valueOf(this.f6773f), Long.valueOf(this.f6774g));
    }

    public final boolean c() {
        if (!this.h && this.f6770a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: di.n0.d():void");
    }

    public n0(o0 o0Var, JSONObject jSONObject) {
        this.f6780n = o0Var;
        this.f6771b = jSONObject.optString("url");
        this.f6772c = jSONObject.optString("file_name");
        this.f6774g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
