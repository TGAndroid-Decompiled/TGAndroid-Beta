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
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.xh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.mj1;
import org.telegram.ui.qi;
public final class j8 implements RequestDelegate {
    public final int f1188a;
    public final int f1189b;
    public final Object f1190c;

    public j8(int i10, fi.m0 m0Var) {
        this.f1188a = 0;
        this.f1189b = i10;
        this.f1190c = m0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1188a;
        int i11 = this.f1189b;
        Object obj = this.f1190c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(tLObject, i11, (fi.m0) obj, 1));
                return;
            case 1:
                e9 e9Var = (e9) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(e9Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new d9(e9Var, arrayList, tL_stories_stories, this.f1189b, 0));
                    return;
                }
                AndroidUtilities.runOnUIThread(new z8(e9Var, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new s1((ei.p4) obj, tLObject, i11, 10));
                return;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bl((sv0) obj, tLObject, i11, 17));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new bl(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 29));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new xh(20));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new xh(tL_error, 21));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ci0((qi) obj, tLObject, i11, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ci0((mj1) obj, i11, tLObject, 16));
                return;
            case 8:
                yh.s3.V((yh.s3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ci0((yh.n5) obj, i11, tLObject, 23));
                return;
        }
    }

    public j8(Object obj, int i10, int i11) {
        this.f1188a = i11;
        this.f1190c = obj;
        this.f1189b = i10;
    }
}
