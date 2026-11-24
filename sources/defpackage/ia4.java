package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class ia4 {
    public static final qa4 a = new qa4((byte) 0);
    public static long b;
    public static final HashMap c;
    public static final np3 d;
    public static final HashMap e;
    public static final hi2 f;
    public static la4 g;
    public static String h;
    public static final mi2 i;

    static {
        us usVar = us.f;
        if (usVar != null) {
            usVar.d.add(new Object());
        }
        c = new HashMap();
        d = new np3("feedEvents", true);
        e = new HashMap();
        f = new hi2((byte) 28, false);
        i = new mi2((byte) 1);
    }

    public static void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int[] iArr = (int[]) obj;
            ConnectionsManager.getInstance(iArr[0]).cancelRequest(iArr[1], false);
        }
    }

    public static boolean b(d dVar) {
        Activity parentActivity;
        tk5 parentLayout;
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        tk5 tk5Var = null;
        if (dVar == null) {
            parentActivity = null;
        } else {
            parentActivity = dVar.getParentActivity();
        }
        if (parentActivity instanceof BubbleActivity) {
            if (a.E) {
                return false;
            }
        } else if (a.x) {
            return false;
        }
        if (dVar == null) {
            parentLayout = null;
        } else {
            parentLayout = dVar.getParentLayout();
        }
        if (dVar != null && (dVar.getParentActivity() instanceof LaunchActivity)) {
            launchActivity = (LaunchActivity) dVar.getParentActivity();
        } else {
            launchActivity = null;
        }
        if (launchActivity != null) {
            actionBarLayout = launchActivity.q0;
        } else {
            actionBarLayout = null;
        }
        if (launchActivity != null) {
            ArrayList arrayList = launchActivity.Q;
            if (!arrayList.isEmpty()) {
                tk5Var = (tk5) b10.f(1, arrayList);
            }
        }
        if (parentLayout != null && parentLayout.getSafeLastFragment() == dVar && !d.hasSheets(dVar)) {
            if ((dVar.getVisibleDialog() == null || !dVar.getVisibleDialog().isShowing()) && !gda.B) {
                if (actionBarLayout == null || actionBarLayout == parentLayout || actionBarLayout.getLastFragment() == null) {
                    if (tk5Var == null || tk5Var == parentLayout) {
                        if (!PhotoViewer.C0() || !PhotoViewer.r0().V0()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String c(k47 k47Var) {
        if (!k47Var.s4() && !k47Var.J2()) {
            if (k47Var.g4()) {
                return "round";
            }
            if (k47.t3(k47Var.k)) {
                return "gif";
            }
            if (k47.K4(k47Var.k)) {
                return "video";
            }
            if (k47.Q4(k47Var.k)) {
                return "voice";
            }
            if (k47Var.F0() != null) {
                return "document";
            }
            return "photo";
        }
        return null;
    }

    public static int d(int i2) {
        return ConnectionsManager.getInstance(i2).getCurrentTime();
    }

    public static na4 e(String str) {
        HashMap hashMap = e;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new na4(new ga4(str)));
        }
        return (na4) hashMap.get(str);
    }

    public static String f(int i2) {
        String str;
        z8c h2 = z8c.h(i2);
        if (h2.o()) {
            StringBuilder sb = new StringBuilder();
            sb.append(h2.e());
            if (ConnectionsManager.getInstance(i2).isTestBackend()) {
                str = "t";
            } else {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
        return null;
    }

    public static TLRPC.InputPeer g(int i2, long j, long j2, long j3, int i3) {
        TLRPC.Chat L0;
        TLRPC.InputPeer inputPeer;
        if (j2 != 0) {
            L0 = null;
        } else {
            L0 = oc7.r1(i2).L0(Long.valueOf(-j));
        }
        if (L0 != null && !L0.min) {
            long j4 = L0.access_hash;
            if (j4 != 0) {
                j2 = j4;
            }
        }
        if (j2 != 0) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = -j;
            tL_inputPeerChannel.access_hash = j2;
            return tL_inputPeerChannel;
        }
        if (j3 != 0) {
            inputPeer = oc7.r1(i2).i1(j3);
        } else {
            inputPeer = null;
        }
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            return null;
        }
        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
        tL_inputPeerChannelFromMessage.peer = inputPeer;
        tL_inputPeerChannelFromMessage.msg_id = i3;
        tL_inputPeerChannelFromMessage.channel_id = -j;
        return tL_inputPeerChannelFromMessage;
    }

    public static int h(String str, int i2, TLMethod tLMethod, RequestDelegate requestDelegate, int i3) {
        if (str == null || !str.equals(f(i2))) {
            return 0;
        }
        int[] iArr = {0};
        int sendRequestSync = ConnectionsManager.getInstance(i2).sendRequestSync(tLMethod, new cb7(i2, iArr, requestDelegate, (byte) 5), null, null, 2, Integer.MAX_VALUE, 1, true);
        iArr[0] = sendRequestSync;
        i.a.add(new int[]{i2, sendRequestSync, i3});
        return iArr[0];
    }
}
