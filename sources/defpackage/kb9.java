package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
public final class kb9 implements pib {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public kb9(StaticLayout staticLayout, Rect rect) {
        this.b = staticLayout;
        this.c = rect;
    }

    @Override
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (StaticLayout) obj;
            default:
                pwc pwcVar = (pwc) obj;
                qwc qwcVar = pwcVar.h;
                if (qwcVar == null) {
                    qwc qwcVar2 = new qwc(pwcVar);
                    pwcVar.h = qwcVar2;
                    return qwcVar2;
                }
                return qwcVar;
        }
    }

    @Override
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        byte b = this.a;
        return null;
    }

    @Override
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((zi9) this.c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                StaticLayout staticLayout = (StaticLayout) this.b;
                if (staticLayout == null) {
                    return null;
                }
                return staticLayout.getText();
            default:
                Layout a = a();
                if (a == null) {
                    return null;
                }
                return a.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                zi9 zi9Var = (zi9) this.c;
                return (zi9Var.T - zi9Var.k0) + ((pwc) this.b).b;
        }
    }

    @Override
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((zi9) this.c).U + ((pwc) this.b).c;
        }
    }

    public kb9(zi9 zi9Var, pwc pwcVar) {
        this.c = zi9Var;
        this.b = pwcVar;
    }
}
