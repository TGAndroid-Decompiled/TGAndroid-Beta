package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.tl;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.ew;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.te0;
import org.telegram.ui.w60;
import org.telegram.ui.yh1;
import org.telegram.ui.zh1;
public final class j4 extends org.telegram.ui.Components.u9 {
    public final int G;
    public final Object H;

    public j4(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new f3(this, this, 1);
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
                if (this.f31064a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((l4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.H;
                j4 j4Var = k7Var.f22640b;
                float f7 = 1.0f;
                if (j4Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - j4Var.getImageReceiver().getCurrentAlpha();
                }
                k7Var.d.setAlpha(f7);
                k7Var.f22639a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                wa waVar = (wa) this.H;
                org.telegram.ui.Cells.m6 m6Var = waVar.T;
                if (waVar.F) {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    c8.h(waVar.U, canvas, this.f31064a, m6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                ab abVar = (ab) this.H;
                Object obj = abVar.h;
                if (!(obj instanceof yh1) && !(obj instanceof zh1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, abVar.f22115s.f22194n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), abVar.f22115s.f22194n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), abVar.f22115s.f22194n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, abVar.f22115s.f22194n);
                }
                if (abVar.e) {
                    abVar.f22115s.f22195r.setColor(org.telegram.ui.ActionBar.k6.f21159c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), abVar.f22115s.f22195r);
                    Drawable drawable = abVar.f22115s.v;
                    drawable.setBounds(org.telegram.ui.Cells.b1.f(2, measuredWidth, drawable), tl.d(2, measuredHeight, abVar.f22115s.v), org.telegram.ui.Cells.b1.y(2, measuredWidth, abVar.f22115s.v), org.telegram.ui.Cells.b1.u(2, measuredHeight, abVar.f22115s.v));
                    abVar.f22115s.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.b1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f31064a.getDrawable();
                if (drawable2 != null) {
                    this.f31064a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f31064a.draw(canvas);
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
                if (((wa) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((ig.c1) this.H).f12881s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j4(org.telegram.ui.web.b1 b1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = b1Var;
        this.f31064a = new f3(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                ei.g6 g6Var = ((md) this.H).h;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                ei.g6 g6Var2 = ((ko) this.H).f38959f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate();
                ((ew) this.H).f();
                return;
            case 9:
                ei.g6 g6Var3 = ((w60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                ei.g6 g6Var4 = ((te0) this.H).h;
                if (g6Var4 != null) {
                    g6Var4.invalidate();
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
                ei.g6 g6Var = ((md) this.H).h;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                ei.g6 g6Var2 = ((ko) this.H).f38959f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                ei.g6 g6Var3 = ((w60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                ei.g6 g6Var4 = ((te0) this.H).h;
                if (g6Var4 != null) {
                    g6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
