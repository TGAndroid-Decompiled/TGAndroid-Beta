package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
public final class z3 extends yo0 {
    public final f6 V2;

    public z3(f6 f6Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, i6Var);
        this.V2 = f6Var;
        this.W1 = true;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (z10) {
            org.telegram.ui.Components.lc k10 = k();
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == j10.i(this.f30187a).f24789n) {
                    org.telegram.ui.Components.gc G = k10.G(2131624191, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748694, new Object[0])));
                    G.f35469r = false;
                    G.f35471t = true;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = mp.u1(this.f30187a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    org.telegram.ui.Components.gc G2 = k10.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748698, str)));
                    G2.f35469r = false;
                    G2.f35471t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.gc G3 = k10.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748698, mp.u1(this.f30187a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35469r = false;
                    G3.f35471t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.gc Q = k10.Q(2131624029, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35469r = false;
                Q.f35471t = true;
                Q.j();
            }
            try {
                this.f30193c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void T0(final View view) {
        hi.ma maVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.e7) {
                maVar = hi.oa.b((org.telegram.ui.Cells.e7) view);
            } else {
                maVar = null;
            }
            ArrayList arrayList = new ArrayList();
            final f6 f6Var = this.V2;
            fj fjVar = f6Var.D2;
            if (fjVar != null) {
                arrayList.add(fjVar);
            } else if (f6Var.D1() instanceof TL_stars.TL_starGiftUnique) {
                long e10 = j10.i(f6Var.f30187a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = mp.u1(f6Var.f30187a).B1(e10);
                tL_messageService.from_id = mp.u1(f6Var.f30187a).B1(e10);
                tL_messageService.date = ConnectionsManager.getInstance(f6Var.f30187a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) f6Var.D1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                fj fjVar2 = new fj(f6Var.f30187a, tL_messageService, false, false);
                fjVar2.L5();
                arrayList.add(fjVar2);
            } else {
                return;
            }
            final hi.ta D = hi.ta.D(launchActivity, f6Var.f30187a);
            D.S = new u10() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    hi.ta taVar = D;
                    hi.ma maVar2 = null;
                    if (booleanValue) {
                        f6 f6Var2 = f6.this;
                        org.telegram.messenger.g0.g3(new c1.c(26, f6Var2, l11));
                        taVar.X(null);
                        z3 z3Var = f6Var2.V2;
                        if (z3Var != null) {
                            z3Var.dismiss();
                            f6Var2.V2 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                            maVar2 = hi.oa.b((org.telegram.ui.Cells.e7) view2);
                        }
                        taVar.X(maVar2);
                    }
                    org.telegram.messenger.g0.g3(runnable);
                }
            };
            D.T(maVar, hi.d7.y(arrayList));
        }
    }
}
