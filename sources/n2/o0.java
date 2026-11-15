package n2;

import android.graphics.Canvas;
import android.graphics.Matrix;
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
import org.telegram.ui.Cells.d1;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.w70;
import org.telegram.ui.z2;
public final class o0 {
    public int f20829a;
    public int f20830b;
    public Object f20831c;
    public Object d;
    public Object f20832e;
    public Object f20833f;

    public o0() {
        this.f20832e = new ArrayList();
        this.f20829a = 0;
        this.f20833f = new ArrayList();
        this.f20830b = 0;
    }

    public static boolean a(o0 o0Var) {
        return Objects.equals(((e2.u) o0Var.f20831c).f10451s, "audio/raw");
    }

    public static d80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            u70 u70Var = new u70(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            u70Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, u70Var);
            d80 d80Var = new d80();
            d80Var.f33885y = u70Var;
            d80Var.D = true;
            d80Var.k(4.0f);
            d80Var.l();
            return d80Var;
        }
        return null;
    }

    public void b(a80 a80Var, Object obj) {
        ((ArrayList) this.f20832e).add(new Pair(a80Var, obj));
        this.f20829a++;
        j(obj, true);
    }

    public void c(d80 d80Var, Object obj) {
        ((ArrayList) this.f20833f).add(new Pair(d80Var, obj));
        this.f20830b++;
        j(obj, true);
    }

    public xi.a d() {
        String str;
        String str2;
        if (this.f20829a == 3) {
            String str3 = (String) this.f20831c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && xi.a.f60039g.matcher(str2).matches()))) {
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
            this.f20831c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = xi.a.b((String) this.f20833f);
                if (b10 == null) {
                    b10 = ((String) this.f20833f).toLowerCase(Locale.US);
                }
                this.f20833f = b10;
            } else {
                this.f20833f = ((String) this.f20833f).toLowerCase(Locale.US);
            }
        }
        return new xi.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f20832e;
        if (z10) {
            for (int i7 = 0; i7 < this.f20829a; i7++) {
                m(i7);
            }
        } else if (this.f20829a > 0) {
            for (int i10 = 0; i10 < this.f20829a; i10++) {
                ((a80) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f20829a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f20830b; i7++) {
            p(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z10 = false;
        while (i7 < this.f20830b) {
            ((d80) ((Pair) ((ArrayList) this.f20833f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.f20829a; i10++) {
            if (!((a80) ((Pair) ((ArrayList) this.f20832e).get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f20832e;
        ArrayList arrayList2 = (ArrayList) this.f20833f;
        boolean z11 = false;
        for (int i7 = 0; i7 < this.f20830b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((d80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i10 = 0; i10 < this.f20829a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((a80) ((Pair) arrayList.get(i10)).first).a(canvas) && !z11) {
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
            if (!z2Var.f53807c && (view2 = z2Var.f53806b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f20831c) != null) {
            view.invalidate();
        }
        d1 d1Var = (d1) this.d;
        if (d1Var != null) {
            d1Var.run();
        }
    }

    public void l() {
        ((Canvas) this.f20831c).restore();
        ((Matrix) this.d).set((Matrix) r.b.g(1, (ArrayList) this.f20832e));
        this.f20829a--;
    }

    public void m(int i7) {
        ArrayList arrayList = (ArrayList) this.f20832e;
        if (i7 >= 0 && i7 < this.f20829a) {
            Pair pair = (Pair) arrayList.get(i7);
            a80 a80Var = (a80) pair.first;
            if (a80Var.f32929p < 0) {
                a80Var.f32929p = Math.max(a80Var.f32928o + a80Var.f32930q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.i3(new w70(this, a80Var, 1), Math.max(0L, (a80Var.f32929p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void n(a80 a80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20832e;
        if (a80Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f20829a) {
                    if (((Pair) arrayList.get(i7)).first == a80Var) {
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
                    if (a80Var.f32929p < 0) {
                        a80Var.f32929p = Math.max(a80Var.f32928o + a80Var.f32930q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.i3(new w70(this, a80Var, 0), Math.max(0L, (a80Var.f32929p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                a80Var.c();
                this.f20829a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void o(d80 d80Var, boolean z10) {
        if (d80Var != null) {
            for (int i7 = 0; i7 < this.f20830b; i7++) {
                if (((Pair) ((ArrayList) this.f20833f).get(i7)).first == d80Var) {
                    p(i7, z10);
                    return;
                }
            }
        }
    }

    public void p(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f20833f;
        if (i7 >= 0 && i7 < this.f20830b && (pair = (Pair) arrayList.get(i7)) != null) {
            d80 d80Var = (d80) pair.first;
            if (z10) {
                if (!d80Var.c()) {
                    if (!d80Var.d()) {
                        d80Var.a();
                    }
                    vs vsVar = new vs(22, this, d80Var);
                    long j3 = 0;
                    if (d80Var.f33866c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - d80Var.f33866c);
                    }
                    org.telegram.messenger.g0.i3(vsVar, j3);
                    return;
                }
                o(d80Var, false);
                return;
            }
            arrayList.remove(pair);
            d80Var.f33865b = -1L;
            d80Var.f33866c = -1L;
            this.f20830b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void q(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f20829a = i7;
    }

    public o0(View view) {
        this.f20832e = new ArrayList();
        this.f20829a = 0;
        this.f20833f = new ArrayList();
        this.f20830b = 0;
        this.f20831c = view;
    }

    public o0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.i iVar) {
        this.f20831c = uVar;
        this.d = uVar2;
        this.f20829a = i7;
        this.f20830b = i10;
        this.f20832e = nVar;
        this.f20833f = iVar;
    }
}
