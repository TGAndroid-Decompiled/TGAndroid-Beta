package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class an8 extends ProfileStoriesView {
    public final Context u0;
    public final ProfileActivity v0;

    public an8(ProfileActivity profileActivity, Context context, int i, long j, boolean z, oc6 oc6Var, xm8 xm8Var, wjb wjbVar, Context context2) {
        super(context, i, j, z, oc6Var, xm8Var, wjbVar);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override
    public final void e(pj4 pj4Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a = profileActivity.a();
        g2b M1 = profileActivity.getMessagesController().M1();
        boolean J = M1.J(a);
        Context context = this.u0;
        if (!J && !M1.L(a) && !M1.P(a)) {
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
                profileActivity.getOrCreateStoryViewer().I(context, profileActivity.w2.stories, pj4Var);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().I(context, profileActivity.v2.stories, pj4Var);
                return;
            } else {
                profileActivity.S1();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().H(context, a, pj4Var);
    }
}
