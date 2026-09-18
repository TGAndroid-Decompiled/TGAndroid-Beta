package ai;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class c5 implements e2.h {
    public final int f624a;
    public final KeyEvent.Callback f625b;
    public final Object f626c;
    public final Object d;
    public final Object e;

    public c5(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f624a = i10;
        this.f625b = callback;
        this.f626c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f624a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f626c;
        KeyEvent.Callback callback = this.f625b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) callback;
                sa saVar = (sa) obj4;
                jc jcVar = (jc) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = saVar.f1514b.longValue();
                        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(h5Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f1099o1 = new e5(jcVar, 0);
                        jcVar.P();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.qc Q = new xc(h5Var.f946z0.f803c1, e6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f27544a = 3;
                Q.k(true);
                return;
            default:
                ((tg.s0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
