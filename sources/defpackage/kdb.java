package defpackage;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class kdb {
    public final ylb a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public kdb(ylb ylbVar) {
        this.a = ylbVar;
    }

    public static void b(StringBuilder sb, int i, boolean z) {
        if (sb.length() > 0) {
            if (z) {
                sb.append(' ');
                sb.append(jb6.M0(2131744030, null));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(jb6.M0(i, null));
    }

    public final void a(defpackage.k47 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdb.a(k47):void");
    }
}
