package defpackage;

import android.content.Context;
public final class a3b extends de0 implements fn7 {
    public final int H;
    public int I;
    public String J;

    public a3b(Context context, int i) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0) {
            if (this.J.equals((String) objArr[0])) {
                u();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        jn7.f(this.H).b(this, jn7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.H).n(this, jn7.y0);
    }

    public void setStickerNum(int i) {
        if (this.I != i) {
            this.I = i;
            u();
        }
    }

    public void setStickerPackName(String str) {
        this.J = str;
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3b.u():void");
    }
}
