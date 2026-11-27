package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class yg implements View.OnClickListener {
    public final byte a = 1;
    public final int[] b;
    public final Object c;
    public final Object d;
    public final KeyEvent.Callback e;
    public final ViewGroup f;
    public final Object h;
    public final Object n;
    public final Object r;

    public yg(FrameLayout frameLayout, vnb vnbVar, nx0 nx0Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, o97 o97Var) {
        this.c = frameLayout;
        this.d = vnbVar;
        this.e = nx0Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = o97Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        int[] iArr = this.b;
        ViewGroup viewGroup = this.f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                wr3 wr3Var = (wr3) obj2;
                z8d z8dVar = (z8d) obj;
                ((boolean[]) obj5)[0] = false;
                int i = iArr[0];
                xt3 xt3Var = (xt3) wr3Var.c;
                int i2 = wr3Var.a;
                int i3 = wr3Var.b;
                Editable text = xt3Var.getText();
                ?? obj6 = new Object();
                obj6.a |= 128;
                obj6.b = i2;
                obj6.c = i3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = (int) (jj.c(null, (hq7) obj4, (hq7) callback, (hq7) viewGroup, (hq7) obj3) / 1000);
                tL_messageEntityFormattedDate.flags = i;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new no4(text.subSequence(i2, i3).toString(), obj6, tL_messageEntityFormattedDate), i2, i3, 33);
                } catch (Exception unused) {
                }
                vt3 vt3Var = xt3Var.U1;
                if (vt3Var != null) {
                    vt3Var.c();
                }
                ((nx0) z8dVar.b).y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                vnb vnbVar = (vnb) obj4;
                nx0 nx0Var = (nx0) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                o97 o97Var = (o97) obj;
                if (!yac.h(yac.t0).p()) {
                    new d31(frameLayout, vnbVar).Q(2131624211, 36, hl.N2(ob6.M0(2131748251, null), -1, 2, new kc((byte) 1), null)).j();
                    return;
                }
                fu5 G = fu5.G(nx0Var.c, vnbVar, frameLayout2);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    G.b(0, strArr[i4], new ze7(iArr2, iArr[i4], o97Var, (byte) 2), false);
                }
                G.i = (byte) 1;
                G.a0();
                return;
        }
    }

    public yg(boolean[] zArr, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, hq7 hq7Var4, wr3 wr3Var, int[] iArr, z8d z8dVar) {
        this.c = zArr;
        this.d = hq7Var;
        this.e = hq7Var2;
        this.f = hq7Var3;
        this.h = hq7Var4;
        this.n = wr3Var;
        this.b = iArr;
        this.r = z8dVar;
    }
}
