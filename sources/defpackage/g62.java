package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class g62 extends l62 {
    public final ChatAttachAlertPhotoLayout b;

    public g62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void D() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        gm.d3(new fo1(this, (byte) 21), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override
    public final void F(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (i22Var != null && i22Var.W1 != z) {
            i22Var.q1(z, true);
            chatAttachAlertPhotoLayout.e1.a(!i22Var.W1, true);
        }
    }

    @Override
    public final void G() {
        d62 d62Var = this.b.F;
        int childCount = d62Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d62Var.getChildAt(i);
            if (childAt instanceof q68) {
                ((q68) childAt).g(true);
            }
        }
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        i22Var.s4 = true;
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        jo6 d0 = chatAttachAlertPhotoLayout.d0(i);
        if (d0 != null) {
            d0.s = rccVar;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && d0 != null) {
            chatAttachAlertPhotoLayout.Q(d0, -1);
        }
        if (!i22Var.G0(i22Var.U0().getText())) {
            i22Var.E0();
            if (PhotoViewer.r0().u7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                if (!hashMap.isEmpty()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Object obj = hashMap.get(arrayList.get(i4));
                        if (obj instanceof jo6) {
                            jo6 jo6Var = (jo6) obj;
                            if (i4 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.r0().v7};
                                jo6Var.n = hs6.d0(z8c.t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                jo6Var.a = charSequence;
                                if (i22Var.G0(charSequence)) {
                                    return;
                                }
                            } else {
                                jo6Var.a = null;
                            }
                        }
                    }
                }
            }
            if (i22Var != null) {
                i22Var.F3 = false;
            }
            PhotoViewer.r0();
            PhotoViewer.r0().P = false;
            PhotoViewer.r0().v2 = false;
            ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + ChatAttachAlertPhotoLayout.t1.size(), new y52(this, z, i2, z2));
        }
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        wg0 wg0Var;
        qb8 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (z2 && (wg0Var = i22Var.O2) != null && (closeIntoObject = ((vn5) wg0Var.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        q68 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 != null) {
            int[] iArr = new int[2];
            c0.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - i22Var.Q();
            }
            qb8 qb8Var = new qb8();
            qb8Var.b = iArr[0];
            qb8Var.c = iArr[1];
            qb8Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = c0.getImageView().getImageReceiver();
            qb8Var.a = imageReceiver;
            qb8Var.e = imageReceiver.p();
            qb8Var.k = c0.getScale();
            qb8Var.i = (int) i22Var.T0();
            c0.g(false);
            return qb8Var;
        }
        return null;
    }

    @Override
    public final void Y(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        q68 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 != null) {
            c0.getImageView().q();
            jo6 d0 = chatAttachAlertPhotoLayout.d0(i);
            if (d0 != null) {
                int i2 = d0.C;
                String str = d0.I;
                if (d0.g != null) {
                    c0.getImageView().o(d0.g, null, cmb.Q4);
                } else if (d0.c != null) {
                    c0.getImageView().o(d0.c, null, cmb.Q4);
                } else if (str != null) {
                    c0.getImageView().r(d0.J, d0.K, true);
                    if (d0.b) {
                        c0.getImageView().o(mle.d("vthumb://", i2, ":", str), null, cmb.Q4);
                    } else {
                        c0.getImageView().o(mle.d("thumb://", i2, ":", str), null, cmb.Q4);
                    }
                } else {
                    c0.getImageView().setImageDrawable(cmb.Q4);
                }
            }
        }
    }

    @Override
    public final long a() {
        d dVar = this.b.b.Z1;
        if (dVar instanceof yv1) {
            return ((yv1) dVar).a();
        }
        return 0L;
    }

    @Override
    public final void b0(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        q68 c0 = this.b.c0(i);
        if (c0 != null) {
            c0.g(true);
        }
    }

    @Override
    public final void e() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override
    public final void f(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    charSequence2 = jo6Var.a;
                    arrayList = jo6Var.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    charSequence2 = no6Var.I;
                    arrayList = no6Var.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    k47.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.U0().setText(gn.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void j() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
    }

    @Override
    public final jn5 k(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        q68 c0 = this.b.c0(i);
        if (c0 != null) {
            return c0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        i22 i22Var = this.b.b;
        if (i22Var != null && (i22Var.Z1 instanceof yv1)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean p() {
        i22 i22Var = this.b.b;
        if (i22Var != null && i22Var.E3 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.b.s0(-1, false);
    }

    @Override
    public final boolean v() {
        k47 k47Var;
        i22 i22Var = this.b.b;
        if (i22Var != null && (k47Var = i22Var.E3) != null && k47Var.o5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y() {
        i22 i22Var = this.b.b;
        if (!i22Var.z1 && !i22Var.B1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        i22 i22Var = this.b.b;
        if (i22Var != null && i22Var.W1) {
            return true;
        }
        return false;
    }
}
