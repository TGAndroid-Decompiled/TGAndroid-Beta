package nh;

import org.telegram.tgnet.tl.TL_stories;
public final class u4 {
    public final int f15959a;
    public final TL_stories.StoryView f15960b;
    public final TL_stories.StoryReaction f15961c;

    public u4(int i10) {
        this.f15959a = i10;
        this.f15960b = null;
        this.f15961c = null;
    }

    public u4(TL_stories.StoryView storyView) {
        this.f15959a = 1;
        this.f15960b = storyView;
        this.f15961c = null;
    }

    public u4(TL_stories.StoryReaction storyReaction) {
        this.f15959a = 1;
        this.f15960b = null;
        this.f15961c = storyReaction;
    }
}
