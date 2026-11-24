package defpackage;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class d01 implements o01, pu3, fu2 {
    public final byte a;
    public final Object b;
    public final int c;
    public final int d;
    public final Object e;

    public d01(qu3 qu3Var, int i, int i2, b82 b82Var) {
        this.a = (byte) 2;
        this.b = qu3Var;
        this.c = i;
        this.d = i2;
        this.e = b82Var;
    }

    @Override
    public final void a(String str) {
        qu3 qu3Var = (qu3) this.b;
        b82 b82Var = (b82) this.e;
        Editable text = qu3Var.getText();
        int i = this.c;
        int i2 = this.d;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof gn) && !(characterStyle instanceof e09)) {
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
            text.setSpan(qu3Var.B(str), i, i2, 33);
        } catch (Exception unused) {
        }
        ou3 ou3Var = qu3Var.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
        if (b82Var != null) {
            b82Var.run();
        }
    }

    @Override
    public final void accept(Object obj) {
        oz6 oz6Var = (oz6) this.b;
        Surface surface = (Surface) this.e;
        cf8 cf8Var = (cf8) obj;
        ((tx6) oz6Var.a.get()).getClass();
        if (surface == null) {
            cf8Var.Q(null);
            oz6Var.n = null;
            return;
        }
        mz6 mz6Var = new mz6(surface, this.c, this.d);
        oz6Var.n = mz6Var;
        cf8Var.Q(mz6Var);
    }

    @Override
    public final void b(n01 n01Var) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w01 w01Var = (w01) obj2;
                w01Var.a.j(new g01(w01Var, this.c, (m01) obj, this.d, n01Var, (byte) 1), 0L);
                return;
            default:
                w01 w01Var2 = (w01) obj2;
                w01Var2.a.j(new g01(w01Var2, this.c, (r01) obj, this.d, n01Var, (byte) 0), 0L);
                return;
        }
    }

    public d01(w01 w01Var, int i, Object obj, int i2, byte b) {
        this.a = b;
        this.b = w01Var;
        this.c = i;
        this.e = obj;
        this.d = i2;
    }

    public d01(oz6 oz6Var, Surface surface, int i, int i2) {
        this.a = (byte) 3;
        this.b = oz6Var;
        this.e = surface;
        this.c = i;
        this.d = i2;
    }
}
