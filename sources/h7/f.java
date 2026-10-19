package h7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.l;
import g7.q;
import kotlin.jvm.internal.i;
import v7.h5;
public final class f extends b8.b implements a {
    public final int f11682b;
    public final TaskCompletionSource f11683c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.f11682b = i10;
        this.f11683c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void D0(Status status, l lVar) {
        switch (this.f11682b) {
            case 1:
                i.e(status, "status");
                h5.a(status, lVar, this.f11683c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void b0(Status status, g7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void o0(Status status, g7.e eVar) {
        switch (this.f11682b) {
            case 0:
                i.e(status, "status");
                h5.a(status, eVar, this.f11683c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void r(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
