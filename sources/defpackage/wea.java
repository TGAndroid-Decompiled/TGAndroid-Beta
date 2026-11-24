package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class wea extends n39 {
    public final Context c;
    public final int d;
    public final wjb e;
    public final uea f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public sca r;
    public final nfa s;

    public wea(nfa nfaVar, Context context, int i, wjb wjbVar) {
        this.s = nfaVar;
        this.c = context;
        this.d = i;
        this.e = wjbVar;
        this.f = new uea(this, i, wjbVar);
        E();
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c = this.s.w1[8].c();
        int i = 0;
        for (int i2 = 0; i2 < c.size(); i2++) {
            k27 k27Var = (k27) c.get(i2);
            if (k27Var.X != i) {
                int i3 = k27Var.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j = i3;
                tL_message.message = k96.u(j, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                k27 k27Var2 = new k27(this.d, tL_message, false, false);
                k27Var2.D = 10;
                k27Var2.U = 1;
                k27Var2.l0 = true;
                arrayList.add(k27Var2);
                i = k27Var.X;
            }
            arrayList.add(k27Var);
        }
    }

    @Override
    public final int b() {
        return this.n.size();
    }

    @Override
    public final int d(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                return ((k27) arrayList.get(i)).U;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                k27 k27Var = (k27) arrayList.get(i);
                int i2 = s49Var.f;
                View view = s49Var.a;
                if (i2 == 0) {
                    ((gb2) view).z3(k27Var, null, false, false, false, false);
                } else {
                    ((uk1) view).setMessageObject(k27Var);
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        if (i == 0) {
            vea veaVar = new vea(this.c, this.d, false, null, this.e);
            veaVar.setDelegate(this.f);
            return new s49(veaVar);
        }
        return new s49(new uk1(this.e, this.c, false));
    }
}
