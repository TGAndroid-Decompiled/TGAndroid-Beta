package bi;

import org.telegram.tgnet.tl.TL_stories;
public final class l6 {
    public final int f3275a;
    public final TL_stories.StoryView f3276b;
    public final TL_stories.StoryReaction f3277c;

    public l6(int i10) {
        this.f3275a = i10;
        this.f3276b = null;
        this.f3277c = null;
    }

    public l6(TL_stories.StoryView storyView) {
        this.f3275a = 1;
        this.f3276b = storyView;
        this.f3277c = null;
    }

    public l6(TL_stories.StoryReaction storyReaction) {
        this.f3275a = 1;
        this.f3276b = null;
        this.f3277c = storyReaction;
    }
}
