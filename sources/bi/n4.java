package bi;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vs;
import org.telegram.ui.an;
public final class n4 implements org.telegram.ui.ActionBar.r1, cj0 {
    public final int f4401a;
    public final long f4402b;
    public final ls f4403c;
    public final Object d;
    public final Object f4404e;
    public final Object f4405f;

    public n4(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f4401a = i7;
        this.f4403c = (ls) obj;
        this.d = callback;
        this.f4404e = obj2;
        this.f4402b = j3;
        this.f4405f = obj3;
    }

    @Override
    public void f(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.n4.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f4401a) {
            case 1:
                an.i1((an) this.f4403c, (TLRPC.TL_game) this.d, (ij) this.f4404e, (String) this.f4405f, this.f4402b);
                return;
            default:
                m11 m11Var = (m11) this.f4403c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f4404e;
                vs vsVar = (vs) this.f4405f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f4402b;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            m11Var.n(0L, false);
                        }
                    } else {
                        m11Var.f35858k0.addAll(hashSet);
                        m11Var.q();
                        org.telegram.ui.Components.hc.a0(m11Var.f35861s).U(org.telegram.messenger.id.K0(hashSet.size(), "TopicsDeleted"), false, new w2(m11Var, hashSet, arrayList, j3, 18), new v80(m11Var, arrayList, vsVar, 22)).j();
                        u1Var.dismiss();
                        return;
                    }
                }
        }
    }

    public n4(an anVar, TLRPC.TL_game tL_game, ij ijVar, String str, long j3) {
        this.f4401a = 1;
        this.f4403c = anVar;
        this.d = tL_game;
        this.f4404e = ijVar;
        this.f4405f = str;
        this.f4402b = j3;
    }

    public n4(m11 m11Var, ArrayList arrayList, long j3, HashSet hashSet, vs vsVar) {
        this.f4401a = 3;
        this.f4403c = m11Var;
        this.d = arrayList;
        this.f4402b = j3;
        this.f4404e = hashSet;
        this.f4405f = vsVar;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
