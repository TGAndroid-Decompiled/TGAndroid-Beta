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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class st implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public st(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, do6 do6Var, do6 do6Var2, do6 do6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = do6Var;
        this.h = do6Var2;
        this.n = do6Var3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st.run():void");
    }

    public st(id idVar, l01 l01Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = idVar;
        this.f = l01Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public st(id idVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = idVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public st(rv0 rv0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, nv0 nv0Var, pv0 pv0Var) {
        this.a = (byte) 1;
        this.e = rv0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = nv0Var;
        this.n = pv0Var;
    }

    public st(zg6 zg6Var, String str, gi0 gi0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = zg6Var;
        this.b = str;
        this.f = gi0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public st(n17 n17Var, int i, ArrayList arrayList, zh6 zh6Var, TLRPC.TL_error tL_error, TLObject tLObject, uc7 uc7Var) {
        this.a = (byte) 15;
        this.e = n17Var;
        this.d = i;
        this.f = arrayList;
        this.b = zh6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = uc7Var;
    }

    public st(fn7 fn7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public st(cga cgaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, vnb vnbVar, e eVar) {
        this.a = (byte) 17;
        this.e = cgaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = vnbVar;
        this.n = eVar;
    }

    public st(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public st(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public st(TLObject tLObject, id idVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, vnb vnbVar, gc5 gc5Var) {
        this.a = (byte) 2;
        this.c = tLObject;
        this.e = idVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = vnbVar;
        this.n = gc5Var;
    }

    public st(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, on1 on1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = on1Var;
    }

    public st(c cVar, tnc tncVar, wz4 wz4Var, ArrayList arrayList, ArrayList arrayList2, int i, nnc nncVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = tncVar;
        this.c = wz4Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = nncVar;
    }

    public st(LaunchActivity launchActivity, TLObject tLObject, int i, uj3 uj3Var, e eVar, TLRPC.User user, String str) {
        this.a = (byte) 10;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = uj3Var;
        this.h = eVar;
        this.n = user;
        this.b = str;
    }

    public st(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, id idVar, tg5 tg5Var, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = idVar;
        this.n = tg5Var;
        this.b = str;
    }

    public st(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, tg5 tg5Var, int i, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = tg5Var;
        this.d = i;
        this.b = str;
    }

    public st(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
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
