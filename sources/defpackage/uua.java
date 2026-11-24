package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uua implements qac {
    public final jva a;
    public final long b;
    public final int c;
    public final boolean[] d;
    public final jac e;
    public final Context f;
    public final ylb g;
    public final TLRPC.ChatInvite h;
    public final String i;

    public uua(jva jvaVar, long j, int i, boolean[] zArr, jac jacVar, Context context, ylb ylbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = jvaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = jacVar;
        this.f = context;
        this.g = ylbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        qac qacVar = (qac) obj;
        jva jvaVar = this.a;
        long j = jvaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.d;
        jac jacVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (i < 0) {
            boolean c5 = oc7.r1(this.c).c5();
            Context context = this.f;
            ylb ylbVar = this.g;
            if (!c5) {
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    jacVar.a("cancelled", 0L);
                    zArr[0] = true;
                }
                jva.c0(context, ylbVar);
                return;
            }
            boolean[] zArr2 = {false};
            dxa dxaVar = new dxa(context, ylbVar, j2, 1, chatInvite.title, new ja7(jvaVar, zArr2, str, chatInvite, zArr, jacVar, qacVar, (byte) 18), 0L);
            dxaVar.setOnDismissListener(new lv0(jvaVar, qacVar, zArr2, zArr, jacVar, (byte) 2));
            dxaVar.show();
            return;
        }
        jvaVar.Y(str, chatInvite, new mta(qacVar, zArr, jacVar));
    }
}
