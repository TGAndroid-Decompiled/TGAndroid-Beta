package di;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.tgnet.tl.TL_stories;
public final class u9 extends kc {
    public final ArrayList f9853a;
    public float f9854b;
    public float f9855c;
    public float d;
    public float f9856e;

    public u9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f9853a == null) {
                    this.f9853a = new ArrayList();
                }
                this.f9853a.add(new r9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f9853a == null) {
                    this.f9853a = new ArrayList();
                }
                this.f9853a.add(new t9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f9853a;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((q9) arrayList.get(i7)).c(imageReceiver.f21188e);
                ((q9) arrayList.get(i7)).b(true);
            }
        }
    }
}
