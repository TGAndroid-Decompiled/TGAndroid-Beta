package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.po0;
import org.telegram.ui.LaunchActivity;
public final class x3 extends po0 {
    public final c6 V2;

    public x3(c6 c6Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, e6Var);
        this.V2 = c6Var;
        this.W1 = true;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (z10) {
            org.telegram.ui.Components.cc k10 = k();
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == m10.i(this.f29679a).f24953n) {
                    org.telegram.ui.Components.xb G = k10.G(2131624191, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131748886, new Object[0])));
                    G.f41651r = false;
                    G.f41653t = true;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    org.telegram.ui.Components.xb G2 = k10.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131748890, str)));
                    G2.f41651r = false;
                    G2.f41653t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.xb G3 = k10.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131748890, np.s1(this.f29679a).a2(Long.valueOf(j3)).first_name)));
                    G3.f41651r = false;
                    G3.f41653t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.xb Q = k10.Q(2131624029, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f41651r = false;
                Q.f41653t = true;
                Q.j();
            }
            try {
                this.f29685c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void S0(final View view) {
        hi.la laVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.c7) {
                laVar = hi.na.b((org.telegram.ui.Cells.c7) view);
            } else {
                laVar = null;
            }
            ArrayList arrayList = new ArrayList();
            final c6 c6Var = this.V2;
            gj gjVar = c6Var.D2;
            if (gjVar != null) {
                arrayList.add(gjVar);
            } else if (c6Var.y1() instanceof TL_stars.TL_starGiftUnique) {
                long e10 = m10.i(c6Var.f29679a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = np.s1(c6Var.f29679a).z1(e10);
                tL_messageService.from_id = np.s1(c6Var.f29679a).z1(e10);
                tL_messageService.date = ConnectionsManager.getInstance(c6Var.f29679a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) c6Var.y1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                gj gjVar2 = new gj(c6Var.f29679a, tL_messageService, false, false);
                gjVar2.L5();
                arrayList.add(gjVar2);
            } else {
                return;
            }
            final hi.sa D = hi.sa.D(launchActivity, c6Var.f29679a);
            D.S = new w10() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    hi.sa saVar = D;
                    hi.la laVar2 = null;
                    if (booleanValue) {
                        c6 c6Var2 = c6.this;
                        org.telegram.messenger.g0.h3(new c1.c(29, c6Var2, l11));
                        saVar.X(null);
                        x3 x3Var = c6Var2.V2;
                        if (x3Var != null) {
                            x3Var.dismiss();
                            c6Var2.V2 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                            laVar2 = hi.na.b((org.telegram.ui.Cells.c7) view2);
                        }
                        saVar.X(laVar2);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                }
            };
            D.T(laVar, hi.d7.y(arrayList));
        }
    }
}
