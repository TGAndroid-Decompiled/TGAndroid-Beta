package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;
public final class x extends FrameLayout {
    public final int f5634a;
    public final ArrayList f5635b;
    public final r71 f5636c;
    public String d;
    public boolean e;
    public boolean f5637f;
    public boolean h;
    public final a3.d f5638n;
    public final y f5639r;

    public x(y yVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        oi.q qVar;
        this.f5639r = yVar;
        this.f5635b = new ArrayList();
        this.d = "";
        this.f5638n = new a3.d(this, 17);
        this.f5634a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
        int classGuid = yVar.getClassGuid();
        ai.e eVar = new ai.e(this, 3);
        a1.c cVar = new a1.c(this, 4);
        u6Var = ((org.telegram.ui.ActionBar.r2) yVar).resourceProvider;
        r71 r71Var = new r71(context, i11, classGuid, true, eVar, cVar, null, u6Var);
        this.f5636c = r71Var;
        r71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        r71Var.f32150g3.f29505r = false;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        r71Var.setClipToPadding(false);
        r71Var.setOverScrollMode(0);
        addView(r71Var, gb1.g(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.r2) yVar).glassEngine;
        qVar.b(r71Var);
        r71Var.j(new ai.b(this, 3));
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        y yVar = this.f5639r;
        if (!yVar.O && !this.e && !this.f5637f && !this.h) {
            boolean z11 = true;
            this.e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i13 = this.f5634a;
            if (i13 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i13 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            i10 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(yVar.f5716b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f5636c.f32150g3.O(false);
            i11 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new j(1, this, str));
            i12 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
            ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, yVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f5638n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5638n);
        super.onDetachedFromWindow();
    }
}
