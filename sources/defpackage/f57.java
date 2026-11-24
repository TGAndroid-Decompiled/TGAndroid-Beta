package defpackage;

import java.util.ArrayList;
public final class f57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final ArrayList c;

    public f57(na7 na7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 1:
                gl.c3(new f57(na7Var, arrayList, (byte) 2));
                return;
            case 2:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 3:
                gl.c3(new f57(na7Var, arrayList, (byte) 4));
                return;
            case 4:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 5:
                break;
            case 6:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            default:
                gl.c3(new f57(na7Var, arrayList, (byte) 0));
                return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            na7Var.f4(na7Var.h1(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }
}
