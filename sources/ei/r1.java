package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cp;
public final class r1 extends View {
    public final int f10860a = 1;
    public final cp f10861b;

    public r1(Context context) {
        super(context);
        this.f10861b = new cp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f10860a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                cp cpVar = this.f10861b;
                cpVar.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                cpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                cp cpVar2 = this.f10861b;
                cpVar2.setBounds(0, 0, width, height);
                cpVar2.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28042m5, false));
                cpVar2.setAlpha(255);
                cpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public r1(Activity activity) {
        super(activity);
        this.f10861b = new cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28042m5, false));
    }
}
