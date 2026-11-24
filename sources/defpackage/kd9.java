package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
public final class kd9 implements qkb {
    public final byte a = 1;
    public final Object b;
    public final Object c;

    public kd9(StaticLayout staticLayout, Rect rect) {
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
                qyc qycVar = (qyc) obj;
                ryc rycVar = qycVar.h;
                if (rycVar == null) {
                    ryc rycVar2 = new ryc(qycVar);
                    qycVar.h = rycVar2;
                    return rycVar2;
                }
                return rycVar;
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
                return ((al9) this.c).V;
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
                al9 al9Var = (al9) this.c;
                return (al9Var.T - al9Var.k0) + ((qyc) this.b).b;
        }
    }

    @Override
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((al9) this.c).U + ((qyc) this.b).c;
        }
    }

    public kd9(al9 al9Var, qyc qycVar) {
        this.c = al9Var;
        this.b = qycVar;
    }
}
