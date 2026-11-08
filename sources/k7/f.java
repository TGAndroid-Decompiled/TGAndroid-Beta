package k7;

import a8.k8;
import a8.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.m;
import j7.r;
import kotlin.jvm.internal.j;
public final class f extends q implements a {
    public final int f17227b;
    public final TaskCompletionSource f17228c;

    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super(10);
        this.f17227b = i7;
        this.f17228c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void H0(Status status, m mVar) {
        switch (this.f17227b) {
            case 1:
                j.e(status, "status");
                k8.a(status, mVar, this.f17228c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void I0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void a1(Status status, j7.c cVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void w0(Status status, j7.f fVar) {
        switch (this.f17227b) {
            case 0:
                j.e(status, "status");
                k8.a(status, fVar, this.f17228c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
