package cg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import jh.i9;
import jh.l3;
import jh.n3;
import jh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class p1 implements d5.d {

    public final int f2800a;

    public final KeyEvent.Callback f2801b;

    public final Object f2802c;
    public final Object d;

    public final Object f2803e;

    public p1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f2800a = i10;
        this.f2801b = callback;
        this.f2802c = obj;
        this.d = obj2;
        this.f2803e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f2800a;
        Object obj2 = this.f2803e;
        Object obj3 = this.d;
        Object obj4 = this.f2802c;
        KeyEvent.Callback callback = this.f2801b;
        switch (i10) {
            case 0:
                ((z1) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                n3 n3Var = (n3) callback;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                c6 c6Var = (c6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    ec ecVarQ = new mc(n3Var.f13696v0.Y0, c6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    ecVarQ.f28013a = 3;
                    ecVarQ.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    if (n2VarR != null) {
                        storyItem.dialogId = v7Var.f14059b.longValue();
                        i9 i9VarCreateOverlayStoryViewer = n2VarR.createOverlayStoryViewer();
                        i9VarCreateOverlayStoryViewer.G(n3Var.getContext(), storyItem, null);
                        i9VarCreateOverlayStoryViewer.f13490k1 = new l3(i9Var, 0);
                        i9Var.P();
                        break;
                    }
                }
                break;
        }
    }
}
