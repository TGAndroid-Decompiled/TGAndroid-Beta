package ii;

import android.app.Activity;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tq0;
public final class s2 implements Runnable {
    public final int f11623a;
    public final int f11624b;
    public final boolean f11625c;
    public final Object d;
    public final Object e;
    public final Object f11626f;
    public final Object h;

    public s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f11623a = 5;
        this.d = activity;
        this.f11624b = i10;
        this.e = inputGroupCall;
        this.f11625c = z10;
        this.f11626f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.s2.run():void");
    }

    public s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f11623a = 0;
        this.d = x3Var;
        this.e = uri;
        this.f11625c = z10;
        this.f11626f = str;
        this.f11624b = i10;
        this.h = aVar;
    }

    public s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f11623a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f11624b = i10;
        this.f11626f = obj2;
        this.h = obj3;
        this.f11625c = z10;
    }

    public s2(ki.q qVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.f11623a = 1;
        this.d = qVar;
        this.e = size;
        this.f11624b = i10;
        this.f11625c = z10;
        this.f11626f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    public s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f11623a = 2;
        this.d = contactsController;
        this.f11624b = i10;
        this.e = arrayList;
        this.f11626f = arrayList2;
        this.h = iVar;
        this.f11625c = z10;
    }

    public s2(tq0 tq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f11623a = 6;
        this.d = tq0Var;
        this.f11626f = str;
        this.f11624b = i10;
        this.e = tLObject;
        this.f11625c = z10;
        this.h = user;
    }
}
