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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.zu;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class e2 implements View.OnClickListener {
    public final int f826a;

    public e2(int i10) {
        this.f826a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f826a) {
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
                int i11 = ei.o.f9224n;
                return;
            case 4:
                return;
            case 5:
                int i12 = jh.c.f14137e;
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
                int i14 = pq.f29809e0;
                return;
            case 10:
                int i15 = xr.f33071s;
                return;
            case 11:
                float[] fArr = FragmentContextView.P0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 12:
                rg0 rg0Var = rg0.f30466p0;
                zu zuVar = rg0Var.U;
                if (zuVar != null) {
                    zuVar.F();
                } else {
                    PhotoViewer photoViewer = rg0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                rg0.j(false);
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
                ArrayList arrayList = ExternalActionActivity.f33759x;
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
                int i16 = xh.m.A0;
                return;
            case 25:
                ad[] adVarArr = xh.v.f50266p0;
                return;
            case 26:
                int i17 = xh.c0.f49913f0;
                return;
            case 27:
                int i18 = yh.t0.f51985z0;
                return;
            default:
                int i19 = zg.f.f53377e;
                return;
        }
    }

    public e2(Object obj, int i10) {
        this.f826a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
