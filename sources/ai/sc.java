package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class sc {
    public static long f1669g;
    public final l9 f1670a;
    public final int f1671b;
    public final long f1672c;
    public int d;
    public boolean f1673e;
    public final a3.d f1674f = new a3.d(this, 24);

    public sc(int i10, long j3, l9 l9Var) {
        this.f1671b = i10;
        this.f1670a = l9Var;
        this.f1672c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f1670a.y(this.f1672c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(y3.stories.get(i10).f20274id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f1673e == z10) {
            return;
        }
        if (z10) {
            this.f1673e = true;
            c();
            return;
        }
        this.f1673e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f1674f);
        ConnectionsManager.getInstance(this.f1671b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f1673e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f1669g);
        if (currentTimeMillis > 0) {
            a3.d dVar = this.f1674f;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f20282id);
            if (!tL_stories_getStoriesViews.f20282id.isEmpty()) {
                int i10 = this.f1671b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f1672c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new v1(4, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f1673e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f1672c;
            l9 l9Var = this.f1670a;
            TL_stories.PeerStories y3 = l9Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20274id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                y9 y9Var = l9Var.f1298k;
                y9Var.f1916b.getStorageQueue().postRunnable(new w9(y9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
