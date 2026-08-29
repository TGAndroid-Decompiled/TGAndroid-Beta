package jh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ca0;
import org.telegram.ui.ci1;
import org.telegram.ui.di;
import org.telegram.ui.ll0;
public final class s1 implements RequestDelegate {
    public final int f12752a;
    public final int f12753b;
    public final Object f12754c;

    public s1(int i10, ca0 ca0Var) {
        this.f12752a = 2;
        this.f12753b = i10;
        this.f12754c = ca0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f12752a;
        int i11 = this.f12753b;
        Object obj = this.f12754c;
        switch (i10) {
            case 0:
                h5.U((h5) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ag.v0((s7) obj, i11, tLObject, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.v0(tLObject, i11, (ca0) obj, 11));
                return;
            case 3:
                lh.k6 k6Var = (lh.k6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(k6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new ag.z1(k6Var, arrayList, tL_stories_stories, this.f12753b, 5));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lh.h6(k6Var, 1));
                return;
            case 4:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new rm((bu0) obj, tLObject, i11, 16));
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new rm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 28));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(25));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(tL_error, 26));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new rm((di) obj, tLObject, i11, 29));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ll0((ci1) obj, i11, tLObject, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ll0((ph.n3) obj, tLObject, i11, 13));
                return;
        }
    }

    public s1(Object obj, int i10, int i11) {
        this.f12752a = i11;
        this.f12754c = obj;
        this.f12753b = i10;
    }
}
