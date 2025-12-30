package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

class PipSourcePlaceholder {
    private Bitmap placeholder;
    private Drawable placeholderActivityDrawable;
    private final View placeholderActivityView;
    private Drawable placeholderSourceDrawable;
    private final View placeholderSourceView;

    public PipSourcePlaceholder(View view, View view2) {
        this.placeholderActivityView = view;
        this.placeholderSourceView = view2;
    }

    public void setPlaceholder(Bitmap bitmap) {
        if (this.placeholder == bitmap) {
            return;
        }
        clear();
        this.placeholder = bitmap;
        PlaceholderDrawable placeholderDrawable = new PlaceholderDrawable(this.placeholder);
        this.placeholderActivityDrawable = placeholderDrawable;
        this.placeholderActivityView.setBackground(placeholderDrawable);
        if (this.placeholderSourceView != null) {
            PlaceholderDrawable placeholderDrawable2 = new PlaceholderDrawable(this.placeholder);
            this.placeholderSourceDrawable = placeholderDrawable2;
            this.placeholderSourceView.setBackground(placeholderDrawable2);
        }
    }

    public void stopPlaceholderForActivity() {
        if (this.placeholderActivityDrawable != null) {
            this.placeholderActivityView.setBackground(null);
            this.placeholderActivityDrawable = null;
        }
        maybeClearPlaceholder();
    }

    public void stopPlaceholderForSource() {
        if (this.placeholderSourceDrawable != null) {
            this.placeholderSourceDrawable = null;
            View view = this.placeholderSourceView;
            if (view != null) {
                view.setBackground(null);
            }
        }
        maybeClearPlaceholder();
    }

    public void clear() {
        stopPlaceholderForActivity();
        stopPlaceholderForSource();
    }

    private void maybeClearPlaceholder() {
        Bitmap bitmap;
        if (this.placeholderSourceDrawable == null && this.placeholderActivityDrawable == null && (bitmap = this.placeholder) != null) {
            bitmap.recycle();
            this.placeholder = null;
        }
    }

    private static class PlaceholderDrawable extends Drawable {
        private final Bitmap bitmap;
        private final Rect rect;

        @Override
        public int getOpacity() {
            return -3;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        private PlaceholderDrawable(Bitmap bitmap) {
            this.rect = new Rect();
            this.bitmap = bitmap;
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.bitmap.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.bitmap, (Rect) null, this.rect, (Paint) null);
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            Bitmap bitmap = this.bitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            float width = this.bitmap.getWidth();
            float height = this.bitmap.getHeight();
            float fMin = Math.min(i5 / width, i6 / height);
            int iRound = Math.round(width * fMin);
            int iRound2 = Math.round(height * fMin);
            int i7 = i + ((i5 - iRound) / 2);
            int i8 = i2 + ((i6 - iRound2) / 2);
            this.rect.set(i7, i8, iRound + i7, iRound2 + i8);
        }
    }
}
