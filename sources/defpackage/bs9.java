package defpackage;

import java.util.ArrayList;
public final class bs9 implements Runnable {
    public final byte a = 1;
    public final hs9 b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public bs9(hs9 hs9Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = hs9Var;
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
        hs9 hs9Var = this.b;
        switch (b) {
            case 0:
                int i = hs9Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String B = ba4.B(((k27) arrayList2.get(i2)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        k27 k27Var = new k27(i, ((k27) arrayList2.get(i2)).k, false, false);
                        k27Var.z0 = ((k27) arrayList2.get(i2)).z0;
                        k27Var.J5(hs9Var.L, true);
                        arrayList3.add(k27Var);
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String B2 = ba4.B(((k27) arrayList.get(i3)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        k27 k27Var2 = new k27(i, ((k27) arrayList.get(i3)).k, false, false);
                        k27Var2.z0 = ((k27) arrayList.get(i3)).z0;
                        k27Var2.J5(hs9Var.L, true);
                        arrayList4.add(k27Var2);
                    }
                }
                gl.c3(new bs9(hs9Var, str, arrayList3, arrayList4));
                return;
            default:
                zya zyaVar = hs9Var.a;
                if (str.equals(hs9Var.M)) {
                    if (hs9Var.r == 0) {
                        hs9Var.O.b(0);
                    }
                    hs9Var.e(arrayList2, arrayList, true);
                    if (hs9Var.r == 0) {
                        zyaVar.e(false, true);
                        l46 l46Var = zyaVar.e;
                        zyaVar.d.setText(k96.M0(2131745608, null));
                        l46Var.setVisibility(0);
                        l46Var.setText(k96.M0(2131745615, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bs9(hs9 hs9Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = hs9Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
