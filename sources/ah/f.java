package ah;

import ai.a2;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ci.p1;
import ei.c4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.y2;
public final class f implements View.OnClickListener {
    public final int f724a;

    public f(int i10) {
        this.f724a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f724a) {
            case 0:
                int i10 = i.e;
                return;
            case 1:
                int i11 = a2.D0;
                return;
            case 2:
                p1.j();
                return;
            case 3:
                int i12 = c4.d;
                return;
            case 4:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 5:
                int i13 = gi.n.f11344n;
                return;
            case 6:
                int i14 = kh.c.e;
                return;
            case 7:
                return;
            case 8:
                int i15 = org.telegram.ui.Cells.x.L;
                return;
            case 9:
                n2 R = LaunchActivity.R();
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
                int i16 = wq.f32196e0;
                return;
            case 12:
                int i17 = fs.f26385s;
                return;
            case 13:
                float[] fArr = FragmentContextView.Q0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 14:
                zg0 zg0Var = zg0.f32912p0;
                cv cvVar = zg0Var.U;
                if (cvVar != null) {
                    cvVar.H();
                } else {
                    PhotoViewer photoViewer = zg0Var.V;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                zg0.j(false);
                return;
            case 15:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 16:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                a2Var.c(!a2Var.b(), true);
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
                ug.m1.f0(0, null);
                return;
            case 19:
                ArrayList arrayList = ExternalActionActivity.f33125x;
                return;
            case 20:
                return;
            case 21:
                Pattern pattern = LaunchActivity.C1;
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
                int i18 = y2.T;
                return;
            case 25:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
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
                int i19 = yh.n.A0;
                return;
            case 28:
                zc[] zcVarArr = yh.w.f50594p0;
                return;
            default:
                int i20 = yh.d0.f50240f0;
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f724a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
