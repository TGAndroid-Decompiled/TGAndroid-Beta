package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class rg implements Runnable {
    public final int f25129a = 1;
    public final boolean f25130b;
    public final Object f25131c;
    public final c1 d;
    public final Object f25132e;
    public final Object f25133f;
    public final Object h;
    public final Object f25134n;
    public final Object f25135r;

    public rg(g5 g5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = g5Var;
        this.f25132e = hashMap;
        this.f25133f = hashMap2;
        this.f25130b = z10;
        this.h = hashMap3;
        this.f25131c = arrayList;
        this.f25134n = hashMap4;
        this.f25135r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f25129a) {
            case 0:
                li liVar = (li) this.d;
                boolean z11 = this.f25130b;
                ArrayList arrayList = (ArrayList) this.f25133f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f25134n;
                a0.h hVar2 = (a0.h) this.f25135r;
                liVar.getMessagesController().Y3((ArrayList) this.f25131c, z11);
                liVar.getMessagesController().S3((ArrayList) this.f25132e, z11);
                int size = arrayList.size();
                int i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if ((zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i3++;
                    }
                    int i11 = liVar.currentAccount;
                    if (i3 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new zi(i11, message, hVar, hVar2, false, z10));
                }
                g0.h3(new ah(liVar, arrayList2, 0));
                return;
            case 1:
                g5 g5Var = (g5) this.d;
                boolean z12 = this.f25130b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f25131c;
                HashMap hashMap2 = (HashMap) this.f25134n;
                boolean[] zArr = (boolean[]) this.f25135r;
                g5Var.f22644a0 = (HashMap) this.f25132e;
                g5Var.Z = (HashMap) this.f25133f;
                g5Var.f22650e = false;
                g5Var.f22662r = true;
                if (z12) {
                    g5Var.h = true;
                }
                if (!g5Var.f22665x.isEmpty() && g5Var.h) {
                    g5Var.c(g5Var.f22665x, null, null, null);
                    g5Var.f22665x.clear();
                }
                g0.h3(new v4(g5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.f21387e.e(new x4(g5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                yy yyVar = (yy) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25131c;
                TLObject tLObject = (TLObject) this.f25132e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f25133f;
                boolean z13 = this.f25130b;
                zi ziVar = (zi) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f25134n;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.f25135r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    yyVar.n0(z13, ziVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, wmVar);
                    return;
                }
                return;
        }
    }

    public rg(li liVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = liVar;
        this.f25131c = arrayList;
        this.f25130b = z10;
        this.f25132e = arrayList2;
        this.f25133f = arrayList3;
        this.h = arrayList4;
        this.f25134n = hVar;
        this.f25135r = hVar2;
    }

    public rg(yy yyVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, zi ziVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.wm wmVar) {
        this.d = yyVar;
        this.f25131c = tL_error;
        this.f25132e = tLObject;
        this.f25133f = twoStepVerificationActivity;
        this.f25130b = z10;
        this.h = ziVar;
        this.f25134n = keyboardButtonProto;
        this.f25135r = wmVar;
    }
}
