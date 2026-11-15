package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class r9 {
    public static long f12290g;
    public final s6 f12291a;
    public final int f12292b;
    public final long f12293c;
    public int d;
    public boolean f12294e;
    public final c1 f12295f = new c1(this, 20);

    public r9(int i7, long j3, s6 s6Var) {
        this.f12292b = i7;
        this.f12291a = s6Var;
        this.f12293c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.f12291a.y(this.f12293c);
        if (y10 != null && y10.stories != null) {
            int i7 = 0;
            while (i7 < y10.stories.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(y10.stories.get(i7).f28290id, i7, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f12294e == z10) {
            return;
        }
        if (z10) {
            this.f12294e = true;
            c();
            return;
        }
        this.f12294e = false;
        org.telegram.messenger.g0.r(this.f12295f);
        ConnectionsManager.getInstance(this.f12292b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f12294e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f12290g);
        if (currentTimeMillis > 0) {
            c1 c1Var = this.f12295f;
            org.telegram.messenger.g0.r(c1Var);
            org.telegram.messenger.g0.i3(c1Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f28298id);
            if (!tL_stories_getStoriesViews.f28298id.isEmpty()) {
                int i7 = this.f12292b;
                tL_stories_getStoriesViews.peer = np.s1(i7).j1(this.f12293c);
                this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.v2(13, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f12294e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f12293c;
            s6 s6Var = this.f12291a;
            TL_stories.PeerStories y10 = s6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f28290id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                f7 f7Var = s6Var.f12327k;
                f7Var.f11709b.f27220a.c(new d7(f7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
