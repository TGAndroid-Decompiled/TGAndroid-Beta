package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.a9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k80;
public final class t3 implements View.OnClickListener {
    public final int f13288a = 1;
    public final int f13289b;
    public final org.telegram.ui.ActionBar.k3 f13290c;
    public final u6 d;
    public final long e;
    public final Context f13291f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f13292n;

    public t3(int i10, org.telegram.ui.ActionBar.k3 k3Var, u6 u6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f13289b = i10;
        this.f13290c = k3Var;
        this.d = u6Var;
        this.f13292n = linearLayout;
        this.e = j10;
        this.f13291f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f13288a) {
            case 0:
                ai.e0 e0Var = (ai.e0) this.f13292n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f13289b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new p3(this.f13290c, this.f13291f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                e0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f13292n;
                int i11 = this.f13289b;
                bi.m0 g7 = bi.m0.g(i11);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.f5068j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.f5070l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.k3 k3Var = this.f13290c;
                ViewGroup containerView = k3Var.getContainerView();
                u6 u6Var = this.d;
                k80 F = k80.F(containerView, u6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f22176id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f22027id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new a9(i11, j10, this.f13291f, this.h, k3Var, u6Var));
                    i12 = i13;
                }
                F.f29869t = false;
                F.f29868s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public t3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.k3 k3Var, Context context, long j10, u6 u6Var, ai.e0 e0Var) {
        this.h = connectedbotstarref;
        this.f13289b = i10;
        this.f13290c = k3Var;
        this.f13291f = context;
        this.e = j10;
        this.d = u6Var;
        this.f13292n = e0Var;
    }
}
