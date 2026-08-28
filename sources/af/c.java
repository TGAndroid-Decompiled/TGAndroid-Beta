package af;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
public final class c {
    public final Rect f153a = new Rect();
    public final Point f154b = new Point();

    public final PictureInPictureParams.Builder a() {
        int i9;
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.f154b;
        int i10 = point.x;
        if (i10 > 0 && (i9 = point.y) > 0) {
            double d = i10 / i9;
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
        Rect rect = this.f153a;
        if (!rect.isEmpty()) {
            builder.setSourceRectHint(rect);
            return builder;
        }
        builder.setSourceRectHint(null);
        return builder;
    }

    public final boolean b() {
        if (!this.f153a.isEmpty()) {
            Point point = this.f154b;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c(int i9, int i10) {
        Point point = this.f154b;
        if (point.x == i9 && point.y == i10) {
            return false;
        }
        point.set(i9, i10);
        return true;
    }
}
