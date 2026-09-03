package oh;

import org.telegram.tgnet.tl.TL_stories;
public final class v4 {
    public final int f17849a;
    public final TL_stories.StoryView f17850b;
    public final TL_stories.StoryReaction f17851c;

    public v4(int i10) {
        this.f17849a = i10;
        this.f17850b = null;
        this.f17851c = null;
    }

    public v4(TL_stories.StoryView storyView) {
        this.f17849a = 1;
        this.f17850b = storyView;
        this.f17851c = null;
    }

    public v4(TL_stories.StoryReaction storyReaction) {
        this.f17849a = 1;
        this.f17850b = null;
        this.f17851c = storyReaction;
    }
}
