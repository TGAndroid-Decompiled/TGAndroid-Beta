package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fra extends wgc {
    public final wsa W;

    public fra(wsa wsaVar, Context context) {
        super(context, null);
        this.W = wsaVar;
    }

    @Override
    public final void F(View view, float f) {
        View view2;
        ix4 ix4Var;
        ix4 ix4Var2;
        hra hraVar;
        hra hraVar2;
        hra hraVar3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f);
            return;
        }
        float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
        wsa wsaVar = this.W;
        view.setTranslationX(((-i) * 2.0f * wsaVar.u0) + f);
        float f2 = 0.0f;
        if (i <= 0.0f) {
            f2 = view.getMeasuredWidth();
        }
        view.setPivotX(f2);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i));
        view.setRotationY(i * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                ix4Var = wsaVar.X1;
                if (ix4Var != null && view2 == ix4Var.T1 && (hraVar3 = ix4Var.Z1) != null) {
                    hraVar3.invalidate();
                }
                if (view2 == wsaVar.T1 && (hraVar2 = wsaVar.Z1) != null) {
                    hraVar2.invalidate();
                }
                ix4Var2 = wsaVar.Y1;
                if (ix4Var2 == null && view2 == ix4Var2.T1 && (hraVar = ix4Var2.Z1) != null) {
                    hraVar.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        ix4Var = wsaVar.X1;
        if (ix4Var != null) {
            hraVar3.invalidate();
        }
        if (view2 == wsaVar.T1) {
            hraVar2.invalidate();
        }
        ix4Var2 = wsaVar.Y1;
        if (ix4Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i = this.b;
        wsa wsaVar = this.W;
        boolean z = false;
        if (i != wsaVar.B1(false)) {
            if (this.b > wsaVar.B1(false)) {
                z = true;
            }
            gm.c3(new n28((byte) 19, this, z));
        }
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        xra xraVar = this.W.W2;
        if (xraVar != null && !xraVar.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        wsa wsaVar = this.W;
        canvas.clipRect(wsaVar.u0, -getHeight(), getWidth() - wsaVar.u0, getHeight() << 1);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 << 1));
    }
}
