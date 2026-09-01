package eg;

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
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ur;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class m implements View.OnClickListener {
    public final int f5344a;

    public m(int i10) {
        this.f5344a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5344a) {
            case 0:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 1:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e6) {
                    FileLog.e(e6);
                    return;
                }
            case 2:
                int i10 = lh.s.f12936x0;
                return;
            case 3:
                sc[] scVarArr = lh.f0.m0;
                return;
            case 4:
                int i11 = lh.m0.f12846c0;
                return;
            case 5:
                int i12 = mh.i1.A0;
                return;
            case 6:
                int i13 = ng.f.f16058e;
                return;
            case 7:
                oh.j1.j();
                return;
            case 8:
                int i14 = org.telegram.ui.Cells.x.I;
                return;
            case 9:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 10:
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
            case 11:
                int i15 = mq.f29183b0;
                return;
            case 12:
                int i16 = ur.f31713s;
                return;
            case 13:
                float[] fArr = FragmentContextView.J0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 14:
                ng0 ng0Var = ng0.m0;
                ru ruVar = ng0Var.R;
                if (ruVar != null) {
                    ruVar.G();
                } else {
                    PhotoViewer photoViewer = ng0Var.S;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                ng0.j(false);
                return;
            case 15:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 16:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                z1Var.c(!z1Var.b(), true);
                return;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.n2.i();
                    return;
                }
            case 18:
                hg.v2.e0(0, null);
                return;
            case 19:
                ArrayList arrayList = ExternalActionActivity.f34106x;
                return;
            case 20:
                return;
            case 21:
                Pattern pattern = LaunchActivity.f34134y1;
                return;
            case 22:
                return;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                int i17 = qh.j3.d;
                return;
            case 25:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 26:
                int i18 = sh.l.f47497n;
                return;
            case 27:
                return;
            default:
                int i19 = xg.c.f50562e;
                return;
        }
    }

    public m(Object obj, int i10) {
        this.f5344a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
