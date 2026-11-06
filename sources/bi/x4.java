package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.LaunchActivity;
public final class x4 extends mo0 {
    public final k7 R2;

    public x4(k7 k7Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, f6Var);
        this.R2 = k7Var;
        this.S1 = true;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String str;
        if (z9) {
            org.telegram.ui.Components.hc k10 = k();
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.f28612a).f24478n) {
                    org.telegram.ui.Components.cc G = k10.G(2131624190, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748885, new Object[0])));
                    G.f32535r = false;
                    G.f32537t = true;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = qp.s1(this.f28612a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    org.telegram.ui.Components.cc G2 = k10.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748889, str)));
                    G2.f32535r = false;
                    G2.f32537t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.cc G3 = k10.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748889, qp.s1(this.f28612a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32535r = false;
                    G3.f32537t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.cc Q = k10.Q(2131624028, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32535r = false;
                Q.f32537t = true;
                Q.j();
            }
            try {
                this.f28618c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void S0(final View view) {
        fi.oa oaVar;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.d7) {
                oaVar = fi.qa.b((org.telegram.ui.Cells.d7) view);
            } else {
                oaVar = null;
            }
            ArrayList arrayList = new ArrayList();
            final k7 k7Var = this.R2;
            ij ijVar = k7Var.f4205z2;
            if (ijVar != null) {
                arrayList.add(ijVar);
            } else if (k7Var.y1() instanceof TL_stars.TL_starGiftUnique) {
                long e10 = p10.i(k7Var.f28612a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = qp.s1(k7Var.f28612a).z1(e10);
                tL_messageService.from_id = qp.s1(k7Var.f28612a).z1(e10);
                tL_messageService.date = ConnectionsManager.getInstance(k7Var.f28612a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) k7Var.y1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                ij ijVar2 = new ij(k7Var.f28612a, tL_messageService, false, false);
                ijVar2.M5();
                arrayList.add(ijVar2);
            } else {
                return;
            }
            final fi.va D = fi.va.D(launchActivity, k7Var.f28612a);
            D.R = new z10() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    fi.va vaVar = D;
                    fi.oa oaVar2 = null;
                    if (booleanValue) {
                        k7 k7Var2 = k7.this;
                        org.telegram.messenger.g0.h3(new a1.e(27, k7Var2, l11));
                        vaVar.X(null);
                        x4 x4Var = k7Var2.R2;
                        if (x4Var != null) {
                            x4Var.dismiss();
                            k7Var2.R2 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                            oaVar2 = fi.qa.b((org.telegram.ui.Cells.d7) view2);
                        }
                        vaVar.X(oaVar2);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                }
            };
            D.T(oaVar, fi.e7.y(arrayList));
        }
    }
}
