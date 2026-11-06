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
import org.telegram.ui.Components.ly0;
import org.telegram.ui.rg0;
public final class fj implements rg0 {
    public float D;
    public ij E;
    public int F;
    public org.telegram.ui.Components.ic G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public ly0 L;
    public int M;
    public boolean N;
    public int O;
    public Drawable P;
    public ly0 Q;
    public int R;
    public org.telegram.ui.Cells.y S;
    public Paint T;
    public boolean U;
    public Paint V;
    public boolean f22387a;
    public boolean f22388b;
    public int f22389c;
    public StaticLayout f22390e;
    public int f22391f;
    public int h;
    public int f22392n;
    public int f22393r;
    public int f22394s;
    public int f22395w;
    public byte f22396x;
    public final AtomicReference d = new AtomicReference();
    public final ArrayList f22397y = new ArrayList();

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
        return this.f22390e;
    }

    public final int c() {
        float f10;
        if (this.U) {
            f10 = 28.0f;
        } else {
            f10 = 15.0f;
        }
        return g0.L(f10);
    }

    public final float d(org.telegram.ui.Cells.x1 x1Var) {
        boolean f10;
        float f11;
        if (x1Var.f30787f3) {
            HashSet hashSet = x1Var.f30782e3;
            f10 = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.f22389c))) {
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
        ij ijVar = this.E;
        if (ijVar != null && (hashSet = ijVar.I0) != null && hashSet.contains(Integer.valueOf(this.f22389c))) {
            return false;
        }
        return true;
    }

    public final int g() {
        float f10;
        if (this.L != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int h() {
        StaticLayout staticLayout;
        if (this.L == null && (staticLayout = this.f22390e) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((this.f22390e.getLineBottom(0) + this.f22390e.getLineTop(0)) / 2.0f) - (g0.L(18.0f) / 2.0f));
        }
        return g0.L(8.0f) + (-g());
    }

    public final void i(Canvas canvas, RectF rectF, int i7, int i10, float f10) {
        if (!this.N) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i7);
        if (this.R != r12) {
            org.telegram.ui.Cells.y yVar = this.S;
            this.R = r12;
            org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
        }
        this.S.setBounds(g0.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - g0.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
        int i11 = (int) (255.0f * f10);
        this.S.setAlpha(i11);
        if (this.S.getCallback() != null) {
            this.S.draw(canvas);
        }
        this.T.setColor(i0.a.o(i10, 38));
        canvas.drawRect(rectF.left + g0.L(10.0f), (rectF.bottom - g0.L(38.0f)) - g0.f1(), rectF.right - g0.L(6.66f), rectF.bottom - g0.L(38.0f), this.T);
        float min = Math.min(rectF.width() - g0.L(12.0f), (this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + this.Q.f35777c);
        float centerX = rectF.centerX() - (min / 2.0f);
        float L = rectF.bottom - (g0.L(38.0f) / 2.0f);
        if (this.O != i7) {
            Drawable drawable = this.P;
            this.O = i7;
            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        this.P.setAlpha(i11);
        Drawable drawable2 = this.P;
        drawable2.setBounds((int) centerX, (int) (L - ((drawable2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.P.getIntrinsicWidth() * 0.8f) + centerX), (int) a8.p0.f(this.P.getIntrinsicHeight(), 0.8f, 2.0f, L));
        this.P.draw(canvas);
        float intrinsicWidth = (this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + centerX;
        ly0 ly0Var = this.Q;
        ly0Var.f35788p = g0.L(12.0f) + ((int) (min - ((this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f))));
        ly0Var.c(intrinsicWidth, L, f10, i7, canvas);
    }

    public final int j(org.telegram.ui.Cells.x1 x1Var) {
        if (!this.J) {
            return this.f22395w;
        }
        return g0.W1(d(x1Var), this.f22395w, this.F);
    }

    public final boolean k(float f10, float f11, float f12) {
        if (this.N && f10 >= f12 - g0.L(38.0f) && f10 <= f12 && f11 >= (-g())) {
            if (f11 <= g0.L(26.0f) + h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        byte b10 = this.f22396x;
        if ((b10 & 1) != 0 && (b10 & 2) == 0) {
            return true;
        }
        return false;
    }

    public final void m(int i7, String str, boolean z9) {
        boolean z10;
        if (i7 >= 75 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.N = z10;
        int i10 = 5;
        if (z10) {
            this.Q = new ly0(hd.M0(2131751765, null).toUpperCase(), iz.W0 - 3, g0.o());
            Drawable h = jg.g.h(t0.f25555b, 2131232103);
            this.P = h;
            h.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.k6.c0(this.R, 0, 0, Math.min(5, iz.Y0), 0);
            this.T = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.K = null;
            this.L = null;
            return;
        }
        this.K = str;
        String b10 = b(str);
        int i11 = iz.W0 - 1;
        ni.s sVar = ni.m.f20632a;
        if (i7 <= 120) {
            if (i7 > 50) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        }
        ly0 ly0Var = new ly0(b10, i11 - (i10 / 2), g0.o());
        this.L = ly0Var;
        this.M = g0.L(4.0f) + ((int) (ly0Var.f35775a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z9) {
        this.U = true;
        this.N = !z9;
        if (!z9) {
            Drawable h = jg.g.h(t0.f25555b, 2131232103);
            this.P = h;
            h.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.k6.c0(this.R, 0, 0, Math.min(5, iz.Y0), 0);
        }
        ly0 ly0Var = null;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.K = str;
        if (str != null) {
            ly0Var = new ly0(str, Math.max(8, iz.W0 - 4), null);
        }
        this.L = ly0Var;
        this.M = 0;
    }

    public final float o(ArrayList arrayList) {
        fj fjVar;
        int i7;
        if (arrayList == null) {
            return 0.0f;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && (fjVar = (fj) arrayList.get(i11)) != this; i11++) {
            int i12 = fjVar.f22391f;
            if (fjVar.J && fjVar.f()) {
                i7 = fjVar.F;
            } else {
                i7 = fjVar.f22395w;
            }
            i10 += i7 + i12 + fjVar.h;
        }
        return i10;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.x1 x1Var) {
        fj fjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (fjVar = (fj) arrayList.get(i10)) != this; i10++) {
            i7 += fjVar.j(x1Var) + fjVar.f22391f + fjVar.h;
        }
        return i7;
    }
}
