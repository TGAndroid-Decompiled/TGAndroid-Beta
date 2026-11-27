package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class zsa extends kea {
    public final wua U2;

    public zsa(wua wuaVar, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, vnbVar);
        this.U2 = wuaVar;
        this.V1 = true;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        if (z) {
            d31 j = j();
            if (zh6Var.m() == 1) {
                long j2 = zh6Var.j(0);
                if (j2 == yac.h(this.a).n) {
                    v21 G = j.G(2131624185, 5000, hl.S2(ob6.a0(null, null, 2131748640, new Object[0])));
                    G.s = false;
                    G.u = true;
                    G.j();
                } else {
                    int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                    int i3 = this.a;
                    if (i2 < 0) {
                        TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j2));
                        if (tL_forumTopic != null) {
                            str = tL_forumTopic.title;
                        } else {
                            str = M0.title;
                        }
                        v21 G2 = j.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131748644, str)));
                        G2.s = false;
                        G2.u = true;
                        G2.j();
                    } else {
                        v21 G3 = j.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131748644, uc7.s1(i3).X1(Long.valueOf(j2)).first_name)));
                        G3.s = false;
                        G3.u = true;
                        G3.j();
                    }
                }
            } else {
                v21 Q = j.Q(2131624029, 36, hl.S2(ob6.G(zh6Var.m(), "LinkSharedToManyChats", Integer.valueOf(zh6Var.m()))));
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
    public final void N0(View view) {
        lbb lbbVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            if (view instanceof nea) {
                lbbVar = nbb.b((nea) view);
            } else {
                lbbVar = null;
            }
            ArrayList arrayList = new ArrayList();
            wua wuaVar = this.U2;
            r47 r47Var = wuaVar.C2;
            if (r47Var != null) {
                arrayList.add(r47Var);
            } else if (wuaVar.s1() instanceof TL_stars.TL_starGiftUnique) {
                long e = yac.h(wuaVar.a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = uc7.s1(wuaVar.a).y1(e);
                tL_messageService.from_id = uc7.s1(wuaVar.a).y1(e);
                tL_messageService.date = ConnectionsManager.getInstance(wuaVar.a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) wuaVar.s1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                r47 r47Var2 = new r47(wuaVar.a, tL_messageService, false, false);
                r47Var2.K5();
                arrayList.add(r47Var2);
            } else {
                return;
            }
            sbb C = sbb.C(launchActivity, wuaVar.a);
            C.S = new yt1(wuaVar, C, view, (byte) 1);
            C.T(lbbVar, c8b.x(arrayList));
        }
    }
}
