package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
public final class k0d extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = t0d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        if (queryLocalInterface instanceof v0d) {
            return (v0d) queryLocalInterface;
        }
        return new r0d(iBinder);
    }

    @Override
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor != null && strArr != null) {
            super.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final f84[] f() {
        return sdd.b;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final void j(ug5 ug5Var, Set set) {
        if (set != null) {
            super.j(ug5Var, set);
        }
    }

    @Override
    public final String l() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.firebase.fpnv.service.START";
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
