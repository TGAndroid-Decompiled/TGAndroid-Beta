package org.telegram.messenger.pip.utils;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline26;

public class PipSourceParams {
    private final Rect position = new Rect();
    private final Point ratio = new Point();

    public boolean setRatio(int i, int i2) {
        Point point = this.ratio;
        if (point.x == i && point.y == i2) {
            return false;
        }
        point.set(i, i2);
        return true;
    }

    public boolean setPosition(Rect rect) {
        if (this.position.equals(rect)) {
            return false;
        }
        this.position.set(rect);
        return true;
    }

    public boolean isValid() {
        if (this.position.isEmpty()) {
            return false;
        }
        Point point = this.ratio;
        return point.x > 0 && point.y > 0;
    }

    public void getPosition(Rect rect) {
        rect.set(this.position);
    }

    public int getWidth() {
        return this.position.width();
    }

    public int getHeight() {
        return this.position.height();
    }

    public PictureInPictureParams.Builder build() {
        int i;
        Rational rational;
        PictureInPictureParams.Builder builderM = AndroidUtilities$$ExternalSyntheticApiModelOutline26.m();
        Point point = this.ratio;
        int i2 = point.x;
        if (i2 > 0 && (i = point.y) > 0) {
            double d = i2 / i;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else if (d > 2.35d) {
                rational = new Rational(235, 100);
            } else {
                Point point2 = this.ratio;
                rational = new Rational(point2.x, point2.y);
            }
            builderM.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builderM.setExpandedAspectRatio(rational);
            }
        } else {
            builderM.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builderM.setExpandedAspectRatio(null);
            }
        }
        if (!this.position.isEmpty()) {
            builderM.setSourceRectHint(this.position);
            return builderM;
        }
        builderM.setSourceRectHint(null);
        return builderM;
    }
}
