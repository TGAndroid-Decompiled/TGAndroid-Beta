package ai;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class pc extends ImageReceiver.Decorator {
    public final ArrayList f1599a;
    public float f1600b;
    public float f1601c;
    public float d;
    public float f1602e;

    public pc(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f1599a == null) {
                    this.f1599a = new ArrayList();
                }
                this.f1599a.add(new mc(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f1599a == null) {
                    this.f1599a = new ArrayList();
                }
                this.f1599a.add(new oc(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f1599a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((lc) arrayList.get(i10)).c(imageReceiver.getParentView());
                ((lc) arrayList.get(i10)).b(true);
            }
        }
    }

    @Override
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.f1599a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((lc) arrayList.get(i10)).b(false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f1599a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f7 = (16.0f * imageWidth) / 9.0f;
        this.f1602e = f7;
        this.f1600b = centerX - (imageWidth / 2.0f);
        this.f1601c = centerY - (f7 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((lc) arrayList.get(i10)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
