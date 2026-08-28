package g6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import g7.g7;
import hd.m;
import kotlin.jvm.internal.i;
import m5.c0;
import org.telegram.ui.gb0;
import v0.e;
import v0.g;
import v0.h;
import v0.j;
public final class b implements h {
    public final Context f7118a;

    public b(Context context, int i9) {
        switch (i9) {
            case 1:
                i.e(context, "context");
                this.f7118a = context;
                return;
            default:
                this.f7118a = context;
                return;
        }
    }

    public Object a(Context context, e eVar, qc.c cVar) {
        m mVar = new m(1, g7.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        c0 c0Var = new c0(mVar, 27);
        gb0 gb0Var = new gb0(1);
        i.e(context, "context");
        j b10 = u5.h.b(new u5.h(this.f7118a, 3), eVar);
        if (b10 == null) {
            c0Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            c0Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, gb0Var, c0Var);
        }
        Object r10 = mVar.r();
        rc.a aVar = rc.a.f47127a;
        return r10;
    }

    public PackageInfo b(int i9, String str) {
        return this.f7118a.getPackageManager().getPackageInfo(str, i9);
    }
}
