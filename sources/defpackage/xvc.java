package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class xvc extends View {
    public int a;
    public final WallpapersListActivity b;

    public xvc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(hl.L(25.0f), hl.L(31.0f), hl.L(18.0f), wallpapersListActivity.s);
        if (this.a == aob.w0(null, aob.d6, false)) {
            canvas.drawCircle(hl.L(25.0f), hl.L(31.0f), hl.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(50.0f), hl.L(62.0f));
    }
}
