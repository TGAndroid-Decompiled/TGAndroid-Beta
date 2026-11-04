package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.p7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.cs;
import org.telegram.messenger.pe;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h40;
import org.telegram.ui.id0;
import org.telegram.ui.ly;
import org.telegram.ui.uw;
public final class d3 implements Runnable {
    public final int f562a;
    public final int f563b;
    public final Object f564c;
    public final Object d;
    public final Object f565e;
    public final Object f566f;
    public final Object h;
    public final Object f567n;

    public d3(int i3, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, s70 s70Var, String[] strArr) {
        this.f562a = 5;
        this.f564c = inputGroupCall;
        this.f563b = i3;
        this.d = strArr;
        this.f565e = frameLayout;
        this.f566f = s70Var;
        this.f567n = t2Var;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.d3.run():void");
    }

    public d3(int i3, ArrayList arrayList, ArrayList arrayList2, Integer num, pe peVar, pe peVar2, pe peVar3) {
        this.f562a = 2;
        this.f563b = i3;
        this.f564c = arrayList;
        this.d = arrayList2;
        this.f565e = num;
        this.f566f = peVar;
        this.h = peVar2;
        this.f567n = peVar3;
    }

    public d3(Object obj, int i3, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f562a = i10;
        this.f564c = obj;
        this.f563b = i3;
        this.d = serializable;
        this.f565e = obj2;
        this.f566f = obj3;
        this.h = obj4;
        this.f567n = obj5;
    }

    public d3(Object obj, Object obj2, Object obj3, int i3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f562a = i10;
        this.f564c = obj;
        this.d = obj2;
        this.f565e = obj3;
        this.f563b = i3;
        this.f566f = obj4;
        this.h = obj5;
        this.f567n = obj6;
    }

    public d3(cs csVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i3, String str, int i10) {
        this.f562a = i10;
        this.f564c = csVar;
        this.f565e = tLObject;
        this.f566f = obj;
        this.h = tLObject2;
        this.f567n = obj2;
        this.f563b = i3;
        this.d = str;
    }

    public d3(TLObject tLObject, org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, h40 h40Var) {
        this.f562a = 6;
        this.f564c = tLObject;
        this.d = s1Var;
        this.f566f = context;
        this.f563b = i3;
        this.f565e = exportgroupcallinvite;
        this.h = e6Var;
        this.f567n = h40Var;
    }

    public d3(org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, int i3, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f562a = 8;
        this.f564c = s1Var;
        this.d = tLObject;
        this.f563b = i3;
        this.f565e = document;
        this.f566f = tL_error;
        this.h = obj;
        this.f567n = tL_stickers_addStickerToSet;
    }

    public d3(org.telegram.ui.i4 i4Var, int i3, sf.b bVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f562a = 4;
        this.f564c = i4Var;
        this.f563b = i3;
        this.f565e = bVar;
        this.f566f = tLObject;
        this.d = str;
        this.h = g0Var;
        this.f567n = tL_messages_getWebPage;
    }

    public d3(LaunchActivity launchActivity, TLObject tLObject, int i3, uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.f562a = 12;
        this.f564c = launchActivity;
        this.f565e = tLObject;
        this.f563b = i3;
        this.f566f = uwVar;
        this.f567n = d2Var;
        this.h = user;
        this.d = str;
    }

    public d3(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i3, org.telegram.ui.ActionBar.s1 s1Var, ly lyVar, String str) {
        this.f562a = 10;
        this.f564c = launchActivity;
        this.f565e = tL_error;
        this.f566f = tLObject;
        this.f563b = i3;
        this.h = s1Var;
        this.f567n = lyVar;
        this.d = str;
    }

    public d3(id0 id0Var, String str, e5.f fVar, List list, String str2, String str3, int i3) {
        this.f562a = 14;
        this.f564c = id0Var;
        this.d = str;
        this.f565e = fVar;
        this.f566f = list;
        this.h = str2;
        this.f567n = str3;
        this.f563b = i3;
    }

    public d3(ProfileActivity profileActivity, View view, String str, int i3, boolean[] zArr, String[] strArr, String str2) {
        this.f562a = 15;
        this.f564c = profileActivity;
        this.f565e = view;
        this.d = str;
        this.f563b = i3;
        this.f566f = zArr;
        this.h = strArr;
        this.f567n = str2;
    }

    public d3(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, int i3, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, u10 u10Var) {
        this.f562a = 16;
        this.f564c = c2Var;
        this.f565e = y1Var;
        this.f563b = i3;
        this.f566f = obj;
        this.d = str;
        this.h = h0Var;
        this.f567n = u10Var;
    }

    public d3(org.telegram.ui.web.w0 w0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i3, org.telegram.ui.web.t0 t0Var, p7 p7Var) {
        this.f562a = 18;
        this.f564c = w0Var;
        this.d = str;
        this.f565e = tLObject;
        this.f566f = tL_error;
        this.f563b = i3;
        this.h = t0Var;
        this.f567n = p7Var;
    }

    public d3(boolean[] zArr, Context context, int i3, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Wallet.q2 q2Var) {
        this.f562a = 17;
        this.f564c = zArr;
        this.f566f = context;
        this.f563b = i3;
        this.d = user;
        this.f565e = jSONObject;
        this.h = e6Var;
        this.f567n = q2Var;
    }
}
