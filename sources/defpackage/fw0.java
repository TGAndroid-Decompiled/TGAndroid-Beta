package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class fw0 extends r12 {
    public final byte d0;
    public final Object e0;

    public fw0(byte b, Context context, Object obj) {
        super(context);
        this.d0 = b;
        this.e0 = obj;
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw0.onMeasure(int, int):void");
    }

    @Override
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((ow0) this.e0).H) {
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
                ow0 ow0Var = (ow0) this.e0;
                yp0 yp0Var = ow0Var.o0;
                if (yp0Var != null) {
                    yp0Var.setTranslationY(gl.L(24.0f) + f);
                }
                FrameLayout frameLayout = ow0Var.r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = a.getCurrentActionBarHeight() - gl.L(24.0f);
                    int L = gl.L(70.0f) + ow0Var.n.top;
                    frameLayout.setTranslationY(ow0Var.x.getTranslationY() + gl.U1(ow0Var.h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }
}
