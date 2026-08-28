package gh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 extends q4 {
    public final boolean f8913c;
    public final ImageReceiver d;

    public t4(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f8748a = stargiftattributemodel.name;
        this.f8749b = stargiftattributemodel.getRarityPermille();
        this.f8913c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        oa.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f8913c) {
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

    public t4(org.telegram.ui.Components.o9 o9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f8748a = stargiftattributemodel.name;
        this.f8749b = stargiftattributemodel.getRarityPermille();
        this.f8913c = false;
        this.d = o9Var.getImageReceiver();
    }
}
