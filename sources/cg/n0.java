package cg;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import eg.u2;
import gg.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import lh.ja;
import lh.t7;
import nh.r5;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.zn;
public final class n0 implements Runnable {
    public final int f2458a;

    public n0(int i10) {
        this.f2458a = i10;
    }

    @Override
    public final void run() {
        switch (this.f2458a) {
            case 0:
                t0.b();
                return;
            case 1:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 2:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 3:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
            case 4:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f2606a;
                return;
            case 5:
                float[] fArr = u2.R;
                return;
            case 6:
                v2.e0(0, null);
                return;
            case 7:
                b4.e0 e0Var = kf.g.B;
                if (e0Var != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < kf.g.f10427y; i11++) {
                        if (((Bitmap[]) e0Var.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) e0Var.d)[i11]);
                        }
                        ((Bitmap[]) e0Var.d)[i11] = null;
                        ((kf.c0[]) e0Var.f1379c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new o0(arrayList, 1));
                    }
                    kf.g.B = null;
                    return;
                }
                return;
            case 8:
                p2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f20453a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj);
                    return;
                }
                return;
            case 9:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 10:
                p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new ja());
                    return;
                }
                return;
            case 11:
                t7[][] t7VarArr = t7.S;
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 13:
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 15:
                nh.j1.j();
                return;
            case 16:
                nh.j1 j1Var = nh.j1.W;
                j1Var.e.invalidate();
                if (!j1Var.e.isInLayout()) {
                    j1Var.e.requestLayout();
                    j1Var.d.requestLayout();
                    j1Var.f15485f.requestLayout();
                    return;
                }
                return;
            case 17:
                int i12 = r5.h;
                return;
            case 18:
                Comparator comparator = t6.X;
                return;
            case 19:
                j6.E(false);
                return;
            case 20:
                int i13 = zn.Ec;
                return;
            case 21:
                return;
            case 22:
                mg.m0.b(true);
                return;
            case 23:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                return;
            case 24:
                Pattern pattern = z4.f31242a;
                return;
            case 25:
                p2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    ?? obj2 = new Object();
                    obj2.f20453a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj2);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.cancelRunOnUIThread(l5.v);
                try {
                    if (l5.f26574q != null) {
                        for (int i15 = 0; i15 < l5.f26574q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) l5.f26574q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((l5) longSparseArray.valueAt(i16)).f26580a) {
                                    longSparseArray.removeAt(i16);
                                    i16--;
                                }
                                i16++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e);
                        return;
                    }
                    return;
                }
            case 27:
                c8 c8Var = c8.Q0;
                return;
            case 28:
                SavedMessagesController.openSavedMessages();
                return;
            default:
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.D1.startActivity(intent);
                    return;
                }
                return;
        }
    }

    public n0(Object obj, int i10) {
        this.f2458a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
