package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lp;
public final class k1 extends View {
    public final int f11917a = 1;
    public final lp f11918b;

    public k1(Context context) {
        super(context);
        this.f11918b = new lp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f11917a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                lp lpVar = this.f11918b;
                lpVar.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                lpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                lp lpVar2 = this.f11918b;
                lpVar2.setBounds(0, 0, width, height);
                lpVar2.b(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29013m5, false));
                lpVar2.setAlpha(255);
                lpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public k1(Activity activity) {
        super(activity);
        this.f11918b = new lp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29013m5, false));
    }
}
