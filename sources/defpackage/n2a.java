package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class n2a extends FrameLayout implements vk7 {
    public final az8 a;
    public final p2a b;

    public n2a(p2a p2aVar, Context context) {
        super(context);
        this.b = p2aVar;
        this.a = new az8((byte) 3);
    }

    @Override
    public final void k(int i, View view) {
        this.a.b = 0;
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        p2a p2aVar = this.b;
        oab oabVar = p2aVar.r;
        if (p2aVar.y <= 0 && i4 != 0 && i2 == 0) {
            float f = oabVar.f0;
            float f2 = i4 + f;
            if (f2 <= f) {
                f = f2;
            }
            p2aVar.setOffset(f);
            oabVar.f0 = f;
            a58 currentPeerView = oabVar.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            dab dabVar = oabVar.w;
            if (dabVar != null) {
                dabVar.invalidate();
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
        p2a p2aVar = this.b;
        oab oabVar = p2aVar.r;
        if (p2aVar.y <= 0) {
            float f = oabVar.f0;
            float f2 = p2aVar.c;
            if (f < f2 && i2 > 0) {
                float f3 = f + i2;
                iArr[1] = i2;
                if (f3 <= f2) {
                    f2 = f3;
                }
                p2aVar.setOffset(f2);
                oabVar.f0 = f2;
                a58 currentPeerView = oabVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                dab dabVar = oabVar.w;
                if (dabVar != null) {
                    dabVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
