package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.vg0;
public final class cj implements vg0 {
    public float E;
    public fj F;
    public int G;
    public org.telegram.ui.Components.mc H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public vy0 M;
    public int N;
    public boolean O;
    public int P;
    public Drawable Q;
    public vy0 R;
    public int S;
    public org.telegram.ui.Cells.y T;
    public Paint U;
    public boolean V;
    public Paint W;
    public boolean f23361a;
    public boolean f23362b;
    public int f23363c;
    public StaticLayout f23364e;
    public int f23365f;
    public int h;
    public int f23366n;
    public int f23367r;
    public int f23368s;
    public int f23369w;
    public byte f23370x;
    public final AtomicReference d = new AtomicReference();
    public final ArrayList f23371y = new ArrayList();

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
        replaceAll.getClass();
        char c10 = 65535;
        switch (replaceAll.hashCode()) {
            case -1886433663:
                if (replaceAll.equals("actionscript")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1408289185:
                if (replaceAll.equals("aspnet")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1395746259:
                if (replaceAll.equals("bbcode")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1351281305:
                if (replaceAll.equals("csharp")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1265393852:
                if (replaceAll.equals("fsharp")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1081245651:
                if (replaceAll.equals("matlab")) {
                    c10 = 5;
                    break;
                }
                break;
            case -973197092:
                if (replaceAll.equals("python")) {
                    c10 = 6;
                    break;
                }
                break;
            case -522285947:
                if (replaceAll.equals("typescript")) {
                    c10 = 7;
                    break;
                }
                break;
            case 114:
                if (replaceAll.equals("r")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3184:
                if (replaceAll.equals("cs")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3401:
                if (replaceAll.equals("js")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3479:
                if (replaceAll.equals("md")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3593:
                if (replaceAll.equals("py")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3632:
                if (replaceAll.equals("rb")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3704:
                if (replaceAll.equals("tl")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3711:
                if (replaceAll.equals("ts")) {
                    c10 = 15;
                    break;
                }
                break;
            case 96891:
                if (replaceAll.equals("asm")) {
                    c10 = 16;
                    break;
                }
                break;
            case 98723:
                if (replaceAll.equals("cpp")) {
                    c10 = 17;
                    break;
                }
                break;
            case 98819:
                if (replaceAll.equals("css")) {
                    c10 = 18;
                    break;
                }
                break;
            case 98822:
                if (replaceAll.equals("csv")) {
                    c10 = 19;
                    break;
                }
                break;
            case 104420:
                if (replaceAll.equals("ini")) {
                    c10 = 20;
                    break;
                }
                break;
            case 105551:
                if (replaceAll.equals("jsx")) {
                    c10 = 21;
                    break;
                }
                break;
            case 110968:
                if (replaceAll.equals("php")) {
                    c10 = 22;
                    break;
                }
                break;
            case 112080:
                if (replaceAll.equals("qml")) {
                    c10 = 23;
                    break;
                }
                break;
            case 114126:
                if (replaceAll.equals("sql")) {
                    c10 = 24;
                    break;
                }
                break;
            case 114922:
                if (replaceAll.equals("tlb")) {
                    c10 = 25;
                    break;
                }
                break;
            case 115161:
                if (replaceAll.equals("tsx")) {
                    c10 = 26;
                    break;
                }
                break;
            case 118807:
                if (replaceAll.equals("xml")) {
                    c10 = 27;
                    break;
                }
                break;
            case 119768:
                if (replaceAll.equals("yml")) {
                    c10 = 28;
                    break;
                }
                break;
            case 3154628:
                if (replaceAll.equals("func")) {
                    c10 = 29;
                    break;
                }
                break;
            case 3175934:
                if (replaceAll.equals("glsl")) {
                    c10 = 30;
                    break;
                }
                break;
            case 3205725:
                if (replaceAll.equals("hlsl")) {
                    c10 = 31;
                    break;
                }
                break;
            case 3213227:
                if (replaceAll.equals("html")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 3213448:
                if (replaceAll.equals("http")) {
                    c10 = '!';
                    break;
                }
                break;
            case 3271912:
                if (replaceAll.equals("json")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 3318169:
                if (replaceAll.equals("less")) {
                    c10 = '#';
                    break;
                }
                break;
            case 3373901:
                if (replaceAll.equals("nasm")) {
                    c10 = '$';
                    break;
                }
                break;
            case 3404364:
                if (replaceAll.equals("objc")) {
                    c10 = '%';
                    break;
                }
                break;
            case 3511770:
                if (replaceAll.equals("ruby")) {
                    c10 = '&';
                    break;
                }
                break;
            case 3522862:
                if (replaceAll.equals("sass")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 3524784:
                if (replaceAll.equals("scss")) {
                    c10 = '(';
                    break;
                }
                break;
            case 3561037:
                if (replaceAll.equals("tl-b")) {
                    c10 = ')';
                    break;
                }
                break;
            case 3642020:
                if (replaceAll.equals("wasm")) {
                    c10 = '*';
                    break;
                }
                break;
            case 3701415:
                if (replaceAll.equals("yaml")) {
                    c10 = '+';
                    break;
                }
                break;
            case 94833107:
                if (replaceAll.equals("cobol")) {
                    c10 = ',';
                    break;
                }
                break;
            case 101429325:
                if (replaceAll.equals("json5")) {
                    c10 = '-';
                    break;
                }
                break;
            case 101429384:
                if (replaceAll.equals("jsonp")) {
                    c10 = '.';
                    break;
                }
                break;
            case 112003953:
                if (replaceAll.equals("vbnet")) {
                    c10 = '/';
                    break;
                }
                break;
            case 188995949:
                if (replaceAll.equals("javascript")) {
                    c10 = '0';
                    break;
                }
                break;
            case 213985633:
                if (replaceAll.equals("autohotkey")) {
                    c10 = '1';
                    break;
                }
                break;
            case 246938863:
                if (replaceAll.equals("markdown")) {
                    c10 = '2';
                    break;
                }
                break;
            case 499384161:
                if (replaceAll.equals("visual-basic")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1064174568:
                if (replaceAll.equals("gdscript")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1067478602:
                if (replaceAll.equals("objectivec")) {
                    c10 = '5';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "ActionScript";
            case 1:
                return "ASP.NET";
            case 2:
                return "BBCode";
            case 3:
            case '\t':
                return "C#";
            case 4:
                return "F#";
            case 5:
            case '\b':
            case 14:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
            case '$':
            case '\'':
            case '(':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
                return str.toUpperCase();
            case 6:
            case '\f':
                return "Python";
            case 7:
            case 15:
                return "TypeScript";
            case '\n':
            case '0':
                return "JavaScript";
            case 11:
            case '2':
                return "Markdown";
            case '\r':
            case '&':
                return "Ruby";
            case 17:
                return "C++";
            case 25:
            case ')':
                return "TL-B";
            case 29:
                return "FunC";
            case '%':
            case '5':
                return "Objective-C";
            case '/':
                return "VB.NET";
            case '1':
                return "AutoHotKey";
            case '3':
                return "Visual Basic";
            case '4':
                return "GDScript";
            default:
                return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    @Override
    public final Layout a() {
        return this.f23364e;
    }

    public final int c() {
        float f10;
        if (this.V) {
            f10 = 28.0f;
        } else {
            f10 = 15.0f;
        }
        return g0.L(f10);
    }

    public final float d(org.telegram.ui.Cells.x1 x1Var) {
        boolean f10;
        float f11;
        if (x1Var.f32324f3) {
            HashSet hashSet = x1Var.f32319e3;
            f10 = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.f23363c))) {
                f10 = false;
            }
        } else {
            f10 = f();
        }
        float f12 = 0.0f;
        if (f10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (f()) {
            f12 = 1.0f;
        }
        return g0.T1(f11, f12, x1Var.L1);
    }

    @Override
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        fj fjVar = this.F;
        if (fjVar != null && (hashSet = fjVar.K0) != null && hashSet.contains(Integer.valueOf(this.f23363c))) {
            return false;
        }
        return true;
    }

    public final int g() {
        float f10;
        if (this.M != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int h() {
        StaticLayout staticLayout;
        if (this.M == null && (staticLayout = this.f23364e) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((this.f23364e.getLineBottom(0) + this.f23364e.getLineTop(0)) / 2.0f) - (g0.L(18.0f) / 2.0f));
        }
        return g0.L(8.0f) + (-g());
    }

    public final void i(Canvas canvas, RectF rectF, int i7, int i10, float f10) {
        if (!this.O) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i7);
        if (this.S != r12) {
            org.telegram.ui.Cells.y yVar = this.T;
            this.S = r12;
            org.telegram.ui.ActionBar.n6.H1(yVar, r12, true);
        }
        this.T.setBounds(g0.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - g0.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
        int i11 = (int) (255.0f * f10);
        this.T.setAlpha(i11);
        if (this.T.getCallback() != null) {
            this.T.draw(canvas);
        }
        this.U.setColor(i0.a.o(i10, 38));
        canvas.drawRect(rectF.left + g0.L(10.0f), (rectF.bottom - g0.L(38.0f)) - g0.f1(), rectF.right - g0.L(6.66f), rectF.bottom - g0.L(38.0f), this.U);
        float min = Math.min(rectF.width() - g0.L(12.0f), (this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + this.R.f41482c);
        float centerX = rectF.centerX() - (min / 2.0f);
        float L = rectF.bottom - (g0.L(38.0f) / 2.0f);
        if (this.P != i7) {
            Drawable drawable = this.Q;
            this.P = i7;
            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        this.Q.setAlpha(i11);
        Drawable drawable2 = this.Q;
        drawable2.setBounds((int) centerX, (int) (L - ((drawable2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.Q.getIntrinsicWidth() * 0.8f) + centerX), (int) a8.p0.f(this.Q.getIntrinsicHeight(), 0.8f, 2.0f, L));
        this.Q.draw(canvas);
        float intrinsicWidth = (this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + centerX;
        vy0 vy0Var = this.R;
        vy0Var.f41493p = g0.L(12.0f) + ((int) (min - ((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f))));
        vy0Var.c(intrinsicWidth, L, f10, i7, canvas);
    }

    public final int j(org.telegram.ui.Cells.x1 x1Var) {
        if (!this.K) {
            return this.f23369w;
        }
        return g0.W1(d(x1Var), this.f23369w, this.G);
    }

    public final boolean k(float f10, float f11, float f12) {
        if (this.O && f10 >= f12 - g0.L(38.0f) && f10 <= f12 && f11 >= (-g())) {
            if (f11 <= g0.L(26.0f) + h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        byte b10 = this.f23370x;
        if ((b10 & 1) != 0 && (b10 & 2) == 0) {
            return true;
        }
        return false;
    }

    public final void m(int i7, String str, boolean z10) {
        boolean z11;
        if (i7 >= 75 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = z11;
        int i10 = 5;
        if (z11) {
            this.R = new vy0(gd.M0(2131751754, null).toUpperCase(), bz.W0 - 3, g0.o());
            Drawable g10 = i5.c.g(t0.f26915b, 2131232105);
            this.Q = g10;
            g10.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.n6.c0(this.S, 0, 0, Math.min(5, bz.Y0), 0);
            this.U = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.L = null;
            this.M = null;
            return;
        }
        this.L = str;
        String b10 = b(str);
        int i11 = bz.W0 - 1;
        qi.p pVar = qi.j.f56187a;
        if (i7 <= 120) {
            if (i7 > 50) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        }
        vy0 vy0Var = new vy0(b10, i11 - (i10 / 2), g0.o());
        this.M = vy0Var;
        this.N = g0.L(4.0f) + ((int) (vy0Var.f41480a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z10) {
        this.V = true;
        this.O = !z10;
        if (!z10) {
            Drawable g10 = i5.c.g(t0.f26915b, 2131232105);
            this.Q = g10;
            g10.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.n6.c0(this.S, 0, 0, Math.min(5, bz.Y0), 0);
        }
        vy0 vy0Var = null;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.L = str;
        if (str != null) {
            vy0Var = new vy0(str, Math.max(8, bz.W0 - 4), null);
        }
        this.M = vy0Var;
        this.N = 0;
    }

    public final float o(ArrayList arrayList) {
        cj cjVar;
        int i7;
        if (arrayList == null) {
            return 0.0f;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && (cjVar = (cj) arrayList.get(i11)) != this; i11++) {
            int i12 = cjVar.f23365f;
            if (cjVar.K && cjVar.f()) {
                i7 = cjVar.G;
            } else {
                i7 = cjVar.f23369w;
            }
            i10 += i7 + i12 + cjVar.h;
        }
        return i10;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.x1 x1Var) {
        cj cjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (cjVar = (cj) arrayList.get(i10)) != this; i10++) {
            i7 += cjVar.j(x1Var) + cjVar.f23365f + cjVar.h;
        }
        return i7;
    }
}
