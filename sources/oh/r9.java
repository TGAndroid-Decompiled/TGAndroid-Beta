package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.yh;
public class r9 {
    public static long f17702g;
    public final t6 f17703a;
    public final int f17704b;
    public final long f17705c;
    public int d;
    public boolean f17706e;
    public final t3 f17707f = new t3(this, 16);

    public r9(int i10, long j10, t6 t6Var) {
        this.f17704b = i10;
        this.f17703a = t6Var;
        this.f17705c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f17703a.y(this.f17705c);
        if (y10 != null && y10.stories != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                i10 = yh.d(y10.stories.get(i10).f21080id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z4) {
        if (this.f17706e == z4) {
            return;
        }
        if (z4) {
            this.f17706e = true;
            c();
            return;
        }
        this.f17706e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f17707f);
        ConnectionsManager.getInstance(this.f17704b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f17706e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f17702g);
        if (currentTimeMillis > 0) {
            t3 t3Var = this.f17707f;
            AndroidUtilities.cancelRunOnUIThread(t3Var);
            AndroidUtilities.runOnUIThread(t3Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f21088id);
            if (!tL_stories_getStoriesViews.f21088id.isEmpty()) {
                int i10 = this.f17704b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f17705c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new eg.b3(15, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f17706e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f17705c;
            t6 t6Var = this.f17703a;
            TL_stories.PeerStories y10 = t6Var.y(j10);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                        if (y10.stories.get(i11).f21080id == ((Integer) arrayList.get(i10)).intValue()) {
                            y10.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                g7 g7Var = t6Var.f17778k;
                g7Var.f17164b.getStorageQueue().postRunnable(new d7(g7Var, y10, 1));
                return true;
            }
        }
        return false;
    }
}
