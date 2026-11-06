package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class s00 implements pc, oc {
    public final f10 f25403a;
    public final TL_stories.StoryItem f25404b;
    public final d10 f25405c;

    public s00(f10 f10Var, TL_stories.StoryItem storyItem, d10 d10Var) {
        this.f25403a = f10Var;
        this.f25404b = storyItem;
        this.f25405c = d10Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new em(this.f25403a, this.f25404b, str, this.f25405c, 28));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new uz(this.f25403a, this.f25404b, this.f25405c, 1));
    }
}
