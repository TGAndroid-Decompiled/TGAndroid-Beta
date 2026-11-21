package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class s4 {
    public final int f12558a;
    public final TL_stories.StoryView f12559b;
    public final TL_stories.StoryReaction f12560c;

    public s4(int i7) {
        this.f12558a = i7;
        this.f12559b = null;
        this.f12560c = null;
    }

    public s4(TL_stories.StoryView storyView) {
        this.f12558a = 1;
        this.f12559b = storyView;
        this.f12560c = null;
    }

    public s4(TL_stories.StoryReaction storyReaction) {
        this.f12558a = 1;
        this.f12559b = null;
        this.f12560c = storyReaction;
    }
}
