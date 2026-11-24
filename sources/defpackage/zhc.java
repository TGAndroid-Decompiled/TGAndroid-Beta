package defpackage;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class zhc extends TextureViewRenderer {
    public final aic a;

    public zhc(aic aicVar, Context context) {
        super(context);
        this.a = aicVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.a.b();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
