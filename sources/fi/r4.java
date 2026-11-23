package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class r4 {
    public final int f12494a;
    public final TL_stories.StoryView f12495b;
    public final TL_stories.StoryReaction f12496c;

    public r4(int i7) {
        this.f12494a = i7;
        this.f12495b = null;
        this.f12496c = null;
    }

    public r4(TL_stories.StoryView storyView) {
        this.f12494a = 1;
        this.f12495b = storyView;
        this.f12496c = null;
    }

    public r4(TL_stories.StoryReaction storyReaction) {
        this.f12494a = 1;
        this.f12495b = null;
        this.f12496c = storyReaction;
    }
}
