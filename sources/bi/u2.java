package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.i7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.is;
import org.telegram.messenger.ve;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g50;
import org.telegram.ui.kd0;
import org.telegram.ui.m40;
import org.telegram.ui.yw;
public final class u2 implements Runnable {
    public final int f3892a;
    public final int f3893b;
    public final Object f3894c;
    public final Object d;
    public final Object f3895e;
    public final Object f3896f;
    public final Object h;
    public final Object f3897n;

    public u2(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, z70 z70Var, String[] strArr) {
        this.f3892a = 5;
        this.f3894c = inputGroupCall;
        this.f3893b = i7;
        this.d = strArr;
        this.f3895e = frameLayout;
        this.f3896f = z70Var;
        this.f3897n = u2Var;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u2.run():void");
    }

    public u2(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ve veVar, ve veVar2, ve veVar3) {
        this.f3892a = 2;
        this.f3893b = i7;
        this.f3894c = arrayList;
        this.d = arrayList2;
        this.f3895e = num;
        this.f3896f = veVar;
        this.h = veVar2;
        this.f3897n = veVar3;
    }

    public u2(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3892a = i10;
        this.f3894c = obj;
        this.f3893b = i7;
        this.d = serializable;
        this.f3895e = obj2;
        this.f3896f = obj3;
        this.h = obj4;
        this.f3897n = obj5;
    }

    public u2(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3892a = i10;
        this.f3894c = obj;
        this.d = obj2;
        this.f3895e = obj3;
        this.f3893b = i7;
        this.f3896f = obj4;
        this.h = obj5;
        this.f3897n = obj6;
    }

    public u2(is isVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.f3892a = i10;
        this.f3894c = isVar;
        this.f3895e = tLObject;
        this.f3896f = obj;
        this.h = tLObject2;
        this.f3897n = obj2;
        this.f3893b = i7;
        this.d = str;
    }

    public u2(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, m40 m40Var) {
        this.f3892a = 6;
        this.f3894c = tLObject;
        this.d = t1Var;
        this.f3896f = context;
        this.f3893b = i7;
        this.f3895e = exportgroupcallinvite;
        this.h = e6Var;
        this.f3897n = m40Var;
    }

    public u2(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f3892a = 8;
        this.f3894c = t1Var;
        this.d = tLObject;
        this.f3893b = i7;
        this.f3895e = document;
        this.f3896f = tL_error;
        this.h = obj;
        this.f3897n = tL_stickers_addStickerToSet;
    }

    public u2(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f3892a = 4;
        this.f3894c = g4Var;
        this.f3893b = i7;
        this.f3895e = bVar;
        this.f3896f = tLObject;
        this.d = str;
        this.h = e0Var;
        this.f3897n = tL_messages_getWebPage;
    }

    public u2(LaunchActivity launchActivity, TLObject tLObject, int i7, yw ywVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        this.f3892a = 12;
        this.f3894c = launchActivity;
        this.f3895e = tLObject;
        this.f3893b = i7;
        this.f3896f = ywVar;
        this.f3897n = e2Var;
        this.h = user;
        this.d = str;
    }

    public u2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, g50 g50Var, String str) {
        this.f3892a = 10;
        this.f3894c = launchActivity;
        this.f3895e = tL_error;
        this.f3896f = tLObject;
        this.f3893b = i7;
        this.h = t1Var;
        this.f3897n = g50Var;
        this.d = str;
    }

    public u2(kd0 kd0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.f3892a = 14;
        this.f3894c = kd0Var;
        this.d = str;
        this.f3895e = fVar;
        this.f3896f = list;
        this.h = str2;
        this.f3897n = str3;
        this.f3893b = i7;
    }

    public u2(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.f3892a = 15;
        this.f3894c = profileActivity;
        this.f3895e = view;
        this.d = str;
        this.f3893b = i7;
        this.f3896f = zArr;
        this.h = strArr;
        this.f3897n = str2;
    }

    public u2(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, int i7, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, z10 z10Var) {
        this.f3892a = 16;
        this.f3894c = d2Var;
        this.f3895e = z1Var;
        this.f3893b = i7;
        this.f3896f = obj;
        this.d = str;
        this.h = i0Var;
        this.f3897n = z10Var;
    }

    public u2(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, i7 i7Var) {
        this.f3892a = 18;
        this.f3894c = v0Var;
        this.d = str;
        this.f3895e = tLObject;
        this.f3896f = tL_error;
        this.f3893b = i7;
        this.h = s0Var;
        this.f3897n = i7Var;
    }

    public u2(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Wallet.p2 p2Var) {
        this.f3892a = 17;
        this.f3894c = zArr;
        this.f3896f = context;
        this.f3893b = i7;
        this.d = user;
        this.f3895e = jSONObject;
        this.h = e6Var;
        this.f3897n = p2Var;
    }
}
