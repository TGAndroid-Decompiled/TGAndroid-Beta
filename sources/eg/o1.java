package eg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import lh.i9;
import lh.j3;
import lh.l3;
import lh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class o1 implements f5.d {
    public final int f6105a;
    public final KeyEvent.Callback f6106b;
    public final Object f6107c;
    public final Object d;
    public final Object f6108e;

    public o1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f6105a = i10;
        this.f6106b = callback;
        this.f6107c = obj;
        this.d = obj2;
        this.f6108e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f6105a;
        Object obj2 = this.f6108e;
        Object obj3 = this.d;
        Object obj4 = this.f6107c;
        KeyEvent.Callback callback = this.f6106b;
        switch (i10) {
            case 0:
                ((x1) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
            default:
                l3 l3Var = (l3) callback;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                c6 c6Var = (c6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = v7Var.f16324b.longValue();
                        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.G(l3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f15768k1 = new j3(i9Var, 0);
                        i9Var.P();
                        return;
                    }
                    return;
                }
                mc Q = new tc(l3Var.f15876v0.Y0, c6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f30645a = 3;
                Q.k(true);
                return;
        }
    }
}
