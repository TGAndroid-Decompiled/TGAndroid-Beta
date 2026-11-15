package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.u51;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class o implements View.OnClickListener {
    public final int f3742a;

    public o(int i7) {
        this.f3742a = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Cells.c2 c2Var;
        switch (this.f3742a) {
            case 0:
                int i10 = y.f3984w2;
                return;
            case 1:
                ec[] ecVarArr = m0.f3683l2;
                return;
            case 2:
                int i11 = t0.f3870c2;
                return;
            case 3:
                int i12 = ch.f.f5060e;
                return;
            case 4:
                int i13 = di.i1.f8764w2;
                return;
            case 5:
                int i14 = hi.q3.f14896e;
                return;
            case 6:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
            case 7:
                int i15 = ki.m.f18430n;
                return;
            case 8:
                int i16 = lh.c.f19486e;
                return;
            case 9:
                return;
            case 10:
                int i17 = org.telegram.ui.Cells.w.M;
                return;
            case 11:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 12:
                if (!MediaController.B().B0) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(MediaController.B().f22377v0);
                        return;
                    } else {
                        MediaController.B().R(MediaController.B().f22377v0, true);
                        return;
                    }
                }
                return;
            case 13:
                int i18 = dq.f34029g0;
                return;
            case 14:
                int i19 = ir.f35700x;
                return;
            case 15:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                u51 u51Var = B.F0;
                if (u51Var != null) {
                    u51Var.s0(false);
                }
                B.n0();
                B.m();
                gj gjVar = B.f22377v0;
                if (gjVar != null) {
                    ns f10 = ns.f(gjVar.K1);
                    gj gjVar2 = B.f22377v0;
                    if (gjVar2 != null) {
                        i7 = gjVar2.e1();
                    } else {
                        i7 = 0;
                    }
                    f10.k(150, Integer.valueOf(i7));
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.Cells.c2) view).c(!c2Var.b(), true);
                return;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.i2.b();
                    return;
                }
            case 18:
                wg.c1.l1(0, null);
                return;
            case 19:
                ArrayList arrayList = ExternalActionActivity.f42593y;
                return;
            case 20:
                return;
            case 21:
                String str = LaunchActivity.C1;
                return;
            case 22:
                return;
            case 23:
                RectF rectF = ProfileActivity.X6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    a8.g(e10, true);
                    return;
                }
            case 24:
                int i20 = org.telegram.ui.Wallet.o3.X;
                return;
            default:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
        }
    }

    public o(Object obj, int i7) {
        this.f3742a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
