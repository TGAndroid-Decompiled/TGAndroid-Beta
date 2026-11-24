package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class l0a extends FrameLayout implements ti7 {
    public final zw8 a;
    public final n0a b;

    public l0a(n0a n0aVar, Context context) {
        super(context);
        this.b = n0aVar;
        this.a = new zw8((byte) 3);
    }

    @Override
    public final void k(int i, View view) {
        this.a.b = 0;
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n0a n0aVar = this.b;
        m8b m8bVar = n0aVar.r;
        if (n0aVar.y <= 0 && i4 != 0 && i2 == 0) {
            float f = m8bVar.f0;
            float f2 = i4 + f;
            if (f2 <= f) {
                f = f2;
            }
            n0aVar.setOffset(f);
            m8bVar.f0 = f;
            y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            b8b b8bVar = m8bVar.w;
            if (b8bVar != null) {
                b8bVar.invalidate();
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
        n0a n0aVar = this.b;
        m8b m8bVar = n0aVar.r;
        if (n0aVar.y <= 0) {
            float f = m8bVar.f0;
            float f2 = n0aVar.c;
            if (f < f2 && i2 > 0) {
                float f3 = f + i2;
                iArr[1] = i2;
                if (f3 <= f2) {
                    f2 = f3;
                }
                n0aVar.setOffset(f2);
                m8bVar.f0 = f2;
                y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                b8b b8bVar = m8bVar.w;
                if (b8bVar != null) {
                    b8bVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
