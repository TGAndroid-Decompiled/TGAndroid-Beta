package lh;

import org.telegram.tgnet.tl.TL_stories;
public final class t4 {
    public final int f16261a;
    public final TL_stories.StoryView f16262b;
    public final TL_stories.StoryReaction f16263c;

    public t4(int i10) {
        this.f16261a = i10;
        this.f16262b = null;
        this.f16263c = null;
    }

    public t4(TL_stories.StoryView storyView) {
        this.f16261a = 1;
        this.f16262b = storyView;
        this.f16263c = null;
    }

    public t4(TL_stories.StoryReaction storyReaction) {
        this.f16261a = 1;
        this.f16262b = null;
        this.f16263c = storyReaction;
    }
}
