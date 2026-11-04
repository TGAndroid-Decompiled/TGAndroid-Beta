package j7;

import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;
import i7.l;
import i7.r;
import kotlin.jvm.internal.j;
public final class f extends o implements a {
    public final int f16209b;
    public final TaskCompletionSource f16210c;

    public f(int i3, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.f16209b = i3;
        this.f16210c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void c0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void t(Status status, l lVar) {
        switch (this.f16209b) {
            case 1:
                j.e(status, "status");
                y9.a(status, lVar, this.f16210c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void t0(Status status, i7.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void y(Status status, i7.e eVar) {
        switch (this.f16209b) {
            case 0:
                j.e(status, "status");
                y9.a(status, eVar, this.f16210c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
