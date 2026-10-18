package ai;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class q6 extends n6 {
    public final boolean f2065c;
    public final ImageReceiver d;

    public q6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1896a = stargiftattributemodel.name;
        this.f1897b = stargiftattributemodel.getRarityPermille();
        this.f2065c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        md.a1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f2065c) {
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

    public q6(org.telegram.ui.Components.w9 w9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f1896a = stargiftattributemodel.name;
        this.f1897b = stargiftattributemodel.getRarityPermille();
        this.f2065c = false;
        this.d = w9Var.getImageReceiver();
    }
}
