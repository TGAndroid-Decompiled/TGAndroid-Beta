package defpackage;

import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k4a implements RequestDelegate {
    public final byte a = 2;
    public final a6a b;
    public final Object c;
    public final k47 d;
    public final String e;
    public final Object f;
    public final boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final boolean k;
    public final Object l;

    public k4a(a6a a6aVar, String str, List list, boolean z, k47 k47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yv1 yv1Var, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, boolean z2) {
        this.b = a6aVar;
        this.e = str;
        this.l = list;
        this.g = z;
        this.d = k47Var;
        this.c = keyboardButtonProto;
        this.f = yv1Var;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = tL_inputCheckPasswordSRP;
        this.k = z2;
    }

    @Override
    public final void run(final org.telegram.tgnet.TLObject r21, final org.telegram.tgnet.TLRPC.TL_error r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public k4a(a6a a6aVar, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2, TLRPC.Message message) {
        this.b = a6aVar;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.g = z;
        this.h = m5aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
        this.l = message;
    }

    public k4a(a6a a6aVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = a6aVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.g = z;
        this.h = m5aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
    }
}
