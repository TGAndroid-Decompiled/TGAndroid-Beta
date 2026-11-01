package bh;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.x;
import mg.i2;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.p3;
import ph.d0;
import ph.m;
import th.w0;
public final class c implements View.OnClickListener {
    public final int f2776a;

    public c(int i10) {
        this.f2776a = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        c2 c2Var;
        switch (this.f2776a) {
            case 0:
                int i11 = e.e;
                return;
            case 1:
                return;
            case 2:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 3:
                int i12 = w.L;
                return;
            case 4:
                k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 5:
                if (!MediaController.B().A0) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(MediaController.B().f14483u0);
                        return;
                    } else {
                        MediaController.B().R(MediaController.B().f14483u0, true);
                        return;
                    }
                }
                return;
            case 6:
                int i13 = cq.f25210f0;
                return;
            case 7:
                int i14 = lr.f28244x;
                return;
            case 8:
                float[] fArr = FragmentContextView.W0;
                MediaController B = MediaController.B();
                v61 v61Var = B.E0;
                if (v61Var != null) {
                    v61Var.s0(false);
                }
                B.n0();
                B.m();
                kj kjVar = B.f14483u0;
                if (kjVar != null) {
                    at f7 = at.f(kjVar.I1);
                    kj kjVar2 = B.f14483u0;
                    if (kjVar2 != null) {
                        i10 = kjVar2.f1();
                    } else {
                        i10 = 0;
                    }
                    f7.k(150, Integer.valueOf(i10));
                    return;
                }
                return;
            case 9:
                jf0 jf0Var = jf0.f27400p0;
                hu huVar = jf0Var.U;
                if (huVar != null) {
                    huVar.I0();
                } else {
                    PhotoViewer photoViewer = jf0Var.V;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.B().F0();
                    }
                }
                jf0.b(false);
                return;
            case 10:
                t0.b();
                return;
            case 11:
                ((c2) view).c(!c2Var.b(), true);
                return;
            case 12:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    u1.a();
                    return;
                }
            case 13:
                i2.l1(0, null);
                return;
            case 14:
                ArrayList arrayList = ExternalActionActivity.f33328y;
                return;
            case 15:
                return;
            case 16:
                Pattern pattern = LaunchActivity.D1;
                return;
            case 17:
                return;
            case 18:
                RectF rectF = ProfileActivity.S6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    f8.g(e, true);
                    return;
                }
            case 19:
                int i15 = p3.W;
                return;
            case 20:
                int i16 = m.f45224s2;
                return;
            case 21:
                ec[] ecVarArr = ph.w.f45346h2;
                return;
            case 22:
                int i17 = d0.Y1;
                return;
            case 23:
                int i18 = rh.t0.f47482s2;
                return;
            case 24:
                int i19 = sg.f.e;
                return;
            case 25:
                w0.b();
                return;
            case 26:
                int i20 = x.e;
                return;
            case 27:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            default:
                int i21 = xh.k.f53852n;
                return;
        }
    }

    public c(Object obj, int i10) {
        this.f2776a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
