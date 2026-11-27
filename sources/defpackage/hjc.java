package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class hjc {
    public static long g;
    public final c6b a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final azb f = new azb(this, (byte) 21);

    public hjc(int i, long j, c6b c6bVar) {
        this.b = i;
        this.a = c6bVar;
        this.c = j;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories x = this.a.x(this.c);
        if (x != null && x.stories != null) {
            int i = 0;
            while (i < x.stories.size()) {
                i = qd4.g(x.stories.get(i).id, i, 1, arrayList);
            }
        }
    }

    public final void b(boolean z) {
        if (this.e == z) {
            return;
        }
        if (z) {
            this.e = true;
            c();
            return;
        }
        this.e = false;
        hl.r(this.f);
        ConnectionsManager.getInstance(this.b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - g);
        if (currentTimeMillis > 0) {
            azb azbVar = this.f;
            hl.r(azbVar);
            hl.d3(azbVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.id);
            if (!tL_stories_getStoriesViews.id.isEmpty()) {
                int i = this.b;
                tL_stories_getStoriesViews.peer = uc7.s1(i).j1(this.c);
                this.d = ConnectionsManager.getInstance(i).sendRequest(tL_stories_getStoriesViews, new isa(this, tL_stories_getStoriesViews, (byte) 22));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j = this.c;
            c6b c6bVar = this.a;
            TL_stories.PeerStories x = c6bVar.x(j);
            if (x != null && !x.stories.isEmpty()) {
                for (int i = 0; i < tL_stories_storyViews.views.size(); i++) {
                    for (int i2 = 0; i2 < x.stories.size(); i2++) {
                        if (x.stories.get(i2).id == ((Integer) arrayList.get(i)).intValue()) {
                            x.stories.get(i2).views = tL_stories_storyViews.views.get(i);
                        }
                    }
                }
                o6b o6bVar = c6bVar.k;
                o6bVar.b.a.c(new n6b(o6bVar, x, (byte) 0));
                return true;
            }
        }
        return false;
    }
}
