package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import nh.j7;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q60;
import org.telegram.ui.qy;
import org.telegram.ui.w10;
import org.telegram.ui.yf0;
public final class l2 implements Runnable {
    public final int f10801a;
    public final int f10802b;
    public final Object f10803c;
    public final Object d;
    public final Object e;
    public final Object f10804f;
    public final Object h;
    public final Object f10805n;

    public l2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.g3 g3Var, f6 f6Var, f90 f90Var, String[] strArr) {
        this.f10801a = 4;
        this.f10803c = inputGroupCall;
        this.f10802b = i10;
        this.d = strArr;
        this.e = frameLayout;
        this.f10804f = f90Var;
        this.f10805n = g3Var;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: kh.l2.run():void");
    }

    public l2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10801a = 1;
        this.f10802b = i10;
        this.f10803c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f10804f = albumEntry;
        this.h = albumEntry2;
        this.f10805n = albumEntry3;
    }

    public l2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10801a = i11;
        this.f10803c = obj;
        this.f10802b = i10;
        this.d = serializable;
        this.e = obj2;
        this.f10804f = obj3;
        this.h = obj4;
        this.f10805n = obj5;
    }

    public l2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f10801a = i11;
        this.f10803c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10802b = i10;
        this.f10804f = obj4;
        this.h = obj5;
        this.f10805n = obj6;
    }

    public l2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.f10801a = i11;
        this.f10803c = notificationCenterDelegate;
        this.e = tLObject;
        this.f10804f = tLObject2;
        this.h = tLObject3;
        this.f10805n = obj;
        this.f10802b = i10;
        this.d = str;
    }

    public l2(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, q60 q60Var) {
        this.f10801a = 5;
        this.f10803c = tLObject;
        this.d = d2Var;
        this.f10804f = context;
        this.f10802b = i10;
        this.e = exportgroupcallinvite;
        this.h = f6Var;
        this.f10805n = q60Var;
    }

    public l2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10801a = 7;
        this.f10803c = d2Var;
        this.d = tLObject;
        this.f10802b = i10;
        this.e = document;
        this.f10804f = tL_error;
        this.h = obj;
        this.f10805n = tL_stickers_addStickerToSet;
    }

    public l2(org.telegram.ui.n4 n4Var, int i10, ze.c cVar, TLObject tLObject, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10801a = 3;
        this.f10803c = n4Var;
        this.f10802b = i10;
        this.e = cVar;
        this.f10804f = tLObject;
        this.d = str;
        this.h = i0Var;
        this.f10805n = tL_messages_getWebPage;
    }

    public l2(LaunchActivity launchActivity, TLObject tLObject, int i10, qy qyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f10801a = 11;
        this.f10803c = launchActivity;
        this.e = tLObject;
        this.f10802b = i10;
        this.f10804f = qyVar;
        this.f10805n = p2Var;
        this.h = user;
        this.d = str;
    }

    public l2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, w10 w10Var, String str) {
        this.f10801a = 9;
        this.f10803c = launchActivity;
        this.e = tL_error;
        this.f10804f = tLObject;
        this.f10802b = i10;
        this.h = d2Var;
        this.f10805n = w10Var;
        this.d = str;
    }

    public l2(yf0 yf0Var, String str, p2.h hVar, List list, String str2, String str3, int i10) {
        this.f10801a = 12;
        this.f10803c = yf0Var;
        this.d = str;
        this.e = hVar;
        this.f10804f = list;
        this.h = str2;
        this.f10805n = str3;
        this.f10802b = i10;
    }

    public l2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10801a = 13;
        this.f10803c = profileActivity;
        this.e = view;
        this.d = str;
        this.f10802b = i10;
        this.f10804f = zArr;
        this.h = strArr;
        this.f10805n = str2;
    }

    public l2(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, j7 j7Var) {
        this.f10801a = 14;
        this.f10803c = c1Var;
        this.d = str;
        this.e = tLObject;
        this.f10804f = tL_error;
        this.f10802b = i10;
        this.h = y0Var;
        this.f10805n = j7Var;
    }
}
