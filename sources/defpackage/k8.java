package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class k8 extends FrameLayout {
    public final Drawable a;

    public k8(int i, vnb vnbVar, Context context) {
        super(context);
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.b7, vnbVar);
        this.a = aob.V0(getContext(), 2131231232, v02);
        setBackgroundColor(v0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i) {
        setBackgroundColor(i);
    }

    public k8(Context context, vnb vnbVar) {
        this(aob.H8, vnbVar, context);
    }
}
