package fh;

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
import org.telegram.ui.Components.l80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a60;
import org.telegram.ui.dy;
import org.telegram.ui.of0;
import org.telegram.ui.x20;
public final class u2 implements Runnable {
    public final int f6778a;
    public final int f6779b;
    public final Object f6780c;
    public final Object d;
    public final Object f6781e;
    public final Object f6782f;
    public final Object h;
    public final Object f6783n;

    public u2(int i9, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, l80 l80Var, String[] strArr) {
        this.f6778a = 5;
        this.f6780c = inputGroupCall;
        this.f6779b = i9;
        this.d = strArr;
        this.f6781e = frameLayout;
        this.f6782f = l80Var;
        this.f6783n = f3Var;
        this.h = b6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fh.u2.run():void");
    }

    public u2(int i9, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f6778a = 2;
        this.f6779b = i9;
        this.f6780c = arrayList;
        this.d = arrayList2;
        this.f6781e = num;
        this.f6782f = albumEntry;
        this.h = albumEntry2;
        this.f6783n = albumEntry3;
    }

    public u2(Object obj, int i9, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6778a = i10;
        this.f6780c = obj;
        this.f6779b = i9;
        this.d = serializable;
        this.f6781e = obj2;
        this.f6782f = obj3;
        this.h = obj4;
        this.f6783n = obj5;
    }

    public u2(Object obj, Object obj2, Object obj3, int i9, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6778a = i10;
        this.f6780c = obj;
        this.d = obj2;
        this.f6781e = obj3;
        this.f6779b = i9;
        this.f6782f = obj4;
        this.h = obj5;
        this.f6783n = obj6;
    }

    public u2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i9, String str, int i10) {
        this.f6778a = i10;
        this.f6780c = notificationCenterDelegate;
        this.f6781e = tLObject;
        this.f6782f = tLObject2;
        this.h = tLObject3;
        this.f6783n = obj;
        this.f6779b = i9;
        this.d = str;
    }

    public u2(TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.b6 b6Var, a60 a60Var) {
        this.f6778a = 6;
        this.f6780c = tLObject;
        this.d = c2Var;
        this.f6782f = context;
        this.f6779b = i9;
        this.f6781e = exportgroupcallinvite;
        this.h = b6Var;
        this.f6783n = a60Var;
    }

    public u2(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i9, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f6778a = 8;
        this.f6780c = c2Var;
        this.d = tLObject;
        this.f6779b = i9;
        this.f6781e = document;
        this.f6782f = tL_error;
        this.h = obj;
        this.f6783n = tL_stickers_addStickerToSet;
    }

    public u2(org.telegram.ui.l4 l4Var, int i9, ve.d dVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f6778a = 4;
        this.f6780c = l4Var;
        this.f6779b = i9;
        this.f6781e = dVar;
        this.f6782f = tLObject;
        this.d = str;
        this.h = h0Var;
        this.f6783n = tL_messages_getWebPage;
    }

    public u2(LaunchActivity launchActivity, TLObject tLObject, int i9, dy dyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f6778a = 12;
        this.f6780c = launchActivity;
        this.f6781e = tLObject;
        this.f6779b = i9;
        this.f6782f = dyVar;
        this.f6783n = o2Var;
        this.h = user;
        this.d = str;
    }

    public u2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i9, org.telegram.ui.ActionBar.c2 c2Var, x20 x20Var, String str) {
        this.f6778a = 10;
        this.f6780c = launchActivity;
        this.f6781e = tL_error;
        this.f6782f = tLObject;
        this.f6779b = i9;
        this.h = c2Var;
        this.f6783n = x20Var;
        this.d = str;
    }

    public u2(of0 of0Var, String str, n2.g gVar, List list, String str2, String str3, int i9) {
        this.f6778a = 13;
        this.f6780c = of0Var;
        this.d = str;
        this.f6781e = gVar;
        this.f6782f = list;
        this.h = str2;
        this.f6783n = str3;
        this.f6779b = i9;
    }

    public u2(ProfileActivity profileActivity, View view, String str, int i9, boolean[] zArr, String[] strArr, String str2) {
        this.f6778a = 14;
        this.f6780c = profileActivity;
        this.f6781e = view;
        this.d = str;
        this.f6779b = i9;
        this.f6782f = zArr;
        this.h = strArr;
        this.f6783n = str2;
    }
}
