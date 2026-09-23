package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1779a;
    public final TL_stories.StoryView f1780b;
    public final TL_stories.StoryReaction f1781c;

    public z6(int i10) {
        this.f1779a = i10;
        this.f1780b = null;
        this.f1781c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1779a = 1;
        this.f1780b = storyView;
        this.f1781c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1779a = 1;
        this.f1780b = null;
        this.f1781c = storyReaction;
    }
}
