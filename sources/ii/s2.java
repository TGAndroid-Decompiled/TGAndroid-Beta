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
import org.telegram.ui.br0;
public final class s2 implements Runnable {
    public final int f12673a;
    public final int f12674b;
    public final boolean f12675c;
    public final Object d;
    public final Object f12676e;
    public final Object f12677f;
    public final Object h;

    public s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f12673a = 5;
        this.d = activity;
        this.f12674b = i10;
        this.f12676e = inputGroupCall;
        this.f12675c = z10;
        this.f12677f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.s2.run():void");
    }

    public s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f12673a = 0;
        this.d = x3Var;
        this.f12676e = uri;
        this.f12675c = z10;
        this.f12677f = str;
        this.f12674b = i10;
        this.h = aVar;
    }

    public s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f12673a = i11;
        this.d = obj;
        this.f12676e = tLObject;
        this.f12674b = i10;
        this.f12677f = obj2;
        this.h = obj3;
        this.f12675c = z10;
    }

    public s2(ki.r rVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.f12673a = 1;
        this.d = rVar;
        this.f12676e = size;
        this.f12674b = i10;
        this.f12675c = z10;
        this.f12677f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    public s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f12673a = 2;
        this.d = contactsController;
        this.f12674b = i10;
        this.f12676e = arrayList;
        this.f12677f = arrayList2;
        this.h = iVar;
        this.f12675c = z10;
    }

    public s2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f12673a = 6;
        this.d = br0Var;
        this.f12677f = str;
        this.f12674b = i10;
        this.f12676e = tLObject;
        this.f12675c = z10;
        this.h = user;
    }

    public s2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.f12673a = 7;
        this.d = k0Var;
        this.f12675c = z10;
        this.f12676e = h0Var;
        this.f12677f = proofchallenge;
        this.f12674b = i10;
        this.h = callback2;
    }
}
