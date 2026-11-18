package fi;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.tgnet.tl.TL_stories;
public final class k9 extends ic {
    public final ArrayList f12198a;
    public float f12199b;
    public float f12200c;
    public float d;
    public float f12201e;

    public k9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f12198a == null) {
                    this.f12198a = new ArrayList();
                }
                this.f12198a.add(new h9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f12198a == null) {
                    this.f12198a = new ArrayList();
                }
                this.f12198a.add(new j9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f12198a;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((g9) arrayList.get(i7)).c(imageReceiver.f22630e);
                ((g9) arrayList.get(i7)).b(true);
            }
        }
    }
}
