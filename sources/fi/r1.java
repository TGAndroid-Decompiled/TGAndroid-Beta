package fi;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ju;
import org.telegram.ui.dg1;
import org.telegram.ui.po0;
public final class r1 implements Runnable {
    public final int f11537a;
    public final boolean f11538b;
    public final Object f11539c;
    public final Object d;
    public final Object e;
    public final Object f11540f;

    public r1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11537a = i10;
        this.f11539c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f11540f = obj4;
        this.f11538b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.r1.run():void");
    }

    public r1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f11537a = i10;
        this.f11539c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f11538b = z10;
        this.f11540f = obj4;
    }

    public r1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f11537a = i10;
        this.f11539c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f11540f = obj3;
        this.f11538b = z10;
    }

    public r1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f11537a = i10;
        this.f11539c = obj;
        this.d = obj2;
        this.f11538b = z10;
        this.e = obj3;
        this.f11540f = obj4;
    }

    public r1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f11537a = i10;
        this.f11539c = notificationCenterDelegate;
        this.e = tLObject;
        this.f11538b = z10;
        this.d = tLObject2;
        this.f11540f = obj;
    }

    public r1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f11537a = 23;
        this.f11539c = payments_giveawayinfo;
        this.f11538b = z10;
        this.f11540f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = r2Var;
    }

    public r1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f11537a = 15;
        this.f11539c = qaVar;
        this.f11540f = str;
        this.d = bitmap;
        this.f11538b = z10;
        this.e = bitmap2;
    }

    public r1(ju juVar, boolean z10, bi.t tVar, String str, TextView textView) {
        this.f11537a = 16;
        this.f11539c = juVar;
        this.f11538b = z10;
        this.d = tVar;
        this.f11540f = str;
        this.e = textView;
    }

    public r1(az azVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f11537a = 17;
        this.f11539c = azVar;
        this.f11540f = str;
        this.f11538b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public r1(po0 po0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f11537a = 20;
        this.f11539c = po0Var;
        this.f11538b = z10;
        this.f11540f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public r1(dg1 dg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f11537a = 22;
        this.f11539c = dg1Var;
        this.d = tLObject;
        this.f11538b = z10;
        this.f11540f = str;
        this.e = passwordinputsettings;
    }

    public r1(vi.s0 s0Var, boolean z10, vi.v vVar, vi.o0 o0Var, File file) {
        this.f11537a = 24;
        this.f11539c = s0Var;
        this.f11538b = z10;
        this.d = vVar;
        this.e = o0Var;
        this.f11540f = file;
    }
}
