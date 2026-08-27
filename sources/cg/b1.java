package cg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.pg;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ar;
import org.telegram.ui.gy;

public final class b1 implements View.OnClickListener {

    public final int f2610a;

    public final long f2611b;

    public final Object f2612c;
    public final Object d;

    public final Object f2613e;

    public b1(d1 d1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f2610a = 0;
        this.f2612c = d1Var;
        this.d = prepaidGiveaway;
        this.f2611b = j10;
        this.f2613e = n2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2610a) {
            case 0:
                d1.P((d1) this.f2612c, (TL_stories.PrepaidGiveaway) this.d, this.f2611b, (org.telegram.ui.ActionBar.n2) this.f2613e);
                break;
            case 1:
                ar.S((ar) this.f2612c, (Context) this.d, (lh.d) this.f2613e, this.f2611b);
                break;
            default:
                gy gyVar = (gy) this.f2612c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f2613e;
                gyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new pg(gyVar, dialogFilter, dialog, this.f2611b, 7), 100L);
                break;
        }
    }

    public b1(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f2610a = i10;
        this.f2612c = obj;
        this.d = obj2;
        this.f2613e = obj3;
        this.f2611b = j10;
    }
}
