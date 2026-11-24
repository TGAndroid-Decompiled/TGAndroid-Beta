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
public final class hv extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public hv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override
    public int getBoundLeft() {
        int i;
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.min(Integer.MAX_VALUE, bwVar.k() + bwVar.s);
        } else {
            i = Integer.MAX_VALUE;
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            i = Math.min(i, bwVar2.k() + bwVar2.s);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return ug8.h(this.a, 18.0f, i);
    }

    @Override
    public int getBoundRight() {
        int i;
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.max(Integer.MIN_VALUE, bwVar.l() + bwVar.s);
        } else {
            i = Integer.MIN_VALUE;
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            i = Math.max(i, bwVar2.l() + bwVar2.s);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return ug8.C(this.a, 18.0f, i);
    }

    @Override
    public int getLastLineBoundRight() {
        bw bwVar = this.d;
        vg5 vg5Var = this.a;
        if (bwVar != null) {
            int m = bwVar.m() + bwVar.s;
            vg5Var.getClass();
            return gl.L(18.0f) + m;
        }
        bw bwVar2 = this.c;
        if (bwVar2 != null) {
            int m2 = bwVar2.m() + bwVar2.s;
            vg5Var.getClass();
            return gl.L(18.0f) + m2;
        }
        return -1;
    }

    public int getMinWidth() {
        return ug8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.n != null) {
            bw bwVar = this.c;
            vg5 vg5Var = this.a;
            int i = 0;
            if (bwVar != null) {
                canvas.save();
                canvas.translate(this.f, this.h);
                o.s(vg5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f, this.e);
                o.s(vg5Var, canvas, this, i);
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
        bw bwVar = this.c;
        dx dxVar = this.b;
        vg5 vg5Var = this.a;
        if (bwVar != null && (g2 = o.g(vg5Var, dxVar, bwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null && (g = o.g(vg5Var, dxVar, bwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) k96.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        hv hvVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        this.f = gl.L(18.0f);
        vg5Var.getClass();
        this.h = gl.L(8.0f);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            vg5 vg5Var2 = this.a;
            hvVar = this;
            bw m = o.m(vg5Var2, hvVar, null, richText, ug8.h(vg5Var2, 36.0f, size), this.h, this.n, this.b);
            hvVar.c = m;
            if (m != null) {
                vg5Var.getClass();
                i4 = hvVar.c.d.getHeight() + gl.L(8.0f);
                bw bwVar = hvVar.c;
                bwVar.s = hvVar.f;
                bwVar.w = hvVar.h;
            } else {
                i4 = 0;
            }
            i3 = i4;
            hvVar.e = gl.L(2.0f) + i3;
            TL_iv.RichText richText2 = hvVar.n.caption;
            vg5 vg5Var3 = hvVar.a;
            bw m2 = o.m(vg5Var3, hvVar, null, richText2, ug8.h(vg5Var3, 36.0f, size), hvVar.e, hvVar.n, hvVar.b);
            hvVar.d = m2;
            if (m2 != null) {
                vg5Var.getClass();
                i3 += hvVar.d.d.getHeight() + gl.L(8.0f);
                bw bwVar2 = hvVar.d;
                bwVar2.s = hvVar.f;
                bwVar2.w = hvVar.e;
            }
            if (i3 != 0) {
                i3 = ug8.C(vg5Var, 8.0f, i3);
            }
        } else {
            hvVar = this;
            i3 = 1;
        }
        hvVar.setMeasuredDimension(size, i3);
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
