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
import org.telegram.ui.Components.cw;
import org.telegram.ui.ff0;
import org.telegram.ui.k70;
import org.telegram.ui.nd;
import org.telegram.ui.to;
import org.telegram.ui.wi1;
import org.telegram.ui.xi1;
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
                if (this.f32564a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((a6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.H;
                y5 y5Var = k7Var.f22413b;
                float f7 = 1.0f;
                if (y5Var.getImageReceiver().hasBitmapImage()) {
                    f7 = 1.0f - y5Var.getImageReceiver().getCurrentAlpha();
                }
                k7Var.d.setAlpha(f7);
                k7Var.f22412a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 3:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) this.H;
                org.telegram.ui.Cells.m6 m6Var = zaVar.T;
                if (zaVar.F) {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(zaVar.U, canvas, this.f32564a, m6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.H;
                Object obj = dbVar.h;
                if (!(obj instanceof wi1) && !(obj instanceof xi1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, dbVar.f21998n.f22072n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), dbVar.f21998n.f22072n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), dbVar.f21998n.f22072n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, dbVar.f21998n.f22072n);
                }
                if (dbVar.f21996e) {
                    dbVar.f21998n.f22073r.setColor(org.telegram.ui.ActionBar.i6.f20803c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), dbVar.f21998n.f22073r);
                    Drawable drawable = dbVar.f21998n.v;
                    drawable.setBounds(org.telegram.ui.Cells.c1.t(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.e(2, measuredHeight, dbVar.f21998n.v), org.telegram.ui.Cells.c1.x(2, measuredWidth, dbVar.f21998n.v), org.telegram.ui.Cells.c1.w(2, measuredHeight, dbVar.f21998n.v));
                    dbVar.f21998n.v.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.c1) this.H).v) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable2 = this.f32564a.getDrawable();
                if (drawable2 != null) {
                    this.f32564a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                    this.f32564a.draw(canvas);
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
                if (((org.telegram.ui.Cells.za) this.H).T.a(motionEvent, this)) {
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
                if (drawable != ((hg.e1) this.H).f11160r && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y5(org.telegram.ui.web.c1 c1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = c1Var;
        this.f32564a = new l4(this, this, 6);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.r6 r6Var = ((nd) this.H).f38908f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                ci.r6 r6Var2 = ((to) this.H).f40953f;
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
                if (zg.c0.b(this)) {
                    return;
                }
                super.invalidate();
                ((cw) this.H).f();
                return;
            case 9:
                ci.r6 r6Var3 = ((k70) this.H).f37863e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                ci.r6 r6Var4 = ((ff0) this.H).h;
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
                ci.r6 r6Var = ((nd) this.H).f38908f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                ci.r6 r6Var2 = ((to) this.H).f40953f;
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
                if (zg.c0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                ci.r6 r6Var3 = ((k70) this.H).f37863e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 10:
                ci.r6 r6Var4 = ((ff0) this.H).h;
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
