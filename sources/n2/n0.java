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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.z2;
public final class n0 {
    public int f20251a;
    public int f20252b;
    public Object f20253c;
    public Object d;
    public Object f20254e;
    public Object f20255f;

    public n0() {
        this.f20254e = new ArrayList();
        this.f20251a = 0;
        this.f20255f = new ArrayList();
        this.f20252b = 0;
    }

    public static boolean a(n0 n0Var) {
        return Objects.equals(((e2.u) n0Var.f20253c).f10615s, "audio/raw");
    }

    public static a80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            r70 r70Var = new r70(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            r70Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, r70Var);
            a80 a80Var = new a80();
            a80Var.f31735y = r70Var;
            a80Var.D = true;
            a80Var.k(4.0f);
            a80Var.l();
            return a80Var;
        }
        return null;
    }

    public void b(x70 x70Var, Object obj) {
        ((ArrayList) this.f20254e).add(new Pair(x70Var, obj));
        this.f20251a++;
        j(obj, true);
    }

    public void c(a80 a80Var, Object obj) {
        ((ArrayList) this.f20255f).add(new Pair(a80Var, obj));
        this.f20252b++;
        j(obj, true);
    }

    public ui.a d() {
        String str;
        String str2;
        if (this.f20251a == 3) {
            String str3 = (String) this.f20253c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && ui.a.f56797g.matcher(str2).matches()))) {
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
            this.f20253c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = ui.a.b((String) this.f20255f);
                if (b10 == null) {
                    b10 = ((String) this.f20255f).toLowerCase(Locale.US);
                }
                this.f20255f = b10;
            } else {
                this.f20255f = ((String) this.f20255f).toLowerCase(Locale.US);
            }
        }
        return new ui.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z9) {
        ArrayList arrayList = (ArrayList) this.f20254e;
        if (z9) {
            for (int i7 = 0; i7 < this.f20251a; i7++) {
                l(i7);
            }
        } else if (this.f20251a > 0) {
            for (int i10 = 0; i10 < this.f20251a; i10++) {
                ((x70) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f20251a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f20252b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z9 = false;
        while (i7 < this.f20252b) {
            ((a80) ((Pair) ((ArrayList) this.f20255f).get(i7)).first).draw(canvas);
            i7++;
            z9 = true;
        }
        for (int i10 = 0; i10 < this.f20251a; i10++) {
            if (!((x70) ((Pair) ((ArrayList) this.f20254e).get(i10)).first).a(canvas) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        return z9;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z9;
        ArrayList arrayList = (ArrayList) this.f20254e;
        ArrayList arrayList2 = (ArrayList) this.f20255f;
        boolean z10 = false;
        for (int i7 = 0; i7 < this.f20252b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((a80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.f20251a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((x70) ((Pair) arrayList.get(i10)).first).a(canvas) && !z10) {
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
            if (!z2Var.f52431c && (view2 = z2Var.f52430b) != null) {
                view2.invalidate();
            }
        } else if (z9 && (view = (View) this.f20253c) != null) {
            view.invalidate();
        }
        c1 c1Var = (c1) this.d;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.f20254e;
        if (i7 >= 0 && i7 < this.f20251a) {
            Pair pair = (Pair) arrayList.get(i7);
            x70 x70Var = (x70) pair.first;
            if (x70Var.f40197p < 0) {
                x70Var.f40197p = Math.max(x70Var.f40196o + x70Var.f40198q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.i3(new t70(this, x70Var, 1), Math.max(0L, (x70Var.f40197p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(x70 x70Var, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20254e;
        if (x70Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f20251a) {
                    if (((Pair) arrayList.get(i7)).first == x70Var) {
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
                    if (x70Var.f40197p < 0) {
                        x70Var.f40197p = Math.max(x70Var.f40196o + x70Var.f40198q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.i3(new t70(this, x70Var, 0), Math.max(0L, (x70Var.f40197p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                x70Var.c();
                this.f20251a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(a80 a80Var, boolean z9) {
        if (a80Var != null) {
            for (int i7 = 0; i7 < this.f20252b; i7++) {
                if (((Pair) ((ArrayList) this.f20255f).get(i7)).first == a80Var) {
                    o(i7, z9);
                    return;
                }
            }
        }
    }

    public void o(int i7, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20255f;
        if (i7 >= 0 && i7 < this.f20252b && (pair = (Pair) arrayList.get(i7)) != null) {
            a80 a80Var = (a80) pair.first;
            if (z9) {
                if (!a80Var.c()) {
                    if (!a80Var.d()) {
                        a80Var.a();
                    }
                    fq fqVar = new fq(28, this, a80Var);
                    long j3 = 0;
                    if (a80Var.f31716c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - a80Var.f31716c);
                    }
                    org.telegram.messenger.g0.i3(fqVar, j3);
                    return;
                }
                n(a80Var, false);
                return;
            }
            arrayList.remove(pair);
            a80Var.f31715b = -1L;
            a80Var.f31716c = -1L;
            this.f20252b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f20251a = i7;
    }

    public n0(View view) {
        this.f20254e = new ArrayList();
        this.f20251a = 0;
        this.f20255f = new ArrayList();
        this.f20252b = 0;
        this.f20253c = view;
    }

    public n0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.f20253c = uVar;
        this.d = uVar2;
        this.f20251a = i7;
        this.f20252b = i10;
        this.f20254e = nVar;
        this.f20255f = jVar;
    }
}
