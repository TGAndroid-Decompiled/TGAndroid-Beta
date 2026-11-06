package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.TLRPC;
public class ApplicationLoaderImpl extends t0 {
    @Override
    public final boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !t0.f25563b.getPackageManager().canRequestPackageInstalls()) {
            org.telegram.ui.Components.v4.j(context, null).show();
            return false;
        }
        return true;
    }

    @Override
    public final File g() {
        if (q()) {
            h1 e10 = h1.e();
            if (e10.d != null) {
                File file = new File(e10.d);
                if (!file.exists()) {
                    e10.d = null;
                    e10.f();
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    @Override
    public final boolean q() {
        return !TextUtils.isEmpty("null");
    }

    @Override
    public final boolean v(Activity activity, TLRPC.Document document) {
        boolean z9 = false;
        try {
            w7.r(null, document);
            w7.G(p10.f24467s0);
            File J = w7.J(document, null, true, true);
            z9 = J.exists();
            if (z9) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    t0.d();
                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", J), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(J), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        return z9;
    }
}
