package id;

import java.util.concurrent.CancellationException;

public interface g1 extends rc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    fd.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(ad.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, ad.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(rc.c cVar);

    boolean start();
}
