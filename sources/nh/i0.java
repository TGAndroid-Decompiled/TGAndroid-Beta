package nh;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class i0 {

    public Long f18737a;

    public final String f18738b;

    public final String f18739c;
    public File d;

    public final String f18740e;

    public long f18741f;

    public long f18742g;
    public boolean h;

    public boolean f18743i;

    public long f18744j;

    public boolean f18745k;

    public boolean f18746l;

    public final Runnable f18747m = new f0(this, 1);

    public final j0 f18748n;

    public i0(j0 j0Var, String str, String str2) {
        this.f18748n = j0Var;
        this.f18738b = str;
        this.f18739c = str2;
        TLRPC.User user = MessagesController.getInstance(j0Var.f18769b).getUser(Long.valueOf(j0Var.f18770c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a9.p.m("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f18737a = Long.valueOf(j0Var.d.enqueue(request));
    }

    public final void a() {
        j0 j0Var = this.f18748n;
        j0Var.getClass();
        this.f18743i = true;
        Long l10 = this.f18737a;
        if (l10 != null) {
            j0Var.d.remove(l10.longValue());
            this.f18737a = null;
        }
        j0Var.f18771e.remove(this);
        j0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f18742g), Long.valueOf(this.f18742g));
        }
        if (this.f18737a == null || this.f18743i) {
            return new Pair(Long.valueOf(this.f18741f), Long.valueOf(this.f18742g));
        }
        if (System.currentTimeMillis() - this.f18744j < 150) {
            return new Pair(Long.valueOf(this.f18741f), Long.valueOf(this.f18742g));
        }
        d();
        return new Pair(Long.valueOf(this.f18741f), Long.valueOf(this.f18742g));
    }

    public final boolean c() {
        return (this.h || this.f18737a == null) ? false : true;
    }

    public final void d() {
        j0 j0Var = this.f18748n;
        if (this.h || this.f18743i) {
            return;
        }
        Runnable runnable = this.f18747m;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        this.f18744j = System.currentTimeMillis();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.f18737a.longValue());
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = j0Var.d.query(query);
                if (cursorQuery.moveToFirst()) {
                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    if (i10 == 8) {
                        File file = new File(Uri.parse(cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"))).getPath());
                        this.d = file;
                        this.h = true;
                        long length = file.length();
                        this.f18742g = length;
                        if (length <= 0) {
                            a();
                        }
                        j0Var.f();
                    } else if (i10 == 16) {
                        a();
                        cursorQuery.close();
                        return;
                    } else {
                        this.f18741f = cursorQuery.getLong(cursorQuery.getColumnIndex("bytes_so_far"));
                        this.f18742g = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                        AndroidUtilities.runOnUIThread(runnable, 160L);
                    }
                } else if (!this.h) {
                    a();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                if (0 != 0) {
                }
                j0Var.e();
            }
            cursorQuery.close();
            j0Var.e();
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public i0(j0 j0Var, JSONObject jSONObject) {
        this.f18748n = j0Var;
        this.f18738b = jSONObject.optString("url");
        this.f18739c = jSONObject.optString("file_name");
        this.f18742g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f18740e = jSONObject.optString("mime");
        String strOptString = jSONObject.optString("path");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.d = new File(strOptString);
    }
}
