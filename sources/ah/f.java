package ah;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.b2;
import di.i4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class f implements View.OnClickListener {
    public final int f722a;

    public f(int i10) {
        this.f722a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f722a) {
            case 0:
                int i10 = i.e;
                return;
            case 1:
                b2.j();
                return;
            case 2:
                int i11 = i4.d;
                return;
            case 3:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 4:
                int i12 = fi.n.f9423n;
                return;
            case 5:
                return;
            case 6:
                int i13 = kh.c.e;
                return;
            case 7:
                int i14 = org.telegram.ui.Cells.x.L;
                return;
            case 8:
                m2 R = LaunchActivity.R();
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
                int i15 = zq.f31663e0;
                return;
            case 11:
                int i16 = is.f25774s;
                return;
            case 12:
                float[] fArr = FragmentContextView.Q0;
                MediaController.getInstance().updateSilent(false);
                return;
            case 13:
                fh0 fh0Var = fh0.f24733p0;
                hv hvVar = fh0Var.U;
                if (hvVar != null) {
                    hvVar.H();
                } else {
                    PhotoViewer photoViewer = fh0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                fh0.j(false);
                return;
            case 14:
                org.telegram.ui.Components.voip.h1.j();
                return;
            case 15:
                a2 a2Var = (a2) view;
                a2Var.c(!a2Var.b(), true);
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
                ug.m1.f0(0, null);
                return;
            case 18:
                ArrayList arrayList = ExternalActionActivity.f31780x;
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
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                return;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    return;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 25:
                int i17 = yh.n.A0;
                return;
            case 26:
                bd[] bdVarArr = yh.w.f49164p0;
                return;
            case 27:
                int i18 = yh.d0.f48808f0;
                return;
            default:
                int i19 = zh.r0.D0;
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f722a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
