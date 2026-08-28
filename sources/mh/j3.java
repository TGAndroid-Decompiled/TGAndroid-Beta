package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gh.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.x60;
public final class j3 implements View.OnClickListener {
    public final int f17930a = 1;
    public final int f17931b;
    public final org.telegram.ui.ActionBar.f3 f17932c;
    public final b6 d;
    public final long f17933e;
    public final Context f17934f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f17935n;

    public j3(int i9, org.telegram.ui.ActionBar.f3 f3Var, b6 b6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f17931b = i9;
        this.f17932c = f3Var;
        this.d = b6Var;
        this.f17935n = linearLayout;
        this.f17933e = j10;
        this.f17934f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f17930a) {
            case 0:
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.f17935n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i9 = this.f17931b;
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i9).loadFullUser(user, 0, true, new f3(this.f17932c, this.f17934f, i9, this.f17933e, this.d, 0));
                        return;
                    }
                    return;
                }
                cVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f17935n;
                int i10 = this.f17931b;
                gh.c0 g10 = gh.c0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f7901j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f7903l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f17932c;
                ViewGroup containerView = f3Var.getContainerView();
                b6 b6Var = this.d;
                x60 F = x60.F(containerView, b6Var, linearLayout);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f22527id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f22380id;
                            }
                        }
                        i11 = i12;
                    }
                    if (j10 == this.f17933e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new w6(i10, j10, this.f17934f, this.h, f3Var, b6Var));
                    i11 = i12;
                }
                F.f34581t = false;
                F.f34580s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public j3(TL_payments.connectedBotStarRef connectedbotstarref, int i9, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j10, b6 b6Var, androidx.car.app.utils.c cVar) {
        this.h = connectedbotstarref;
        this.f17931b = i9;
        this.f17932c = f3Var;
        this.f17934f = context;
        this.f17933e = j10;
        this.d = b6Var;
        this.f17935n = cVar;
    }
}
