package bg;

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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class n implements View.OnClickListener {
    public final int f2404a;

    public n(int i10) {
        this.f2404a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2404a) {
            case 0:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 1:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 2:
                int i10 = ih.t.f9377w0;
                return;
            case 3:
                vc[] vcVarArr = ih.g0.f9164l0;
                return;
            case 4:
                int i11 = ih.n0.f9288b0;
                return;
            case 5:
                int i12 = jh.j1.f12282z0;
                return;
            case 6:
                int i13 = kg.f.f13706e;
                return;
            case 7:
                lh.i1.j();
                return;
            case 8:
                int i14 = nh.x3.d;
                return;
            case 9:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 10:
                int i15 = org.telegram.ui.Cells.x.H;
                return;
            case 11:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 12:
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
            case 13:
                int i16 = gq.f28945a0;
                return;
            case 14:
                int i17 = or.f31456s;
                return;
            case 15:
                float[] fArr = FragmentContextView.I0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 16:
                bg0 bg0Var = bg0.f27076l0;
                mu muVar = bg0Var.Q;
                if (muVar != null) {
                    muVar.G();
                } else {
                    PhotoViewer photoViewer = bg0Var.R;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                bg0.j(false);
                return;
            case 17:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 18:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                y1Var.c(!y1Var.b(), true);
                return;
            case 19:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.o2.i();
                    return;
                }
            case 20:
                eg.w2.e0(0, null);
                return;
            case 21:
                ArrayList arrayList = ExternalActionActivity.f35532x;
                return;
            case 22:
                return;
            case 23:
                Pattern pattern = LaunchActivity.f35560x1;
                return;
            case 24:
                return;
            case 25:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e11) {
                    FileLog.e(e11);
                    return;
                }
            case 26:
                int i18 = ph.l.f45872n;
                return;
            case 27:
                return;
            default:
                int i19 = ug.c.f49212e;
                return;
        }
    }

    public n(Object obj, int i10) {
        this.f2404a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
