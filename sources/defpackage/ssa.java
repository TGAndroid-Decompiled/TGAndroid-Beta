package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ssa implements p8c {
    public final gta a;
    public final long b;
    public final int c;
    public final boolean[] d;
    public final i8c e;
    public final Context f;
    public final wjb g;
    public final TLRPC.ChatInvite h;
    public final String i;

    public ssa(gta gtaVar, long j, int i, boolean[] zArr, i8c i8cVar, Context context, wjb wjbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = gtaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = i8cVar;
        this.f = context;
        this.g = wjbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        p8c p8cVar = (p8c) obj;
        gta gtaVar = this.a;
        long j = gtaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.d;
        i8c i8cVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (i < 0) {
            boolean a5 = na7.q1(this.c).a5();
            Context context = this.f;
            wjb wjbVar = this.g;
            if (!a5) {
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    i8cVar.a("cancelled", 0L);
                    zArr[0] = true;
                }
                gta.c0(context, wjbVar);
                return;
            }
            boolean[] zArr2 = {false};
            zua zuaVar = new zua(context, wjbVar, j2, 1, chatInvite.title, new i87(gtaVar, zArr2, str, chatInvite, zArr, i8cVar, p8cVar, (byte) 18), 0L);
            zuaVar.setOnDismissListener(new cu0(gtaVar, p8cVar, zArr2, zArr, i8cVar, (byte) 2));
            zuaVar.show();
            return;
        }
        gtaVar.Y(str, chatInvite, new lra(p8cVar, zArr, i8cVar));
    }
}
