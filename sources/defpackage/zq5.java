package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class zq5 extends FrameLayout {
    public static final int e = 0;
    public uq5 a;
    public yq5 b;
    public xq5 c;
    public boolean d;

    public abstract View getButtonsLayout();

    public abstract wq5 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public final void setAnimationCallback(uq5 uq5Var) {
        this.a = uq5Var;
    }

    public abstract void setInternalPadding(int i);

    public abstract void setIsMessageTransition(boolean z);

    public final void setRecordingUiFrameCallback(xq5 xq5Var) {
        this.c = xq5Var;
        if (xq5Var != null) {
            boolean z = this.d;
            ms1 ms1Var = ((yv1) ((ni6) xq5Var).b).a0;
            if (ms1Var != null) {
                ms1Var.setRoundVideoUiFrameClockActive(z);
            }
        }
    }

    public final void setTrimCallback(yq5 yq5Var) {
        this.b = yq5Var;
    }
}
