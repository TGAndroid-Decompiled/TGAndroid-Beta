package defpackage;

import java.util.ArrayList;
public final class uv9 implements Runnable {
    public final byte a = 1;
    public final aw9 b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public uv9(aw9 aw9Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = aw9Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        String str = this.c;
        aw9 aw9Var = this.b;
        switch (b) {
            case 0:
                int i = aw9Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String B = xb4.B(((r47) arrayList2.get(i2)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        r47 r47Var = new r47(i, ((r47) arrayList2.get(i2)).k, false, false);
                        r47Var.z0 = ((r47) arrayList2.get(i2)).z0;
                        r47Var.J5(aw9Var.L, true);
                        arrayList3.add(r47Var);
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String B2 = xb4.B(((r47) arrayList.get(i3)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        r47 r47Var2 = new r47(i, ((r47) arrayList.get(i3)).k, false, false);
                        r47Var2.z0 = ((r47) arrayList.get(i3)).z0;
                        r47Var2.J5(aw9Var.L, true);
                        arrayList4.add(r47Var2);
                    }
                }
                hl.c3(new uv9(aw9Var, str, arrayList3, arrayList4));
                return;
            default:
                z2b z2bVar = aw9Var.a;
                if (str.equals(aw9Var.M)) {
                    if (aw9Var.r == 0) {
                        aw9Var.O.b(0);
                    }
                    aw9Var.e(arrayList2, arrayList, true);
                    if (aw9Var.r == 0) {
                        z2bVar.e(false, true);
                        p66 p66Var = z2bVar.e;
                        z2bVar.d.setText(ob6.M0(2131745528, null));
                        p66Var.setVisibility(0);
                        p66Var.setText(ob6.M0(2131745535, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public uv9(aw9 aw9Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = aw9Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
