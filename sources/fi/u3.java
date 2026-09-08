package fi;

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
import org.telegram.ui.Components.n70;
public final class u3 implements View.OnClickListener {
    public final int f10025a = 1;
    public final int f10026b;
    public final org.telegram.ui.ActionBar.f3 f10027c;
    public final f6 d;
    public final long f10028e;
    public final Context f10029f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f10030n;

    public u3(int i10, org.telegram.ui.ActionBar.f3 f3Var, f6 f6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f10026b = i10;
        this.f10027c = f3Var;
        this.d = f6Var;
        this.f10030n = linearLayout;
        this.f10028e = j3;
        this.f10029f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f10025a) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f10030n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f10026b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f10027c, this.f10029f, i10, this.f10028e, this.d, 0));
                        return;
                    }
                    return;
                }
                bVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f10030n;
                int i11 = this.f10026b;
                zh.o g10 = zh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f52386j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f52388l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f10027c;
                ViewGroup containerView = f3Var.getContainerView();
                f6 f6Var = this.d;
                n70 F = n70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20043id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f19896id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f10028e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f10029f, this.h, f3Var, f6Var));
                    i12 = i13;
                }
                F.f28688t = false;
                F.f28687s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, f6 f6Var, androidx.car.app.utils.b bVar) {
        this.h = connectedbotstarref;
        this.f10026b = i10;
        this.f10027c = f3Var;
        this.f10029f = context;
        this.f10028e = j3;
        this.d = f6Var;
        this.f10030n = bVar;
    }
}
