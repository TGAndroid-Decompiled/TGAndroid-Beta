package ai;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class r6 extends o6 {
    public final boolean f2118c;
    public final ImageReceiver d;

    public r6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1937a = stargiftattributemodel.name;
        this.f1938b = stargiftattributemodel.getRarityPermille();
        this.f2118c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        nd.a1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f2118c) {
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

    public r6(org.telegram.ui.Components.u9 u9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1937a = stargiftattributemodel.name;
        this.f1938b = stargiftattributemodel.getRarityPermille();
        this.f2118c = false;
        this.d = u9Var.getImageReceiver();
    }
}
