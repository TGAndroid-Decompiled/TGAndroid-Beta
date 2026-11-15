package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class p00 implements oc, nc {
    public final c10 f25872a;
    public final TL_stories.StoryItem f25873b;
    public final a10 f25874c;

    public p00(c10 c10Var, TL_stories.StoryItem storyItem, a10 a10Var) {
        this.f25872a = c10Var;
        this.f25873b = storyItem;
        this.f25874c = a10Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new bm(this.f25872a, this.f25873b, str, this.f25874c, 28));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new sz(this.f25872a, this.f25873b, this.f25874c, 1));
    }
}
