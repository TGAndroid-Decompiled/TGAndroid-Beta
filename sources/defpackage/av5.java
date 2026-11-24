package defpackage;

import java.util.concurrent.CancellationException;
public interface av5 extends ay2 {
    th2 attachChild(wh2 wh2Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    p6a getChildren();

    xp3 invokeOnCompletion(rr4 rr4Var);

    xp3 invokeOnCompletion(boolean z, boolean z2, rr4 rr4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(px2 px2Var);

    boolean start();
}
