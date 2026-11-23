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
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.z2;
public final class p0 {
    public int f21290a;
    public int f21291b;
    public Object f21292c;
    public Object d;
    public Object f21293e;
    public Object f21294f;

    public p0() {
        this.f21293e = new ArrayList();
        this.f21290a = 0;
        this.f21294f = new ArrayList();
        this.f21291b = 0;
    }

    public static boolean a(p0 p0Var) {
        return Objects.equals(((e2.u) p0Var.f21292c).f10759s, "audio/raw");
    }

    public static n80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            e80 e80Var = new e80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            e80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, e80Var);
            n80 n80Var = new n80();
            n80Var.f37730y = e80Var;
            n80Var.D = true;
            n80Var.k(4.0f);
            n80Var.l();
            return n80Var;
        }
        return null;
    }

    public void b(k80 k80Var, Object obj) {
        ((ArrayList) this.f21293e).add(new Pair(k80Var, obj));
        this.f21290a++;
        j(obj, true);
    }

    public void c(n80 n80Var, Object obj) {
        ((ArrayList) this.f21294f).add(new Pair(n80Var, obj));
        this.f21291b++;
        j(obj, true);
    }

    public xi.a d() {
        String str;
        String str2;
        if (this.f21290a == 3) {
            String str3 = (String) this.f21292c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && xi.a.f60733g.matcher(str2).matches()))) {
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
            this.f21292c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = xi.a.b((String) this.f21294f);
                if (b10 == null) {
                    b10 = ((String) this.f21294f).toLowerCase(Locale.US);
                }
                this.f21294f = b10;
            } else {
                this.f21294f = ((String) this.f21294f).toLowerCase(Locale.US);
            }
        }
        return new xi.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f21293e;
        if (z10) {
            for (int i7 = 0; i7 < this.f21290a; i7++) {
                l(i7);
            }
        } else if (this.f21290a > 0) {
            for (int i10 = 0; i10 < this.f21290a; i10++) {
                ((k80) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f21290a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f21291b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z10 = false;
        while (i7 < this.f21291b) {
            ((n80) ((Pair) ((ArrayList) this.f21294f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.f21290a; i10++) {
            if (!((k80) ((Pair) ((ArrayList) this.f21293e).get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f21293e;
        ArrayList arrayList2 = (ArrayList) this.f21294f;
        boolean z11 = false;
        for (int i7 = 0; i7 < this.f21291b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((n80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i10 = 0; i10 < this.f21290a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((k80) ((Pair) arrayList.get(i10)).first).a(canvas) && !z11) {
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
            if (!z2Var.f54491c && (view2 = z2Var.f54490b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f21292c) != null) {
            view.invalidate();
        }
        e1 e1Var = (e1) this.d;
        if (e1Var != null) {
            e1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.f21293e;
        if (i7 >= 0 && i7 < this.f21290a) {
            Pair pair = (Pair) arrayList.get(i7);
            k80 k80Var = (k80) pair.first;
            if (k80Var.f36689p < 0) {
                k80Var.f36689p = Math.max(k80Var.f36688o + k80Var.f36690q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.h3(new g80(this, k80Var, 1), Math.max(0L, (k80Var.f36689p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(k80 k80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21293e;
        if (k80Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f21290a) {
                    if (((Pair) arrayList.get(i7)).first == k80Var) {
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
                    if (k80Var.f36689p < 0) {
                        k80Var.f36689p = Math.max(k80Var.f36688o + k80Var.f36690q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.h3(new g80(this, k80Var, 0), Math.max(0L, (k80Var.f36689p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                k80Var.c();
                this.f21290a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(n80 n80Var, boolean z10) {
        if (n80Var != null) {
            for (int i7 = 0; i7 < this.f21291b; i7++) {
                if (((Pair) ((ArrayList) this.f21294f).get(i7)).first == n80Var) {
                    o(i7, z10);
                    return;
                }
            }
        }
    }

    public void o(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21294f;
        if (i7 >= 0 && i7 < this.f21291b && (pair = (Pair) arrayList.get(i7)) != null) {
            n80 n80Var = (n80) pair.first;
            if (z10) {
                if (!n80Var.c()) {
                    if (!n80Var.d()) {
                        n80Var.a();
                    }
                    bt btVar = new bt(22, this, n80Var);
                    long j3 = 0;
                    if (n80Var.f37711c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - n80Var.f37711c);
                    }
                    org.telegram.messenger.g0.h3(btVar, j3);
                    return;
                }
                n(n80Var, false);
                return;
            }
            arrayList.remove(pair);
            n80Var.f37710b = -1L;
            n80Var.f37711c = -1L;
            this.f21291b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f21290a = i7;
    }

    public p0(View view) {
        this.f21293e = new ArrayList();
        this.f21290a = 0;
        this.f21294f = new ArrayList();
        this.f21291b = 0;
        this.f21292c = view;
    }

    public p0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.f21292c = uVar;
        this.d = uVar2;
        this.f21290a = i7;
        this.f21291b = i10;
        this.f21293e = nVar;
        this.f21294f = jVar;
    }
}
