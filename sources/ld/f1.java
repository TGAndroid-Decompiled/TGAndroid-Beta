package ld;

import java.util.concurrent.CancellationException;
public interface f1 extends uc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    id.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(dd.l lVar);

    o0 invokeOnCompletion(boolean z4, boolean z10, dd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(uc.c cVar);

    boolean start();
}
