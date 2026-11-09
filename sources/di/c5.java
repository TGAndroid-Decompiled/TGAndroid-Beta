package di;

import org.telegram.tgnet.tl.TL_stories;
public final class c5 {
    public final int f8869a;
    public final TL_stories.StoryView f8870b;
    public final TL_stories.StoryReaction f8871c;

    public c5(int i7) {
        this.f8869a = i7;
        this.f8870b = null;
        this.f8871c = null;
    }

    public c5(TL_stories.StoryView storyView) {
        this.f8869a = 1;
        this.f8870b = storyView;
        this.f8871c = null;
    }

    public c5(TL_stories.StoryReaction storyReaction) {
        this.f8869a = 1;
        this.f8870b = null;
        this.f8871c = storyReaction;
    }
}
