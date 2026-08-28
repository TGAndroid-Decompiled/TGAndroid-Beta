package bg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.lg;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cr;
import org.telegram.ui.dy;
public final class f1 implements View.OnClickListener {
    public final int f1754a;
    public final long f1755b;
    public final Object f1756c;
    public final Object d;
    public final Object f1757e;

    public f1(h1 h1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f1754a = 0;
        this.f1756c = h1Var;
        this.d = prepaidGiveaway;
        this.f1755b = j10;
        this.f1757e = o2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1754a) {
            case 0:
                h1.O((h1) this.f1756c, (TL_stories.PrepaidGiveaway) this.d, this.f1755b, (org.telegram.ui.ActionBar.o2) this.f1757e);
                return;
            case 1:
                cr.R((cr) this.f1756c, (Context) this.d, (kh.d) this.f1757e, this.f1755b);
                return;
            default:
                dy dyVar = (dy) this.f1756c;
                dyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new lg(dyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f1757e, this.f1755b, 7), 100L);
                return;
        }
    }

    public f1(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f1754a = i9;
        this.f1756c = obj;
        this.d = obj2;
        this.f1757e = obj3;
        this.f1755b = j10;
    }
}
