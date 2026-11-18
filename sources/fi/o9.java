package fi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class o9 {
    public static long f12346g;
    public final p6 f12347a;
    public final int f12348b;
    public final long f12349c;
    public int d;
    public boolean f12350e;
    public final f2.a f12351f = new f2.a(this, 24);

    public o9(int i7, long j3, p6 p6Var) {
        this.f12348b = i7;
        this.f12347a = p6Var;
        this.f12349c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f12347a.y(this.f12349c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(y10.stories.get(i7).f28642id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f12350e == z10) {
            return;
        }
        if (z10) {
            this.f12350e = true;
            c();
            return;
        }
        this.f12350e = false;
        org.telegram.messenger.g0.r(this.f12351f);
        ConnectionsManager.getInstance(this.f12348b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f12350e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f12346g);
        if (currentTimeMillis > 0) {
            f2.a aVar = this.f12351f;
            org.telegram.messenger.g0.r(aVar);
            org.telegram.messenger.g0.h3(aVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f28650id);
            if (!tL_stories_getStoriesViews.f28650id.isEmpty()) {
                int i7 = this.f12348b;
                tL_stories_getStoriesViews.peer = mp.u1(i7).l1(this.f12349c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.k1(14, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f12350e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f12349c;
            p6 p6Var = this.f12347a;
            TL_stories.PeerStories y10 = p6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f28642id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                c7 c7Var = p6Var.f12390k;
                c7Var.f11815b.f27052a.c(new a7(c7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
