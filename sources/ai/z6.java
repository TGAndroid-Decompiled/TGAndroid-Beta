package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1785a;
    public final TL_stories.StoryView f1786b;
    public final TL_stories.StoryReaction f1787c;

    public z6(int i10) {
        this.f1785a = i10;
        this.f1786b = null;
        this.f1787c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1785a = 1;
        this.f1786b = storyView;
        this.f1787c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1785a = 1;
        this.f1786b = null;
        this.f1787c = storyReaction;
    }
}
