package fi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import di.nb;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class k0 {
    public Long f9773a;
    public final String f9774b;
    public final String f9775c;
    public File d;
    public final String f9776e;
    public long f9777f;
    public long f9778g;
    public boolean h;
    public boolean f9779i;
    public long f9780j;
    public boolean f9781k;
    public boolean f9782l;
    public final Runnable f9783m = new nb(this, 12);
    public final l0 f9784n;

    public k0(l0 l0Var, String str, String str2) {
        this.f9784n = l0Var;
        this.f9774b = str;
        this.f9775c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f9827b).getUser(Long.valueOf(l0Var.f9828c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9773a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f9784n;
        l0Var.getClass();
        this.f9779i = true;
        Long l4 = this.f9773a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f9773a = null;
        }
        l0Var.f9829e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9778g), Long.valueOf(this.f9778g));
        }
        if (this.f9773a != null && !this.f9779i) {
            if (System.currentTimeMillis() - this.f9780j < 150) {
                return new Pair(Long.valueOf(this.f9777f), Long.valueOf(this.f9778g));
            }
            d();
            return new Pair(Long.valueOf(this.f9777f), Long.valueOf(this.f9778g));
        }
        return new Pair(Long.valueOf(this.f9777f), Long.valueOf(this.f9778g));
    }

    public final boolean c() {
        if (!this.h && this.f9773a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: fi.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f9784n = l0Var;
        this.f9774b = jSONObject.optString("url");
        this.f9775c = jSONObject.optString("file_name");
        this.f9778g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9776e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
