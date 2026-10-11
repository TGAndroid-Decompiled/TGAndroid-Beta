package ii;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ar0;
public final class s2 implements Runnable {
    public final int f12672a;
    public final int f12673b;
    public final boolean f12674c;
    public final Object d;
    public final Object f12675e;
    public final Object f12676f;
    public final Object h;

    public s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f12672a = 4;
        this.d = activity;
        this.f12673b = i10;
        this.f12675e = inputGroupCall;
        this.f12674c = z10;
        this.f12676f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.s2.run():void");
    }

    public s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f12672a = 0;
        this.d = x3Var;
        this.f12675e = uri;
        this.f12674c = z10;
        this.f12676f = str;
        this.f12673b = i10;
        this.h = aVar;
    }

    public s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f12672a = i11;
        this.d = obj;
        this.f12675e = tLObject;
        this.f12673b = i10;
        this.f12676f = obj2;
        this.h = obj3;
        this.f12674c = z10;
    }

    public s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f12672a = 1;
        this.d = contactsController;
        this.f12673b = i10;
        this.f12675e = arrayList;
        this.f12676f = arrayList2;
        this.h = iVar;
        this.f12674c = z10;
    }

    public s2(ar0 ar0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f12672a = 5;
        this.d = ar0Var;
        this.f12676f = str;
        this.f12673b = i10;
        this.f12675e = tLObject;
        this.f12674c = z10;
        this.h = user;
    }

    public s2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f12672a = 6;
        this.d = l0Var;
        this.f12674c = z10;
        this.f12675e = i0Var;
        this.f12676f = proofchallenge;
        this.f12673b = i10;
        this.h = callback2;
    }
}
