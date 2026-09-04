package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class yb {
    public static long f4026g;
    public final u8 f4027a;
    public final int f4028b;
    public final long f4029c;
    public int d;
    public boolean f4030e;
    public final oa f4031f = new oa(this, 4);

    public yb(int i10, long j3, u8 u8Var) {
        this.f4028b = i10;
        this.f4027a = u8Var;
        this.f4029c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f4027a.y(this.f4029c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(y3.stories.get(i10).f20107id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f4030e == z10) {
            return;
        }
        if (z10) {
            this.f4030e = true;
            c();
            return;
        }
        this.f4030e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f4031f);
        ConnectionsManager.getInstance(this.f4028b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f4030e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f4026g);
        if (currentTimeMillis > 0) {
            oa oaVar = this.f4031f;
            AndroidUtilities.cancelRunOnUIThread(oaVar);
            AndroidUtilities.runOnUIThread(oaVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f20115id);
            if (!tL_stories_getStoriesViews.f20115id.isEmpty()) {
                int i10 = this.f4028b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f4029c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new m1(4, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f4030e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f4029c;
            u8 u8Var = this.f4027a;
            TL_stories.PeerStories y3 = u8Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20107id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                h9 h9Var = u8Var.f3813k;
                h9Var.f3074b.getStorageQueue().postRunnable(new e9(h9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
