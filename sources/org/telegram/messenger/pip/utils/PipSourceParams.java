package org.telegram.messenger.pip.utils;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;

public class PipSourceParams {
    private final Rect position = new Rect();
    private final Point ratio = new Point();

    public PictureInPictureParams.Builder build() {
        int i;
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.ratio;
        int i2 = point.x;
        if (i2 <= 0 || (i = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i2 / i;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else if (d > 2.35d) {
                rational = new Rational(235, 100);
            } else {
                Point point2 = this.ratio;
                rational = new Rational(point2.x, point2.y);
            }
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        }
        if (this.position.isEmpty()) {
            builder.setSourceRectHint(null);
        } else {
            builder.setSourceRectHint(this.position);
        }
        return builder;
    }

    public int getHeight() {
        return this.position.height();
    }

    public void getPosition(Rect rect) {
        rect.set(this.position);
    }

    public int getWidth() {
        return this.position.width();
    }

    public boolean isValid() {
        if (!this.position.isEmpty()) {
            Point point = this.ratio;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setPosition(Rect rect) {
        if (this.position.equals(rect)) {
            return false;
        }
        this.position.set(rect);
        return true;
    }

    public boolean setRatio(int i, int i2) {
        Point point = this.ratio;
        if (point.x == i && point.y == i2) {
            return false;
        }
        point.set(i, i2);
        return true;
    }
}
