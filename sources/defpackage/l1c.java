package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class l1c extends FrameLayout implements vlb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final s1c d;

    public l1c(s1c s1cVar, Context context) {
        super(context);
        this.d = s1cVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(cmb.v0(cmb.g5, s1cVar.J0));
        cmb.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v;
        s1c s1cVar = this.d;
        boolean z2 = true;
        float F0 = s1cVar.F0(true);
        float U1 = gm.U1(pqe.a(F0 / gm.N(24.0f), 0.0f, 1.0f), 0, gm.L(12.0f));
        s1cVar.w1.setTranslationY(Math.max(gm.m, F0));
        if (F0 <= gm.m / 2.0f) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            Window window = s1cVar.getWindow();
            if (z) {
                v = cmb.v0(cmb.g5, s1cVar.J0);
            } else {
                v = cmb.v(cmb.v0(cmb.r8, s1cVar.J0), 855638016);
            }
            if (gm.B(v) <= 0.721f) {
                z2 = false;
            }
            gm.n3(window, z2);
        }
        FrameLayout frameLayout = s1cVar.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - s1cVar.F.getHeight());
        int i = gm.m;
        frameLayout.setTranslationY(Math.max(s1cVar.F.getHeight() + gm.L(56.0f) + i, F0) + translationY);
        Path path = this.a;
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, F0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s1c s1cVar = this.d;
        rkb rkbVar = s1cVar.J1;
        gkb gkbVar = s1cVar.I1;
        if (gkbVar != null && rkbVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + gkbVar.w());
            }
            if (gkbVar.w() && rkbVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = rkbVar.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b);
            }
            if (b) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oz((byte) 16));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        s1c s1cVar = this.d;
        FrameLayout frameLayout = s1cVar.F;
        frameLayout.setTranslationY(Math.max(s1cVar.F.getHeight() + gm.L(56.0f) + gm.m, s1cVar.F0(true)) + ((-frameLayout.getTop()) - s1cVar.F.getHeight()) + f);
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(cmb.v0(cmb.g5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
