package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.tz;
import org.telegram.tgnet.tl.TL_iv;
public final class c6 extends FrameLayout {
    public final n1 f2905a;
    public TL_iv.pageTableCell f2906b;

    public c6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        n1 n1Var = new n1(context, p6Var);
        this.f2905a = n1Var;
        n1Var.setTextSize(1, Math.max(8, tz.W0 - 2));
        n1Var.setAllowNewlines(true);
        setCompact(false);
        addView(n1Var, w7.b6.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        n1 n1Var = this.f2905a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f2906b;
        if (pagetablecell.align_right) {
            i10 = 5;
        } else if (pagetablecell.align_center) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        if (pagetablecell.valign_middle) {
            i11 = i10 | 16;
        } else if (pagetablecell.valign_bottom) {
            i11 = i10 | 80;
        } else {
            i11 = i10 | 48;
        }
        layoutParams.gravity = i11;
        n1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f2906b;
        if (pagetablecell2.align_right) {
            i12 = 53;
        } else if (pagetablecell2.align_center) {
            i12 = 49;
        } else {
            i12 = 51;
        }
        n1Var.setGravity(i12);
        n1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r5) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c6.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        n1 n1Var = this.f2905a;
        if (n1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= n1Var.getLeft() && x10 < n1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y3 < n1Var.getTop() || y3 >= n1Var.getBottom()) {
                z11 = true;
            }
            if (z10 && z11 && n1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y3 - n1Var.getTop(), n1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - n1Var.getLeft(), max);
                boolean onTouchEvent = n1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        n1 n1Var = this.f2905a;
        if (z10) {
            n1Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
            n1Var.setMinHeight(org.telegram.messenger.i0.L(18.0f));
            return;
        }
        n1Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(9.0f));
        n1Var.setMinHeight(org.telegram.messenger.i0.L(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f2905a.setLocked(z10);
    }
}
