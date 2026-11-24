package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lh implements View.OnClickListener {
    public final byte a = 1;
    public final int[] b;
    public final Object c;
    public final Object d;
    public final KeyEvent.Callback e;
    public final ViewGroup f;
    public final Object h;
    public final Object n;
    public final Object r;

    public lh(FrameLayout frameLayout, wjb wjbVar, fx0 fx0Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, s67 s67Var) {
        this.c = frameLayout;
        this.d = wjbVar;
        this.e = fx0Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = s67Var;
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
                bt3 bt3Var = (bt3) obj2;
                i4d i4dVar = (i4d) obj;
                ((boolean[]) obj5)[0] = false;
                int i = iArr[0];
                gt3 gt3Var = (gt3) bt3Var.c;
                int i2 = bt3Var.a;
                int i3 = bt3Var.b;
                Editable text = gt3Var.getText();
                ?? obj6 = new Object();
                obj6.a |= 128;
                obj6.b = i2;
                obj6.c = i3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = (int) (ij.c(null, (hn7) obj4, (hn7) callback, (hn7) viewGroup, (hn7) obj3) / 1000);
                tL_messageEntityFormattedDate.flags = i;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new im4(text.subSequence(i2, i3).toString(), obj6, tL_messageEntityFormattedDate), i2, i3, 33);
                } catch (Exception unused) {
                }
                et3 et3Var = gt3Var.T1;
                if (et3Var != null) {
                    et3Var.m();
                }
                ((fx0) i4dVar.a).y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                wjb wjbVar = (wjb) obj4;
                fx0 fx0Var = (fx0) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                s67 s67Var = (s67) obj;
                if (!y6c.h(y6c.t0).p()) {
                    new u21(frameLayout, wjbVar).Q(2131624211, 36, gl.N2(k96.M0(2131748305, null), -1, 2, new jc((byte) 1), null)).j();
                    return;
                }
                cs5 G = cs5.G(fx0Var.c, wjbVar, frameLayout2);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    G.b(0, strArr[i4], new va7(iArr2, iArr[i4], s67Var, (byte) 2), false);
                }
                G.i = (byte) 1;
                G.a0();
                return;
        }
    }

    public lh(boolean[] zArr, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, hn7 hn7Var4, bt3 bt3Var, int[] iArr, i4d i4dVar) {
        this.c = zArr;
        this.d = hn7Var;
        this.e = hn7Var2;
        this.f = hn7Var3;
        this.h = hn7Var4;
        this.n = bt3Var;
        this.b = iArr;
        this.r = i4dVar;
    }
}
