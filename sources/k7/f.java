package k7;

import a8.k8;
import a8.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.m;
import j7.r;
import kotlin.jvm.internal.j;
public final class f extends q implements a {
    public final int f17224b;
    public final TaskCompletionSource f17225c;

    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super(10);
        this.f17224b = i7;
        this.f17225c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void D0(Status status, j7.c cVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void f0(Status status, j7.f fVar) {
        switch (this.f17224b) {
            case 0:
                j.e(status, "status");
                k8.a(status, fVar, this.f17225c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void p0(Status status, m mVar) {
        switch (this.f17224b) {
            case 1:
                j.e(status, "status");
                k8.a(status, mVar, this.f17225c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void q0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
