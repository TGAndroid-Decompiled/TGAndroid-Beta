package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fy1 extends i98 {
    public boolean a;
    public final jm6 b;
    public final File c;
    public final gy1 d;

    public fy1(gy1 gy1Var, jm6 jm6Var, File file) {
        this.d = gy1Var;
        this.b = jm6Var;
        this.c = file;
    }

    @Override
    public final void F() {
        if (!this.a) {
            try {
                this.c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        String str;
        k27 threadMessage;
        j1a j1aVar;
        String str2;
        mu1 mu1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        bu1 bu1Var = chatActivityEnterView.L3;
        if (bu1Var != null && (mu1Var = chatActivityEnterView.F3) != null && bu1Var.f) {
            mu1Var.gc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        jm6 jm6Var = this.b;
        if (!jm6Var.b && (str2 = jm6Var.h) != null) {
            obj.c = str2;
        } else {
            String str3 = jm6Var.I;
            if (str3 != null) {
                obj.c = str3;
            }
        }
        obj.e = jm6Var.c;
        obj.p = jm6Var.d();
        obj.o = jm6Var.b;
        obj.q = jm6Var.j();
        obj.z = jm6Var.m;
        obj.A = jm6Var.P;
        CharSequence charSequence = jm6Var.a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.i = jm6Var.n;
        obj.j = jm6Var.r;
        obj.h = jm6Var.x;
        obj.k = oacVar;
        obj.r = true;
        arrayList.add(obj);
        jm6Var.e();
        this.a = true;
        boolean h = z3a.h(obj.d);
        j5 j5Var = chatActivityEnterView.S;
        u47 u47Var = null;
        long j = chatActivityEnterView.G3;
        k27 k27Var = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        bu1 bu1Var2 = chatActivityEnterView.L3;
        k27 k27Var2 = chatActivityEnterView.P2;
        mu1 mu1Var2 = chatActivityEnterView.F3;
        if (mu1Var2 != null) {
            j1aVar = mu1Var2.O6();
        } else {
            j1aVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        mu1 mu1Var3 = chatActivityEnterView.F3;
        if (mu1Var3 != null) {
            u47Var = mu1Var3.y5;
        }
        z3a.W(j5Var, arrayList, j, k27Var, threadMessage, null, bu1Var2, false, false, k27Var2, null, z, i2, i3, h, null, j1aVar, 0L, false, 0L, sendMonoForumPeerId, u47Var, null, false);
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.u(null, true, i2, i3, 0L);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }
}
