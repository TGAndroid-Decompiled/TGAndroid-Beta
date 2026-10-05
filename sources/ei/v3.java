package ei;

import ai.h5;
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
import org.telegram.ui.Components.b80;
public final class v3 implements View.OnClickListener {
    public final int f9392a = 1;
    public final int f9393b;
    public final org.telegram.ui.ActionBar.f3 f9394c;
    public final d6 d;
    public final long f9395e;
    public final Context f9396f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9397n;

    public v3(int i10, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9393b = i10;
        this.f9394c = f3Var;
        this.d = d6Var;
        this.f9397n = linearLayout;
        this.f9395e = j3;
        this.f9396f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f9392a) {
            case 0:
                h5 h5Var = (h5) this.f9397n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9393b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new r3(this.f9394c, this.f9396f, i10, this.f9395e, this.d, 0));
                        return;
                    }
                    return;
                }
                h5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9397n;
                int i11 = this.f9393b;
                yh.p g10 = yh.p.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f51775j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f51777l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f9394c;
                ViewGroup containerView = f3Var.getContainerView();
                d6 d6Var = this.d;
                b80 F = b80.F(containerView, d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20194id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f20047id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f9395e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new q3(i11, j3, this.f9396f, this.h, f3Var, d6Var));
                    i12 = i13;
                }
                F.f24886t = false;
                F.f24885s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public v3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, d6 d6Var, h5 h5Var) {
        this.h = connectedbotstarref;
        this.f9393b = i10;
        this.f9394c = f3Var;
        this.f9396f = context;
        this.f9395e = j3;
        this.d = d6Var;
        this.f9397n = h5Var;
    }
}
