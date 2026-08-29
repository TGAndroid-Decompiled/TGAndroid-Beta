package eg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.sg;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fr;
import org.telegram.ui.fy;
public final class a1 implements View.OnClickListener {
    public final int f5915a;
    public final long f5916b;
    public final Object f5917c;
    public final Object d;
    public final Object f5918e;

    public a1(c1 c1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f5915a = 0;
        this.f5917c = c1Var;
        this.d = prepaidGiveaway;
        this.f5916b = j10;
        this.f5918e = o2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5915a) {
            case 0:
                c1.P((c1) this.f5917c, (TL_stories.PrepaidGiveaway) this.d, this.f5916b, (org.telegram.ui.ActionBar.o2) this.f5918e);
                return;
            case 1:
                fr.S((fr) this.f5917c, (Context) this.d, (nh.d) this.f5918e, this.f5916b);
                return;
            default:
                fy fyVar = (fy) this.f5917c;
                fyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new sg(fyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f5918e, this.f5916b, 7), 100L);
                return;
        }
    }

    public a1(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f5915a = i10;
        this.f5917c = obj;
        this.d = obj2;
        this.f5918e = obj3;
        this.f5916b = j10;
    }
}
