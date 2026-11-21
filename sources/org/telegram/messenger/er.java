package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class er implements Runnable {
    public final int f23783a;
    public final int f23784b;
    public final int f23785c;
    public final int d;
    public final int f23786e;
    public final Object f23787f;

    public er(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23783a = i13;
        this.f23787f = obj;
        this.f23784b = i7;
        this.f23785c = i10;
        this.d = i11;
        this.f23786e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23783a) {
            case 0:
                ((tr) this.f23787f).B1(this.f23784b, this.f23785c, this.d, this.f23786e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23787f, this.f23784b, this.f23785c, this.d, this.f23786e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23787f, this.f23784b, this.f23785c, this.d, this.f23786e);
                return;
        }
    }
}
