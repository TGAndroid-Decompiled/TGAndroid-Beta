package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class p00 implements oc, nc {
    public final c10 f25874a;
    public final TL_stories.StoryItem f25875b;
    public final a10 f25876c;

    public p00(c10 c10Var, TL_stories.StoryItem storyItem, a10 a10Var) {
        this.f25874a = c10Var;
        this.f25875b = storyItem;
        this.f25876c = a10Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new bm(this.f25874a, this.f25875b, str, this.f25876c, 28));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new sz(this.f25874a, this.f25875b, this.f25876c, 1));
    }
}
