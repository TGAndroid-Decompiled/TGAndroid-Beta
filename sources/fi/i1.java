package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.sp;
public final class i1 extends View {
    public final int f12086a = 1;
    public final sp f12087b;

    public i1(Context context) {
        super(context);
        this.f12087b = new sp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f12086a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                sp spVar = this.f12087b;
                spVar.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                spVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                sp spVar2 = this.f12087b;
                spVar2.setBounds(0, 0, width, height);
                spVar2.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29560m5, false));
                spVar2.setAlpha(255);
                spVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.f12087b = new sp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29560m5, false));
    }
}
