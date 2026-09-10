package hi;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class u2 implements Runnable {
    public final int f9885a;
    public final int f9886b;
    public final boolean f9887c;
    public final Object d;
    public final Object e;
    public final Object f9888f;
    public final Object h;

    public u2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f9885a = 4;
        this.d = activity;
        this.f9886b = i10;
        this.e = inputGroupCall;
        this.f9887c = z10;
        this.f9888f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.u2.run():void");
    }

    public u2(z3 z3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f9885a = 0;
        this.d = z3Var;
        this.e = uri;
        this.f9887c = z10;
        this.f9888f = str;
        this.f9886b = i10;
        this.h = aVar;
    }

    public u2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f9885a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f9886b = i10;
        this.f9888f = obj2;
        this.h = obj3;
        this.f9887c = z10;
    }

    public u2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f9885a = 1;
        this.d = contactsController;
        this.f9886b = i10;
        this.e = arrayList;
        this.f9888f = arrayList2;
        this.h = iVar;
        this.f9887c = z10;
    }

    public u2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f9885a = 5;
        this.d = br0Var;
        this.f9888f = str;
        this.f9886b = i10;
        this.e = tLObject;
        this.f9887c = z10;
        this.h = user;
    }
}
