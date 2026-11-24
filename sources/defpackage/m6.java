package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class m6 extends ViewOutlineProvider {
    public final Path a = new Path();

    @Override
    public final void getOutline(View view, Outline outline) {
        float L = gm.L(29.0f);
        float L2 = gm.L(12.0f);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{L, L, L, L, L2, L2, L2, L2}, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}
