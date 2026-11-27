package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wwa implements pcc {
    public final jxa a;
    public final long b;
    public final int c;
    public final boolean[] d;
    public final icc e;
    public final Context f;
    public final vnb g;
    public final TLRPC.ChatInvite h;
    public final String i;

    public wwa(jxa jxaVar, long j, int i, boolean[] zArr, icc iccVar, Context context, vnb vnbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = jxaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = iccVar;
        this.f = context;
        this.g = vnbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        pcc pccVar = (pcc) obj;
        jxa jxaVar = this.a;
        long j = jxaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.d;
        icc iccVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (i < 0) {
            boolean i5 = uc7.s1(this.c).i5();
            Context context = this.f;
            vnb vnbVar = this.g;
            if (!i5) {
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    iccVar.a("cancelled", 0L);
                    zArr[0] = true;
                }
                jxa.d0(context, vnbVar);
                return;
            }
            boolean[] zArr2 = {false};
            dza dzaVar = new dza(context, vnbVar, j2, 1, chatInvite.title, new ra7(jxaVar, zArr2, str, chatInvite, zArr, iccVar, pccVar, (byte) 18), 0L);
            dzaVar.setOnDismissListener(new mu0(jxaVar, pccVar, zArr2, zArr, iccVar, (byte) 2));
            dzaVar.show();
            return;
        }
        jxaVar.Z(str, chatInvite, new nva(pccVar, zArr, iccVar));
    }
}
