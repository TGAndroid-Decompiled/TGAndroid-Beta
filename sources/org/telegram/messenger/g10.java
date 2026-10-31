package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class g10 implements qc, pc {
    public final t10 f15656a;
    public final TL_stories.StoryItem f15657b;
    public final r10 f15658c;

    public g10(t10 t10Var, TL_stories.StoryItem storyItem, r10 r10Var) {
        this.f15656a = t10Var;
        this.f15657b = storyItem;
        this.f15658c = r10Var;
    }

    @Override
    public void a(String str) {
        i0.g3(new ul(this.f15656a, this.f15657b, str, this.f15658c, 28));
    }

    @Override
    public void q(Exception exc) {
        i0.g3(new e00(this.f15656a, this.f15657b, this.f15658c, 2));
    }
}
