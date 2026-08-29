package jd;

import java.util.concurrent.CancellationException;
public interface f1 extends sc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    gd.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(bd.l lVar);

    o0 invokeOnCompletion(boolean z10, boolean z11, bd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(sc.c cVar);

    boolean start();
}
