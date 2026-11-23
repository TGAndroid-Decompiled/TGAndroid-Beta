package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
public final class m5 extends j5 {
    public final boolean f9301c;
    public final ImageReceiver d;

    public m5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9064a = stargiftattributemodel.name;
        this.f9065b = stargiftattributemodel.getRarityPermille();
        this.f9301c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        pb.d1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f9301c) {
            this.d.S();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.C() != null) {
            return true;
        }
        return false;
    }

    public m5(org.telegram.ui.Components.p9 p9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f9064a = stargiftattributemodel.name;
        this.f9065b = stargiftattributemodel.getRarityPermille();
        this.f9301c = false;
        this.d = p9Var.getImageReceiver();
    }
}
