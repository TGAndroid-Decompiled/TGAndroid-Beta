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
public final class v42 extends a52 {
    public final ChatAttachAlertPhotoLayout b;

    public v42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void C() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        gl.e3(new hq1(this, (byte) 16), 150L);
        chatAttachAlertPhotoLayout.F(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override
    public final void E(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (x02Var != null && x02Var.W1 != z) {
            x02Var.q1(z, true);
            chatAttachAlertPhotoLayout.e1.a(!x02Var.W1, true);
        }
    }

    @Override
    public final void F() {
        s42 s42Var = this.b.F;
        int childCount = s42Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s42Var.getChildAt(i);
            if (childAt instanceof o48) {
                ((o48) childAt).g(true);
            }
        }
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        x02Var.s4 = true;
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
        if (d0 != null) {
            d0.s = oacVar;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && d0 != null) {
            chatAttachAlertPhotoLayout.R(d0, -1);
        }
        if (!x02Var.G0(x02Var.U0().getText())) {
            x02Var.E0();
            if (PhotoViewer.r0().v7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                if (!hashMap.isEmpty()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Object obj = hashMap.get(arrayList.get(i4));
                        if (obj instanceof jm6) {
                            jm6 jm6Var = (jm6) obj;
                            if (i4 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.r0().w7};
                                jm6Var.n = hq6.d0(y6c.t0).Y(charSequenceArr, false, true);
                                CharSequence charSequence = charSequenceArr[0];
                                jm6Var.a = charSequence;
                                if (x02Var.G0(charSequence)) {
                                    return;
                                }
                            } else {
                                jm6Var.a = null;
                            }
                        }
                    }
                }
            }
            if (x02Var != null) {
                x02Var.F3 = false;
            }
            PhotoViewer.r0();
            PhotoViewer.r0().P = false;
            PhotoViewer.r0().v2 = false;
            ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + ChatAttachAlertPhotoLayout.t1.size(), new n42(this, z, i2, z2));
        }
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        wf0 wf0Var;
        p98 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (z2 && (wf0Var = x02Var.O2) != null && (closeIntoObject = ((vl5) wf0Var.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        o48 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 != null) {
            int[] iArr = new int[2];
            c0.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - x02Var.R();
            }
            p98 p98Var = new p98();
            p98Var.b = iArr[0];
            p98Var.c = iArr[1];
            p98Var.d = chatAttachAlertPhotoLayout.F;
            ImageReceiver imageReceiver = c0.getImageView().getImageReceiver();
            p98Var.a = imageReceiver;
            p98Var.e = imageReceiver.p();
            p98Var.k = c0.getScale();
            p98Var.i = (int) x02Var.T0();
            c0.g(false);
            return p98Var;
        }
        return null;
    }

    @Override
    public final void X(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        o48 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 != null) {
            c0.getImageView().q();
            jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
            if (d0 != null) {
                int i2 = d0.C;
                String str = d0.I;
                if (d0.g != null) {
                    c0.getImageView().o(d0.g, null, bkb.Q4);
                } else if (d0.c != null) {
                    c0.getImageView().o(d0.c, null, bkb.Q4);
                } else if (str != null) {
                    c0.getImageView().r(d0.J, d0.K, true);
                    if (d0.b) {
                        c0.getImageView().o(mue.d("vthumb://", i2, ":", str), null, bkb.Q4);
                    } else {
                        c0.getImageView().o(mue.d("thumb://", i2, ":", str), null, bkb.Q4);
                    }
                } else {
                    c0.getImageView().setImageDrawable(bkb.Q4);
                }
            }
        }
    }

    @Override
    public final long a() {
        d dVar = this.b.b.Z1;
        if (dVar instanceof mu1) {
            return ((mu1) dVar).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        o48 c0 = this.b.c0(i);
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
                if (obj instanceof jm6) {
                    jm6 jm6Var = (jm6) obj;
                    charSequence2 = jm6Var.a;
                    arrayList = jm6Var.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof nm6) {
                    nm6 nm6Var = (nm6) obj;
                    charSequence2 = nm6Var.I;
                    arrayList = nm6Var.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    k27.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.U0().setText(gm.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void j() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
    }

    @Override
    public final jl5 k(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        o48 c0 = this.b.c0(i);
        if (c0 != null) {
            return c0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean l() {
        x02 x02Var = this.b.b;
        if (x02Var != null && (x02Var.Z1 instanceof mu1)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean p() {
        x02 x02Var = this.b.b;
        if (x02Var != null && x02Var.E3 != null) {
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
        k27 k27Var;
        x02 x02Var = this.b.b;
        if (x02Var != null && (k27Var = x02Var.E3) != null && k27Var.o5()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y() {
        x02 x02Var = this.b.b;
        if (!x02Var.z1 && !x02Var.B1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        x02 x02Var = this.b.b;
        if (x02Var != null && x02Var.W1) {
            return true;
        }
        return false;
    }
}
