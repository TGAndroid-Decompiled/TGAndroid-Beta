package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class bp8 extends ProfileStoriesView {
    public final Context u0;
    public final ProfileActivity v0;

    public bp8(ProfileActivity profileActivity, Context context, int i, long j, boolean z, ne6 ne6Var, yo8 yo8Var, ylb ylbVar, Context context2) {
        super(context, i, j, z, ne6Var, yo8Var, ylbVar);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override
    public final void e(lj4 lj4Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a = profileActivity.a();
        h4b N1 = profileActivity.getMessagesController().N1();
        boolean J = N1.J(a);
        Context context = this.u0;
        if (!J && !N1.L(a) && !N1.P(a)) {
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
                profileActivity.getOrCreateStoryViewer().I(context, profileActivity.w2.stories, lj4Var);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().I(context, profileActivity.v2.stories, lj4Var);
                return;
            } else {
                profileActivity.U1();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().H(context, a, lj4Var);
    }
}
