package fi;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di;
import org.telegram.ui.fo;
import org.telegram.ui.n60;
import org.telegram.ui.u31;
public final class a1 implements RequestDelegate {
    public final int f9159a = 0;
    public final long f9160b;
    public final int f9161c;
    public final Object d;
    public final Object e;
    public final Object f9162f;
    public final Object f9163g;
    public final Object h;

    public a1(int i10, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9161c = i10;
        this.d = a2Var;
        this.e = context;
        this.f9160b = j10;
        this.f9162f = c6Var;
        this.f9163g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9159a;
        Object obj = this.h;
        Object obj2 = this.f9163g;
        Object obj3 = this.e;
        Object obj4 = this.f9162f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new d1(tLObject, this.f9161c, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj3, this.f9160b, (c6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                return;
            case 1:
                n60.x((n60) obj5, this.f9160b, (HashSet) obj3, (AtomicInteger) obj4, this.f9161c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj5, tLObject, this.f9161c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f9160b));
                return;
            default:
                Activity activity = (Activity) obj5;
                c6 c6Var = (c6) obj4;
                byte[] bArr = (byte[]) obj3;
                fo foVar = (fo) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, c6Var, this.f9160b, bArr, foVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new u31(foVar, activity, c6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new di(foVar, this.f9161c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new u31(foVar, activity, c6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public a1(Activity activity, c6 c6Var, long j10, byte[] bArr, fo foVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f9162f = c6Var;
        this.f9160b = j10;
        this.e = bArr;
        this.f9163g = foVar;
        this.h = messageObject;
        this.f9161c = i10;
    }

    public a1(n60 n60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = n60Var;
        this.f9160b = j10;
        this.e = hashSet;
        this.f9162f = atomicInteger;
        this.f9161c = i10;
        this.f9163g = call;
        this.h = str;
    }

    public a1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f9161c = i10;
        this.e = str;
        this.f9162f = str2;
        this.f9163g = user;
        this.h = str3;
        this.f9160b = j10;
    }
}
