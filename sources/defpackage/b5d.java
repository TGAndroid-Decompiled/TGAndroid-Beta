package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
public final class b5d extends d05 {
    @Override
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = k5d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        if (queryLocalInterface instanceof m5d) {
            return (m5d) queryLocalInterface;
        }
        return new i5d(iBinder);
    }

    @Override
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor != null && strArr != null) {
            super.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final a94[] f() {
        return kid.b;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final void j(wi5 wi5Var, Set set) {
        if (set != null) {
            super.j(wi5Var, set);
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
