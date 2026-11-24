package defpackage;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class zjc extends TextureViewRenderer {
    public final akc a;

    public zjc(akc akcVar, Context context) {
        super(context);
        this.a = akcVar;
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
