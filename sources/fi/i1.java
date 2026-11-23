package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.rp;
public final class i1 extends View {
    public final int f12089a = 1;
    public final rp f12090b;

    public i1(Context context) {
        super(context);
        this.f12090b = new rp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f12089a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                rp rpVar = this.f12090b;
                rpVar.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                rpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                rp rpVar2 = this.f12090b;
                rpVar2.setBounds(0, 0, width, height);
                rpVar2.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29615m5, false));
                rpVar2.setAlpha(255);
                rpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.f12090b = new rp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29615m5, false));
    }
}
