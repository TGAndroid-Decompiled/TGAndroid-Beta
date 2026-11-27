package defpackage;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qx1 extends ap0 {
    public boolean s;
    public final ChatActivityEnterView w;

    public qx1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new m09((byte) 3);
        gu guVar = new gu((byte) 1, context, this);
        this.c = guVar;
        guVar.setOverScrollMode(2);
        guVar.setClipToPadding(false);
        guVar.setClipToOutline(true);
        guVar.j(new y(this, (byte) 7));
        addView(guVar);
        paint.setColor(aob.w0(null, aob.zj, false));
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.s) {
            this.s = true;
            this.w.u2();
        }
    }
}
