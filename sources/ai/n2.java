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
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi;
import org.telegram.ui.xh1;
public final class n2 implements RequestDelegate {
    public final int f1884a;
    public final int f1885b;
    public final Object f1886c;

    public n2(int i10, ua uaVar) {
        this.f1884a = 2;
        this.f1885b = i10;
        this.f1886c = uaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1884a;
        int i11 = this.f1885b;
        Object obj = this.f1886c;
        switch (i10) {
            case 0:
                k7.g0((k7) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ah.o((ga) obj, i11, tLObject, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.o(tLObject, i11, (ua) obj, 6));
                return;
            case 3:
                ci.a7 a7Var = (ci.a7) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(a7Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new cb(a7Var, arrayList, tL_stories_stories, this.f1885b, 1));
                    return;
                }
                AndroidUtilities.runOnUIThread(new ci.x6(a7Var, 1));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ah.o((gi.f4) obj, tLObject, i11, 15));
                return;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.i4((dv0) obj, tLObject, i11, 22));
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.C1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new w31(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 4));
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
                AndroidUtilities.runOnUIThread(new w31((fi) obj, tLObject, i11, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w31((xh1) obj, i11, tLObject, 21));
                return;
        }
    }

    public n2(Object obj, int i10, int i11) {
        this.f1884a = i11;
        this.f1886c = obj;
        this.f1885b = i10;
    }
}
