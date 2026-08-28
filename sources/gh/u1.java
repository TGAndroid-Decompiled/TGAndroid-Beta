package gh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.bi1;
import org.telegram.ui.jh0;
import org.telegram.ui.rl;
import org.telegram.ui.z90;
public final class u1 implements RequestDelegate {
    public final int f8945a;
    public final int f8946b;
    public final Object f8947c;

    public u1(int i9, z90 z90Var) {
        this.f8945a = 2;
        this.f8946b = i9;
        this.f8947c = z90Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f8945a;
        int i10 = this.f8946b;
        Object obj = this.f8947c;
        switch (i9) {
            case 0:
                k5.T((k5) obj, i10, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d5.i((v7) obj, i10, tLObject, 5));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new d5.i(tLObject, i10, (z90) obj, 9));
                return;
            case 3:
                ih.n6 n6Var = (ih.n6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < tL_stories_stories.stories.size(); i11++) {
                        arrayList.add(n6Var.y(tL_stories_stories.stories.get(i11)));
                    }
                    AndroidUtilities.runOnUIThread(new c3.d(n6Var, arrayList, tL_stories_stories, this.f8946b, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new ih.k6(n6Var, 1));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d5.i((mh.g4) obj, tLObject, i10, 17));
                return;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i10, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rl((pt0) obj, tLObject, i10, 17));
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new rl(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i10, 29));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new hc(23));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new hc(tL_error, 24));
                    return;
                } else {
                    return;
                }
            case 8:
                AndroidUtilities.runOnUIThread(new jh0((ai) obj, tLObject, i10, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jh0((bi1) obj, i10, tLObject, 11));
                return;
        }
    }

    public u1(Object obj, int i9, int i10) {
        this.f8945a = i10;
        this.f8947c = obj;
        this.f8946b = i9;
    }
}
