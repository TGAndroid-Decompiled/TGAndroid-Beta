package di;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class ha {
    public static long f8656g;
    public final h7 f8657a;
    public final int f8658b;
    public final long f8659c;
    public int d;
    public boolean e;
    public final s8 f8660f = new s8(this, 5);

    public ha(int i10, long j10, h7 h7Var) {
        this.f8658b = i10;
        this.f8657a = h7Var;
        this.f8659c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f8657a.y(this.f8659c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = c3.h0.i(y3.stories.get(i10).f22267id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.e == z10) {
            return;
        }
        if (z10) {
            this.e = true;
            c();
            return;
        }
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f8660f);
        ConnectionsManager.getInstance(this.f8658b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f8656g);
        if (currentTimeMillis > 0) {
            s8 s8Var = this.f8660f;
            AndroidUtilities.cancelRunOnUIThread(s8Var);
            AndroidUtilities.runOnUIThread(s8Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f22275id);
            if (!tL_stories_getStoriesViews.f22275id.isEmpty()) {
                int i10 = this.f8658b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f8659c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new bi.j(12, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f8659c;
            h7 h7Var = this.f8657a;
            TL_stories.PeerStories y3 = h7Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f22267id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                u7 u7Var = h7Var.f8636k;
                u7Var.f9234b.getStorageQueue().postRunnable(new s7(u7Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
