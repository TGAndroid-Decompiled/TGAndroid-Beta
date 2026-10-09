package ae;

import java.util.concurrent.CancellationException;
public interface h1 extends jd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    xd.b getChildren();

    h1 getParent();

    q0 invokeOnCompletion(sd.l lVar);

    q0 invokeOnCompletion(boolean z10, boolean z11, sd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(jd.c cVar);

    boolean start();
}
