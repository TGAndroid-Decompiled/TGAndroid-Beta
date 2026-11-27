package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.utils.twidget.z;
public final class kc implements Runnable {
    public final byte a;

    public kc(byte b) {
        this.a = b;
    }

    @Override
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                e S = LaunchActivity.S();
                if (S != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    S.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 2:
                hl.r(wl.w);
                try {
                    if (wl.r != null) {
                        for (int i3 = 0; i3 < wl.r.size(); i3++) {
                            LongSparseArray longSparseArray = (LongSparseArray) wl.r.valueAt(i3);
                            int i4 = 0;
                            while (i4 < longSparseArray.size()) {
                                if (!((wl) longSparseArray.valueAt(i4)).a) {
                                    longSparseArray.removeAt(i4);
                                    i4--;
                                }
                                i4++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    boolean z = f11.a;
                    return;
                }
            case 3:
                int i5 = AppStartReceiver.a;
                xea.s();
                if (xea.r.length() > 0) {
                    xea.w = true;
                    xea.x();
                }
                a.w();
                return;
            case 4:
                Utilities.e.c(new kc((byte) 7));
                return;
            case 5:
                boolean z2 = cc4.j;
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    StackTraceElement[] value = entry.getValue();
                    sb.append("Thread: ");
                    sb.append(entry.getKey().getName());
                    sb.append("\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("\tat ");
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                    sb.append("\n\n");
                }
                cc4.d("ANR thread dump\n".concat(sb.toString()));
                cc4.j();
                cc4.c(false);
                return;
            case 6:
                a.w();
                return;
            case 7:
                z.d(a.b);
                return;
            case 8:
                if (((b) a.k()).hasServices()) {
                    ((b) a.k()).onRequestPushToken();
                    return;
                }
                if (f11.a) {
                    a.k();
                    cc4.b("No valid Google Play Services APK found.");
                }
                xea.g = "__NO_GOOGLE_PLAY_SERVICES__";
                a.k();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 9:
                lp lpVar = ek0.B;
                if (lpVar != null) {
                    ArrayList arrayList = null;
                    while (i < ek0.y) {
                        if (((Bitmap[]) lpVar.d)[i] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) lpVar.d)[i]);
                        }
                        ((Bitmap[]) lpVar.d)[i] = null;
                        ((go5[]) lpVar.c)[i] = null;
                        i++;
                    }
                    if (arrayList != null) {
                        Utilities.e.c(new se(arrayList, (byte) 3));
                    }
                    ek0.B = null;
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                Utilities.e.c(new kc((byte) 13));
                return;
            case 12:
                ArrayList arrayList2 = new ArrayList();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                try {
                    File file = new File(xb4.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j = 0; j < readInt64; j++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList2.add(tLObject);
                            longSparseArray2.put(tLObject.a, tLObject);
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                hl.c3(new a30(arrayList2, longSparseArray2, (byte) 28));
                return;
            case 13:
                try {
                    File file2 = new File(xb4.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = ptd.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList3 = ptd.c;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((n01) obj2).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList4 = ptd.c;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        Object obj3 = arrayList4.get(i);
                        i++;
                        ((n01) obj3).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        return;
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 14:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.H1.startActivity(intent);
                    return;
                }
                return;
            case 15:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", yac.h(Q.getCurrentAccount()).e());
                    Q.presentFragment(new zu1(bundle));
                    return;
                }
                return;
            case 16:
                e Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", yac.h(Q2.getCurrentAccount()).e());
                    bundle2.putInt("chatMode", 1);
                    Q2.presentFragment(new zu1(bundle2));
                    return;
                }
                return;
            case 17:
                s49.b(true);
                return;
            case 18:
                jn7 e4 = jn7.e();
                Boolean bool = Boolean.TRUE;
                e4.k(268, Boolean.FALSE, bool, bool);
                return;
            case 19:
                int i7 = ChatActivityEnterView.X7;
                return;
            case 20:
                MediaController.z().F0(0, 0, false, false);
                return;
            case 21:
                MediaController.z().F0(0, 0, false, false);
                return;
            case 22:
                jn7.e().k(100, 512);
                return;
            case 23:
                PhotoViewer.q0().A(false, false);
                return;
            case 24:
                PhotoViewer.q0().A(false, false);
                return;
            case 25:
                ConnectionsManager.lambda$onProxyError$19();
                return;
            case 26:
                break;
            case 27:
                return;
            case 28:
                g2b.E0();
                return;
            default:
                return;
        }
        while (i < 4) {
            if (yac.h(i).o()) {
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                Utilities.e.c(new pu2(lv2.r(i), (byte) 3));
            }
            i++;
        }
    }

    public kc(Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
