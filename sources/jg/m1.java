package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import di.k6;
import fi.h9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.oa;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.an;
public final class m1 extends oj0 implements ls {
    public k6 D;
    public final Context f16841c;
    public final an f16843f;
    public int h;
    public int f16844n;
    public final f6 f16846s;
    public final int f16847w;
    public final boolean f16848x;
    public String f16849y;
    public final HashSet d = new HashSet();
    public final ArrayList f16842e = new ArrayList();
    public final int f16845r = p10.f24470s0;
    public final h9 E = new h9(this, 21);

    public m1(Context context, an anVar, f6 f6Var, int i7, boolean z9) {
        this.f16846s = f6Var;
        this.f16841c = context;
        this.f16843f = anVar;
        this.f16847w = i7;
        this.f16848x = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 != 0 && i7 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f16842e;
            if (i7 < arrayList.size()) {
                return arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.f16842e.size() + this.f16844n;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.f16842e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25109x5 && objArr[0] == this.D) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.f16842e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.f16845r;
        int i10 = this.f16847w;
        if (i10 == 0) {
            arrayList = ui.b0(i7).Y0;
        } else {
            arrayList = oa.a(i7).b(i10).f24159a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ij ijVar = (ij) arrayList.get(i12);
            if ((!ijVar.A2() || ijVar.Q2) && !hashSet.contains(Integer.valueOf(ijVar.f1()))) {
                arrayList2.add(ijVar);
                hashSet.add(Integer.valueOf(ijVar.f1()));
            }
        }
        int i13 = this.f16844n;
        this.h = arrayList2.size();
        if (i10 != 0) {
            if (!oa.a(i7).b(i10).f24170n && this.h != 0) {
                i11 = Utilities.j(oa.a(i7).b(i10).f24169m - this.h, 3, 0);
            }
            this.f16844n = i11;
        } else {
            if (!ui.b0(i7).W1() && this.h != 0) {
                i11 = Utilities.j(ui.b0(i7).j0() - this.h, 3, 0);
            }
            this.f16844n = i11;
        }
        int b11 = b();
        if (b10 < b11) {
            if (i13 > 0) {
                k(b10 - i13, i13);
            }
            o(b10, b11 - b10);
            return;
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i12 == 0) {
            t2 t2Var = (t2) view;
            t2Var.f30480s2 = true;
            ij ijVar = (ij) E(i7);
            long B0 = ij.B0(ijVar.f23262k);
            int i13 = ijVar.f23262k.date;
            if (this.f16848x) {
                t2Var.f30472r0 = true;
                long Q1 = ijVar.Q1();
                TLRPC.Message message = ijVar.f23262k;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i10 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i10 == 0) {
                        i11 = messageFwdHeader.saved_date;
                    }
                    z9 = false;
                    B0 = Q1;
                } else {
                    i11 = message.date;
                }
                i10 = i11;
                z9 = false;
                B0 = Q1;
            } else {
                if (ijVar.Q3() || t3.o0(this.f16845r, B0)) {
                    B0 = ijVar.Z0();
                }
                z9 = true;
                i10 = i13;
            }
            t2Var.d0(B0, ijVar, i10, z9, false);
            t2Var.setDialogCellDelegate(new j1(this));
        } else if (i12 == 2) {
            ((l1) view).a(this.D);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View t2Var;
        mz mzVar;
        if (i7 != 0) {
            f6 f6Var = this.f16846s;
            Context context = this.f16841c;
            if (i7 != 1) {
                if (i7 != 2) {
                    t2Var = null;
                } else {
                    mzVar = new l1(context, f6Var);
                }
            } else {
                mz mzVar2 = new mz(context, f6Var);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(7);
                mzVar = mzVar2;
            }
            t2Var = mzVar;
        } else {
            t2Var = new t2(null, this.f16841c, true, this.f16845r, this.f16846s);
        }
        return g.r(t2Var, t2Var, -1, -2);
    }
}
