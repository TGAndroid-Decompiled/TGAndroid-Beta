package ci;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.uy;
import org.telegram.ui.ro0;
import org.telegram.ui.zg1;
public final class u1 implements Runnable {
    public final int f5623a;
    public final boolean f5624b;
    public final Object f5625c;
    public final Object d;
    public final Object e;
    public final Object f5626f;

    public u1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5623a = i10;
        this.f5625c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5626f = obj4;
        this.f5624b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.u1.run():void");
    }

    public u1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5623a = i10;
        this.f5625c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5624b = z10;
        this.f5626f = obj4;
    }

    public u1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5623a = i10;
        this.f5625c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f5626f = obj3;
        this.f5624b = z10;
    }

    public u1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5623a = i10;
        this.f5625c = obj;
        this.d = obj2;
        this.f5624b = z10;
        this.e = obj3;
        this.f5626f = obj4;
    }

    public u1(ki.s0 s0Var, boolean z10, ki.t tVar, ki.o0 o0Var, File file) {
        this.f5623a = 4;
        this.f5625c = s0Var;
        this.f5624b = z10;
        this.d = tVar;
        this.e = o0Var;
        this.f5626f = file;
    }

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5623a = i10;
        this.f5625c = notificationCenterDelegate;
        this.e = tLObject;
        this.f5624b = z10;
        this.d = tLObject2;
        this.f5626f = obj;
    }

    public u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f5623a = 24;
        this.f5625c = payments_giveawayinfo;
        this.f5624b = z10;
        this.f5626f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = o2Var;
    }

    public u1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5623a = 16;
        this.f5625c = oaVar;
        this.f5626f = str;
        this.d = bitmap;
        this.f5624b = z10;
        this.e = bitmap2;
    }

    public u1(du duVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5623a = 17;
        this.f5625c = duVar;
        this.f5624b = z10;
        this.d = oVar;
        this.f5626f = str;
        this.e = textView;
    }

    public u1(uy uyVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5623a = 18;
        this.f5625c = uyVar;
        this.f5626f = str;
        this.f5624b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public u1(ro0 ro0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5623a = 21;
        this.f5625c = ro0Var;
        this.f5624b = z10;
        this.f5626f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public u1(zg1 zg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5623a = 23;
        this.f5625c = zg1Var;
        this.d = tLObject;
        this.f5624b = z10;
        this.f5626f = str;
        this.e = passwordinputsettings;
    }
}
