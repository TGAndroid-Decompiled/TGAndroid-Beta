package defpackage;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b0;
public final class uk8 implements Runnable {
    public final byte a;
    public final Object b;

    public uk8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xk8) ((vk8) obj).c).E0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) obj).c;
                premiumPreviewFragment.showDialog(new qe9(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 2:
                dm8 dm8Var = (dm8) obj;
                int size = 1073741823 - (1073741823 % dm8Var.f3.size());
                x46 x46Var = dm8Var.g3;
                dm8Var.t3 = size;
                x46Var.g1(size, (dm8Var.getMeasuredHeight() - dm8Var.getChildAt(0).getMeasuredHeight()) >> 1);
                dm8Var.A1(null, false);
                return;
            case 3:
                ((hbb) obj).r();
                return;
            case 4:
                qo8 qo8Var = (qo8) obj;
                k36 k36Var = qo8Var.f;
                if (qo8Var.b == 0) {
                    qo8Var.c = true;
                    k36Var.e(y26.ON_PAUSE);
                }
                if (qo8Var.a == 0 && qo8Var.c) {
                    k36Var.e(y26.ON_STOP);
                    qo8Var.d = true;
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.Z6;
                ((cp8) obj).a(0);
                return;
            case 6:
                aq8 aq8Var = (aq8) obj;
                aq8Var.G.getNotificationCenter().j(aq8Var.F);
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) ((tt) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    jq8 jq8Var = profileActivity.o0;
                    while (jq8Var.E0.k(i) != jq8Var.getRealCount() - 1) {
                        i++;
                    }
                    jq8Var.x(i, true);
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity2 = ((cr8) obj).b;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getMessagesController().r5(profileActivity2.e1, 0, true, new oo2(profileActivity2, true, (byte) 1));
                return;
            case 9:
                gr8 gr8Var = (gr8) obj;
                gr8Var.T0(gr8Var.getTabProgress());
                return;
            case 10:
                ((yr8) obj).c();
                return;
            case 11:
                ((ns8) obj).a();
                return;
            case 12:
                ks8 ks8Var = (ks8) obj;
                ks8Var.f.add(ks8Var.c);
                ks8Var.a();
                return;
            case 13:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 14:
                ((av8) obj).invalidate();
                return;
            case 15:
                bv8 bv8Var = (bv8) obj;
                if (bv8Var.getParent() instanceof d79) {
                    ((d79) bv8Var.getParent()).getOnItemClickListener().e(RecyclerView.S(bv8Var), bv8Var);
                    return;
                } else {
                    bv8Var.callOnClick();
                    return;
                }
            case 16:
                ((r5b) obj).e();
                return;
            case 17:
                int i2 = ProfileStoriesView.t0;
                hl.W3((ProfileStoriesView) obj);
                return;
            case 18:
                try {
                    bx8 bx8Var = ((ax8) obj).b;
                    if (bx8Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) bx8Var.getParent()).removeView(bx8Var);
                    }
                    bx8Var.R.run();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 19:
                ix8 ix8Var = (ix8) obj;
                ix8Var.a = true;
                int i3 = yac.t0;
                int i4 = 0;
                boolean z = false;
                while (true) {
                    ArrayList arrayList = xea.v1;
                    if (i4 < arrayList.size()) {
                        wea weaVar = (wea) arrayList.get(i4);
                        if (!weaVar.c && SystemClock.elapsedRealtime() - weaVar.e >= 120000) {
                            weaVar.c = true;
                            ConnectionsManager.getInstance(i3).checkProxy(weaVar.a, new fx8(weaVar, (byte) 1));
                            z = true;
                        }
                        i4++;
                    } else if (!z) {
                        ix8Var.a = false;
                        ix8Var.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 20:
                b bVar = (b) obj;
                try {
                    xea.h = SystemClock.elapsedRealtime();
                    ji4.f(a.b);
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(ji4.c());
                    }
                    if (firebaseMessaging.d.A()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new se4(firebaseMessaging, taskCompletionSource, (byte) 5));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new iy8(bVar, (byte) 0));
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 21:
                ((ku0) obj).a(Boolean.FALSE);
                return;
            case 22:
                jn7.f(((b19) obj).a).k(122, new Object[0]);
                return;
            case 23:
                ((RLottieNative) obj).d();
                return;
            case 24:
                i49 i49Var = (i49) obj;
                i49Var.y0 = null;
                i49Var.g();
                h49 h49Var = i49Var.h0;
                if (h49Var != null) {
                    h49Var.n();
                    return;
                }
                return;
            case 25:
                ((f49) obj).I.a.setVisibility(4);
                return;
            case 26:
                ((r59) obj).c.g3.O(true);
                return;
            case 27:
                ((q59) obj).a();
                return;
            case 28:
                u59 u59Var = (u59) ((cy0) obj).q;
                u59Var.R = System.currentTimeMillis();
                u59Var.S = 0L;
                u59Var.s0 = true;
                ((sab) u59Var.a).a.K0.a(0L, true);
                u59Var.invalidate();
                return;
            default:
                ((hx1) obj).a();
                return;
        }
    }
}
