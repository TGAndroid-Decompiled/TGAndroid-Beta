package jg;

import android.content.Context;
import android.view.View;
import di.o7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.sy;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g4;
import org.telegram.ui.ld0;
import org.telegram.ui.m40;
import org.telegram.ui.q10;
import org.telegram.ui.rp;
import org.telegram.ui.ww;
public final class c1 implements Runnable {
    public final int f16682a;
    public final int f16683b;
    public final Object f16684c;
    public final Object d;
    public final Object f16685e;
    public final Object f16686f;
    public final Object h;
    public final Object f16687n;

    public c1(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, we weVar, we weVar2, we weVar3) {
        this.f16682a = 1;
        this.f16683b = i7;
        this.f16684c = arrayList;
        this.d = arrayList2;
        this.f16685e = num;
        this.f16686f = weVar;
        this.h = weVar2;
        this.f16687n = weVar3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.c1.run():void");
    }

    public c1(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f16682a = i10;
        this.d = obj;
        this.f16683b = i7;
        this.f16684c = serializable;
        this.f16685e = obj2;
        this.f16686f = obj3;
        this.h = obj4;
        this.f16687n = obj5;
    }

    public c1(Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16682a = i10;
        this.d = obj;
        this.f16684c = obj2;
        this.f16683b = i7;
        this.f16685e = obj3;
        this.f16686f = obj4;
        this.h = obj5;
        this.f16687n = obj6;
    }

    public c1(gz gzVar, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, sy syVar, int i7, String str) {
        this.f16682a = 2;
        this.d = gzVar;
        this.h = tLObject;
        this.f16684c = inputFile;
        this.f16685e = inputMedia;
        this.f16686f = syVar;
        this.f16683b = i7;
        this.f16687n = str;
    }

    public c1(TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, m40 m40Var) {
        this.f16682a = 5;
        this.h = tLObject;
        this.d = u1Var;
        this.f16684c = context;
        this.f16683b = i7;
        this.f16685e = exportgroupcallinvite;
        this.f16686f = f6Var;
        this.f16687n = m40Var;
    }

    public c1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i7, AtomicInteger atomicInteger, ArrayList arrayList2, rp rpVar) {
        this.f16682a = 6;
        this.f16686f = tL_error;
        this.h = tLObject;
        this.f16684c = arrayList;
        this.f16683b = i7;
        this.d = atomicInteger;
        this.f16685e = arrayList2;
        this.f16687n = rpVar;
    }

    public c1(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f16682a = 7;
        this.d = u1Var;
        this.h = tLObject;
        this.f16683b = i7;
        this.f16684c = document;
        this.f16686f = tL_error;
        this.f16685e = obj;
        this.f16687n = tL_stickers_addStickerToSet;
    }

    public c1(org.telegram.ui.ActionBar.u1 u1Var, vf.b bVar, TLObject tLObject, int i7, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f16682a = 8;
        this.d = u1Var;
        this.f16684c = bVar;
        this.h = tLObject;
        this.f16683b = i7;
        this.f16685e = context;
        this.f16687n = tL_inputGroupCallSlug;
        this.f16686f = tL_error;
    }

    public c1(g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16682a = 3;
        this.d = g4Var;
        this.f16683b = i7;
        this.f16684c = bVar;
        this.h = tLObject;
        this.f16685e = str;
        this.f16686f = f0Var;
        this.f16687n = tL_messages_getWebPage;
    }

    public c1(LaunchActivity launchActivity, TLObject tLObject, int i7, ww wwVar, f2 f2Var, TLRPC.User user, String str) {
        this.f16682a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f16683b = i7;
        this.f16684c = wwVar;
        this.f16685e = f2Var;
        this.f16686f = user;
        this.f16687n = str;
    }

    public c1(LaunchActivity launchActivity, TLObject tLObject, vf.b bVar, TLRPC.TL_error tL_error, qp qpVar, int i7, String str) {
        this.f16682a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.f16684c = bVar;
        this.f16686f = tL_error;
        this.f16687n = qpVar;
        this.f16683b = i7;
        this.f16685e = str;
    }

    public c1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.u1 u1Var, q10 q10Var, String str) {
        this.f16682a = 9;
        this.d = launchActivity;
        this.f16686f = tL_error;
        this.h = tLObject;
        this.f16683b = i7;
        this.f16684c = u1Var;
        this.f16685e = q10Var;
        this.f16687n = str;
    }

    public c1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, q10 q10Var, int i7, String str) {
        this.f16682a = 12;
        this.d = launchActivity;
        this.f16686f = tL_error;
        this.h = tLObject;
        this.f16684c = tL_inputInvoiceSlug;
        this.f16685e = q10Var;
        this.f16683b = i7;
        this.f16687n = str;
    }

    public c1(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f16682a = 13;
        this.d = ld0Var;
        this.f16684c = str;
        this.f16685e = fVar;
        this.f16686f = list;
        this.h = str2;
        this.f16687n = str3;
        this.f16683b = i7;
    }

    public c1(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f16682a = 14;
        this.d = profileActivity;
        this.f16684c = view;
        this.f16685e = str;
        this.f16683b = i7;
        this.f16686f = zArr;
        this.h = strArr;
        this.f16687n = str2;
    }

    public c1(org.telegram.ui.web.x0 x0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.u0 u0Var, o7 o7Var) {
        this.f16682a = 17;
        this.d = x0Var;
        this.f16684c = str;
        this.h = tLObject;
        this.f16686f = tL_error;
        this.f16683b = i7;
        this.f16685e = u0Var;
        this.f16687n = o7Var;
    }
}
