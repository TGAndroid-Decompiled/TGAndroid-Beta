package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.TLRPC;
public class ApplicationLoaderImpl extends a {
    @Override
    public final boolean u(Activity activity, TLRPC.Document document) {
        boolean z = false;
        try {
            ba4.r(null, document);
            ba4.G(y6c.t0);
            File J = ba4.J(document, null, true, true);
            z = J.exists();
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    a.d();
                    intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", J), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(J), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        return z;
    }
}
