package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.r10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.LaunchActivity;
public final class g4 extends oo0 {
    public final l6 S2;

    public g4(l6 l6Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, e6Var);
        this.S2 = l6Var;
        this.T1 = true;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (z10) {
            org.telegram.ui.Components.fc k10 = k();
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == h10.i(this.f28583a).f22848n) {
                    org.telegram.ui.Components.ac G = k10.G(2131624190, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748894, new Object[0])));
                    G.f31800r = false;
                    G.f31802t = true;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    org.telegram.ui.Components.ac G2 = k10.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748898, str)));
                    G2.f31800r = false;
                    G2.f31802t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.ac G3 = k10.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748898, hp.s1(this.f28583a).a2(Long.valueOf(j10)).first_name)));
                    G3.f31800r = false;
                    G3.f31802t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.ac Q = k10.Q(2131624028, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f31800r = false;
                Q.f31802t = true;
                Q.j();
            }
            try {
                this.f28589c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void S0(final View view) {
        gi.oa oaVar;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.c7) {
                oaVar = gi.qa.b((org.telegram.ui.Cells.c7) view);
            } else {
                oaVar = null;
            }
            ArrayList arrayList = new ArrayList();
            final l6 l6Var = this.S2;
            zi ziVar = l6Var.A2;
            if (ziVar != null) {
                arrayList.add(ziVar);
            } else if (l6Var.y1() instanceof TL_stars.TL_starGiftUnique) {
                long e10 = h10.i(l6Var.f28583a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = hp.s1(l6Var.f28583a).z1(e10);
                tL_messageService.from_id = hp.s1(l6Var.f28583a).z1(e10);
                tL_messageService.date = ConnectionsManager.getInstance(l6Var.f28583a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) l6Var.y1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                zi ziVar2 = new zi(l6Var.f28583a, tL_messageService, false, false);
                ziVar2.M5();
                arrayList.add(ziVar2);
            } else {
                return;
            }
            final gi.va D = gi.va.D(launchActivity, l6Var.f28583a);
            D.S = new r10() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    gi.va vaVar = D;
                    gi.oa oaVar2 = null;
                    if (booleanValue) {
                        l6 l6Var2 = l6.this;
                        org.telegram.messenger.g0.h3(new e0(4, l6Var2, l11));
                        vaVar.X(null);
                        g4 g4Var = l6Var2.S2;
                        if (g4Var != null) {
                            g4Var.dismiss();
                            l6Var2.S2 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                            oaVar2 = gi.qa.b((org.telegram.ui.Cells.c7) view2);
                        }
                        vaVar.X(oaVar2);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                }
            };
            D.T(oaVar, gi.f7.y(arrayList));
        }
    }
}
