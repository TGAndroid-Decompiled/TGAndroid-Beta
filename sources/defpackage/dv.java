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
public final class dv extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public dv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override
    public int getBoundLeft() {
        int i;
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        int L = gm.L(18.0f);
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.min(Integer.MAX_VALUE, (bxVar.k() + bxVar.s) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            i = Math.min(i, (bxVar2.k() + bxVar2.s) - L);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return wi8.h(ui5Var, 18.0f, i);
    }

    @Override
    public int getBoundRight() {
        int i;
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        int L = gm.L(18.0f);
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.max(Integer.MIN_VALUE, bxVar.l() + bxVar.s + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            i = Math.max(i, bxVar2.l() + bxVar2.s + L);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return wi8.C(ui5Var, 18.0f, i);
    }

    @Override
    public int getLastLineBoundRight() {
        bx bxVar = this.d;
        ui5 ui5Var = this.a;
        if (bxVar != null) {
            int m = bxVar.m() + bxVar.s;
            ui5Var.getClass();
            return gm.L(18.0f) + m;
        }
        bx bxVar2 = this.c;
        if (bxVar2 != null) {
            int m2 = bxVar2.m() + bxVar2.s;
            ui5Var.getClass();
            return gm.L(18.0f) + m2;
        }
        return -1;
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        bx bxVar = this.c;
        ui5 ui5Var = this.a;
        int i = 0;
        if (bxVar != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            o.s(ui5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            o.s(ui5Var, canvas, this, i);
            this.d.d(canvas, this);
            canvas.restore();
        }
        ey eyVar = this.b;
        if (eyVar != null && eyVar.H) {
            int measuredWidth = getMeasuredWidth() - gm.L(20.0f);
            canvas.drawRect(measuredWidth, gm.L(6.0f), gm.L(2.0f) + measuredWidth, getMeasuredHeight() - gm.L(6.0f), o.s1);
        } else {
            ui5Var.getClass();
            ui5Var.getClass();
            canvas.drawRect(gm.L((this.n.level * 14) + 18), gm.L(6.0f), gm.L((this.n.level * 14) + 20), getMeasuredHeight() - gm.L(6.0f), o.s1);
        }
        o.r(canvas, ui5Var, this.n, getMeasuredHeight());
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
        bx bxVar = this.c;
        ey eyVar = this.b;
        ui5 ui5Var = this.a;
        if (bxVar != null && (g2 = o.g(ui5Var, eyVar, bxVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null && (g = o.g(ui5Var, eyVar, bxVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) jb6.M0(2131754872, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        dv dvVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        this.h = gm.L(8.0f);
        if (this.n != null) {
            int h = wi8.h(ui5Var, 50.0f, size);
            int i4 = this.n.level;
            if (i4 > 0) {
                h -= gm.L(i4 * 14);
            }
            int i5 = h;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            dvVar = this;
            bx m = o.m(this.a, dvVar, null, pageblockblockquote.text, i5, this.h, pageblockblockquote, this.b);
            dvVar.c = m;
            if (m != null) {
                ui5Var.getClass();
                i3 = dvVar.c.d.getHeight() + gm.L(8.0f);
            } else {
                i3 = 0;
            }
            int i6 = dvVar.n.level;
            ey eyVar = dvVar.b;
            if (i6 > 0) {
                if (eyVar != null && eyVar.H) {
                    dvVar.f = gm.L((i6 * 14) + 14);
                } else {
                    dvVar.f = wi8.C(ui5Var, 32.0f, gm.L(i6 * 14));
                }
            } else if (eyVar != null && eyVar.H) {
                dvVar.f = gm.L(14.0f);
            } else {
                ui5Var.getClass();
                dvVar.f = gm.L(32.0f);
            }
            int C = wi8.C(ui5Var, 8.0f, i3);
            dvVar.e = C;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = dvVar.n;
            bx m2 = o.m(dvVar.a, dvVar, null, pageblockblockquote2.caption, i5, C, pageblockblockquote2, dvVar.b);
            dvVar.d = m2;
            if (m2 != null) {
                ui5Var.getClass();
                i3 += dvVar.d.d.getHeight() + gm.L(8.0f);
            }
            if (i3 != 0) {
                i3 = wi8.C(ui5Var, 8.0f, i3);
            }
            bx bxVar = dvVar.c;
            if (bxVar != null) {
                bxVar.s = dvVar.f;
                bxVar.w = dvVar.h;
            }
            bx bxVar2 = dvVar.d;
            if (bxVar2 != null) {
                bxVar2.s = dvVar.f;
                bxVar2.w = dvVar.e;
            }
        } else {
            dvVar = this;
            i3 = 1;
        }
        dvVar.setMeasuredDimension(size, i3);
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
