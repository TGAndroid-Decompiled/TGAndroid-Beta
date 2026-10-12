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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.m80;
public final class v3 implements View.OnClickListener {
    public final int f9610a = 1;
    public final int f9611b;
    public final org.telegram.ui.ActionBar.e3 f9612c;
    public final c6 d;
    public final long e;
    public final Context f9613f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f9614n;

    public v3(int i10, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f9611b = i10;
        this.f9612c = e3Var;
        this.d = c6Var;
        this.f9614n = linearLayout;
        this.e = j10;
        this.f9613f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f9610a) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f9614n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f9611b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new r3(this.f9612c, this.f9613f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                bVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f9614n;
                int i11 = this.f9611b;
                zh.p g10 = zh.p.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f50964j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f50966l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.e3 e3Var = this.f9612c;
                ViewGroup containerView = e3Var.getContainerView();
                c6 c6Var = this.d;
                m80 F = m80.F(containerView, c6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f19363id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f19216id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new p3(i11, j10, this.f9613f, this.h, e3Var, c6Var));
                    i12 = i13;
                }
                F.f27299t = false;
                F.f27298s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public v3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.e3 e3Var, Context context, long j10, c6 c6Var, androidx.car.app.utils.b bVar) {
        this.h = connectedbotstarref;
        this.f9611b = i10;
        this.f9612c = e3Var;
        this.f9613f = context;
        this.e = j10;
        this.d = c6Var;
        this.f9614n = bVar;
    }
}
