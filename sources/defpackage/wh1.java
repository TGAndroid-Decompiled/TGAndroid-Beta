package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class wh1 extends RadialProgressView {
    public final byte O;
    public final Object P;

    public wh1(vl5 vl5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = vl5Var;
    }

    @Override
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                k98 k98Var = ((PhotoViewer) this.P).f0;
                if (k98Var != null) {
                    k98Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        byte b = this.O;
        Object obj = this.P;
        switch (b) {
            case 0:
                super.setAlpha(f);
                ((yh1) obj).h.invalidate();
                return;
            case 1:
                super.setAlpha(f);
                ((wa5) obj).e.invalidate();
                return;
            case 2:
                super.setAlpha(f);
                ((ae6) obj).h.invalidate();
                return;
            default:
                super.setAlpha(f);
                k98 k98Var = ((PhotoViewer) obj).f0;
                if (k98Var != null) {
                    k98Var.invalidate();
                    return;
                }
                return;
        }
    }

    public wh1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, wjb wjbVar) {
        super(contextThemeWrapper, wjbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}
