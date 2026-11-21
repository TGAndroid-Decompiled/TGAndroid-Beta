package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.fs;
import org.telegram.messenger.ue;
import org.telegram.messenger.x10;
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
public final class g5 implements Runnable {
    public final int f3675a;
    public final int f3676b;
    public final Object f3677c;
    public final Object d;
    public final Object f3678e;
    public final Object f3679f;
    public final Object h;
    public final Object f3680n;

    public g5(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, m80 m80Var, String[] strArr) {
        this.f3675a = 5;
        this.f3677c = inputGroupCall;
        this.f3676b = i7;
        this.d = strArr;
        this.f3678e = frameLayout;
        this.f3679f = m80Var;
        this.f3680n = w2Var;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.g5.run():void");
    }

    public g5(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ue ueVar, ue ueVar2, ue ueVar3) {
        this.f3675a = 2;
        this.f3676b = i7;
        this.f3677c = arrayList;
        this.d = arrayList2;
        this.f3678e = num;
        this.f3679f = ueVar;
        this.h = ueVar2;
        this.f3680n = ueVar3;
    }

    public g5(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3675a = i10;
        this.f3677c = obj;
        this.f3676b = i7;
        this.d = serializable;
        this.f3678e = obj2;
        this.f3679f = obj3;
        this.h = obj4;
        this.f3680n = obj5;
    }

    public g5(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3675a = i10;
        this.f3677c = obj;
        this.d = obj2;
        this.f3678e = obj3;
        this.f3676b = i7;
        this.f3679f = obj4;
        this.h = obj5;
        this.f3680n = obj6;
    }

    public g5(fs fsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.f3675a = i10;
        this.f3677c = fsVar;
        this.f3678e = tLObject;
        this.f3679f = obj;
        this.h = tLObject2;
        this.f3680n = obj2;
        this.f3676b = i7;
        this.d = str;
    }

    public g5(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.f3675a = 6;
        this.f3677c = tLObject;
        this.d = t1Var;
        this.f3679f = context;
        this.f3676b = i7;
        this.f3678e = exportgroupcallinvite;
        this.h = h6Var;
        this.f3680n = p40Var;
    }

    public g5(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f3675a = 9;
        this.f3677c = t1Var;
        this.d = tLObject;
        this.f3676b = i7;
        this.f3678e = document;
        this.f3679f = tL_error;
        this.h = obj;
        this.f3680n = tL_stickers_addStickerToSet;
    }

    public g5(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f3675a = 4;
        this.f3677c = g4Var;
        this.f3676b = i7;
        this.f3678e = bVar;
        this.f3679f = tLObject;
        this.d = str;
        this.h = f0Var;
        this.f3680n = tL_messages_getWebPage;
    }

    public g5(rf rfVar, ji.p pVar, org.telegram.ui.Cells.c5 c5Var, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f3675a = 8;
        this.f3677c = rfVar;
        this.d = pVar;
        this.f3678e = c5Var;
        this.f3679f = arrayList;
        this.h = arrayList2;
        this.f3676b = i7;
        this.f3680n = fVar;
    }

    public g5(LaunchActivity launchActivity, TLObject tLObject, int i7, cx cxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.f3675a = 13;
        this.f3677c = launchActivity;
        this.f3678e = tLObject;
        this.f3676b = i7;
        this.f3679f = cxVar;
        this.f3680n = g2Var;
        this.h = user;
        this.d = str;
    }

    public g5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, h60 h60Var, String str) {
        this.f3675a = 11;
        this.f3677c = launchActivity;
        this.f3678e = tL_error;
        this.f3679f = tLObject;
        this.f3676b = i7;
        this.h = t1Var;
        this.f3680n = h60Var;
        this.d = str;
    }

    public g5(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f3675a = 15;
        this.f3677c = ld0Var;
        this.d = str;
        this.f3678e = fVar;
        this.f3679f = list;
        this.h = str2;
        this.f3680n = str3;
        this.f3676b = i7;
    }

    public g5(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f3675a = 16;
        this.f3677c = profileActivity;
        this.f3678e = view;
        this.d = str;
        this.f3676b = i7;
        this.f3679f = zArr;
        this.h = strArr;
        this.f3680n = str2;
    }

    public g5(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, int i7, Object obj, String str, org.telegram.ui.Wallet.r0 r0Var, x10 x10Var) {
        this.f3675a = 17;
        this.f3677c = l2Var;
        this.f3678e = h2Var;
        this.f3676b = i7;
        this.f3679f = obj;
        this.d = str;
        this.h = r0Var;
        this.f3680n = x10Var;
    }

    public g5(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, fi.f7 f7Var) {
        this.f3675a = 19;
        this.f3677c = v0Var;
        this.d = str;
        this.f3678e = tLObject;
        this.f3679f = tL_error;
        this.f3676b = i7;
        this.h = s0Var;
        this.f3680n = f7Var;
    }

    public g5(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Wallet.w2 w2Var) {
        this.f3675a = 18;
        this.f3677c = zArr;
        this.f3679f = context;
        this.f3676b = i7;
        this.d = user;
        this.f3678e = jSONObject;
        this.h = h6Var;
        this.f3680n = w2Var;
    }
}
