package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class ltc extends View {
    public int a;
    public final WallpapersListActivity b;

    public ltc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(gm.L(25.0f), gm.L(31.0f), gm.L(18.0f), wallpapersListActivity.s);
        if (this.a == cmb.w0(null, cmb.c6, false)) {
            canvas.drawCircle(gm.L(25.0f), gm.L(31.0f), gm.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(50.0f), gm.L(62.0f));
    }
}
