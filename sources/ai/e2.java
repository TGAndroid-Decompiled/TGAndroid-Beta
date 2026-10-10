package ai;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.mv;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class e2 implements View.OnClickListener {
    public final int f873a;

    public e2(int i10) {
        this.f873a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f873a) {
            case 0:
                n2.j();
                return;
            case 1:
                int i10 = ci.i4.d;
                return;
            case 2:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 3:
                int i11 = ei.n.f9226n;
                return;
            case 4:
                return;
            case 5:
                int i12 = jh.c.f14173e;
                return;
            case 6:
                int i13 = org.telegram.ui.Cells.x.L;
                return;
            case 7:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 8:
                if (!MediaController.getInstance().isDownloadingCurrentMessage()) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                        return;
                    } else {
                        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                        return;
                    }
                }
                return;
            case 9:
                int i14 = cr.f25386e0;
                return;
            case 10:
                int i15 = ms.f28883s;
                return;
            case 11:
                float[] fArr = FragmentContextView.Q0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 12:
                hh0 hh0Var = hh0.f27011p0;
                mv mvVar = hh0Var.U;
                if (mvVar != null) {
                    mvVar.H();
                } else {
                    PhotoViewer photoViewer = hh0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                hh0.j(false);
                return;
            case 13:
                org.telegram.ui.Components.voip.j1.j();
                return;
            case 14:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                a2Var.c(!a2Var.b(), true);
                return;
            case 15:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.m2.i();
                    return;
                }
            case 16:
                tg.m1.f0(0, null);
                return;
            case 17:
                ArrayList arrayList = ExternalActionActivity.f33787x;
                return;
            case 18:
                return;
            case 19:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 20:
                return;
            case 21:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 22:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                int i16 = xh.o.A0;
                return;
            case 25:
                cd[] cdVarArr = xh.x.f51627p0;
                return;
            case 26:
                int i17 = xh.e0.f51254f0;
                return;
            case 27:
                int i18 = yh.r0.D0;
                return;
            default:
                int i19 = zg.f.f54562e;
                return;
        }
    }

    public e2(Object obj, int i10) {
        this.f873a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
