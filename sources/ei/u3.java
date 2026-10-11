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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.q80;
public final class u3 implements View.OnClickListener {
    public final int f9394a = 1;
    public final int f9395b;
    public final org.telegram.ui.ActionBar.e3 f9396c;
    public final d6 d;
    public final long f9397e;
    public final Context f9398f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9399n;

    public u3(int i10, org.telegram.ui.ActionBar.e3 e3Var, d6 d6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9395b = i10;
        this.f9396c = e3Var;
        this.d = d6Var;
        this.f9399n = linearLayout;
        this.f9397e = j3;
        this.f9398f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f9394a) {
            case 0:
                i5 i5Var = (i5) this.f9399n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9395b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f9396c, this.f9398f, i10, this.f9397e, this.d, 0));
                        return;
                    }
                    return;
                }
                i5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9399n;
                int i11 = this.f9395b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f53037j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f53039l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.e3 e3Var = this.f9396c;
                ViewGroup containerView = e3Var.getContainerView();
                d6 d6Var = this.d;
                q80 F = q80.F(containerView, d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20179id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f20032id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f9397e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f9398f, this.h, e3Var, d6Var));
                    i12 = i13;
                }
                F.f30084t = false;
                F.f30083s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.e3 e3Var, Context context, long j3, d6 d6Var, i5 i5Var) {
        this.h = connectedbotstarref;
        this.f9395b = i10;
        this.f9396c = e3Var;
        this.f9398f = context;
        this.f9397e = j3;
        this.d = d6Var;
        this.f9399n = i5Var;
    }
}
