package di;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class da extends ImageReceiver.Decorator {
    public final ArrayList f8504a;
    public float f8505b;
    public float f8506c;
    public float d;
    public float e;

    public da(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f8504a == null) {
                    this.f8504a = new ArrayList();
                }
                this.f8504a.add(new aa(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f8504a == null) {
                    this.f8504a = new ArrayList();
                }
                this.f8504a.add(new ca(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f8504a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((z9) arrayList.get(i10)).c(imageReceiver.getParentView());
                ((z9) arrayList.get(i10)).b(true);
            }
        }
    }

    @Override
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.f8504a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((z9) arrayList.get(i10)).b(false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f8504a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f7 = (16.0f * imageWidth) / 9.0f;
        this.e = f7;
        this.f8505b = centerX - (imageWidth / 2.0f);
        this.f8506c = centerY - (f7 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((z9) arrayList.get(i10)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
