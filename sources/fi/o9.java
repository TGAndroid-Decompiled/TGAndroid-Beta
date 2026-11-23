package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class o9 {
    public static long f12341g;
    public final p6 f12342a;
    public final int f12343b;
    public final long f12344c;
    public int d;
    public boolean f12345e;
    public final f2.a f12346f = new f2.a(this, 23);

    public o9(int i7, long j3, p6 p6Var) {
        this.f12343b = i7;
        this.f12342a = p6Var;
        this.f12344c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f12342a.y(this.f12344c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(y10.stories.get(i7).f28637id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f12345e == z10) {
            return;
        }
        if (z10) {
            this.f12345e = true;
            c();
            return;
        }
        this.f12345e = false;
        org.telegram.messenger.g0.r(this.f12346f);
        ConnectionsManager.getInstance(this.f12343b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f12345e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f12341g);
        if (currentTimeMillis > 0) {
            f2.a aVar = this.f12346f;
            org.telegram.messenger.g0.r(aVar);
            org.telegram.messenger.g0.h3(aVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f28645id);
            if (!tL_stories_getStoriesViews.f28645id.isEmpty()) {
                int i7 = this.f12343b;
                tL_stories_getStoriesViews.peer = np.u1(i7).l1(this.f12344c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.o1(14, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f12345e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f12344c;
            p6 p6Var = this.f12342a;
            TL_stories.PeerStories y10 = p6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f28637id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                c7 c7Var = p6Var.f12385k;
                c7Var.f11810b.f27214a.c(new a7(c7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
