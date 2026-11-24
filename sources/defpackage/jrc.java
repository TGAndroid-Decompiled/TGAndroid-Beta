package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class jrc extends View {
    public int a;
    public final WallpapersListActivity b;

    public jrc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(gl.L(25.0f), gl.L(31.0f), gl.L(18.0f), wallpapersListActivity.s);
        if (this.a == bkb.w0(null, bkb.c6, false)) {
            canvas.drawCircle(gl.L(25.0f), gl.L(31.0f), gl.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(50.0f), gl.L(62.0f));
    }
}
