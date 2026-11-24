package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class noa implements Runnable {
    public final byte a;
    public final vqa b;
    public final String c;

    public noa(vqa vqaVar, String str, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                vqa vqaVar = this.b;
                String str = this.c;
                Context context = vqaVar.getContext();
                d01.v(context, na7.q1(vqaVar.a).k4.G1.f + str, false);
                return;
            case 1:
                vqa vqaVar2 = this.b;
                String str2 = this.c;
                long j = vqaVar2.S1;
                vqaVar2.f2.setLoading(false);
                if (!TextUtils.isEmpty(str2)) {
                    vqaVar2.dismiss();
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof mu1) {
                            mu1 mu1Var = (mu1) Q;
                            if (mu1Var.a() == j) {
                                u21.b0(mu1Var).I(2131624034, k96.M0(2131744859, null), gl.T2(k96.a0(null, null, 2131744857, cf3.s(j)))).k(true);
                                return;
                            }
                        }
                        kk7 f = kk7.f(vqaVar2.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        kk7.f(vqaVar2.a).k(5, Long.valueOf(j), bool);
                        mu1 U9 = mu1.U9(j);
                        U9.whenFullyVisible(new t7a(vqaVar2, U9, (byte) 18));
                        Q.presentFragment(U9);
                        return;
                    }
                    return;
                }
                vqaVar2.z2(0, true, null);
                return;
            case 2:
                vqa vqaVar3 = this.b;
                String str3 = this.c;
                Context context2 = vqaVar3.getContext();
                d01.v(context2, na7.q1(vqaVar3.a).k4.G1.f + str3, false);
                return;
            case 3:
                vqa vqaVar4 = this.b;
                String str4 = this.c;
                Context context3 = vqaVar4.getContext();
                d01.v(context3, na7.q1(vqaVar4.a).k4.G1.f + str4, false);
                return;
            case 4:
                vqa vqaVar5 = this.b;
                String str5 = this.c;
                Context context4 = vqaVar5.getContext();
                d01.v(context4, na7.q1(vqaVar5.a).k4.G1.f + str5, false);
                return;
            case 5:
                vqa vqaVar6 = this.b;
                String str6 = this.c;
                Context context5 = vqaVar6.getContext();
                d01.v(context5, na7.q1(vqaVar6.a).k4.G1.f + str6, false);
                return;
            case 6:
                vqa vqaVar7 = this.b;
                String str7 = this.c;
                Context context6 = vqaVar7.getContext();
                d01.v(context6, na7.q1(vqaVar7.a).k4.G1.f + str7, false);
                return;
            case 7:
                vqa vqaVar8 = this.b;
                gl.g(this.c);
                m21 k = vqaVar8.j().k(false);
                k.t = true;
                k.j();
                return;
            default:
                vqa vqaVar9 = this.b;
                String str8 = this.c;
                vqaVar9.dismiss();
                Context context7 = vqaVar9.getContext();
                d01.t(context7, "https://" + na7.q1(vqaVar9.a).N2 + "/" + str8);
                return;
        }
    }
}
