package ai;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vp;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class t implements View.OnClickListener {
    public final int f973a;

    public t(int i3) {
        this.f973a = i3;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        org.telegram.ui.Cells.c2 c2Var;
        switch (this.f973a) {
            case 0:
                int i10 = e0.f595t2;
                return;
            case 1:
                hc[] hcVarArr = s0.f956i2;
                return;
            case 2:
                int i11 = z0.Z1;
                return;
            case 3:
                int i12 = ci.p1.f5721t2;
                return;
            case 4:
                int i13 = dh.f.f8999e;
                return;
            case 5:
                ei.n1.b();
                return;
            case 6:
                int i14 = gi.q3.f13421e;
                return;
            case 7:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 8:
                int i15 = ii.n.f15083n;
                return;
            case 9:
                int i16 = mh.c.f19392e;
                return;
            case 10:
                return;
            case 11:
                int i17 = org.telegram.ui.Cells.w.M;
                return;
            case 12:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 13:
                if (!MediaController.B().B0) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(MediaController.B().f21348v0);
                        return;
                    } else {
                        MediaController.B().R(MediaController.B().f21348v0, true);
                        return;
                    }
                }
                return;
            case 14:
                int i18 = vp.f39748g0;
                return;
            case 15:
                int i19 = br.f32366x;
                return;
            case 16:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                m51 m51Var = B.F0;
                if (m51Var != null) {
                    m51Var.s0(false);
                }
                B.n0();
                B.m();
                zi ziVar = B.f21348v0;
                if (ziVar != null) {
                    hs f10 = hs.f(ziVar.I1);
                    zi ziVar2 = B.f21348v0;
                    if (ziVar2 != null) {
                        i3 = ziVar2.f1();
                    } else {
                        i3 = 0;
                    }
                    f10.k(150, Integer.valueOf(i3));
                    return;
                }
                return;
            case 17:
                ie0 ie0Var = ie0.f34683q0;
                ut utVar = ie0Var.V;
                if (utVar != null) {
                    utVar.I0();
                } else {
                    PhotoViewer photoViewer = ie0Var.W;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.B().F0();
                    }
                }
                ie0.b(false);
                return;
            case 18:
                org.telegram.ui.Components.voip.s0.b();
                return;
            case 19:
                ((org.telegram.ui.Cells.c2) view).c(!c2Var.b(), true);
                return;
            case 20:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.u1.a();
                    return;
                }
            case 21:
                xg.e1.l1(0, null);
                return;
            case 22:
                ArrayList arrayList = ExternalActionActivity.f41254y;
                return;
            case 23:
                return;
            case 24:
                String str = LaunchActivity.E1;
                return;
            case 25:
                return;
            case 26:
                RectF rectF = ProfileActivity.T6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    a8.g(e10, true);
                    return;
                }
            case 27:
                int i20 = org.telegram.ui.Wallet.n3.X;
                return;
            default:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                return;
        }
    }

    public t(Object obj, int i3) {
        this.f973a = i3;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
