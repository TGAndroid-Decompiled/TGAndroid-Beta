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
public final class qu implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public qu(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, yn6 yn6Var, yn6 yn6Var2, yn6 yn6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = yn6Var;
        this.h = yn6Var2;
        this.n = yn6Var3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.run():void");
    }

    public qu(he heVar, k11 k11Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = heVar;
        this.f = k11Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public qu(he heVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = heVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public qu(qw0 qw0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, mw0 mw0Var, ow0 ow0Var) {
        this.a = (byte) 1;
        this.e = qw0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = mw0Var;
        this.n = ow0Var;
    }

    public qu(wg6 wg6Var, String str, fj0 fj0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = wg6Var;
        this.b = str;
        this.f = fj0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public qu(g17 g17Var, int i, ArrayList arrayList, vh6 vh6Var, TLRPC.TL_error tL_error, TLObject tLObject, oc7 oc7Var) {
        this.a = (byte) 15;
        this.e = g17Var;
        this.d = i;
        this.f = arrayList;
        this.b = vh6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = oc7Var;
    }

    public qu(jm7 jm7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = jm7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public qu(lea leaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, ylb ylbVar, d dVar) {
        this.a = (byte) 17;
        this.e = leaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = ylbVar;
        this.n = dVar;
    }

    public qu(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public qu(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public qu(TLObject tLObject, he heVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, ylb ylbVar, dc5 dc5Var) {
        this.a = (byte) 3;
        this.c = tLObject;
        this.e = heVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = ylbVar;
        this.n = dc5Var;
    }

    public qu(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, co1 co1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = co1Var;
    }

    public qu(c cVar, hlc hlcVar, sz4 sz4Var, ArrayList arrayList, ArrayList arrayList2, int i, zkc zkcVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = hlcVar;
        this.c = sz4Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = zkcVar;
    }

    public qu(LaunchActivity launchActivity, TLObject tLObject, int i, nk3 nk3Var, d dVar, TLRPC.User user, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = nk3Var;
        this.h = dVar;
        this.n = user;
        this.b = str;
    }

    public qu(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, he heVar, k16 k16Var, String str) {
        this.a = (byte) 9;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = heVar;
        this.n = k16Var;
        this.b = str;
    }

    public qu(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, k16 k16Var, int i, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = k16Var;
        this.d = i;
        this.b = str;
    }

    public qu(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
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
