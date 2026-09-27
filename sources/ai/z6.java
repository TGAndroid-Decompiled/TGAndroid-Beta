package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1781a;
    public final TL_stories.StoryView f1782b;
    public final TL_stories.StoryReaction f1783c;

    public z6(int i10) {
        this.f1781a = i10;
        this.f1782b = null;
        this.f1783c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1781a = 1;
        this.f1782b = storyView;
        this.f1783c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1781a = 1;
        this.f1782b = null;
        this.f1783c = storyReaction;
    }
}
