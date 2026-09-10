package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.fb;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hf0;
import org.telegram.ui.k70;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.nd;
import org.telegram.ui.yo;
import zh.a6;
import zh.x2;
public final class i1 extends w9 {
    public final int G;
    public final Object H;

    public i1(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new h1(this, this, 0);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 6:
                super.invalidate(rect);
                ((c9) this.H).invalidate();
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
            case 1:
                l7 l7Var = (l7) this.H;
                i1 i1Var = l7Var.f19489b;
                float f7 = 1.0f;
                if (i1Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - i1Var.getImageReceiver().getCurrentAlpha();
                }
                l7Var.d.setAlpha(f7);
                l7Var.f19488a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 2:
                bb bbVar = (bb) this.H;
                n6 n6Var = bbVar.T;
                if (bbVar.F) {
                    n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    a6.h(bbVar.U, canvas, this.f28728a, n6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                fb fbVar = (fb) this.H;
                Object obj = fbVar.h;
                if (!(obj instanceof kj1) && !(obj instanceof lj1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, fbVar.f19173n.f19233n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), fbVar.f19173n.f19233n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), fbVar.f19173n.f19233n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, fbVar.f19173n.f19233n);
                }
                if (fbVar.e) {
                    fbVar.f19173n.f19234r.setColor(j6.f17904c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), fbVar.f19173n.f19234r);
                    Drawable drawable = fbVar.f19173n.v;
                    drawable.setBounds(em.w(2, measuredWidth, drawable), em.e(2, measuredHeight, fbVar.f19173n.v), em.B(2, measuredWidth, fbVar.f19173n.v), em.z(2, measuredHeight, fbVar.f19173n.v));
                    fbVar.f19173n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.c1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f28728a.getDrawable();
                if (drawable2 != null) {
                    this.f28728a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f28728a.draw(canvas);
                    return;
                }
                return;
            case 11:
                if (this.f28728a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((x2) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
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
            case 2:
                if (((bb) this.H).T.a(motionEvent, this)) {
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
            case 0:
                if (drawable != ((k1) this.H).f8931r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i1(org.telegram.ui.web.c1 c1Var, Context context) {
        super(context);
        this.G = 10;
        this.H = c1Var;
        this.f28728a = new h1(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 4:
                s7 s7Var = ((nd) this.H).f35226f;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                s7 s7Var2 = ((yo) this.H).f39047f;
                if (s7Var2 != null) {
                    s7Var2.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                ((c9) this.H).invalidate();
                return;
            case 7:
                if (yg.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((cw) this.H).f();
                return;
            case 8:
                s7 s7Var3 = ((k70) this.H).e;
                if (s7Var3 != null) {
                    s7Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                s7 s7Var4 = ((hf0) this.H).h;
                if (s7Var4 != null) {
                    s7Var4.invalidate();
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
            case 4:
                s7 s7Var = ((nd) this.H).f35226f;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                s7 s7Var2 = ((yo) this.H).f39047f;
                if (s7Var2 != null) {
                    s7Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((c9) this.H).invalidate();
                return;
            case 7:
                if (yg.f0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 8:
                s7 s7Var3 = ((k70) this.H).e;
                if (s7Var3 != null) {
                    s7Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                s7 s7Var4 = ((hf0) this.H).h;
                if (s7Var4 != null) {
                    s7Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
