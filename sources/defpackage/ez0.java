package defpackage;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class ez0 implements pz0, wt3, ot2 {
    public final byte a;
    public final Object b;
    public final int c;
    public final int d;
    public final Object e;

    public ez0(xt3 xt3Var, int i, int i2, m72 m72Var) {
        this.a = (byte) 2;
        this.b = xt3Var;
        this.c = i;
        this.d = i2;
        this.e = m72Var;
    }

    @Override
    public final void a(String str) {
        xt3 xt3Var = (xt3) this.b;
        m72 m72Var = (m72) this.e;
        Editable text = xt3Var.getText();
        int i = this.c;
        int i2 = this.d;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof hm) && !(characterStyle instanceof q19)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i) {
                        text.setSpan(characterStyle, spanStart, i, 33);
                    }
                    if (spanEnd > i2) {
                        text.setSpan(characterStyle, i2, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(xt3Var.B(str), i, i2, 33);
        } catch (Exception unused) {
        }
        vt3 vt3Var = xt3Var.U1;
        if (vt3Var != null) {
            vt3Var.c();
        }
        if (m72Var != null) {
            m72Var.run();
        }
    }

    @Override
    public final void accept(Object obj) {
        sz6 sz6Var = (sz6) this.b;
        Surface surface = (Surface) this.e;
        og8 og8Var = (og8) obj;
        ((yx6) sz6Var.a.get()).getClass();
        if (surface == null) {
            og8Var.Q(null);
            sz6Var.n = null;
            return;
        }
        qz6 qz6Var = new qz6(surface, this.c, this.d);
        sz6Var.n = qz6Var;
        og8Var.Q(qz6Var);
    }

    @Override
    public final void b(oz0 oz0Var) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xz0 xz0Var = (xz0) obj2;
                xz0Var.a.j(new hz0(xz0Var, this.c, (nz0) obj, this.d, oz0Var, (byte) 1), 0L);
                return;
            default:
                xz0 xz0Var2 = (xz0) obj2;
                xz0Var2.a.j(new hz0(xz0Var2, this.c, (sz0) obj, this.d, oz0Var, (byte) 0), 0L);
                return;
        }
    }

    public ez0(xz0 xz0Var, int i, Object obj, int i2, byte b) {
        this.a = b;
        this.b = xz0Var;
        this.c = i;
        this.e = obj;
        this.d = i2;
    }

    public ez0(sz6 sz6Var, Surface surface, int i, int i2) {
        this.a = (byte) 3;
        this.b = sz6Var;
        this.e = surface;
        this.c = i;
        this.d = i2;
    }
}
