package i7;

import a8.aa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.l;
import h7.q;
import kotlin.jvm.internal.i;
public final class f extends c8.b implements a {
    public final int f13881b;
    public final TaskCompletionSource f13882c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.f13881b = i10;
        this.f13882c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void D(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void D0(Status status, h7.e eVar) {
        switch (this.f13881b) {
            case 0:
                i.e(status, "status");
                aa.a(status, eVar, this.f13882c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void d0(Status status, h7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void s0(Status status, l lVar) {
        switch (this.f13881b) {
            case 1:
                i.e(status, "status");
                aa.a(status, lVar, this.f13882c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
