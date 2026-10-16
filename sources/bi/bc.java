package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class bc {
    public static long f2885g;
    public final x8 f2886a;
    public final int f2887b;
    public final long f2888c;
    public int d;
    public boolean e;
    public final la f2889f = new la(this, 5);

    public bc(int i10, long j10, x8 x8Var) {
        this.f2887b = i10;
        this.f2886a = x8Var;
        this.f2888c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f2886a.y(this.f2888c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.play_billing.k3.f(y3.stories.get(i10).f19151id, i10, 1, arrayList);
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
        AndroidUtilities.cancelRunOnUIThread(this.f2889f);
        ConnectionsManager.getInstance(this.f2887b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f2885g);
        if (currentTimeMillis > 0) {
            la laVar = this.f2889f;
            AndroidUtilities.cancelRunOnUIThread(laVar);
            AndroidUtilities.runOnUIThread(laVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f19159id);
            if (!tL_stories_getStoriesViews.f19159id.isEmpty()) {
                int i10 = this.f2887b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f2888c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new m1(4, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f2888c;
            x8 x8Var = this.f2886a;
            TL_stories.PeerStories y3 = x8Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f19151id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                k9 k9Var = x8Var.f3973k;
                k9Var.f3256b.getStorageQueue().postRunnable(new i9(k9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
