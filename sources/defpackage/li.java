package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class li implements View.OnClickListener {
    public final byte a = 1;
    public final int[] b;
    public final Object c;
    public final Object d;
    public final KeyEvent.Callback e;
    public final ViewGroup f;
    public final Object h;
    public final Object n;
    public final Object r;

    public li(FrameLayout frameLayout, ylb ylbVar, my0 my0Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, l97 l97Var) {
        this.c = frameLayout;
        this.d = ylbVar;
        this.e = my0Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = l97Var;
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
                lu3 lu3Var = (lu3) obj2;
                k6d k6dVar = (k6d) obj;
                ((boolean[]) obj5)[0] = false;
                int i = iArr[0];
                qu3 qu3Var = (qu3) lu3Var.c;
                int i2 = lu3Var.a;
                int i3 = lu3Var.b;
                Editable text = qu3Var.getText();
                ?? obj6 = new Object();
                obj6.a |= 128;
                obj6.b = i2;
                obj6.c = i3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = (int) (ik.c(null, (lp7) obj4, (lp7) callback, (lp7) viewGroup, (lp7) obj3) / 1000);
                tL_messageEntityFormattedDate.flags = i;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new jo4(text.subSequence(i2, i3).toString(), obj6, tL_messageEntityFormattedDate), i2, i3, 33);
                } catch (Exception unused) {
                }
                ou3 ou3Var = qu3Var.T1;
                if (ou3Var != null) {
                    ou3Var.m();
                }
                ((my0) k6dVar.b).y0.run();
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                ylb ylbVar = (ylb) obj4;
                my0 my0Var = (my0) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                l97 l97Var = (l97) obj;
                if (!z8c.h(z8c.t0).p()) {
                    new c41(frameLayout, ylbVar).Q(2131624211, 36, gm.N2(jb6.M0(2131748254, null), -1, 2, new jd((byte) 1), null)).j();
                    return;
                }
                bu5 G = bu5.G(my0Var.c, ylbVar, frameLayout2);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    G.b(0, strArr[i4], new wc7(iArr2, iArr[i4], l97Var, (byte) 2), false);
                }
                G.i = (byte) 1;
                G.a0();
                return;
        }
    }

    public li(boolean[] zArr, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, lp7 lp7Var4, lu3 lu3Var, int[] iArr, k6d k6dVar) {
        this.c = zArr;
        this.d = lp7Var;
        this.e = lp7Var2;
        this.f = lp7Var3;
        this.h = lp7Var4;
        this.n = lu3Var;
        this.b = iArr;
        this.r = k6dVar;
    }
}
