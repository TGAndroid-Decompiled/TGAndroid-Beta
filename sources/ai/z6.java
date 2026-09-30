package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1786a;
    public final TL_stories.StoryView f1787b;
    public final TL_stories.StoryReaction f1788c;

    public z6(int i10) {
        this.f1786a = i10;
        this.f1787b = null;
        this.f1788c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1786a = 1;
        this.f1787b = storyView;
        this.f1788c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1786a = 1;
        this.f1787b = null;
        this.f1788c = storyReaction;
    }
}
