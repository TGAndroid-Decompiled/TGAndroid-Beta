package lh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 extends m4 {
    public final boolean f12917c;
    public final ImageReceiver d;

    public p4(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f12796a = stargiftattributemodel.name;
        this.f12797b = stargiftattributemodel.getRarityPermille();
        this.f12917c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        ja.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f12917c) {
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

    public p4(org.telegram.ui.Components.p9 p9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f12796a = stargiftattributemodel.name;
        this.f12797b = stargiftattributemodel.getRarityPermille();
        this.f12917c = false;
        this.d = p9Var.getImageReceiver();
    }
}
