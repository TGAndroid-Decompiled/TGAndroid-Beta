package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class f5 extends sg.j1 {
    public final Path f10860o3;
    public final ta f10861p3;

    public f5(ta taVar, Context context) {
        super(context);
        this.f10861p3 = taVar;
        this.f10860o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ta taVar = this.f10861p3;
        barView = taVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, taVar.f10812s1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, taVar.f10812s1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), taVar.f10812s1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), taVar.f10812s1));
        Path path = this.f10860o3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
