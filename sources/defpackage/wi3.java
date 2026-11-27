package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public final class wi3 extends yc8 {
    public final boolean[] a;
    public final uj3 b;

    public wi3(uj3 uj3Var, boolean[] zArr) {
        this.b = uj3Var;
        this.a = zArr;
    }

    @Override
    public final CharSequence B(int i) {
        uj3 uj3Var = this.b;
        if (i >= 0 && i < uj3Var.F2.size() && ((no6) uj3Var.F2.get(i)).b) {
            return null;
        }
        return uj3Var.E2();
    }

    @Override
    public final void C() {
        int i;
        uj3 uj3Var = this.b;
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            i = ((e) uj3Var).currentAccount;
            seaVar.i(i, uj3Var.F2);
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
        return this.b.G2();
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList;
        uj3 uj3Var = this.b;
        ArrayList arrayList2 = uj3Var.K2;
        if (uj3Var.D1 != null && (arrayList = uj3Var.F2) != null && !arrayList.isEmpty()) {
            bi3 bi3Var = uj3Var.D1;
            CharSequence charSequence = ((no6) uj3Var.F2.get(0)).a;
            if (charSequence == null) {
                charSequence = "";
            }
            bi3Var.setFieldText(charSequence);
        }
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            i4 = ((e) uj3Var).currentAccount;
            seaVar.i(i4, uj3Var.F2);
        }
        if ((!z || i2 != 0 || z2) && uj3Var.E2 != null && !arrayList2.isEmpty()) {
            uj3Var.L2 = z;
            uj3Var.M2 = i2;
            uj3Var.O2 = z2;
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                arrayList3.add(jf7.a(((Long) arrayList2.get(i5)).longValue(), 0L));
            }
            PhotoViewer.q0().A(true, false);
            uj3Var.E2.q(uj3Var, arrayList3, uj3Var.D1.getFieldText(), false, z, i2, i3, null);
            return;
        }
        PhotoViewer.q0().A(true, false);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        de0 de0Var;
        uj3 uj3Var = this.b;
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            de0Var = seaVar.f(i);
        } else {
            de0Var = null;
        }
        if (de0Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        de0Var.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = uj3Var.I2;
        ImageReceiver imageReceiver = de0Var.getImageReceiver();
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = de0Var.getScaleX();
        fd8Var.h = new int[]{hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f)};
        return fd8Var;
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
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.K2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (!wf3.B(longValue)) {
                    if (uj3Var.getMessagesController().M1(longValue) > 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence d0(int i) {
        int i2;
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = uj3Var.F2.size();
        ArrayList arrayList2 = uj3Var.F2;
        if (size == 1) {
            if (((no6) arrayList2.get(0)).b) {
                i2 = 2131753926;
            } else {
                i2 = 2131753941;
            }
            return ob6.M0(i2, null);
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList2.get(i5);
            i5++;
            if (((no6) obj).b) {
                i3++;
            } else {
                i4++;
            }
        }
        if (i3 == 0) {
            return ob6.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i4 == 0) {
            return ob6.G(size, "ShareSendVideos", new Object[0]);
        }
        return ob6.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void f(CharSequence charSequence) {
        uj3 uj3Var = this.b;
        bi3 bi3Var = uj3Var.D1;
        if (bi3Var != null) {
            bi3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = uj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((no6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean i() {
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.K2;
        if (!arrayList.isEmpty()) {
            uc7 messagesController = uj3Var.getMessagesController();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l = (Long) obj;
                if (wf3.D(l.longValue())) {
                    TLRPC.User X1 = messagesController.X1(l);
                    if (X1 != null) {
                        if (!X1.bot) {
                            if (lbc.D(X1)) {
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
    public final mn5 k(int i) {
        de0 de0Var;
        sea seaVar = this.b.I2;
        if (seaVar != null) {
            de0Var = seaVar.f(i);
        } else {
            de0Var = null;
        }
        if (de0Var == null) {
            return null;
        }
        return de0Var.getImageReceiver().p();
    }

    @Override
    public final void r() {
        bi3 bi3Var;
        ub1 c0;
        PhotoViewer q0 = PhotoViewer.q0();
        CharSequence charSequence = null;
        if (q0.V0() && (c0 = q0.c0()) != null) {
            charSequence = c0.getText();
        }
        uj3 uj3Var = this.b;
        if (charSequence != null && (bi3Var = uj3Var.D1) != null) {
            bi3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = uj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((no6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean w(int i) {
        return this.a[i];
    }

    @Override
    public final int D(int i, oec oecVar) {
        return i;
    }
}
