package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ue;
public final class p3 extends m3 {
    public final int f15181l0 = 0;
    public final Object m0;

    public p3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override
    public void a() {
        switch (this.f15181l0) {
            case 1:
                nb nbVar = (nb) this.m0;
                nbVar.N0.setTranslationY(nbVar.f15095n.getMeasuredHeight() - nbVar.N0.g());
                w9 w9Var = nbVar.f15110r2;
                if (w9Var != null) {
                    w9Var.run();
                    nbVar.f15110r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f15181l0) {
            case 1:
                if (((nb) this.m0).f15076g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new w(this, 19));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15181l0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    nb nbVar = (nb) this.m0;
                    nbVar.M0 = true;
                    nbVar.e(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public String getTitle() {
        switch (this.f15181l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f15181l0) {
            case 1:
                super.setTranslationY(f10);
                nb nbVar = (nb) this.m0;
                if (nbVar.f15092l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (nbVar.f15095n.getMeasuredHeight() - nbVar.N0.g())), 1.0f, 0.0f);
                    nbVar.f15107r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    nbVar.f15107r.setAlpha(1.0f - (0.6f * i7));
                    nbVar.f15085j0.setAlpha(1.0f - i7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public p3(nb nbVar, int i7, Context context, fi.b bVar, ue ueVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, ueVar, z10, 1.39f, z11, z12);
        this.m0 = nbVar;
    }
}
