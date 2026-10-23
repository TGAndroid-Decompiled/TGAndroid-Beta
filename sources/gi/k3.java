package gi;

import ai.f9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j80;
public final class k3 implements View.OnClickListener {
    public final int f11319a = 1;
    public final int f11320b;
    public final org.telegram.ui.ActionBar.h3 f11321c;
    public final g6 d;
    public final long e;
    public final Context f11322f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f11323n;

    public k3(int i10, org.telegram.ui.ActionBar.h3 h3Var, g6 g6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f11320b = i10;
        this.f11321c = h3Var;
        this.d = g6Var;
        this.f11323n = linearLayout;
        this.e = j10;
        this.f11322f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f11319a) {
            case 0:
                ai.y0 y0Var = (ai.y0) this.f11323n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f11320b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new g3(this.f11321c, this.f11322f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                y0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f11323n;
                int i11 = this.f11320b;
                ai.k0 g10 = ai.k0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f1604j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f1606l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.h3 h3Var = this.f11321c;
                ViewGroup containerView = h3Var.getContainerView();
                g6 g6Var = this.d;
                j80 F = j80.F(containerView, g6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f20490id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f20343id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new f9(i11, j10, this.f11322f, this.h, h3Var, g6Var));
                    i12 = i13;
                }
                F.f27581t = false;
                F.f27580s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public k3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.h3 h3Var, Context context, long j10, g6 g6Var, ai.y0 y0Var) {
        this.h = connectedbotstarref;
        this.f11320b = i10;
        this.f11321c = h3Var;
        this.f11322f = context;
        this.e = j10;
        this.d = g6Var;
        this.f11323n = y0Var;
    }
}
