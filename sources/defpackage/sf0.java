package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public abstract class sf0 implements h73 {
    private n73 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<v2c> listeners = new ArrayList<>(1);

    public sf0(boolean z) {
        this.isNetwork = z;
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        if (!this.listeners.contains(v2cVar)) {
            this.listeners.add(v2cVar);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf0.bytesTransferred(int):void");
    }

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        n73 n73Var = this.dataSpec;
        String str = gcc.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((la3) this.listeners.get(i)).g(n73Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(n73 n73Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(n73 n73Var) {
        this.dataSpec = n73Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((la3) this.listeners.get(i)).h(n73Var, this.isNetwork);
        }
    }
}
