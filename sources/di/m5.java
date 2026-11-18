package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class m5 extends j5 {
    public final boolean f9307c;
    public final ImageReceiver d;

    public m5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9077a = stargiftattributemodel.name;
        this.f9078b = stargiftattributemodel.getRarityPermille();
        this.f9307c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        pb.d1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f9307c) {
            this.d.R();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.B() != null) {
            return true;
        }
        return false;
    }

    public m5(org.telegram.ui.Components.q9 q9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9077a = stargiftattributemodel.name;
        this.f9078b = stargiftattributemodel.getRarityPermille();
        this.f9307c = false;
        this.d = q9Var.getImageReceiver();
    }
}
