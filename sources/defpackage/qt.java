package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class qt implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public qt(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, xl6 xl6Var, xl6 xl6Var2, xl6 xl6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = xl6Var;
        this.h = xl6Var2;
        this.n = xl6Var3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.run():void");
    }

    public qt(hd hdVar, c01 c01Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = hdVar;
        this.f = c01Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public qt(hd hdVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = hdVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public qt(hv0 hv0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, cv0 cv0Var, ev0 ev0Var) {
        this.a = (byte) 1;
        this.e = hv0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = cv0Var;
        this.n = ev0Var;
    }

    public qt(ve6 ve6Var, String str, fi0 fi0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = ve6Var;
        this.b = str;
        this.f = fi0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public qt(gz6 gz6Var, int i, ArrayList arrayList, vf6 vf6Var, TLRPC.TL_error tL_error, TLObject tLObject, na7 na7Var) {
        this.a = (byte) 15;
        this.e = gz6Var;
        this.d = i;
        this.f = arrayList;
        this.b = vf6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = na7Var;
    }

    public qt(gk7 gk7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = gk7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public qt(lca lcaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, wjb wjbVar, d dVar) {
        this.a = (byte) 17;
        this.e = lcaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = wjbVar;
        this.n = dVar;
    }

    public qt(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public qt(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public qt(TLObject tLObject, hd hdVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, wjb wjbVar, fa5 fa5Var) {
        this.a = (byte) 3;
        this.c = tLObject;
        this.e = hdVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = wjbVar;
        this.n = fa5Var;
    }

    public qt(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, jn1 jn1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = jn1Var;
    }

    public qt(c cVar, hjc hjcVar, lj9 lj9Var, ArrayList arrayList, ArrayList arrayList2, int i, zic zicVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = hjcVar;
        this.c = lj9Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = zicVar;
    }

    public qt(LaunchActivity launchActivity, TLObject tLObject, int i, cj3 cj3Var, d dVar, TLRPC.User user, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = cj3Var;
        this.h = dVar;
        this.n = user;
        this.b = str;
    }

    public qt(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, hd hdVar, kz5 kz5Var, String str) {
        this.a = (byte) 9;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = hdVar;
        this.n = kz5Var;
        this.b = str;
    }

    public qt(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, kz5 kz5Var, int i, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = kz5Var;
        this.d = i;
        this.b = str;
    }

    public qt(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
        this.a = (byte) 16;
        this.e = profileActivity;
        this.f = view;
        this.b = str;
        this.d = i;
        this.c = zArr;
        this.h = strArr;
        this.n = str2;
    }
}
