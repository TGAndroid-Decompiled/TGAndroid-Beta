package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class t37 implements ylb {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final pv7 f;

    public t37(pv7 pv7Var) {
        this.f = pv7Var;
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
        textPaint.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint2.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint3.setTextSize(gm.L(15.0f));
        textPaint3.setTypeface(gm.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f.D0;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        cmb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return cmb.u3;
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
                return cmb.T0(str);
        }
    }

    @Override
    public final boolean e() {
        return gda.D0;
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
        pv7 pv7Var = this.f;
        t37 t37Var = pv7Var.F0;
        if (str.equals("drawableMsgIn")) {
            m37 m37Var = pv7Var.G0;
            if (m37Var == null) {
                m37 m37Var2 = new m37(0, false, false, t37Var);
                pv7Var.G0 = m37Var2;
                return m37Var2;
            }
            return m37Var;
        } else if (str.equals("drawableMsgInSelected")) {
            m37 m37Var3 = pv7Var.H0;
            if (m37Var3 == null) {
                m37 m37Var4 = new m37(0, false, true, t37Var);
                pv7Var.H0 = m37Var4;
                return m37Var4;
            }
            return m37Var3;
        } else if (str.equals("drawableMsgOut")) {
            m37 m37Var5 = pv7Var.I0;
            if (m37Var5 == null) {
                m37 m37Var6 = new m37(0, true, false, t37Var);
                pv7Var.I0 = m37Var6;
                return m37Var6;
            }
            return m37Var5;
        } else if (str.equals("drawableMsgOutSelected")) {
            m37 m37Var7 = pv7Var.J0;
            if (m37Var7 == null) {
                m37 m37Var8 = new m37(0, true, true, t37Var);
                pv7Var.J0 = m37Var8;
                return m37Var8;
            }
            return m37Var7;
        } else if (str.equals("drawableMsgInMedia")) {
            m37 m37Var9 = pv7Var.K0;
            if (m37Var9 == null) {
                m37Var9 = new m37(1, false, false, t37Var);
                pv7Var.K0 = m37Var9;
            }
            m37Var9.invalidateSelf();
            return pv7Var.K0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            m37 m37Var10 = pv7Var.L0;
            if (m37Var10 == null) {
                m37 m37Var11 = new m37(1, false, true, t37Var);
                pv7Var.L0 = m37Var11;
                return m37Var11;
            }
            return m37Var10;
        } else if (str.equals("drawableMsgOutMedia")) {
            m37 m37Var12 = pv7Var.M0;
            if (m37Var12 == null) {
                m37 m37Var13 = new m37(1, true, false, t37Var);
                pv7Var.M0 = m37Var13;
                return m37Var13;
            }
            return m37Var12;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            m37 m37Var14 = pv7Var.N0;
            if (m37Var14 == null) {
                m37 m37Var15 = new m37(1, true, true, t37Var);
                pv7Var.N0 = m37Var15;
                return m37Var15;
            }
            return m37Var14;
        } else {
            return cmb.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        return this.f.E0.get(i, cmb.w0(null, i, false));
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
