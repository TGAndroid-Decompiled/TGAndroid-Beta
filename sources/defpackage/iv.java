package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class iv extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public cw d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public iv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override
    public int getBoundLeft() {
        int i;
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.min(Integer.MAX_VALUE, cwVar.k() + cwVar.s);
        } else {
            i = Integer.MAX_VALUE;
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            i = Math.min(i, cwVar2.k() + cwVar2.s);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return ik8.h(this.a, 18.0f, i);
    }

    @Override
    public int getBoundRight() {
        int i;
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.max(Integer.MIN_VALUE, cwVar.l() + cwVar.s);
        } else {
            i = Integer.MIN_VALUE;
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            i = Math.max(i, cwVar2.l() + cwVar2.s);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return ik8.C(this.a, 18.0f, i);
    }

    @Override
    public int getLastLineBoundRight() {
        cw cwVar = this.d;
        xi5 xi5Var = this.a;
        if (cwVar != null) {
            int m = cwVar.m() + cwVar.s;
            xi5Var.getClass();
            return hl.L(18.0f) + m;
        }
        cw cwVar2 = this.c;
        if (cwVar2 != null) {
            int m2 = cwVar2.m() + cwVar2.s;
            xi5Var.getClass();
            return hl.L(18.0f) + m2;
        }
        return -1;
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.n != null) {
            cw cwVar = this.c;
            xi5 xi5Var = this.a;
            int i = 0;
            if (cwVar != null) {
                canvas.save();
                canvas.translate(this.f, this.h);
                o.s(xi5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f, this.e);
                o.s(xi5Var, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence g;
        CharSequence g2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        cw cwVar = this.c;
        ex exVar = this.b;
        xi5 xi5Var = this.a;
        if (cwVar != null && (g2 = o.g(xi5Var, exVar, cwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null && (g = o.g(xi5Var, exVar, cwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) ob6.M0(2131754854, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        iv ivVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        this.f = hl.L(18.0f);
        xi5Var.getClass();
        this.h = hl.L(8.0f);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            xi5 xi5Var2 = this.a;
            ivVar = this;
            cw m = o.m(xi5Var2, ivVar, null, richText, ik8.h(xi5Var2, 36.0f, size), this.h, this.n, this.b);
            ivVar.c = m;
            if (m != null) {
                xi5Var.getClass();
                i4 = ivVar.c.d.getHeight() + hl.L(8.0f);
                cw cwVar = ivVar.c;
                cwVar.s = ivVar.f;
                cwVar.w = ivVar.h;
            } else {
                i4 = 0;
            }
            i3 = i4;
            ivVar.e = hl.L(2.0f) + i3;
            TL_iv.RichText richText2 = ivVar.n.caption;
            xi5 xi5Var3 = ivVar.a;
            cw m2 = o.m(xi5Var3, ivVar, null, richText2, ik8.h(xi5Var3, 36.0f, size), ivVar.e, ivVar.n, ivVar.b);
            ivVar.d = m2;
            if (m2 != null) {
                xi5Var.getClass();
                i3 += ivVar.d.d.getHeight() + hl.L(8.0f);
                cw cwVar2 = ivVar.d;
                cwVar2.s = ivVar.f;
                cwVar2.w = ivVar.e;
            }
            if (i3 != 0) {
                i3 = ik8.C(xi5Var, 8.0f, i3);
            }
        } else {
            ivVar = this;
            i3 = 1;
        }
        ivVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            if (!o.i(this.a, this.b, motionEvent, this, this.d, this.f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.n = pageblockpullquote;
        requestLayout();
    }
}
