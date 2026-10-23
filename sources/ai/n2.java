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
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.di;
public final class n2 implements RequestDelegate {
    public final int f1857a;
    public final int f1858b;
    public final Object f1859c;

    public n2(int i10, va vaVar) {
        this.f1857a = 2;
        this.f1858b = i10;
        this.f1859c = vaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1857a;
        int i11 = this.f1858b;
        Object obj = this.f1859c;
        switch (i10) {
            case 0:
                l7.e0((l7) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ah.o((ha) obj, i11, tLObject, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.o(tLObject, i11, (va) obj, 6));
                return;
            case 3:
                ci.z6 z6Var = (ci.z6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(z6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new db(z6Var, arrayList, tL_stories_stories, this.f1858b, 1));
                    return;
                }
                AndroidUtilities.runOnUIThread(new ci.w6(z6Var, 1));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ah.o((gi.f4) obj, tLObject, i11, 15));
                return;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.h4((iv0) obj, tLObject, i11, 22));
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.E1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new c41(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 4));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(25));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(tL_error, 26));
                    return;
                } else {
                    return;
                }
            case 8:
                AndroidUtilities.runOnUIThread(new c41((di) obj, tLObject, i11, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c41((ci1) obj, i11, tLObject, 22));
                return;
        }
    }

    public n2(Object obj, int i10, int i11) {
        this.f1857a = i11;
        this.f1859c = obj;
        this.f1858b = i10;
    }
}
