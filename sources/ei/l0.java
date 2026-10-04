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
public final class l0 {
    public Long f9136a;
    public final String f9137b;
    public final String f9138c;
    public File d;
    public final String f9139e;
    public long f9140f;
    public long f9141g;
    public boolean h;
    public boolean f9142i;
    public long f9143j;
    public boolean f9144k;
    public boolean f9145l;
    public final Runnable f9146m = new qc(this, 8);
    public final m0 f9147n;

    public l0(m0 m0Var, String str, String str2) {
        this.f9147n = m0Var;
        this.f9137b = str;
        this.f9138c = str2;
        TLRPC.User user = MessagesController.getInstance(m0Var.f9193b).getUser(Long.valueOf(m0Var.f9194c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9136a = Long.valueOf(m0Var.d.enqueue(request));
    }

    public final void a() {
        m0 m0Var = this.f9147n;
        m0Var.getClass();
        this.f9142i = true;
        Long l4 = this.f9136a;
        if (l4 != null) {
            m0Var.d.remove(l4.longValue());
            this.f9136a = null;
        }
        m0Var.f9195e.remove(this);
        m0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9141g), Long.valueOf(this.f9141g));
        }
        if (this.f9136a != null && !this.f9142i) {
            if (System.currentTimeMillis() - this.f9143j < 150) {
                return new Pair(Long.valueOf(this.f9140f), Long.valueOf(this.f9141g));
            }
            d();
            return new Pair(Long.valueOf(this.f9140f), Long.valueOf(this.f9141g));
        }
        return new Pair(Long.valueOf(this.f9140f), Long.valueOf(this.f9141g));
    }

    public final boolean c() {
        if (!this.h && this.f9136a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.l0.d():void");
    }

    public l0(m0 m0Var, JSONObject jSONObject) {
        this.f9147n = m0Var;
        this.f9137b = jSONObject.optString("url");
        this.f9138c = jSONObject.optString("file_name");
        this.f9141g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9139e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
