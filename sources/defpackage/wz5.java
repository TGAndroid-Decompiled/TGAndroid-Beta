package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class wz5 implements pcc {
    public final byte a;
    public final LaunchActivity b;
    public final tg5 c;
    public final Long d;

    public wz5(LaunchActivity launchActivity, tg5 tg5Var, Long l, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.c = tg5Var;
        this.d = l;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Long l = this.d;
        tg5 tg5Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                e Q = LaunchActivity.Q();
                if (storyItem == null) {
                    d31 Y = d31.Y();
                    if (Y != null) {
                        bs2.v(null, 2131744260, Y, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    d31 Y2 = d31.Y();
                    if (Y2 != null) {
                        bs2.v(null, 2131744260, Y2, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l.longValue();
                    lcb createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.y();
                    createOverlayStoryViewer.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                e Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    d31 Y3 = d31.Y();
                    if (Y3 != null) {
                        bs2.v(null, 2131744260, Y3, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    d31 Y4 = d31.Y();
                    if (Y4 != null) {
                        bs2.v(null, 2131744260, Y4, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l.longValue();
                    lcb createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.y();
                    createOverlayStoryViewer2.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
