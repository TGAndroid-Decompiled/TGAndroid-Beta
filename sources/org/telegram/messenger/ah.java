package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ah implements Runnable {
    public final int f22987a = 1;
    public final boolean f22988b;
    public final Object f22989c;
    public final c1 d;
    public final Object f22990e;
    public final Object f22991f;
    public final Object h;
    public final Object f22992n;
    public final Object f22993r;

    public ah(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = i5Var;
        this.f22990e = hashMap;
        this.f22991f = hashMap2;
        this.f22988b = z10;
        this.h = hashMap3;
        this.f22989c = arrayList;
        this.f22992n = hashMap4;
        this.f22993r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f22987a) {
            case 0:
                ri riVar = (ri) this.d;
                boolean z11 = this.f22988b;
                ArrayList arrayList = (ArrayList) this.f22991f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f22992n;
                a0.h hVar2 = (a0.h) this.f22993r;
                riVar.getMessagesController().f4((ArrayList) this.f22989c, z11);
                riVar.getMessagesController().Z3((ArrayList) this.f22990e, z11);
                int size = arrayList.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if ((fj.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    int i11 = riVar.currentAccount;
                    if (i7 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new fj(i11, message, hVar, hVar2, false, z10));
                }
                g0.g3(new jh(riVar, arrayList2, 0));
                return;
            case 1:
                i5 i5Var = (i5) this.d;
                boolean z12 = this.f22988b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f22989c;
                HashMap hashMap2 = (HashMap) this.f22992n;
                boolean[] zArr = (boolean[]) this.f22993r;
                i5Var.f24684a0 = (HashMap) this.f22990e;
                i5Var.Z = (HashMap) this.f22991f;
                i5Var.f24690e = false;
                i5Var.f24702r = true;
                if (z12) {
                    i5Var.h = true;
                }
                if (!i5Var.f24705x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.f24705x, null, null, null);
                    i5Var.f24705x.clear();
                }
                g0.g3(new w4(i5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.f22877e.d(new m4(i5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                zy zyVar = (zy) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22989c;
                TLObject tLObject = (TLObject) this.f22990e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f22991f;
                boolean z13 = this.f22988b;
                fj fjVar = (fj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f22992n;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f22993r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    zyVar.n0(z13, fjVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, bnVar);
                    return;
                }
                return;
        }
    }

    public ah(ri riVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = riVar;
        this.f22989c = arrayList;
        this.f22988b = z10;
        this.f22990e = arrayList2;
        this.f22991f = arrayList3;
        this.h = arrayList4;
        this.f22992n = hVar;
        this.f22993r = hVar2;
    }

    public ah(zy zyVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, fj fjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.bn bnVar) {
        this.d = zyVar;
        this.f22989c = tL_error;
        this.f22990e = tLObject;
        this.f22991f = twoStepVerificationActivity;
        this.f22988b = z10;
        this.h = fjVar;
        this.f22992n = keyboardButtonProto;
        this.f22993r = bnVar;
    }
}
