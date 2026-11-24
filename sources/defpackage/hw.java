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
public final class hw extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public hw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override
    public int getBoundLeft() {
        int i;
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.min(Integer.MAX_VALUE, bxVar.k() + bxVar.s);
        } else {
            i = Integer.MAX_VALUE;
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            i = Math.min(i, bxVar2.k() + bxVar2.s);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return wi8.h(this.a, 18.0f, i);
    }

    @Override
    public int getBoundRight() {
        int i;
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.max(Integer.MIN_VALUE, bxVar.l() + bxVar.s);
        } else {
            i = Integer.MIN_VALUE;
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            i = Math.max(i, bxVar2.l() + bxVar2.s);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, i);
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
        if (this.n != null) {
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) jb6.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        hw hwVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        this.f = gm.L(18.0f);
        ui5Var.getClass();
        this.h = gm.L(8.0f);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            ui5 ui5Var2 = this.a;
            hwVar = this;
            bx m = o.m(ui5Var2, hwVar, null, richText, wi8.h(ui5Var2, 36.0f, size), this.h, this.n, this.b);
            hwVar.c = m;
            if (m != null) {
                ui5Var.getClass();
                i4 = hwVar.c.d.getHeight() + gm.L(8.0f);
                bx bxVar = hwVar.c;
                bxVar.s = hwVar.f;
                bxVar.w = hwVar.h;
            } else {
                i4 = 0;
            }
            i3 = i4;
            hwVar.e = gm.L(2.0f) + i3;
            TL_iv.RichText richText2 = hwVar.n.caption;
            ui5 ui5Var3 = hwVar.a;
            bx m2 = o.m(ui5Var3, hwVar, null, richText2, wi8.h(ui5Var3, 36.0f, size), hwVar.e, hwVar.n, hwVar.b);
            hwVar.d = m2;
            if (m2 != null) {
                ui5Var.getClass();
                i3 += hwVar.d.d.getHeight() + gm.L(8.0f);
                bx bxVar2 = hwVar.d;
                bxVar2.s = hwVar.f;
                bxVar2.w = hwVar.e;
            }
            if (i3 != 0) {
                i3 = wi8.C(ui5Var, 8.0f, i3);
            }
        } else {
            hwVar = this;
            i3 = 1;
        }
        hwVar.setMeasuredDimension(size, i3);
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
