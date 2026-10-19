package gi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import ei.bc;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class i0 {
    public Long f11252a;
    public final String f11253b;
    public final String f11254c;
    public File d;
    public final String e;
    public long f11255f;
    public long f11256g;
    public boolean h;
    public boolean f11257i;
    public long f11258j;
    public boolean f11259k;
    public boolean f11260l;
    public final Runnable f11261m = new bc(this, 4);
    public final j0 f11262n;

    public i0(j0 j0Var, String str, String str2) {
        this.f11262n = j0Var;
        this.f11253b = str;
        this.f11254c = str2;
        TLRPC.User user = MessagesController.getInstance(j0Var.f11276b).getUser(Long.valueOf(j0Var.f11277c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f11252a = Long.valueOf(j0Var.d.enqueue(request));
    }

    public final void a() {
        j0 j0Var = this.f11262n;
        j0Var.getClass();
        this.f11257i = true;
        Long l4 = this.f11252a;
        if (l4 != null) {
            j0Var.d.remove(l4.longValue());
            this.f11252a = null;
        }
        j0Var.e.remove(this);
        j0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f11256g), Long.valueOf(this.f11256g));
        }
        if (this.f11252a != null && !this.f11257i) {
            if (System.currentTimeMillis() - this.f11258j < 150) {
                return new Pair(Long.valueOf(this.f11255f), Long.valueOf(this.f11256g));
            }
            d();
            return new Pair(Long.valueOf(this.f11255f), Long.valueOf(this.f11256g));
        }
        return new Pair(Long.valueOf(this.f11255f), Long.valueOf(this.f11256g));
    }

    public final boolean c() {
        if (!this.h && this.f11252a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.d():void");
    }

    public i0(j0 j0Var, JSONObject jSONObject) {
        this.f11262n = j0Var;
        this.f11253b = jSONObject.optString("url");
        this.f11254c = jSONObject.optString("file_name");
        this.f11256g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
