package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
public final class ga3 extends c6e {
    @Override
    public final Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
