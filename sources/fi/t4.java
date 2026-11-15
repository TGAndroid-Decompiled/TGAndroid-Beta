package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class t4 {
    public final int f12361a;
    public final TL_stories.StoryView f12362b;
    public final TL_stories.StoryReaction f12363c;

    public t4(int i7) {
        this.f12361a = i7;
        this.f12362b = null;
        this.f12363c = null;
    }

    public t4(TL_stories.StoryView storyView) {
        this.f12361a = 1;
        this.f12362b = storyView;
        this.f12363c = null;
    }

    public t4(TL_stories.StoryReaction storyReaction) {
        this.f12361a = 1;
        this.f12362b = null;
        this.f12363c = storyReaction;
    }
}
