package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class uz5 implements qac {
    public final byte a;
    public final LaunchActivity b;
    public final k16 c;
    public final Long d;

    public uz5(LaunchActivity launchActivity, k16 k16Var, Long l, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.c = k16Var;
        this.d = l;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Long l = this.d;
        k16 k16Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                d Q = LaunchActivity.Q();
                if (storyItem == null) {
                    c41 Y = c41.Y();
                    if (Y != null) {
                        ts2.u(null, 2131744292, Y, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    c41 Y2 = c41.Y();
                    if (Y2 != null) {
                        ts2.u(null, 2131744292, Y2, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l.longValue();
                    oab createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.z();
                    createOverlayStoryViewer.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                d Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    c41 Y3 = c41.Y();
                    if (Y3 != null) {
                        ts2.u(null, 2131744292, Y3, 2131624231, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    c41 Y4 = c41.Y();
                    if (Y4 != null) {
                        ts2.u(null, 2131744292, Y4, 2131624230, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l.longValue();
                    oab createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.z();
                    createOverlayStoryViewer2.J(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
