package bg;

import a8.ia;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.ea;
import bi.s5;
import di.z6;
import fi.e7;
import fi.k2;
import fi.va;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import li.l3;
import li.q3;
import li.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ii;
import org.telegram.ui.ji;
import org.telegram.ui.nm;
import org.telegram.ui.p4;
import org.telegram.ui.pi;
import org.telegram.ui.ql;
import org.telegram.ui.ud;
import org.telegram.ui.vd;
public final class m0 implements Runnable {
    public final int f3354a;
    public final int f3355b;
    public final Object f3356c;

    public m0(int i7, Object obj, int i10) {
        this.f3354a = i10;
        this.f3355b = i7;
        this.f3356c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9;
        int i7;
        int i10;
        int i11 = this.f3354a;
        boolean z10 = false;
        int i12 = this.f3355b;
        Object obj = this.f3356c;
        switch (i11) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", p10.i(i12).f24489n);
                ((q4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ConnectionsManager.getInstance(((ea) obj).f3807a).cancelRequest(i12, true);
                return;
            case 2:
                ch.f fVar = (ch.f) obj;
                if (fVar.f6237b) {
                    c20 c20Var = fVar.d;
                    if (c20Var != null) {
                        if (i12 < 300) {
                            z10 = true;
                        }
                        c20Var.a(Boolean.valueOf(z10));
                        try {
                            fVar.f6236a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f6238c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.i3(new m0(fVar, max, 2), max);
                    return;
                }
                return;
            case 3:
                z6 z6Var = (z6) obj;
                ArrayList arrayList3 = z6Var.f9997g;
                z6Var.v(arrayList3);
                s5 s5Var = z6Var.J;
                Collections.sort(arrayList3, s5Var);
                ArrayList arrayList4 = z6Var.h;
                z6Var.v(arrayList4);
                Collections.sort(arrayList4, s5Var);
                qs.f(i12).k(324, new Object[0]);
                return;
            case 4:
                ((f2.f) obj).f10903b.onAudioFocusChange(i12);
                return;
            case 5:
                ((fi.o) obj).a(Integer.valueOf(i12));
                return;
            case 6:
                ((c20) obj).a(Integer.valueOf(i12));
                return;
            case 7:
                ((k2) obj).M0(i12);
                return;
            case 8:
                qp.s1(i12).Y3((ArrayList) obj, true);
                return;
            case 9:
                va vaVar = (va) obj;
                int i13 = vaVar.f12942c;
                vaVar.l();
                vaVar.X1 = false;
                File file = vaVar.K1.O0;
                if (file != null) {
                    file.delete();
                    vaVar.K1.O0 = null;
                }
                vaVar.V(vaVar.K1, true);
                CharSequence[] charSequenceArr = {vaVar.f12944c1.getText()};
                if (qp.s1(i13).X4()) {
                    arrayList = ui.b0(i13).W(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {vaVar.K1.C0};
                if (qp.s1(i13).X4()) {
                    arrayList2 = ui.b0(i13).W(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                e7 e7Var = vaVar.K1;
                if (TextUtils.equals(e7Var.C0, charSequenceArr[0]) && ui.K(arrayList, arrayList2)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                e7Var.f11899k = z9;
                vaVar.K1.C0 = new SpannableString(vaVar.f12944c1.getText());
                vaVar.y();
                vaVar.x();
                e7 e7Var2 = vaVar.K1;
                if (e7Var2 != null && e7Var2.K) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                vaVar.O1 = i7;
                vaVar.K1 = (e7) vaVar.H1.get(i12);
                vaVar.N(0, 1);
                vaVar.M(0, 1);
                vaVar.f12947d1.f11667b.f37556f3.O(false);
                vaVar.f12944c1.setText(vaVar.K1.C0);
                return;
            case 10:
                ((jg.h0) obj).g(i12);
                return;
            case 11:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17049a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 12:
                try {
                    SQLiteDatabase sQLiteDatabase = ((yr) obj).f26721b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 13:
                m2.e eVar = ((l2.r0) obj).M;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1034, new m2.c(Q, i12, 8, (char) 0));
                return;
            case 14:
                li.c0 c0Var = (li.c0) obj;
                li.f0 f0Var = c0Var.f18498f;
                if (c0Var.f18496c && f0Var.E != null && f0Var.f18989a != null) {
                    c0Var.d = true;
                    c0Var.f18494a.m(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    li.d0 d0Var = f0Var.E;
                    li.a aVar = f0Var.f18989a;
                    t3 t3Var = ((l3) d0Var).f18689a;
                    t3Var.r3(false);
                    t3Var.f18890o3.z(new q3(t3Var, aVar, i12), c0Var);
                    return;
                }
                return;
            case 15:
                String str = h2.m0.f14112a;
                h2.c cVar = ((l2.c0) ((n2.s) ((j2.n) obj).f16457c)).f17772a.C;
                l2.u uVar = new l2.u(i12, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f14059c).f14096a.getLooper()) {
                    z10 = true;
                }
                ia.p(z10);
                cVar.f14057a++;
                cVar.A(new f2.h(24, cVar, uVar));
                Integer num = (Integer) cVar.f14060e;
                cVar.G(Integer.valueOf(i12));
                return;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 17:
                qp.s1(i12).V2(0, ((TLRPC.Chat) obj).f26956id, true);
                return;
            case 18:
                ((p4) ((org.telegram.ui.f) obj).f45545b).a0(i12, true);
                return;
            case 19:
                q1 q1Var = ((e1) obj).f29050a;
                int i14 = q1Var.M5;
                if (i12 == i14) {
                    org.telegram.ui.Cells.c0 c0Var2 = (org.telegram.ui.Cells.c0) q1Var.H5.get(i14);
                    if (c0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = c0Var2.f28971s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (!q1Var.P5.f23281p1) {
                            if (c0Var2.f28962j != null) {
                                q1Var.n();
                            } else if (c0Var2.f28961i != null) {
                                q1Var.n();
                                l1 l1Var = q1Var.Ra;
                                if (l1Var != null) {
                                    l1Var.v1(q1Var, c0Var2.f28961i);
                                }
                            }
                        }
                    }
                    q1Var.M5 = -1;
                    q1Var.p2();
                    return;
                }
                return;
            case 20:
                vd vdVar = ((ud) obj).f50381f;
                vdVar.getClass();
                vdVar.c(i12);
                return;
            case 21:
                cn cnVar = ((ii) obj).f46673g;
                if (cnVar.Yb == i12) {
                    cnVar.ob();
                    return;
                }
                return;
            case 22:
                cn cnVar2 = ((ji) obj).f46974g;
                if (cnVar2.Yb == i12) {
                    cnVar2.ob();
                    return;
                }
                return;
            case 23:
                ((pi) obj).f48717a.l(this.f3355b, 0, true, 0, true, 0);
                return;
            case 24:
                cn cnVar3 = ((ii) obj).f46673g;
                if (cnVar3.Yb == i12) {
                    cnVar3.ob();
                    return;
                }
                return;
            case 25:
                cn cnVar4 = ((ji) obj).f46974g;
                if (cnVar4.Yb == i12) {
                    cnVar4.ob();
                    return;
                }
                return;
            case 26:
                cn cnVar5 = ((ji) obj).f46974g;
                if (cnVar5.Yb == i12) {
                    cnVar5.ob();
                    return;
                }
                return;
            case 27:
                cn cnVar6 = ((ql) obj).f49088w0;
                cnVar6.B0.h1(i12, cnVar6.M4);
                return;
            case 28:
                i10 = ((f2) ((nm) obj).f48207a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                return;
            default:
                qs.f(i12).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new r1((qr) obj, 1), 250L);
                return;
        }
    }

    public m0(Object obj, int i7, int i10) {
        this.f3354a = i10;
        this.f3356c = obj;
        this.f3355b = i7;
    }
}
