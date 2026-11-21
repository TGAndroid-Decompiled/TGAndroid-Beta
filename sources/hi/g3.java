package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ue;
public final class g3 extends d3 {
    public final int f14704l0 = 0;
    public final Object m0;

    public g3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override
    public void a() {
        switch (this.f14704l0) {
            case 1:
                sa saVar = (sa) this.m0;
                saVar.N0.setTranslationY(saVar.f15422n.getMeasuredHeight() - saVar.N0.g());
                b9 b9Var = saVar.f15437r2;
                if (b9Var != null) {
                    b9Var.run();
                    saVar.f15437r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f14704l0) {
            case 1:
                if (((sa) this.m0).f15403g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new l(this, 18));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f14704l0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    sa saVar = (sa) this.m0;
                    saVar.M0 = true;
                    saVar.e(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public String getTitle() {
        switch (this.f14704l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f14704l0) {
            case 1:
                super.setTranslationY(f10);
                sa saVar = (sa) this.m0;
                if (saVar.f15419l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (saVar.f15422n.getMeasuredHeight() - saVar.N0.g())), 1.0f, 0.0f);
                    saVar.f15434r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    saVar.f15434r.setAlpha(1.0f - (0.6f * i7));
                    saVar.f15412j0.setAlpha(1.0f - i7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public g3(sa saVar, int i7, Context context, fi.b bVar, ue ueVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, ueVar, z10, 1.39f, z11, z12);
        this.m0 = saVar;
    }
}
