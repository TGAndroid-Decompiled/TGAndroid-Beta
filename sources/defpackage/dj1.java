package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class dj1 extends RadialProgressView {
    public final byte O;
    public final Object P;

    public dj1(vn5 vn5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = vn5Var;
    }

    @Override
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                lb8 lb8Var = ((PhotoViewer) this.P).f0;
                if (lb8Var != null) {
                    lb8Var.invalidate();
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
                ((fj1) obj).h.invalidate();
                return;
            case 1:
                super.setAlpha(f);
                ((uc5) obj).e.invalidate();
                return;
            case 2:
                super.setAlpha(f);
                ((zf6) obj).h.invalidate();
                return;
            default:
                super.setAlpha(f);
                lb8 lb8Var = ((PhotoViewer) obj).f0;
                if (lb8Var != null) {
                    lb8Var.invalidate();
                    return;
                }
                return;
        }
    }

    public dj1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, ylb ylbVar) {
        super(contextThemeWrapper, ylbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}
