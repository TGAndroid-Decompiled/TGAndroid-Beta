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
    public final int f621a;
    public final KeyEvent.Callback f622b;
    public final Object f623c;
    public final Object d;
    public final Object e;

    public c5(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f621a = i10;
        this.f622b = callback;
        this.f623c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f621a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f623c;
        KeyEvent.Callback callback = this.f622b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) callback;
                sa saVar = (sa) obj4;
                jc jcVar = (jc) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = saVar.f1511b.longValue();
                        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(h5Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f1096o1 = new e5(jcVar, 0);
                        jcVar.P();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.pc Q = new xc(h5Var.f943z0.f800c1, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f27305a = 3;
                Q.k(true);
                return;
            default:
                ((tg.s0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
