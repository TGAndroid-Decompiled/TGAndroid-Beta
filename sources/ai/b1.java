package ai;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.wc;
import org.telegram.ui.kr;
public final class b1 implements Utilities.Callback2 {
    public final int f1438a;
    public final boolean f1439b;
    public final NotificationCenter.NotificationCenterDelegate f1440c;
    public final Object d;

    public b1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f1438a = i10;
        this.f1440c = notificationCenterDelegate;
        this.d = obj;
        this.f1439b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f1438a) {
            case 0:
                f1 f1Var = (f1) this.f1440c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i10 = f1Var.f1487a;
                t1 t1Var = f1Var.f1488b;
                boolean z10 = false;
                if (f1Var.f1491n == ((int[]) this.d)[0] && !f1Var.E) {
                    f1Var.f1491n = 0;
                    boolean z11 = this.f1439b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = f1Var.f1490f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    t1Var.getClass();
                                    t1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    return;
                                }
                                return;
                            }
                        }
                        f1Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (t1Var.f1888v0) {
                            if (str != null) {
                                str2 = LocaleController.getString(R.string.ErrorOccurred);
                            }
                            t1Var.U0(str2);
                            return;
                        } else if (str != null) {
                            t1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i11 = f1Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            f1Var.f1490f = tL_exportedNoPaidMessagesToken;
                            f1Var.h = SystemClock.elapsedRealtime();
                            t1Var.setFreeLink(f1Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                kr krVar = (kr) this.f1440c;
                v8 v8Var = (v8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    krVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    return;
                }
                krVar.getClass();
                if (tL_error2 != null) {
                    v8Var.setChecked(this.f1439b);
                    wc.b0(krVar).g0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
