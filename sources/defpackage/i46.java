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
public final class i46 {
    public Object c;
    public Object d;
    public Serializable e = new ArrayList();
    public int a = 0;
    public Serializable f = new ArrayList();
    public int b = 0;

    public i46(View view) {
        this.c = view;
    }

    public static r86 j(Layout layout, CharacterStyle characterStyle, float f) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            b46 b46Var = new b46(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            b46Var.d(layout, spanStart, f);
            layout.getSelectionPath(spanStart, spanEnd, b46Var);
            r86 r86Var = new r86();
            r86Var.y = b46Var;
            r86Var.D = true;
            r86Var.j(4.0f);
            r86Var.k();
            return r86Var;
        }
        return null;
    }

    public final void a(m46 m46Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(m46Var, obj));
        this.a++;
        i(obj, true);
    }

    public final void b(r86 r86Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(r86Var, obj));
        this.b++;
        i(obj, true);
    }

    public final au8 c() {
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
                if (!TextUtils.isEmpty(str2) && str2.indexOf(58) < 0 && str2.indexOf(63) < 0 && str2.indexOf(35) < 0 && (str == null || (str.length() <= 128 && au8.g.matcher(str).matches()))) {
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
                String b = au8.b(str4);
                if (b == null) {
                    b = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b;
            } else {
                this.f = str4.toLowerCase(Locale.US);
            }
        }
        return new au8(this);
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
                ((m46) ((Pair) arrayList.get(i2)).first).c();
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
            ((r86) ((Pair) ((ArrayList) this.f).get(i)).first).draw(canvas);
            i++;
            z = true;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            if (!((m46) ((Pair) ((ArrayList) this.e).get(i2)).first).a(canvas) && !z) {
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
                ((r86) ((Pair) arrayList2.get(i)).first).draw(canvas);
                z2 = true;
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            if (((Pair) arrayList.get(i2)).second == obj) {
                if (!((m46) ((Pair) arrayList.get(i2)).first).a(canvas) && !z2) {
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
        } else if (obj instanceof bw) {
            bw bwVar = (bw) obj;
            if (!bwVar.c && (view2 = bwVar.b) != null) {
                view2.invalidate();
            }
        } else if (z && (view = (View) this.c) != null) {
            view.invalidate();
        }
        sa2 sa2Var = (sa2) this.d;
        if (sa2Var != null) {
            sa2Var.run();
        }
    }

    public final void k(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i >= 0 && i < this.a) {
            Pair pair = (Pair) arrayList.get(i);
            m46 m46Var = (m46) pair.first;
            if (m46Var.p < 0) {
                m46Var.p = Math.max(m46Var.o + m46Var.q, SystemClock.elapsedRealtime());
                i(pair.second, true);
                gl.e3(new h46(this, m46Var, (byte) 1), Math.max(0L, (m46Var.p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void l(m46 m46Var, boolean z) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (m46Var != null) {
            int i = 0;
            while (true) {
                if (i < this.a) {
                    if (((Pair) arrayList.get(i)).first == m46Var) {
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
                    if (m46Var.p < 0) {
                        m46Var.p = Math.max(m46Var.o + m46Var.q, SystemClock.elapsedRealtime());
                        i(pair.second, true);
                        gl.e3(new h46(this, m46Var, (byte) 0), Math.max(0L, (m46Var.p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                m46Var.c();
                this.a = arrayList.size();
                i(pair.second, true);
            }
        }
    }

    public final void m(r86 r86Var, boolean z) {
        if (r86Var != null) {
            for (int i = 0; i < this.b; i++) {
                if (((Pair) ((ArrayList) this.f).get(i)).first == r86Var) {
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
            r86 r86Var = (r86) pair.first;
            if (z) {
                if (!r86Var.c()) {
                    if (!r86Var.d()) {
                        r86Var.a();
                    }
                    kz5 kz5Var = new kz5(this, r86Var, (byte) 6);
                    long j = 0;
                    if (r86Var.c > 0) {
                        j = 320 - (SystemClock.elapsedRealtime() - r86Var.c);
                    }
                    gl.e3(kz5Var, j);
                    return;
                }
                m(r86Var, false);
                return;
            }
            arrayList.remove(pair);
            r86Var.b = -1L;
            r86Var.c = -1L;
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

    public i46() {
    }
}
