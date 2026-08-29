package ih;

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
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c60;
import org.telegram.ui.fy;
import org.telegram.ui.of0;
import org.telegram.ui.x60;
public final class m2 implements Runnable {
    public final int f9277a;
    public final int f9278b;
    public final Object f9279c;
    public final Object d;
    public final Object f9280e;
    public final Object f9281f;
    public final Object h;
    public final Object f9282n;

    public m2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var, y80 y80Var, String[] strArr) {
        this.f9277a = 4;
        this.f9279c = inputGroupCall;
        this.f9278b = i10;
        this.d = strArr;
        this.f9280e = frameLayout;
        this.f9281f = y80Var;
        this.f9282n = f3Var;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ih.m2.run():void");
    }

    public m2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9277a = 1;
        this.f9278b = i10;
        this.f9279c = arrayList;
        this.d = arrayList2;
        this.f9280e = num;
        this.f9281f = albumEntry;
        this.h = albumEntry2;
        this.f9282n = albumEntry3;
    }

    public m2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9277a = i11;
        this.f9279c = obj;
        this.f9278b = i10;
        this.d = serializable;
        this.f9280e = obj2;
        this.f9281f = obj3;
        this.h = obj4;
        this.f9282n = obj5;
    }

    public m2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f9277a = i11;
        this.f9279c = obj;
        this.d = obj2;
        this.f9280e = obj3;
        this.f9278b = i10;
        this.f9281f = obj4;
        this.h = obj5;
        this.f9282n = obj6;
    }

    public m2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.f9277a = i11;
        this.f9279c = notificationCenterDelegate;
        this.f9280e = tLObject;
        this.f9281f = tLObject2;
        this.h = tLObject3;
        this.f9282n = obj;
        this.f9278b = i10;
        this.d = str;
    }

    public m2(TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, c60 c60Var) {
        this.f9277a = 5;
        this.f9279c = tLObject;
        this.d = c2Var;
        this.f9281f = context;
        this.f9278b = i10;
        this.f9280e = exportgroupcallinvite;
        this.h = c6Var;
        this.f9282n = c60Var;
    }

    public m2(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9277a = 7;
        this.f9279c = c2Var;
        this.d = tLObject;
        this.f9278b = i10;
        this.f9280e = document;
        this.f9281f = tL_error;
        this.h = obj;
        this.f9282n = tL_stickers_addStickerToSet;
    }

    public m2(org.telegram.ui.m4 m4Var, int i10, ye.c cVar, TLObject tLObject, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9277a = 3;
        this.f9279c = m4Var;
        this.f9278b = i10;
        this.f9280e = cVar;
        this.f9281f = tLObject;
        this.d = str;
        this.h = i0Var;
        this.f9282n = tL_messages_getWebPage;
    }

    public m2(LaunchActivity launchActivity, TLObject tLObject, int i10, fy fyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f9277a = 11;
        this.f9279c = launchActivity;
        this.f9280e = tLObject;
        this.f9278b = i10;
        this.f9281f = fyVar;
        this.f9282n = o2Var;
        this.h = user;
        this.d = str;
    }

    public m2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, x60 x60Var, String str) {
        this.f9277a = 9;
        this.f9279c = launchActivity;
        this.f9280e = tL_error;
        this.f9281f = tLObject;
        this.f9278b = i10;
        this.h = c2Var;
        this.f9282n = x60Var;
        this.d = str;
    }

    public m2(of0 of0Var, String str, p2.g gVar, List list, String str2, String str3, int i10) {
        this.f9277a = 12;
        this.f9279c = of0Var;
        this.d = str;
        this.f9280e = gVar;
        this.f9281f = list;
        this.h = str2;
        this.f9282n = str3;
        this.f9278b = i10;
    }

    public m2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9277a = 13;
        this.f9279c = profileActivity;
        this.f9280e = view;
        this.d = str;
        this.f9278b = i10;
        this.f9281f = zArr;
        this.h = strArr;
        this.f9282n = str2;
    }
}
