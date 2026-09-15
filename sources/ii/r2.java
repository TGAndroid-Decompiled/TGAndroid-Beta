package ii;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ar0;
public final class r2 implements Runnable {
    public final int f11596a;
    public final int f11597b;
    public final boolean f11598c;
    public final Object d;
    public final Object e;
    public final Object f11599f;
    public final Object h;

    public r2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f11596a = 4;
        this.d = activity;
        this.f11597b = i10;
        this.e = inputGroupCall;
        this.f11598c = z10;
        this.f11599f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r2.run():void");
    }

    public r2(w3 w3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f11596a = 0;
        this.d = w3Var;
        this.e = uri;
        this.f11598c = z10;
        this.f11599f = str;
        this.f11597b = i10;
        this.h = aVar;
    }

    public r2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f11596a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f11597b = i10;
        this.f11599f = obj2;
        this.h = obj3;
        this.f11598c = z10;
    }

    public r2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f11596a = 1;
        this.d = contactsController;
        this.f11597b = i10;
        this.e = arrayList;
        this.f11599f = arrayList2;
        this.h = iVar;
        this.f11598c = z10;
    }

    public r2(ar0 ar0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f11596a = 5;
        this.d = ar0Var;
        this.f11599f = str;
        this.f11597b = i10;
        this.e = tLObject;
        this.f11598c = z10;
        this.h = user;
    }
}
