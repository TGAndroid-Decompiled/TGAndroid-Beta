package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class y00 implements View.OnClickListener {
    public final byte a;

    public y00(byte b) {
        this.a = b;
    }

    @Override
    public final void onClick(View view) {
        int i;
        sg2 sg2Var;
        switch (this.a) {
            case 0:
                if (!MediaController.z().B0) {
                    if (MediaController.z().G()) {
                        MediaController.z().V(MediaController.z().v0);
                        return;
                    } else {
                        MediaController.z().U(MediaController.z().v0, true);
                        return;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 3:
                bx4.g1(false, null);
                return;
            case 4:
                ArrayList arrayList = ExternalActionActivity.y;
                return;
            case 5:
            case 6:
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                MediaController z = MediaController.z();
                kfc kfcVar = z.F0;
                if (kfcVar != null) {
                    kfcVar.r0(false);
                }
                z.p0();
                z.i();
                r47 r47Var = z.v0;
                if (r47Var != null) {
                    jn7 f = jn7.f(r47Var.K1);
                    r47 r47Var2 = z.v0;
                    if (r47Var2 != null) {
                        i = r47Var2.e1();
                    } else {
                        i = 0;
                    }
                    f.k(151, Integer.valueOf(i));
                    return;
                }
                return;
            case 8:
                PhotoViewer.q0().b(1.0f, 0.0f, 0.0f, false);
                return;
            case 9:
                String str = LaunchActivity.C1;
                return;
            case 10:
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new uqc());
                    return;
                }
                return;
            case 11:
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new uqc());
                    return;
                }
                return;
            case 12:
                PhotoViewer.q0().b(1.0f, 0.0f, 0.0f, false);
                return;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    cc4.g(e, true);
                    return;
                }
            case 14:
            case 15:
                return;
            case 16:
                ((sg2) view).c(!sg2Var.b(), true);
                return;
            default:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    dlc.b();
                    return;
                }
        }
    }

    public y00(Object obj, byte b) {
        this.a = b;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
