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
    public final int f9391a = 1;
    public final int f9392b;
    public final org.telegram.ui.ActionBar.f3 f9393c;
    public final d6 d;
    public final long f9394e;
    public final Context f9395f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9396n;

    public v3(int i10, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9392b = i10;
        this.f9393c = f3Var;
        this.d = d6Var;
        this.f9396n = linearLayout;
        this.f9394e = j3;
        this.f9395f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f9391a) {
            case 0:
                h5 h5Var = (h5) this.f9396n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9392b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new r3(this.f9393c, this.f9395f, i10, this.f9394e, this.d, 0));
                        return;
                    }
                    return;
                }
                h5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9396n;
                int i11 = this.f9392b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f51722j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f51724l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f9393c;
                ViewGroup containerView = f3Var.getContainerView();
                d6 d6Var = this.d;
                b80 F = b80.F(containerView, d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20185id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f20038id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f9394e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new q3(i11, j3, this.f9395f, this.h, f3Var, d6Var));
                    i12 = i13;
                }
                F.f24846t = false;
                F.f24845s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public v3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, d6 d6Var, h5 h5Var) {
        this.h = connectedbotstarref;
        this.f9392b = i10;
        this.f9393c = f3Var;
        this.f9395f = context;
        this.f9394e = j3;
        this.d = d6Var;
        this.f9396n = h5Var;
    }
}
