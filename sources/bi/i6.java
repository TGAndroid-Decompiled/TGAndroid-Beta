package bi;

import org.telegram.tgnet.tl.TL_stories;
public final class i6 {
    public final int f3123a;
    public final TL_stories.StoryView f3124b;
    public final TL_stories.StoryReaction f3125c;

    public i6(int i10) {
        this.f3123a = i10;
        this.f3124b = null;
        this.f3125c = null;
    }

    public i6(TL_stories.StoryView storyView) {
        this.f3123a = 1;
        this.f3124b = storyView;
        this.f3125c = null;
    }

    public i6(TL_stories.StoryReaction storyReaction) {
        this.f3123a = 1;
        this.f3124b = null;
        this.f3125c = storyReaction;
    }
}
