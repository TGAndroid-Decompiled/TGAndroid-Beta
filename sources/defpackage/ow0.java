package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class ow0 extends i22 {
    public final byte d0;
    public final Object e0;

    public ow0(byte b, Context context, Object obj) {
        super(context);
        this.d0 = b;
        this.e0 = obj;
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.onMeasure(int, int):void");
    }

    @Override
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((xw0) this.e0).H) {
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
                xw0 xw0Var = (xw0) this.e0;
                yp0 yp0Var = xw0Var.o0;
                if (yp0Var != null) {
                    yp0Var.setTranslationY(hl.L(24.0f) + f);
                }
                FrameLayout frameLayout = xw0Var.r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = a.getCurrentActionBarHeight() - hl.L(24.0f);
                    int L = hl.L(70.0f) + xw0Var.n.top;
                    frameLayout.setTranslationY(xw0Var.x.getTranslationY() + hl.U1(xw0Var.h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }
}
