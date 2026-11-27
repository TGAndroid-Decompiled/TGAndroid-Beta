package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class e4a extends FrameLayout implements cl7 {
    public final m09 a;
    public final g4a b;

    public e4a(g4a g4aVar, Context context) {
        super(context);
        this.b = g4aVar;
        this.a = new m09((byte) 3);
    }

    @Override
    public final void k(int i, View view) {
        this.a.b = 0;
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        g4a g4aVar = this.b;
        lcb lcbVar = g4aVar.r;
        if (g4aVar.y <= 0 && i4 != 0 && i2 == 0) {
            float f = lcbVar.f0;
            float f2 = i4 + f;
            if (f2 <= f) {
                f = f2;
            }
            g4aVar.setOffset(f);
            lcbVar.f0 = f;
            o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            acb acbVar = lcbVar.w;
            if (acbVar != null) {
                acbVar.invalidate();
            }
        }
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        if (this.b.y <= 0 && i == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        this.a.b = i;
    }

    @Override
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        g4a g4aVar = this.b;
        lcb lcbVar = g4aVar.r;
        if (g4aVar.y <= 0) {
            float f = lcbVar.f0;
            float f2 = g4aVar.c;
            if (f < f2 && i2 > 0) {
                float f3 = f + i2;
                iArr[1] = i2;
                if (f3 <= f2) {
                    f2 = f3;
                }
                g4aVar.setOffset(f2);
                lcbVar.f0 = f2;
                o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                acb acbVar = lcbVar.w;
                if (acbVar != null) {
                    acbVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
