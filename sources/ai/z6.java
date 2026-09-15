package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1780a;
    public final TL_stories.StoryView f1781b;
    public final TL_stories.StoryReaction f1782c;

    public z6(int i10) {
        this.f1780a = i10;
        this.f1781b = null;
        this.f1782c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1780a = 1;
        this.f1781b = storyView;
        this.f1782c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1780a = 1;
        this.f1781b = null;
        this.f1782c = storyReaction;
    }
}
