package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class a47 implements vnb {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final vw7 f;

    public a47(vw7 vw7Var) {
        this.f = vw7Var;
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.e = paint;
        textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint2.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint3.setTextSize(hl.L(15.0f));
        textPaint3.setTypeface(hl.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f.D0;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        aob.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c = 0;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c = 1;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c = 2;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c = 3;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            case 2:
                return this.e;
            case 3:
                return this.d;
            case 4:
                return this.a;
            default:
                return aob.T0(str);
        }
    }

    @Override
    public final boolean e() {
        return xea.D0;
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        vw7 vw7Var = this.f;
        a47 a47Var = vw7Var.F0;
        if (str.equals("drawableMsgIn")) {
            t37 t37Var = vw7Var.G0;
            if (t37Var == null) {
                t37 t37Var2 = new t37(0, false, false, a47Var);
                vw7Var.G0 = t37Var2;
                return t37Var2;
            }
            return t37Var;
        } else if (str.equals("drawableMsgInSelected")) {
            t37 t37Var3 = vw7Var.H0;
            if (t37Var3 == null) {
                t37 t37Var4 = new t37(0, false, true, a47Var);
                vw7Var.H0 = t37Var4;
                return t37Var4;
            }
            return t37Var3;
        } else if (str.equals("drawableMsgOut")) {
            t37 t37Var5 = vw7Var.I0;
            if (t37Var5 == null) {
                t37 t37Var6 = new t37(0, true, false, a47Var);
                vw7Var.I0 = t37Var6;
                return t37Var6;
            }
            return t37Var5;
        } else if (str.equals("drawableMsgOutSelected")) {
            t37 t37Var7 = vw7Var.J0;
            if (t37Var7 == null) {
                t37 t37Var8 = new t37(0, true, true, a47Var);
                vw7Var.J0 = t37Var8;
                return t37Var8;
            }
            return t37Var7;
        } else if (str.equals("drawableMsgInMedia")) {
            t37 t37Var9 = vw7Var.K0;
            if (t37Var9 == null) {
                t37Var9 = new t37(1, false, false, a47Var);
                vw7Var.K0 = t37Var9;
            }
            t37Var9.invalidateSelf();
            return vw7Var.K0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            t37 t37Var10 = vw7Var.L0;
            if (t37Var10 == null) {
                t37 t37Var11 = new t37(1, false, true, a47Var);
                vw7Var.L0 = t37Var11;
                return t37Var11;
            }
            return t37Var10;
        } else if (str.equals("drawableMsgOutMedia")) {
            t37 t37Var12 = vw7Var.M0;
            if (t37Var12 == null) {
                t37 t37Var13 = new t37(1, true, false, a47Var);
                vw7Var.M0 = t37Var13;
                return t37Var13;
            }
            return t37Var12;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            t37 t37Var14 = vw7Var.N0;
            if (t37Var14 == null) {
                t37 t37Var15 = new t37(1, true, true, a47Var);
                vw7Var.N0 = t37Var15;
                return t37Var15;
            }
            return t37Var14;
        } else {
            return aob.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        return this.f.E0.get(i, aob.w0(null, i, false));
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
