package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class z9 {
    public static long f10025g;
    public final z6 f10026a;
    public final int f10027b;
    public final long f10028c;
    public int d;
    public boolean f10029e;
    public final f8 f10030f = new f8(this, 6);

    public z9(int i7, long j3, z6 z6Var) {
        this.f10027b = i7;
        this.f10026a = z6Var;
        this.f10028c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f10026a.y(this.f10028c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(y10.stories.get(i7).f27199id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z9) {
        if (this.f10029e == z9) {
            return;
        }
        if (z9) {
            this.f10029e = true;
            c();
            return;
        }
        this.f10029e = false;
        org.telegram.messenger.g0.r(this.f10030f);
        ConnectionsManager.getInstance(this.f10027b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f10029e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f10025g);
        if (currentTimeMillis > 0) {
            f8 f8Var = this.f10030f;
            org.telegram.messenger.g0.r(f8Var);
            org.telegram.messenger.g0.i3(f8Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f27207id);
            if (!tL_stories_getStoriesViews.f27207id.isEmpty()) {
                int i7 = this.f10027b;
                tL_stories_getStoriesViews.peer = qp.s1(i7).j1(this.f10028c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.j(11, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f10029e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f10028c;
            z6 z6Var = this.f10026a;
            TL_stories.PeerStories y10 = z6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f27199id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                m7 m7Var = z6Var.f10005k;
                m7Var.f9368b.f26723a.c(new k7(m7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
