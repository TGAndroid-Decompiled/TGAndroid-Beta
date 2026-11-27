package defpackage;

import android.content.Context;
import android.view.View;
public final class ey1 extends View {
    public final byte a;
    public final knc b;

    public ey1(Context context, knc kncVar, byte b) {
        super(context);
        this.a = b;
        this.b = kncVar;
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                this.b.setLanguagePillAlpha(f);
                return;
            default:
                super.setAlpha(f);
                this.b.setPillAlpha(f);
                return;
        }
    }
}
