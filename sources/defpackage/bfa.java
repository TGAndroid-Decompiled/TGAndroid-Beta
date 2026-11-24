package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;
public final class bfa extends ClippingImageView {
    public final sea S;

    public bfa(Context context, sea seaVar) {
        super(context);
        this.S = seaVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
