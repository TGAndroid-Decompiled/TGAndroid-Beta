package ff;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class q0 extends ViewOutlineProvider {
    public final int f6252a;
    public final float f6253b;

    public q0(int i9, float f10) {
        this.f6252a = i9;
        this.f6253b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i9 = this.f6252a;
        float f10 = this.f6253b;
        int i10 = this.f6252a;
        outline.setRoundRect(i10, i10, width - i9, view.getHeight() - i9, f10);
    }
}
