package jh;

import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

public class r9 {

    public static long f13923g;

    public final s6 f13924a;

    public final int f13925b;

    public final long f13926c;
    public int d;

    public boolean f13927e;

    public final y9 f13928f = new y9(this, 29);

    public r9(int i10, long j10, s6 s6Var) {
        this.f13925b = i10;
        this.f13924a = s6Var;
        this.f13926c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories peerStoriesY = this.f13924a.y(this.f13926c);
        if (peerStoriesY == null || peerStoriesY.stories == null) {
            return;
        }
        int iF = 0;
        while (iF < peerStoriesY.stories.size()) {
            iF = i0.a.f(peerStoriesY.stories.get(iF).f22617id, iF, 1, arrayList);
        }
    }

    public final void b(boolean z10) {
        if (this.f13927e == z10) {
            return;
        }
        if (z10) {
            this.f13927e = true;
            c();
        } else {
            this.f13927e = false;
            AndroidUtilities.cancelRunOnUIThread(this.f13928f);
            ConnectionsManager.getInstance(this.f13925b).cancelRequest(this.d, false);
            this.d = 0;
        }
    }

    public final void c() {
        if (this.f13927e) {
            long jCurrentTimeMillis = 10000 - (System.currentTimeMillis() - f13923g);
            if (jCurrentTimeMillis > 0) {
                y9 y9Var = this.f13928f;
                AndroidUtilities.cancelRunOnUIThread(y9Var);
                AndroidUtilities.runOnUIThread(y9Var, jCurrentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.f22625id);
                if (!tL_stories_getStoriesViews.f22625id.isEmpty()) {
                    int i10 = this.f13925b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f13926c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new cg.g0(14, this, tL_stories_getStoriesViews));
                    return;
                }
            }
            this.d = 0;
            this.f13927e = false;
        }
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f13926c;
            s6 s6Var = this.f13924a;
            TL_stories.PeerStories peerStoriesY = s6Var.y(j10);
            if (peerStoriesY != null && !peerStoriesY.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < peerStoriesY.stories.size(); i11++) {
                        if (peerStoriesY.stories.get(i11).f22617id == ((Integer) arrayList.get(i10)).intValue()) {
                            peerStoriesY.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                f7 f7Var = s6Var.f13963k;
                f7Var.f13332b.getStorageQueue().postRunnable(new c7(f7Var, peerStoriesY, 1));
                return true;
            }
        }
        return false;
    }
}
