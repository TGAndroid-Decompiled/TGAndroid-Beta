package defpackage;

import java.util.ArrayList;
public final class k77 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final ArrayList c;

    public k77(uc7 uc7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new k77(uc7Var, arrayList, (byte) 2));
                return;
            case 1:
                hl.c3(new k77(uc7Var, arrayList, (byte) 3));
                return;
            case 2:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 3:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 4:
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uc7Var.getNotificationCenter().k(80, arrayList.get(i));
                }
                return;
            case 5:
                break;
            case 6:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 7:
                hl.c3(new k77(uc7Var, arrayList, (byte) 8));
                return;
            default:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            uc7Var.n4(uc7Var.j1(-((Long) arrayList.get(i2)).longValue()), 0L);
        }
    }
}
