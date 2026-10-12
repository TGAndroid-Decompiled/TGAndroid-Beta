package ii;

import android.app.Activity;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.dr0;
public final class s2 implements Runnable {
    public final int f12684a;
    public final int f12685b;
    public final boolean f12686c;
    public final Object d;
    public final Object f12687e;
    public final Object f12688f;
    public final Object h;

    public s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f12684a = 4;
        this.d = activity;
        this.f12685b = i10;
        this.f12687e = inputGroupCall;
        this.f12686c = z10;
        this.f12688f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.s2.run():void");
    }

    public s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f12684a = 0;
        this.d = x3Var;
        this.f12687e = uri;
        this.f12686c = z10;
        this.f12688f = str;
        this.f12685b = i10;
        this.h = aVar;
    }

    public s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f12684a = i11;
        this.d = obj;
        this.f12687e = tLObject;
        this.f12685b = i10;
        this.f12688f = obj2;
        this.h = obj3;
        this.f12686c = z10;
    }

    public s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f12684a = 1;
        this.d = contactsController;
        this.f12685b = i10;
        this.f12687e = arrayList;
        this.f12688f = arrayList2;
        this.h = iVar;
        this.f12686c = z10;
    }

    public s2(dr0 dr0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f12684a = 5;
        this.d = dr0Var;
        this.f12688f = str;
        this.f12685b = i10;
        this.f12687e = tLObject;
        this.f12686c = z10;
        this.h = user;
    }

    public s2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f12684a = 6;
        this.d = l0Var;
        this.f12686c = z10;
        this.f12687e = i0Var;
        this.f12688f = proofchallenge;
        this.f12685b = i10;
        this.h = callback2;
    }

    public s2(qi.p pVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.f12684a = 7;
        this.d = pVar;
        this.f12687e = size;
        this.f12685b = i10;
        this.f12686c = z10;
        this.f12688f = runtimeExceptionArr;
        this.h = countDownLatch;
    }
}
