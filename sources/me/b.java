package me;

import ba.i;
import e0.e0;
import ed.e;
import g2.q0;
import gi.w5;
import kotlin.jvm.internal.j;
import ne.f;
import ne.h;
import v7.s;
public final class b {
    public static final b d = new b();
    public final q0 f19277a = new q0();
    public final s f19278b = oe.a.f21036a;
    public final w5 f19279c = new w5(18);

    public final Object a(he.a deserializer, String str) {
        byte b10;
        j.e(deserializer, "deserializer");
        this.f19277a.getClass();
        e0 e0Var = new e0(str);
        Object l10 = new g2.d(this, ne.j.f20360c, e0Var, deserializer.d()).l(deserializer);
        String str2 = (String) e0Var.f9228f;
        int i3 = e0Var.f9225b;
        while (true) {
            b10 = 10;
            if (i3 != -1 && i3 < str2.length()) {
                int i10 = i3 + 1;
                char charAt = str2.charAt(i3);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    e0Var.f9225b = i10;
                    b10 = f.b(charAt);
                    break;
                }
                i3 = i10;
            } else {
                break;
            }
        }
        e0Var.f9225b = str2.length();
        if (b10 == 10) {
            return l10;
        }
        e0.n(e0Var, "Expected EOF after parsing, but had " + str.charAt(e0Var.f9225b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(he.a serializer, Object obj) {
        char[] cArr;
        Object removeLast;
        j.e(serializer, "serializer");
        jc.a aVar = new jc.a(1);
        ne.b bVar = ne.b.f20345c;
        synchronized (bVar) {
            e eVar = (e) bVar.f1633b;
            cArr = null;
            if (eVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = eVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                bVar.f1632a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f16236b = cArr;
        try {
            this.f19277a.getClass();
            new h(new i(aVar, 5), this, ne.j.f20360c, new h[ne.j.f20363n.h()]).i(serializer, obj);
            return aVar.toString();
        } finally {
            aVar.b();
        }
    }
}
