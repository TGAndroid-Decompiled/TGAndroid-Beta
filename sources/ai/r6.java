package ai;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class r6 extends o6 {
    public final boolean f2113c;
    public final ImageReceiver d;

    public r6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1936a = stargiftattributemodel.name;
        this.f1937b = stargiftattributemodel.getRarityPermille();
        this.f2113c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        md.a1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f2113c) {
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

    public r6(org.telegram.ui.Components.w9 w9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1936a = stargiftattributemodel.name;
        this.f1937b = stargiftattributemodel.getRarityPermille();
        this.f2113c = false;
        this.d = w9Var.getImageReceiver();
    }
}
