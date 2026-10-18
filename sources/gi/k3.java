package gi;

import ai.e9;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.i80;
public final class k3 implements View.OnClickListener {
    public final int f11298a = 1;
    public final int f11299b;
    public final org.telegram.ui.ActionBar.f3 f11300c;
    public final d6 d;
    public final long e;
    public final Context f11301f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f11302n;

    public k3(int i10, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f11299b = i10;
        this.f11300c = f3Var;
        this.d = d6Var;
        this.f11302n = linearLayout;
        this.e = j10;
        this.f11301f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f11298a) {
            case 0:
                ai.y0 y0Var = (ai.y0) this.f11302n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f11299b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new g3(this.f11300c, this.f11301f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                y0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f11302n;
                int i11 = this.f11299b;
                ai.k0 g10 = ai.k0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f1620j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f1622l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f11300c;
                ViewGroup containerView = f3Var.getContainerView();
                d6 d6Var = this.d;
                i80 F = i80.F(containerView, d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f20419id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f20272id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new e9(i11, j10, this.f11301f, this.h, f3Var, d6Var));
                    i12 = i13;
                }
                F.f27135t = false;
                F.f27134s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public k3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j10, d6 d6Var, ai.y0 y0Var) {
        this.h = connectedbotstarref;
        this.f11299b = i10;
        this.f11300c = f3Var;
        this.f11301f = context;
        this.e = j10;
        this.d = d6Var;
        this.f11302n = y0Var;
    }
}
