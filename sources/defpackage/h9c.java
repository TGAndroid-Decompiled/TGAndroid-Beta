package defpackage;

import org.telegram.messenger.ImageReceiver;
public final class h9c extends ImageReceiver {
    public final i9c K1;

    public h9c(i9c i9cVar) {
        super(null);
        this.K1 = i9cVar;
    }

    @Override
    public final void invalidate() {
        this.K1.invalidate();
    }
}
