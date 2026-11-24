package defpackage;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;
public final class lv0 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final boolean[] b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lv0(qw0 qw0Var, boolean[] zArr, ow0 ow0Var, String str) {
        this.a = (byte) 0;
        this.c = qw0Var;
        this.b = zArr;
        this.d = ow0Var;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean[] zArr = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                qw0 qw0Var = (qw0) obj3;
                ow0 ow0Var = (ow0) obj2;
                String str = (String) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                    return;
                }
                return;
            case 1:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj3;
                my0[] my0VarArr = (my0[]) obj2;
                my0[] my0VarArr2 = (my0[]) obj;
                zArr[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    my0VarArr[0] = null;
                }
                xp7.a = null;
                my0 my0Var2 = my0VarArr2[0];
                if (my0Var2 != null) {
                    my0Var2.dismiss();
                    my0VarArr2[0] = null;
                    return;
                }
                return;
            case 2:
                qac qacVar = (qac) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                jac jacVar = (jac) obj;
                if (qacVar != null && !zArr[0]) {
                    qacVar.a(Boolean.FALSE);
                    if (!zArr2[0]) {
                        jacVar.a("cancelled", 0L);
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                qac qacVar2 = (qac) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                qac qacVar3 = (qac) obj;
                if (qacVar2 != null && !zArr[0]) {
                    qacVar2.a(Boolean.FALSE);
                    if (!zArr3[0] && qacVar3 != null) {
                        qacVar3.a("cancelled");
                        zArr3[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lv0(jva jvaVar, qac qacVar, boolean[] zArr, boolean[] zArr2, Object obj, byte b) {
        this.a = b;
        this.c = qacVar;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public lv0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, my0[] my0VarArr, my0[] my0VarArr2) {
        this.a = (byte) 1;
        this.b = zArr;
        this.c = inputtonconnectoauthsessionArr;
        this.d = my0VarArr;
        this.e = my0VarArr2;
    }
}
