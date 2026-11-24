package defpackage;

import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i2a implements RequestDelegate {
    public final byte a = 2;
    public final z3a b;
    public final Object c;
    public final k27 d;
    public final String e;
    public final Object f;
    public final boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final boolean k;
    public final Object l;

    public i2a(z3a z3aVar, String str, List list, boolean z, k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, mu1 mu1Var, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, boolean z2) {
        this.b = z3aVar;
        this.e = str;
        this.l = list;
        this.g = z;
        this.d = k27Var;
        this.c = keyboardButtonProto;
        this.f = mu1Var;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = tL_inputCheckPasswordSRP;
        this.k = z2;
    }

    @Override
    public final void run(final org.telegram.tgnet.TLObject r21, final org.telegram.tgnet.TLRPC.TL_error r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public i2a(z3a z3aVar, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2, TLRPC.Message message) {
        this.b = z3aVar;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.g = z;
        this.h = k3aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
        this.l = message;
    }

    public i2a(z3a z3aVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = z3aVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.g = z;
        this.h = k3aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
    }
}
