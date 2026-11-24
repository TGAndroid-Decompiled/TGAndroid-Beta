package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public abstract class qf0 implements o63 {
    private u63 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<vyb> listeners = new ArrayList<>(1);

    public qf0(boolean z) {
        this.isNetwork = z;
    }

    @Override
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        if (!this.listeners.contains(vybVar)) {
            this.listeners.add(vybVar);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf0.bytesTransferred(int):void");
    }

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        u63 u63Var = this.dataSpec;
        String str = g8c.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((s93) this.listeners.get(i)).g(u63Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(u63 u63Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(u63 u63Var) {
        this.dataSpec = u63Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((s93) this.listeners.get(i)).h(u63Var, this.isNetwork);
        }
    }
}
