package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.tv;
import org.telegram.ui.e70;
import org.telegram.ui.mi1;
import org.telegram.ui.nd;
import org.telegram.ui.ni1;
import org.telegram.ui.po;
import org.telegram.ui.ze0;
public final class y3 extends org.telegram.ui.Components.p9 {
    public final int D;
    public final Object E;

    public y3(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.D) {
            case 11:
                return new y2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.D) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.D) {
            case 0:
                if (this.f27785a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((z3) this.E).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 1:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.E;
                y3 y3Var = i7Var.f21216b;
                float f10 = 1.0f;
                if (y3Var.getImageReceiver().hasBitmapImage()) {
                    f10 = 1.0f - y3Var.getImageReceiver().getCurrentAlpha();
                }
                i7Var.d.setAlpha(f10);
                i7Var.f21215a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 2:
                va vaVar = (va) this.E;
                org.telegram.ui.Cells.l6 l6Var = vaVar.Q;
                if (vaVar.C) {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    m7.h(vaVar.R, canvas, this.f27785a, l6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                ya yaVar = (ya) this.E;
                Object obj = yaVar.h;
                if (!(obj instanceof mi1) && !(obj instanceof ni1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, yaVar.f22637n.f22710n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), yaVar.f22637n.f22710n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), yaVar.f22637n.f22710n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, yaVar.f22637n.f22710n);
                }
                if (yaVar.e) {
                    yaVar.f22637n.f22711r.setColor(org.telegram.ui.ActionBar.j6.f19883c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), yaVar.f22637n.f22711r);
                    Drawable drawable = yaVar.f22637n.v;
                    drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, yaVar.f22637n.v), org.telegram.ui.b.A(2, measuredWidth, yaVar.f22637n.v), org.telegram.ui.b.y(2, measuredHeight, yaVar.f22637n.v));
                    yaVar.f22637n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.a1) this.E).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f27785a.getDrawable();
                if (drawable2 != null) {
                    this.f27785a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f27785a.draw(canvas);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.D) {
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.D) {
            case 2:
                if (((va) this.E).Q.a(motionEvent, this)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.D) {
            case 11:
                if (drawable != ((uf.u0) this.E).f45450r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y3(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.D = 10;
        this.E = a1Var;
        this.f27785a = new y2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.D) {
            case 4:
                eg.i0 i0Var = ((nd) this.E).f36584f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                eg.i0 i0Var2 = ((po) this.E).f37388f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                return;
            case 7:
                if (mg.g0.b(this)) {
                    return;
                }
                super.invalidate();
                ((tv) this.E).f();
                return;
            case 8:
                eg.i0 i0Var3 = ((e70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                eg.i0 i0Var4 = ((ze0) this.E).h;
                if (i0Var4 != null) {
                    i0Var4.invalidate();
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.D) {
            case 4:
                eg.i0 i0Var = ((nd) this.E).f36584f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                eg.i0 i0Var2 = ((po) this.E).f37388f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                return;
            case 7:
                if (mg.g0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 8:
                eg.i0 i0Var3 = ((e70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                eg.i0 i0Var4 = ((ze0) this.E).h;
                if (i0Var4 != null) {
                    i0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
