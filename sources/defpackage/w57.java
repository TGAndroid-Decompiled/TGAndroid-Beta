package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class w57 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public w57(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final CharSequence a(Context context, vnb vnbVar) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i = this.f;
        if (spannableStringBuilder != null && this.c != null && hl.p == this.d) {
            if (this.b != aob.v0(i, vnbVar)) {
                Drawable drawable = this.c;
                int v0 = aob.v0(i, vnbVar);
                this.b = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = hl.p;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.c = mutate;
            int v02 = aob.v0(i, vnbVar);
            this.b = v02;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            int i2 = this.g;
            if (i2 <= 0) {
                L = this.c.getIntrinsicWidth();
            } else {
                L = hl.L(i2);
            }
            int i3 = this.h;
            if (i3 <= 0) {
                L2 = this.c.getIntrinsicHeight();
            } else {
                L2 = hl.L(i3);
            }
            int L3 = hl.L(this.i);
            this.c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new mf3(hl.L(2.0f)), 1, 2, 33);
            this.a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
