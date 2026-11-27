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
                rbb rbbVar = (rbb) this.m0;
                rbbVar.N0.setTranslationY(rbbVar.n.getMeasuredHeight() - rbbVar.N0.g());
                kab kabVar = rbbVar.r2;
                if (kabVar != null) {
                    kabVar.run();
                    rbbVar.r2 = null;
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
                if (((rbb) this.m0).g0 == 0 && z) {
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
                    rbb rbbVar = (rbb) this.m0;
                    rbbVar.M0 = true;
                    rbbVar.c(false);
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
                rbb rbbVar = (rbb) this.m0;
                if (rbbVar.l2) {
                    float i = Utilities.i(1.0f - (f / (rbbVar.n.getMeasuredHeight() - rbbVar.N0.g())), 1.0f, 0.0f);
                    rbbVar.r.b(hl.L(-32.0f) * i);
                    rbbVar.r.setAlpha(1.0f - (0.6f * i));
                    rbbVar.j0.setAlpha(1.0f - i);
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public zt4(rbb rbbVar, int i, Context context, x53 x53Var, do6 do6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, x53Var, do6Var, z, 1.39f, z2, z3);
        this.m0 = rbbVar;
    }
}
