package ji;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class q2 implements Runnable {
    public final int f14124a;
    public final int f14125b;
    public final boolean f14126c;
    public final Object d;
    public final Object f14127e;
    public final Object f14128f;
    public final Object h;

    public q2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f14124a = 4;
        this.d = activity;
        this.f14125b = i10;
        this.f14127e = inputGroupCall;
        this.f14126c = z10;
        this.f14128f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ji.q2.run():void");
    }

    public q2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f14124a = i11;
        this.d = obj;
        this.f14127e = tLObject;
        this.f14125b = i10;
        this.f14128f = obj2;
        this.h = obj3;
        this.f14126c = z10;
    }

    public q2(v3 v3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f14124a = 0;
        this.d = v3Var;
        this.f14127e = uri;
        this.f14126c = z10;
        this.f14128f = str;
        this.f14125b = i10;
        this.h = aVar;
    }

    public q2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f14124a = 1;
        this.d = contactsController;
        this.f14125b = i10;
        this.f14127e = arrayList;
        this.f14128f = arrayList2;
        this.h = iVar;
        this.f14126c = z10;
    }

    public q2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f14124a = 5;
        this.d = br0Var;
        this.f14128f = str;
        this.f14125b = i10;
        this.f14127e = tLObject;
        this.f14126c = z10;
        this.h = user;
    }
}
