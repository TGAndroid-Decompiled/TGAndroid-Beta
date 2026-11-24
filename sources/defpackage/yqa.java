package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class yqa extends tca {
    public final wsa U2;

    public yqa(wsa wsaVar, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, ylbVar);
        this.U2 = wsaVar;
        this.V1 = true;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        if (z) {
            c41 j = j();
            if (vh6Var.m() == 1) {
                long j2 = vh6Var.j(0);
                if (j2 == z8c.h(this.a).n) {
                    u31 G = j.G(2131624185, 5000, gm.S2(jb6.a0(null, null, 2131748643, new Object[0])));
                    G.s = false;
                    G.u = true;
                    G.j();
                } else {
                    int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                    int i3 = this.a;
                    if (i2 < 0) {
                        TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j2));
                        if (tL_forumTopic != null) {
                            str = tL_forumTopic.title;
                        } else {
                            str = L0.title;
                        }
                        u31 G2 = j.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131748647, str)));
                        G2.s = false;
                        G2.u = true;
                        G2.j();
                    } else {
                        u31 G3 = j.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131748647, oc7.r1(i3).W1(Long.valueOf(j2)).first_name)));
                        G3.s = false;
                        G3.u = true;
                        G3.j();
                    }
                }
            } else {
                u31 Q = j.Q(2131624029, 36, gm.S2(jb6.G(vh6Var.m(), "LinkSharedToManyChats", Integer.valueOf(vh6Var.m()))));
                Q.s = false;
                Q.u = true;
                Q.j();
            }
            try {
                this.c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void M0(View view) {
        o9b o9bVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            if (view instanceof wca) {
                o9bVar = q9b.b((wca) view);
            } else {
                o9bVar = null;
            }
            ArrayList arrayList = new ArrayList();
            wsa wsaVar = this.U2;
            k47 k47Var = wsaVar.C2;
            if (k47Var != null) {
                arrayList.add(k47Var);
            } else if (wsaVar.r1() instanceof TL_stars.TL_starGiftUnique) {
                long e = z8c.h(wsaVar.a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = oc7.r1(wsaVar.a).x1(e);
                tL_messageService.from_id = oc7.r1(wsaVar.a).x1(e);
                tL_messageService.date = ConnectionsManager.getInstance(wsaVar.a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) wsaVar.r1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                k47 k47Var2 = new k47(wsaVar.a, tL_messageService, false, false);
                k47Var2.K5();
                arrayList.add(k47Var2);
            } else {
                return;
            }
            v9b C = v9b.C(launchActivity, wsaVar.a);
            C.S = new xu1(wsaVar, C, view, (byte) 1);
            C.T(o9bVar, g6b.x(arrayList));
        }
    }
}
