package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class fr implements Runnable {
    public final int f23964a;
    public final int f23965b;
    public final int f23966c;
    public final int d;
    public final int f23967e;
    public final Object f23968f;

    public fr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23964a = i13;
        this.f23968f = obj;
        this.f23965b = i7;
        this.f23966c = i10;
        this.d = i11;
        this.f23967e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23964a) {
            case 0:
                ((ur) this.f23968f).B1(this.f23965b, this.f23966c, this.d, this.f23967e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23968f, this.f23965b, this.f23966c, this.d, this.f23967e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23968f, this.f23965b, this.f23966c, this.d, this.f23967e);
                return;
        }
    }
}
