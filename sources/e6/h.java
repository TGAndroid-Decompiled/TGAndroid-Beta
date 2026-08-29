package e6;

import android.os.IBinder;
import android.os.IInterface;
public final class h extends z5.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 10);
    }

    @Override
    public final w5.c[] r() {
        return w6.b.d;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
