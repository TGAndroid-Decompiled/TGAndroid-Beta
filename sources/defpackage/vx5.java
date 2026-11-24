package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class vx5 implements p8c {
    public final byte a;
    public final LaunchActivity b;
    public final kz5 c;
    public final Long d;

    public vx5(LaunchActivity launchActivity, kz5 kz5Var, Long l, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.c = kz5Var;
        this.d = l;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Long l = this.d;
        kz5 kz5Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                d Q = LaunchActivity.Q();
                if (storyItem == null) {
                    u21 Y = u21.Y();
                    if (Y != null) {
                        ir2.v(null, 2131744366, Y, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    u21 Y2 = u21.Y();
                    if (Y2 != null) {
                        ir2.v(null, 2131744366, Y2, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l.longValue();
                    m8b createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.y();
                    createOverlayStoryViewer.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                d Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    u21 Y3 = u21.Y();
                    if (Y3 != null) {
                        ir2.v(null, 2131744366, Y3, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    u21 Y4 = u21.Y();
                    if (Y4 != null) {
                        ir2.v(null, 2131744366, Y4, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l.longValue();
                    m8b createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.y();
                    createOverlayStoryViewer2.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
