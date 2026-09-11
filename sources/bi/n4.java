package bi;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class n4 implements e2.h {
    public final int f3360a;
    public final KeyEvent.Callback f3361b;
    public final Object f3362c;
    public final Object d;
    public final Object f3363e;

    public n4(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f3360a = i10;
        this.f3361b = callback;
        this.f3362c = obj;
        this.d = obj2;
        this.f3363e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f3360a;
        Object obj2 = this.f3363e;
        Object obj3 = this.d;
        Object obj4 = this.f3362c;
        KeyEvent.Callback callback = this.f3361b;
        switch (i10) {
            case 0:
                s4 s4Var = (s4) callback;
                z9 z9Var = (z9) obj4;
                pb pbVar = (pb) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = z9Var.f4075b.longValue();
                        pb createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(s4Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f3564o1 = new p4(pbVar, 0);
                        pbVar.P();
                        return;
                    }
                    return;
                }
                qc Q = new yc(s4Var.f3687z0.f3409c1, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f29672a = 3;
                Q.k(true);
                return;
            default:
                ((ug.t0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
