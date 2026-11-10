package di;

import org.telegram.tgnet.tl.TL_stories;
public final class c5 {
    public final int f8874a;
    public final TL_stories.StoryView f8875b;
    public final TL_stories.StoryReaction f8876c;

    public c5(int i7) {
        this.f8874a = i7;
        this.f8875b = null;
        this.f8876c = null;
    }

    public c5(TL_stories.StoryView storyView) {
        this.f8874a = 1;
        this.f8875b = storyView;
        this.f8876c = null;
    }

    public c5(TL_stories.StoryReaction storyReaction) {
        this.f8874a = 1;
        this.f8875b = null;
        this.f8876c = storyReaction;
    }
}
