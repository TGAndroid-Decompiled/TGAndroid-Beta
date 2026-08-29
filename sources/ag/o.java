package ag;

import android.view.View;
import bg.c4;
import jh.f5;
import jh.ia;
import jh.l4;
import jh.p2;
import jh.w7;
import jh.x9;
import jh.z9;
import lh.b9;
import lh.i9;
import lh.m8;
import lh.q5;
import lh.r8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ig;
public final class o implements View.OnClickListener {
    public final int f620a;
    public final Object f621b;

    public o(Object obj, int i10) {
        this.f620a = i10;
        this.f621b = obj;
    }

    @Override
    public final void onClick(View view) {
        o2 R;
        o2 R2;
        switch (this.f620a) {
            case 0:
                ((f0) this.f621b).dismiss();
                return;
            case 1:
                ((androidx.mediarouter.app.f) this.f621b).dismiss();
                return;
            case 2:
                ((v0) this.f621b).run();
                return;
            case 3:
                ((c4) this.f621b).onBackPressed();
                return;
            case 4:
                ((ig) this.f621b).run();
                return;
            case 5:
                ((y80) this.f621b).performClick();
                return;
            case 6:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((cg.f2) this.f621b).f3136p0, null, "profile", null);
                return;
            case 7:
                final eg.j1 j1Var = (eg.j1) this.f621b;
                gg.a aVar = j1Var.M0;
                if (!aVar.f7276a.J) {
                    aVar.b(true);
                    String str = j1Var.N0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    j1 j1Var2 = j1Var;
                                    j1Var2.M0.b(false);
                                    j1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new h1(j1Var2, 1), 200L);
                                    return;
                                default:
                                    j1.c0(j1Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    j1 j1Var2 = j1Var;
                                    j1Var2.M0.b(false);
                                    j1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new h1(j1Var2, 1), 200L);
                                    return;
                                default:
                                    j1.c0(j1Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new eg.g0(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 8:
                ((eg.n1) this.f621b).dismiss();
                return;
            case 9:
                ((eg.e1) ((fg.e) this.f621b)).f5980r.dismiss();
                return;
            case 10:
                Runnable runnable = ((ig.d) this.f621b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((ih.d) this.f621b).dismiss();
                return;
            case 12:
                ((ih.n0) this.f621b).dismiss();
                return;
            case 13:
                if (((ih.h2) this.f621b).f9205b0.f13089f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    R.showAsSheet(new ia(), obj);
                    return;
                }
                return;
            case 14:
                ((jh.f0) this.f621b).dismiss();
                return;
            case 15:
                ((jh.s0) this.f621b).dismiss();
                return;
            case 16:
                jh.w0 w0Var = (jh.w0) this.f621b;
                kf.b bVar = w0Var.A.f13633a;
                kf.b bVar2 = kf.b.f13636b;
                if (bVar == bVar2) {
                    bVar2 = kf.b.f13635a;
                }
                w0Var.n(kf.a.i(0L, bVar2), true, false, true);
                w0Var.f13003c.setText("");
                return;
            case 17:
                ((jh.j1) this.f621b).dismiss();
                return;
            case 18:
                ((p2) this.f621b).run();
                return;
            case 19:
                ((p2) this.f621b).run();
                return;
            case 20:
                l4 l4Var = (l4) this.f621b;
                l4Var.getClass();
                new z9(l4Var.f12414b, l4Var.f12418g).show();
                return;
            case 21:
                ((f5) this.f621b).dismiss();
                return;
            case 22:
                ((w7) this.f621b).run();
                return;
            case 23:
                if (((x9) ((ig.a) this.f621b).f8965c).f13089f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f23673a = true;
                    R2.showAsSheet(new ia(), obj2);
                    return;
                }
                return;
            case 24:
                kg.d0 d0Var = (kg.d0) this.f621b;
                if (d0Var.f13689k) {
                    d0Var.d();
                    return;
                }
                return;
            case 25:
                lh.f2 f2Var = (lh.f2) this.f621b;
                f2Var.q(!f2Var.f16278b0, true);
                return;
            case 26:
                ((i9) this.f621b).N();
                return;
            case 27:
                ((q5) this.f621b).dismiss();
                o2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new cg.p1(R3, 14, false));
                    return;
                }
                return;
            case 28:
                m8 m8Var = (m8) this.f621b;
                m8Var.onClick(m8Var.f15934b);
                return;
            default:
                r8 r8Var = (r8) this.f621b;
                r8Var.f16187b.f15779q1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                return;
        }
    }
}
