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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.wu;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class e2 implements View.OnClickListener {
    public final int f760a;

    public e2(int i10) {
        this.f760a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f760a) {
            case 0:
                m2.j();
                return;
            case 1:
                int i10 = ci.j4.d;
                return;
            case 2:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 3:
                int i11 = ei.n.f8477n;
                return;
            case 4:
                return;
            case 5:
                int i12 = jh.c.e;
                return;
            case 6:
                int i13 = org.telegram.ui.Cells.x.L;
                return;
            case 7:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
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
                int i14 = nq.f26764e0;
                return;
            case 10:
                int i15 = vr.f29787s;
                return;
            case 11:
                float[] fArr = FragmentContextView.O0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 12:
                og0 og0Var = og0.f27042p0;
                wu wuVar = og0Var.U;
                if (wuVar != null) {
                    wuVar.H();
                } else {
                    PhotoViewer photoViewer = og0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                og0.j(false);
                return;
            case 13:
                org.telegram.ui.Components.voip.k1.j();
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
                    org.telegram.ui.Components.voip.n2.i();
                    return;
                }
            case 16:
                tg.m1.e0(0, null);
                return;
            case 17:
                ArrayList arrayList = ExternalActionActivity.f31061x;
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
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 22:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                int i16 = xh.m.A0;
                return;
            case 25:
                ad[] adVarArr = xh.v.f46414p0;
                return;
            case 26:
                int i17 = xh.c0.f46080f0;
                return;
            case 27:
                int i18 = yh.s0.D0;
                return;
            default:
                int i19 = zg.f.e;
                return;
        }
    }

    public e2(Object obj, int i10) {
        this.f760a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
