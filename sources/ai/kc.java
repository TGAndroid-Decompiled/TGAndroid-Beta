package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.su;
import org.telegram.ui.LaunchActivity;
public final class kc implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.i2, sf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f1250x1;
    public static TL_stories.StoryItem f1252z1;
    public d2 A0;
    public cc B0;
    public SurfaceView C0;
    public ci.j4 D0;
    public boolean E;
    public ci.j4 E0;
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
    public s9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public e9 O0;
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
    public boolean f1254a0;
    public boolean f1255a1;
    public float f1257b0;
    public final e5 f1258b1;
    public boolean f1260c0;
    public boolean f1261c1;
    public float f1262d0;
    public pa f1263d1;
    public float f1265e0;
    public final LongSparseIntArray f1266e1;
    public final org.telegram.ui.ActionBar.m2 f1267f;
    public boolean f1268f0;
    public boolean f1269f1;
    public boolean f1270g0;
    public boolean f1271g1;
    public int h;
    public boolean f1272h0;
    public boolean f1273h1;
    public GestureDetector f1274i0;
    public boolean f1275i1;
    public boolean f1276j0;
    public boolean f1277j1;
    public boolean f1278k0;
    public boolean f1279k1;
    public boolean f1280l0;
    public boolean l1;
    public boolean m0;
    public boolean f1281m1;
    public WindowManager f1282n;
    public ac f1283n0;
    public a3.d f1284n1;
    public e5 f1286o1;
    public int f1287p0;
    public boolean f1288p1;
    public boolean f1289q0;
    public float f1290q1;
    public WindowManager.LayoutParams f1291r;
    public float f1292r0;
    public boolean f1293r1;
    public yb f1294s;
    public final hc f1295s0;
    public boolean f1296s1;
    public gc f1297t0;
    public long f1298t1;
    public Dialog f1299u0;
    public q9 f1300u1;
    public zb v;
    public org.telegram.ui.ActionBar.i2 f1301v0;
    public ValueAnimator f1302v1;
    public t7 f1303w;
    public boolean f1304w0;
    public boolean f1305w1;
    public boolean f1306x;
    public final ArrayList f1307x0;
    public org.telegram.ui.k4 f1309y0;
    public jc f1310z0;
    public static final ArrayList f1251y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f1253a = SharedConfig.useSurfaceInStories;
    public boolean f1256b = true;
    public boolean f1259c = false;
    public boolean d = false;
    public boolean f1264e = true;
    public final d f1308y = new d();
    public final RectF T = new RectF();
    public final float[] f1285o0 = new float[2];

    public kc(org.telegram.ui.ActionBar.m2 m2Var) {
        ?? obj = new Object();
        obj.f1113k = 1.0f;
        this.f1295s0 = obj;
        this.f1307x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f1258b1 = new e5(this, 4);
        this.f1266e1 = new LongSparseIntArray();
        new Paint(1);
        this.f1267f = m2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f20269id << 16), editable);
        }
    }

    public static boolean i(kc kcVar, yb ybVar, float f7, float f10, boolean z10) {
        b4 b4Var;
        b4 b4Var2;
        if (ybVar != null) {
            if (!kcVar.X0) {
                if (kcVar.f1303w == null || kcVar.f1265e0 == 0.0f) {
                    f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - kcVar.v.getX()) - kcVar.f1283n0.getX()) - currentPeerView.getX(), ((f10 - kcVar.v.getY()) - kcVar.f1283n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f1013v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (b4Var2 = currentPeerView.f952b2) != null && b4Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f952b2.getY() + currentPeerView.getY() + kcVar.f1283n0.getY() + kcVar.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (b4Var = currentPeerView.f952b2) != null && b4Var.u0()) || kcVar.f1300u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(ybVar, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(kc kcVar) {
        q4 q4Var;
        su editField;
        f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f952b2 != null && (((q4Var = currentPeerView.f953b3) == null || q4Var.getVisibility() != 0) && (editField = currentPeerView.f952b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new e5(kcVar, 6), 200L);
            return;
        }
        kcVar.m();
    }

    public static void k(kc kcVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(kcVar.X, kcVar.W) / AndroidUtilities.dp(80.0f)));
        if (kcVar.V != clamp01) {
            kcVar.V = clamp01;
            kcVar.o();
            f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f1021x2) {
                currentPeerView.invalidate();
            }
            d2 d2Var = kcVar.A0;
            if (d2Var != null) {
                d2Var.v((1.0f - kcVar.V) * kcVar.U);
            }
        }
        yb ybVar = kcVar.f1294s;
        if (ybVar != null) {
            ybVar.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f20269id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f1252z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f1252z1.messageId != messageObject.getId() || f1252z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, gc gcVar) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, gcVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, e9 e9Var, TL_stories.PeerStories peerStories, gc gcVar, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f1307x0;
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
        jc jcVar = this.f1310z0;
        if (jcVar != null) {
            jcVar.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f1293r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1256b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f1253a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && e9Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f1252z1 = storyItem;
        }
        this.O0 = e9Var;
        this.Q0 = peerStories;
        this.f1297t0 = gcVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        ac acVar = this.f1283n0;
        if (acVar != null) {
            acVar.setHorizontalProgressToDismiss(0.0f);
            this.f1283n0.F0 = 0;
        }
        this.f1262d0 = 0.0f;
        this.Z = 0.0f;
        this.f1280l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f1255a1 = false;
        this.Z0 = false;
        this.f1266e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f1258b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1291r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f1291r.flags = -2147417728;
        this.H0 = false;
        this.f1261c1 = false;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (this.f1294s == null) {
            this.f1274i0 = new GestureDetector(new ub(this));
            this.f1294s = new yb(this, context, R);
        }
        if (this.v == null) {
            this.v = new zb(this, context);
            ac acVar2 = new ac(this, this.h, context, this, this.f1308y);
            this.f1283n0 = acVar2;
            acVar2.setDelegate(new bc(this, e9Var, arrayList, context));
            this.v.addView(this.f1283n0, w7.x5.e(-1, -1, 1));
            this.f1309y0 = new org.telegram.ui.k4(context);
            if (this.f1253a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f1309y0.addView(this.C0);
            } else {
                cc ccVar = new cc(this, context);
                this.B0 = ccVar;
                this.f1309y0.addView(ccVar);
            }
            ci.j4 j4Var = new ci.j4(context, this.h);
            this.D0 = j4Var;
            j4Var.setVisibility(8);
            this.f1309y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f1586a = paint;
            view.f1588c = new r4((Object) view, 2);
            view.d = new org.telegram.ui.Components.g6((View) view);
            view.f1589e = new org.telegram.ui.Components.g6((View) view);
            paint.setColor(-1);
            this.f1263d1 = view;
            this.v.addView((View) view, w7.x5.a(-1.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 0));
        }
        ci.j4 j4Var2 = this.D0;
        if (j4Var2 != null) {
            j4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f1309y0);
        this.f1294s.addView(this.f1309y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f1294s.addView(this.v);
        this.f1294s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (e9Var != null) {
            this.f1283n0.D(this.h, e9Var.d, e9Var.h());
        } else {
            ac acVar3 = this.f1283n0;
            int i13 = this.h;
            acVar3.A0 = arrayList;
            acVar3.f1543y0 = i13;
            acVar3.setAdapter(null);
            acVar3.setAdapter(acVar3.f1544z0);
            acVar3.setCurrentItem(i11);
            acVar3.C0 = true;
        }
        this.f1282n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f1256b = false;
        }
        if (this.f1256b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f1259c = z14;
        zb zbVar = this.v;
        a1.c cVar = new a1.c(this, 10);
        WeakHashMap weakHashMap = r0.i0.f46856a;
        r0.a0.i(zbVar, cVar);
        if (this.f1256b) {
            AndroidUtilities.removeFromParent(this.f1294s);
            this.f1294s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f1294s);
            if (!this.f1259c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f1294s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f1282n, this.f1294s, this.f1291r);
            this.f1282n.addView(this.f1294s, this.f1291r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f1294s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new sb(this, 0));
            }
        }
        this.f1294s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f1250x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f1294s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f1256b) {
            z(true);
        }
        if (!this.f1256b) {
            f1251y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, e9 e9Var, v9 v9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(e9Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, e9Var, null, v9Var, false);
    }

    public final void D(Context context, long j3, gc gcVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        m9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f1406a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (ja.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.f1411g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, gcVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, gc gcVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, gcVar, false);
            return;
        }
        this.f1307x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, v9 v9Var) {
        A(UserConfig.selectedAccount, context, storyItem, v9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, e9 e9Var, TL_stories.PeerStories peerStories, gc gcVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, e9Var, peerStories, gcVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f1256b) {
            R.presentFragment(m2Var);
            return;
        }
        R.presentFragment(m2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        jc jcVar = this.f1310z0;
        if (jcVar != null) {
            jcVar.release(null);
            this.f1310z0 = null;
        }
        ci.j4 j4Var = this.D0;
        if (j4Var != null) {
            j4Var.d(0L, null);
        }
        d2 d2Var = this.A0;
        if (d2Var != null) {
            n2 n2Var = n2.Z;
            if (!n2Var.S || n2Var.v != d2Var) {
                if (d2Var.f811n) {
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
            ((jc) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().f1416m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((tc) iVar.n(i11)).b(false);
        }
        if (this.f1256b) {
            z(false);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f1267f;
        if (m2Var != null) {
            m2Var.removeSheet(this);
        }
        f1251y1.remove(this);
        this.f1307x0.clear();
        this.f1265e0 = 0.0f;
        f1252z1 = null;
    }

    public final void K(boolean z10) {
        this.f1289q0 = z10;
        if (z10) {
            r4 r4Var = this.f1263d1.f1588c;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            r4Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        f6 currentPeerView;
        f6 currentPeerView2;
        d6 d6Var;
        jc jcVar;
        e6 e6Var;
        if (this.f1255a1 != z10) {
            this.f1255a1 = z10;
            if (z10 && !this.f1269f1 && (currentPeerView2 = this.f1283n0.getCurrentPeerView()) != null && (d6Var = currentPeerView2.O1) != null && !d6Var.f826f && d6Var.f823b == null) {
                if (!this.f1278k0 && !this.f1276j0 && (e6Var = this.G0) != null && ((jc) e6Var.f884c) != null) {
                    currentPeerView2.f955c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                e6 e6Var2 = this.G0;
                if (e6Var2 != null && (jcVar = (jc) e6Var2.f884c) != null && !this.f1278k0) {
                    jcVar.setSeeking(true);
                }
                this.f1278k0 = true;
            }
            P();
            ac acVar = this.f1283n0;
            if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f1255a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f1256b && launchActivity != null) {
            if (z10) {
                this.f1304w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f1304w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.m2 m2Var;
        Context context;
        if (this.A0 != null && (m2Var = this.f1267f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(m2Var.getContext());
            if (tf.c.a(findActivity) > 0) {
                d2 d2Var = this.A0;
                n2 n2Var = n2.Z;
                if (d2Var != null && !n2Var.S) {
                    n2Var.S = true;
                    n2Var.v = d2Var;
                    int i10 = d2Var.f809e;
                    n2Var.f1454w = i10;
                    NotificationCenter.getInstance(i10).addObserver(n2Var, NotificationCenter.liveStoryUpdated);
                    n2Var.J = n2Var.n();
                    n2Var.K = n2Var.m();
                    n2Var.M = 1.0f;
                    n2Var.H = false;
                    o1.k kVar = new o1.k(n2Var, n2.X);
                    o1.l lVar = new o1.l();
                    lVar.a(0.75f);
                    lVar.b(650.0f);
                    kVar.f16988u = lVar;
                    n2Var.P = kVar;
                    o1.k kVar2 = new o1.k(n2Var, n2.Y);
                    o1.l lVar2 = new o1.l();
                    lVar2.a(0.75f);
                    lVar2.b(650.0f);
                    kVar2.f16988u = lVar2;
                    n2Var.Q = kVar2;
                    if (findActivity != null) {
                        context = findActivity;
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    n2Var.f1455x = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    n2Var.f1455x.setStylusScaleEnabled(false);
                    n2Var.f1456y = new m.f3(context, new i2(scaledTouchSlop));
                    j2 j2Var = new j2(context, 0);
                    j2Var.f1177b = new Path();
                    n2Var.f1449e = j2Var;
                    ?? viewGroup = new ViewGroup(context);
                    n2Var.d = viewGroup;
                    viewGroup.addView(n2Var.f1449e, w7.x5.d(-1.0f, -1));
                    n2Var.f1449e.setOutlineProvider(new l2(0));
                    n2Var.f1449e.setClipToOutline(true);
                    n2Var.f1449e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20849gg, false));
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    n2Var.f1451n = y9Var;
                    n2Var.f1449e.addView(y9Var, w7.x5.d(-1.0f, -1));
                    ci.j4 j4Var = new ci.j4(context, n2Var.f1454w);
                    n2Var.f1450f = j4Var;
                    j4Var.setAlpha(0.0f);
                    n2Var.f1449e.addView(n2Var.f1450f, w7.x5.d(-1.0f, -1));
                    ao aoVar = new ao(context, 1);
                    n2Var.f1452r = aoVar;
                    n2Var.f1449e.addView(aoVar, w7.x5.d(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    n2Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    n2Var.h.addView(view, w7.x5.d(-1.0f, -1));
                    int dp = AndroidUtilities.dp(8.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.pip_video_close);
                    int i11 = org.telegram.ui.ActionBar.h6.f20867hg;
                    imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    int i12 = org.telegram.ui.ActionBar.h6.f20877i6;
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(dp, dp, dp, dp);
                    imageView.setOnClickListener(new e2(0));
                    float f7 = 38;
                    float f10 = 4;
                    n2Var.h.addView(imageView, w7.x5.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.pip_video_expand);
                    imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                    imageView2.setPadding(dp, dp, dp, dp);
                    imageView2.setOnClickListener(new f2(0, d2Var, context));
                    n2Var.h.addView(imageView2, w7.x5.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
                    n2Var.f1449e.addView(n2Var.h, w7.x5.d(-1.0f, -1));
                    n2Var.f1447b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = tf.c.b(context, false);
                    n2Var.f1448c = b10;
                    int i13 = n2Var.J;
                    b10.width = i13;
                    b10.height = n2Var.K;
                    float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
                    n2Var.N = dp2;
                    b10.x = (int) dp2;
                    WindowManager.LayoutParams layoutParams = n2Var.f1448c;
                    float dp3 = (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f);
                    n2Var.O = dp3;
                    layoutParams.y = (int) dp3;
                    WindowManager.LayoutParams layoutParams2 = n2Var.f1448c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    n2Var.d.setAlpha(0.0f);
                    n2Var.d.setScaleX(0.1f);
                    n2Var.d.setScaleY(0.1f);
                    AndroidUtilities.setPreferredMaxRefreshRate(n2Var.f1447b, n2Var.d, n2Var.f1448c);
                    n2Var.f1447b.addView(n2Var.d, n2Var.f1448c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(is.f27451f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(n2Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(n2Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(n2Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new m2(0));
                    animatorSet.start();
                    n2Var.i();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                    qf.e eVar = n2Var.L;
                    if (eVar != null) {
                        eVar.c();
                        n2Var.L = null;
                    }
                    if (findActivity != null && tf.c.a(findActivity) == 1) {
                        qf.d dVar = new qf.d(findActivity, n2Var);
                        dVar.f46231c = "pip-live-story";
                        dVar.f46232e = 1;
                        dVar.d = AndroidUtilities.dp(10.0f);
                        dVar.f46236j = n2Var.d;
                        dVar.f46237k = n2Var.f1450f.getPlaceholderView();
                        n2Var.L = dVar.a();
                    }
                }
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        jc jcVar = this.f1310z0;
        int i10 = 0;
        if (jcVar != null) {
            jcVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((jc) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        f6 currentPeerView = this.f1283n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f1020x1.a(D1, true);
        }
        if (!D1) {
            this.f1263d1.b();
        }
    }

    public final void P() {
        if (this.f1283n0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f1256b) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f1267f;
            if (m2Var.isPaused() || !m2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.h4.x().V) {
            w10 = true;
        }
        this.f1283n0.setPaused(w10);
        jc jcVar = this.f1310z0;
        if (jcVar != null) {
            if (w10) {
                jcVar.pause();
            } else {
                jcVar.play(B1);
            }
        }
        this.f1283n0.D0 = (this.f1306x || this.H0 || this.I0 || this.f1255a1 || this.f1269f1 || this.f1265e0 != 0.0f || this.f1277j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: ai.kc.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ci.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f1256b) {
            AndroidUtilities.removeFromParent(this.f1294s);
        } else {
            this.f1282n.removeView(this.f1294s);
        }
        this.f1294s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f1256b && this.f1294s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        ci.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f1256b) {
            AndroidUtilities.removeFromParent(this.f1294s);
            this.f1267f.getLayoutContainer().addView(this.f1294s);
        } else {
            this.f1282n.addView(this.f1294s, this.f1291r);
        }
        ci.j4 j4Var2 = this.E0;
        if (j4Var2 != null) {
            j4Var2.b();
            this.E0 = null;
        }
        this.f1294s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        ci.j4 j4Var = this.E0;
        if (j4Var != null && j4Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((e9) objArr[0])) {
                t();
                ac acVar = this.f1283n0;
                e9 e9Var = this.O0;
                acVar.D(this.h, e9Var.d, e9Var.h());
                t7 t7Var = this.f1303w;
                if (t7Var != null) {
                    TL_stories.StoryItem selectedStory = t7Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f899i.size()) {
                        if (selectedStory != null && selectedStory.f20269id == ((MessageObject) this.O0.f899i.get(i12)).storyItem.f20269id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f899i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f1303w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            gc gcVar = this.f1297t0;
            if (gcVar instanceof v9) {
                v9 v9Var = (v9) gcVar;
                if (v9Var.f1835r && !v9Var.f1834n) {
                    m9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (v9Var.f1833f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f1411g;
                    }
                    ArrayList<Long> dialogIds = this.f1283n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!v9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f1283n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            t7 t7Var2 = this.f1303w;
            if (t7Var2 != null) {
                ArrayList arrayList3 = t7Var2.h.G;
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f20269id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                jc jcVar = this.f1310z0;
                if (jcVar != null) {
                    this.f1298t1 = jcVar.currentPosition;
                    this.f1310z0.release(null);
                    this.f1310z0 = null;
                    return;
                }
                this.f1298t1 = 0L;
            } else if (!this.f1296s1 && t() != null) {
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
        ci.j4 j4Var = this.D0;
        if (j4Var != null && j4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f1267f;
        if (m2Var != null && t() != null && AndroidUtilities.findActivity(m2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final ad getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f1294s;
    }

    @Override
    public final View h() {
        ci.j4 j4Var = new ci.j4(this.D0.getContext(), this.h);
        this.E0 = j4Var;
        return j4Var;
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
            if (this.f1264e != z11) {
                this.f1264e = z11;
                SurfaceView surfaceView = this.C0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                ci.j4 j4Var = this.D0;
                if (j4Var != null) {
                    j4Var.setSecure(!z11);
                }
                if (this.f1256b) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.f1267f;
                    if (m2Var.getParentActivity() != null) {
                        if (z11) {
                            m2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        m2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z11) {
                    this.f1291r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f1291r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f1282n.updateViewLayout(this.f1294s, this.f1291r);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f1276j0 = false;
            this.f1280l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new rb(this, 2));
            this.H.addListener(new tb(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f1302v1 == null) {
            if (this.f1287p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f1303w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f1260c0 && this.f1265e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f1265e0;
                t7 t7Var = this.f1303w;
                float f11 = t7Var.f1740c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f1265e0 = f12;
                    t7Var.setOffset(f12);
                }
            }
            float f13 = this.f1265e0;
            if (z10) {
                f7 = this.f1303w.f1740c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f1302v1 = ofFloat;
            ofFloat.addUpdateListener(new rb(this, 3));
            this.f1302v1.addListener(new n(3, this, z10));
            if (z10) {
                this.f1302v1.setDuration(350L);
                this.f1302v1.setInterpolator(is.h);
            } else {
                this.f1302v1.setDuration(350L);
                this.f1302v1.setInterpolator(is.f27451f);
            }
            this.f1302v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f1256b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        f6 currentPeerView;
        boolean z10 = false;
        if (this.f1265e0 != 0.0f) {
            t7 t7Var = this.f1303w;
            if (t7Var.f1747x > 0) {
                AndroidUtilities.hideKeyboard(t7Var);
                return true;
            }
            l7 currentPage = t7Var.getCurrentPage();
            if (currentPage != null) {
                p6 p6Var = currentPage.f1340r;
                y6 y6Var = currentPage.f1338f;
                if (y6Var != null && y6Var.f29511b) {
                    y6Var.a();
                    return true;
                } else if (Math.abs(currentPage.f1336c.getTranslationY() - p6Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    p6Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    p6Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        ac acVar = this.f1283n0;
        if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f1303w == null) {
            t7 t7Var = new t7(this, this.v.getContext());
            this.f1303w = t7Var;
            this.v.addView(t7Var, 0);
        }
        f6 currentPeerView = this.f1283n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f899i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f899i.get(i10)).storyItem);
                }
                this.f1303w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f1303w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f1294s);
        this.H0 = true;
        this.f1273h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f1257b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new rb(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            hc hcVar = this.f1295s0;
            ImageReceiver imageReceiver = hcVar.f1106b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = hcVar.f1107c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            hcVar.f1107c = null;
            hcVar.f1106b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new e5(this, 2), 16L);
        if (this.f1261c1) {
            this.f1261c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        f6 currentPeerView = this.f1283n0.getCurrentPeerView();
        if (currentPeerView != null) {
            d6 d6Var = currentPeerView.O1;
            if (!d6Var.j() && d6Var.f825e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f1263d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f1307x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f1287p0 != i10) {
            this.f1287p0 = i10;
            this.f1283n0.setKeyboardHeight(i10);
            this.f1283n0.requestLayout();
            t7 t7Var = this.f1303w;
            if (t7Var != null) {
                t7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f1299u0 = dialog;
            dialog.setOnDismissListener(new g5(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f1299u0 = null;
            return false;
        }
    }

    public final f6 t() {
        ac acVar = this.f1283n0;
        if (acVar == null) {
            return null;
        }
        return acVar.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f1294s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            hc hcVar = this.f1295s0;
            ImageReceiver imageReceiver = hcVar.f1106b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = hcVar.f1107c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            hcVar.f1107c = null;
            hcVar.f1106b = null;
            zb zbVar = this.v;
            if (zbVar != null) {
                zbVar.a(true);
            }
            this.J0.unlock();
            e6 e6Var = this.G0;
            if (e6Var != null) {
                e6Var.b();
            }
            I();
            if (this.f1256b) {
                AndroidUtilities.removeFromParent(this.f1294s);
            } else {
                this.f1282n.removeView(this.f1294s);
            }
            this.f1294s = null;
            this.m0 = false;
            this.d = false;
            o();
            e5 e5Var = this.f1286o1;
            if (e5Var != null) {
                e5Var.run();
                this.f1286o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f1289q0 && !this.f1306x && this.f1299u0 == null && this.f1301v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f1265e0 == 0.0f && !this.f1275i1) {
            if ((!this.l1 || !this.f1253a) && !this.f1279k1 && !this.f1277j1 && !this.f1288p1 && this.V == 0.0f && this.f1300u1 == null) {
                if (!this.f1256b || (m2Var = this.f1267f) == null || m2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: ai.kc.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f1267f.getContext());
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
