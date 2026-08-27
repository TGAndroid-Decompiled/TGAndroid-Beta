package hh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;

public final class r4 extends o4 {

    public final boolean f9990c;
    public final ImageReceiver d;

    public r4(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9824a = stargiftattributemodel.name;
        this.f9825b = stargiftattributemodel.getRarityPermille();
        this.f9990c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        oa.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f9990c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public r4(org.telegram.ui.Components.n9 n9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9824a = stargiftattributemodel.name;
        this.f9825b = stargiftattributemodel.getRarityPermille();
        this.f9990c = false;
        this.d = n9Var.getImageReceiver();
    }
}
