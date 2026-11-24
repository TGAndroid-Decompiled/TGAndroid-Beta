package defpackage;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cx1 extends ap0 {
    public boolean s;
    public final ChatActivityEnterView w;

    public cx1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new zw8((byte) 3);
        fu fuVar = new fu((byte) 1, context, this);
        this.c = fuVar;
        fuVar.setOverScrollMode(2);
        fuVar.setClipToPadding(false);
        fuVar.setClipToOutline(true);
        fuVar.j(new y(this, (byte) 7));
        addView(fuVar);
        paint.setColor(bkb.w0(null, bkb.yj, false));
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.updateColors();
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
            this.w.i2();
        }
    }
}
