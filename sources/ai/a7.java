package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class a7 {
    public final int f643a;
    public final TL_stories.StoryView f644b;
    public final TL_stories.StoryReaction f645c;

    public a7(int i10) {
        this.f643a = i10;
        this.f644b = null;
        this.f645c = null;
    }

    public a7(TL_stories.StoryView storyView) {
        this.f643a = 1;
        this.f644b = storyView;
        this.f645c = null;
    }

    public a7(TL_stories.StoryReaction storyReaction) {
        this.f643a = 1;
        this.f644b = null;
        this.f645c = storyReaction;
    }
}
