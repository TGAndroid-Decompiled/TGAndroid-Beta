package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.th;
public class r9 {
    public static long f16188g;
    public final s6 f16189a;
    public final int f16190b;
    public final long f16191c;
    public int d;
    public boolean f16192e;
    public final m5 f16193f = new m5(this, 13);

    public r9(int i10, long j10, s6 s6Var) {
        this.f16190b = i10;
        this.f16189a = s6Var;
        this.f16191c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y8 = this.f16189a.y(this.f16191c);
        if (y8 != null && y8.stories != null) {
            int i10 = 0;
            while (i10 < y8.stories.size()) {
                i10 = th.d(y8.stories.get(i10).f22629id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f16192e == z10) {
            return;
        }
        if (z10) {
            this.f16192e = true;
            c();
            return;
        }
        this.f16192e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f16193f);
        ConnectionsManager.getInstance(this.f16190b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f16192e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f16188g);
        if (currentTimeMillis > 0) {
            m5 m5Var = this.f16193f;
            AndroidUtilities.cancelRunOnUIThread(m5Var);
            AndroidUtilities.runOnUIThread(m5Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f22637id);
            if (!tL_stories_getStoriesViews.f22637id.isEmpty()) {
                int i10 = this.f16190b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f16191c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new bg.h3(15, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f16192e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f16191c;
            s6 s6Var = this.f16189a;
            TL_stories.PeerStories y8 = s6Var.y(j10);
            if (y8 != null && !y8.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y8.stories.size(); i11++) {
                        if (y8.stories.get(i11).f22629id == ((Integer) arrayList.get(i10)).intValue()) {
                            y8.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                f7 f7Var = s6Var.f16226k;
                f7Var.f15600b.getStorageQueue().postRunnable(new c7(f7Var, y8, 1));
                return true;
            }
        }
        return false;
    }
}
