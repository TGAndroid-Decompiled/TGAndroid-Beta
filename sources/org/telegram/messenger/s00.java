package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class s00 implements pc, oc {
    public final f10 f25399a;
    public final TL_stories.StoryItem f25400b;
    public final d10 f25401c;

    public s00(f10 f10Var, TL_stories.StoryItem storyItem, d10 d10Var) {
        this.f25399a = f10Var;
        this.f25400b = storyItem;
        this.f25401c = d10Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new em(this.f25399a, this.f25400b, str, this.f25401c, 28));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new uz(this.f25399a, this.f25400b, this.f25401c, 1));
    }
}
