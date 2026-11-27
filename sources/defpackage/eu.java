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
public final class eu extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public cw d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public eu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override
    public int getBoundLeft() {
        int i;
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        int L = hl.L(18.0f);
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.min(Integer.MAX_VALUE, (cwVar.k() + cwVar.s) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            i = Math.min(i, (cwVar2.k() + cwVar2.s) - L);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return ik8.h(xi5Var, 18.0f, i);
    }

    @Override
    public int getBoundRight() {
        int i;
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        int L = hl.L(18.0f);
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.max(Integer.MIN_VALUE, cwVar.l() + cwVar.s + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            i = Math.max(i, cwVar2.l() + cwVar2.s + L);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return ik8.C(xi5Var, 18.0f, i);
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
        if (this.n == null) {
            return;
        }
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
        ex exVar = this.b;
        if (exVar != null && exVar.H) {
            int measuredWidth = getMeasuredWidth() - hl.L(20.0f);
            canvas.drawRect(measuredWidth, hl.L(6.0f), hl.L(2.0f) + measuredWidth, getMeasuredHeight() - hl.L(6.0f), o.s1);
        } else {
            xi5Var.getClass();
            xi5Var.getClass();
            canvas.drawRect(hl.L((this.n.level * 14) + 18), hl.L(6.0f), hl.L((this.n.level * 14) + 20), getMeasuredHeight() - hl.L(6.0f), o.s1);
        }
        o.r(canvas, xi5Var, this.n, getMeasuredHeight());
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) ob6.M0(2131754868, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        eu euVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        this.h = hl.L(8.0f);
        if (this.n != null) {
            int h = ik8.h(xi5Var, 50.0f, size);
            int i4 = this.n.level;
            if (i4 > 0) {
                h -= hl.L(i4 * 14);
            }
            int i5 = h;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            euVar = this;
            cw m = o.m(this.a, euVar, null, pageblockblockquote.text, i5, this.h, pageblockblockquote, this.b);
            euVar.c = m;
            if (m != null) {
                xi5Var.getClass();
                i3 = euVar.c.d.getHeight() + hl.L(8.0f);
            } else {
                i3 = 0;
            }
            int i6 = euVar.n.level;
            ex exVar = euVar.b;
            if (i6 > 0) {
                if (exVar != null && exVar.H) {
                    euVar.f = hl.L((i6 * 14) + 14);
                } else {
                    euVar.f = ik8.C(xi5Var, 32.0f, hl.L(i6 * 14));
                }
            } else if (exVar != null && exVar.H) {
                euVar.f = hl.L(14.0f);
            } else {
                xi5Var.getClass();
                euVar.f = hl.L(32.0f);
            }
            int C = ik8.C(xi5Var, 8.0f, i3);
            euVar.e = C;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = euVar.n;
            cw m2 = o.m(euVar.a, euVar, null, pageblockblockquote2.caption, i5, C, pageblockblockquote2, euVar.b);
            euVar.d = m2;
            if (m2 != null) {
                xi5Var.getClass();
                i3 += euVar.d.d.getHeight() + hl.L(8.0f);
            }
            if (i3 != 0) {
                i3 = ik8.C(xi5Var, 8.0f, i3);
            }
            cw cwVar = euVar.c;
            if (cwVar != null) {
                cwVar.s = euVar.f;
                cwVar.w = euVar.h;
            }
            cw cwVar2 = euVar.d;
            if (cwVar2 != null) {
                cwVar2.s = euVar.f;
                cwVar2.w = euVar.e;
            }
        } else {
            euVar = this;
            i3 = 1;
        }
        euVar.setMeasuredDimension(size, i3);
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

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
