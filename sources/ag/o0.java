package ag;

import android.graphics.Bitmap;
import android.os.Looper;
import cg.w2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import jh.ia;
import jh.s7;
import lh.q5;
import lh.s6;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.tn;
public final class o0 implements Runnable {
    public final int f622a;

    public o0(int i10) {
        this.f622a = i10;
    }

    @Override
    public final void run() {
        switch (this.f622a) {
            case 0:
                u0.b();
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
                float[] fArr = w2.Q;
                return;
            case 5:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f3513a;
                return;
            case 6:
                eg.w2.e0(0, null);
                return;
            case 7:
                o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj);
                    return;
                }
                return;
            case 8:
                j2 j2Var = jf.g.B;
                if (j2Var != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < jf.g.f11592y; i11++) {
                        if (((Bitmap[]) j2Var.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) j2Var.d)[i11]);
                        }
                        ((Bitmap[]) j2Var.d)[i11] = null;
                        ((jf.c0[]) j2Var.f559c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new p0(arrayList, 1));
                    }
                    jf.g.B = null;
                    return;
                }
                return;
            case 9:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 10:
                o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new ia());
                    return;
                }
                return;
            case 11:
                s7[][] s7VarArr = s7.S;
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
                lh.i1.j();
                return;
            case 16:
                lh.i1 i1Var = lh.i1.V;
                i1Var.f15701e.invalidate();
                if (!i1Var.f15701e.isInLayout()) {
                    i1Var.f15701e.requestLayout();
                    i1Var.d.requestLayout();
                    i1Var.f15702f.requestLayout();
                    return;
                }
                return;
            case 17:
                int i12 = q5.h;
                return;
            case 18:
                Comparator comparator = s6.X;
                return;
            case 19:
                int i13 = nh.e0.f17555t0;
                return;
            case 20:
                Looper myLooper3 = Looper.myLooper();
                if (myLooper3 != null) {
                    myLooper3.quit();
                    return;
                }
                return;
            case 21:
                return;
            case 22:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                return;
            case 23:
                g6.E(false);
                return;
            case 24:
                int i14 = tn.Dc;
                return;
            case 25:
                return;
            case 26:
                kg.m0.b(true);
                return;
            case 27:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                return;
            case 28:
                Pattern pattern = c5.f27308a;
                return;
            default:
                o2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    ?? obj2 = new Object();
                    obj2.f23673a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj2);
                    return;
                }
                return;
        }
    }

    public o0(Object obj, int i10) {
        this.f622a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
