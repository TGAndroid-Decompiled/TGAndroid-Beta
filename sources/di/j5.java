package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class j5 extends g5 {
    public final boolean f8850c;
    public final ImageReceiver d;

    public j5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f8597a = stargiftattributemodel.name;
        this.f8598b = stargiftattributemodel.getRarityPermille();
        this.f8850c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        mb.c1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f8850c) {
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
        this.f8597a = stargiftattributemodel.name;
        this.f8598b = stargiftattributemodel.getRarityPermille();
        this.f8850c = false;
        this.d = i9Var.getImageReceiver();
    }
}
