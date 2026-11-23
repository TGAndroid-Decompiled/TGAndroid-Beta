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
import org.telegram.ui.Components.rf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
import org.telegram.ui.h60;
import org.telegram.ui.ld0;
import org.telegram.ui.p40;
public final class f5 implements Runnable {
    public final int f3625a;
    public final int f3626b;
    public final Object f3627c;
    public final Object d;
    public final Object f3628e;
    public final Object f3629f;
    public final Object h;
    public final Object f3630n;

    public f5(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, m80 m80Var, String[] strArr) {
        this.f3625a = 5;
        this.f3627c = inputGroupCall;
        this.f3626b = i7;
        this.d = strArr;
        this.f3628e = frameLayout;
        this.f3629f = m80Var;
        this.f3630n = w2Var;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.f5.run():void");
    }

    public f5(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ve veVar, ve veVar2, ve veVar3) {
        this.f3625a = 2;
        this.f3626b = i7;
        this.f3627c = arrayList;
        this.d = arrayList2;
        this.f3628e = num;
        this.f3629f = veVar;
        this.h = veVar2;
        this.f3630n = veVar3;
    }

    public f5(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3625a = i10;
        this.f3627c = obj;
        this.f3626b = i7;
        this.d = serializable;
        this.f3628e = obj2;
        this.f3629f = obj3;
        this.h = obj4;
        this.f3630n = obj5;
    }

    public f5(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3625a = i10;
        this.f3627c = obj;
        this.d = obj2;
        this.f3628e = obj3;
        this.f3626b = i7;
        this.f3629f = obj4;
        this.h = obj5;
        this.f3630n = obj6;
    }

    public f5(gs gsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.f3625a = i10;
        this.f3627c = gsVar;
        this.f3628e = tLObject;
        this.f3629f = obj;
        this.h = tLObject2;
        this.f3630n = obj2;
        this.f3626b = i7;
        this.d = str;
    }

    public f5(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.f3625a = 6;
        this.f3627c = tLObject;
        this.d = t1Var;
        this.f3629f = context;
        this.f3626b = i7;
        this.f3628e = exportgroupcallinvite;
        this.h = h6Var;
        this.f3630n = p40Var;
    }

    public f5(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f3625a = 9;
        this.f3627c = t1Var;
        this.d = tLObject;
        this.f3626b = i7;
        this.f3628e = document;
        this.f3629f = tL_error;
        this.h = obj;
        this.f3630n = tL_stickers_addStickerToSet;
    }

    public f5(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f3625a = 4;
        this.f3627c = g4Var;
        this.f3626b = i7;
        this.f3628e = bVar;
        this.f3629f = tLObject;
        this.d = str;
        this.h = e0Var;
        this.f3630n = tL_messages_getWebPage;
    }

    public f5(rf rfVar, ji.p pVar, org.telegram.ui.Cells.c5 c5Var, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f3625a = 8;
        this.f3627c = rfVar;
        this.d = pVar;
        this.f3628e = c5Var;
        this.f3629f = arrayList;
        this.h = arrayList2;
        this.f3626b = i7;
        this.f3630n = fVar;
    }

    public f5(LaunchActivity launchActivity, TLObject tLObject, int i7, cx cxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.f3625a = 13;
        this.f3627c = launchActivity;
        this.f3628e = tLObject;
        this.f3626b = i7;
        this.f3629f = cxVar;
        this.f3630n = g2Var;
        this.h = user;
        this.d = str;
    }

    public f5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, h60 h60Var, String str) {
        this.f3625a = 11;
        this.f3627c = launchActivity;
        this.f3628e = tL_error;
        this.f3629f = tLObject;
        this.f3626b = i7;
        this.h = t1Var;
        this.f3630n = h60Var;
        this.d = str;
    }

    public f5(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f3625a = 15;
        this.f3627c = ld0Var;
        this.d = str;
        this.f3628e = fVar;
        this.f3629f = list;
        this.h = str2;
        this.f3630n = str3;
        this.f3626b = i7;
    }

    public f5(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f3625a = 16;
        this.f3627c = profileActivity;
        this.f3628e = view;
        this.d = str;
        this.f3626b = i7;
        this.f3629f = zArr;
        this.h = strArr;
        this.f3630n = str2;
    }

    public f5(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, int i7, Object obj, String str, org.telegram.ui.Wallet.r0 r0Var, y10 y10Var) {
        this.f3625a = 17;
        this.f3627c = l2Var;
        this.f3628e = h2Var;
        this.f3626b = i7;
        this.f3629f = obj;
        this.d = str;
        this.h = r0Var;
        this.f3630n = y10Var;
    }

    public f5(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, fi.f7 f7Var) {
        this.f3625a = 19;
        this.f3627c = v0Var;
        this.d = str;
        this.f3628e = tLObject;
        this.f3629f = tL_error;
        this.f3626b = i7;
        this.h = s0Var;
        this.f3630n = f7Var;
    }

    public f5(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Wallet.w2 w2Var) {
        this.f3625a = 18;
        this.f3627c = zArr;
        this.f3629f = context;
        this.f3626b = i7;
        this.d = user;
        this.f3628e = jSONObject;
        this.h = h6Var;
        this.f3630n = w2Var;
    }
}
