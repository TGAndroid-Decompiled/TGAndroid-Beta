package defpackage;

import java.util.ArrayList;
public abstract class iwc extends Thread {
    public final cwc a;

    public iwc(String str, cwc cwcVar, int i) {
        super(str);
        this.a = cwcVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        yh4 yh4Var = this.a.d;
        int i = 0;
        if (yh4Var != null) {
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.getClass();
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (yh4Var != null) {
            ArrayList arrayList2 = (ArrayList) yh4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused3) {
                        o35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
