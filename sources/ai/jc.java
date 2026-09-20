package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class jc implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, rf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f1064x1;
    public static TL_stories.StoryItem f1066z1;
    public d2 A0;
    public bc B0;
    public SurfaceView C0;
    public ci.l4 D0;
    public boolean E;
    public ci.l4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public e6 G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final AnimationNotificationsLocker J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public r9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public d9 O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public TL_stories.StoryItem T0;
    public float U;
    public int U0;
    public float V;
    public boolean V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean f1068a0;
    public boolean f1069a1;
    public float f1071b0;
    public final e5 f1072b1;
    public boolean f1074c0;
    public boolean f1075c1;
    public float f1076d0;
    public oa f1077d1;
    public float f1078e0;
    public final LongSparseIntArray f1079e1;
    public final org.telegram.ui.ActionBar.n2 f1080f;
    public boolean f1081f0;
    public boolean f1082f1;
    public boolean f1083g0;
    public boolean f1084g1;
    public int h;
    public boolean f1085h0;
    public boolean f1086h1;
    public GestureDetector f1087i0;
    public boolean f1088i1;
    public boolean f1089j0;
    public boolean f1090j1;
    public boolean f1091k0;
    public boolean f1092k1;
    public boolean f1093l0;
    public boolean l1;
    public boolean m0;
    public boolean f1094m1;
    public WindowManager f1095n;
    public zb f1096n0;
    public a3.d f1097n1;
    public e5 f1099o1;
    public int f1100p0;
    public boolean f1101p1;
    public boolean f1102q0;
    public float f1103q1;
    public WindowManager.LayoutParams f1104r;
    public float f1105r0;
    public boolean f1106r1;
    public xb f1107s;
    public final gc f1108s0;
    public boolean f1109s1;
    public fc f1110t0;
    public long f1111t1;
    public Dialog f1112u0;
    public p9 f1113u1;
    public yb v;
    public org.telegram.ui.ActionBar.j2 f1114v0;
    public ValueAnimator f1115v1;
    public r7 f1116w;
    public boolean f1117w0;
    public boolean f1118w1;
    public boolean f1119x;
    public final ArrayList f1120x0;
    public org.telegram.ui.k4 f1122y0;
    public ic f1123z0;
    public static final ArrayList f1065y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f1067a = SharedConfig.useSurfaceInStories;
    public boolean f1070b = true;
    public boolean f1073c = false;
    public boolean d = false;
    public boolean e = true;
    public final d f1121y = new d();
    public final RectF T = new RectF();
    public final float[] f1098o0 = new float[2];

    public jc(org.telegram.ui.ActionBar.n2 n2Var) {
        ?? obj = new Object();
        obj.f922k = 1.0f;
        this.f1108s0 = obj;
        this.f1120x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f1072b1 = new e5(this, 4);
        this.f1079e1 = new LongSparseIntArray();
        new Paint(1);
        this.f1080f = n2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f18563id << 16), editable);
        }
    }

    public static boolean i(jc jcVar, xb xbVar, float f7, float f10, boolean z10) {
        a4 a4Var;
        a4 a4Var2;
        if (xbVar != null) {
            if (!jcVar.X0) {
                if (jcVar.f1116w == null || jcVar.f1078e0 == 0.0f) {
                    f6 currentPeerView = jcVar.f1096n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - jcVar.v.getX()) - jcVar.f1096n0.getX()) - currentPeerView.getX(), ((f10 - jcVar.v.getY()) - jcVar.f1096n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f861v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (a4Var2 = currentPeerView.f800b2) != null && a4Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f800b2.getY() + currentPeerView.getY() + jcVar.f1096n0.getY() + jcVar.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (a4Var = currentPeerView.f800b2) != null && a4Var.w0()) || jcVar.f1113u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(xbVar, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(jc jcVar) {
        p4 p4Var;
        bu editField;
        f6 currentPeerView = jcVar.f1096n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f800b2 != null && (((p4Var = currentPeerView.f801b3) == null || p4Var.getVisibility() != 0) && (editField = currentPeerView.f800b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new e5(jcVar, 6), 200L);
            return;
        }
        jcVar.m();
    }

    public static void k(jc jcVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(jcVar.X, jcVar.W) / AndroidUtilities.dp(80.0f)));
        if (jcVar.V != clamp01) {
            jcVar.V = clamp01;
            jcVar.o();
            f6 currentPeerView = jcVar.f1096n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f869x2) {
                currentPeerView.invalidate();
            }
            d2 d2Var = jcVar.A0;
            if (d2Var != null) {
                d2Var.v((1.0f - jcVar.V) * jcVar.U);
            }
        }
        xb xbVar = jcVar.f1107s;
        if (xbVar != null) {
            xbVar.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f18563id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f1066z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f1066z1.messageId != messageObject.getId() || f1066z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, fc fcVar) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, fcVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, d9 d9Var, TL_stories.PeerStories peerStories, fc fcVar, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f1120x0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (this.m0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        ic icVar = this.f1123z0;
        if (icVar != null) {
            icVar.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f1106r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1070b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f1067a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && d9Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f1066z1 = storyItem;
        }
        this.O0 = d9Var;
        this.Q0 = peerStories;
        this.f1110t0 = fcVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        zb zbVar = this.f1096n0;
        if (zbVar != null) {
            zbVar.setHorizontalProgressToDismiss(0.0f);
            this.f1096n0.F0 = 0;
        }
        this.f1076d0 = 0.0f;
        this.Z = 0.0f;
        this.f1093l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f1069a1 = false;
        this.Z0 = false;
        this.f1079e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f1072b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1104r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f1104r.flags = -2147417728;
        this.H0 = false;
        this.f1075c1 = false;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (this.f1107s == null) {
            this.f1087i0 = new GestureDetector(new tb(this));
            this.f1107s = new xb(this, context, R);
        }
        if (this.v == null) {
            this.v = new yb(this, context);
            zb zbVar2 = new zb(this, this.h, context, this, this.f1121y);
            this.f1096n0 = zbVar2;
            zbVar2.setDelegate(new ac(this, d9Var, arrayList, context));
            this.v.addView(this.f1096n0, w7.y5.e(-1, -1, 1));
            this.f1122y0 = new org.telegram.ui.k4(context);
            if (this.f1067a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f1122y0.addView(this.C0);
            } else {
                bc bcVar = new bc(this, context);
                this.B0 = bcVar;
                this.f1122y0.addView(bcVar);
            }
            ci.l4 l4Var = new ci.l4(context, this.h);
            this.D0 = l4Var;
            l4Var.setVisibility(8);
            this.f1122y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f1365a = paint;
            view.f1367c = new q4((Object) view, 2);
            view.d = new org.telegram.ui.Components.d6((View) view);
            view.e = new org.telegram.ui.Components.d6((View) view);
            paint.setColor(-1);
            this.f1077d1 = view;
            this.v.addView((View) view, w7.y5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        ci.l4 l4Var2 = this.D0;
        if (l4Var2 != null) {
            l4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f1122y0);
        this.f1107s.addView(this.f1122y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f1107s.addView(this.v);
        this.f1107s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (d9Var != null) {
            this.f1096n0.D(this.h, d9Var.d, d9Var.h());
        } else {
            zb zbVar3 = this.f1096n0;
            int i13 = this.h;
            zbVar3.A0 = arrayList;
            zbVar3.f1309y0 = i13;
            zbVar3.setAdapter(null);
            zbVar3.setAdapter(zbVar3.f1310z0);
            zbVar3.setCurrentItem(i11);
            zbVar3.C0 = true;
        }
        this.f1095n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f1070b = false;
        }
        if (this.f1070b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f1073c = z14;
        yb ybVar = this.v;
        a1.c cVar = new a1.c(this, 10);
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.a0.j(ybVar, cVar);
        if (this.f1070b) {
            AndroidUtilities.removeFromParent(this.f1107s);
            this.f1107s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f1107s);
            if (!this.f1073c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f1107s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f1095n, this.f1107s, this.f1104r);
            this.f1095n.addView(this.f1107s, this.f1104r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f1107s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new rb(this, 0));
            }
        }
        this.f1107s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f1064x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f1107s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f1070b) {
            z(true);
        }
        if (!this.f1070b) {
            f1065y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, d9 d9Var, u9 u9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(d9Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, d9Var, null, u9Var, false);
    }

    public final void D(Context context, long j3, fc fcVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        l9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f1193a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (ia.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.f1197g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, fcVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, fc fcVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, fcVar, false);
            return;
        }
        this.f1120x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, u9 u9Var) {
        A(UserConfig.selectedAccount, context, storyItem, u9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, d9 d9Var, TL_stories.PeerStories peerStories, fc fcVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, d9Var, peerStories, fcVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f1070b) {
            R.presentFragment(n2Var);
            return;
        }
        R.presentFragment(n2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        ic icVar = this.f1123z0;
        if (icVar != null) {
            icVar.release(null);
            this.f1123z0 = null;
        }
        ci.l4 l4Var = this.D0;
        if (l4Var != null) {
            l4Var.d(0L, null);
        }
        d2 d2Var = this.A0;
        if (d2Var != null) {
            m2 m2Var = m2.Z;
            if (!m2Var.S || m2Var.v != d2Var) {
                if (d2Var.f692n) {
                    d2Var.s(null);
                } else {
                    d2Var.e();
                }
            }
        }
        this.A0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ic) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().f1202m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((sc) iVar.n(i11)).b(false);
        }
        if (this.f1070b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f1080f;
        if (n2Var != null) {
            n2Var.removeSheet(this);
        }
        f1065y1.remove(this);
        this.f1120x0.clear();
        this.f1078e0 = 0.0f;
        f1066z1 = null;
    }

    public final void K(boolean z10) {
        this.f1102q0 = z10;
        if (z10) {
            q4 q4Var = this.f1077d1.f1367c;
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            q4Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        f6 currentPeerView;
        f6 currentPeerView2;
        d6 d6Var;
        ic icVar;
        e6 e6Var;
        if (this.f1069a1 != z10) {
            this.f1069a1 = z10;
            if (z10 && !this.f1082f1 && (currentPeerView2 = this.f1096n0.getCurrentPeerView()) != null && (d6Var = currentPeerView2.O1) != null && !d6Var.f709f && d6Var.f707b == null) {
                if (!this.f1091k0 && !this.f1089j0 && (e6Var = this.G0) != null && ((ic) e6Var.f766c) != null) {
                    currentPeerView2.f803c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                e6 e6Var2 = this.G0;
                if (e6Var2 != null && (icVar = (ic) e6Var2.f766c) != null && !this.f1091k0) {
                    icVar.setSeeking(true);
                }
                this.f1091k0 = true;
            }
            P();
            zb zbVar = this.f1096n0;
            if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f1069a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f1070b && launchActivity != null) {
            if (z10) {
                this.f1117w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f1117w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.A0 != null && (n2Var = this.f1080f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(n2Var.getContext());
            if (sf.c.a(findActivity) > 0) {
                m2.o(findActivity, this.A0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        ic icVar = this.f1123z0;
        int i10 = 0;
        if (icVar != null) {
            icVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ic) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        f6 currentPeerView = this.f1096n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f868x1.a(D1, true);
        }
        if (!D1) {
            this.f1077d1.b();
        }
    }

    public final void P() {
        if (this.f1096n0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f1070b) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f1080f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.h4.x().V) {
            w10 = true;
        }
        this.f1096n0.setPaused(w10);
        ic icVar = this.f1123z0;
        if (icVar != null) {
            if (w10) {
                icVar.pause();
            } else {
                icVar.play(B1);
            }
        }
        this.f1096n0.D0 = (this.f1119x || this.H0 || this.I0 || this.f1069a1 || this.f1082f1 || this.f1078e0 != 0.0f || this.f1090j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: ai.jc.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ci.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f1070b) {
            AndroidUtilities.removeFromParent(this.f1107s);
        } else {
            this.f1095n.removeView(this.f1107s);
        }
        this.f1107s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f1070b && this.f1107s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        ci.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f1070b) {
            AndroidUtilities.removeFromParent(this.f1107s);
            this.f1080f.getLayoutContainer().addView(this.f1107s);
        } else {
            this.f1095n.addView(this.f1107s, this.f1104r);
        }
        ci.l4 l4Var2 = this.E0;
        if (l4Var2 != null) {
            l4Var2.b();
            this.E0 = null;
        }
        this.f1107s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        ci.l4 l4Var = this.E0;
        if (l4Var != null && l4Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((d9) objArr[0])) {
                t();
                zb zbVar = this.f1096n0;
                d9 d9Var = this.O0;
                zbVar.D(this.h, d9Var.d, d9Var.h());
                r7 r7Var = this.f1116w;
                if (r7Var != null) {
                    TL_stories.StoryItem selectedStory = r7Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f721i.size()) {
                        if (selectedStory != null && selectedStory.f18563id == ((MessageObject) this.O0.f721i.get(i12)).storyItem.f18563id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f721i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f1116w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            fc fcVar = this.f1110t0;
            if (fcVar instanceof u9) {
                u9 u9Var = (u9) fcVar;
                if (u9Var.f1591r && !u9Var.f1590n) {
                    l9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (u9Var.f1589f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f1197g;
                    }
                    ArrayList<Long> dialogIds = this.f1096n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!u9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f1096n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            r7 r7Var2 = this.f1116w;
            if (r7Var2 != null) {
                ArrayList arrayList3 = r7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((m6) arrayList3.get(i12)).b();
                    i12++;
                }
            }
        } else {
            int i15 = NotificationCenter.openArticle;
            if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
                if (i10 == NotificationCenter.storyDeleted) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f18563id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                ic icVar = this.f1123z0;
                if (icVar != null) {
                    this.f1111t1 = icVar.currentPosition;
                    this.f1123z0.release(null);
                    this.f1123z0 = null;
                    return;
                }
                this.f1111t1 = 0L;
            } else if (!this.f1109s1 && t() != null) {
                t().f1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final Bitmap e() {
        ci.l4 l4Var = this.D0;
        if (l4Var != null && l4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f1080f;
        if (n2Var != null && t() != null && AndroidUtilities.findActivity(n2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final xc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f1107s;
    }

    @Override
    public final View h() {
        ci.l4 l4Var = new ci.l4(this.D0.getContext(), this.h);
        this.E0 = l4Var;
        return l4Var;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override
    public final boolean isShown() {
        return !this.H0;
    }

    public final void l(boolean z10) {
        boolean z11;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            if (this.m0 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.e != z11) {
                this.e = z11;
                SurfaceView surfaceView = this.C0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                ci.l4 l4Var = this.D0;
                if (l4Var != null) {
                    l4Var.setSecure(!z11);
                }
                if (this.f1070b) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f1080f;
                    if (n2Var.getParentActivity() != null) {
                        if (z11) {
                            n2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        n2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z11) {
                    this.f1104r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f1104r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f1095n.updateViewLayout(this.f1107s, this.f1104r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f1089j0 = false;
            this.f1093l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new qb(this, 2));
            this.H.addListener(new sb(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f1115v1 == null) {
            if (this.f1100p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f1116w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f1074c0 && this.f1078e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f1078e0;
                r7 r7Var = this.f1116w;
                float f11 = r7Var.f1473c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f1078e0 = f12;
                    r7Var.setOffset(f12);
                }
            }
            float f13 = this.f1078e0;
            if (z10) {
                f7 = this.f1116w.f1473c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f1115v1 = ofFloat;
            ofFloat.addUpdateListener(new qb(this, 3));
            this.f1115v1.addListener(new n(3, this, z10));
            if (z10) {
                this.f1115v1.setDuration(350L);
                this.f1115v1.setInterpolator(qr.h);
            } else {
                this.f1115v1.setDuration(350L);
                this.f1115v1.setInterpolator(qr.f27642f);
            }
            this.f1115v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f1070b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        f6 currentPeerView;
        boolean z10 = false;
        if (this.f1078e0 != 0.0f) {
            r7 r7Var = this.f1116w;
            if (r7Var.f1479x > 0) {
                AndroidUtilities.hideKeyboard(r7Var);
                return true;
            }
            j7 currentPage = r7Var.getCurrentPage();
            if (currentPage != null) {
                p6 p6Var = currentPage.f1052r;
                x6 x6Var = currentPage.f1050f;
                if (x6Var != null && x6Var.f30354b) {
                    x6Var.a();
                    return true;
                } else if (Math.abs(currentPage.f1049c.getTranslationY() - p6Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    p6Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    p6Var.y0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        zb zbVar = this.f1096n0;
        if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f1116w == null) {
            r7 r7Var = new r7(this, this.v.getContext());
            this.f1116w = r7Var;
            this.v.addView(r7Var, 0);
        }
        f6 currentPeerView = this.f1096n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f721i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f721i.get(i10)).storyItem);
                }
                this.f1116w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f1116w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f1107s);
        this.H0 = true;
        this.f1086h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f1071b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new qb(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            gc gcVar = this.f1108s0;
            ImageReceiver imageReceiver = gcVar.f916b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = gcVar.f917c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            gcVar.f917c = null;
            gcVar.f916b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new e5(this, 2), 16L);
        if (this.f1075c1) {
            this.f1075c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        f6 currentPeerView = this.f1096n0.getCurrentPeerView();
        if (currentPeerView != null) {
            d6 d6Var = currentPeerView.O1;
            if (!d6Var.j() && d6Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f1077d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f1120x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f1100p0 != i10) {
            this.f1100p0 = i10;
            this.f1096n0.setKeyboardHeight(i10);
            this.f1096n0.requestLayout();
            r7 r7Var = this.f1116w;
            if (r7Var != null) {
                r7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f1112u0 = dialog;
            dialog.setOnDismissListener(new g5(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f1112u0 = null;
            return false;
        }
    }

    public final f6 t() {
        zb zbVar = this.f1096n0;
        if (zbVar == null) {
            return null;
        }
        return zbVar.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f1107s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            gc gcVar = this.f1108s0;
            ImageReceiver imageReceiver = gcVar.f916b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = gcVar.f917c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            gcVar.f917c = null;
            gcVar.f916b = null;
            yb ybVar = this.v;
            if (ybVar != null) {
                ybVar.a(true);
            }
            this.J0.unlock();
            e6 e6Var = this.G0;
            if (e6Var != null) {
                e6Var.b();
            }
            I();
            if (this.f1070b) {
                AndroidUtilities.removeFromParent(this.f1107s);
            } else {
                this.f1095n.removeView(this.f1107s);
            }
            this.f1107s = null;
            this.m0 = false;
            this.d = false;
            o();
            e5 e5Var = this.f1099o1;
            if (e5Var != null) {
                e5Var.run();
                this.f1099o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f1102q0 && !this.f1119x && this.f1112u0 == null && this.f1114v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f1078e0 == 0.0f && !this.f1088i1) {
            if ((!this.l1 || !this.f1067a) && !this.f1092k1 && !this.f1090j1 && !this.f1101p1 && this.V == 0.0f && this.f1113u1 == null) {
                if (!this.f1070b || (n2Var = this.f1080f) == null || n2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: ai.jc.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f1080f.getContext());
        if (findActivity != null) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            try {
                findActivity.setRequestedOrientation(i10);
            } catch (Exception unused) {
            }
            if (z10) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }
}
