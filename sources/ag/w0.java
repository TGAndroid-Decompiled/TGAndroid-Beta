package ag;

import android.view.View;
import hh.da;
import hh.fa;
import hh.g5;
import hh.m4;
import hh.oa;
import hh.y7;
import jh.b9;
import jh.i9;
import jh.m8;
import jh.o5;
import jh.r8;
import lh.ib;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class w0 implements View.OnClickListener {

    public final int f688a;

    public final Object f689b;

    public w0(Object obj, int i10) {
        this.f688a = i10;
        this.f689b = obj;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        org.telegram.ui.ActionBar.n2 n2VarR;
        org.telegram.ui.ActionBar.n2 n2VarR2;
        switch (this.f688a) {
            case 0:
                ((p80) this.f689b).performClick();
                break;
            case 1:
                y2 y2Var = (y2) this.f689b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(y2Var.f722p0, null, "profile", null);
                break;
            case 2:
                ((androidx.mediarouter.app.g) this.f689b).dismiss();
                break;
            case 3:
                final cg.k1 k1Var = (cg.k1) this.f689b;
                eg.a aVar = k1Var.M0;
                if (!aVar.f5382a.J) {
                    aVar.b(true);
                    String str = k1Var.N0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    k1 k1Var2 = k1Var;
                                    k1Var2.M0.b(false);
                                    k1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new i1(k1Var2, 1), 200L);
                                    break;
                                default:
                                    k1.c0(k1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    k1 k1Var2 = k1Var;
                                    k1Var2.M0.b(false);
                                    k1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new i1(k1Var2, 1), 200L);
                                    break;
                                default:
                                    k1.c0(k1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new cg.f0(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 4:
                ((cg.o1) this.f689b).dismiss();
                break;
            case 5:
                ((cg.f1) ((dg.e) this.f689b)).f2680r.dismiss();
                break;
            case 6:
                Runnable runnable = ((gg.d) this.f689b).d;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 7:
                ((gh.d) this.f689b).dismiss();
                break;
            case 8:
                ((gh.p0) this.f689b).dismiss();
                break;
            case 9:
                if (((gh.k2) this.f689b).f7382b0.f9146f > 0 && (n2VarR = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2VarR.showAsSheet(new oa(), l2Var);
                }
                break;
            case 10:
                ((hh.g0) this.f689b).dismiss();
                break;
            case 11:
                ((hh.t0) this.f689b).dismiss();
                break;
            case 12:
                hh.x0 x0Var = (hh.x0) this.f689b;
                hf.b bVar = x0Var.A.f8919a;
                hf.b bVar2 = hf.b.f8922b;
                if (bVar == bVar2) {
                    bVar2 = hf.b.f8921a;
                }
                x0Var.n(hf.a.i(0L, bVar2), true, false, true);
                x0Var.f10316c.setText("");
                break;
            case 13:
                ((hh.l1) this.f689b).dismiss();
                break;
            case 14:
                ((hh.r2) this.f689b).run();
                break;
            case 15:
                ((hh.r2) this.f689b).run();
                break;
            case 16:
                m4 m4Var = (m4) this.f689b;
                m4Var.getClass();
                new fa(m4Var.f9715b, m4Var.f9719g).show();
                break;
            case 17:
                ((g5) this.f689b).dismiss();
                break;
            case 18:
                ((y7) this.f689b).run();
                break;
            case 19:
                if (((da) ((gg.a) this.f689b).f7075c).f9146f > 0 && (n2VarR2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.f23619a = true;
                    n2VarR2.showAsSheet(new oa(), l2Var2);
                }
                break;
            case 20:
                ig.d0 d0Var = (ig.d0) this.f689b;
                if (d0Var.f11276k) {
                    d0Var.d();
                }
                break;
            case 21:
                jh.g2 g2Var = (jh.g2) this.f689b;
                g2Var.q(!g2Var.f14011b0, true);
                break;
            case 22:
                ((i9) this.f689b).N();
                break;
            case 23:
                ((o5) this.f689b).dismiss();
                org.telegram.ui.ActionBar.n2 n2VarR3 = LaunchActivity.R();
                if (n2VarR3 != null) {
                    n2VarR3.showDialog(new g2(n2VarR3, 14, false));
                }
                break;
            case 24:
                m8 m8Var = (m8) this.f689b;
                m8Var.onClick(m8Var.f13659b);
                break;
            case 25:
                r8 r8Var = (r8) this.f689b;
                r8Var.f13922b.f13501q1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                break;
            case 26:
                ((kh.c) this.f689b).run();
                break;
            case 27:
                lh.m mVar = (lh.m) this.f689b;
                lh.g gVar = mVar.f16338f;
                gVar.d();
                gVar.k(true);
                lh.e eVar = mVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 28:
                ((ib) this.f689b).B();
                break;
            default:
                lh.u0.a((lh.u0) this.f689b);
                break;
        }
    }
}
