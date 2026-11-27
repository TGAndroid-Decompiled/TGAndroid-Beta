package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
public final class di4 {
    public final Context a;

    public final PackageInfo a(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}
