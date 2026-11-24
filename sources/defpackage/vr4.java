package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class vr4 extends sr4 {
    public final byte l0 = 0;
    public final Object m0;

    public vr4(int i, Context context, f53 f53Var, float f, String str) {
        super(i, context, f53Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override
    public final void a() {
        switch (this.l0) {
            case 1:
                t7b t7bVar = (t7b) this.m0;
                t7bVar.N0.setTranslationY(t7bVar.n.getMeasuredHeight() - t7bVar.N0.g());
                l6b l6bVar = t7bVar.r2;
                if (l6bVar != null) {
                    l6bVar.run();
                    t7bVar.r2 = null;
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
                if (((t7b) this.m0).g0 == 0 && z) {
                    gl.c3(new kya(this, (byte) 17));
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
                    t7b t7bVar = (t7b) this.m0;
                    t7bVar.M0 = true;
                    t7bVar.c(false);
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
                t7b t7bVar = (t7b) this.m0;
                if (t7bVar.l2) {
                    float i = Utilities.i(1.0f - (f / (t7bVar.n.getMeasuredHeight() - t7bVar.N0.g())), 1.0f, 0.0f);
                    t7bVar.r.b(gl.L(-32.0f) * i);
                    t7bVar.r.setAlpha(1.0f - (0.6f * i));
                    t7bVar.j0.setAlpha(1.0f - i);
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public vr4(t7b t7bVar, int i, Context context, f53 f53Var, xl6 xl6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, f53Var, xl6Var, z, 1.39f, z2, z3);
        this.m0 = t7bVar;
    }
}
