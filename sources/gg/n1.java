package gg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import nh.i9;
import nh.k3;
import nh.m3;
import nh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class n1 implements h5.d {
    public final int f6710a;
    public final KeyEvent.Callback f6711b;
    public final Object f6712c;
    public final Object d;
    public final Object e;

    public n1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f6710a = i10;
        this.f6711b = callback;
        this.f6712c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f6710a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f6712c;
        KeyEvent.Callback callback = this.f6711b;
        switch (i10) {
            case 0:
                ((w1) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
            default:
                m3 m3Var = (m3) callback;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                f6 f6Var = (f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = v7Var.f15976b.longValue();
                        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.G(m3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.l1 = new k3(i9Var, 0);
                        i9Var.P();
                        return;
                    }
                    return;
                }
                ic Q = new qc(m3Var.f15585w0.Z0, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f25665a = 3;
                Q.k(true);
                return;
        }
    }
}
