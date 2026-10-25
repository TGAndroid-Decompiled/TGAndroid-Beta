package li;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.rq0;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;
public final class p2 implements Runnable {
    public final int f17405a;
    public final int f17406b;
    public final boolean f17407c;
    public final Object d;
    public final Object e;
    public final Object f17408f;
    public final Object h;

    public p2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f17405a = 4;
        this.d = activity;
        this.f17406b = i10;
        this.e = inputGroupCall;
        this.f17407c = z10;
        this.f17408f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.p2.run():void");
    }

    public p2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f17405a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17406b = i10;
        this.f17408f = obj2;
        this.h = obj3;
        this.f17407c = z10;
    }

    public p2(v3 v3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f17405a = 0;
        this.d = v3Var;
        this.e = uri;
        this.f17407c = z10;
        this.f17408f = str;
        this.f17406b = i10;
        this.h = aVar;
    }

    public p2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f17405a = 1;
        this.d = contactsController;
        this.f17406b = i10;
        this.e = arrayList;
        this.f17408f = arrayList2;
        this.h = hVar;
        this.f17407c = z10;
    }

    public p2(xj0 xj0Var, vj0 vj0Var, int i10, String str, boolean z10, TLObject tLObject) {
        this.f17405a = 5;
        this.d = xj0Var;
        this.e = vj0Var;
        this.f17406b = i10;
        this.f17408f = str;
        this.f17407c = z10;
        this.h = tLObject;
    }

    public p2(rq0 rq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f17405a = 6;
        this.d = rq0Var;
        this.f17408f = str;
        this.f17406b = i10;
        this.e = tLObject;
        this.f17407c = z10;
        this.h = user;
    }

    public p2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f17405a = 7;
        this.d = l0Var;
        this.f17407c = z10;
        this.e = i0Var;
        this.f17408f = proofchallenge;
        this.f17406b = i10;
        this.h = callback2;
    }
}
