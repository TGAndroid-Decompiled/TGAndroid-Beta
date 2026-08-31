package mh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.ii;
import org.telegram.ui.la0;
import org.telegram.ui.si1;
public final class r1 implements RequestDelegate {
    public final int f14663a;
    public final int f14664b;
    public final Object f14665c;

    public r1(int i10, la0 la0Var) {
        this.f14663a = 2;
        this.f14664b = i10;
        this.f14665c = la0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f14663a;
        int i11 = this.f14664b;
        Object obj = this.f14665c;
        switch (i10) {
            case 0:
                g5.U((g5) obj, i11, tLObject);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bh.a((t7) obj, i11, tLObject, 9));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bh.a(tLObject, i11, (la0) obj, 14));
                return;
            case 3:
                oh.l6 l6Var = (oh.l6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(l6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new dg.u1(l6Var, arrayList, tL_stories_stories, this.f14664b, 5));
                    return;
                }
                AndroidUtilities.runOnUIThread(new oh.i6(l6Var, 1));
                return;
            case 4:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gy((ku0) obj, tLObject, i11, 14));
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new gy(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 26));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new jc(23));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new jc(tL_error, 24));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new gy((ii) obj, tLObject, i11, 27));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bu0((si1) obj, i11, tLObject, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bu0((sh.n3) obj, tLObject, i11, 16));
                return;
        }
    }

    public r1(Object obj, int i10, int i11) {
        this.f14663a = i11;
        this.f14665c = obj;
        this.f14664b = i10;
    }
}
