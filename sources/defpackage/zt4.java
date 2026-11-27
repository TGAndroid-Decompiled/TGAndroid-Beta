package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class zt4 extends wt4 {
    public final byte l0 = 0;
    public final Object m0;

    public zt4(int i, Context context, x53 x53Var, float f, String str) {
        super(i, context, x53Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override
    public final void a() {
        switch (this.l0) {
            case 1:
                sbb sbbVar = (sbb) this.m0;
                sbbVar.N0.setTranslationY(sbbVar.n.getMeasuredHeight() - sbbVar.N0.g());
                lab labVar = sbbVar.r2;
                if (labVar != null) {
                    labVar.run();
                    sbbVar.r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(boolean z) {
        switch (this.l0) {
            case 1:
                if (((sbb) this.m0).g0 == 0 && z) {
                    hl.c3(new s8b(this, (byte) 4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    sbb sbbVar = (sbb) this.m0;
                    sbbVar.M0 = true;
                    sbbVar.c(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final String getTitle() {
        switch (this.l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.l0) {
            case 1:
                super.setTranslationY(f);
                sbb sbbVar = (sbb) this.m0;
                if (sbbVar.l2) {
                    float i = Utilities.i(1.0f - (f / (sbbVar.n.getMeasuredHeight() - sbbVar.N0.g())), 1.0f, 0.0f);
                    sbbVar.r.b(hl.L(-32.0f) * i);
                    sbbVar.r.setAlpha(1.0f - (0.6f * i));
                    sbbVar.j0.setAlpha(1.0f - i);
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public zt4(sbb sbbVar, int i, Context context, x53 x53Var, do6 do6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, x53Var, do6Var, z, 1.39f, z2, z3);
        this.m0 = sbbVar;
    }
}
