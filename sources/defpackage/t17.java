package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class t17 implements wjb {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final ot7 f;

    public t17(ot7 ot7Var) {
        this.f = ot7Var;
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
        textPaint.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        textPaint2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        textPaint3.setTextSize(gl.L(15.0f));
        textPaint3.setTypeface(gl.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f.D0;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        bkb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return bkb.u3;
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
                return bkb.T0(str);
        }
    }

    @Override
    public final boolean e() {
        return gba.D0;
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
        ot7 ot7Var = this.f;
        t17 t17Var = ot7Var.F0;
        if (str.equals("drawableMsgIn")) {
            m17 m17Var = ot7Var.G0;
            if (m17Var == null) {
                m17 m17Var2 = new m17(0, false, false, t17Var);
                ot7Var.G0 = m17Var2;
                return m17Var2;
            }
            return m17Var;
        } else if (str.equals("drawableMsgInSelected")) {
            m17 m17Var3 = ot7Var.H0;
            if (m17Var3 == null) {
                m17 m17Var4 = new m17(0, false, true, t17Var);
                ot7Var.H0 = m17Var4;
                return m17Var4;
            }
            return m17Var3;
        } else if (str.equals("drawableMsgOut")) {
            m17 m17Var5 = ot7Var.I0;
            if (m17Var5 == null) {
                m17 m17Var6 = new m17(0, true, false, t17Var);
                ot7Var.I0 = m17Var6;
                return m17Var6;
            }
            return m17Var5;
        } else if (str.equals("drawableMsgOutSelected")) {
            m17 m17Var7 = ot7Var.J0;
            if (m17Var7 == null) {
                m17 m17Var8 = new m17(0, true, true, t17Var);
                ot7Var.J0 = m17Var8;
                return m17Var8;
            }
            return m17Var7;
        } else if (str.equals("drawableMsgInMedia")) {
            m17 m17Var9 = ot7Var.K0;
            if (m17Var9 == null) {
                m17Var9 = new m17(1, false, false, t17Var);
                ot7Var.K0 = m17Var9;
            }
            m17Var9.invalidateSelf();
            return ot7Var.K0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            m17 m17Var10 = ot7Var.L0;
            if (m17Var10 == null) {
                m17 m17Var11 = new m17(1, false, true, t17Var);
                ot7Var.L0 = m17Var11;
                return m17Var11;
            }
            return m17Var10;
        } else if (str.equals("drawableMsgOutMedia")) {
            m17 m17Var12 = ot7Var.M0;
            if (m17Var12 == null) {
                m17 m17Var13 = new m17(1, true, false, t17Var);
                ot7Var.M0 = m17Var13;
                return m17Var13;
            }
            return m17Var12;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            m17 m17Var14 = ot7Var.N0;
            if (m17Var14 == null) {
                m17 m17Var15 = new m17(1, true, true, t17Var);
                ot7Var.N0 = m17Var15;
                return m17Var15;
            }
            return m17Var14;
        } else {
            return bkb.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        return this.f.E0.get(i, bkb.w0(null, i, false));
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
