package bh;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.x1;
import di.o1;
import fi.a4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.y2;
import vg.n1;
public final class f implements View.OnClickListener {
    public final int f4026a;

    public f(int i10) {
        this.f4026a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4026a) {
            case 0:
                int i10 = h.e;
                return;
            case 1:
                int i11 = x1.A0;
                return;
            case 2:
                o1.j();
                return;
            case 3:
                int i12 = a4.d;
                return;
            case 4:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 5:
                int i13 = hi.u.f13297n;
                return;
            case 6:
                int i14 = lh.c.e;
                return;
            case 7:
                return;
            case 8:
                int i15 = org.telegram.ui.Cells.w.L;
                return;
            case 9:
                r2 R = LaunchActivity.R();
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
                int i16 = yq.f35113f0;
                return;
            case 12:
                int i17 = hs.f29042w;
                return;
            case 13:
                float[] fArr = FragmentContextView.W0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 14:
                ch0 ch0Var = ch0.f27159p0;
                dv dvVar = ch0Var.U;
                if (dvVar != null) {
                    dvVar.G();
                } else {
                    PhotoViewer photoViewer = ch0Var.V;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                ch0.j(false);
                return;
            case 15:
                i1.j();
                return;
            case 16:
                y1 y1Var = (y1) view;
                y1Var.c(!y1Var.b(), true);
                return;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.hangUp();
                    return;
                } else {
                    n2.i();
                    return;
                }
            case 18:
                n1.e0(0, null);
                return;
            case 19:
                ArrayList arrayList = ExternalActionActivity.f35498x;
                return;
            case 20:
                return;
            case 21:
                Pattern pattern = LaunchActivity.D1;
                return;
            case 22:
                return;
            case 23:
                int i18 = ProfileActivity.R6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    return;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                int i19 = y2.W;
                return;
            case 25:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                return;
            case 26:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                int i20 = zh.m.A0;
                return;
            case 28:
                yc[] ycVarArr = zh.v.f53283p0;
                return;
            default:
                int i21 = zh.c0.f52913g0;
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f4026a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
