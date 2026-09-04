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
    public Long f9745a;
    public final String f9746b;
    public final String f9747c;
    public File d;
    public final String f9748e;
    public long f9749f;
    public long f9750g;
    public boolean h;
    public boolean f9751i;
    public long f9752j;
    public boolean f9753k;
    public boolean f9754l;
    public final Runnable f9755m = new nb(this, 12);
    public final l0 f9756n;

    public k0(l0 l0Var, String str, String str2) {
        this.f9756n = l0Var;
        this.f9746b = str;
        this.f9747c = str2;
        TLRPC.User user = MessagesController.getInstance(l0Var.f9799b).getUser(Long.valueOf(l0Var.f9800c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9745a = Long.valueOf(l0Var.d.enqueue(request));
    }

    public final void a() {
        l0 l0Var = this.f9756n;
        l0Var.getClass();
        this.f9751i = true;
        Long l4 = this.f9745a;
        if (l4 != null) {
            l0Var.d.remove(l4.longValue());
            this.f9745a = null;
        }
        l0Var.f9801e.remove(this);
        l0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9750g), Long.valueOf(this.f9750g));
        }
        if (this.f9745a != null && !this.f9751i) {
            if (System.currentTimeMillis() - this.f9752j < 150) {
                return new Pair(Long.valueOf(this.f9749f), Long.valueOf(this.f9750g));
            }
            d();
            return new Pair(Long.valueOf(this.f9749f), Long.valueOf(this.f9750g));
        }
        return new Pair(Long.valueOf(this.f9749f), Long.valueOf(this.f9750g));
    }

    public final boolean c() {
        if (!this.h && this.f9745a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: fi.k0.d():void");
    }

    public k0(l0 l0Var, JSONObject jSONObject) {
        this.f9756n = l0Var;
        this.f9746b = jSONObject.optString("url");
        this.f9747c = jSONObject.optString("file_name");
        this.f9750g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9748e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
