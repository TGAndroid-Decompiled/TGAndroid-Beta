package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;
public final class sga extends ClippingImageView {
    public final jga S;

    public sga(Context context, jga jgaVar) {
        super(context);
        this.S = jgaVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
