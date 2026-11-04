package ci;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.j50;
import org.telegram.ui.wm;
public final class x3 implements org.telegram.ui.ActionBar.p1, gj0 {
    public final int f6331a;
    public final long f6332b;
    public final cs f6333c;
    public final Object d;
    public final Object f6334e;
    public final Object f6335f;

    public x3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i3) {
        this.f6331a = i3;
        this.f6333c = (cs) obj;
        this.d = callback;
        this.f6334e = obj2;
        this.f6332b = j10;
        this.f6335f = obj3;
    }

    @Override
    public void b(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.x3.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f6331a) {
            case 1:
                wm.i1((wm) this.f6333c, (TLRPC.TL_game) this.d, (zi) this.f6334e, (String) this.f6335f, this.f6332b);
                return;
            default:
                g11 g11Var = (g11) this.f6333c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f6334e;
                go goVar = (go) this.f6335f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j10 = this.f6332b;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j10 == ((Integer) obj).intValue()) {
                            g11Var.n(0L, false);
                        }
                    } else {
                        g11Var.f33934l0.addAll(hashSet);
                        g11Var.q();
                        org.telegram.ui.Components.fc.a0(g11Var.f33937s).U(bd.K0(hashSet.size(), "TopicsDeleted"), false, new l2(g11Var, hashSet, arrayList, j10, 18), new j50(g11Var, arrayList, goVar, 27)).j();
                        s1Var.dismiss();
                        return;
                    }
                }
        }
    }

    public x3(wm wmVar, TLRPC.TL_game tL_game, zi ziVar, String str, long j10) {
        this.f6331a = 1;
        this.f6333c = wmVar;
        this.d = tL_game;
        this.f6334e = ziVar;
        this.f6335f = str;
        this.f6332b = j10;
    }

    public x3(g11 g11Var, ArrayList arrayList, long j10, HashSet hashSet, go goVar) {
        this.f6331a = 3;
        this.f6333c = g11Var;
        this.d = arrayList;
        this.f6332b = j10;
        this.f6334e = hashSet;
        this.f6335f = goVar;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
