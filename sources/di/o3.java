package di;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.p11;
import org.telegram.ui.an;
public final class o3 implements org.telegram.ui.ActionBar.q1, hj0 {
    public final int f9143a;
    public final long f9144b;
    public final is f9145c;
    public final Object d;
    public final Object f9146e;
    public final Object f9147f;

    public o3(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f9143a = i7;
        this.f9145c = (is) obj;
        this.d = callback;
        this.f9146e = obj2;
        this.f9144b = j3;
        this.f9147f = obj3;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.o3.f(float, float, int, android.view.View):void");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9143a) {
            case 1:
                an.f1((an) this.f9145c, (TLRPC.TL_game) this.d, (gj) this.f9146e, (String) this.f9147f, this.f9144b);
                return;
            default:
                p11 p11Var = (p11) this.f9145c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f9146e;
                ih ihVar = (ih) this.f9147f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f9144b;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            p11Var.n(0L, false);
                        }
                    } else {
                        p11Var.f38161l0.addAll(hashSet);
                        p11Var.q();
                        org.telegram.ui.Components.cc.a0(p11Var.f38164s).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new f2(p11Var, hashSet, arrayList, j3, 18), new hh0(p11Var, arrayList, ihVar, 16)).j();
                        t1Var.dismiss();
                        return;
                    }
                }
        }
    }

    public o3(an anVar, TLRPC.TL_game tL_game, gj gjVar, String str, long j3) {
        this.f9143a = 1;
        this.f9145c = anVar;
        this.d = tL_game;
        this.f9146e = gjVar;
        this.f9147f = str;
        this.f9144b = j3;
    }

    public o3(p11 p11Var, ArrayList arrayList, long j3, HashSet hashSet, ih ihVar) {
        this.f9143a = 3;
        this.f9145c = p11Var;
        this.d = arrayList;
        this.f9144b = j3;
        this.f9146e = hashSet;
        this.f9147f = ihVar;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
