package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class qo extends ro {
    public final byte b;

    public qo(String str, byte b) {
        super(str, (byte) 1);
        this.b = b;
    }

    @Override
    public final void b(int i, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i);
                return;
            case 1:
                ((Paint) obj).setColor(i);
                return;
            case 2:
                ((Drawable) obj).setAlpha(i);
                return;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((Paint) obj).getAlpha());
            case 1:
                return Integer.valueOf(((Paint) obj).getColor());
            case 2:
                return Integer.valueOf(((Drawable) obj).getAlpha());
            default:
                return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
        }
    }
}
