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
import org.telegram.ui.Components.k80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
import org.telegram.ui.ld0;
import org.telegram.ui.n60;
import org.telegram.ui.p40;
public final class d5 implements Runnable {
    public final int f3550a;
    public final int f3551b;
    public final Object f3552c;
    public final Object d;
    public final Object f3553e;
    public final Object f3554f;
    public final Object h;
    public final Object f3555n;

    public d5(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, k80 k80Var, String[] strArr) {
        this.f3550a = 5;
        this.f3552c = inputGroupCall;
        this.f3551b = i7;
        this.d = strArr;
        this.f3553e = frameLayout;
        this.f3554f = k80Var;
        this.f3555n = x2Var;
        this.h = i6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.d5.run():void");
    }

    public d5(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ue ueVar, ue ueVar2, ue ueVar3) {
        this.f3550a = 2;
        this.f3551b = i7;
        this.f3552c = arrayList;
        this.d = arrayList2;
        this.f3553e = num;
        this.f3554f = ueVar;
        this.h = ueVar2;
        this.f3555n = ueVar3;
    }

    public d5(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3550a = i10;
        this.f3552c = obj;
        this.f3551b = i7;
        this.d = serializable;
        this.f3553e = obj2;
        this.f3554f = obj3;
        this.h = obj4;
        this.f3555n = obj5;
    }

    public d5(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3550a = i10;
        this.f3552c = obj;
        this.d = obj2;
        this.f3553e = obj3;
        this.f3551b = i7;
        this.f3554f = obj4;
        this.h = obj5;
        this.f3555n = obj6;
    }

    public d5(fs fsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.f3550a = i10;
        this.f3552c = fsVar;
        this.f3553e = tLObject;
        this.f3554f = obj;
        this.h = tLObject2;
        this.f3555n = obj2;
        this.f3551b = i7;
        this.d = str;
    }

    public d5(TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.i6 i6Var, p40 p40Var) {
        this.f3550a = 6;
        this.f3552c = tLObject;
        this.d = u1Var;
        this.f3554f = context;
        this.f3551b = i7;
        this.f3553e = exportgroupcallinvite;
        this.h = i6Var;
        this.f3555n = p40Var;
    }

    public d5(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f3550a = 8;
        this.f3552c = u1Var;
        this.d = tLObject;
        this.f3551b = i7;
        this.f3553e = document;
        this.f3554f = tL_error;
        this.h = obj;
        this.f3555n = tL_stickers_addStickerToSet;
    }

    public d5(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f3550a = 4;
        this.f3552c = g4Var;
        this.f3551b = i7;
        this.f3553e = bVar;
        this.f3554f = tLObject;
        this.d = str;
        this.h = f0Var;
        this.f3555n = tL_messages_getWebPage;
    }

    public d5(LaunchActivity launchActivity, TLObject tLObject, int i7, cx cxVar, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, String str) {
        this.f3550a = 12;
        this.f3552c = launchActivity;
        this.f3553e = tLObject;
        this.f3551b = i7;
        this.f3554f = cxVar;
        this.f3555n = h2Var;
        this.h = user;
        this.d = str;
    }

    public d5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.u1 u1Var, n60 n60Var, String str) {
        this.f3550a = 10;
        this.f3552c = launchActivity;
        this.f3553e = tL_error;
        this.f3554f = tLObject;
        this.f3551b = i7;
        this.h = u1Var;
        this.f3555n = n60Var;
        this.d = str;
    }

    public d5(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f3550a = 14;
        this.f3552c = ld0Var;
        this.d = str;
        this.f3553e = fVar;
        this.f3554f = list;
        this.h = str2;
        this.f3555n = str3;
        this.f3551b = i7;
    }

    public d5(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f3550a = 15;
        this.f3552c = profileActivity;
        this.f3553e = view;
        this.d = str;
        this.f3551b = i7;
        this.f3554f = zArr;
        this.h = strArr;
        this.f3555n = str2;
    }

    public d5(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, int i7, Object obj, String str, org.telegram.ui.Wallet.r0 r0Var, x10 x10Var) {
        this.f3550a = 16;
        this.f3552c = l2Var;
        this.f3553e = h2Var;
        this.f3551b = i7;
        this.f3554f = obj;
        this.d = str;
        this.h = r0Var;
        this.f3555n = x10Var;
    }

    public d5(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, fi.f7 f7Var) {
        this.f3550a = 18;
        this.f3552c = v0Var;
        this.d = str;
        this.f3553e = tLObject;
        this.f3554f = tL_error;
        this.f3551b = i7;
        this.h = s0Var;
        this.f3555n = f7Var;
    }

    public d5(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Wallet.w2 w2Var) {
        this.f3550a = 17;
        this.f3552c = zArr;
        this.f3554f = context;
        this.f3551b = i7;
        this.d = user;
        this.f3553e = jSONObject;
        this.h = i6Var;
        this.f3555n = w2Var;
    }
}
