package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c;
import org.telegram.ui.ExternalActionActivity;
public final class bz1 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public bz1(int i, File file, String str, he heVar, boolean[] zArr, String str2, qac qacVar, boolean[] zArr2) {
        this.a = (byte) 3;
        this.b = i;
        this.c = file;
        this.d = str;
        this.e = heVar;
        this.f = zArr;
        this.h = str2;
        this.n = qacVar;
        this.r = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz1.run():void");
    }

    public bz1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
        this.n = obj6;
        this.r = obj7;
    }

    public bz1(c cVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i, zkc zkcVar) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = view;
        this.e = frameLayout;
        this.f = layoutParams;
        this.h = arrayList;
        this.n = arrayList2;
        this.b = i;
        this.r = zkcVar;
    }

    public bz1(ExternalActionActivity externalActionActivity, he heVar, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.a = (byte) 1;
        this.c = externalActionActivity;
        this.d = heVar;
        this.e = tLObject;
        this.b = i;
        this.f = authorizationform;
        this.h = getauthorizationform;
        this.n = str;
        this.r = str2;
    }

    public bz1(Runnable[] runnableArr, TextView[] textViewArr, int i, ylb ylbVar, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.a = (byte) 5;
        this.c = runnableArr;
        this.d = textViewArr;
        this.b = i;
        this.e = ylbVar;
        this.f = wallettransaction;
        this.h = strArr;
        this.n = zArr;
        this.r = bArr;
    }
}
