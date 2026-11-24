package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
public final class sb3 extends f8e {
    @Override
    public final Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
