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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a80;
public final class u3 implements View.OnClickListener {
    public final int f8633a = 1;
    public final int f8634b;
    public final org.telegram.ui.ActionBar.g3 f8635c;
    public final e6 d;
    public final long e;
    public final Context f8636f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f8637n;

    public u3(int i10, org.telegram.ui.ActionBar.g3 g3Var, e6 e6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f8634b = i10;
        this.f8635c = g3Var;
        this.d = e6Var;
        this.f8637n = linearLayout;
        this.e = j3;
        this.f8636f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f8633a) {
            case 0:
                h5 h5Var = (h5) this.f8637n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f8634b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f8635c, this.f8636f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                h5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f8637n;
                int i11 = this.f8634b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47853j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47855l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.g3 g3Var = this.f8635c;
                ViewGroup containerView = g3Var.getContainerView();
                e6 e6Var = this.d;
                a80 F = a80.F(containerView, e6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18476id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f18329id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f8636f, this.h, g3Var, e6Var));
                    i12 = i13;
                }
                F.f22607t = false;
                F.f22606s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.g3 g3Var, Context context, long j3, e6 e6Var, h5 h5Var) {
        this.h = connectedbotstarref;
        this.f8634b = i10;
        this.f8635c = g3Var;
        this.f8636f = context;
        this.e = j3;
        this.d = e6Var;
        this.f8637n = h5Var;
    }
}
