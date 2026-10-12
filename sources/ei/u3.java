package ei;

import ai.i5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.s80;
public final class u3 implements View.OnClickListener {
    public final int f9392a = 1;
    public final int f9393b;
    public final org.telegram.ui.ActionBar.e3 f9394c;
    public final c6 d;
    public final long f9395e;
    public final Context f9396f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9397n;

    public u3(int i10, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9393b = i10;
        this.f9394c = e3Var;
        this.d = c6Var;
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
                i5 i5Var = (i5) this.f9397n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9393b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f9394c, this.f9396f, i10, this.f9395e, this.d, 0));
                        return;
                    }
                    return;
                }
                i5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9397n;
                int i11 = this.f9393b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f53186j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f53188l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.e3 e3Var = this.f9394c;
                ViewGroup containerView = e3Var.getContainerView();
                c6 c6Var = this.d;
                s80 F = s80.F(containerView, c6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f19950id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f19803id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f9395e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f9396f, this.h, e3Var, c6Var));
                    i12 = i13;
                }
                F.f30469t = false;
                F.f30468s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.e3 e3Var, Context context, long j3, c6 c6Var, i5 i5Var) {
        this.h = connectedbotstarref;
        this.f9393b = i10;
        this.f9394c = e3Var;
        this.f9396f = context;
        this.f9395e = j3;
        this.d = c6Var;
        this.f9397n = i5Var;
    }
}
