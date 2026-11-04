package gi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pe;
public final class g3 extends d3 {
    public final int f12831l0 = 0;
    public final Object m0;

    public g3(int i3, Context context, ei.b bVar, float f10, String str) {
        super(i3, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override
    public void a() {
        switch (this.f12831l0) {
            case 1:
                va vaVar = (va) this.m0;
                vaVar.N0.setTranslationY(vaVar.f13738n.getMeasuredHeight() - vaVar.N0.g());
                f9 f9Var = vaVar.f13754r2;
                if (f9Var != null) {
                    f9Var.run();
                    vaVar.f13754r2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f12831l0) {
            case 1:
                if (((va) this.m0).f13720g0 == 0 && z10) {
                    org.telegram.messenger.g0.h3(new f6(this, 5));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12831l0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    va vaVar = (va) this.m0;
                    vaVar.M0 = true;
                    vaVar.e(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public String getTitle() {
        switch (this.f12831l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12831l0) {
            case 1:
                super.setTranslationY(f10);
                va vaVar = (va) this.m0;
                if (vaVar.f13736l2) {
                    float i3 = Utilities.i(1.0f - (f10 / (vaVar.f13738n.getMeasuredHeight() - vaVar.N0.g())), 1.0f, 0.0f);
                    vaVar.f13751r.b(org.telegram.messenger.g0.L(-32.0f) * i3);
                    vaVar.f13751r.setAlpha(1.0f - (0.6f * i3));
                    vaVar.f13729j0.setAlpha(1.0f - i3);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public g3(va vaVar, int i3, Context context, ei.b bVar, pe peVar, boolean z10, boolean z11, boolean z12) {
        super(i3, context, bVar, peVar, z10, 1.39f, z11, z12);
        this.m0 = vaVar;
    }
}
