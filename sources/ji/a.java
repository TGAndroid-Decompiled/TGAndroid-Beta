package ji;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import b2.x;
import j$.util.Objects;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Locale;
import k2.o;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.z2;
public final class a {
    public int f10422a;
    public int f10423b;
    public Object f10424c;
    public Object d;
    public Object e;
    public Object f10425f;

    public a() {
        this.e = new ArrayList();
        this.f10422a = 0;
        this.f10425f = new ArrayList();
        this.f10423b = 0;
    }

    public static boolean a(a aVar) {
        return Objects.equals(((x) aVar.f10424c).f2423s, "audio/raw");
    }

    public static t80 k(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            k80 k80Var = new k80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            k80Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, k80Var);
            t80 t80Var = new t80();
            t80Var.f30593y = k80Var;
            t80Var.D = true;
            t80Var.k(4.0f);
            t80Var.l();
            return t80Var;
        }
        return null;
    }

    public void b(q80 q80Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(q80Var, obj));
        this.f10422a++;
        j(obj, true);
    }

    public void c(t80 t80Var, Object obj) {
        ((ArrayList) this.f10425f).add(new Pair(t80Var, obj));
        this.f10423b++;
        j(obj, true);
    }

    public b d() {
        String str;
        String str2;
        if (this.f10422a == 3) {
            String str3 = (String) this.f10424c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && b.f10426g.matcher(str2).matches()))) {
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
            this.f10424c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = b.b((String) this.f10425f);
                if (b10 == null) {
                    b10 = ((String) this.f10425f).toLowerCase(Locale.US);
                }
                this.f10425f = b10;
            } else {
                this.f10425f = ((String) this.f10425f).toLowerCase(Locale.US);
            }
        }
        return new b(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z10) {
            for (int i10 = 0; i10 < this.f10422a; i10++) {
                l(i10);
            }
        } else if (this.f10422a > 0) {
            for (int i11 = 0; i11 < this.f10422a; i11++) {
                ((q80) ((Pair) arrayList.get(i11)).first).c();
                j(((Pair) arrayList.get(i11)).second, false);
            }
            arrayList.clear();
            this.f10422a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i10 = 0; i10 < this.f10423b; i10++) {
            o(i10, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f10423b) {
            ((t80) ((Pair) ((ArrayList) this.f10425f).get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.f10422a; i11++) {
            if (!((q80) ((Pair) ((ArrayList) this.e).get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f10425f;
        boolean z11 = false;
        for (int i10 = 0; i10 < this.f10423b; i10++) {
            if (((Pair) arrayList2.get(i10)).second == obj) {
                ((t80) ((Pair) arrayList2.get(i10)).first).draw(canvas);
                z11 = true;
            }
        }
        for (int i11 = 0; i11 < this.f10422a; i11++) {
            if (((Pair) arrayList.get(i11)).second == obj) {
                if (!((q80) ((Pair) arrayList.get(i11)).first).a(canvas) && !z11) {
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
            if (!z2Var.f43789c && (view2 = z2Var.f43788b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.f10424c) != null) {
            view.invalidate();
        }
        b1 b1Var = (b1) this.d;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public void l(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i10 >= 0 && i10 < this.f10422a) {
            Pair pair = (Pair) arrayList.get(i10);
            q80 q80Var = (q80) pair.first;
            if (q80Var.f29678p < 0) {
                q80Var.f29678p = Math.max(q80Var.f29677o + q80Var.f29679q, SystemClock.elapsedRealtime());
                j(pair.second, true);
                i0.h3(new m80(this, q80Var, 1), Math.max(0L, (q80Var.f29678p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public void m(q80 q80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (q80Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f10422a) {
                    if (((Pair) arrayList.get(i10)).first == q80Var) {
                        pair = (Pair) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z10) {
                    if (q80Var.f29678p < 0) {
                        q80Var.f29678p = Math.max(q80Var.f29677o + q80Var.f29679q, SystemClock.elapsedRealtime());
                        j(pair.second, true);
                        i0.h3(new m80(this, q80Var, 0), Math.max(0L, (q80Var.f29678p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                q80Var.c();
                this.f10422a = arrayList.size();
                j(pair.second, true);
            }
        }
    }

    public void n(t80 t80Var, boolean z10) {
        if (t80Var != null) {
            for (int i10 = 0; i10 < this.f10423b; i10++) {
                if (((Pair) ((ArrayList) this.f10425f).get(i10)).first == t80Var) {
                    o(i10, z10);
                    return;
                }
            }
        }
    }

    public void o(int i10, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f10425f;
        if (i10 >= 0 && i10 < this.f10423b && (pair = (Pair) arrayList.get(i10)) != null) {
            t80 t80Var = (t80) pair.first;
            if (z10) {
                if (!t80Var.c()) {
                    if (!t80Var.d()) {
                        t80Var.a();
                    }
                    at atVar = new at(22, this, t80Var);
                    long j10 = 0;
                    if (t80Var.f30575c > 0) {
                        j10 = 320 - (SystemClock.elapsedRealtime() - t80Var.f30575c);
                    }
                    i0.h3(atVar, j10);
                    return;
                }
                n(t80Var, false);
                return;
            }
            arrayList.remove(pair);
            t80Var.f30574b = -1L;
            t80Var.f30575c = -1L;
            this.f10423b = arrayList.size();
            j(pair.second, true);
        }
    }

    public a(View view) {
        this.e = new ArrayList();
        this.f10422a = 0;
        this.f10425f = new ArrayList();
        this.f10423b = 0;
        this.f10424c = view;
    }

    public a(x xVar, x xVar2, int i10, int i11, o oVar, c2.i iVar) {
        this.f10424c = xVar;
        this.d = xVar2;
        this.f10422a = i10;
        this.f10423b = i11;
        this.e = oVar;
        this.f10425f = iVar;
    }
}
