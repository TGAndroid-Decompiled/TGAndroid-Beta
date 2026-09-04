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
    public final int f9997a = 1;
    public final int f9998b;
    public final org.telegram.ui.ActionBar.f3 f9999c;
    public final f6 d;
    public final long f10000e;
    public final Context f10001f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f10002n;

    public u3(int i10, org.telegram.ui.ActionBar.f3 f3Var, f6 f6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9998b = i10;
        this.f9999c = f3Var;
        this.d = f6Var;
        this.f10002n = linearLayout;
        this.f10000e = j3;
        this.f10001f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f9997a) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f10002n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9998b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new q3(this.f9999c, this.f10001f, i10, this.f10000e, this.d, 0));
                        return;
                    }
                    return;
                }
                bVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f10002n;
                int i11 = this.f9998b;
                zh.o g10 = zh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f52355j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f52357l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f9999c;
                ViewGroup containerView = f3Var.getContainerView();
                f6 f6Var = this.d;
                n70 F = n70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20016id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f19869id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.f10000e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j3, this.f10001f, this.h, f3Var, f6Var));
                    i12 = i13;
                }
                F.f28661t = false;
                F.f28660s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j3, f6 f6Var, androidx.car.app.utils.b bVar) {
        this.h = connectedbotstarref;
        this.f9998b = i10;
        this.f9999c = f3Var;
        this.f10001f = context;
        this.f10000e = j3;
        this.d = f6Var;
        this.f10002n = bVar;
    }
}
