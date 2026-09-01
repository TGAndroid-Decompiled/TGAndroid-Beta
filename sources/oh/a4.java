package oh;

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
import org.telegram.ui.Components.vv;
import org.telegram.ui.af0;
import org.telegram.ui.f70;
import org.telegram.ui.nd;
import org.telegram.ui.pi1;
import org.telegram.ui.po;
import org.telegram.ui.qi1;
public final class a4 extends org.telegram.ui.Components.p9 {
    public final int D;
    public final Object E;

    public a4(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.D) {
            case 11:
                return new z2(this, this, 6);
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
                if (this.f29998a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((b4) this.E).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 1:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.E;
                a4 a4Var = i7Var.f22974b;
                float f10 = 1.0f;
                if (a4Var.getImageReceiver().hasBitmapImage()) {
                    f10 = 1.0f - a4Var.getImageReceiver().getCurrentAlpha();
                }
                i7Var.d.setAlpha(f10);
                i7Var.f22973a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 2:
                va vaVar = (va) this.E;
                org.telegram.ui.Cells.l6 l6Var = vaVar.Q;
                if (vaVar.C) {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    m7.h(vaVar.R, canvas, this.f29998a, l6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                ya yaVar = (ya) this.E;
                Object obj = yaVar.h;
                if (!(obj instanceof pi1) && !(obj instanceof qi1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, yaVar.f24468n.f24547n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), yaVar.f24468n.f24547n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), yaVar.f24468n.f24547n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, yaVar.f24468n.f24547n);
                }
                if (yaVar.f24466e) {
                    yaVar.f24468n.f24548r.setColor(org.telegram.ui.ActionBar.k6.f21636c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), yaVar.f24468n.f24548r);
                    Drawable drawable = yaVar.f24468n.v;
                    drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, yaVar.f24468n.v), org.telegram.ui.b.A(2, measuredWidth, yaVar.f24468n.v), org.telegram.ui.b.y(2, measuredHeight, yaVar.f24468n.v));
                    yaVar.f24468n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.a1) this.E).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f29998a.getDrawable();
                if (drawable2 != null) {
                    this.f29998a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f29998a.draw(canvas);
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
                if (drawable != ((vf.v0) this.E).f49225r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a4(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.D = 10;
        this.E = a1Var;
        this.f29998a = new z2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.D) {
            case 4:
                fg.i0 i0Var = ((nd) this.E).f39392f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                fg.i0 i0Var2 = ((po) this.E).f40103f;
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
                if (ng.g0.b(this)) {
                    return;
                }
                super.invalidate();
                ((vv) this.E).f();
                return;
            case 8:
                fg.i0 i0Var3 = ((f70) this.E).f36774e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                fg.i0 i0Var4 = ((af0) this.E).h;
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
                fg.i0 i0Var = ((nd) this.E).f39392f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                fg.i0 i0Var2 = ((po) this.E).f40103f;
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
                if (ng.g0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 8:
                fg.i0 i0Var3 = ((f70) this.E).f36774e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                fg.i0 i0Var4 = ((af0) this.E).h;
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
