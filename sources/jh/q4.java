package jh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 extends n4 {
    public final boolean f12659c;
    public final ImageReceiver d;

    public q4(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f12508a = stargiftattributemodel.name;
        this.f12509b = stargiftattributemodel.getRarityPermille();
        this.f12659c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        ia.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f12659c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.getLottieAnimation() != null) {
            return true;
        }
        return false;
    }

    public q4(org.telegram.ui.Components.t9 t9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f12508a = stargiftattributemodel.name;
        this.f12509b = stargiftattributemodel.getRarityPermille();
        this.f12659c = false;
        this.d = t9Var.getImageReceiver();
    }
}
