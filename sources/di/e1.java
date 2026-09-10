package di;

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
import org.telegram.ui.ci;
import org.telegram.ui.eo;
import org.telegram.ui.j60;
import org.telegram.ui.t31;
public final class e1 implements RequestDelegate {
    public final int f6595a = 0;
    public final long f6596b;
    public final int f6597c;
    public final Object d;
    public final Object e;
    public final Object f6598f;
    public final Object f6599g;
    public final Object h;

    public e1(int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.f6597c = i10;
        this.d = d2Var;
        this.e = context;
        this.f6596b = j3;
        this.f6598f = f6Var;
        this.f6599g = tVar;
        this.h = gVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6595a;
        Object obj = this.h;
        Object obj2 = this.f6599g;
        Object obj3 = this.e;
        Object obj4 = this.f6598f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) obj;
                AndroidUtilities.runOnUIThread(new h1(tLObject, this.f6597c, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj3, this.f6596b, (f6) obj4, (org.telegram.ui.web.t) obj2, gVar));
                return;
            case 1:
                j60.v((j60) obj5, this.f6596b, (HashSet) obj3, (AtomicInteger) obj4, this.f6597c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h1((LaunchActivity) obj5, tLObject, this.f6597c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f6596b));
                return;
            default:
                Activity activity = (Activity) obj5;
                f6 f6Var = (f6) obj4;
                byte[] bArr = (byte[]) obj3;
                eo eoVar = (eo) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(tLObject, activity, f6Var, this.f6596b, bArr, eoVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new t31(eoVar, activity, f6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ci(eoVar, this.f6597c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new t31(eoVar, activity, f6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public e1(Activity activity, f6 f6Var, long j3, byte[] bArr, eo eoVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f6598f = f6Var;
        this.f6596b = j3;
        this.e = bArr;
        this.f6599g = eoVar;
        this.h = messageObject;
        this.f6597c = i10;
    }

    public e1(j60 j60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = j60Var;
        this.f6596b = j3;
        this.e = hashSet;
        this.f6598f = atomicInteger;
        this.f6597c = i10;
        this.f6599g = call;
        this.h = str;
    }

    public e1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f6597c = i10;
        this.e = str;
        this.f6598f = str2;
        this.f6599g = user;
        this.h = str3;
        this.f6596b = j3;
    }
}
