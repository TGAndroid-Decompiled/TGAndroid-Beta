package jg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import vh.s3;
public final class i1 implements p6 {
    public final TextPaint f10017a;
    public final TextPaint f10018b;
    public final TextPaint f10019c;
    public final Paint d;
    public final Paint e;
    public final s3 f10020f;

    public i1(s3 s3Var) {
        this.f10020f = s3Var;
        TextPaint textPaint = new TextPaint();
        this.f10017a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f10018b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f10019c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.e = paint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, uz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, uz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f10020f.B0;
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        t6.r(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return t6.f21257v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.f10018b;
            case 1:
                return this.f10019c;
            case 2:
                return this.e;
            case 3:
                return this.d;
            case 4:
                return this.f10017a;
            default:
                return t6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return uz.H0;
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        s3 s3Var = this.f10020f;
        i1 i1Var = s3Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (s3Var.E0 == null) {
                s3Var.E0 = new c5(0, false, false, i1Var);
            }
            return s3Var.E0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (s3Var.F0 == null) {
                s3Var.F0 = new c5(0, false, true, i1Var);
            }
            return s3Var.F0;
        } else if (str.equals("drawableMsgOut")) {
            if (s3Var.G0 == null) {
                s3Var.G0 = new c5(0, true, false, i1Var);
            }
            return s3Var.G0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (s3Var.H0 == null) {
                s3Var.H0 = new c5(0, true, true, i1Var);
            }
            return s3Var.H0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (s3Var.I0 == null) {
                s3Var.I0 = new c5(1, false, false, i1Var);
            }
            s3Var.I0.invalidateSelf();
            return s3Var.I0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (s3Var.J0 == null) {
                s3Var.J0 = new c5(1, false, true, i1Var);
            }
            return s3Var.J0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (s3Var.K0 == null) {
                s3Var.K0 = new c5(1, true, false, i1Var);
            }
            return s3Var.K0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (s3Var.L0 == null) {
                s3Var.L0 = new c5(1, true, true, i1Var);
            }
            return s3Var.L0;
        } else {
            return t6.R0(str);
        }
    }

    @Override
    public final int h(int i10) {
        return this.f10020f.C0.get(i10, t6.x0(null, i10, false));
    }

    @Override
    public final int j(int i10) {
        return h(i10);
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
