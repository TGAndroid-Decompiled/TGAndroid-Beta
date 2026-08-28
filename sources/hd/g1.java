package hd;

import java.util.concurrent.CancellationException;
public interface g1 extends qc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    ed.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(zc.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, zc.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(qc.c cVar);

    boolean start();
}
