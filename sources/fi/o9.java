package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class o9 {
    public static long f12391g;
    public final p6 f12392a;
    public final int f12393b;
    public final long f12394c;
    public int d;
    public boolean f12395e;
    public final f2.a f12396f = new f2.a(this, 24);

    public o9(int i7, long j3, p6 p6Var) {
        this.f12393b = i7;
        this.f12392a = p6Var;
        this.f12394c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f12392a.y(this.f12394c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(y10.stories.get(i7).f28673id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f12395e == z10) {
            return;
        }
        if (z10) {
            this.f12395e = true;
            c();
            return;
        }
        this.f12395e = false;
        org.telegram.messenger.g0.r(this.f12396f);
        ConnectionsManager.getInstance(this.f12393b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f12395e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f12391g);
        if (currentTimeMillis > 0) {
            f2.a aVar = this.f12396f;
            org.telegram.messenger.g0.r(aVar);
            org.telegram.messenger.g0.h3(aVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f28681id);
            if (!tL_stories_getStoriesViews.f28681id.isEmpty()) {
                int i7 = this.f12393b;
                tL_stories_getStoriesViews.peer = np.u1(i7).l1(this.f12394c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.o1(14, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f12395e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f12394c;
            p6 p6Var = this.f12392a;
            TL_stories.PeerStories y10 = p6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f28673id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                c7 c7Var = p6Var.f12433k;
                c7Var.f11858b.f27250a.c(new a7(c7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
