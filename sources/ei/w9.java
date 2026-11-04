package ei;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dc;
import org.telegram.tgnet.tl.TL_stories;
public final class w9 extends dc {
    public final ArrayList f11193a;
    public float f11194b;
    public float f11195c;
    public float d;
    public float f11196e;

    public w9(TL_stories.StoryItem storyItem) {
        for (int i3 = 0; i3 < storyItem.media_areas.size(); i3++) {
            if (storyItem.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f11193a == null) {
                    this.f11193a = new ArrayList();
                }
                this.f11193a.add(new t9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i3)));
            } else if (storyItem.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f11193a == null) {
                    this.f11193a = new ArrayList();
                }
                this.f11193a.add(new v9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i3)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f11193a;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((s9) arrayList.get(i3)).c(imageReceiver.f21238e);
                ((s9) arrayList.get(i3)).b(true);
            }
        }
    }
}
