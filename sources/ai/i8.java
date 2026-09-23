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
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.xm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.ji;
import org.telegram.ui.yl0;
public final class i8 implements RequestDelegate {
    public final int f995a;
    public final int f996b;
    public final Object f997c;

    public i8(int i10, fi.m0 m0Var) {
        this.f995a = 0;
        this.f996b = i10;
        this.f997c = m0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f995a;
        int i11 = this.f996b;
        Object obj = this.f997c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(tLObject, i11, (fi.m0) obj, 1));
                return;
            case 1:
                d9 d9Var = (d9) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(d9Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new c9(d9Var, arrayList, tL_stories_stories, this.f996b, 0));
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
                AndroidUtilities.runOnUIThread(new xm((ju0) obj, tLObject, i11, 16));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new xm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 28));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new th(18));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new th(tL_error, 19));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new xm((ji) obj, tLObject, i11, 29));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yl0((bj1) obj, i11, tLObject, 10));
                return;
            case 8:
                yh.y3.U((yh.y3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new yl0((yh.t5) obj, i11, tLObject, 17));
                return;
        }
    }

    public i8(Object obj, int i10, int i11) {
        this.f995a = i11;
        this.f997c = obj;
        this.f996b = i10;
    }
}
