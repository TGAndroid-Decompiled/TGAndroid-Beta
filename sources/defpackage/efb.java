package defpackage;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class efb {
    public final vnb a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public efb(vnb vnbVar) {
        this.a = vnbVar;
    }

    public static void b(StringBuilder sb, int i, boolean z) {
        if (sb.length() > 0) {
            if (z) {
                sb.append(' ');
                sb.append(ob6.M0(2131743998, null));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(ob6.M0(i, null));
    }

    public final void a(defpackage.r47 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efb.a(r47):void");
    }
}
