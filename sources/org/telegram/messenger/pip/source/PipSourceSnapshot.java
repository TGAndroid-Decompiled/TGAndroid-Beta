package org.telegram.messenger.pip.source;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;

public final class PipSourceSnapshot {
    public final RenderNode node;
    public final Picture picture;

    public PipSourceSnapshot(int i, int i2, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.picture = picture;
        callback.run(picture.beginRecording(i, i2));
        picture.endRecording();
        if (Build.VERSION.SDK_INT < 29) {
            this.node = null;
            return;
        }
        Theme$$ExternalSyntheticApiModelOutline3.m1067m();
        RenderNode renderNodeM = Theme$$ExternalSyntheticApiModelOutline3.m("pip-node-" + View.generateViewId());
        this.node = renderNodeM;
        renderNodeM.setPosition(0, 0, i, i2);
        renderNodeM.beginRecording().drawPicture(picture);
        renderNodeM.endRecording();
    }

    public final void draw(Canvas canvas, float f) {
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.node;
            if (renderNode != null) {
                renderNode.setAlpha(f);
                canvas.drawRenderNode(this.node);
                return;
            }
            return;
        }
        Picture picture = this.picture;
        if (picture == null || f <= 0.001f) {
            return;
        }
        boolean z = f < 0.999f;
        if (z) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        canvas2.drawPicture(picture);
        if (z) {
            canvas2.restore();
        }
    }
}
