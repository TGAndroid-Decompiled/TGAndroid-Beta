package ki;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lq0;
public final class r2 implements Runnable {
    public final int f15544a;
    public final int f15545b;
    public final boolean f15546c;
    public final Object d;
    public final Object e;
    public final Object f15547f;
    public final Object h;

    public r2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f15544a = 4;
        this.d = activity;
        this.f15545b = i10;
        this.e = inputGroupCall;
        this.f15546c = z10;
        this.f15547f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.r2.run():void");
    }

    public r2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f15544a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f15545b = i10;
        this.f15547f = obj2;
        this.h = obj3;
        this.f15546c = z10;
    }

    public r2(w3 w3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f15544a = 0;
        this.d = w3Var;
        this.e = uri;
        this.f15546c = z10;
        this.f15547f = str;
        this.f15545b = i10;
        this.h = aVar;
    }

    public r2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f15544a = 1;
        this.d = contactsController;
        this.f15545b = i10;
        this.e = arrayList;
        this.f15547f = arrayList2;
        this.h = hVar;
        this.f15546c = z10;
    }

    public r2(lq0 lq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f15544a = 5;
        this.d = lq0Var;
        this.f15547f = str;
        this.f15545b = i10;
        this.e = tLObject;
        this.f15546c = z10;
        this.h = user;
    }

    public r2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f15544a = 6;
        this.d = l0Var;
        this.f15546c = z10;
        this.e = i0Var;
        this.f15547f = proofchallenge;
        this.f15545b = i10;
        this.h = callback2;
    }
}
