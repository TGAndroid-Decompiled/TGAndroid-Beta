package k7;

import a8.l8;
import a8.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.m;
import j7.r;
import kotlin.jvm.internal.j;
public final class f extends q implements a {
    public final int f18207b;
    public final TaskCompletionSource f18208c;

    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super(10);
        this.f18207b = i7;
        this.f18208c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void H0(Status status, m mVar) {
        switch (this.f18207b) {
            case 1:
                j.e(status, "status");
                l8.a(status, mVar, this.f18208c);
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
        switch (this.f18207b) {
            case 0:
                j.e(status, "status");
                l8.a(status, fVar, this.f18208c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
