package defpackage;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class py1 extends aq0 {
    public boolean s;
    public final ChatActivityEnterView w;

    public py1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new az8((byte) 3);
        fv fvVar = new fv((byte) 1, context, this);
        this.c = fvVar;
        fvVar.setOverScrollMode(2);
        fvVar.setClipToPadding(false);
        fvVar.setClipToOutline(true);
        fvVar.j(new y(this, (byte) 8));
        addView(fvVar);
        paint.setColor(cmb.w0(null, cmb.yj, false));
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.updateColors();
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
            this.w.n2();
        }
    }
}
