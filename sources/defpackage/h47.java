package defpackage;

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
import org.telegram.messenger.a;
public final class h47 implements mi7 {
    public float E;
    public k47 F;
    public int G;
    public u51 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public uib M;
    public int N;
    public boolean O;
    public int P;
    public Drawable Q;
    public uib R;
    public int S;
    public fg0 T;
    public Paint U;
    public boolean V;
    public Paint W;
    public boolean a;
    public boolean b;
    public int c;
    public StaticLayout e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public byte x;
    public final AtomicReference d = new AtomicReference();
    public final ArrayList y = new ArrayList();

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
        replaceAll.getClass();
        char c = 65535;
        switch (replaceAll.hashCode()) {
            case -1886433663:
                if (replaceAll.equals("actionscript")) {
                    c = 0;
                    break;
                }
                break;
            case -1408289185:
                if (replaceAll.equals("aspnet")) {
                    c = 1;
                    break;
                }
                break;
            case -1395746259:
                if (replaceAll.equals("bbcode")) {
                    c = 2;
                    break;
                }
                break;
            case -1351281305:
                if (replaceAll.equals("csharp")) {
                    c = 3;
                    break;
                }
                break;
            case -1265393852:
                if (replaceAll.equals("fsharp")) {
                    c = 4;
                    break;
                }
                break;
            case -1081245651:
                if (replaceAll.equals("matlab")) {
                    c = 5;
                    break;
                }
                break;
            case -973197092:
                if (replaceAll.equals("python")) {
                    c = 6;
                    break;
                }
                break;
            case -522285947:
                if (replaceAll.equals("typescript")) {
                    c = 7;
                    break;
                }
                break;
            case 114:
                if (replaceAll.equals("r")) {
                    c = '\b';
                    break;
                }
                break;
            case 3184:
                if (replaceAll.equals("cs")) {
                    c = '\t';
                    break;
                }
                break;
            case 3401:
                if (replaceAll.equals("js")) {
                    c = '\n';
                    break;
                }
                break;
            case 3479:
                if (replaceAll.equals("md")) {
                    c = 11;
                    break;
                }
                break;
            case 3593:
                if (replaceAll.equals("py")) {
                    c = '\f';
                    break;
                }
                break;
            case 3632:
                if (replaceAll.equals("rb")) {
                    c = '\r';
                    break;
                }
                break;
            case 3704:
                if (replaceAll.equals("tl")) {
                    c = 14;
                    break;
                }
                break;
            case 3711:
                if (replaceAll.equals("ts")) {
                    c = 15;
                    break;
                }
                break;
            case 96891:
                if (replaceAll.equals("asm")) {
                    c = 16;
                    break;
                }
                break;
            case 98723:
                if (replaceAll.equals("cpp")) {
                    c = 17;
                    break;
                }
                break;
            case 98819:
                if (replaceAll.equals("css")) {
                    c = 18;
                    break;
                }
                break;
            case 98822:
                if (replaceAll.equals("csv")) {
                    c = 19;
                    break;
                }
                break;
            case 104420:
                if (replaceAll.equals("ini")) {
                    c = 20;
                    break;
                }
                break;
            case 105551:
                if (replaceAll.equals("jsx")) {
                    c = 21;
                    break;
                }
                break;
            case 110968:
                if (replaceAll.equals("php")) {
                    c = 22;
                    break;
                }
                break;
            case 112080:
                if (replaceAll.equals("qml")) {
                    c = 23;
                    break;
                }
                break;
            case 114126:
                if (replaceAll.equals("sql")) {
                    c = 24;
                    break;
                }
                break;
            case 114922:
                if (replaceAll.equals("tlb")) {
                    c = 25;
                    break;
                }
                break;
            case 115161:
                if (replaceAll.equals("tsx")) {
                    c = 26;
                    break;
                }
                break;
            case 118807:
                if (replaceAll.equals("xml")) {
                    c = 27;
                    break;
                }
                break;
            case 119768:
                if (replaceAll.equals("yml")) {
                    c = 28;
                    break;
                }
                break;
            case 3154628:
                if (replaceAll.equals("func")) {
                    c = 29;
                    break;
                }
                break;
            case 3175934:
                if (replaceAll.equals("glsl")) {
                    c = 30;
                    break;
                }
                break;
            case 3205725:
                if (replaceAll.equals("hlsl")) {
                    c = 31;
                    break;
                }
                break;
            case 3213227:
                if (replaceAll.equals("html")) {
                    c = ' ';
                    break;
                }
                break;
            case 3213448:
                if (replaceAll.equals("http")) {
                    c = '!';
                    break;
                }
                break;
            case 3271912:
                if (replaceAll.equals("json")) {
                    c = '\"';
                    break;
                }
                break;
            case 3318169:
                if (replaceAll.equals("less")) {
                    c = '#';
                    break;
                }
                break;
            case 3373901:
                if (replaceAll.equals("nasm")) {
                    c = '$';
                    break;
                }
                break;
            case 3404364:
                if (replaceAll.equals("objc")) {
                    c = '%';
                    break;
                }
                break;
            case 3511770:
                if (replaceAll.equals("ruby")) {
                    c = '&';
                    break;
                }
                break;
            case 3522862:
                if (replaceAll.equals("sass")) {
                    c = '\'';
                    break;
                }
                break;
            case 3524784:
                if (replaceAll.equals("scss")) {
                    c = '(';
                    break;
                }
                break;
            case 3561037:
                if (replaceAll.equals("tl-b")) {
                    c = ')';
                    break;
                }
                break;
            case 3642020:
                if (replaceAll.equals("wasm")) {
                    c = '*';
                    break;
                }
                break;
            case 3701415:
                if (replaceAll.equals("yaml")) {
                    c = '+';
                    break;
                }
                break;
            case 94833107:
                if (replaceAll.equals("cobol")) {
                    c = ',';
                    break;
                }
                break;
            case 101429325:
                if (replaceAll.equals("json5")) {
                    c = '-';
                    break;
                }
                break;
            case 101429384:
                if (replaceAll.equals("jsonp")) {
                    c = '.';
                    break;
                }
                break;
            case 112003953:
                if (replaceAll.equals("vbnet")) {
                    c = '/';
                    break;
                }
                break;
            case 188995949:
                if (replaceAll.equals("javascript")) {
                    c = '0';
                    break;
                }
                break;
            case 213985633:
                if (replaceAll.equals("autohotkey")) {
                    c = '1';
                    break;
                }
                break;
            case 246938863:
                if (replaceAll.equals("markdown")) {
                    c = '2';
                    break;
                }
                break;
            case 499384161:
                if (replaceAll.equals("visual-basic")) {
                    c = '3';
                    break;
                }
                break;
            case 1064174568:
                if (replaceAll.equals("gdscript")) {
                    c = '4';
                    break;
                }
                break;
            case 1067478602:
                if (replaceAll.equals("objectivec")) {
                    c = '5';
                    break;
                }
                break;
        }
        switch (c) {
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
        return this.e;
    }

