package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class n00 implements oc, nc {
    public final a10 f25712a;
    public final TL_stories.StoryItem f25713b;
    public final y00 f25714c;

    public n00(a10 a10Var, TL_stories.StoryItem storyItem, y00 y00Var) {
        this.f25712a = a10Var;
        this.f25713b = storyItem;
        this.f25714c = y00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new ul(this.f25712a, this.f25713b, str, this.f25714c, 28));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new pz(this.f25712a, this.f25713b, this.f25714c, 1));
    }
}
