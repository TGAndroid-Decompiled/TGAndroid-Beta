package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.e90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g00;
import org.telegram.ui.o60;
import org.telegram.ui.oy;
import org.telegram.ui.wf0;
public final class m2 implements Runnable {
    public final int f10705a;
    public final int f10706b;
    public final Object f10707c;
    public final Object d;
    public final Object e;
    public final Object f10708f;
    public final Object h;
    public final Object f10709n;

    public m2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, e90 e90Var, String[] strArr) {
        this.f10705a = 4;
        this.f10707c = inputGroupCall;
        this.f10706b = i10;
        this.d = strArr;
        this.e = frameLayout;
        this.f10708f = e90Var;
        this.f10709n = g3Var;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: kh.m2.run():void");
    }

    public m2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10705a = 1;
        this.f10706b = i10;
        this.f10707c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f10708f = albumEntry;
        this.h = albumEntry2;
        this.f10709n = albumEntry3;
    }

    public m2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10705a = i11;
        this.f10707c = obj;
        this.f10706b = i10;
        this.d = serializable;
        this.e = obj2;
        this.f10708f = obj3;
        this.h = obj4;
        this.f10709n = obj5;
    }

    public m2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f10705a = i11;
        this.f10707c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10706b = i10;
        this.f10708f = obj4;
        this.h = obj5;
        this.f10709n = obj6;
    }

    public m2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.f10705a = i11;
        this.f10707c = notificationCenterDelegate;
        this.e = tLObject;
        this.f10708f = tLObject2;
        this.h = tLObject3;
        this.f10709n = obj;
        this.f10706b = i10;
        this.d = str;
    }

    public m2(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, o60 o60Var) {
        this.f10705a = 5;
        this.f10707c = tLObject;
        this.d = d2Var;
        this.f10708f = context;
        this.f10706b = i10;
        this.e = exportgroupcallinvite;
        this.h = f6Var;
        this.f10709n = o60Var;
    }

    public m2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10705a = 7;
        this.f10707c = d2Var;
        this.d = tLObject;
        this.f10706b = i10;
        this.e = document;
        this.f10708f = tL_error;
        this.h = obj;
        this.f10709n = tL_stickers_addStickerToSet;
    }

    public m2(org.telegram.ui.l4 l4Var, int i10, af.f fVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10705a = 3;
        this.f10707c = l4Var;
        this.f10706b = i10;
        this.e = fVar;
        this.f10708f = tLObject;
        this.d = str;
        this.h = h0Var;
        this.f10709n = tL_messages_getWebPage;
    }

    public m2(LaunchActivity launchActivity, TLObject tLObject, int i10, oy oyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f10705a = 11;
        this.f10707c = launchActivity;
        this.e = tLObject;
        this.f10706b = i10;
        this.f10708f = oyVar;
        this.f10709n = p2Var;
        this.h = user;
        this.d = str;
    }

    public m2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, g00 g00Var, String str) {
        this.f10705a = 9;
        this.f10707c = launchActivity;
        this.e = tL_error;
        this.f10708f = tLObject;
        this.f10706b = i10;
        this.h = d2Var;
        this.f10709n = g00Var;
        this.d = str;
    }

    public m2(wf0 wf0Var, String str, p2.h hVar, List list, String str2, String str3, int i10) {
        this.f10705a = 12;
        this.f10707c = wf0Var;
        this.d = str;
        this.e = hVar;
        this.f10708f = list;
        this.h = str2;
        this.f10709n = str3;
        this.f10706b = i10;
    }

    public m2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10705a = 13;
        this.f10707c = profileActivity;
        this.e = view;
        this.d = str;
        this.f10706b = i10;
        this.f10708f = zArr;
        this.h = strArr;
        this.f10709n = str2;
    }
}
