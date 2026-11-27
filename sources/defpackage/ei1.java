package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class ei1 extends RadialProgressView {
    public final byte O;
    public final Object P;

    public ei1(yn5 yn5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = yn5Var;
    }

    @Override
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                ad8 ad8Var = ((PhotoViewer) this.P).f0;
                if (ad8Var != null) {
                    ad8Var.invalidate();
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
                ((gi1) obj).h.invalidate();
                return;
            case 1:
                super.setAlpha(f);
                ((xc5) obj).e.invalidate();
                return;
            case 2:
                super.setAlpha(f);
                ((cg6) obj).h.invalidate();
                return;
            default:
                super.setAlpha(f);
                ad8 ad8Var = ((PhotoViewer) obj).f0;
                if (ad8Var != null) {
                    ad8Var.invalidate();
                    return;
                }
                return;
        }
    }

    public ei1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vnb vnbVar) {
        super(contextThemeWrapper, vnbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}
