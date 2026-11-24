package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sz1 extends jb8 {
    public boolean a;
    public final jo6 b;
    public final File c;
    public final tz1 d;

    public sz1(tz1 tz1Var, jo6 jo6Var, File file) {
        this.d = tz1Var;
        this.b = jo6Var;
        this.c = file;
    }

    @Override
    public final void G() {
        if (!this.a) {
            try {
                this.c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        String str;
        k47 threadMessage;
        l3a l3aVar;
        String str2;
        yv1 yv1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        nv1 nv1Var = chatActivityEnterView.L3;
        if (nv1Var != null && (yv1Var = chatActivityEnterView.F3) != null && nv1Var.f) {
            yv1Var.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        jo6 jo6Var = this.b;
        if (!jo6Var.b && (str2 = jo6Var.h) != null) {
            obj.c = str2;
        } else {
            String str3 = jo6Var.I;
            if (str3 != null) {
                obj.c = str3;
            }
        }
        obj.e = jo6Var.c;
        obj.p = jo6Var.d();
        obj.o = jo6Var.b;
        obj.q = jo6Var.j();
        obj.z = jo6Var.m;
        obj.A = jo6Var.P;
        CharSequence charSequence = jo6Var.a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.i = jo6Var.n;
        obj.j = jo6Var.r;
        obj.h = jo6Var.x;
        obj.k = rccVar;
        obj.r = true;
        arrayList.add(obj);
        jo6Var.e();
        this.a = true;
        boolean h = a6a.h(obj.d);
        j5 j5Var = chatActivityEnterView.S;
        v67 v67Var = null;
        long j = chatActivityEnterView.G3;
        k47 k47Var = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        nv1 nv1Var2 = chatActivityEnterView.L3;
        k47 k47Var2 = chatActivityEnterView.P2;
        yv1 yv1Var2 = chatActivityEnterView.F3;
        if (yv1Var2 != null) {
            l3aVar = yv1Var2.X6();
        } else {
            l3aVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        yv1 yv1Var3 = chatActivityEnterView.F3;
        if (yv1Var3 != null) {
            v67Var = yv1Var3.y5;
        }
        a6a.W(j5Var, arrayList, j, k47Var, threadMessage, null, nv1Var2, false, false, k47Var2, null, z, i2, i3, h, null, l3aVar, 0L, false, 0L, sendMonoForumPeerId, v67Var, null, false);
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.w(null, true, i2, i3, 0L);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }
}
