package defpackage;

import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l6a implements RequestDelegate {
    public final byte a = 2;
    public final r7a b;
    public final Object c;
    public final r47 d;
    public final String e;
    public final Object f;
    public final boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final boolean k;
    public final Object l;

    public l6a(r7a r7aVar, String str, List list, boolean z, r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zu1 zu1Var, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, boolean z2) {
        this.b = r7aVar;
        this.e = str;
        this.l = list;
        this.g = z;
        this.d = r47Var;
        this.c = keyboardButtonProto;
        this.f = zu1Var;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = tL_inputCheckPasswordSRP;
        this.k = z2;
    }

    @Override
    public final void run(final org.telegram.tgnet.TLObject r21, final org.telegram.tgnet.TLRPC.TL_error r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public l6a(r7a r7aVar, TLObject tLObject, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2, TLRPC.Message message) {
        this.b = r7aVar;
        this.c = tLObject;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.g = z;
        this.h = d7aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
        this.l = message;
    }

    public l6a(r7a r7aVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = r7aVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.g = z;
        this.h = d7aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
    }
}
