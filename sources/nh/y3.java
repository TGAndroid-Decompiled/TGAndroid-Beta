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
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.sv;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.pd;
import org.telegram.ui.ro;
import org.telegram.ui.ui1;
import org.telegram.ui.vi1;
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
                if (this.f27801a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((z3) this.E).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 1:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.E;
                y3 y3Var = h7Var.f21149b;
                float f10 = 1.0f;
                if (y3Var.getImageReceiver().hasBitmapImage()) {
                    f10 = 1.0f - y3Var.getImageReceiver().getCurrentAlpha();
                }
                h7Var.d.setAlpha(f10);
                h7Var.f21148a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 2:
                ua uaVar = (ua) this.E;
                org.telegram.ui.Cells.k6 k6Var = uaVar.Q;
                if (uaVar.C) {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    m7.h(uaVar.R, canvas, this.f27801a, k6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                xa xaVar = (xa) this.E;
                Object obj = xaVar.h;
                if (!(obj instanceof ui1) && !(obj instanceof vi1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, xaVar.f22567n.f22646n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), xaVar.f22567n.f22646n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), xaVar.f22567n.f22646n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, xaVar.f22567n.f22646n);
                }
                if (xaVar.e) {
                    xaVar.f22567n.f22647r.setColor(org.telegram.ui.ActionBar.j6.f19858c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), xaVar.f22567n.f22647r);
                    Drawable drawable = xaVar.f22567n.v;
                    drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, xaVar.f22567n.v), org.telegram.ui.b.A(2, measuredWidth, xaVar.f22567n.v), org.telegram.ui.b.y(2, measuredHeight, xaVar.f22567n.v));
                    xaVar.f22567n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.c1) this.E).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f27801a.getDrawable();
                if (drawable2 != null) {
                    this.f27801a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f27801a.draw(canvas);
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
                if (((ua) this.E).Q.a(motionEvent, this)) {
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
                if (drawable != ((uf.v0) this.E).f45528r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y3(org.telegram.ui.web.c1 c1Var, Context context) {
        super(context);
        this.D = 10;
        this.E = c1Var;
        this.f27801a = new y2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.D) {
            case 4:
                eg.i0 i0Var = ((pd) this.E).f37083f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                eg.i0 i0Var2 = ((ro) this.E).f37908f;
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
                ((sv) this.E).f();
                return;
            case 8:
                eg.i0 i0Var3 = ((g70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                eg.i0 i0Var4 = ((bf0) this.E).h;
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
                eg.i0 i0Var = ((pd) this.E).f37083f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                eg.i0 i0Var2 = ((ro) this.E).f37908f;
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
                eg.i0 i0Var3 = ((g70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                eg.i0 i0Var4 = ((bf0) this.E).h;
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
