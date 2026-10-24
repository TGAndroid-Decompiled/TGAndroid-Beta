package ah;

import ai.a2;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ci.o1;
import ei.c4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.y2;
public final class f implements View.OnClickListener {
    public final int f723a;

    public f(int i10) {
        this.f723a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f723a) {
            case 0:
                int i10 = i.e;
                return;
            case 1:
                int i11 = a2.F0;
                return;
            case 2:
                o1.j();
                return;
            case 3:
                int i12 = c4.d;
                return;
            case 4:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 5:
                int i13 = gi.n.f11366n;
                return;
            case 6:
                int i14 = kh.c.e;
                return;
            case 7:
                return;
            case 8:
                int i15 = org.telegram.ui.Cells.w.L;
                return;
            case 9:
                o2 R = LaunchActivity.R();
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
                int i16 = uq.f31197f0;
                return;
            case 12:
                int i17 = ds.f25820w;
                return;
            case 13:
                float[] fArr = FragmentContextView.W0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 14:
                ch0 ch0Var = ch0.f25313p0;
                av avVar = ch0Var.U;
                if (avVar != null) {
                    avVar.F();
                } else {
                    PhotoViewer photoViewer = ch0Var.V;
                    if (photoViewer != null) {
                        photoViewer.R0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                ch0.j(false);
                return;
            case 15:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 16:
                z1 z1Var = (z1) view;
                z1Var.c(!z1Var.b(), true);
                return;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    k2.i();
                    return;
                }
            case 18:
                ug.l1.e0(0, null);
                return;
            case 19:
                ArrayList arrayList = ExternalActionActivity.f33434x;
                return;
            case 20:
                return;
            case 21:
                Pattern pattern = LaunchActivity.D1;
                return;
            case 22:
                return;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                int i18 = y2.W;
                return;
            case 25:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 26:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                int i19 = yh.m.A0;
                return;
            case 28:
                xc[] xcVarArr = yh.v.f51000p0;
                return;
            default:
                int i20 = yh.c0.f50627g0;
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f723a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
