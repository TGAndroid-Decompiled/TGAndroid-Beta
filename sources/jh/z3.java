package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.rl;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.iv;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.te0;
import org.telegram.ui.u60;
import org.telegram.ui.wh1;
import org.telegram.ui.xh1;

public final class z3 extends org.telegram.ui.Components.n9 {
    public final int C;
    public final Object D;

    public z3(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new y2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.C) {
            case 0:
                if (this.f30898a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((a4) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.D;
                z3 z3Var = f7Var.f24343b;
                float currentAlpha = z3Var.getImageReceiver().hasBitmapImage() ? 1.0f - z3Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                f7Var.d.setAlpha(currentAlpha);
                f7Var.f24342a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                sa saVar = (sa) this.D;
                org.telegram.ui.Cells.i6 i6Var = saVar.P;
                if (!saVar.B) {
                    super.onDraw(canvas);
                } else {
                    i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(saVar.Q, canvas, this.f30898a, i6Var);
                }
                break;
            case 3:
                super.onDraw(canvas);
                va vaVar = (va) this.D;
                Object obj = vaVar.h;
                if ((obj instanceof wh1) || (obj instanceof xh1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, vaVar.f25832n.f25905n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), vaVar.f25832n.f25905n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), vaVar.f25832n.f25905n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, vaVar.f25832n.f25905n);
                } else {
                    canvas2 = canvas;
                }
                if (vaVar.f25830e) {
                    vaVar.f25832n.f25906r.setColor(org.telegram.ui.ActionBar.g6.f23030c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), vaVar.f25832n.f25906r);
                    Drawable drawable = vaVar.f25832n.v;
                    drawable.setBounds(rl.v(2, measuredWidth, drawable), rl.e(2, measuredHeight, vaVar.f25832n.v), rl.A(2, measuredWidth, vaVar.f25832n.v), rl.y(2, measuredHeight, vaVar.f25832n.v));
                    vaVar.f25832n.v.draw(canvas2);
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.z0) this.D).v) {
                    Drawable drawable2 = this.f30898a.getDrawable();
                    if (drawable2 != null) {
                        this.f30898a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                        this.f30898a.draw(canvas);
                    }
                } else {
                    super.onDraw(canvas);
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.C) {
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
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
                return drawable == ((qf.w0) this.D).f46476r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public z3(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = z0Var;
        this.f30898a = new y2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.C) {
            case 4:
                ag.t0 t0Var = ((id) this.D).f39038f;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                ag.t0 t0Var2 = ((jo) this.D).f39412f;
                if (t0Var2 != null) {
                    t0Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            case 7:
                if (!ig.g0.b(this)) {
                    super.invalidate();
                    ((iv) this.D).f();
                    break;
                }
                break;
            case 8:
                ag.t0 t0Var3 = ((u60) this.D).f43136e;
                if (t0Var3 != null) {
                    t0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                ag.t0 t0Var4 = ((te0) this.D).h;
                if (t0Var4 != null) {
                    t0Var4.invalidate();
                }
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.C) {
            case 4:
                ag.t0 t0Var = ((id) this.D).f39038f;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                ag.t0 t0Var2 = ((jo) this.D).f39412f;
                if (t0Var2 != null) {
                    t0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            case 7:
                if (!ig.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                ag.t0 t0Var3 = ((u60) this.D).f43136e;
                if (t0Var3 != null) {
                    t0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                ag.t0 t0Var4 = ((te0) this.D).h;
                if (t0Var4 != null) {
                    t0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
