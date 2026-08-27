package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import hh.v6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b70;

public final class i3 implements View.OnClickListener {

    public final int f18753a = 1;

    public final int f18754b;

    public final org.telegram.ui.ActionBar.e3 f18755c;
    public final c6 d;

    public final long f18756e;

    public final Context f18757f;
    public final TL_payments.connectedBotStarRef h;

    public final Object f18758n;

    public i3(int i10, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f18754b = i10;
        this.f18755c = e3Var;
        this.d = c6Var;
        this.f18758n = linearLayout;
        this.f18756e = j10;
        this.f18757f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        switch (this.f18753a) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f18758n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    bVar.run();
                } else {
                    int i10 = this.f18754b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new e3(this.f18755c, this.f18757f, i10, this.f18756e, this.d, 0));
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f18758n;
                int i11 = this.f18754b;
                hh.c0 c0VarG = hh.c0.g(i11);
                c0VarG.n();
                c0VarG.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = c0VarG.f9056j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = c0VarG.f9058l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.e3 e3Var = this.f18755c;
                ViewGroup containerView = e3Var.getContainerView();
                c6 c6Var = this.d;
                b70 b70VarF = b70.F(containerView, c6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f22527id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f22380id;
                            }
                        }
                        i12 = i13;
                    }
                    b70VarF.g(tLObject, j10 == this.f18756e, new v6(i11, j10, this.f18757f, this.h, e3Var, c6Var));
                    i12 = i13;
                }
                b70VarF.f26993t = false;
                b70VarF.f26992s = 0;
                b70VarF.V(5);
                b70VarF.a0(AndroidUtilities.dp(24.0f), 0.0f);
                b70VarF.Z();
                break;
        }
    }

    public i3(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.e3 e3Var, Context context, long j10, c6 c6Var, androidx.car.app.utils.b bVar) {
        this.h = connectedbotstarref;
        this.f18754b = i10;
        this.f18755c = e3Var;
        this.f18757f = context;
        this.f18756e = j10;
        this.d = c6Var;
        this.f18758n = bVar;
    }
}
