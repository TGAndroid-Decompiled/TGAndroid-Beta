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
public class ApplicationLoaderImpl extends w0 {
    @Override
    public final boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !w0.f18945b.getPackageManager().canRequestPackageInstalls()) {
            org.telegram.ui.Components.s4.j(context, null).show();
            return false;
        }
        return true;
    }

    @Override
    public final File g() {
        if (q()) {
            k1 e = k1.e();
            if (e.d != null) {
                File file = new File(e.d);
                if (!file.exists()) {
                    e.d = null;
                    e.f();
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
        boolean z10 = false;
        try {
            b8.r(null, document);
            b8.G(e20.f15506s0);
            File K = b8.K(document, null, true, true);
            z10 = K.exists();
            if (z10) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    w0.d();
                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", K), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(K), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        return z10;
    }
}
