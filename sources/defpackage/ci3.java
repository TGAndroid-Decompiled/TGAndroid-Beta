package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class ci3 extends i98 {
    public final boolean[] a;
    public final cj3 b;

    public ci3(cj3 cj3Var, boolean[] zArr) {
        this.b = cj3Var;
        this.a = zArr;
    }

    @Override
    public final CharSequence B(int i) {
        cj3 cj3Var = this.b;
        if (i >= 0 && i < cj3Var.F2.size() && ((jm6) cj3Var.F2.get(i)).b) {
            return null;
        }
        return cj3Var.C2();
    }

    @Override
    public final void C() {
        int i;
        cj3 cj3Var = this.b;
        bba bbaVar = cj3Var.I2;
        if (bbaVar != null) {
            i = ((d) cj3Var).currentAccount;
            bbaVar.i(i, cj3Var.F2);
        }
    }

    @Override
    public final int G() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean H() {
        return this.b.E2();
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList;
        cj3 cj3Var = this.b;
        ArrayList arrayList2 = cj3Var.K2;
        if (cj3Var.D1 != null && (arrayList = cj3Var.F2) != null && !arrayList.isEmpty()) {
            hh3 hh3Var = cj3Var.D1;
            CharSequence charSequence = ((jm6) cj3Var.F2.get(0)).a;
            if (charSequence == null) {
                charSequence = "";
            }
            hh3Var.setFieldText(charSequence);
        }
        bba bbaVar = cj3Var.I2;
        if (bbaVar != null) {
            i4 = ((d) cj3Var).currentAccount;
            bbaVar.i(i4, cj3Var.F2);
        }
        if ((!z || i2 != 0 || z2) && cj3Var.E2 != null && !arrayList2.isEmpty()) {
            cj3Var.L2 = z;
            cj3Var.M2 = i2;
            cj3Var.O2 = z2;
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                arrayList3.add(zc7.a(((Long) arrayList2.get(i5)).longValue(), 0L));
            }
            PhotoViewer.r0().B(true, false);
            cj3Var.E2.r(cj3Var, arrayList3, cj3Var.D1.getFieldText(), false, z, i2, i3, null);
            return;
        }
        PhotoViewer.r0().B(true, false);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        be0 be0Var;
        cj3 cj3Var = this.b;
        bba bbaVar = cj3Var.I2;
        if (bbaVar != null) {
            be0Var = bbaVar.f(i);
        } else {
            be0Var = null;
        }
        if (be0Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        be0Var.getLocationInWindow(iArr);
        p98 p98Var = new p98();
        p98Var.b = iArr[0];
        p98Var.c = iArr[1];
        p98Var.d = cj3Var.I2;
        ImageReceiver imageReceiver = be0Var.getImageReceiver();
        p98Var.a = imageReceiver;
        p98Var.e = imageReceiver.p();
        p98Var.k = be0Var.getScaleX();
        p98Var.h = new int[]{gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f)};
        return p98Var;
    }

    @Override
    public final long a() {
        ArrayList arrayList = this.b.K2;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayList.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        cj3 cj3Var = this.b;
        ArrayList arrayList = cj3Var.K2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (!cf3.B(longValue)) {
                    if (cj3Var.getMessagesController().K1(longValue) > 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence c0(int i) {
        int i2;
        cj3 cj3Var = this.b;
        ArrayList arrayList = cj3Var.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = cj3Var.F2.size();
        ArrayList arrayList2 = cj3Var.F2;
        if (size == 1) {
            if (((jm6) arrayList2.get(0)).b) {
                i2 = 2131753930;
            } else {
                i2 = 2131753945;
            }
            return k96.M0(i2, null);
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList2.get(i5);
            i5++;
            if (((jm6) obj).b) {
                i3++;
            } else {
                i4++;
            }
        }
        if (i3 == 0) {
            return k96.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i4 == 0) {
            return k96.G(size, "ShareSendVideos", new Object[0]);
        }
        return k96.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void f(CharSequence charSequence) {
        cj3 cj3Var = this.b;
        hh3 hh3Var = cj3Var.D1;
        if (hh3Var != null) {
            hh3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = cj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jm6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean i() {
        cj3 cj3Var = this.b;
        ArrayList arrayList = cj3Var.K2;
        if (!arrayList.isEmpty()) {
            na7 messagesController = cj3Var.getMessagesController();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l = (Long) obj;
                if (cf3.D(l.longValue())) {
                    TLRPC.User V1 = messagesController.V1(l);
                    if (V1 != null) {
                        if (!V1.bot) {
                            if (l7c.D(V1)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final jl5 k(int i) {
        be0 be0Var;
        bba bbaVar = this.b.I2;
        if (bbaVar != null) {
            be0Var = bbaVar.f(i);
        } else {
            be0Var = null;
        }
        if (be0Var == null) {
            return null;
        }
        return be0Var.getImageReceiver().p();
    }

    @Override
    public final void r() {
        hh3 hh3Var;
        mb1 d0;
        PhotoViewer r0 = PhotoViewer.r0();
        CharSequence charSequence = null;
        if (r0.V0() && (d0 = r0.d0()) != null) {
            charSequence = d0.getText();
        }
        cj3 cj3Var = this.b;
        if (charSequence != null && (hh3Var = cj3Var.D1) != null) {
            hh3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = cj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jm6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean w(int i) {
        return this.a[i];
    }

    @Override
    public final int D(int i, oac oacVar) {
        return i;
    }
}
