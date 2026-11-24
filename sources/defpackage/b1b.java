package defpackage;

import android.content.Context;
public final class b1b extends bf0 implements jm7 {
    public final int H;
    public int I;
    public String J;

    public b1b(Context context, int i) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0) {
            if (this.J.equals((String) objArr[0])) {
                u();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        nm7.f(this.H).b(this, nm7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.H).n(this, nm7.y0);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1b.u():void");
    }
}
