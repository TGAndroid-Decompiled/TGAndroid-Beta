package bi;

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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.zu;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class d5 implements View.OnClickListener {
    public final int f2546a;

    public d5(int i10) {
        this.f2546a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2546a) {
            case 0:
                int i10 = e5.d;
                return;
            case 1:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 2:
                int i11 = di.p.f6835n;
                return;
            case 3:
                return;
            case 4:
                int i12 = ih.c.e;
                return;
            case 5:
                int i13 = org.telegram.ui.Cells.x.L;
                return;
            case 6:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 7:
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
            case 8:
                int i14 = sq.f27150e0;
                return;
            case 9:
                int i15 = as.f21572s;
                return;
            case 10:
                float[] fArr = FragmentContextView.M0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 11:
                og0 og0Var = og0.f25781p0;
                zu zuVar = og0Var.U;
                if (zuVar != null) {
                    zuVar.H();
                } else {
                    PhotoViewer photoViewer = og0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                og0.j(false);
                return;
            case 12:
                org.telegram.ui.Components.voip.i1.j();
                return;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                z1Var.c(!z1Var.b(), true);
                return;
            case 14:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.l2.i();
                    return;
                }
            case 15:
                sg.p1.e0(0, null);
                return;
            case 16:
                ArrayList arrayList = ExternalActionActivity.f29902x;
                return;
            case 17:
                return;
            case 18:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 19:
                return;
            case 20:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 21:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 22:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                int i16 = wh.m.A0;
                return;
            case 24:
                org.telegram.ui.Components.yc[] ycVarArr = wh.w.f44396p0;
                return;
            case 25:
                int i17 = wh.d0.f44046f0;
                return;
            case 26:
                int i18 = xh.s0.D0;
                return;
            case 27:
                int i19 = yg.g.e;
                return;
            default:
                zh.x0.j();
                return;
        }
    }

    public d5(Object obj, int i10) {
        this.f2546a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
