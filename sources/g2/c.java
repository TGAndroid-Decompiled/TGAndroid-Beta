package g2;

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

    public final void bytesTransferred(int i10) {
        m mVar = this.dataSpec;
        String str = e2.d0.f8737a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            boolean z10 = this.isNetwork;
            y2.f fVar = (y2.f) this.listeners.get(i11);
            synchronized (fVar) {
                if (z10) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.f49498i += i10;
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
        String str = e2.d0.f8737a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).e(mVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(m mVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(m mVar) {
        this.dataSpec = mVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).f(mVar, this.isNetwork);
        }
    }
}
