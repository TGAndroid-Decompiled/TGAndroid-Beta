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
public final class x10 implements View.OnClickListener {
    public final byte a;

    public x10(byte b) {
        this.a = b;
    }

    @Override
    public final void onClick(View view) {
        int i;
        oh2 oh2Var;
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
                yw4.f1(false, null);
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
                ndc ndcVar = w.F0;
                if (ndcVar != null) {
                    ndcVar.r0(false);
                }
                w.m0();
                w.h();
                k47 k47Var = w.v0;
                if (k47Var != null) {
                    nm7 f = nm7.f(k47Var.K1);
                    k47 k47Var2 = w.v0;
                    if (k47Var2 != null) {
                        i = k47Var2.e1();
                    } else {
                        i = 0;
                    }
                    f.k(151, Integer.valueOf(i));
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
                    S.presentFragment(new goc());
                    return;
                }
                return;
            case 11:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new goc());
                    return;
                }
                return;
            case 12:
                PhotoViewer.r0().b(1.0f, 0.0f, 0.0f, false);
                return;
            case 13:
                RectF rectF = ProfileActivity.e7;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    fc4.g(e, true);
                    return;
                }
            case 14:
            case 15:
                return;
            case 16:
                ((oh2) view).c(!oh2Var.b(), true);
                return;
            default:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    yic.b();
                    return;
                }
        }
    }

    public x10(Object obj, byte b) {
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
