package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.o;
public final class ou extends View implements Drawable.Callback, eib {
    public final vg5 a;
    public final dx b;
    public bw c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f;
    public TL_iv.pageBlockDetails h;

    public ou(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        this.f = new AnimatedArrowDrawable(bkb.w0(null, bkb.x6, false), true);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        canvas.translate(gl.L(18.0f), ((getMeasuredHeight() - gl.L(13.0f)) - 1) / 2);
        this.f.draw(canvas);
        canvas.restore();
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(vg5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, o.t1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        CharSequence g;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        bw bwVar = this.c;
        if (bwVar != null && (g = o.g(this.a, this.b, bwVar)) != null) {
            spannableStringBuilder.append(g).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) k96.M0(2131754868, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i = 2131754865;
        } else {
            i = 2131754869;
        }
        spannableStringBuilder.append((CharSequence) k96.M0(i, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ou ouVar;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(39.0f);
        this.d = gl.L(50.0f);
        this.e = gl.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            vg5 vg5Var = this.a;
            int h = ug8.h(vg5Var, 54.0f, size);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            dx dxVar = this.b;
            if (dxVar != null && dxVar.H) {
                alignment = lwa.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            ouVar = this;
            bw n = o.n(vg5Var, ouVar, null, richText, h, 0, pageblockdetails2, alignment, 0, this.b);
            ouVar.c = n;
            if (n != null) {
                L = Math.max(L, ouVar.c.d.getHeight() + gl.L(21.0f));
                int L2 = ((gl.L(21.0f) + ouVar.c.d.getHeight()) - ouVar.c.d.getHeight()) / 2;
                ouVar.e = L2;
                bw bwVar = ouVar.c;
                bwVar.s = ouVar.d;
                bwVar.w = L2;
            }
        } else {
            ouVar = this;
        }
        ouVar.setMeasuredDimension(size, L + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        float f;
        this.h = pageblockdetails;
        if (pageblockdetails.open) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        AnimatedArrowDrawable animatedArrowDrawable = this.f;
        animatedArrowDrawable.setAnimationProgress(f);
        animatedArrowDrawable.setCallback(this);
        requestLayout();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
