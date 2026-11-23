package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.up;
public final class i1 extends View {
    public final int f12078a = 1;
    public final up f12079b;

    public i1(Context context) {
        super(context);
        this.f12079b = new up(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f12078a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                up upVar = this.f12079b;
                upVar.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                upVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                up upVar2 = this.f12079b;
                upVar2.setBounds(0, 0, width, height);
                upVar2.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29511m5, false));
                upVar2.setAlpha(255);
                upVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.f12079b = new up(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29511m5, false));
    }
}
