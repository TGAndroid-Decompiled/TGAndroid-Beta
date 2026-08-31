package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.di;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lr;
import org.telegram.ui.py;
public final class z0 implements View.OnClickListener {
    public final int f7682a;
    public final long f7683b;
    public final Object f7684c;
    public final Object d;
    public final Object f7685e;

    public z0(b1 b1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f7682a = 0;
        this.f7684c = b1Var;
        this.d = prepaidGiveaway;
        this.f7683b = j10;
        this.f7685e = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7682a) {
            case 0:
                b1.P((b1) this.f7684c, (TL_stories.PrepaidGiveaway) this.d, this.f7683b, (org.telegram.ui.ActionBar.p2) this.f7685e);
                return;
            case 1:
                lr.S((lr) this.f7684c, (Context) this.d, (qh.d) this.f7685e, this.f7683b);
                return;
            default:
                py pyVar = (py) this.f7684c;
                pyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new di(pyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f7685e, this.f7683b, 6), 100L);
                return;
        }
    }

    public z0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f7682a = i10;
        this.f7684c = obj;
        this.d = obj2;
        this.f7685e = obj3;
        this.f7683b = j10;
    }
}
