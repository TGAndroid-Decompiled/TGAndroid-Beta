package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class bc {
    public static long f2881g;
    public final x8 f2882a;
    public final int f2883b;
    public final long f2884c;
    public int d;
    public boolean e;
    public final la f2885f = new la(this, 5);

    public bc(int i10, long j10, x8 x8Var) {
        this.f2883b = i10;
        this.f2882a = x8Var;
        this.f2884c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f2882a.y(this.f2884c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.play_billing.k3.f(y3.stories.get(i10).f19451id, i10, 1, arrayList);
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
        AndroidUtilities.cancelRunOnUIThread(this.f2885f);
        ConnectionsManager.getInstance(this.f2883b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f2881g);
        if (currentTimeMillis > 0) {
            la laVar = this.f2885f;
            AndroidUtilities.cancelRunOnUIThread(laVar);
            AndroidUtilities.runOnUIThread(laVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f19459id);
            if (!tL_stories_getStoriesViews.f19459id.isEmpty()) {
                int i10 = this.f2883b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f2884c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new m1(4, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f2884c;
            x8 x8Var = this.f2882a;
            TL_stories.PeerStories y3 = x8Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f19451id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                k9 k9Var = x8Var.f3969k;
                k9Var.f3252b.getStorageQueue().postRunnable(new i9(k9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
