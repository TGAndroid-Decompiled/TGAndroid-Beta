package ji;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.fr0;
public final class r2 implements Runnable {
    public final int f13496a;
    public final int f13497b;
    public final boolean f13498c;
    public final Object d;
    public final Object e;
    public final Object f13499f;
    public final Object h;

    public r2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f13496a = 4;
        this.d = activity;
        this.f13497b = i10;
        this.e = inputGroupCall;
        this.f13498c = z10;
        this.f13499f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ji.r2.run():void");
    }

    public r2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f13496a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f13497b = i10;
        this.f13499f = obj2;
        this.h = obj3;
        this.f13498c = z10;
    }

    public r2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f13496a = 0;
        this.d = x3Var;
        this.e = uri;
        this.f13498c = z10;
        this.f13499f = str;
        this.f13497b = i10;
        this.h = aVar;
    }

    public r2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f13496a = 1;
        this.d = contactsController;
        this.f13497b = i10;
        this.e = arrayList;
        this.f13499f = arrayList2;
        this.h = hVar;
        this.f13498c = z10;
    }

    public r2(fr0 fr0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f13496a = 5;
        this.d = fr0Var;
        this.f13499f = str;
        this.f13497b = i10;
        this.e = tLObject;
        this.f13498c = z10;
        this.h = user;
    }

    public r2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f13496a = 6;
        this.d = k0Var;
        this.f13498c = z10;
        this.e = h0Var;
        this.f13499f = proofchallenge;
        this.f13497b = i10;
        this.h = callback2;
    }
}
