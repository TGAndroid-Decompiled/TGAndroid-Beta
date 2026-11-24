package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;
public abstract class ke1 extends MediaRouteButton {
    public boolean a;

    public final void a() {
        boolean b = b();
        if (this.a != b) {
            this.a = b;
            c(b);
        }
    }

    public final boolean b() {
        Field declaredField;
        try {
            declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        if (((Integer) declaredField.get(this)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public abstract void c(boolean z);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a();
    }

    @Override
    public void setBackground(Drawable drawable) {
    }
}
