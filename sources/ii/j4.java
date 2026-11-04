package ii;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.wm;
public final class j4 implements Runnable {
    public final int f15028a;
    public final int f15029b;
    public final int f15030c;
    public final Object d;
    public final Object f15031e;
    public final Object f15032f;

    public j4(int i3, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f15028a = i11;
        this.d = obj;
        this.f15029b = i3;
        this.f15031e = tLObject;
        this.f15032f = obj2;
        this.f15030c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.j4.run():void");
    }

    public j4(int i3, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.p pVar) {
        this.f15028a = 0;
        this.f15029b = i3;
        this.d = user;
        this.f15031e = document;
        this.f15030c = i10;
        this.f15032f = pVar;
    }

    public j4(Object obj, Object obj2, int i3, Object obj3, int i10, int i11) {
        this.f15028a = i11;
        this.d = obj;
        this.f15031e = obj2;
        this.f15029b = i3;
        this.f15032f = obj3;
        this.f15030c = i10;
    }

    public j4(wm wmVar, int i3, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f15028a = 9;
        this.d = wmVar;
        this.f15029b = i3;
        this.f15030c = i10;
        this.f15031e = characterStyle;
        this.f15032f = q1Var;
    }

    public j4(a6 a6Var, Context context, int i3, int i10, y5 y5Var) {
        this.f15028a = 10;
        this.d = a6Var;
        this.f15031e = context;
        this.f15029b = i3;
        this.f15030c = i10;
        this.f15032f = y5Var;
    }
}
