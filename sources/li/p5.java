package li;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
public final class p5 extends FrameLayout {
    public final g1 f18781a;
    public TL_iv.pageTableCell f18782b;

    public p5(Context context, h6 h6Var) {
        super(context);
        g1 g1Var = new g1(context, h6Var);
        this.f18781a = g1Var;
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setAllowNewlines(true);
        setCompact(false);
        addView(g1Var, ha.e(-1, -2, 51));
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        g1 g1Var = this.f18781a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f18782b;
        if (pagetablecell.align_right) {
            i7 = 5;
        } else if (pagetablecell.align_center) {
            i7 = 1;
        } else {
            i7 = 3;
        }
        if (pagetablecell.valign_middle) {
            i10 = i7 | 16;
        } else if (pagetablecell.valign_bottom) {
            i10 = i7 | 80;
        } else {
            i10 = i7 | 48;
        }
        layoutParams.gravity = i10;
        g1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f18782b;
        if (pagetablecell2.align_right) {
            i11 = 53;
        } else if (pagetablecell2.align_center) {
            i11 = 49;
        } else {
            i11 = 51;
        }
        g1Var.setGravity(i11);
        g1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r5) {
        throw new UnsupportedOperationException("Method not decompiled: li.p5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        g1 g1Var = this.f18781a;
        if (g1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = false;
            if (x10 >= g1Var.getLeft() && x10 < g1Var.getRight()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (y10 < g1Var.getTop() || y10 >= g1Var.getBottom()) {
                z10 = true;
            }
            if (z9 && z10 && g1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - g1Var.getTop(), g1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - g1Var.getLeft(), max);
                boolean onTouchEvent = g1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z9) {
        g1 g1Var = this.f18781a;
        if (z9) {
            g1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            g1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
            return;
        }
        g1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
        g1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
    }

    public void setLocked(boolean z9) {
        this.f18781a.setLocked(z9);
    }
}
