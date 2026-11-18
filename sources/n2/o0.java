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
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.z2;
public final class o0 {
    public int f21190a;
    public int f21191b;
    public Object f21192c;
    public Object d;
    public Object f21193e;
    public Object f21194f;

    public o0() {
        this.f21193e = new ArrayList();
        this.f21190a = 0;
        this.f21194f = new ArrayList();
        this.f21191b = 0;
    }

    public static boolean a(o0 o0Var) {
        return Objects.equals(((e2.u) o0Var.f21192c).f10766s, "audio/raw");
    }

    public static o80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            f80 f80Var = new f80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            f80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, f80Var);
            o80 o80Var = new o80();
            o80Var.f38033y = f80Var;
            o80Var.D = true;
            o80Var.k(4.0f);
            o80Var.l();
            return o80Var;
        }
        return null;
    }

    public void b(l80 l80Var, Object obj) {
        ((ArrayList) this.f21193e).add(new Pair(l80Var, obj));
        this.f21190a++;
        j(obj, true);
    }

    public void c(o80 o80Var, Object obj) {
        ((ArrayList) this.f21194f).add(new Pair(o80Var, obj));
        this.f21191b++;
        j(obj, true);
    }

    public xi.a d() {
        String str;
        String str2;
        if (this.f21190a == 3) {
            String str3 = (String) this.f21192c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && xi.a.f60605g.matcher(str2).matches()))) {
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
            this.f21192c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = xi.a.b((String) this.f21194f);
                if (b10 == null) {
                    b10 = ((String) this.f21194f).toLowerCase(Locale.US);
                }
                this.f21194f = b10;
            } else {
                this.f21194f = ((String) this.f21194f).toLowerCase(Locale.US);
            }
        }
        return new xi.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f21193e;
        if (z10) {
            for (int i7 = 0; i7 < this.f21190a; i7++) {
                l(i7);
            }
        } else if (this.f21190a > 0) {
            for (int i10 = 0; i10 < this.f21190a; i10++) {
                ((l80) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.f21190a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.f21191b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z10 = false;
        while (i7 < this.f21191b) {
            ((o80) ((Pair) ((ArrayList) this.f21194f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.f21190a; i10++) {
            if (!((l80) ((Pair) ((ArrayList) this.f21193e).get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f21193e;
        ArrayList arrayList2 = (ArrayList) this.f21194f;
        boolean z11 = false;
        for (int i7 = 0; i7 < this.f21191b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((o80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i10 = 0; i10 < this.f21190a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                if (!((l80) ((Pair) arrayList.get(i10)).first).a(canvas) && !z11) {
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
            if (!z2Var.f54327c && (view2 = z2Var.f54326b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f21192c) != null) {
            view.invalidate();
        }
        e1 e1Var = (e1) this.d;
        if (e1Var != null) {
            e1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.f21193e;
        if (i7 >= 0 && i7 < this.f21190a) {
            Pair pair = (Pair) arrayList.get(i7);
            l80 l80Var = (l80) pair.first;
            if (l80Var.f37081p < 0) {
                l80Var.f37081p = Math.max(l80Var.f37080o + l80Var.f37082q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                org.telegram.messenger.g0.h3(new h80(this, l80Var, 1), Math.max(0L, (l80Var.f37081p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(l80 l80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21193e;
        if (l80Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f21190a) {
                    if (((Pair) arrayList.get(i7)).first == l80Var) {
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
                    if (l80Var.f37081p < 0) {
                        l80Var.f37081p = Math.max(l80Var.f37080o + l80Var.f37082q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        org.telegram.messenger.g0.h3(new h80(this, l80Var, 0), Math.max(0L, (l80Var.f37081p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                l80Var.c();
                this.f21190a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(o80 o80Var, boolean z10) {
        if (o80Var != null) {
            for (int i7 = 0; i7 < this.f21191b; i7++) {
                if (((Pair) ((ArrayList) this.f21194f).get(i7)).first == o80Var) {
                    o(i7, z10);
                    return;
                }
            }
        }
    }

    public void o(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f21194f;
        if (i7 >= 0 && i7 < this.f21191b && (pair = (Pair) arrayList.get(i7)) != null) {
            o80 o80Var = (o80) pair.first;
            if (z10) {
                if (!o80Var.c()) {
                    if (!o80Var.d()) {
                        o80Var.a();
                    }
                    dw dwVar = new dw(18, this, o80Var);
                    long j3 = 0;
                    if (o80Var.f38014c > 0) {
                        j3 = 320 - (SystemClock.elapsedRealtime() - o80Var.f38014c);
                    }
                    org.telegram.messenger.g0.h3(dwVar, j3);
                    return;
                }
                n(o80Var, false);
                return;
            }
            arrayList.remove(pair);
            o80Var.f38013b = -1L;
            o80Var.f38014c = -1L;
            this.f21191b = arrayList.size();
            j(pair.second, true);
        }
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.f21190a = i7;
    }

    public o0(View view) {
        this.f21193e = new ArrayList();
        this.f21190a = 0;
        this.f21194f = new ArrayList();
        this.f21191b = 0;
        this.f21192c = view;
    }

    public o0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.f21192c = uVar;
        this.d = uVar2;
        this.f21190a = i7;
        this.f21191b = i10;
        this.f21193e = nVar;
        this.f21194f = jVar;
    }
}
