package bi;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class q6 extends n6 {
    public final boolean f4574c;
    public final ImageReceiver d;

    public q6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f4408a = stargiftattributemodel.name;
        this.f4409b = stargiftattributemodel.getRarityPermille();
        this.f4574c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        dd.c1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f4574c) {
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

    public q6(org.telegram.ui.Components.l9 l9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f4408a = stargiftattributemodel.name;
        this.f4409b = stargiftattributemodel.getRarityPermille();
        this.f4574c = false;
        this.d = l9Var.getImageReceiver();
    }
}
