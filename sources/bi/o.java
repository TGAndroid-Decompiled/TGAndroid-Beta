package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class o implements View.OnClickListener {
    public final int f3919a;

    public o(int i7) {
        this.f3919a = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Cells.c2 c2Var;
        switch (this.f3919a) {
            case 0:
                int i10 = y.f4224w2;
                return;
            case 1:
                nc[] ncVarArr = m0.f3857l2;
                return;
            case 2:
                int i11 = t0.f4069c2;
                return;
            case 3:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new org.telegram.ui.Wallet.n6());
                    return;
                }
                return;
            case 5:
                int i12 = ch.f.f5349e;
                return;
            case 6:
                int i13 = di.h1.f8896w2;
                return;
            case 7:
                int i14 = hi.q3.f15266e;
                return;
            case 8:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
            case 9:
                int i15 = ki.m.f18768n;
                return;
            case 10:
                int i16 = lh.c.f19853e;
                return;
            case 11:
                return;
            case 12:
                int i17 = org.telegram.ui.Cells.w.M;
                return;
            case 13:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 14:
                if (!MediaController.B().B0) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(MediaController.B().f22743v0);
                        return;
                    } else {
                        MediaController.B().R(MediaController.B().f22743v0, true);
                        return;
                    }
                }
                return;
            case 15:
                int i18 = kq.f36844g0;
                return;
            case 16:
                int i19 = pr.f38528x;
                return;
            case 17:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                f61 f61Var = B.F0;
                if (f61Var != null) {
                    f61Var.s0(false);
                }
                B.n0();
                B.m();
                fj fjVar = B.f22743v0;
                if (fjVar != null) {
                    ks f10 = ks.f(fjVar.K1);
                    fj fjVar2 = B.f22743v0;
                    if (fjVar2 != null) {
                        i7 = fjVar2.e1();
                    } else {
                        i7 = 0;
                    }
                    f10.k(150, Integer.valueOf(i7));
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.Cells.c2) view).c(!c2Var.b(), true);
                return;
            case 19:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.h2.b();
                    return;
                }
            case 20:
                a2.l1(false, null);
                return;
            case 21:
                ArrayList arrayList = ExternalActionActivity.f43038y;
                return;
            case 22:
                return;
            case 23:
                String str = LaunchActivity.C1;
                return;
            case 24:
                return;
            case 25:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                int i20 = org.telegram.ui.Wallet.w3.X;
                return;
            default:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
        }
    }

    public o(Object obj, int i7) {
        this.f3919a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
