package org.telegram.messenger.pip.source;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;

public class PipSourceSnapshot {
    private final RenderNode node;
    private final Picture picture;

    public PipSourceSnapshot(int i, int i2, Utilities.Callback callback) {
        RecordingCanvas beginRecording;
        Picture picture = new Picture();
        this.picture = picture;
        callback.run(picture.beginRecording(i, i2));
        picture.endRecording();
        if (Build.VERSION.SDK_INT < 29) {
            this.node = null;
            return;
        }
        RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
        this.node = renderNode;
        renderNode.setPosition(0, 0, i, i2);
        beginRecording = renderNode.beginRecording();
        beginRecording.drawPicture(picture);
        renderNode.endRecording();
    }

    public void draw(Canvas canvas, float f) {
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.node;
            if (renderNode != null) {
                renderNode.setAlpha(f);
                canvas.drawRenderNode(this.node);
                return;
            }
            return;
        }
        if (this.picture == null || f <= 0.001f) {
            return;
        }
        boolean z = f < 0.999f;
        if (z) {
            canvas.saveLayerAlpha(0.0f, 0.0f, r0.getWidth(), this.picture.getHeight(), (int) (f * 255.0f), 31);
        }
        canvas.drawPicture(this.picture);
        if (z) {
            canvas.restore();
        }
    }

    public void release() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.node.discardDisplayList();
        }
    }
}
