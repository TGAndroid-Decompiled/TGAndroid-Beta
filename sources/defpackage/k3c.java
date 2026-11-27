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
public final class k3c extends FrameLayout implements snb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final r3c d;

    public k3c(r3c r3cVar, Context context) {
        super(context);
        this.d = r3cVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(aob.v0(aob.h5, r3cVar.J0));
        aob.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v;
        r3c r3cVar = this.d;
        boolean z2 = true;
        float G0 = r3cVar.G0(true);
        float U1 = hl.U1(ete.a(G0 / hl.N(24.0f), 0.0f, 1.0f), 0, hl.L(12.0f));
        r3cVar.w1.setTranslationY(Math.max(hl.m, G0));
        if (G0 <= hl.m / 2.0f) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            Window window = r3cVar.getWindow();
            if (z) {
                v = aob.v0(aob.h5, r3cVar.J0);
            } else {
                v = aob.v(aob.v0(aob.s8, r3cVar.J0), 855638016);
            }
            if (hl.B(v) <= 0.721f) {
                z2 = false;
            }
            hl.n3(window, z2);
        }
        FrameLayout frameLayout = r3cVar.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - r3cVar.F.getHeight());
        int i = hl.m;
        frameLayout.setTranslationY(Math.max(r3cVar.F.getHeight() + hl.L(56.0f) + i, G0) + translationY);
        Path path = this.a;
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, G0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r3c r3cVar = this.d;
        lmb lmbVar = r3cVar.J1;
        amb ambVar = r3cVar.I1;
        if (ambVar != null && lmbVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + ambVar.w());
            }
            if (ambVar.w() && lmbVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = lmbVar.b(motionEvent);
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
        setTag(2131296353, new py((byte) 16));
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
        r3c r3cVar = this.d;
        FrameLayout frameLayout = r3cVar.F;
        frameLayout.setTranslationY(Math.max(r3cVar.F.getHeight() + hl.L(56.0f) + hl.m, r3cVar.G0(true)) + ((-frameLayout.getTop()) - r3cVar.F.getHeight()) + f);
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(aob.v0(aob.h5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
