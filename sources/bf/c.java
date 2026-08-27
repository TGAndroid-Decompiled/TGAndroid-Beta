package bf;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;

public final class c {

    public final Rect f2081a = new Rect();

    public final Point f2082b = new Point();

    public final PictureInPictureParams.Builder a() {
        int i10;
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.f2082b;
        int i11 = point.x;
        if (i11 <= 0 || (i10 = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i11 / i10;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else {
                rational = d > 2.35d ? new Rational(235, 100) : new Rational(point.x, point.y);
            }
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        }
        Rect rect = this.f2081a;
        if (rect.isEmpty()) {
            builder.setSourceRectHint(null);
            return builder;
        }
        builder.setSourceRectHint(rect);
        return builder;
    }

    public final boolean b() {
        if (this.f2081a.isEmpty()) {
            return false;
        }
        Point point = this.f2082b;
        return point.x > 0 && point.y > 0;
    }

    public final boolean c(int i10, int i11) {
        Point point = this.f2082b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }
}
