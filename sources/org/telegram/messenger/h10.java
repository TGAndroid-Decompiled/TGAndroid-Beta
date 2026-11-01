package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class h10 implements rc, qc {
    public final u10 f15997a;
    public final TL_stories.StoryItem f15998b;
    public final s10 f15999c;

    public h10(u10 u10Var, TL_stories.StoryItem storyItem, s10 s10Var) {
        this.f15997a = u10Var;
        this.f15998b = storyItem;
        this.f15999c = s10Var;
    }

    @Override
    public void a(String str) {
        i0.g3(new vl(this.f15997a, this.f15998b, str, this.f15999c, 28));
    }

    @Override
    public void p(Exception exc) {
        i0.g3(new f00(this.f15997a, this.f15998b, this.f15999c, 2));
    }
}
