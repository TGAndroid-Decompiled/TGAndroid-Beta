package lh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gu0;
import org.telegram.ui.ki;
import org.telegram.ui.ma0;
import org.telegram.ui.xi1;
public final class s1 implements RequestDelegate {
    public final int f13042a;
    public final int f13043b;
    public final Object f13044c;

    public s1(int i10, ma0 ma0Var) {
        this.f13042a = 2;
        this.f13043b = i10;
        this.f13044c = ma0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f13042a;
        int i11 = this.f13043b;
        Object obj = this.f13044c;
        switch (i10) {
            case 0:
                g5.U((g5) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ah.a((t7) obj, i11, tLObject, 9));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.a(tLObject, i11, (ma0) obj, 13));
                return;
            case 3:
                nh.l6 l6Var = (nh.l6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(l6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new cg.v1(l6Var, arrayList, tL_stories_stories, this.f13043b, 5));
                    return;
                }
                AndroidUtilities.runOnUIThread(new nh.i6(l6Var, 1));
                return;
            case 4:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ey((ju0) obj, tLObject, i11, 14));
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new ey(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 26));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new mc(21));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new mc(tL_error, 22));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new ey((ki) obj, tLObject, i11, 27));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gu0((xi1) obj, i11, tLObject, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gu0((rh.n3) obj, tLObject, i11, 15));
                return;
        }
    }

    public s1(Object obj, int i10, int i11) {
        this.f13042a = i11;
        this.f13044c = obj;
        this.f13043b = i10;
    }
}
