package lh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p60;
import org.telegram.ui.py;
import org.telegram.ui.v10;
import org.telegram.ui.xf0;
public final class l2 implements Runnable {
    public final int f12837a;
    public final int f12838b;
    public final Object f12839c;
    public final Object d;
    public final Object f12840e;
    public final Object f12841f;
    public final Object h;
    public final Object f12842n;

    public l2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.h3 h3Var, g6 g6Var, g90 g90Var, String[] strArr) {
        this.f12837a = 4;
        this.f12839c = inputGroupCall;
        this.f12838b = i10;
        this.d = strArr;
        this.f12840e = frameLayout;
        this.f12841f = g90Var;
        this.f12842n = h3Var;
        this.h = g6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.l2.run():void");
    }

    public l2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f12837a = 1;
        this.f12838b = i10;
        this.f12839c = arrayList;
        this.d = arrayList2;
        this.f12840e = num;
        this.f12841f = albumEntry;
        this.h = albumEntry2;
        this.f12842n = albumEntry3;
    }

    public l2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f12837a = i11;
        this.f12839c = obj;
        this.f12838b = i10;
        this.d = serializable;
        this.f12840e = obj2;
        this.f12841f = obj3;
        this.h = obj4;
        this.f12842n = obj5;
    }

    public l2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f12837a = i11;
        this.f12839c = obj;
        this.d = obj2;
        this.f12840e = obj3;
        this.f12838b = i10;
        this.f12841f = obj4;
        this.h = obj5;
        this.f12842n = obj6;
    }

    public l2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.f12837a = i11;
        this.f12839c = notificationCenterDelegate;
        this.f12840e = tLObject;
        this.f12841f = tLObject2;
        this.h = tLObject3;
        this.f12842n = obj;
        this.f12838b = i10;
        this.d = str;
    }

    public l2(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, g6 g6Var, p60 p60Var) {
        this.f12837a = 5;
        this.f12839c = tLObject;
        this.d = d2Var;
        this.f12841f = context;
        this.f12838b = i10;
        this.f12840e = exportgroupcallinvite;
        this.h = g6Var;
        this.f12842n = p60Var;
    }

    public l2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f12837a = 7;
        this.f12839c = d2Var;
        this.d = tLObject;
        this.f12838b = i10;
        this.f12840e = document;
        this.f12841f = tL_error;
        this.h = obj;
        this.f12842n = tL_stickers_addStickerToSet;
    }

    public l2(org.telegram.ui.l4 l4Var, int i10, af.f fVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f12837a = 3;
        this.f12839c = l4Var;
        this.f12838b = i10;
        this.f12840e = fVar;
        this.f12841f = tLObject;
        this.d = str;
        this.h = h0Var;
        this.f12842n = tL_messages_getWebPage;
    }

    public l2(LaunchActivity launchActivity, TLObject tLObject, int i10, py pyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f12837a = 11;
        this.f12839c = launchActivity;
        this.f12840e = tLObject;
        this.f12838b = i10;
        this.f12841f = pyVar;
        this.f12842n = p2Var;
        this.h = user;
        this.d = str;
    }

    public l2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, v10 v10Var, String str) {
        this.f12837a = 9;
        this.f12839c = launchActivity;
        this.f12840e = tL_error;
        this.f12841f = tLObject;
        this.f12838b = i10;
        this.h = d2Var;
        this.f12842n = v10Var;
        this.d = str;
    }

    public l2(xf0 xf0Var, String str, p2.h hVar, List list, String str2, String str3, int i10) {
        this.f12837a = 12;
        this.f12839c = xf0Var;
        this.d = str;
        this.f12840e = hVar;
        this.f12841f = list;
        this.h = str2;
        this.f12842n = str3;
        this.f12838b = i10;
    }

    public l2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f12837a = 13;
        this.f12839c = profileActivity;
        this.f12840e = view;
        this.d = str;
        this.f12838b = i10;
        this.f12841f = zArr;
        this.h = strArr;
        this.f12842n = str2;
    }
}
