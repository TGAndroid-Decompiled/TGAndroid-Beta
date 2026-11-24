package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
public final class m2d extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = v2d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        if (queryLocalInterface instanceof x2d) {
            return (x2d) queryLocalInterface;
        }
        return new t2d(iBinder);
    }

    @Override
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor != null && strArr != null) {
            super.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final o94[] f() {
        return ufd.b;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final void j(ti5 ti5Var, Set set) {
        if (set != null) {
            super.j(ti5Var, set);
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
