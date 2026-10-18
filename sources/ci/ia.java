package ci;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class ia {
    public static long f5457g;
    public final h7 f5458a;
    public final int f5459b;
    public final long f5460c;
    public int d;
    public boolean e;
    public final androidx.fragment.app.d f5461f = new androidx.fragment.app.d(this, 28);

    public ia(int i10, long j10, h7 h7Var) {
        this.f5459b = i10;
        this.f5458a = h7Var;
        this.f5460c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f5458a.y(this.f5460c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.play_billing.k3.f(y3.stories.get(i10).f20506id, i10, 1, arrayList);
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
        AndroidUtilities.cancelRunOnUIThread(this.f5461f);
        ConnectionsManager.getInstance(this.f5459b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f5457g);
        if (currentTimeMillis > 0) {
            androidx.fragment.app.d dVar = this.f5461f;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f20514id);
            if (!tL_stories_getStoriesViews.f20514id.isEmpty()) {
                int i10 = this.f5459b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f5460c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new ai.g(11, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f5460c;
            h7 h7Var = this.f5458a;
            TL_stories.PeerStories y3 = h7Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20506id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                v7 v7Var = h7Var.f5404k;
                v7Var.f6024b.getStorageQueue().postRunnable(new s7(v7Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
