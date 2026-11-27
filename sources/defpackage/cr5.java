package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class cr5 extends FrameLayout {
    public static final int e = 0;
    public xq5 a;
    public br5 b;
    public ar5 c;
    public boolean d;

    public abstract View getButtonsLayout();

    public abstract zq5 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public final void setAnimationCallback(xq5 xq5Var) {
        this.a = xq5Var;
    }

    public abstract void setInternalPadding(int i);

    public abstract void setIsMessageTransition(boolean z);

    public final void setRecordingUiFrameCallback(ar5 ar5Var) {
        this.c = ar5Var;
        if (ar5Var != null) {
            boolean z = this.d;
            nr1 nr1Var = ((zu1) ((ri6) ar5Var).b).a0;
            if (nr1Var != null) {
                nr1Var.setRoundVideoUiFrameClockActive(z);
            }
        }
    }

    public final void setTrimCallback(br5 br5Var) {
        this.b = br5Var;
    }
}
