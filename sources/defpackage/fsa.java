package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class fsa extends csa {
    public final boolean c;
    public final ImageReceiver d;

    public fsa(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        nxa.e1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.c) {
            this.d.K();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.y() != null) {
            return true;
        }
        return false;
    }

    public fsa(bf0 bf0Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = bf0Var.getImageReceiver();
    }
}
