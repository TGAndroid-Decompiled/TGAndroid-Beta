package ff;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
public final class c {
    public final Rect f6233a = new Rect();
    public final Point f6234b = new Point();

    public final PictureInPictureParams.Builder a() {
        int i10;
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.f6234b;
        int i11 = point.x;
        if (i11 > 0 && (i10 = point.y) > 0) {
            double d = i11 / i10;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else if (d > 2.35d) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(point.x, point.y);
            }
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        } else {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        }
        Rect rect = this.f6233a;
        if (!rect.isEmpty()) {
            builder.setSourceRectHint(rect);
            return builder;
        }
        builder.setSourceRectHint(null);
        return builder;
    }

    public final boolean b() {
        if (!this.f6233a.isEmpty()) {
            Point point = this.f6234b;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c(int i10, int i11) {
        Point point = this.f6234b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }
}
