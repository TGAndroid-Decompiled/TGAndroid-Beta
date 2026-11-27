package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
public final class za3 extends sae {
    @Override
    public final Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
