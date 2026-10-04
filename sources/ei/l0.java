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
    public Long f9137a;
    public final String f9138b;
    public final String f9139c;
    public File d;
    public final String f9140e;
    public long f9141f;
    public long f9142g;
    public boolean h;
    public boolean f9143i;
    public long f9144j;
    public boolean f9145k;
    public boolean f9146l;
    public final Runnable f9147m = new qc(this, 8);
    public final m0 f9148n;

    public l0(m0 m0Var, String str, String str2) {
        this.f9148n = m0Var;
        this.f9138b = str;
        this.f9139c = str2;
        TLRPC.User user = MessagesController.getInstance(m0Var.f9194b).getUser(Long.valueOf(m0Var.f9195c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.a.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f9137a = Long.valueOf(m0Var.d.enqueue(request));
    }

    public final void a() {
        m0 m0Var = this.f9148n;
        m0Var.getClass();
        this.f9143i = true;
        Long l4 = this.f9137a;
        if (l4 != null) {
            m0Var.d.remove(l4.longValue());
            this.f9137a = null;
        }
        m0Var.f9196e.remove(this);
        m0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f9142g), Long.valueOf(this.f9142g));
        }
        if (this.f9137a != null && !this.f9143i) {
            if (System.currentTimeMillis() - this.f9144j < 150) {
                return new Pair(Long.valueOf(this.f9141f), Long.valueOf(this.f9142g));
            }
            d();
            return new Pair(Long.valueOf(this.f9141f), Long.valueOf(this.f9142g));
        }
        return new Pair(Long.valueOf(this.f9141f), Long.valueOf(this.f9142g));
    }

    public final boolean c() {
        if (!this.h && this.f9137a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ei.l0.d():void");
    }

    public l0(m0 m0Var, JSONObject jSONObject) {
        this.f9148n = m0Var;
        this.f9138b = jSONObject.optString("url");
        this.f9139c = jSONObject.optString("file_name");
        this.f9142g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f9140e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
