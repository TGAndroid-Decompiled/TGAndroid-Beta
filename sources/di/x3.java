package di;

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
import org.telegram.ui.Components.w70;
public final class x3 implements View.OnClickListener {
    public final int f7001a = 1;
    public final int f7002b;
    public final org.telegram.ui.ActionBar.h3 f7003c;
    public final f6 d;
    public final long e;
    public final Context f7004f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f7005n;

    public x3(int i10, org.telegram.ui.ActionBar.h3 h3Var, f6 f6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f7002b = i10;
        this.f7003c = h3Var;
        this.d = f6Var;
        this.f7005n = linearLayout;
        this.e = j3;
        this.f7004f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f7001a) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f7005n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f7002b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new t3(this.f7003c, this.f7004f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                bVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f7005n;
                int i11 = this.f7002b;
                xh.p g10 = xh.p.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f45849j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f45851l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.h3 h3Var = this.f7003c;
                ViewGroup containerView = h3Var.getContainerView();
                f6 f6Var = this.d;
                w70 F = w70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f17342id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j3 = -chat.f17195id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j3 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new s3(i11, j3, this.f7004f, this.h, h3Var, f6Var));
                    i12 = i13;
                }
                F.f28702t = false;
                F.f28701s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public x3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.h3 h3Var, Context context, long j3, f6 f6Var, androidx.car.app.utils.b bVar) {
        this.h = connectedbotstarref;
        this.f7002b = i10;
        this.f7003c = h3Var;
        this.f7004f = context;
        this.e = j3;
        this.d = f6Var;
        this.f7005n = bVar;
    }
}
