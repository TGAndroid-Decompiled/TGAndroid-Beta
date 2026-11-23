package fi;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.tgnet.tl.TL_stories;
public final class k9 extends ic {
    public final ArrayList f12205a;
    public float f12206b;
    public float f12207c;
    public float d;
    public float f12208e;

    public k9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f12205a == null) {
                    this.f12205a = new ArrayList();
                }
                this.f12205a.add(new h9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f12205a == null) {
                    this.f12205a = new ArrayList();
                }
                this.f12205a.add(new j9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f12205a;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((g9) arrayList.get(i7)).c(imageReceiver.f22728e);
                ((g9) arrayList.get(i7)).b(true);
            }
        }
    }
}
