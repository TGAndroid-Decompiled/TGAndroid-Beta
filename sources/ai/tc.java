package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class tc {
    public static long f1774g;
    public final m9 f1775a;
    public final int f1776b;
    public final long f1777c;
    public int d;
    public boolean f1778e;
    public final a3.d f1779f = new a3.d(this, 24);

    public tc(int i10, long j3, m9 m9Var) {
        this.f1776b = i10;
        this.f1775a = m9Var;
        this.f1777c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f1775a.y(this.f1777c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(y3.stories.get(i10).f20042id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f1778e == z10) {
            return;
        }
        if (z10) {
            this.f1778e = true;
            c();
            return;
        }
        this.f1778e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f1779f);
        ConnectionsManager.getInstance(this.f1776b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f1778e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f1774g);
        if (currentTimeMillis > 0) {
            a3.d dVar = this.f1779f;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f20050id);
            if (!tL_stories_getStoriesViews.f20050id.isEmpty()) {
                int i10 = this.f1776b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f1777c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new v1(4, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f1778e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f1777c;
            m9 m9Var = this.f1775a;
            TL_stories.PeerStories y3 = m9Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20042id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                z9 z9Var = m9Var.f1412k;
                z9Var.f2020b.getStorageQueue().postRunnable(new x9(z9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
