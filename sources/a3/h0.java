package a3;

import ag.a3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import li.t0;
import li.x0;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.r20;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;
import org.telegram.ui.un;
import org.telegram.ui.zx;
import rh.b2;
import rh.e4;
import rh.x7;
public final class h0 implements Runnable {
    public final int f119a;
    public final Object f120b;
    public final long f121c;
    public final long d;
    public final Object e;

    public h0(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f119a = i10;
        this.e = obj;
        this.f121c = j10;
        this.d = j11;
        this.f120b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f119a) {
            case 0:
                String str = (String) this.f120b;
                long j10 = this.f121c;
                long j11 = this.d;
                String str2 = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((m0) ((hf.b) this.e).f7659c)).f7822a.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1016, new j2.c(U, str, j11, j10, 16));
                return;
            case 1:
                String str3 = (String) this.f120b;
                long j12 = this.f121c;
                long j13 = this.d;
                String str4 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((k2.w) ((hf.b) this.e).f7659c)).f7822a.f7928s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1008, new j2.c(U2, str3, j13, j12, 4));
                return;
            case 2:
                x0 x0Var = (x0) this.e;
                t0 t0Var = (t0) this.f120b;
                long j14 = this.f121c;
                long j15 = this.d;
                synchronized (x0Var.f12312g) {
                    if (!t0Var.d && !t0Var.e) {
                        ((mz0) x0Var.e).a(t0Var.f12248a, t0Var.f12249b, j14, j15);
                        return;
                    }
                    return;
                }
            case 3:
                ((GroupCallMessagesController) this.e).lambda$processUpdate$3(this.f121c, this.d, (byte[]) this.f120b);
                return;
            case 4:
                ((go) this.e).e(this.f121c, this.d, (HashSet) this.f120b);
                return;
            case 5:
                zx zxVar = (zx) this.e;
                long j16 = this.f121c;
                long j17 = this.d;
                nb1 nb1Var = (nb1) this.f120b;
                if (zxVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hs.a(j16, j17));
                    zxVar.C2.z(zxVar, arrayList, null, false, zxVar.J2, zxVar.K2, zxVar.L2, nb1Var);
                    if (zxVar.f44160i2) {
                        zxVar.C2 = null;
                        return;
                    }
                    return;
                }
                zxVar.finishFragment();
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                long j18 = this.f121c;
                long j19 = this.d;
                un unVar = (un) this.f120b;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_forumTopic f7 = wp.r1(launchActivity.O).f19234r7.f(j18, j19);
                StringBuilder s10 = a1.g.s(j18, "LaunchActivity openForum after load ", " ");
                s10.append(j19);
                s10.append(" TL_forumTopic ");
                s10.append(f7);
                f8.b(s10.toString());
                if (launchActivity.f33384q0 != null) {
                    gg.e.a(unVar, hs.a(-j18, j19));
                    ((ActionBarLayout) launchActivity.M()).R(unVar);
                    return;
                }
                return;
            case 7:
                e4 e4Var = (e4) this.e;
                x7 x7Var = new x7(e4Var.getContext(), e4Var.I0, this.f121c, 11, null, new a3(e4Var, new boolean[]{false}, this.d, (r20) this.f120b, 17), 0L);
                x7Var.setOnDismissListener(new b2(e4Var, 1));
                x7Var.show();
                return;
            default:
                ((th.j0) this.e).n(this.f121c, (TLRPC.TL_textWithEntities) this.f120b, this.d);
                return;
        }
    }

    public h0(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f119a = i10;
        this.e = obj;
        this.f120b = obj2;
        this.f121c = j10;
        this.d = j11;
    }

    public h0(th.j0 j0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11) {
        this.f119a = 8;
        this.e = j0Var;
        this.f121c = j10;
        this.f120b = tL_textWithEntities;
        this.d = j11;
    }
}
