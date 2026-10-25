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
import org.telegram.ui.Components.mv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei;
import org.telegram.ui.ei1;
import org.telegram.ui.yx;
public final class l2 implements RequestDelegate {
    public final int f5007a;
    public final int f5008b;
    public final Object f5009c;

    public l2(int i10, ua uaVar) {
        this.f5007a = 2;
        this.f5008b = i10;
        this.f5009c = uaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5007a;
        int i11 = this.f5008b;
        Object obj = this.f5009c;
        switch (i10) {
            case 0:
                h7.e0((h7) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.h0((ca) obj, i11, tLObject, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.h0(tLObject, i11, (ua) obj, 7));
                return;
            case 3:
                di.z6 z6Var = (di.z6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(z6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new ai.h1(z6Var, arrayList, tL_stories_stories, this.f5008b, 3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new di.w6(z6Var, 1));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ai.h0((hi.o4) obj, tLObject, i11, 16));
                return;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4((mv0) obj, tLObject, i11, 20));
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.D1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new yx(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(28));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(tL_error));
                    return;
                } else {
                    return;
                }
            case 8:
                AndroidUtilities.runOnUIThread(new yx((ei) obj, tLObject, i11, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yx((ei1) obj, i11, tLObject, 20));
                return;
        }
    }

    public l2(Object obj, int i10, int i11) {
        this.f5007a = i11;
        this.f5009c = obj;
        this.f5008b = i10;
    }
}
