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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.co;
import org.telegram.ui.j60;
import org.telegram.ui.p31;
public final class b1 implements RequestDelegate {
    public final int f9555a = 0;
    public final long f9556b;
    public final int f9557c;
    public final Object d;
    public final Object f9558e;
    public final Object f9559f;
    public final Object f9560g;
    public final Object h;

    public b1(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.f9557c = i10;
        this.d = b2Var;
        this.f9558e = context;
        this.f9556b = j3;
        this.f9559f = f6Var;
        this.f9560g = uVar;
        this.h = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9555a;
        Object obj = this.h;
        Object obj2 = this.f9560g;
        Object obj3 = this.f9558e;
        Object obj4 = this.f9559f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new e1(tLObject, this.f9557c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f9556b, (f6) obj4, (org.telegram.ui.web.u) obj2, eVar));
                return;
            case 1:
                j60.v((j60) obj5, this.f9556b, (HashSet) obj3, (AtomicInteger) obj4, this.f9557c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e1((LaunchActivity) obj5, tLObject, this.f9557c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f9556b));
                return;
            default:
                Activity activity = (Activity) obj5;
                f6 f6Var = (f6) obj4;
                byte[] bArr = (byte[]) obj3;
                co coVar = (co) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, f6Var, this.f9556b, bArr, coVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new p31(coVar, activity, f6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ai(coVar, this.f9557c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new p31(coVar, activity, f6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public b1(Activity activity, f6 f6Var, long j3, byte[] bArr, co coVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f9559f = f6Var;
        this.f9556b = j3;
        this.f9558e = bArr;
        this.f9560g = coVar;
        this.h = messageObject;
        this.f9557c = i10;
    }

    public b1(j60 j60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = j60Var;
        this.f9556b = j3;
        this.f9558e = hashSet;
        this.f9559f = atomicInteger;
        this.f9557c = i10;
        this.f9560g = call;
        this.h = str;
    }

    public b1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f9557c = i10;
        this.f9558e = str;
        this.f9559f = str2;
        this.f9560g = user;
        this.h = str3;
        this.f9556b = j3;
    }
}
