package i2;

import g2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public abstract class c implements h {
    private n dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<d0> listeners = new ArrayList<>(1);

    public c(boolean z10) {
        this.isNetwork = z10;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        if (!this.listeners.contains(d0Var)) {
            this.listeners.add(d0Var);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int i3) {
        n nVar = this.dataSpec;
        String str = n0.f11873a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            boolean z10 = this.isNetwork;
            a3.g gVar = (a3.g) this.listeners.get(i10);
            synchronized (gVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.f82i += i3;
                }
            }
        }
    }

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        n nVar = this.dataSpec;
        String str = n0.f11873a;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            ((a3.g) this.listeners.get(i3)).f(nVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(n nVar) {
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).getClass();
        }
    }

    public final void transferStarted(n nVar) {
        this.dataSpec = nVar;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            ((a3.g) this.listeners.get(i3)).g(nVar, this.isNetwork);
        }
    }
}
