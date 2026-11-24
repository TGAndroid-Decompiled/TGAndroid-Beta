package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class zo5 extends FrameLayout {
    public static final int e = 0;
    public uo5 a;
    public yo5 b;
    public xo5 c;
    public boolean d;

    public abstract View getButtonsLayout();

    public abstract wo5 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public final void setAnimationCallback(uo5 uo5Var) {
        this.a = uo5Var;
    }

    public abstract void setInternalPadding(int i);

    public abstract void setIsMessageTransition(boolean z);

    public final void setRecordingUiFrameCallback(xo5 xo5Var) {
        this.c = xo5Var;
        if (xo5Var != null) {
            boolean z = this.d;
            ar1 ar1Var = ((mu1) ((l69) xo5Var).b).a0;
            if (ar1Var != null) {
                ar1Var.setRoundVideoUiFrameClockActive(z);
            }
        }
    }

    public final void setTrimCallback(yo5 yo5Var) {
        this.b = yo5Var;
    }
}
