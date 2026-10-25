package bi;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class m6 extends j6 {
    public final boolean f5086c;
    public final ImageReceiver d;

    public m6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f4873a = stargiftattributemodel.name;
        this.f4874b = stargiftattributemodel.getRarityPermille();
        this.f5086c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        dd.Y0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f5086c) {
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

    public m6(org.telegram.ui.Components.y9 y9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f4873a = stargiftattributemodel.name;
        this.f4874b = stargiftattributemodel.getRarityPermille();
        this.f5086c = false;
        this.d = y9Var.getImageReceiver();
    }
}
