package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public abstract class qg0 implements a83 {
    private g83 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<w0c> listeners = new ArrayList<>(1);

    public qg0(boolean z) {
        this.isNetwork = z;
    }

    @Override
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        if (!this.listeners.contains(w0cVar)) {
            this.listeners.add(w0cVar);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg0.bytesTransferred(int):void");
    }

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        g83 g83Var = this.dataSpec;
        String str = hac.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((eb3) this.listeners.get(i)).g(g83Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g83 g83Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(g83 g83Var) {
        this.dataSpec = g83Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((eb3) this.listeners.get(i)).h(g83Var, this.isNetwork);
        }
    }
}
