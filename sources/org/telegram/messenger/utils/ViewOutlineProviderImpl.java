package org.telegram.messenger.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.ui.iv.RichEditor;

public abstract class ViewOutlineProviderImpl {
    public static final RichEditor.AnonymousClass5 BOUNDS_OVAL = new RichEditor.AnonymousClass5(1);
    public static final RichEditor.AnonymousClass5 BOUNDS_ROUND_RECT = new RichEditor.AnonymousClass5(2);

    public final class AnonymousClass5 extends ViewOutlineProvider {
        public final int val$padding;
        public final float val$radius;

        public AnonymousClass5(int i, float f) {
            this.val$padding = i;
            this.val$radius = f;
        }

        @Override
        public final void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int i = this.val$padding;
            int height = view.getHeight() - i;
            float f = this.val$radius;
            int i2 = this.val$padding;
            outline.setRoundRect(i2, i2, width - i, height, f);
        }
    }
}
