package defpackage;

import java.util.concurrent.CancellationException;
public interface ev5 extends kx2 {
    xg2 attachChild(ah2 ah2Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    f8a getChildren();

    ep3 invokeOnCompletion(ur4 ur4Var);

    ep3 invokeOnCompletion(boolean z, boolean z2, ur4 ur4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(zw2 zw2Var);

    boolean start();
}