    public final int c() {
        float f;
        if (this.V) {
            f = 28.0f;
        } else {
            f = 15.0f;
        }
        return gm.L(f);
    }

    public final float d(yc2 yc2Var) {
        boolean f;
        float f2;
        if (yc2Var.f3) {
            HashSet hashSet = yc2Var.e3;
            f = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.c))) {
                f = false;
            }
        } else {
            f = f();
        }
        float f3 = 0.0f;
        if (f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (f()) {
            f3 = 1.0f;
        }
        return gm.R1(f2, f3, yc2Var.L1);
    }

    @Override
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        k47 k47Var = this.F;
        if (k47Var != null && (hashSet = k47Var.K0) != null && hashSet.contains(Integer.valueOf(this.c))) {
            return false;
        }
        return true;
    }

    public final int g() {
        float f;
        if (this.M != null) {
            f = 32.0f;
        } else {
            f = 12.0f;
        }
        return gm.L(f);
    }

    public final int h() {
        StaticLayout staticLayout;
        if (this.M == null && (staticLayout = this.e) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (gm.L(18.0f) / 2.0f));
        }
        return gm.L(8.0f) + (-g());
    }

    public final void i(Canvas canvas, RectF rectF, int i, int i2, float f) {
        if (!this.O) {
            return;
        }
        int p1 = cmb.p1(0.1f, i);
        if (this.S != p1) {
            fg0 fg0Var = this.T;
            this.S = p1;
            cmb.F1(fg0Var, p1, true);
        }
        this.T.setBounds(gm.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - gm.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
        int i3 = (int) (255.0f * f);
        this.T.setAlpha(i3);
        if (this.T.getCallback() != null) {
            this.T.draw(canvas);
        }
        this.U.setColor(on2.p(i2, 38));
        canvas.drawRect(rectF.left + gm.L(10.0f), (rectF.bottom - gm.L(38.0f)) - gm.e1(), rectF.right - gm.L(6.66f), rectF.bottom - gm.L(38.0f), this.U);
        float min = Math.min(rectF.width() - gm.L(12.0f), (this.Q.getIntrinsicWidth() * 0.8f) + gm.L(5.0f) + this.R.c);
        float centerX = rectF.centerX() - (min / 2.0f);
        float L = rectF.bottom - (gm.L(38.0f) / 2.0f);
        if (this.P != i) {
            Drawable drawable = this.Q;
            this.P = i;
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        this.Q.setAlpha(i3);
        Drawable drawable2 = this.Q;
        drawable2.setBounds((int) centerX, (int) (L - ((drawable2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.Q.getIntrinsicWidth() * 0.8f) + centerX), (int) kt6.d(this.Q.getIntrinsicHeight(), 0.8f, 2.0f, L));
        this.Q.draw(canvas);
        float intrinsicWidth = (this.Q.getIntrinsicWidth() * 0.8f) + gm.L(5.0f) + centerX;
        uib uibVar = this.R;
        uibVar.p = gm.L(12.0f) + ((int) (min - ((this.Q.getIntrinsicWidth() * 0.8f) + gm.L(5.0f))));
        uibVar.c(intrinsicWidth, L, f, i, canvas);
    }

    public final int j(yc2 yc2Var) {
        boolean z = this.K;
        int i = this.w;
        if (!z) {
            return i;
        }
        return gm.U1(d(yc2Var), i, this.G);
    }

    public final boolean k(float f, float f2, float f3) {
        if (this.O && f >= f3 - gm.L(38.0f) && f <= f3 && f2 >= (-g())) {
            if (f2 <= gm.L(26.0f) + h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        byte b = this.x;
        if ((b & 1) != 0 && (b & 2) == 0) {
            return true;
        }
        return false;
    }

    public final void m(int i, String str, boolean z) {
        boolean z2;
        if (i >= 75 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.O = z2;
        int i2 = 5;
        if (z2) {
            this.R = new uib(jb6.M0(2131751702, null).toUpperCase(), gda.S0 - 3, gm.o());
            Drawable d = b10.d(a.b, 2131232109);
            this.Q = d;
            d.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = cmb.a0(this.S, 0, 0, Math.min(5, gda.U0), 0);
            this.U = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.L = null;
            this.M = null;
            return;
        }
        this.L = str;
        String b = b(str);
        int i3 = gda.S0 - 1;
        ml8 ml8Var = el2.a;
        if (i <= 120) {
            if (i > 50) {
                i2 = 3;
            } else {
                i2 = 2;
            }
        }
        uib uibVar = new uib(b, i3 - (i2 / 2), gm.o());
        this.M = uibVar;
        this.N = gm.L(4.0f) + ((int) (uibVar.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z) {
        this.V = true;
        this.O = !z;
        if (!z) {
            Drawable d = b10.d(a.b, 2131232109);
            this.Q = d;
            d.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = cmb.a0(this.S, 0, 0, Math.min(5, gda.U0), 0);
        }
        uib uibVar = null;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.L = str;
        if (str != null) {
            uibVar = new uib(str, Math.max(8, gda.S0 - 4), null);
        }
        this.M = uibVar;
        this.N = 0;
    }

    public final float o(ArrayList arrayList) {
        h47 h47Var;
        int i;
        if (arrayList == null) {
            return 0.0f;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size() && (h47Var = (h47) arrayList.get(i3)) != this; i3++) {
            int i4 = h47Var.f;
            if (h47Var.K && h47Var.f()) {
                i = h47Var.G;
            } else {
                i = h47Var.w;
            }
            i2 += i + i4 + h47Var.h;
        }
        return i2;
    }

    public final float p(ArrayList arrayList, yc2 yc2Var) {
        h47 h47Var;
        if (arrayList == null) {
            return 0.0f;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size() && (h47Var = (h47) arrayList.get(i2)) != this; i2++) {
            i += h47Var.j(yc2Var) + h47Var.f + h47Var.h;
        }
        return i;
    }
}
