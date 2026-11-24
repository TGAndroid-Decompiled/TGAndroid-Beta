package defpackage;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class ibb {
    public final wjb a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public ibb(wjb wjbVar) {
        this.a = wjbVar;
    }

    public static void b(StringBuilder sb, int i, boolean z) {
        if (sb.length() > 0) {
            if (z) {
                sb.append(' ');
                sb.append(k96.M0(2131744104, null));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(k96.M0(i, null));
    }

    public final void a(defpackage.k27 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibb.a(k27):void");
    }
}
