package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class s00 implements pc, oc {
    public final f10 f25395a;
    public final TL_stories.StoryItem f25396b;
    public final d10 f25397c;

    public s00(f10 f10Var, TL_stories.StoryItem storyItem, d10 d10Var) {
        this.f25395a = f10Var;
        this.f25396b = storyItem;
        this.f25397c = d10Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new em(this.f25395a, this.f25396b, str, this.f25397c, 28));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new uz(this.f25395a, this.f25396b, this.f25397c, 1));
    }
}
