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
    public final int f14150a;
    public final int f14151b;
    public final boolean f14152c;
    public final Object d;
    public final Object f14153e;
    public final Object f14154f;
    public final Object h;

    public q2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f14150a = 4;
        this.d = activity;
        this.f14151b = i10;
        this.f14153e = inputGroupCall;
        this.f14152c = z10;
        this.f14154f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ji.q2.run():void");
    }

    public q2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f14150a = i11;
        this.d = obj;
        this.f14153e = tLObject;
        this.f14151b = i10;
        this.f14154f = obj2;
        this.h = obj3;
        this.f14152c = z10;
    }

    public q2(v3 v3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f14150a = 0;
        this.d = v3Var;
        this.f14153e = uri;
        this.f14152c = z10;
        this.f14154f = str;
        this.f14151b = i10;
        this.h = aVar;
    }

    public q2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f14150a = 1;
        this.d = contactsController;
        this.f14151b = i10;
        this.f14153e = arrayList;
        this.f14154f = arrayList2;
        this.h = iVar;
        this.f14152c = z10;
    }

    public q2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f14150a = 5;
        this.d = br0Var;
        this.f14154f = str;
        this.f14151b = i10;
        this.f14153e = tLObject;
        this.f14152c = z10;
        this.h = user;
    }
}
