package ei;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class aa {
    public static long f10100g;
    public final z6 f10101a;
    public final int f10102b;
    public final long f10103c;
    public int d;
    public boolean f10104e;
    public final z5 f10105f = new z5(this, 12);

    public aa(int i3, long j10, z6 z6Var) {
        this.f10102b = i3;
        this.f10101a = z6Var;
        this.f10103c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y9 = this.f10101a.y(this.f10103c);
        if (y9 != null && y9.stories != null) {
            int i3 = 0;
            while (i3 < y9.stories.size()) {
                i3 = com.google.android.recaptcha.internal.a.f(y9.stories.get(i3).f27240id, i3, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.f10104e == z10) {
            return;
        }
        if (z10) {
            this.f10104e = true;
            c();
            return;
        }
        this.f10104e = false;
        org.telegram.messenger.g0.r(this.f10105f);
        ConnectionsManager.getInstance(this.f10102b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.f10104e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f10100g);
        if (currentTimeMillis > 0) {
            z5 z5Var = this.f10105f;
            org.telegram.messenger.g0.r(z5Var);
            org.telegram.messenger.g0.i3(z5Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f27248id);
            if (!tL_stories_getStoriesViews.f27248id.isEmpty()) {
                int i3 = this.f10102b;
                tL_stories_getStoriesViews.peer = hp.s1(i3).j1(this.f10103c);
                this.d = ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesViews, new ai.f3(14, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.f10104e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f10103c;
            z6 z6Var = this.f10101a;
            TL_stories.PeerStories y9 = z6Var.y(j10);
            if (y9 != null && !y9.stories.isEmpty()) {
                for (int i3 = 0; i3 < tL_stories_storyViews.views.size(); i3++) {
                    for (int i10 = 0; i10 < y9.stories.size(); i10++) {
                        if (y9.stories.get(i10).f27240id == ((Integer) arrayList.get(i3)).intValue()) {
                            y9.stories.get(i10).views = tL_stories_storyViews.views.get(i3);
                        }
                    }
                }
                m7 m7Var = z6Var.f11282k;
                m7Var.f10644b.f24934a.c(new k7(m7Var, y9, 0));
                return true;
            }
        }
        return false;
    }
}
