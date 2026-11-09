package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class z9 {
    public static long f10020g;
    public final z6 f10021a;
    public final int f10022b;
    public final long f10023c;
    public int d;
    public boolean f10024e;
    public final f8 f10025f = new f8(this, 6);

    public z9(int i7, long j3, z6 z6Var) {
        this.f10022b = i7;
        this.f10021a = z6Var;
        this.f10023c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f10021a.y(this.f10023c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(y10.stories.get(i7).f27195id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z9) {
        if (this.f10024e == z9) {
            return;
        }
        if (z9) {
            this.f10024e = true;
            c();
            return;
        }
        this.f10024e = false;
        org.telegram.messenger.g0.r(this.f10025f);
        ConnectionsManager.getInstance(this.f10022b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f10024e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f10020g);
        if (currentTimeMillis > 0) {
            f8 f8Var = this.f10025f;
            org.telegram.messenger.g0.r(f8Var);
            org.telegram.messenger.g0.i3(f8Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f27203id);
            if (!tL_stories_getStoriesViews.f27203id.isEmpty()) {
                int i7 = this.f10022b;
                tL_stories_getStoriesViews.peer = qp.s1(i7).j1(this.f10023c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.j(11, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f10024e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f10023c;
            z6 z6Var = this.f10021a;
            TL_stories.PeerStories y10 = z6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f27195id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                m7 m7Var = z6Var.f10000k;
                m7Var.f9363b.f26719a.c(new k7(m7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
