package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class ea4 {
    public static final ma4 a = new ma4((byte) 0);
    public static long b;
    public static long c;
    public static final HashMap d;
    public static final uo3 e;
    public static final HashMap f;
    public static final qx6 g;
    public static ha4 h;
    public static String i;
    public static final qh2 j;

    static {
        vr vrVar = vr.f;
        if (vrVar != null) {
            vrVar.d.add(new Object());
        }
        d = new HashMap();
        e = new uo3("feedEvents", true);
        f = new HashMap();
        g = new qx6((byte) 26, false);
        j = new qh2((byte) 1);
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

    public static boolean b(e eVar) {
        if (eVar.getVisibleDialog() != null && eVar.getVisibleDialog().isShowing()) {
            return true;
        }
        return false;
    }

    public static void c(int i2, ha4 ha4Var, String str) {
        ha4 ha4Var2;
        if (str != null) {
            ha4Var2 = ha4Var;
        } else {
            ha4Var2 = null;
        }
        h = ha4Var2;
        i = str;
        String i3 = i(i2);
        ha4 a2 = ha4.a(ha4Var.b());
        if (i3 != null) {
            e.postRunnable(new x94(i3, a2, (byte) 1));
        }
    }

    public static boolean d(d79 d79Var) {
        if (d79Var != null && d79Var.isShown() && d79Var.getWidth() > 0) {
            float f2 = 1.0f;
            d79 d79Var2 = d79Var;
            while (d79Var2 != 0) {
                f2 *= d79Var2.getAlpha();
                if (d79Var2.getParent() instanceof View) {
                    d79Var2 = (View) d79Var2.getParent();
                } else {
                    d79Var2 = 0;
                }
            }
            int[] iArr = new int[2];
            d79Var.getLocationInWindow(iArr);
            if (f2 >= 0.5f) {
                if (Math.min(d79Var.getWidth() + iArr[0], d79Var.getRootView().getWidth()) - Math.max(iArr[0], 0) >= d79Var.getWidth() / 2.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(e eVar) {
        Activity parentActivity;
        wk5 parentLayout;
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        wk5 wk5Var = null;
        if (eVar == null) {
            parentActivity = null;
        } else {
            parentActivity = eVar.getParentActivity();
        }
        if (parentActivity instanceof BubbleActivity) {
            if (a.E) {
                return false;
            }
        } else if (a.x) {
            return false;
        }
        if (eVar == null) {
            parentLayout = null;
        } else {
            parentLayout = eVar.getParentLayout();
        }
        if (eVar != null && (eVar.getParentActivity() instanceof LaunchActivity)) {
            launchActivity = (LaunchActivity) eVar.getParentActivity();
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
                wk5Var = (wk5) c00.g(1, arrayList);
            }
        }
        if (parentLayout != null && parentLayout.getSafeLastFragment() == eVar && !e.hasSheets(eVar) && !b(eVar) && !xea.B) {
            if (actionBarLayout == null || actionBarLayout == parentLayout || actionBarLayout.getLastFragment() == null) {
                if (wk5Var == null || wk5Var == parentLayout) {
                    if (!PhotoViewer.C0() || !PhotoViewer.q0().V0()) {
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

    public static String f(r47 r47Var) {
        if (!r47Var.s4() && !r47Var.J2()) {
            if (r47Var.g4()) {
                return "round";
            }
            if (r47.t3(r47Var.k)) {
                return "gif";
            }
            if (r47.K4(r47Var.k)) {
                return "video";
            }
            if (r47.Q4(r47Var.k)) {
                return "voice";
            }
            if (r47Var.F0() != null) {
                return "document";
            }
            return "photo";
        }
        return null;
    }

    public static int g(int i2) {
        return ConnectionsManager.getInstance(i2).getCurrentTime();
    }

    public static ja4 h(String str) {
        HashMap hashMap = f;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new ja4(new ca4(str)));
        }
        return (ja4) hashMap.get(str);
    }

    public static String i(int i2) {
        String str;
        yac h2 = yac.h(i2);
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

    public static TLRPC.InputPeer j(int i2, long j2, long j3, long j4, int i3) {
        TLRPC.Chat M0;
        TLRPC.InputPeer inputPeer;
        if (j3 != 0) {
            M0 = null;
        } else {
            M0 = uc7.s1(i2).M0(Long.valueOf(-j2));
        }
        if (M0 != null && !M0.min) {
            long j5 = M0.access_hash;
            if (j5 != 0) {
                j3 = j5;
            }
        }
        if (j3 != 0) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = -j2;
            tL_inputPeerChannel.access_hash = j3;
            return tL_inputPeerChannel;
        }
        if (j4 != 0) {
            inputPeer = uc7.s1(i2).j1(j4);
        } else {
            inputPeer = null;
        }
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            return null;
        }
        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
        tL_inputPeerChannelFromMessage.peer = inputPeer;
        tL_inputPeerChannelFromMessage.msg_id = i3;
        tL_inputPeerChannelFromMessage.channel_id = -j2;
        return tL_inputPeerChannelFromMessage;
    }

    public static int k(String str, int i2, TLMethod tLMethod, RequestDelegate requestDelegate, int i3) {
        if (str == null || !str.equals(i(i2))) {
            return 0;
        }
        int[] iArr = {0};
        int sendRequestSync = ConnectionsManager.getInstance(i2).sendRequestSync(tLMethod, new hb7(i2, iArr, requestDelegate, (byte) 5), null, null, 2, Integer.MAX_VALUE, 1, true);
        iArr[0] = sendRequestSync;
        j.a.add(new int[]{i2, sendRequestSync, i3});
        return iArr[0];
    }

    public static e l(e eVar) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (eVar != null && (eVar.getParentActivity() instanceof LaunchActivity)) {
            launchActivity = (LaunchActivity) eVar.getParentActivity();
        } else {
            launchActivity = null;
        }
        if (launchActivity != null) {
            ArrayList arrayList = launchActivity.Q;
            if (!arrayList.isEmpty()) {
                return ((wk5) c00.g(1, arrayList)).getLastFragment();
            }
            actionBarLayout = launchActivity.q0;
        } else {
            actionBarLayout = null;
        }
        if (actionBarLayout != null && actionBarLayout.getLastFragment() != null) {
            return actionBarLayout.getLastFragment();
        }
        if (eVar == null || eVar.getParentLayout() == null) {
            return null;
        }
        return eVar.getParentLayout().getSafeLastFragment();
    }
}
