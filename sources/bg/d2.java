package bg;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import gh.oa;
import gh.v7;
import ih.s5;
import ih.v6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qn;
public final class d2 implements Runnable {
    public final int f1735a;

    public d2(int i9) {
        this.f1735a = i9;
    }

    @Override
    public final void run() {
        switch (this.f1735a) {
            case 0:
                g3.d0(0, null);
                return;
            case 1:
                int i9 = AlarmManagerSchedulerBroadcastReceiver.f2499a;
                return;
            case 2:
                a6.a aVar = ff.h.B;
                if (aVar != null) {
                    ArrayList arrayList = null;
                    for (int i10 = 0; i10 < ff.h.f6178y; i10++) {
                        if (((Bitmap[]) aVar.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) aVar.d)[i10]);
                        }
                        ((Bitmap[]) aVar.d)[i10] = null;
                        ((ff.d0[]) aVar.f101b)[i10] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new ff.e(arrayList, 0));
                    }
                    ff.h.B = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj);
                    return;
                }
                return;
            case 4:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 5:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new oa());
                    return;
                }
                return;
            case 6:
                v7[][] v7VarArr = v7.S;
                return;
            case 7:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 8:
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 10:
                ih.k1.j();
                return;
            case 11:
                ih.k1 k1Var = ih.k1.V;
                k1Var.f11659e.invalidate();
                if (!k1Var.f11659e.isInLayout()) {
                    k1Var.f11659e.requestLayout();
                    k1Var.d.requestLayout();
                    k1Var.f11660f.requestLayout();
                    return;
                }
                return;
            case 12:
                int i11 = s5.h;
                return;
            case 13:
                Comparator comparator = v6.X;
                return;
            case 14:
                int i12 = kh.f0.f15193t0;
                return;
            case 15:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                return;
            case 18:
                HashSet hashSet = mh.c3.S0;
                return;
            case 19:
                return;
            case 20:
                int i13 = oh.g.B;
                return;
            case 21:
                f6.E(false);
                return;
            case 22:
                int i14 = qn.Dc;
                return;
            case 23:
                return;
            case 24:
                hg.n0.b(true);
                return;
            case 25:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                return;
            case 26:
                Pattern pattern = y4.f34847a;
                return;
            case 27:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    ?? obj2 = new Object();
                    obj2.f23653a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj2);
                    return;
                }
                return;
            case 28:
                AndroidUtilities.cancelRunOnUIThread(k5.v);
                try {
                    if (k5.f29937q != null) {
                        for (int i16 = 0; i16 < k5.f29937q.size(); i16++) {
                            LongSparseArray longSparseArray = (LongSparseArray) k5.f29937q.valueAt(i16);
                            int i17 = 0;
                            while (i17 < longSparseArray.size()) {
                                if (!((k5) longSparseArray.valueAt(i17)).f29943a) {
                                    longSparseArray.removeAt(i17);
                                    i17--;
                                }
                                i17++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e10);
                        return;
                    }
                    return;
                }
            default:
                c8 c8Var = c8.P0;
                return;
        }
    }

    public d2(Object obj, int i9) {
        this.f1735a = i9;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void e() {
    }
}
