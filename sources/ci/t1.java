package ci;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.su;
import org.telegram.ui.hh1;
import org.telegram.ui.uo0;
public final class t1 implements Runnable {
    public final int f5987a;
    public final boolean f5988b;
    public final Object f5989c;
    public final Object d;
    public final Object f5990e;
    public final Object f5991f;

    public t1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5987a = i10;
        this.f5989c = obj;
        this.d = obj2;
        this.f5990e = obj3;
        this.f5991f = obj4;
        this.f5988b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.t1.run():void");
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5987a = i10;
        this.f5989c = obj;
        this.d = obj2;
        this.f5990e = obj3;
        this.f5988b = z10;
        this.f5991f = obj4;
    }

    public t1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5987a = i10;
        this.f5989c = obj;
        this.f5990e = obj2;
        this.d = tLObject;
        this.f5991f = obj3;
        this.f5988b = z10;
    }

    public t1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5987a = i10;
        this.f5989c = obj;
        this.d = obj2;
        this.f5988b = z10;
        this.f5990e = obj3;
        this.f5991f = obj4;
    }

    public t1(ki.v0 v0Var, boolean z10, ki.w wVar, ki.r0 r0Var, File file) {
        this.f5987a = 4;
        this.f5989c = v0Var;
        this.f5988b = z10;
        this.d = wVar;
        this.f5990e = r0Var;
        this.f5991f = file;
    }

    public t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5987a = i10;
        this.f5989c = notificationCenterDelegate;
        this.f5990e = tLObject;
        this.f5988b = z10;
        this.d = tLObject2;
        this.f5991f = obj;
    }

    public t1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f5987a = 24;
        this.f5989c = payments_giveawayinfo;
        this.f5988b = z10;
        this.f5991f = str;
        this.d = tL_messageMediaGiveaway;
        this.f5990e = m2Var;
    }

    public t1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5987a = 16;
        this.f5989c = qaVar;
        this.f5991f = str;
        this.d = bitmap;
        this.f5988b = z10;
        this.f5990e = bitmap2;
    }

    public t1(su suVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5987a = 17;
        this.f5989c = suVar;
        this.f5988b = z10;
        this.d = oVar;
        this.f5991f = str;
        this.f5990e = textView;
    }

    public t1(iz izVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5987a = 18;
        this.f5989c = izVar;
        this.f5991f = str;
        this.f5988b = z10;
        this.f5990e = str2;
        this.d = tLObject;
    }

    public t1(uo0 uo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5987a = 21;
        this.f5989c = uo0Var;
        this.f5988b = z10;
        this.f5991f = str;
        this.d = str2;
        this.f5990e = updatepasswordsettings;
    }

    public t1(hh1 hh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5987a = 23;
        this.f5989c = hh1Var;
        this.d = tLObject;
        this.f5988b = z10;
        this.f5991f = str;
        this.f5990e = passwordinputsettings;
    }
}
