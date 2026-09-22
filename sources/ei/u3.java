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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.y70;
public final class u3 implements View.OnClickListener {
    public final int f8647a = 1;
    public final int f8648b;
    public final org.telegram.ui.ActionBar.f3 f8649c;
    public final f6 d;
    public final long e;
    public final Context f8650f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f8651n;

    public u3(int i10, org.telegram.ui.ActionBar.f3 f3Var, f6 f6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f8648b = i10;
        this.f8649c = f3Var;
        this.d = f6Var;
        this.f8651n = linearLayout;
        this.e = j3;
        this.f8650f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f8647a) {
            case 0:
                i5 i5Var = (i5) this.f8651n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f8648b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f8649c, this.f8650f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                i5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f8651n;
                int i11 = this.f8648b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47854j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47856l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f8649c;
                ViewGroup containerView = f3Var.getContainerView();
                f6 f6Var = this.d;
                y70 F = y70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18490id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f18343id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f8650f, this.h, f3Var, f6Var));
                    i12 = i13;
                }
                F.f30569t = false;
                F.f30568s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, f6 f6Var, i5 i5Var) {
        this.h = connectedbotstarref;
        this.f8648b = i10;
        this.f8649c = f3Var;
        this.f8650f = context;
        this.e = j3;
        this.d = f6Var;
        this.f8651n = i5Var;
    }
}
