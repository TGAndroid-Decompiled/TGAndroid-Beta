package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class bh implements Runnable {
    public final int f23091a = 2;
    public final boolean f23092b;
    public final Object f23093c;
    public final c1 d;
    public final Object f23094e;
    public final Object f23095f;
    public final Object h;
    public final Object f23096n;
    public final Object f23097r;

    public bh(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = i5Var;
        this.f23094e = hashMap;
        this.f23095f = hashMap2;
        this.f23092b = z10;
        this.h = hashMap3;
        this.f23093c = arrayList;
        this.f23096n = hashMap4;
        this.f23097r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f23091a) {
            case 0:
                si siVar = (si) this.d;
                boolean z11 = this.f23092b;
                ArrayList arrayList = (ArrayList) this.f23095f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f23096n;
                a0.h hVar2 = (a0.h) this.f23097r;
                siVar.getMessagesController().f4((ArrayList) this.f23093c, z11);
                siVar.getMessagesController().Z3((ArrayList) this.f23094e, z11);
                int size = arrayList.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if ((gj.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    int i11 = siVar.currentAccount;
                    if (i7 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new gj(i11, message, hVar, hVar2, false, z10));
                }
                g0.g3(new kh(siVar, arrayList2, 0));
                return;
            case 1:
                i5 i5Var = (i5) this.d;
                boolean z12 = this.f23092b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f23093c;
                HashMap hashMap2 = (HashMap) this.f23096n;
                boolean[] zArr = (boolean[]) this.f23097r;
                i5Var.f24596a0 = (HashMap) this.f23094e;
                i5Var.Z = (HashMap) this.f23095f;
                i5Var.f24602e = false;
                i5Var.f24614r = true;
                if (z12) {
                    i5Var.h = true;
                }
                if (!i5Var.f24617x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.f24617x, null, null, null);
                    i5Var.f24617x.clear();
                }
                g0.g3(new w4(i5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.f22810e.d(new m4(i5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                az azVar = (az) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f23093c;
                TLObject tLObject = (TLObject) this.f23094e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f23095f;
                boolean z13 = this.f23092b;
                gj gjVar = (gj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f23096n;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f23097r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    azVar.n0(z13, gjVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, bnVar);
                    return;
                }
                return;
        }
    }

    public bh(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = siVar;
        this.f23093c = arrayList;
        this.f23092b = z10;
        this.f23094e = arrayList2;
        this.f23095f = arrayList3;
        this.h = arrayList4;
        this.f23096n = hVar;
        this.f23097r = hVar2;
    }

    public bh(az azVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.bn bnVar) {
        this.d = azVar;
        this.f23093c = tL_error;
        this.f23094e = tLObject;
        this.f23095f = twoStepVerificationActivity;
        this.f23092b = z10;
        this.h = gjVar;
        this.f23096n = keyboardButtonProto;
        this.f23097r = bnVar;
    }
}
