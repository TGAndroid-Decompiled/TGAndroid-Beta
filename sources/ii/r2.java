package ii;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cr0;
public final class r2 implements Runnable {
    public final int f11600a;
    public final int f11601b;
    public final boolean f11602c;
    public final Object d;
    public final Object e;
    public final Object f11603f;
    public final Object h;

    public r2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f11600a = 4;
        this.d = activity;
        this.f11601b = i10;
        this.e = inputGroupCall;
        this.f11602c = z10;
        this.f11603f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r2.run():void");
    }

    public r2(w3 w3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f11600a = 0;
        this.d = w3Var;
        this.e = uri;
        this.f11602c = z10;
        this.f11603f = str;
        this.f11601b = i10;
        this.h = aVar;
    }

    public r2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f11600a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f11601b = i10;
        this.f11603f = obj2;
        this.h = obj3;
        this.f11602c = z10;
    }

    public r2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f11600a = 1;
        this.d = contactsController;
        this.f11601b = i10;
        this.e = arrayList;
        this.f11603f = arrayList2;
        this.h = iVar;
        this.f11602c = z10;
    }

    public r2(cr0 cr0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f11600a = 5;
        this.d = cr0Var;
        this.f11603f = str;
        this.f11601b = i10;
        this.e = tLObject;
        this.f11602c = z10;
        this.h = user;
    }
}
