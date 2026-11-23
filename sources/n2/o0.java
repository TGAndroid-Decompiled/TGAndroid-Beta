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
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.q80;
import org.telegram.ui.z2;
public final class o0 {
    public int f21221a;
    public int f21222b;
    public Object f21223c;
    public Object d;
    public Object f21224e;
    public Object f21225f;

    public o0() {
        this.f21224e = new ArrayList();
        this.f21221a = 0;
        this.f21225f = new ArrayList();
        this.f21222b = 0;
    }

    public static boolean a(o0 o0Var) {
        return Objects.equals(((e2.u) o0Var.f21223c).f10798s, "audio/raw");
    }

    public static q80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            h80 h80Var = new h80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            h80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, h80Var);
            q80 q80Var = new q80();
            q80Var.f38833y = h80Var;
            q80Var.D = true;
            q80Var.k(4.0f);
            q80Var.l();
            return q80Var;
        }
        return null;
    }

    public void b(n80 n80Var, Object obj) {
        ((ArrayList) this.f21224e).add(new Pair(n80Var, obj));
        this.f21221a++;
        j(obj, true);
    }

    public void c(q80 q80Var, Object obj) {
        ((ArrayList) this.f21225f).add(new Pair(q80Var, obj));
        this.f21222b++;
        j(obj, true);
    }

    public xi.a d() {
        String str;
        String str2;
        if (this.f21221a == 3) {
            String str3 = (String) this.f21223c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && xi.a.f60650g.matcher(str2).matches()))) {
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
            this.f21223c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = xi.a.b((String) this.f21225f);
                if (b10 == null) {
                    b10 = ((String) this.f21225f).toLowerCase(Locale.US);
                }
                this.f21225f = b10;
            } else {
                this.f21225f = ((String) this.f21225f).toLowerCase(Locale.US);
            }
        }
        return new xi.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f21224e;
        if (z10) {
            for (int i7 = 0; i7 < this.f21221a; i7++) {
                l(i7);
            }
        } else if (this.f21221a > 0) {
            for (int i10 = 0; i10 < this.f21221a; i10++) {
                ((n80) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f21221a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f21222b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z10 = false;
        while (i7 < this.f21222b) {
            ((q80) ((Pair) ((ArrayList) this.f21225f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.f21221a; i10++) {
            if (!((n80) ((Pair) ((ArrayList) this.f21224e).get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f21224e;
        ArrayList arrayList2 = (ArrayList) this.f21225f;
        boolean z11 = false;
        for (int i7 = 0; i7 < this.f21222b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((q80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i10 = 0; i10 < this.f21221a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((n80) ((Pair) arrayList.get(i10)).first).a(canvas) && !z11) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z11 = z10;
            }
        }
        j(obj, false);
        return z11;
    }

    public void j(Object obj, boolean z10) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (!z2Var.f54373c && (view2 = z2Var.f54372b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f21223c) != null) {
            view.invalidate();
        }
        e1 e1Var = (e1) this.d;
        if (e1Var != null) {
            e1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.f21224e;
        if (i7 >= 0 && i7 < this.f21221a) {
            Pair pair = (Pair) arrayList.get(i7);
            n80 n80Var = (n80) pair.first;
            if (n80Var.f37845p < 0) {
                n80Var.f37845p = Math.max(n80Var.f37844o + n80Var.f37846q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.h3(new j80(this, n80Var, 1), Math.max(0L, (n80Var.f37845p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(n80 n80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21224e;
        if (n80Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f21221a) {
                    if (((Pair) arrayList.get(i7)).first == n80Var) {
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
                if (z10) {
                    if (n80Var.f37845p < 0) {
                        n80Var.f37845p = Math.max(n80Var.f37844o + n80Var.f37846q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.h3(new j80(this, n80Var, 0), Math.max(0L, (n80Var.f37845p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                n80Var.c();
                this.f21221a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(q80 q80Var, boolean z10) {
        if (q80Var != null) {
            for (int i7 = 0; i7 < this.f21222b; i7++) {
                if (((Pair) ((ArrayList) this.f21225f).get(i7)).first == q80Var) {
                    o(i7, z10);
                    return;
                }
            }
        }
    }

    public void o(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21225f;
        if (i7 >= 0 && i7 < this.f21222b && (pair = (Pair) arrayList.get(i7)) != null) {
            q80 q80Var = (q80) pair.first;
            if (z10) {
                if (!q80Var.c()) {
                    if (!q80Var.d()) {
                        q80Var.a();
                    }
                    ou ouVar = new ou(20, this, q80Var);
                    long j3 = 0;
                    if (q80Var.f38814c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - q80Var.f38814c);
                    }
                    org.telegram.messenger.g0.h3(ouVar, j3);
                    return;
                }
                n(q80Var, false);
                return;
            }
            arrayList.remove(pair);
            q80Var.f38813b = -1L;
            q80Var.f38814c = -1L;
            this.f21222b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f21221a = i7;
    }

    public o0(View view) {
        this.f21224e = new ArrayList();
        this.f21221a = 0;
        this.f21225f = new ArrayList();
        this.f21222b = 0;
        this.f21223c = view;
    }

    public o0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.f21223c = uVar;
        this.d = uVar2;
        this.f21221a = i7;
        this.f21222b = i10;
        this.f21224e = nVar;
        this.f21225f = jVar;
    }
}
