package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class nx0 extends d32 {
    public final byte d0;
    public final Object e0;

    public nx0(byte b, Context context, Object obj) {
        super(context);
        this.d0 = b;
        this.e0 = obj;
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx0.onMeasure(int, int):void");
    }

    @Override
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((wx0) this.e0).H) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.d0) {
            case 0:
                super.setTranslationY(f);
                wx0 wx0Var = (wx0) this.e0;
                yq0 yq0Var = wx0Var.o0;
                if (yq0Var != null) {
                    yq0Var.setTranslationY(gm.L(24.0f) + f);
                }
                FrameLayout frameLayout = wx0Var.r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = a.getCurrentActionBarHeight() - gm.L(24.0f);
                    int L = gm.L(70.0f) + wx0Var.n.top;
                    frameLayout.setTranslationY(wx0Var.x.getTranslationY() + gm.U1(wx0Var.h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }
}
