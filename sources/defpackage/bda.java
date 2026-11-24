package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;
public final class bda extends ClippingImageView {
    public final sca S;

    public bda(Context context, sca scaVar) {
        super(context);
        this.S = scaVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
