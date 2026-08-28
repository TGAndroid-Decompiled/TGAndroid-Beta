package fh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class n implements View.OnClickListener {
    public final int f6635a;

    public n(int i9) {
        this.f6635a = i9;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6635a) {
            case 0:
                int i9 = x.f6839w0;
                return;
            case 1:
                qc[] qcVarArr = k0.f6561l0;
                return;
            case 2:
                int i10 = r0.f6732b0;
                return;
            case 3:
                int i11 = gh.l1.f8460z0;
                return;
            case 4:
                int i12 = hg.f.f10597e;
                return;
            case 5:
                ih.k1.j();
                return;
            case 6:
                int i13 = kh.c4.d;
                return;
            case 7:
                PhotoViewer.t1().i0(1.0f, 0.0f, 0.0f, false);
                return;
            case 8:
                int i14 = mh.n.f17987n;
                return;
            case 9:
                int i15 = org.telegram.ui.Cells.x.H;
                return;
            case 10:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 11:
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
            case 12:
                int i16 = cq.f27542a0;
                return;
            case 13:
                int i17 = kr.f30225s;
                return;
            case 14:
                float[] fArr = FragmentContextView.I0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 15:
                pf0 pf0Var = pf0.f31622l0;
                gu guVar = pf0Var.Q;
                if (guVar != null) {
                    guVar.G();
                } else {
                    PhotoViewer photoViewer = pf0Var.R;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                pf0.j(false);
                return;
            case 16:
                org.telegram.ui.Components.voip.g1.j();
                return;
            case 17:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                z1Var.c(!z1Var.b(), true);
                return;
            case 18:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    org.telegram.ui.Components.voip.l2.i();
                    return;
                }
            case 19:
                bg.g3.d0(0, null);
                return;
            case 20:
                ArrayList arrayList = ExternalActionActivity.f35465x;
                return;
            case 21:
                return;
            case 22:
                Pattern pattern = LaunchActivity.f35493x1;
                return;
            case 23:
                return;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                return;
            case 26:
                int i18 = rg.c.f47175e;
                return;
            case 27:
                PhotoViewer.t1().i0(1.0f, 0.0f, 0.0f, false);
                return;
            default:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public n(Object obj, int i9) {
        this.f6635a = i9;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
