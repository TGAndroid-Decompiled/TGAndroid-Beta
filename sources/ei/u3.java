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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.p80;
public final class u3 implements View.OnClickListener {
    public final int f9395a = 1;
    public final int f9396b;
    public final org.telegram.ui.ActionBar.f3 f9397c;
    public final e6 d;
    public final long f9398e;
    public final Context f9399f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9400n;

    public u3(int i10, org.telegram.ui.ActionBar.f3 f3Var, e6 e6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9396b = i10;
        this.f9397c = f3Var;
        this.d = e6Var;
        this.f9400n = linearLayout;
        this.f9398e = j3;
        this.f9399f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f9395a) {
            case 0:
                i5 i5Var = (i5) this.f9400n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9396b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f9397c, this.f9399f, i10, this.f9398e, this.d, 0));
                        return;
                    }
                    return;
                }
                i5Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9400n;
                int i11 = this.f9396b;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f52950j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f52952l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f9397c;
                ViewGroup containerView = f3Var.getContainerView();
                e6 e6Var = this.d;
                p80 F = p80.F(containerView, e6Var, linearLayout);
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
                    if (j3 == this.f9398e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f9399f, this.h, f3Var, e6Var));
                    i12 = i13;
                }
                F.f29790t = false;
                F.f29789s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, e6 e6Var, i5 i5Var) {
        this.h = connectedbotstarref;
        this.f9396b = i10;
        this.f9397c = f3Var;
        this.f9399f = context;
        this.f9398e = j3;
        this.d = e6Var;
        this.f9400n = i5Var;
    }
}
