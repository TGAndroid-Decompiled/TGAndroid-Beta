package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class n00 implements oc, nc {
    public final a10 f25676a;
    public final TL_stories.StoryItem f25677b;
    public final y00 f25678c;

    public n00(a10 a10Var, TL_stories.StoryItem storyItem, y00 y00Var) {
        this.f25676a = a10Var;
        this.f25677b = storyItem;
        this.f25678c = y00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new ul(this.f25676a, this.f25677b, str, this.f25678c, 28));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new pz(this.f25676a, this.f25677b, this.f25678c, 1));
    }
}
