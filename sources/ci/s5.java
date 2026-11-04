package ci;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class s5 extends p5 {
    public final boolean f5953c;
    public final ImageReceiver d;

    public s5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f5748a = stargiftattributemodel.name;
        this.f5749b = stargiftattributemodel.getRarityPermille();
        this.f5953c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        wb.c1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f5953c) {
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

    public s5(org.telegram.ui.Components.k9 k9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f5748a = stargiftattributemodel.name;
        this.f5749b = stargiftattributemodel.getRarityPermille();
        this.f5953c = false;
        this.d = k9Var.getImageReceiver();
    }
}
