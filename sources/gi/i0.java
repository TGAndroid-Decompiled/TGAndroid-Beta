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
    public Long f11253a;
    public final String f11254b;
    public final String f11255c;
    public File d;
    public final String e;
    public long f11256f;
    public long f11257g;
    public boolean h;
    public boolean f11258i;
    public long f11259j;
    public boolean f11260k;
    public boolean f11261l;
    public final Runnable f11262m = new bc(this, 4);
    public final j0 f11263n;

    public i0(j0 j0Var, String str, String str2) {
        this.f11263n = j0Var;
        this.f11254b = str;
        this.f11255c = str2;
        TLRPC.User user = MessagesController.getInstance(j0Var.f11277b).getUser(Long.valueOf(j0Var.f11278c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.p("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f11253a = Long.valueOf(j0Var.d.enqueue(request));
    }

    public final void a() {
        j0 j0Var = this.f11263n;
        j0Var.getClass();
        this.f11258i = true;
        Long l4 = this.f11253a;
        if (l4 != null) {
            j0Var.d.remove(l4.longValue());
            this.f11253a = null;
        }
        j0Var.e.remove(this);
        j0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f11257g), Long.valueOf(this.f11257g));
        }
        if (this.f11253a != null && !this.f11258i) {
            if (System.currentTimeMillis() - this.f11259j < 150) {
                return new Pair(Long.valueOf(this.f11256f), Long.valueOf(this.f11257g));
            }
            d();
            return new Pair(Long.valueOf(this.f11256f), Long.valueOf(this.f11257g));
        }
        return new Pair(Long.valueOf(this.f11256f), Long.valueOf(this.f11257g));
    }

    public final boolean c() {
        if (!this.h && this.f11253a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.d():void");
    }

    public i0(j0 j0Var, JSONObject jSONObject) {
        this.f11263n = j0Var;
        this.f11254b = jSONObject.optString("url");
        this.f11255c = jSONObject.optString("file_name");
        this.f11257g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
