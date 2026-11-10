package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.we;
public final class i3 extends f3 {
    public final int f12185k0 = 0;
    public final Object f12186l0;

    public i3(int i7, Context context, di.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.f12186l0 = str;
    }

    @Override
    public void a() {
        switch (this.f12185k0) {
            case 1:
                va vaVar = (va) this.f12186l0;
                vaVar.M0.setTranslationY(vaVar.f12977n.getMeasuredHeight() - vaVar.M0.g());
                e9 e9Var = vaVar.f12988q2;
                if (e9Var != null) {
                    e9Var.run();
                    vaVar.f12988q2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z9) {
        switch (this.f12185k0) {
            case 1:
                if (((va) this.f12186l0).f12955f0 == 0 && z9) {
                    org.telegram.messenger.g0.h3(new v9(this, 0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12185k0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    va vaVar = (va) this.f12186l0;
                    vaVar.L0 = true;
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
        switch (this.f12185k0) {
            case 0:
                return (String) this.f12186l0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12185k0) {
            case 1:
                super.setTranslationY(f10);
                va vaVar = (va) this.f12186l0;
                if (vaVar.f12972k2) {
                    float i7 = Utilities.i(1.0f - (f10 / (vaVar.f12977n.getMeasuredHeight() - vaVar.M0.g())), 1.0f, 0.0f);
                    vaVar.f12989r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    vaVar.f12989r.setAlpha(1.0f - (0.6f * i7));
                    vaVar.f12964i0.setAlpha(1.0f - i7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public i3(va vaVar, int i7, Context context, di.b bVar, we weVar, boolean z9, boolean z10, boolean z11) {
        super(i7, context, bVar, weVar, z9, 1.39f, z10, z11);
        this.f12186l0 = vaVar;
    }
}
