package ih;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class v9 {
    public static long f12266g;
    public final v6 f12267a;
    public final int f12268b;
    public final long f12269c;
    public int d;
    public boolean f12270e;
    public final g f12271f = new g(this, 22);

    public v9(int i9, long j10, v6 v6Var) {
        this.f12268b = i9;
        this.f12267a = v6Var;
        this.f12269c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f12267a.y(this.f12269c);
        if (y10 != null && y10.stories != null) {
            int i9 = 0;
            while (i9 < y10.stories.size()) {
                i9 = j3.r0.e(y10.stories.get(i9).f22617id, i9, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f12270e == z10) {
            return;
        }
        if (z10) {
            this.f12270e = true;
            c();
            return;
        }
        this.f12270e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f12271f);
        ConnectionsManager.getInstance(this.f12268b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f12270e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f12266g);
        if (currentTimeMillis > 0) {
            g gVar = this.f12271f;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f22625id);
            if (!tL_stories_getStoriesViews.f22625id.isEmpty()) {
                int i9 = this.f12268b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i9).getInputPeer(this.f12269c);
                this.d = ConnectionsManager.getInstance(i9).sendRequest(tL_stories_getStoriesViews, new bg.j0(14, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f12270e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f12269c;
            v6 v6Var = this.f12267a;
            TL_stories.PeerStories y10 = v6Var.y(j10);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i9 = 0; i9 < tL_stories_storyViews.views.size(); i9++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f22617id == ((Integer) arrayList.get(i9)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i9);
                        }
                    }
                }
                i7 i7Var = v6Var.f12244k;
                i7Var.f11620b.getStorageQueue().postRunnable(new f7(i7Var, y10, 1));
                return true;
            }
        }
        return false;
    }
}
