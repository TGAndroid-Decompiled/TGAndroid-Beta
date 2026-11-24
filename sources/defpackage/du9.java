package defpackage;

import java.util.ArrayList;
public final class du9 implements Runnable {
    public final byte a = 1;
    public final ju9 b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public du9(ju9 ju9Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = ju9Var;
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
        ju9 ju9Var = this.b;
        switch (b) {
            case 0:
                int i = ju9Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String B = bc4.B(((k47) arrayList2.get(i2)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        k47 k47Var = new k47(i, ((k47) arrayList2.get(i2)).k, false, false);
                        k47Var.z0 = ((k47) arrayList2.get(i2)).z0;
                        k47Var.J5(ju9Var.L, true);
                        arrayList3.add(k47Var);
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String B2 = bc4.B(((k47) arrayList.get(i3)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        k47 k47Var2 = new k47(i, ((k47) arrayList.get(i3)).k, false, false);
                        k47Var2.z0 = ((k47) arrayList.get(i3)).z0;
                        k47Var2.J5(ju9Var.L, true);
                        arrayList4.add(k47Var2);
                    }
                }
                gm.c3(new du9(ju9Var, str, arrayList3, arrayList4));
                return;
            default:
                a1b a1bVar = ju9Var.a;
                if (str.equals(ju9Var.M)) {
                    if (ju9Var.r == 0) {
                        ju9Var.O.b(0);
                    }
                    ju9Var.e(arrayList2, arrayList, true);
                    if (ju9Var.r == 0) {
                        a1bVar.e(false, true);
                        l66 l66Var = a1bVar.e;
                        a1bVar.d.setText(jb6.M0(2131745534, null));
                        l66Var.setVisibility(0);
                        l66Var.setText(jb6.M0(2131745541, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public du9(ju9 ju9Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = ju9Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
