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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.zv;
import org.telegram.ui.cf0;
import org.telegram.ui.i70;
import org.telegram.ui.ld;
import org.telegram.ui.so;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;
public final class y5 extends org.telegram.ui.Components.w9 {
    public final int G;
    public final Object H;

    public y5(Object obj, Context context, int i10) {
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
                if (this.f29579a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((a6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.H;
                y5 y5Var = j7Var.f20288b;
                float f7 = 1.0f;
                if (y5Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - y5Var.getImageReceiver().getCurrentAlpha();
                }
                j7Var.d.setAlpha(f7);
                j7Var.f20287a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.H;
                org.telegram.ui.Cells.m6 m6Var = bbVar.T;
                if (bbVar.F) {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(bbVar.U, canvas, this.f29579a, m6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) this.H;
                Object obj = fbVar.h;
                if (!(obj instanceof yi1) && !(obj instanceof zi1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, fbVar.f20073n.f20127n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), fbVar.f20073n.f20127n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), fbVar.f20073n.f20127n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, fbVar.f20073n.f20127n);
                }
                if (fbVar.e) {
                    fbVar.f20073n.f20128r.setColor(org.telegram.ui.ActionBar.h6.f18765c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), fbVar.f20073n.f20128r);
                    Drawable drawable = fbVar.f20073n.v;
                    drawable.setBounds(ul.x(2, measuredWidth, drawable), ul.e(2, measuredHeight, fbVar.f20073n.v), ul.B(2, measuredWidth, fbVar.f20073n.v), ul.z(2, measuredHeight, fbVar.f20073n.v));
                    fbVar.f20073n.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.b1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f29579a.getDrawable();
                if (drawable2 != null) {
                    this.f29579a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f29579a.draw(canvas);
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
                if (((org.telegram.ui.Cells.bb) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((hg.f1) this.H).f10262r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y5(org.telegram.ui.web.b1 b1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = b1Var;
        this.f29579a = new l4(this, this, 6);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.r6 r6Var = ((ld) this.H).f34923f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                ci.r6 r6Var2 = ((so) this.H).f37351f;
                if (r6Var2 != null) {
                    r6Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                return;
            case 8:
                if (zg.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((zv) this.H).f();
                return;
            case 9:
                ci.r6 r6Var3 = ((i70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                ci.r6 r6Var4 = ((cf0) this.H).h;
                if (r6Var4 != null) {
                    r6Var4.invalidate();
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
                ci.r6 r6Var = ((ld) this.H).f34923f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                ci.r6 r6Var2 = ((so) this.H).f37351f;
                if (r6Var2 != null) {
                    r6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                return;
            case 8:
                if (zg.f0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                ci.r6 r6Var3 = ((i70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                ci.r6 r6Var4 = ((cf0) this.H).h;
                if (r6Var4 != null) {
                    r6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
