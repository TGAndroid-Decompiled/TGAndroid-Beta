package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ai;
public class r9 {
    public static long f15834g;
    public final t6 f15835a;
    public final int f15836b;
    public final long f15837c;
    public int d;
    public boolean e;
    public final n5 f15838f = new n5(this, 13);

    public r9(int i10, long j10, t6 t6Var) {
        this.f15836b = i10;
        this.f15835a = t6Var;
        this.f15837c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f15835a.y(this.f15837c);
        if (y10 != null && y10.stories != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                i10 = ai.d(y10.stories.get(i10).f19394id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z4) {
        if (this.e == z4) {
            return;
        }
        if (z4) {
            this.e = true;
            c();
            return;
        }
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f15838f);
        ConnectionsManager.getInstance(this.f15836b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f15834g);
        if (currentTimeMillis > 0) {
            n5 n5Var = this.f15838f;
            AndroidUtilities.cancelRunOnUIThread(n5Var);
            AndroidUtilities.runOnUIThread(n5Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f19402id);
            if (!tL_stories_getStoriesViews.f19402id.isEmpty()) {
                int i10 = this.f15836b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f15837c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new dg.d3(15, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f15837c;
            t6 t6Var = this.f15835a;
            TL_stories.PeerStories y10 = t6Var.y(j10);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                        if (y10.stories.get(i11).f19394id == ((Integer) arrayList.get(i10)).intValue()) {
                            y10.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                g7 g7Var = t6Var.f15904k;
                g7Var.f15346b.getStorageQueue().postRunnable(new d7(g7Var, y10, 1));
                return true;
            }
        }
        return false;
    }
}
