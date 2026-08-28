package bg;

import android.view.KeyEvent;
import ih.m9;
import ih.n3;
import ih.p3;
import ih.z7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public final class v1 implements d5.d {
    public final int f1978a;
    public final KeyEvent.Callback f1979b;
    public final Object f1980c;
    public final Object d;
    public final Object f1981e;

    public v1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i9) {
        this.f1978a = i9;
        this.f1979b = callback;
        this.f1980c = obj;
        this.d = obj2;
        this.f1981e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i9 = this.f1978a;
        Object obj2 = this.f1981e;
        Object obj3 = this.d;
        Object obj4 = this.f1980c;
        KeyEvent.Callback callback = this.f1979b;
        switch (i9) {
            case 0:
                ((g2) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
            default:
                p3 p3Var = (p3) callback;
                z7 z7Var = (z7) obj4;
                m9 m9Var = (m9) obj3;
                b6 b6Var = (b6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = z7Var.f12382b.longValue();
                        m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(p3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f11809k1 = new n3(m9Var, 0);
                        m9Var.P();
                        return;
                    }
                    return;
                }
                gc Q = new oc(p3Var.f11946v0.Y0, b6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f28730a = 3;
                Q.k(true);
                return;
        }
    }
}
