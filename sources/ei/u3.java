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
import org.telegram.ui.Components.y70;
public final class u3 implements View.OnClickListener {
    public final int f8630a = 1;
    public final int f8631b;
    public final org.telegram.ui.ActionBar.e3 f8632c;
    public final d6 d;
    public final long e;
    public final Context f8633f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f8634n;

    public u3(int i10, org.telegram.ui.ActionBar.e3 e3Var, d6 d6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f8631b = i10;
        this.f8632c = e3Var;
        this.d = d6Var;
        this.f8634n = linearLayout;
        this.e = j3;
        this.f8633f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f8630a) {
            case 0:
                h5 h5Var = (h5) this.f8634n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f8631b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f8632c, this.f8633f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                h5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f8634n;
                int i11 = this.f8631b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47790j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47792l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.e3 e3Var = this.f8632c;
                ViewGroup containerView = e3Var.getContainerView();
                d6 d6Var = this.d;
                y70 F = y70.F(containerView, d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18482id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f18335id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f8633f, this.h, e3Var, d6Var));
                    i12 = i13;
                }
                F.f30555t = false;
                F.f30554s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.e3 e3Var, Context context, long j3, d6 d6Var, h5 h5Var) {
        this.h = connectedbotstarref;
        this.f8631b = i10;
        this.f8632c = e3Var;
        this.f8633f = context;
        this.e = j3;
        this.d = d6Var;
        this.f8634n = h5Var;
    }
}
