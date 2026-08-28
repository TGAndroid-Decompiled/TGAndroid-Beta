package mh;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class j0 {
    public Long f17914a;
    public final String f17915b;
    public final String f17916c;
    public File d;
    public final String f17917e;
    public long f17918f;
    public long f17919g;
    public boolean h;
    public boolean f17920i;
    public long f17921j;
    public boolean f17922k;
    public boolean f17923l;
    public final Runnable f17924m = new kh.f1(this, 24);
    public final k0 f17925n;

    public j0(k0 k0Var, String str, String str2) {
        this.f17925n = k0Var;
        this.f17915b = str;
        this.f17916c = str2;
        TLRPC.User user = MessagesController.getInstance(k0Var.f17946b).getUser(Long.valueOf(k0Var.f17947c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : aa.d.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f17914a = Long.valueOf(k0Var.d.enqueue(request));
    }

    public final void a() {
        k0 k0Var = this.f17925n;
        k0Var.getClass();
        this.f17920i = true;
        Long l10 = this.f17914a;
        if (l10 != null) {
            k0Var.d.remove(l10.longValue());
            this.f17914a = null;
        }
        k0Var.f17948e.remove(this);
        k0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f17919g), Long.valueOf(this.f17919g));
        }
        if (this.f17914a != null && !this.f17920i) {
            if (System.currentTimeMillis() - this.f17921j < 150) {
                return new Pair(Long.valueOf(this.f17918f), Long.valueOf(this.f17919g));
            }
            d();
            return new Pair(Long.valueOf(this.f17918f), Long.valueOf(this.f17919g));
        }
        return new Pair(Long.valueOf(this.f17918f), Long.valueOf(this.f17919g));
    }

    public final boolean c() {
        if (!this.h && this.f17914a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: mh.j0.d():void");
    }

    public j0(k0 k0Var, JSONObject jSONObject) {
        this.f17925n = k0Var;
        this.f17915b = jSONObject.optString("url");
        this.f17916c = jSONObject.optString("file_name");
        this.f17919g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f17917e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
