package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.kw;
import org.telegram.ui.mf0;
import org.telegram.ui.p70;
import org.telegram.ui.pj1;
import org.telegram.ui.qj1;
import org.telegram.ui.sd;
import org.telegram.ui.zo;
public final class k5 extends org.telegram.ui.Components.z9 {
    public final int G;
    public final Object H;

    public k5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new b4(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.g9) this.H).invalidate();
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
                if (this.f31813a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m5) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.H;
                k5 k5Var = k7Var.f21457b;
                float f7 = 1.0f;
                if (k5Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - k5Var.getImageReceiver().getCurrentAlpha();
                }
                k7Var.d.setAlpha(f7);
                k7Var.f21456a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) this.H;
                org.telegram.ui.Cells.m6 m6Var = xaVar.T;
                if (xaVar.F) {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    s9.h(xaVar.U, canvas, this.f31813a, m6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.H;
                Object obj = bbVar.h;
                if (!(obj instanceof pj1) && !(obj instanceof qj1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, bbVar.f20999n.f21053n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), bbVar.f20999n.f21053n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), bbVar.f20999n.f21053n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, bbVar.f20999n.f21053n);
                }
                if (bbVar.e) {
                    bbVar.f20999n.f21054r.setColor(org.telegram.ui.ActionBar.g6.f19876c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), bbVar.f20999n.f21054r);
                    Drawable drawable = bbVar.f20999n.v;
                    drawable.setBounds(org.telegram.ui.Cells.d0.u(2, measuredWidth, drawable), org.telegram.ui.Cells.d0.d(2, measuredHeight, bbVar.f20999n.v), org.telegram.ui.Cells.d0.y(2, measuredWidth, bbVar.f20999n.v), org.telegram.ui.Cells.d0.x(2, measuredHeight, bbVar.f20999n.v));
                    bbVar.f20999n.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.b1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f31813a.getDrawable();
                if (drawable2 != null) {
                    this.f31813a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f31813a.draw(canvas);
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
                if (((org.telegram.ui.Cells.xa) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((ig.e1) this.H).f11484r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k5(org.telegram.ui.web.b1 b1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = b1Var;
        this.f31813a = new b4(this, this, 6);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                di.p6 p6Var = ((sd) this.H).f40071f;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                di.p6 p6Var2 = ((zo) this.H).f42662f;
                if (p6Var2 != null) {
                    p6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.g9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate();
                ((kw) this.H).f();
                return;
            case 9:
                di.p6 p6Var3 = ((p70) this.H).e;
                if (p6Var3 != null) {
                    p6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                di.p6 p6Var4 = ((mf0) this.H).h;
                if (p6Var4 != null) {
                    p6Var4.invalidate();
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
                di.p6 p6Var = ((sd) this.H).f40071f;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                di.p6 p6Var2 = ((zo) this.H).f42662f;
                if (p6Var2 != null) {
                    p6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.g9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                di.p6 p6Var3 = ((p70) this.H).e;
                if (p6Var3 != null) {
                    p6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                di.p6 p6Var4 = ((mf0) this.H).h;
                if (p6Var4 != null) {
                    p6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
