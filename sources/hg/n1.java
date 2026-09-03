package hg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import oh.i9;
import oh.l3;
import oh.n3;
import oh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class n1 implements h5.d {
    public final int f7574a;
    public final KeyEvent.Callback f7575b;
    public final Object f7576c;
    public final Object d;
    public final Object f7577e;

    public n1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f7574a = i10;
        this.f7575b = callback;
        this.f7576c = obj;
        this.d = obj2;
        this.f7577e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f7574a;
        Object obj2 = this.f7577e;
        Object obj3 = this.d;
        Object obj4 = this.f7576c;
        KeyEvent.Callback callback = this.f7575b;
        switch (i10) {
            case 0:
                ((w1) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
            default:
                n3 n3Var = (n3) callback;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                g6 g6Var = (g6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = v7Var.f17860b.longValue();
                        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.G(n3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.l1 = new l3(i9Var, 0);
                        i9Var.P();
                        return;
                    }
                    return;
                }
                ic Q = new qc(n3Var.f17483w0.Z0, g6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f27771a = 3;
                Q.k(true);
                return;
        }
    }
}
