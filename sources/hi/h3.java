package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ue;
public final class h3 extends e3 {
    public final int f14722l0 = 0;
    public final Object m0;

    public h3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override
    public void a() {
        switch (this.f14722l0) {
            case 1:
                ta taVar = (ta) this.m0;
                taVar.N0.setTranslationY(taVar.f15464n.getMeasuredHeight() - taVar.N0.g());
                c9 c9Var = taVar.f15479r2;
                if (c9Var != null) {
                    c9Var.run();
                    taVar.f15479r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f14722l0) {
            case 1:
                if (((ta) this.m0).f15445g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new k(this, 18));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f14722l0) {
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
        switch (this.f14722l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f14722l0) {
            case 1:
                super.setTranslationY(f10);
                ta taVar = (ta) this.m0;
                if (taVar.f15461l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (taVar.f15464n.getMeasuredHeight() - taVar.N0.g())), 1.0f, 0.0f);
                    taVar.f15476r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    taVar.f15476r.setAlpha(1.0f - (0.6f * i7));
                    taVar.f15454j0.setAlpha(1.0f - i7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public h3(ta taVar, int i7, Context context, fi.b bVar, ue ueVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, ueVar, z10, 1.39f, z11, z12);
        this.m0 = taVar;
    }
}
