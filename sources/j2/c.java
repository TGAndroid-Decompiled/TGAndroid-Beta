package j2;

import h2.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public abstract class c implements h {
    private m dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<c0> listeners = new ArrayList<>(1);

    public c(boolean z10) {
        this.isNetwork = z10;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        if (!this.listeners.contains(c0Var)) {
            this.listeners.add(c0Var);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int i7) {
        m mVar = this.dataSpec;
        String str = l0.f13783a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            boolean z10 = this.isNetwork;
            b3.g gVar = (b3.g) this.listeners.get(i10);
            synchronized (gVar) {
                if (z10) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.f2889i += i7;
                }
            }
        }
    }

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        m mVar = this.dataSpec;
        String str = l0.f13783a;
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            ((b3.g) this.listeners.get(i7)).f(mVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(m mVar) {
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            this.listeners.get(i7).getClass();
        }
    }

    public final void transferStarted(m mVar) {
        this.dataSpec = mVar;
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            ((b3.g) this.listeners.get(i7)).g(mVar, this.isNetwork);
        }
    }
}
