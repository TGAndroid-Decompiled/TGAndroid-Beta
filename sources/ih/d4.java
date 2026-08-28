package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.jv;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.qe0;
import org.telegram.ui.r60;
import org.telegram.ui.xh1;
import org.telegram.ui.yh1;
public final class d4 extends org.telegram.ui.Components.o9 {
    public final int C;
    public final Object D;

    public d4(Object obj, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new z2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.v8) this.D).invalidate();
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
                if (this.f31328a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((e4) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 1:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.D;
                d4 d4Var = i7Var.f24514b;
                float f10 = 1.0f;
                if (d4Var.getImageReceiver().hasBitmapImage()) {
                    f10 = 1.0f - d4Var.getImageReceiver().getCurrentAlpha();
                }
                i7Var.d.setAlpha(f10);
                i7Var.f24513a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 2:
                va vaVar = (va) this.D;
                org.telegram.ui.Cells.l6 l6Var = vaVar.P;
                if (vaVar.B) {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    p7.h(vaVar.Q, canvas, this.f31328a, l6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                ya yaVar = (ya) this.D;
                Object obj = yaVar.h;
                if (!(obj instanceof xh1) && !(obj instanceof yh1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, yaVar.f26005n.f26053n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), yaVar.f26005n.f26053n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), yaVar.f26005n.f26053n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, yaVar.f26005n.f26053n);
                }
                if (yaVar.f26003e) {
                    yaVar.f26005n.f26054r.setColor(org.telegram.ui.ActionBar.f6.f22977c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), yaVar.f26005n.f26054r);
                    Drawable drawable = yaVar.f26005n.v;
                    drawable.setBounds(ll.x(2, measuredWidth, drawable), ll.e(2, measuredHeight, yaVar.f26005n.v), ll.B(2, measuredWidth, yaVar.f26005n.v), ll.z(2, measuredHeight, yaVar.f26005n.v));
                    yaVar.f26005n.v.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.y0) this.D).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f31328a.getDrawable();
                if (drawable2 != null) {
                    this.f31328a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f31328a.draw(canvas);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.C) {
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.C) {
            case 2:
                if (((va) this.D).P.a(motionEvent, this)) {
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
                if (drawable != ((pf.w0) this.D).f45808r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d4(org.telegram.ui.web.y0 y0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = y0Var;
        this.f31328a = new z2(this, this, 5);
    }

    @Override
    public void invalidate() {
        switch (this.C) {
            case 4:
                kh.h6 h6Var = ((id) this.D).f39110f;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                kh.h6 h6Var2 = ((ho) this.D).f38844f;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.v8) this.D).invalidate();
                return;
            case 7:
                if (hg.h0.b(this)) {
                    return;
                }
                super.invalidate();
                ((jv) this.D).f();
                return;
            case 8:
                kh.h6 h6Var3 = ((r60) this.D).f42280e;
                if (h6Var3 != null) {
                    h6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                kh.h6 h6Var4 = ((qe0) this.D).h;
                if (h6Var4 != null) {
                    h6Var4.invalidate();
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.C) {
            case 4:
                kh.h6 h6Var = ((id) this.D).f39110f;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            case 5:
                kh.h6 h6Var2 = ((ho) this.D).f38844f;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            case 6:
                super.invalidate(i9, i10, i11, i12);
                ((org.telegram.ui.Components.v8) this.D).invalidate();
                return;
            case 7:
                if (hg.h0.b(this)) {
                    return;
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            case 8:
                kh.h6 h6Var3 = ((r60) this.D).f42280e;
                if (h6Var3 != null) {
                    h6Var3.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            case 9:
                kh.h6 h6Var4 = ((qe0) this.D).h;
                if (h6Var4 != null) {
                    h6Var4.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            default:
                super.invalidate(i9, i10, i11, i12);
                return;
        }
    }
}
