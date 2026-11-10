package db;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
public final class p extends q6.h {
    @Override
    public final void b(String prefix, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        kotlin.jvm.internal.j.e(prefix, "prefix");
        if (fileDescriptor != null && strArr != null) {
            super.b(prefix, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final void g(q6.i iVar, Set set) {
        if (set != null) {
            super.g(iVar, set);
        }
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        kotlin.jvm.internal.j.e(iBinder, "iBinder");
        int i7 = s.f8597b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        if (queryLocalInterface instanceof t) {
            return (t) queryLocalInterface;
        }
        return new r(iBinder);
    }

    @Override
    public final n6.c[] k() {
        return j.f8588b;
    }

    @Override
    public final String o() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.firebase.fpnv.service.START";
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
