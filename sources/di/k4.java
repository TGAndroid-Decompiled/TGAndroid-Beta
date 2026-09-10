package di;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nj1;
import org.telegram.ui.oi;
import org.telegram.ui.ta0;
import org.telegram.ui.uu0;
import xh.v5;
public final class k4 implements RequestDelegate {
    public final int f6730a;
    public final int f6731b;
    public final Object f6732c;

    public k4(int i10, ta0 ta0Var) {
        this.f6730a = 8;
        this.f6731b = i10;
        this.f6732c = ta0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6730a;
        int i11 = this.f6731b;
        Object obj = this.f6732c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.g3((u4) obj, tLObject, i11, 6));
                return;
            case 1:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new my((tu0) obj, tLObject, i11, 14));
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new my(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 26));
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new c30(13));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new c30(tL_error, 14));
                    return;
                } else {
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new my((oi) obj, tLObject, i11, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new uu0((nj1) obj, i11, tLObject, 8));
                return;
            case 6:
                xh.x3.U((xh.x3) obj, i11, tLObject);
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new uu0((v5) obj, i11, tLObject, 14));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new uu0(tLObject, i11, (ta0) obj, 18));
                return;
            default:
                zh.a5 a5Var = (zh.a5) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(a5Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new g21(a5Var, arrayList, tL_stories_stories, this.f6731b, 18));
                    return;
                }
                AndroidUtilities.runOnUIThread(new zh.x4(a5Var, 1));
                return;
        }
    }

    public k4(Object obj, int i10, int i11) {
        this.f6730a = i11;
        this.f6732c = obj;
        this.f6731b = i10;
    }
}
