package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Components.gw;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.mo;
import org.telegram.ui.nd;
import org.telegram.ui.re0;
import org.telegram.ui.x60;
public final class k4 extends org.telegram.ui.Components.y9 {
    public final int G;
    public final Object H;

    public k4(Object obj, Context context, int i10) {
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
                ((org.telegram.ui.Components.f9) this.H).invalidate();
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
                if (this.f34984a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.H;
                k4 k4Var = o7Var.f24610b;
                float f7 = 1.0f;
                if (k4Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - k4Var.getImageReceiver().getCurrentAlpha();
                }
                o7Var.d.setAlpha(f7);
                o7Var.f24609a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                ab abVar = (ab) this.H;
                org.telegram.ui.Cells.q6 q6Var = abVar.T;
                if (abVar.F) {
                    q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    a8.h(abVar.U, canvas, this.f34984a, q6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                eb ebVar = (eb) this.H;
                Object obj = ebVar.h;
                if (!(obj instanceof bi1) && !(obj instanceof ci1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, ebVar.f24050s.f24127n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), ebVar.f24050s.f24127n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), ebVar.f24050s.f24127n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, ebVar.f24050s.f24127n);
                }
                if (ebVar.e) {
                    ebVar.f24050s.f24128r.setColor(org.telegram.ui.ActionBar.y6.f23331c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), ebVar.f24050s.f24128r);
                    Drawable drawable = ebVar.f24050s.v;
                    drawable.setBounds(org.telegram.ui.d3.x(2, measuredWidth, drawable), org.telegram.ui.d3.i(2, measuredHeight, ebVar.f24050s.v), org.telegram.ui.d3.C(2, measuredWidth, ebVar.f24050s.v), org.telegram.ui.d3.B(2, measuredHeight, ebVar.f24050s.v));
                    ebVar.f24050s.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.a1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f34984a.getDrawable();
                if (drawable2 != null) {
                    this.f34984a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f34984a.draw(canvas);
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
                if (((ab) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((jg.d1) this.H).f15670n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k4(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = a1Var;
        this.f34984a = new f3(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                fi.f6 f6Var = ((nd) this.H).h;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                fi.f6 f6Var2 = ((mo) this.H).f41605f;
                if (f6Var2 != null) {
                    f6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.f9) this.H).invalidate();
                return;
            case 8:
                if (bh.m0.b(this)) {
                    return;
                }
                super.invalidate();
                ((gw) this.H).f();
                return;
            case 9:
                fi.f6 f6Var3 = ((x60) this.H).e;
                if (f6Var3 != null) {
                    f6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                fi.f6 f6Var4 = ((re0) this.H).h;
                if (f6Var4 != null) {
                    f6Var4.invalidate();
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
                fi.f6 f6Var = ((nd) this.H).h;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                fi.f6 f6Var2 = ((mo) this.H).f41605f;
                if (f6Var2 != null) {
                    f6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.f9) this.H).invalidate();
                return;
            case 8:
                if (bh.m0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                fi.f6 f6Var3 = ((x60) this.H).e;
                if (f6Var3 != null) {
                    f6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                fi.f6 f6Var4 = ((re0) this.H).h;
                if (f6Var4 != null) {
                    f6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
