package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.t9;
import org.telegram.ui.ai1;
import org.telegram.ui.hd;
import org.telegram.ui.ko;
import org.telegram.ui.pe0;
import org.telegram.ui.t60;
import org.telegram.ui.zh1;
public final class y3 extends t9 {
    public final int C;
    public final Object D;

    public y3(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new x2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.C) {
            case 0:
                if (this.f32903a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((z3) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 1:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.D;
                y3 y3Var = g7Var.f24406b;
                float f9 = 1.0f;
                if (y3Var.getImageReceiver().hasBitmapImage()) {
                    f9 = 1.0f - y3Var.getImageReceiver().getCurrentAlpha();
                }
                g7Var.d.setAlpha(f9);
                g7Var.f24405a.setAlpha(f9);
                super.onDraw(canvas);
                return;
            case 2:
                sa saVar = (sa) this.D;
                org.telegram.ui.Cells.j6 j6Var = saVar.P;
                if (saVar.B) {
                    j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(saVar.Q, canvas, this.f32903a, j6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                va vaVar = (va) this.D;
                Object obj = vaVar.h;
                if (!(obj instanceof zh1) && !(obj instanceof ai1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, vaVar.f25848n.f25893n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), vaVar.f25848n.f25893n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), vaVar.f25848n.f25893n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, vaVar.f25848n.f25893n);
                }
                if (vaVar.f25846e) {
                    vaVar.f25848n.f25894r.setColor(org.telegram.ui.ActionBar.g6.f23040c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), vaVar.f25848n.f25894r);
                    Drawable drawable = vaVar.f25848n.v;
                    drawable.setBounds(org.telegram.ui.b.v(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, vaVar.f25848n.v), org.telegram.ui.b.A(2, measuredWidth, vaVar.f25848n.v), org.telegram.ui.b.y(2, measuredHeight, vaVar.f25848n.v));
                    vaVar.f25848n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.z0) this.D).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f32903a.getDrawable();
                if (drawable2 != null) {
                    this.f32903a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f32903a.draw(canvas);
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
        switch (this.C) {
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
        switch (this.C) {
            case 2:
                if (((sa) this.D).P.a(motionEvent, this)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.C) {
            case 11:
                if (drawable != ((sf.v0) this.D).f47975r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y3(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = z0Var;
        this.f32903a = new x2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.C) {
            case 4:
                cg.i0 i0Var = ((hd) this.D).f38858f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                cg.i0 i0Var2 = ((ko) this.D).f39947f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                return;
            case 7:
                if (kg.g0.b(this)) {
                    return;
                }
                super.invalidate();
                ((pv) this.D).f();
                return;
            case 8:
                cg.i0 i0Var3 = ((t60) this.D).f42560e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                cg.i0 i0Var4 = ((pe0) this.D).h;
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
        switch (this.C) {
            case 4:
                cg.i0 i0Var = ((hd) this.D).f38858f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                cg.i0 i0Var2 = ((ko) this.D).f39947f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                return;
            case 7:
                if (kg.g0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 8:
                cg.i0 i0Var3 = ((t60) this.D).f42560e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                cg.i0 i0Var4 = ((pe0) this.D).h;
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
