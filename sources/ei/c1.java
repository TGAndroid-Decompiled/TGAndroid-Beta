package ei;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h31;
import org.telegram.ui.h60;
import org.telegram.ui.yn;
import org.telegram.ui.zh;
public final class c1 implements RequestDelegate {
    public final int f8950a = 0;
    public final long f8951b;
    public final int f8952c;
    public final Object d;
    public final Object f8953e;
    public final Object f8954f;
    public final Object f8955g;
    public final Object h;

    public c1(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8952c = i10;
        this.d = b2Var;
        this.f8953e = context;
        this.f8951b = j3;
        this.f8954f = d6Var;
        this.f8955g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f8950a;
        Object obj = this.h;
        Object obj2 = this.f8955g;
        Object obj3 = this.f8953e;
        Object obj4 = this.f8954f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new f1(tLObject, this.f8952c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f8951b, (d6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                return;
            case 1:
                h60.v((h60) obj5, this.f8951b, (HashSet) obj3, (AtomicInteger) obj4, this.f8952c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f1((LaunchActivity) obj5, tLObject, this.f8952c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f8951b));
                return;
            default:
                Activity activity = (Activity) obj5;
                d6 d6Var = (d6) obj4;
                byte[] bArr = (byte[]) obj3;
                yn ynVar = (yn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, d6Var, this.f8951b, bArr, ynVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new h31(ynVar, activity, d6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new zh(ynVar, this.f8952c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new h31(ynVar, activity, d6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public c1(Activity activity, d6 d6Var, long j3, byte[] bArr, yn ynVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f8954f = d6Var;
        this.f8951b = j3;
        this.f8953e = bArr;
        this.f8955g = ynVar;
        this.h = messageObject;
        this.f8952c = i10;
    }

    public c1(h60 h60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = h60Var;
        this.f8951b = j3;
        this.f8953e = hashSet;
        this.f8954f = atomicInteger;
        this.f8952c = i10;
        this.f8955g = call;
        this.h = str;
    }

    public c1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f8952c = i10;
        this.f8953e = str;
        this.f8954f = str2;
        this.f8955g = user;
        this.h = str3;
        this.f8951b = j3;
    }
}
