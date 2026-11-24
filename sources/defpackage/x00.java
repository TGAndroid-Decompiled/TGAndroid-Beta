package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class x00 implements View.OnClickListener {
    public final byte a;

    public x00(byte b) {
        this.a = b;
    }

    @Override
    public final void onClick(View view) {
        int i;
        ag2 ag2Var;
        switch (this.a) {
            case 0:
                if (!MediaController.w().B0) {
                    if (MediaController.w().C()) {
                        MediaController.w().R(MediaController.w().v0);
                        return;
                    } else {
                        MediaController.w().Q(MediaController.w().v0, true);
                        return;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 3:
                xu4.f1(false, null);
                return;
            case 4:
                ArrayList arrayList = ExternalActionActivity.y;
                return;
            case 5:
            case 6:
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                MediaController w = MediaController.w();
                lbc lbcVar = w.F0;
                if (lbcVar != null) {
                    lbcVar.r0(false);
                }
                w.m0();
                w.h();
                k27 k27Var = w.v0;
                if (k27Var != null) {
                    kk7 f = kk7.f(k27Var.K1);
                    k27 k27Var2 = w.v0;
                    if (k27Var2 != null) {
                        i = k27Var2.e1();
                    } else {
                        i = 0;
                    }
                    f.k(150, Integer.valueOf(i));
                    return;
                }
                return;
            case 8:
                PhotoViewer.r0().b(1.0f, 0.0f, 0.0f, false);
                return;
            case 9:
                String str = LaunchActivity.C1;
                return;
            case 10:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new hmc());
                    return;
                }
                return;
            case 11:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new hmc());
                    return;
                }
                return;
            case 12:
                PhotoViewer.r0().b(1.0f, 0.0f, 0.0f, false);
                return;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    fa4.g(e, true);
                    return;
                }
            case 14:
            case 15:
                return;
            case 16:
                ((ag2) view).c(!ag2Var.b(), true);
                return;
            default:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    xgc.b();
                    return;
                }
        }
    }

    public x00(Object obj, byte b) {
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
