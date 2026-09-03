package nh;

import org.telegram.tgnet.tl.TL_stories;
public final class u4 {
    public final int f15939a;
    public final TL_stories.StoryView f15940b;
    public final TL_stories.StoryReaction f15941c;

    public u4(int i10) {
        this.f15939a = i10;
        this.f15940b = null;
        this.f15941c = null;
    }

    public u4(TL_stories.StoryView storyView) {
        this.f15939a = 1;
        this.f15940b = storyView;
        this.f15941c = null;
    }

    public u4(TL_stories.StoryReaction storyReaction) {
        this.f15939a = 1;
        this.f15940b = null;
        this.f15941c = storyReaction;
    }
}
