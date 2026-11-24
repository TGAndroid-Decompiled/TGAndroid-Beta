package defpackage;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;
public final class cu0 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final boolean[] b;
    public final Object c;
    public final Object d;
    public final Object e;

    public cu0(hv0 hv0Var, boolean[] zArr, ev0 ev0Var, String str) {
        this.a = (byte) 0;
        this.c = hv0Var;
        this.b = zArr;
        this.d = ev0Var;
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
                hv0 hv0Var = (hv0) obj3;
                ev0 ev0Var = (ev0) obj2;
                String str = (String) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                    return;
                }
                return;
            case 1:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj3;
                fx0[] fx0VarArr = (fx0[]) obj2;
                fx0[] fx0VarArr2 = (fx0[]) obj;
                zArr[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    fx0VarArr[0] = null;
                }
                un7.a = null;
                fx0 fx0Var2 = fx0VarArr2[0];
                if (fx0Var2 != null) {
                    fx0Var2.dismiss();
                    fx0VarArr2[0] = null;
                    return;
                }
                return;
            case 2:
                p8c p8cVar = (p8c) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                i8c i8cVar = (i8c) obj;
                if (p8cVar != null && !zArr[0]) {
                    p8cVar.a(Boolean.FALSE);
                    if (!zArr2[0]) {
                        i8cVar.a("cancelled", 0L);
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                p8c p8cVar2 = (p8c) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                p8c p8cVar3 = (p8c) obj;
                if (p8cVar2 != null && !zArr[0]) {
                    p8cVar2.a(Boolean.FALSE);
                    if (!zArr3[0] && p8cVar3 != null) {
                        p8cVar3.a("cancelled");
                        zArr3[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cu0(gta gtaVar, p8c p8cVar, boolean[] zArr, boolean[] zArr2, Object obj, byte b) {
        this.a = b;
        this.c = p8cVar;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public cu0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, fx0[] fx0VarArr, fx0[] fx0VarArr2) {
        this.a = (byte) 1;
        this.b = zArr;
        this.c = inputtonconnectoauthsessionArr;
        this.d = fx0VarArr;
        this.e = fx0VarArr2;
    }
}
