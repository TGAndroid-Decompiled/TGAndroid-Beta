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
import org.telegram.ui.wq0;
public final class s2 implements Runnable {
    public final int f12626a;
    public final int f12627b;
    public final boolean f12628c;
    public final Object d;
    public final Object f12629e;
    public final Object f12630f;
    public final Object h;

    public s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f12626a = 5;
        this.d = activity;
        this.f12627b = i10;
        this.f12629e = inputGroupCall;
        this.f12628c = z10;
        this.f12630f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.s2.run():void");
    }

    public s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.f12626a = 0;
        this.d = x3Var;
        this.f12629e = uri;
        this.f12628c = z10;
        this.f12630f = str;
        this.f12627b = i10;
        this.h = aVar;
    }

    public s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.f12626a = i11;
        this.d = obj;
        this.f12629e = tLObject;
        this.f12627b = i10;
        this.f12630f = obj2;
        this.h = obj3;
        this.f12628c = z10;
    }

    public s2(ki.q qVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.f12626a = 1;
        this.d = qVar;
        this.f12629e = size;
        this.f12627b = i10;
        this.f12628c = z10;
        this.f12630f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    public s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.f12626a = 2;
        this.d = contactsController;
        this.f12627b = i10;
        this.f12629e = arrayList;
        this.f12630f = arrayList2;
        this.h = iVar;
        this.f12628c = z10;
    }

    public s2(wq0 wq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f12626a = 6;
        this.d = wq0Var;
        this.f12630f = str;
        this.f12627b = i10;
        this.f12629e = tLObject;
        this.f12628c = z10;
        this.h = user;
    }
}
