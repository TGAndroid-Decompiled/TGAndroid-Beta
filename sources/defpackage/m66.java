package defpackage;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import java.io.Serializable;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Locale;
public final class m66 {
    public Object c;
    public Object d;
    public Serializable e = new ArrayList();
    public int a = 0;
    public Serializable f = new ArrayList();
    public int b = 0;

    public m66(View view) {
        this.c = view;
    }

    public static va6 j(Layout layout, CharacterStyle characterStyle, float f) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            f66 f66Var = new f66(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            f66Var.d(layout, spanStart, f);
            layout.getSelectionPath(spanStart, spanEnd, f66Var);
            va6 va6Var = new va6();
            va6Var.y = f66Var;
            va6Var.D = true;
            va6Var.j(4.0f);
            va6Var.k();
            return va6Var;
        }
        return null;
    }

    public final void a(q66 q66Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(q66Var, obj));
        this.a++;
        i(obj, true);
    }

    public final void b(va6 va6Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(va6Var, obj));
        this.b++;
        i(obj, true);
    }

    public final jx8 c() {
        String str;
        String str2;
        if (this.a == 3) {
            String str3 = (String) this.c;
            boolean z = true;
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            } else {
                int indexOf = str3.indexOf(47);
                if (indexOf >= 0) {
                    str2 = str3.substring(0, indexOf);
                    str = str3.substring(indexOf + 1);
                } else {
                    str = null;
                    str2 = str3;
                }
                if (!TextUtils.isEmpty(str2) && str2.indexOf(58) < 0 && str2.indexOf(63) < 0 && str2.indexOf(35) < 0 && (str == null || (str.length() <= 128 && jx8.g.matcher(str).matches()))) {
                    try {
                        String lowerCase = IDN.toASCII(str2, 3).toLowerCase(Locale.US);
                        if (str == null) {
                            str3 = lowerCase;
                        } else {
                            str3 = lowerCase + '/' + str;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            this.c = str3;
            if (str3 == null || str3.indexOf(47) < 0) {
                z = false;
            }
            String str4 = (String) this.f;
            if (z) {
                String b = jx8.b(str4);
                if (b == null) {
                    b = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b;
            } else {
                this.f = str4.toLowerCase(Locale.US);
            }
        }
        return new jx8(this);
    }

    public final void d() {
        e(true);
    }

    public final void e(boolean z) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z) {
            for (int i = 0; i < this.a; i++) {
                k(i);
            }
        } else if (this.a > 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                ((q66) ((Pair) arrayList.get(i2)).first).c();
                i(((Pair) arrayList.get(i2)).second, false);
            }
            arrayList.clear();
            this.a = 0;
            i(null, true);
        }
    }

    public final void f() {
        for (int i = 0; i < this.b; i++) {
            n(i, true);
        }
    }

    public final boolean g(Canvas canvas) {
        int i = 0;
        boolean z = false;
        while (i < this.b) {
            ((va6) ((Pair) ((ArrayList) this.f).get(i)).first).draw(canvas);
            i++;
            z = true;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            if (!((q66) ((Pair) ((ArrayList) this.e).get(i2)).first).a(canvas) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public final boolean h(Canvas canvas, Object obj) {
        boolean z;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z2 = false;
        for (int i = 0; i < this.b; i++) {
            if (((Pair) arrayList2.get(i)).second == obj) {
                ((va6) ((Pair) arrayList2.get(i)).first).draw(canvas);
                z2 = true;
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            if (((Pair) arrayList.get(i2)).second == obj) {
                if (!((q66) ((Pair) arrayList.get(i2)).first).a(canvas) && !z2) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = z;
            }
        }
        i(obj, false);
        return z2;
    }

    public final void i(Object obj, boolean z) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof cw) {
            cw cwVar = (cw) obj;
            if (!cwVar.c && (view2 = cwVar.b) != null) {
                view2.invalidate();
            }
        } else if (z && (view = (View) this.c) != null) {
            view.invalidate();
        }
        ib2 ib2Var = (ib2) this.d;
        if (ib2Var != null) {
            ib2Var.run();
        }
    }

    public final void k(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i >= 0 && i < this.a) {
            Pair pair = (Pair) arrayList.get(i);
            q66 q66Var = (q66) pair.first;
            if (q66Var.p < 0) {
                q66Var.p = Math.max(q66Var.o + q66Var.q, SystemClock.elapsedRealtime());
                i(pair.second, true);
                hl.d3(new l66(this, q66Var, (byte) 1), Math.max(0L, (q66Var.p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void l(q66 q66Var, boolean z) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (q66Var != null) {
            int i = 0;
            while (true) {
                if (i < this.a) {
                    if (((Pair) arrayList.get(i)).first == q66Var) {
                        pair = (Pair) arrayList.get(i);
                        break;
                    }
                    i++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z) {
                    if (q66Var.p < 0) {
                        q66Var.p = Math.max(q66Var.o + q66Var.q, SystemClock.elapsedRealtime());
                        i(pair.second, true);
                        hl.d3(new l66(this, q66Var, (byte) 0), Math.max(0L, (q66Var.p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                q66Var.c();
                this.a = arrayList.size();
                i(pair.second, true);
            }
        }
    }

    public final void m(va6 va6Var, boolean z) {
        if (va6Var != null) {
            for (int i = 0; i < this.b; i++) {
                if (((Pair) ((ArrayList) this.f).get(i)).first == va6Var) {
                    n(i, z);
                    return;
                }
            }
        }
    }

    public final void n(int i, boolean z) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i >= 0 && i < this.b && (pair = (Pair) arrayList.get(i)) != null) {
            va6 va6Var = (va6) pair.first;
            if (z) {
                if (!va6Var.c()) {
                    if (!va6Var.d()) {
                        va6Var.a();
                    }
                    z56 z56Var = new z56(this, va6Var, (byte) 3);
                    long j = 0;
                    if (va6Var.c > 0) {
                        j = 320 - (SystemClock.elapsedRealtime() - va6Var.c);
                    }
                    hl.d3(z56Var, j);
                    return;
                }
                m(va6Var, false);
                return;
            }
            arrayList.remove(pair);
            va6Var.b = -1L;
            va6Var.c = -1L;
            this.b = arrayList.size();
            i(pair.second, true);
        }
    }

    public final void o(int i) {
        if (i == 0) {
            i = 1;
        }
        this.a = i;
    }

    public m66() {
    }
}
