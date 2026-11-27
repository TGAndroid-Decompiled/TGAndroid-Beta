package defpackage;

import android.view.View;
public final class uj4 extends hn {
    public final byte e0 = 0;
    public final Object f0;

    public uj4(View view) {
        super(false, false, false, false, true);
        this.f0 = view;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        Object obj = this.f0;
        switch (b) {
            case 0:
                ((View) obj).invalidate();
                return;
            case 1:
                ((Runnable) obj).run();
                return;
            default:
                ((voa) obj).invalidate();
                return;
        }
    }

    public uj4(Runnable runnable) {
        super(false, true, true, true, false);
        this.f0 = runnable;
    }

    public uj4(voa voaVar) {
        super(false, false, false, true, true);
        this.f0 = voaVar;
    }
}
