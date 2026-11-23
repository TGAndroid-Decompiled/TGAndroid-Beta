package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ve;
public final class g3 extends d3 {
    public final int f14636l0 = 0;
    public final Object m0;

    public g3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override
    public void a() {
        switch (this.f14636l0) {
            case 1:
                ta taVar = (ta) this.m0;
                taVar.N0.setTranslationY(taVar.f15428n.getMeasuredHeight() - taVar.N0.g());
                c9 c9Var = taVar.f15443r2;
                if (c9Var != null) {
                    c9Var.run();
                    taVar.f15443r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f14636l0) {
            case 1:
                if (((ta) this.m0).f15409g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new b0(this, 17));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f14636l0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    ta taVar = (ta) this.m0;
                    taVar.M0 = true;
                    taVar.e(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public String getTitle() {
        switch (this.f14636l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f14636l0) {
            case 1:
                super.setTranslationY(f10);
                ta taVar = (ta) this.m0;
                if (taVar.f15425l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (taVar.f15428n.getMeasuredHeight() - taVar.N0.g())), 1.0f, 0.0f);
                    taVar.f15440r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    taVar.f15440r.setAlpha(1.0f - (0.6f * i7));
                    taVar.f15418j0.setAlpha(1.0f - i7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public g3(ta taVar, int i7, Context context, fi.b bVar, ve veVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, veVar, z10, 1.39f, z11, z12);
        this.m0 = taVar;
    }
}
