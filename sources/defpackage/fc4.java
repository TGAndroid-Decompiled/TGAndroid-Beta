package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public abstract class fc4 extends FrameLayout {
    public float[] E;
    public FrameLayout a;
    public jia b;
    public jia c;
    public ImageView d;
    public ec4 e;
    public wb f;
    public wb h;
    public TextView n;
    public d r;
    public String s;
    public float w;
    public ValueAnimator x;
    public m8 y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f = 0.0f;
        float f2 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y = frameLayout3.getY() + f;
            f2 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y -= frameLayout3.getScrollY();
            }
            f = y;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r3 = (View) frameLayout3.getParent();
            boolean z = r3 instanceof ViewGroup;
            frameLayout3 = r3;
            if (!z) {
                return;
            }
        }
        fArr[0] = f2 - frameLayout2.getPaddingLeft();
        fArr[1] = f - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(127.0f), 1073741824));
    }
}
