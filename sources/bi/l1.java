package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.vp;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class l1 implements View.OnClickListener {
    public final int f4252a;

    public l1(int i7) {
        this.f4252a = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Cells.c2 c2Var;
        switch (this.f4252a) {
            case 0:
                int i10 = w1.f4934s2;
                return;
            case 1:
                int i11 = ch.f.f6237e;
                return;
            case 2:
                int i12 = fi.r3.f12726e;
                return;
            case 3:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
            case 4:
                int i13 = hi.l.f14767n;
                return;
            case 5:
                int i14 = lh.c.f18350e;
                return;
            case 6:
                return;
            case 7:
                int i15 = org.telegram.ui.Cells.w.L;
                return;
            case 8:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 9:
                if (!MediaController.B().A0) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(MediaController.B().f21292u0);
                        return;
                    } else {
                        MediaController.B().R(MediaController.B().f21292u0, true);
                        return;
                    }
                }
                return;
            case 10:
                int i16 = vp.f39647f0;
                return;
            case 11:
                int i17 = br.f32308x;
                return;
            case 12:
                float[] fArr = FragmentContextView.W0;
                MediaController B = MediaController.B();
                t51 t51Var = B.E0;
                if (t51Var != null) {
                    t51Var.s0(false);
                }
                B.n0();
                B.m();
                ij ijVar = B.f21292u0;
                if (ijVar != null) {
                    qs f10 = qs.f(ijVar.I1);
                    ij ijVar2 = B.f21292u0;
                    if (ijVar2 != null) {
                        i7 = ijVar2.f1();
                    } else {
                        i7 = 0;
                    }
                    f10.k(150, Integer.valueOf(i7));
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.c2) view).c(!c2Var.b(), true);
                return;
            case 14:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.e2.b();
                    return;
                }
            case 15:
                wg.f1.l1(0, null);
                return;
            case 16:
                ArrayList arrayList = ExternalActionActivity.f41221y;
                return;
            case 17:
                return;
            case 18:
                String str = LaunchActivity.B1;
                return;
            case 19:
                return;
            case 20:
                RectF rectF = ProfileActivity.S6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 21:
                int i18 = org.telegram.ui.Wallet.p3.W;
                return;
            case 22:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                return;
            case 23:
                int i19 = zh.m.f60347s2;
                return;
            case 24:
                org.telegram.ui.Components.jc[] jcVarArr = zh.v.f60457h2;
                return;
            default:
                int i20 = zh.c0.Y1;
                return;
        }
    }

    public l1(Object obj, int i7) {
        this.f4252a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
