package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class e8d extends d05 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof h7d) {
            return (h7d) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", (byte) 1);
    }

    @Override
    public final a94[] f() {
        return nid.b;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
