package ef;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class h {
    public final Picture f5211a;
    public final RenderNode f5212b;

    public h(int i10, int i11, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.f5211a = picture;
        callback.run(picture.beginRecording(i10, i11));
        picture.endRecording();
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
            this.f5212b = renderNode;
            renderNode.setPosition(0, 0, i10, i11);
            renderNode.beginRecording().drawPicture(picture);
            renderNode.endRecording();
            return;
        }
        this.f5212b = null;
    }

    public final void a(Canvas canvas, float f10) {
        boolean z4;
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.f5212b;
            if (renderNode != null) {
                renderNode.setAlpha(f10);
                canvas.drawRenderNode(this.f5212b);
                return;
            }
            return;
        }
        Picture picture = this.f5211a;
        if (picture != null && f10 > 0.001f) {
            if (f10 < 0.999f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawPicture(picture);
            if (z4) {
                canvas2.restore();
            }
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5212b.discardDisplayList();
        }
    }
}
