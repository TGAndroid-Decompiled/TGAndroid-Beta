package di;

import org.telegram.tgnet.tl.TL_stories;
public final class b5 {
    public final int f8843a;
    public final TL_stories.StoryView f8844b;
    public final TL_stories.StoryReaction f8845c;

    public b5(int i7) {
        this.f8843a = i7;
        this.f8844b = null;
        this.f8845c = null;
    }

    public b5(TL_stories.StoryView storyView) {
        this.f8843a = 1;
        this.f8844b = storyView;
        this.f8845c = null;
    }

    public b5(TL_stories.StoryReaction storyReaction) {
        this.f8843a = 1;
        this.f8844b = null;
        this.f8845c = storyReaction;
    }
}
