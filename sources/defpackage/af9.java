package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
public final class af9 implements kmb {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public af9(StaticLayout staticLayout, Rect rect) {
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
                f1d f1dVar = (f1d) obj;
                g1d g1dVar = f1dVar.h;
                if (g1dVar == null) {
                    g1d g1dVar2 = new g1d(f1dVar);
                    f1dVar.h = g1dVar2;
                    return g1dVar2;
                }
                return g1dVar;
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
                return ((nm9) this.c).V;
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
                nm9 nm9Var = (nm9) this.c;
                return (nm9Var.T - nm9Var.k0) + ((f1d) this.b).b;
        }
    }

    @Override
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((nm9) this.c).U + ((f1d) this.b).c;
        }
    }

    public af9(nm9 nm9Var, f1d f1dVar) {
        this.c = nm9Var;
        this.b = f1dVar;
    }
}
