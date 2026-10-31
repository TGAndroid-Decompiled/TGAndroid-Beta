package h7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.l;
import g7.q;
import kotlin.jvm.internal.i;
import v7.i5;
public final class f extends b8.b implements a {
    public final int f7633b;
    public final TaskCompletionSource f7634c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.f7633b = i10;
        this.f7634c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void F0(Status status, l lVar) {
        switch (this.f7633b) {
            case 1:
                i.e(status, "status");
                i5.a(status, lVar, this.f7634c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void c0(Status status, g7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void q0(Status status, g7.e eVar) {
        switch (this.f7633b) {
            case 0:
                i.e(status, "status");
                i5.a(status, eVar, this.f7634c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void s(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
