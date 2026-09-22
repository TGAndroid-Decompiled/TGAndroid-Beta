package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.yv;
import org.telegram.ui.gj1;
import org.telegram.ui.hf0;
import org.telegram.ui.hj1;
import org.telegram.ui.l70;
import org.telegram.ui.ld;
import org.telegram.ui.wo;
public final class z5 extends org.telegram.ui.Components.u9 {
    public final int G;
    public final Object H;

    public z5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new l4(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.f28311a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((b6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.H;
                z5 z5Var = j7Var.f20299b;
                float f7 = 1.0f;
                if (z5Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - z5Var.getImageReceiver().getCurrentAlpha();
                }
                j7Var.d.setAlpha(f7);
                j7Var.f20298a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) this.H;
                org.telegram.ui.Cells.m6 m6Var = abVar.T;
                if (abVar.F) {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(abVar.U, canvas, this.f28311a, m6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.H;
                Object obj = ebVar.h;
                if (!(obj instanceof gj1) && !(obj instanceof hj1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, ebVar.f20051n.f20099n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), ebVar.f20051n.f20099n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), ebVar.f20051n.f20099n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, ebVar.f20051n.f20099n);
                }
                if (ebVar.e) {
                    ebVar.f20051n.f20100r.setColor(org.telegram.ui.ActionBar.i6.f18810c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), ebVar.f20051n.f20100r);
                    Drawable drawable = ebVar.f20051n.v;
                    drawable.setBounds(vl.x(2, measuredWidth, drawable), vl.e(2, measuredHeight, ebVar.f20051n.v), vl.B(2, measuredWidth, ebVar.f20051n.v), vl.z(2, measuredHeight, ebVar.f20051n.v));
                    ebVar.f20051n.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.d1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f28311a.getDrawable();
                if (drawable2 != null) {
                    this.f28311a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f28311a.draw(canvas);
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
        switch (this.G) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G) {
            case 3:
                if (((org.telegram.ui.Cells.ab) this.H).T.a(motionEvent, this)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                if (drawable != ((hg.f1) this.H).f10276r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public z5(org.telegram.ui.web.d1 d1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = d1Var;
        this.f28311a = new l4(this, this, 6);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.s6 s6Var = ((ld) this.H).f35415f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                ci.s6 s6Var2 = ((wo) this.H).f39273f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                return;
            case 8:
                if (zg.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((yv) this.H).f();
                return;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                ci.s6 s6Var4 = ((hf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
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
        switch (this.G) {
            case 5:
                ci.s6 s6Var = ((ld) this.H).f35415f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                ci.s6 s6Var2 = ((wo) this.H).f39273f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                return;
            case 8:
                if (zg.f0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                ci.s6 s6Var4 = ((hf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
