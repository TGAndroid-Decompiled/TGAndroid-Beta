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
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c90;
import org.telegram.ui.gm;
import org.telegram.ui.qi;
import org.telegram.ui.sj1;
public final class u7 implements RequestDelegate {
    public final int f3789a;
    public final int f3790b;
    public final Object f3791c;

    public u7(int i10, gi.m0 m0Var) {
        this.f3789a = 0;
        this.f3790b = i10;
        this.f3791c = m0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f3789a;
        int i11 = this.f3790b;
        Object obj = this.f3791c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.o(tLObject, i11, (gi.m0) obj, 2));
                return;
            case 1:
                o8 o8Var = (o8) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(o8Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new n8(o8Var, arrayList, tL_stories_stories, this.f3790b, 0));
                    return;
                }
                AndroidUtilities.runOnUIThread(new j8(o8Var, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.o((fi.q4) obj, tLObject, i11, 11));
                return;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gm((iv0) obj, tLObject, i11, 18));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new c90(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 0));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new ve(21));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ve(tL_error, 22));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new c90((qi) obj, tLObject, i11, 1));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c90((sj1) obj, i11, tLObject, 17));
                return;
            case 8:
                zh.r3.V((zh.r3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new c90((zh.n5) obj, i11, tLObject, 24));
                return;
        }
    }

    public u7(Object obj, int i10, int i11) {
        this.f3789a = i11;
        this.f3791c = obj;
        this.f3790b = i10;
    }
}
