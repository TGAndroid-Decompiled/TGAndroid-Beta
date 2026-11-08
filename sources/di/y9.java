package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class y9 {
    public static long f9993g;
    public final y6 f9994a;
    public final int f9995b;
    public final long f9996c;
    public int d;
    public boolean f9997e;
    public final s7 f9998f = new s7(this, 7);

    public y9(int i7, long j3, y6 y6Var) {
        this.f9995b = i7;
        this.f9994a = y6Var;
        this.f9996c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f9994a.y(this.f9996c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(y10.stories.get(i7).f27195id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z9) {
        if (this.f9997e == z9) {
            return;
        }
        if (z9) {
            this.f9997e = true;
            c();
            return;
        }
        this.f9997e = false;
        org.telegram.messenger.g0.r(this.f9998f);
        ConnectionsManager.getInstance(this.f9995b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f9997e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f9993g);
        if (currentTimeMillis > 0) {
            s7 s7Var = this.f9998f;
            org.telegram.messenger.g0.r(s7Var);
            org.telegram.messenger.g0.i3(s7Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f27203id);
            if (!tL_stories_getStoriesViews.f27203id.isEmpty()) {
                int i7 = this.f9995b;
                tL_stories_getStoriesViews.peer = qp.s1(i7).j1(this.f9996c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.j(11, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f9997e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f9996c;
            y6 y6Var = this.f9994a;
            TL_stories.PeerStories y10 = y6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f27195id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                l7 l7Var = y6Var.f9971k;
                l7Var.f9338b.f26719a.c(new j7(l7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
