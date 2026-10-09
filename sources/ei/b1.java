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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g60;
import org.telegram.ui.o31;
import org.telegram.ui.zh;
import org.telegram.ui.zn;
public final class b1 implements RequestDelegate {
    public final int f8958a = 0;
    public final long f8959b;
    public final int f8960c;
    public final Object d;
    public final Object f8961e;
    public final Object f8962f;
    public final Object f8963g;
    public final Object h;

    public b1(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, e6 e6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8960c = i10;
        this.d = b2Var;
        this.f8961e = context;
        this.f8959b = j3;
        this.f8962f = e6Var;
        this.f8963g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f8958a;
        Object obj = this.h;
        Object obj2 = this.f8963g;
        Object obj3 = this.f8961e;
        Object obj4 = this.f8962f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new e1(tLObject, this.f8960c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f8959b, (e6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                return;
            case 1:
                g60.x((g60) obj5, this.f8959b, (HashSet) obj3, (AtomicInteger) obj4, this.f8960c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e1((LaunchActivity) obj5, tLObject, this.f8960c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f8959b));
                return;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                byte[] bArr = (byte[]) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, e6Var, this.f8959b, bArr, znVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new o31(znVar, activity, e6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new zh(znVar, this.f8960c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new o31(znVar, activity, e6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public b1(Activity activity, e6 e6Var, long j3, byte[] bArr, zn znVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f8962f = e6Var;
        this.f8959b = j3;
        this.f8961e = bArr;
        this.f8963g = znVar;
        this.h = messageObject;
        this.f8960c = i10;
    }

    public b1(g60 g60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = g60Var;
        this.f8959b = j3;
        this.f8961e = hashSet;
        this.f8962f = atomicInteger;
        this.f8960c = i10;
        this.f8963g = call;
        this.h = str;
    }

    public b1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f8960c = i10;
        this.f8961e = str;
        this.f8962f = str2;
        this.f8963g = user;
        this.h = str3;
        this.f8959b = j3;
    }
}
