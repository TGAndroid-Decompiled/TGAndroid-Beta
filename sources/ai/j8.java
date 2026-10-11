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
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.jj1;
import org.telegram.ui.mi;
public final class j8 implements RequestDelegate {
    public final int f1190a;
    public final int f1191b;
    public final Object f1192c;

    public j8(int i10, fi.m0 m0Var) {
        this.f1190a = 0;
        this.f1191b = i10;
        this.f1192c = m0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1190a;
        int i11 = this.f1191b;
        Object obj = this.f1192c;
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
                    AndroidUtilities.runOnUIThread(new d9(e9Var, arrayList, tL_stories_stories, this.f1191b, 0));
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
                AndroidUtilities.runOnUIThread(new zk((nv0) obj, tLObject, i11, 17));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new zk(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 29));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new vh(20));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new vh(tL_error, 21));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai0((mi) obj, tLObject, i11, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai0((jj1) obj, i11, tLObject, 16));
                return;
            case 8:
                yh.s3.V((yh.s3) obj, i11, tLObject);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai0((yh.n5) obj, i11, tLObject, 23));
                return;
        }
    }

    public j8(Object obj, int i10, int i11) {
        this.f1190a = i11;
        this.f1192c = obj;
        this.f1191b = i10;
    }
}
