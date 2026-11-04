package mi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.az;
import org.telegram.tgnet.tl.TL_iv;
public final class q5 extends FrameLayout {
    public final h1 f19842a;
    public TL_iv.pageTableCell f19843b;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        h1 h1Var = new h1(context, e6Var);
        this.f19842a = h1Var;
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setAllowNewlines(true);
        setCompact(false);
        addView(h1Var, mf.e(-1, -2, 51));
    }

    public final void a() {
        int i3;
        int i10;
        int i11;
        h1 h1Var = this.f19842a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f19843b;
        if (pagetablecell.align_right) {
            i3 = 5;
        } else if (pagetablecell.align_center) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        if (pagetablecell.valign_middle) {
            i10 = i3 | 16;
        } else if (pagetablecell.valign_bottom) {
            i10 = i3 | 80;
        } else {
            i10 = i3 | 48;
        }
        layoutParams.gravity = i10;
        h1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f19843b;
        if (pagetablecell2.align_right) {
            i11 = 53;
        } else if (pagetablecell2.align_center) {
            i11 = 49;
        } else {
            i11 = 51;
        }
        h1Var.setGravity(i11);
        h1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r5) {
        throw new UnsupportedOperationException("Method not decompiled: mi.q5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h1 h1Var = this.f19842a;
        if (h1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= h1Var.getLeft() && x10 < h1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y9 < h1Var.getTop() || y9 >= h1Var.getBottom()) {
                z11 = true;
            }
            if (z10 && z11 && h1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y9 - h1Var.getTop(), h1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - h1Var.getLeft(), max);
                boolean onTouchEvent = h1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        h1 h1Var = this.f19842a;
        if (z10) {
            h1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            h1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
            return;
        }
        h1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
        h1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f19842a.setLocked(z10);
    }
}
