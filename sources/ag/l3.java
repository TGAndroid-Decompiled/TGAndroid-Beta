package ag;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import hh.oa;
import hh.u7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.o5;
import jh.s6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rn;

public final class l3 implements Runnable {

    public final int f552a;

    public l3(int i10) {
        this.f552a = i10;
    }

    @Override
    public final void run() {
        switch (this.f552a) {
            case 0:
                float[] fArr = p3.Q;
                break;
            case 1:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f2936a;
                break;
            case 2:
                cg.y2.e0(0, null);
                break;
            case 3:
                b6.a aVar = gf.h.B;
                if (aVar != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < gf.h.f6978y; i11++) {
                        if (((Bitmap[]) aVar.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) aVar.d)[i11]);
                        }
                        ((Bitmap[]) aVar.d)[i11] = null;
                        ((gf.d0[]) aVar.f2033b)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new gf.e(arrayList, 0));
                    }
                    gf.h.B = null;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2VarR.showAsSheet(new PremiumPreviewFragment(0, "gifts"), l2Var);
                    break;
                }
                break;
            case 5:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(new oa());
                    break;
                }
                break;
            case 7:
                u7[][] u7VarArr = u7.S;
                break;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 9:
                break;
            case 10:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 11:
                jh.i1.j();
                break;
            case 12:
                jh.i1 i1Var = jh.i1.V;
                i1Var.f13427e.invalidate();
                if (!i1Var.f13427e.isInLayout()) {
                    i1Var.f13427e.requestLayout();
                    i1Var.d.requestLayout();
                    i1Var.f13428f.requestLayout();
                    break;
                }
                break;
            case 13:
                int i12 = o5.h;
                break;
            case 14:
                Comparator comparator = s6.X;
                break;
            case 15:
                int i13 = lh.e0.f15888t0;
                break;
            case 16:
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 17:
                break;
            case 18:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 19:
                HashSet hashSet = nh.b3.S0;
                break;
            case 20:
                g6.E(false);
                break;
            case 21:
                int i14 = rn.Dc;
                break;
            case 22:
                break;
            case 23:
                ig.m0.b(true);
                break;
            case 24:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                break;
            case 25:
                Pattern pattern = y4.f34802a;
                break;
            case 26:
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.f23619a = true;
                    n2VarU2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), l2Var2);
                    break;
                }
                break;
            case 27:
                AndroidUtilities.cancelRunOnUIThread(k5.v);
                try {
                    if (k5.f29947q != null) {
                        for (int i16 = 0; i16 < k5.f29947q.size(); i16++) {
                            LongSparseArray longSparseArray = (LongSparseArray) k5.f29947q.valueAt(i16);
                            int i17 = 0;
                            while (i17 < longSparseArray.size()) {
                                if (!((k5) longSparseArray.valueAt(i17)).f29953a) {
                                    longSparseArray.removeAt(i17);
                                    i17--;
                                }
                                i17++;
                            }
                        }
                    }
                } catch (Exception e9) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e9);
                        return;
                    }
                    return;
                }
                break;
            case 28:
                b8 b8Var = b8.P0;
                break;
            default:
                SavedMessagesController.openSavedMessages();
                break;
        }
    }

    public l3(Object obj, int i10) {
        this.f552a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
