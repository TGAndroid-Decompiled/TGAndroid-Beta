package jh;

import org.telegram.tgnet.tl.TL_stories;

public final class t4 {

    public final int f13996a;

    public final TL_stories.StoryView f13997b;

    public final TL_stories.StoryReaction f13998c;

    public t4(int i10) {
        this.f13996a = i10;
        this.f13997b = null;
        this.f13998c = null;
    }

    public t4(TL_stories.StoryView storyView) {
        this.f13996a = 1;
        this.f13997b = storyView;
        this.f13998c = null;
    }

    public t4(TL_stories.StoryReaction storyReaction) {
        this.f13996a = 1;
        this.f13997b = null;
        this.f13998c = storyReaction;
    }
}
