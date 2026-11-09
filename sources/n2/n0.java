package n2;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import j$.util.Objects;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.z2;
public final class n0 {
    public int f20254a;
    public int f20255b;
    public Object f20256c;
    public Object d;
    public Object f20257e;
    public Object f20258f;

    public n0() {
        this.f20257e = new ArrayList();
        this.f20254a = 0;
        this.f20258f = new ArrayList();
        this.f20255b = 0;
    }

    public static boolean a(n0 n0Var) {
        return Objects.equals(((e2.u) n0Var.f20256c).f10615s, "audio/raw");
    }

    public static b80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            s70 s70Var = new s70(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            s70Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, s70Var);
            b80 b80Var = new b80();
            b80Var.f32187y = s70Var;
            b80Var.D = true;
            b80Var.k(4.0f);
            b80Var.l();
            return b80Var;
        }
        return null;
    }

    public void b(y70 y70Var, Object obj) {
        ((ArrayList) this.f20257e).add(new Pair(y70Var, obj));
        this.f20254a++;
        j(obj, true);
    }

    public void c(b80 b80Var, Object obj) {
        ((ArrayList) this.f20258f).add(new Pair(b80Var, obj));
        this.f20255b++;
        j(obj, true);
    }

    public ui.a d() {
        String str;
        String str2;
        if (this.f20254a == 3) {
            String str3 = (String) this.f20256c;
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            } else {
                int indexOf = str3.indexOf(47);
                if (indexOf >= 0) {
                    str = str3.substring(0, indexOf);
                } else {
                    str = str3;
                }
                if (indexOf >= 0) {
                    str2 = str3.substring(indexOf + 1);
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && ui.a.f56926g.matcher(str2).matches()))) {
                    try {
                        String lowerCase = IDN.toASCII(str, 3).toLowerCase(Locale.US);
                        if (str2 == null) {
                            str3 = lowerCase;
                        } else {
                            str3 = lowerCase + '/' + str2;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            this.f20256c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = ui.a.b((String) this.f20258f);
                if (b10 == null) {
                    b10 = ((String) this.f20258f).toLowerCase(Locale.US);
                }
                this.f20258f = b10;
            } else {
                this.f20258f = ((String) this.f20258f).toLowerCase(Locale.US);
            }
        }
        return new ui.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z9) {
        ArrayList arrayList = (ArrayList) this.f20257e;
        if (z9) {
            for (int i7 = 0; i7 < this.f20254a; i7++) {
                l(i7);
            }
        } else if (this.f20254a > 0) {
            for (int i10 = 0; i10 < this.f20254a; i10++) {
                ((y70) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f20254a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f20255b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z9 = false;
        while (i7 < this.f20255b) {
            ((b80) ((Pair) ((ArrayList) this.f20258f).get(i7)).first).draw(canvas);
            i7++;
            z9 = true;
        }
        for (int i10 = 0; i10 < this.f20254a; i10++) {
            if (!((y70) ((Pair) ((ArrayList) this.f20257e).get(i10)).first).a(canvas) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        return z9;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z9;
        ArrayList arrayList = (ArrayList) this.f20257e;
        ArrayList arrayList2 = (ArrayList) this.f20258f;
        boolean z10 = false;
        for (int i7 = 0; i7 < this.f20255b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((b80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.f20254a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((y70) ((Pair) arrayList.get(i10)).first).a(canvas) && !z10) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                z10 = z9;
            }
        }
        j(obj, false);
        return z10;
    }

    public void j(Object obj, boolean z9) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (!z2Var.f52392c && (view2 = z2Var.f52391b) != null) {
                view2.invalidate();
            }
        } else if (z9 && (view = (View) this.f20256c) != null) {
            view.invalidate();
        }
        c1 c1Var = (c1) this.d;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.f20257e;
        if (i7 >= 0 && i7 < this.f20254a) {
            Pair pair = (Pair) arrayList.get(i7);
            y70 y70Var = (y70) pair.first;
            if (y70Var.f40641p < 0) {
                y70Var.f40641p = Math.max(y70Var.f40640o + y70Var.f40642q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.i3(new u70(this, y70Var, 1), Math.max(0L, (y70Var.f40641p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(y70 y70Var, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20257e;
        if (y70Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f20254a) {
                    if (((Pair) arrayList.get(i7)).first == y70Var) {
                        pair = (Pair) arrayList.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z9) {
                    if (y70Var.f40641p < 0) {
                        y70Var.f40641p = Math.max(y70Var.f40640o + y70Var.f40642q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.i3(new u70(this, y70Var, 0), Math.max(0L, (y70Var.f40641p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                y70Var.c();
                this.f20254a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(b80 b80Var, boolean z9) {
        if (b80Var != null) {
            for (int i7 = 0; i7 < this.f20255b; i7++) {
                if (((Pair) ((ArrayList) this.f20258f).get(i7)).first == b80Var) {
                    o(i7, z9);
                    return;
                }
            }
        }
    }

    public void o(int i7, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20258f;
        if (i7 >= 0 && i7 < this.f20255b && (pair = (Pair) arrayList.get(i7)) != null) {
            b80 b80Var = (b80) pair.first;
            if (z9) {
                if (!b80Var.c()) {
                    if (!b80Var.d()) {
                        b80Var.a();
                    }
                    fq fqVar = new fq(28, this, b80Var);
                    long j3 = 0;
                    if (b80Var.f32168c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - b80Var.f32168c);
                    }
                    org.telegram.messenger.g0.i3(fqVar, j3);
                    return;
                }
                n(b80Var, false);
                return;
            }
            arrayList.remove(pair);
            b80Var.f32167b = -1L;
            b80Var.f32168c = -1L;
            this.f20255b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f20254a = i7;
    }

    public n0(View view) {
        this.f20257e = new ArrayList();
        this.f20254a = 0;
        this.f20258f = new ArrayList();
        this.f20255b = 0;
        this.f20256c = view;
    }

    public n0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.f20256c = uVar;
        this.d = uVar2;
        this.f20254a = i7;
        this.f20255b = i10;
        this.f20257e = nVar;
        this.f20258f = jVar;
    }
}
