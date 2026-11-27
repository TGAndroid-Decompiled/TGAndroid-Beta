package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vy1 extends yc8 {
    public boolean a;
    public final no6 b;
    public final File c;
    public final wy1 d;

    public vy1(wy1 wy1Var, no6 no6Var, File file) {
        this.d = wy1Var;
        this.b = no6Var;
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
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        String str;
        r47 threadMessage;
        c5a c5aVar;
        String str2;
        zu1 zu1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.g2;
        ou1 ou1Var = chatActivityEnterView.K3;
        if (ou1Var != null && (zu1Var = chatActivityEnterView.E3) != null && ou1Var.f) {
            zu1Var.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        no6 no6Var = this.b;
        if (!no6Var.b && (str2 = no6Var.h) != null) {
            obj.c = str2;
        } else {
            String str3 = no6Var.I;
            if (str3 != null) {
                obj.c = str3;
            }
        }
        obj.e = no6Var.c;
        obj.p = no6Var.d();
        obj.o = no6Var.b;
        obj.q = no6Var.j();
        obj.z = no6Var.m;
        obj.A = no6Var.P;
        CharSequence charSequence = no6Var.a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.i = no6Var.n;
        obj.j = no6Var.r;
        obj.h = no6Var.x;
        obj.k = oecVar;
        obj.r = true;
        arrayList.add(obj);
        no6Var.e();
        this.a = true;
        boolean h = r7a.h(obj.d);
        k5 k5Var = chatActivityEnterView.S;
        b77 b77Var = null;
        long j = chatActivityEnterView.F3;
        r47 r47Var = chatActivityEnterView.I3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        ou1 ou1Var2 = chatActivityEnterView.K3;
        r47 r47Var2 = chatActivityEnterView.O2;
        zu1 zu1Var2 = chatActivityEnterView.E3;
        if (zu1Var2 != null) {
            c5aVar = zu1Var2.X6();
        } else {
            c5aVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        zu1 zu1Var3 = chatActivityEnterView.E3;
        if (zu1Var3 != null) {
            b77Var = zu1Var3.y5;
        }
        r7a.W(k5Var, arrayList, j, r47Var, threadMessage, null, ou1Var2, false, false, r47Var2, null, z, i2, i3, h, null, c5aVar, 0L, false, 0L, sendMonoForumPeerId, b77Var, null, false);
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.x(null, true, i2, i3, 0L);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }
}
