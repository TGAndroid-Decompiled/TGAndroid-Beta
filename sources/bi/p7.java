package bi;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ue;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.dm;
import org.telegram.ui.jj1;
import org.telegram.ui.mi;
import org.telegram.ui.ua0;
public final class p7 implements RequestDelegate {
    public final int f3505a;
    public final int f3506b;
    public final Object f3507c;

    public p7(int i10, ua0 ua0Var) {
        this.f3505a = 0;
        this.f3506b = i10;
        this.f3507c = ua0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f3505a;
        int i11 = this.f3506b;
        Object obj = this.f3507c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.p(tLObject, i11, (ua0) obj, 2));
                return;
            case 1:
                l8 l8Var = (l8) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(l8Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new k8(l8Var, arrayList, tL_stories_stories, this.f3506b, 0));
                    return;
                }
                AndroidUtilities.runOnUIThread(new g8(l8Var, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.p((fi.r4) obj, tLObject, i11, 11));
                return;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dm((iu0) obj, tLObject, i11, 17));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new dm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 29));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new ue(19));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ue(tL_error, 20));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai0((mi) obj, tLObject, i11, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai0((jj1) obj, i11, tLObject, 11));
                return;
            case 8:
                zh.w3.U((zh.w3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai0((zh.s5) obj, i11, tLObject, 18));
                return;
        }
    }

    public p7(Object obj, int i10, int i11) {
        this.f3505a = i11;
        this.f3507c = obj;
        this.f3506b = i10;
    }
}
