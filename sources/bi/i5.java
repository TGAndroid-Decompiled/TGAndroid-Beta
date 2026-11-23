package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.gs;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
import org.telegram.ui.ld0;
import org.telegram.ui.o60;
import org.telegram.ui.p40;
public final class i5 implements Runnable {
    public final int f3696a;
    public final int f3697b;
    public final Object f3698c;
    public final Object d;
    public final Object f3699e;
    public final Object f3700f;
    public final Object h;
    public final Object f3701n;

    public i5(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, m80 m80Var, String[] strArr) {
        this.f3696a = 5;
        this.f3698c = inputGroupCall;
        this.f3697b = i7;
        this.d = strArr;
        this.f3699e = frameLayout;
        this.f3700f = m80Var;
        this.f3701n = w2Var;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.i5.run():void");
    }

    public i5(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ve veVar, ve veVar2, ve veVar3) {
        this.f3696a = 2;
        this.f3697b = i7;
        this.f3698c = arrayList;
        this.d = arrayList2;
        this.f3699e = num;
        this.f3700f = veVar;
        this.h = veVar2;
        this.f3701n = veVar3;
    }

    public i5(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3696a = i10;
        this.f3698c = obj;
        this.f3697b = i7;
        this.d = serializable;
        this.f3699e = obj2;
        this.f3700f = obj3;
        this.h = obj4;
        this.f3701n = obj5;
    }

    public i5(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3696a = i10;
        this.f3698c = obj;
        this.d = obj2;
        this.f3699e = obj3;
        this.f3697b = i7;
        this.f3700f = obj4;
        this.h = obj5;
        this.f3701n = obj6;
    }

    public i5(gs gsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.f3696a = i10;
        this.f3698c = gsVar;
        this.f3699e = tLObject;
        this.f3700f = obj;
        this.h = tLObject2;
        this.f3701n = obj2;
        this.f3697b = i7;
        this.d = str;
    }

    public i5(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.f3696a = 6;
        this.f3698c = tLObject;
        this.d = t1Var;
        this.f3700f = context;
        this.f3697b = i7;
        this.f3699e = exportgroupcallinvite;
        this.h = h6Var;
        this.f3701n = p40Var;
    }

    public i5(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f3696a = 9;
        this.f3698c = t1Var;
        this.d = tLObject;
        this.f3697b = i7;
        this.f3699e = document;
        this.f3700f = tL_error;
        this.h = obj;
        this.f3701n = tL_stickers_addStickerToSet;
    }

    public i5(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f3696a = 4;
        this.f3698c = g4Var;
        this.f3697b = i7;
        this.f3699e = bVar;
        this.f3700f = tLObject;
        this.d = str;
        this.h = e0Var;
        this.f3701n = tL_messages_getWebPage;
    }

    public i5(qf qfVar, ji.o oVar, org.telegram.ui.Cells.c5 c5Var, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f3696a = 8;
        this.f3698c = qfVar;
        this.d = oVar;
        this.f3699e = c5Var;
        this.f3700f = arrayList;
        this.h = arrayList2;
        this.f3697b = i7;
        this.f3701n = fVar;
    }

    public i5(LaunchActivity launchActivity, TLObject tLObject, int i7, cx cxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.f3696a = 13;
        this.f3698c = launchActivity;
        this.f3699e = tLObject;
        this.f3697b = i7;
        this.f3700f = cxVar;
        this.f3701n = g2Var;
        this.h = user;
        this.d = str;
    }

    public i5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, o60 o60Var, String str) {
        this.f3696a = 11;
        this.f3698c = launchActivity;
        this.f3699e = tL_error;
        this.f3700f = tLObject;
        this.f3697b = i7;
        this.h = t1Var;
        this.f3701n = o60Var;
        this.d = str;
    }

    public i5(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f3696a = 15;
        this.f3698c = ld0Var;
        this.d = str;
        this.f3699e = fVar;
        this.f3700f = list;
        this.h = str2;
        this.f3701n = str3;
        this.f3697b = i7;
    }

    public i5(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f3696a = 16;
        this.f3698c = profileActivity;
        this.f3699e = view;
        this.d = str;
        this.f3697b = i7;
        this.f3700f = zArr;
        this.h = strArr;
        this.f3701n = str2;
    }

    public i5(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, int i7, Object obj, String str, org.telegram.ui.Wallet.r0 r0Var, y10 y10Var) {
        this.f3696a = 17;
        this.f3698c = l2Var;
        this.f3699e = h2Var;
        this.f3697b = i7;
        this.f3700f = obj;
        this.d = str;
        this.h = r0Var;
        this.f3701n = y10Var;
    }

    public i5(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, fi.f7 f7Var) {
        this.f3696a = 19;
        this.f3698c = v0Var;
        this.d = str;
        this.f3699e = tLObject;
        this.f3700f = tL_error;
        this.f3697b = i7;
        this.h = s0Var;
        this.f3701n = f7Var;
    }

    public i5(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Wallet.w2 w2Var) {
        this.f3696a = 18;
        this.f3698c = zArr;
        this.f3700f = context;
        this.f3697b = i7;
        this.d = user;
        this.f3699e = jSONObject;
        this.h = h6Var;
        this.f3701n = w2Var;
    }
}
