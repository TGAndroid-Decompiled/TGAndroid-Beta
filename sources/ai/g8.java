package ai;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fm0;
import org.telegram.ui.ij1;
import org.telegram.ui.mi;
import org.telegram.ui.wa0;
public final class g8 implements RequestDelegate {
    public final int f902a;
    public final int f903b;
    public final Object f904c;

    public g8(int i10, wa0 wa0Var) {
        this.f902a = 0;
        this.f903b = i10;
        this.f904c = wa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f902a;
        int i11 = this.f903b;
        Object obj = this.f904c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(tLObject, i11, (wa0) obj, 1));
                return;
            case 1:
                d9 d9Var = (d9) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(d9Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new c9(d9Var, arrayList, tL_stories_stories, this.f903b, 0));
                    return;
                }
                AndroidUtilities.runOnUIThread(new y8(d9Var, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new s1((ei.q4) obj, tLObject, i11, 10));
                return;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new wm((wu0) obj, tLObject, i11, 16));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new wm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 28));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new sh(20));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new sh(tL_error, 21));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new wm((mi) obj, tLObject, i11, 29));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fm0((ij1) obj, i11, tLObject, 10));
                return;
            case 8:
                yh.y3.U((yh.y3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fm0((yh.u5) obj, i11, tLObject, 17));
                return;
        }
    }

    public g8(Object obj, int i10, int i11) {
        this.f902a = i11;
        this.f904c = obj;
        this.f903b = i10;
    }
}
