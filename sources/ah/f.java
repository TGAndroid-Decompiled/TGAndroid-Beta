package ah;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.a2;
import di.k4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class f implements View.OnClickListener {
    public final int f529a;

    public f(int i10) {
        this.f529a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f529a) {
            case 0:
                int i10 = i.f582e;
                return;
            case 1:
                a2.j();
                return;
            case 2:
                int i11 = k4.d;
                return;
            case 3:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 4:
                int i12 = fi.o.f9846n;
                return;
            case 5:
                return;
            case 6:
                int i13 = kh.c.f14940e;
                return;
            case 7:
                int i14 = org.telegram.ui.Cells.x.L;
                return;
            case 8:
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    return;
                }
                return;
            case 9:
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
            case 10:
                int i15 = lq.f28275e0;
                return;
            case 11:
                int i16 = tr.f30684s;
                return;
            case 12:
                float[] fArr = FragmentContextView.M0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 13:
                eg0 eg0Var = eg0.f25675p0;
                tu tuVar = eg0Var.U;
                if (tuVar != null) {
                    tuVar.H();
                } else {
                    PhotoViewer photoViewer = eg0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                eg0.j(false);
                return;
            case 14:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 15:
                z1 z1Var = (z1) view;
                z1Var.c(!z1Var.b(), true);
                return;
            case 16:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    k2.i();
                    return;
                }
            case 17:
                ug.n1.e0(0, null);
                return;
            case 18:
                ArrayList arrayList = ExternalActionActivity.f33395x;
                return;
            case 19:
                return;
            case 20:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 21:
                return;
            case 22:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                int i17 = yh.m.A0;
                return;
            case 26:
                ad[] adVarArr = yh.v.f50587p0;
                return;
            case 27:
                int i18 = yh.c0.f50214f0;
                return;
            default:
                int i19 = zh.s0.D0;
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f529a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
