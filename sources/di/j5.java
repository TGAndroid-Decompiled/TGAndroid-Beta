package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class j5 extends g5 {
    public final boolean f8855c;
    public final ImageReceiver d;

    public j5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f8614a = stargiftattributemodel.name;
        this.f8615b = stargiftattributemodel.getRarityPermille();
        this.f8855c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        lb.c1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f8855c) {
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

    public j5(org.telegram.ui.Components.i9 i9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f8614a = stargiftattributemodel.name;
        this.f8615b = stargiftattributemodel.getRarityPermille();
        this.f8855c = false;
        this.d = i9Var.getImageReceiver();
    }
}
