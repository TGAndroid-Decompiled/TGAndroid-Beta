package m2;

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
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.a3;
public final class p0 {
    public int f18959a;
    public int f18960b;
    public Object f18961c;
    public Object d;
    public Object f18962e;
    public Object f18963f;

    public p0() {
        this.f18962e = new ArrayList();
        this.f18959a = 0;
        this.f18963f = new ArrayList();
        this.f18960b = 0;
    }

    public static boolean a(p0 p0Var) {
        return Objects.equals(((d2.v) p0Var.f18961c).f8489s, "audio/raw");
    }

    public static w70 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            n70 n70Var = new n70(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            n70Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, n70Var);
            w70 w70Var = new w70();
            w70Var.f39945y = n70Var;
            w70Var.D = true;
            w70Var.k(4.0f);
            w70Var.l();
            return w70Var;
        }
        return null;
    }

    public void b(t70 t70Var, Object obj) {
        ((ArrayList) this.f18962e).add(new Pair(t70Var, obj));
        this.f18959a++;
        j(obj, true);
    }

    public void c(w70 w70Var, Object obj) {
        ((ArrayList) this.f18963f).add(new Pair(w70Var, obj));
        this.f18960b++;
        j(obj, true);
    }

    public ui.a d() {
        String str;
        String str2;
        if (this.f18959a == 3) {
            String str3 = (String) this.f18961c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && ui.a.f56369g.matcher(str2).matches()))) {
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
            this.f18961c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = ui.a.b((String) this.f18963f);
                if (b10 == null) {
                    b10 = ((String) this.f18963f).toLowerCase(Locale.US);
                }
                this.f18963f = b10;
            } else {
                this.f18963f = ((String) this.f18963f).toLowerCase(Locale.US);
            }
        }
        return new ui.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f18962e;
        if (z10) {
            for (int i3 = 0; i3 < this.f18959a; i3++) {
                l(i3);
            }
        } else if (this.f18959a > 0) {
            for (int i10 = 0; i10 < this.f18959a; i10++) {
                ((t70) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f18959a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i3 = 0; i3 < this.f18960b; i3++) {
            o(i3, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i3 = 0;
        boolean z10 = false;
        while (i3 < this.f18960b) {
            ((w70) ((Pair) ((ArrayList) this.f18963f).get(i3)).first).draw(canvas);
            i3++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.f18959a; i10++) {
            if (!((t70) ((Pair) ((ArrayList) this.f18962e).get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f18962e;
        ArrayList arrayList2 = (ArrayList) this.f18963f;
        boolean z11 = false;
        for (int i3 = 0; i3 < this.f18960b; i3++) {
            if (((Pair) arrayList2.get(i3)).second == obj) {
                ((w70) ((Pair) arrayList2.get(i3)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i10 = 0; i10 < this.f18959a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((t70) ((Pair) arrayList.get(i10)).first).a(canvas) && !z11) {
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
        } else if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            if (!a3Var.f43574c && (view2 = a3Var.f43573b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f18961c) != null) {
            view.invalidate();
        }
        c1 c1Var = (c1) this.d;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public void l(int i3) {
        ArrayList arrayList = (ArrayList) this.f18962e;
        if (i3 >= 0 && i3 < this.f18959a) {
            Pair pair = (Pair) arrayList.get(i3);
            t70 t70Var = (t70) pair.first;
            if (t70Var.f38335p < 0) {
                t70Var.f38335p = Math.max(t70Var.f38334o + t70Var.f38336q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.i3(new p70(this, t70Var, 1), Math.max(0L, (t70Var.f38335p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(t70 t70Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f18962e;
        if (t70Var != null) {
            int i3 = 0;
            while (true) {
                if (i3 < this.f18959a) {
                    if (((Pair) arrayList.get(i3)).first == t70Var) {
                        pair = (Pair) arrayList.get(i3);
                        break;
                    }
                    i3++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z10) {
                    if (t70Var.f38335p < 0) {
                        t70Var.f38335p = Math.max(t70Var.f38334o + t70Var.f38336q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.i3(new p70(this, t70Var, 0), Math.max(0L, (t70Var.f38335p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                t70Var.c();
                this.f18959a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(w70 w70Var, boolean z10) {
        if (w70Var != null) {
            for (int i3 = 0; i3 < this.f18960b; i3++) {
                if (((Pair) ((ArrayList) this.f18963f).get(i3)).first == w70Var) {
                    o(i3, z10);
                    return;
                }
            }
        }
    }

    public void o(int i3, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f18963f;
        if (i3 >= 0 && i3 < this.f18960b && (pair = (Pair) arrayList.get(i3)) != null) {
            w70 w70Var = (w70) pair.first;
            if (z10) {
                if (!w70Var.c()) {
                    if (!w70Var.d()) {
                        w70Var.a();
                    }
                    j50 j50Var = new j50(3, this, w70Var);
                    long j10 = 0;
                    if (w70Var.f39926c > 0) {
                        j10 = 320 - (SystemClock.elapsedRealtime() - w70Var.f39926c);
                    }
                    org.telegram.messenger.g0.i3(j50Var, j10);
                    return;
                }
                n(w70Var, false);
                return;
            }
            arrayList.remove(pair);
            w70Var.f39925b = -1L;
            w70Var.f39926c = -1L;
            this.f18960b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        this.f18959a = i3;
    }

    public p0(View view) {
        this.f18962e = new ArrayList();
        this.f18959a = 0;
        this.f18963f = new ArrayList();
        this.f18960b = 0;
        this.f18961c = view;
    }

    public p0(d2.v vVar, d2.v vVar2, int i3, int i10, n nVar, e2.i iVar) {
        this.f18961c = vVar;
        this.d = vVar2;
        this.f18959a = i3;
        this.f18960b = i10;
        this.f18962e = nVar;
        this.f18963f = iVar;
    }
}
