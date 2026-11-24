package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class oj3 extends jb8 {
    public final boolean[] a;
    public final nk3 b;

    public oj3(nk3 nk3Var, boolean[] zArr) {
        this.b = nk3Var;
        this.a = zArr;
    }

    @Override
    public final CharSequence C(int i) {
        nk3 nk3Var = this.b;
        if (i >= 0 && i < nk3Var.F2.size() && ((jo6) nk3Var.F2.get(i)).b) {
            return null;
        }
        return nk3Var.E2();
    }

    @Override
    public final void D() {
        int i;
        nk3 nk3Var = this.b;
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            i = ((d) nk3Var).currentAccount;
            bdaVar.i(i, nk3Var.F2);
        }
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.b.G2();
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList;
        nk3 nk3Var = this.b;
        ArrayList arrayList2 = nk3Var.K2;
        if (nk3Var.D1 != null && (arrayList = nk3Var.F2) != null && !arrayList.isEmpty()) {
            ti3 ti3Var = nk3Var.D1;
            CharSequence charSequence = ((jo6) nk3Var.F2.get(0)).a;
            if (charSequence == null) {
                charSequence = "";
            }
            ti3Var.setFieldText(charSequence);
        }
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            i4 = ((d) nk3Var).currentAccount;
            bdaVar.i(i4, nk3Var.F2);
        }
        if ((!z || i2 != 0 || z2) && nk3Var.E2 != null && !arrayList2.isEmpty()) {
            nk3Var.L2 = z;
            nk3Var.M2 = i2;
            nk3Var.O2 = z2;
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                arrayList3.add(bf7.a(((Long) arrayList2.get(i5)).longValue(), 0L));
            }
            PhotoViewer.r0().A(true, false);
            nk3Var.E2.q(nk3Var, arrayList3, nk3Var.D1.getFieldText(), false, z, i2, i3, null);
            return;
        }
        PhotoViewer.r0().A(true, false);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        bf0 bf0Var;
        nk3 nk3Var = this.b;
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            bf0Var = bdaVar.f(i);
        } else {
            bf0Var = null;
        }
        if (bf0Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        bf0Var.getLocationInWindow(iArr);
        qb8 qb8Var = new qb8();
        qb8Var.b = iArr[0];
        qb8Var.c = iArr[1];
        qb8Var.d = nk3Var.I2;
        ImageReceiver imageReceiver = bf0Var.getImageReceiver();
        qb8Var.a = imageReceiver;
        qb8Var.e = imageReceiver.p();
        qb8Var.k = bf0Var.getScaleX();
        qb8Var.h = new int[]{gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f)};
        return qb8Var;
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
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.K2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (!pg3.B(longValue)) {
                    if (nk3Var.getMessagesController().L1(longValue) > 0) {
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
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = nk3Var.F2.size();
        ArrayList arrayList2 = nk3Var.F2;
        if (size == 1) {
            if (((jo6) arrayList2.get(0)).b) {
                i2 = 2131753898;
            } else {
                i2 = 2131753913;
            }
            return jb6.M0(i2, null);
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList2.get(i5);
            i5++;
            if (((jo6) obj).b) {
                i3++;
            } else {
                i4++;
            }
        }
        if (i3 == 0) {
            return jb6.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i4 == 0) {
            return jb6.G(size, "ShareSendVideos", new Object[0]);
        }
        return jb6.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void f(CharSequence charSequence) {
        nk3 nk3Var = this.b;
        ti3 ti3Var = nk3Var.D1;
        if (ti3Var != null) {
            ti3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = nk3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jo6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean i() {
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.K2;
        if (!arrayList.isEmpty()) {
            oc7 messagesController = nk3Var.getMessagesController();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l = (Long) obj;
                if (pg3.D(l.longValue())) {
                    TLRPC.User W1 = messagesController.W1(l);
                    if (W1 != null) {
                        if (!W1.bot) {
                            if (m9c.D(W1)) {
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
    public final jn5 k(int i) {
        bf0 bf0Var;
        bda bdaVar = this.b.I2;
        if (bdaVar != null) {
            bf0Var = bdaVar.f(i);
        } else {
            bf0Var = null;
        }
        if (bf0Var == null) {
            return null;
        }
        return bf0Var.getImageReceiver().p();
    }

    @Override
    public final void r() {
        ti3 ti3Var;
        tc1 d0;
        PhotoViewer r0 = PhotoViewer.r0();
        CharSequence charSequence = null;
        if (r0.V0() && (d0 = r0.d0()) != null) {
            charSequence = d0.getText();
        }
        nk3 nk3Var = this.b;
        if (charSequence != null && (ti3Var = nk3Var.D1) != null) {
            ti3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = nk3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jo6) obj).a = charSequence;
            }
        }
    }

    @Override
    public final boolean w(int i) {
        return this.a[i];
    }

    @Override
    public final int E(int i, rcc rccVar) {
        return i;
    }
}
