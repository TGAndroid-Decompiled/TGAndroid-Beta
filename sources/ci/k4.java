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
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.gw;
import org.telegram.ui.ko;
import org.telegram.ui.od;
import org.telegram.ui.pe0;
import org.telegram.ui.u60;
import org.telegram.ui.uh1;
import org.telegram.ui.vh1;
public final class k4 extends org.telegram.ui.Components.w9 {
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
                return new g3(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
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
                if (this.f32040a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.H;
                k4 k4Var = i7Var.f22433b;
                float f7 = 1.0f;
                if (k4Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - k4Var.getImageReceiver().getCurrentAlpha();
                }
                i7Var.d.setAlpha(f7);
                i7Var.f22432a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                va vaVar = (va) this.H;
                org.telegram.ui.Cells.l6 l6Var = vaVar.T;
                if (vaVar.F) {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    d8.h(vaVar.U, canvas, this.f32040a, l6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                za zaVar = (za) this.H;
                Object obj = zaVar.h;
                if (!(obj instanceof uh1) && !(obj instanceof vh1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, zaVar.f23894n.f22025n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), zaVar.f23894n.f22025n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), zaVar.f23894n.f22025n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, zaVar.f23894n.f22025n);
                }
                if (zaVar.e) {
                    zaVar.f23894n.f22026r.setColor(org.telegram.ui.ActionBar.h6.f20968c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), zaVar.f23894n.f22026r);
                    Drawable drawable = zaVar.f23894n.v;
                    drawable.setBounds(org.telegram.ui.Cells.c1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.f(2, measuredHeight, zaVar.f23894n.v), org.telegram.ui.Cells.c1.B(2, measuredWidth, zaVar.f23894n.v), org.telegram.ui.Cells.c1.A(2, measuredHeight, zaVar.f23894n.v));
                    zaVar.f23894n.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.a1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f32040a.getDrawable();
                if (drawable2 != null) {
                    this.f32040a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f32040a.draw(canvas);
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
                if (((va) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((ig.d1) this.H).f12859r && !super.verifyDrawable(drawable)) {
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
        this.f32040a = new g3(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                ei.g6 g6Var = ((od) this.H).f39739f;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                ei.g6 g6Var2 = ((ko) this.H).f38599f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate();
                ((gw) this.H).f();
                return;
            case 9:
                ei.g6 g6Var3 = ((u60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                ei.g6 g6Var4 = ((pe0) this.H).h;
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
                ei.g6 g6Var = ((od) this.H).f39739f;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                ei.g6 g6Var2 = ((ko) this.H).f38599f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                return;
            case 8:
                if (ah.x0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                ei.g6 g6Var3 = ((u60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                ei.g6 g6Var4 = ((pe0) this.H).h;
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
