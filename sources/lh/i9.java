package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, cf.a {
    public static boolean f15735t1;
    public static TL_stories.StoryItem f15737v1;
    public static boolean f15738w1;
    public static boolean f15741z1;
    public boolean A;
    public nh.y3 A0;
    public ValueAnimator B;
    public Uri B0;
    public ValueAnimator C;
    public c4 C0;
    public ValueAnimator D;
    public boolean D0;
    public long E;
    public boolean E0;
    public int F;
    public final AnimationNotificationsLocker F0;
    public float G;
    public boolean G0;
    public float H;
    public boolean H0;
    public y6 I;
    public final ArrayList I0;
    public float J;
    public boolean J0;
    public float K;
    public k6 K0;
    public float L;
    public int L0;
    public float M;
    public TL_stories.PeerStories M0;
    public float N;
    public boolean N0;
    public float O;
    public boolean O0;
    public TL_stories.StoryItem P0;
    public float Q;
    public int Q0;
    public float R;
    public boolean R0;
    public float S;
    public int[] S0;
    public float T;
    public boolean T0;
    public float U;
    public boolean U0;
    public float V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public float X;
    public final j3 X0;
    public boolean Y;
    public boolean Y0;
    public float Z;
    public s7 Z0;
    public float f15743a0;
    public final LongSparseIntArray f15744a1;
    public boolean f15746b0;
    public boolean f15747b1;
    public boolean f15749c0;
    public boolean f15750c1;
    public boolean f15751d0;
    public boolean f15752d1;
    public GestureDetector f15754e0;
    public boolean f15755e1;
    public final org.telegram.ui.ActionBar.o2 f15756f;
    public boolean f15757f0;
    public boolean f15758f1;
    public boolean f15759g0;
    public boolean f15760g1;
    public int h;
    public boolean f15761h0;
    public boolean f15762h1;
    public boolean f15763i0;
    public boolean f15764i1;
    public y8 f15765j0;
    public m5 f15766j1;
    public j3 f15768k1;
    public int f15769l0;
    public boolean l1;
    public boolean m0;
    public float f15770m1;
    public WindowManager f15771n;
    public float f15772n0;
    public boolean f15773n1;
    public final f9 f15774o0;
    public boolean f15775o1;
    public e9 f15776p0;
    public long f15777p1;
    public Dialog f15778q0;
    public w6 f15779q1;
    public WindowManager.LayoutParams f15780r;
    public org.telegram.ui.ActionBar.k2 f15781r0;
    public ValueAnimator f15782r1;
    public w8 f15783s;
    public boolean f15784s0;
    public boolean f15785s1;
    public final ArrayList f15786t0;
    public e5.c f15787u0;
    public x8 v;
    public h9 f15788v0;
    public l5 f15789w;
    public d1 f15790w0;
    public boolean f15791x;
    public a9 f15792x0;
    public SurfaceView f15794y0;
    public nh.y3 f15795z0;
    public static final ArrayList f15736u1 = new ArrayList();
    public static float f15739x1 = 1.0f;
    public static boolean f15740y1 = true;
    public static final LongSparseArray A1 = new LongSparseArray();
    public boolean f15742a = SharedConfig.useSurfaceInStories;
    public boolean f15745b = true;
    public boolean f15748c = false;
    public boolean d = false;
    public boolean f15753e = true;
    public final b f15793y = new b();
    public final RectF P = new RectF();
    public final float[] f15767k0 = new float[2];

    public i9(org.telegram.ui.ActionBar.o2 o2Var) {
        ?? obj = new Object();
        obj.f15609k = 1.0f;
        this.f15774o0 = obj;
        this.f15786t0 = new ArrayList();
        this.D0 = true;
        this.F0 = new AnimationNotificationsLocker();
        this.I0 = new ArrayList();
        this.V0 = false;
        this.X0 = new j3(this, 4);
        this.f15744a1 = new LongSparseIntArray();
        new Paint(1);
        this.f15756f = o2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            A1.put(j10 + (j10 >> 16) + (storyItem.f22629id << 16), editable);
        }
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f9, float f10, boolean z10) {
        n2 n2Var;
        n2 n2Var2;
        if (w8Var != null) {
            if (!i9Var.T0) {
                if (i9Var.f15789w == null || i9Var.f15743a0 == 0.0f) {
                    d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f9 - i9Var.v.getX()) - i9Var.f15765j0.getX()) - currentPeerView.getX(), ((f10 - i9Var.v.getY()) - i9Var.f15765j0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f15517r2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (n2Var2 = currentPeerView.X1) != null && n2Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.X1.getY() + currentPeerView.getY() + i9Var.f15765j0.getY() + i9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (n2Var = currentPeerView.X1) != null && n2Var.w0()) || i9Var.f15779q1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(w8Var, f9, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(i9 i9Var) {
        eg.r rVar;
        st editField;
        d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.X1 != null && (((rVar = currentPeerView.X2) == null || rVar.getVisibility() != 0) && (editField = currentPeerView.X1.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new j3(i9Var, 6), 200L);
            return;
        }
        i9Var.m();
    }

    public static void k(i9 i9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.T, i9Var.S) / AndroidUtilities.dp(80.0f)));
        if (i9Var.R != clamp01) {
            i9Var.R = clamp01;
            i9Var.o();
            d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f15525t2) {
                currentPeerView.invalidate();
            }
            d1 d1Var = i9Var.f15790w0;
            if (d1Var != null) {
                d1Var.v((1.0f - i9Var.R) * i9Var.Q);
            }
        }
        w8 w8Var = i9Var.f15783s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) A1.get(j10 + (j10 >> 16) + (storyItem.f22629id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f15737v1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || f15738w1 || f15737v1.messageId != messageObject.getId() || f15737v1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f15786t0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (this.f15763i0) {
            arrayList2.clear();
            return;
        }
        f15739x1 = 1.0f;
        h9 h9Var = this.f15788v0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f15773n1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15745b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f15742a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.Q0 = i12;
        if (storyItem != null && k6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.J0 = z13;
        this.O0 = false;
        if (storyItem != null) {
            this.P0 = storyItem;
            f15737v1 = storyItem;
        }
        this.K0 = k6Var;
        this.M0 = peerStories;
        this.f15776p0 = e9Var;
        this.N0 = z10;
        this.h = i10;
        this.S = 0.0f;
        this.T = 0.0f;
        y8 y8Var = this.f15765j0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.f15765j0.B0 = 0;
        }
        this.Z = 0.0f;
        this.V = 0.0f;
        this.f15761h0 = false;
        this.R = 0.0f;
        this.f15763i0 = true;
        this.W0 = false;
        this.V0 = false;
        this.f15744a1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.X0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f15780r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f15780r.flags = -2147417728;
        this.D0 = false;
        this.Y0 = false;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (this.f15783s == null) {
            this.f15754e0 = new GestureDetector(new s8(this));
            this.f15783s = new w8(this, context, R);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.f15793y);
            this.f15765j0 = y8Var2;
            y8Var2.setDelegate(new z8(this, k6Var, arrayList, context));
            this.v.addView(this.f15765j0, i7.f6.e(-1, -1, 1));
            this.f15787u0 = new e5.c(context);
            if (this.f15742a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.f15794y0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.f15794y0.setZOrderOnTop(false);
                this.f15787u0.addView(this.f15794y0);
            } else {
                a9 a9Var = new a9(context, this);
                this.f15792x0 = a9Var;
                this.f15787u0.addView(a9Var);
            }
            nh.y3 y3Var = new nh.y3(context, this.h);
            this.f15795z0 = y3Var;
            y3Var.setVisibility(8);
            this.f15787u0.addView(this.f15795z0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f16241a = paint;
            view.f16243c = new m7((Object) view, 1);
            view.d = new org.telegram.ui.Components.d6((View) view);
            view.f16244e = new org.telegram.ui.Components.d6((View) view);
            paint.setColor(-1);
            this.Z0 = view;
            this.v.addView((View) view, i7.f6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        nh.y3 y3Var2 = this.f15795z0;
        if (y3Var2 != null) {
            y3Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f15787u0);
        this.f15783s.addView(this.f15787u0);
        SurfaceView surfaceView2 = this.f15794y0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f15783s.addView(this.v);
        this.f15783s.setClipChildren(false);
        if (this.J0) {
            Q();
        }
        if (k6Var != null) {
            this.f15765j0.D(this.h, k6Var.d, k6Var.h());
        } else {
            y8 y8Var3 = this.f15765j0;
            int i13 = this.h;
            y8Var3.f16182w0 = arrayList;
            y8Var3.f16180u0 = i13;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.f16181v0);
            y8Var3.setCurrentItem(i11);
            y8Var3.f16184y0 = true;
        }
        this.f15771n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f15745b = false;
        }
        if (this.f15745b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f15748c = z14;
        x8 x8Var = this.v;
        l4.s0 s0Var = new l4.s0(this, 9);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(x8Var, s0Var);
        if (this.f15745b) {
            AndroidUtilities.removeFromParent(this.f15783s);
            this.f15783s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f15783s);
            if (!this.f15748c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f15783s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f15771n, this.f15783s, this.f15780r);
            this.f15771n.addView(this.f15783s, this.f15780r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f15783s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
            }
        }
        this.f15783s.requestLayout();
        f15738w1 = true;
        Q();
        this.Q = 0.0f;
        o();
        f15735t1 = true;
        if (f15740y1) {
            f15740y1 = false;
            if (((AudioManager) this.f15783s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            f15741z1 = z15;
        }
        if (this.f15745b) {
            z(true);
        }
        if (!this.f15745b) {
            f15736u1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, e9 e9Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                A(i10, context, storyItem, arrayList, 0, null, null, e9Var, false);
            }
        }
    }

    public final void C(Context context, int i10, k6 k6Var, b7 b7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(k6Var.d));
        this.L0 = i10;
        F(context, null, arrayList, 0, k6Var, null, b7Var, false);
    }

    public final void D(Context context, long j10, e9 e9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f16218a;
        TL_stories.PeerStories y8 = storiesController.y(j10);
        if (y8 != null) {
            int i11 = 0;
            while (i11 < y8.stories.size()) {
                if (l7.w(i10, y8.stories.get(i11))) {
                    y8.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y8.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f16223g.remove(y8);
                storiesController.h.remove(y8);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
            return;
        }
        this.f15786t0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, k6Var, peerStories, e9Var, z10);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, b7 b7Var) {
        B(UserConfig.selectedAccount, context, storyItem, b7Var);
    }

    public final void H(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f15745b) {
            R.presentFragment(o2Var);
            return;
        }
        R.presentFragment(o2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.B0 = null;
        K(false);
        l(true);
        h9 h9Var = this.f15788v0;
        if (h9Var != null) {
            h9Var.release(null);
            this.f15788v0 = null;
        }
        nh.y3 y3Var = this.f15795z0;
        if (y3Var != null) {
            y3Var.d(0L, null);
        }
        d1 d1Var = this.f15790w0;
        if (d1Var != null) {
            i1 i1Var = i1.V;
            if (!i1Var.O || i1Var.v != d1Var) {
                if (d1Var.f15458n) {
                    d1Var.s(null);
                } else {
                    d1Var.e();
                }
            }
        }
        this.f15790w0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.I0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f16228m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((r9) hVar.n(i11)).b(false);
        }
        if (this.f15745b) {
            z(false);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f15756f;
        if (o2Var != null) {
            o2Var.removeSheet(this);
        }
        f15736u1.remove(this);
        this.f15786t0.clear();
        this.f15743a0 = 0.0f;
        f15737v1 = null;
    }

    public final void K(boolean z10) {
        this.m0 = z10;
        if (z10) {
            m7 m7Var = this.Z0.f16243c;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            m7Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        d4 currentPeerView;
        d4 currentPeerView2;
        b4 b4Var;
        h9 h9Var;
        c4 c4Var;
        if (this.W0 != z10) {
            this.W0 = z10;
            if (z10 && !this.f15747b1 && (currentPeerView2 = this.f15765j0.getCurrentPeerView()) != null && (b4Var = currentPeerView2.K1) != null && !b4Var.f15378f && b4Var.f15375b == null) {
                if (!this.f15759g0 && !this.f15757f0 && (c4Var = this.C0) != null && c4Var.f15427b != null) {
                    currentPeerView2.Y0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                c4 c4Var2 = this.C0;
                if (c4Var2 != null && (h9Var = c4Var2.f15427b) != null && !this.f15759g0) {
                    h9Var.setSeeking(true);
                }
                this.f15759g0 = true;
            }
            P();
            y8 y8Var = this.f15765j0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.W0);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (this.f15745b && launchActivity != null) {
            if (z10) {
                this.f15784s0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f15784s0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.f15790w0 != null && (o2Var = this.f15756f) != null && this.f15795z0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(o2Var.getContext());
            if (df.d.a(findActivity) > 0) {
                i1.o(findActivity, this.f15790w0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = f15741z1;
        f15741z1 = !z10;
        h9 h9Var = this.f15788v0;
        int i10 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.I0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).setAudioEnabled(!f15741z1, true);
            i10++;
        }
        d4 currentPeerView = this.f15765j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f15524t1.a(f15741z1, true);
        }
        if (!f15741z1) {
            this.Z0.b();
        }
    }

    public final void P() {
        if (this.f15765j0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f15745b) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f15756f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.m4.x().R) {
            w10 = true;
        }
        this.f15765j0.setPaused(w10);
        h9 h9Var = this.f15788v0;
        if (h9Var != null) {
            if (w10) {
                h9Var.pause();
            } else {
                h9Var.play(f15739x1);
            }
        }
        this.f15765j0.f16185z0 = (this.f15791x || this.D0 || this.E0 || this.W0 || this.f15747b1 || this.f15743a0 != 0.0f || this.f15758f1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: lh.i9.Q():void");
    }

    @Override
    public final void a(c2.p pVar) {
        nh.y3 y3Var = this.A0;
        if (y3Var != null) {
            y3Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f15745b) {
            AndroidUtilities.removeFromParent(this.f15783s);
            this.f15756f.getLayoutContainer().addView(this.f15783s);
        } else {
            this.f15771n.addView(this.f15783s, this.f15780r);
        }
        nh.y3 y3Var2 = this.A0;
        if (y3Var2 != null) {
            y3Var2.b();
            this.A0 = null;
        }
        this.f15783s.invalidate();
        this.f15790w0.s(this.f15795z0.getSink());
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f15745b && this.f15783s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Bitmap b() {
        nh.y3 y3Var = this.A0;
        if (y3Var != null && y3Var.a()) {
            return this.A0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        nh.y3 y3Var = this.f15795z0;
        if (y3Var != null && y3Var.a()) {
            return this.f15795z0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.K0 == ((k6) objArr[0])) {
                t();
                y8 y8Var = this.f15765j0;
                k6 k6Var = this.K0;
                y8Var.D(this.h, k6Var.d, k6Var.h());
                l5 l5Var = this.f15789w;
                if (l5Var != null) {
                    TL_stories.StoryItem selectedStory = l5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.K0.f15838i.size()) {
                        if (selectedStory != null && selectedStory.f22629id == ((MessageObject) this.K0.f15838i.get(i12)).storyItem.f22629id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.K0.f15838i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f15789w.b(i13, this.K0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.f15776p0;
            if (e9Var instanceof b7) {
                b7 b7Var = (b7) e9Var;
                if (b7Var.f15407r && !b7Var.f15406n) {
                    s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (b7Var.f15405f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f16223g;
                    }
                    ArrayList<Long> dialogIds = this.f15765j0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!b7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f15765j0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            l5 l5Var2 = this.f15789w;
            if (l5Var2 != null) {
                ArrayList arrayList3 = l5Var2.h.C;
                while (i12 < arrayList3.size()) {
                    ((h4) arrayList3.get(i12)).b();
                    i12++;
                }
            }
        } else {
            int i15 = NotificationCenter.openArticle;
            if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
                if (i10 == NotificationCenter.storyDeleted) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.P0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f22629id == intValue) {
                        this.O0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                h9 h9Var = this.f15788v0;
                if (h9Var != null) {
                    this.f15777p1 = h9Var.currentPosition;
                    this.f15788v0.release(null);
                    this.f15788v0 = null;
                    return;
                }
                this.f15777p1 = 0L;
            } else if (!this.f15775o1 && t() != null) {
                t().f1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final void e(c2.p pVar) {
        nh.y3 y3Var = this.A0;
        if (y3Var != null) {
            y3Var.setOnFirstFrameCallback(pVar);
            this.f15790w0.s(this.A0.getSink());
        }
        if (this.f15745b) {
            AndroidUtilities.removeFromParent(this.f15783s);
        } else {
            this.f15771n.removeView(this.f15783s);
        }
        this.f15783s.invalidate();
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f15756f;
        if (o2Var != null && t() != null && AndroidUtilities.findActivity(o2Var.getContext()) != null && this.f15790w0 != null && this.f15795z0 != null && !this.D0) {
            return true;
        }
        return false;
    }

    @Override
    public final tc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.R) * 0.5f) + 0.5f) * this.Q, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f15783s;
    }

    @Override
    public final View h() {
        nh.y3 y3Var = new nh.y3(this.f15795z0.getContext(), this.h);
        this.A0 = y3Var;
        return y3Var;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.G0;
    }

    @Override
    public final boolean isShown() {
        return !this.D0;
    }

    public final void l(boolean z10) {
        boolean z11;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            if (this.f15763i0 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.f15753e != z11) {
                this.f15753e = z11;
                SurfaceView surfaceView = this.f15794y0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                nh.y3 y3Var = this.f15795z0;
                if (y3Var != null) {
                    y3Var.setSecure(!z11);
                }
                if (this.f15745b) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f15756f;
                    if (o2Var.getParentActivity() != null) {
                        if (z11) {
                            o2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        o2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z11) {
                    this.f15780r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f15780r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f15771n.updateViewLayout(this.f15783s, this.f15780r);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void m() {
        if (this.D == null) {
            this.f15757f0 = false;
            this.f15761h0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.D.addListener(new r8(this, 1));
            this.D.setDuration(250L);
            this.D.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
            this.D.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f15782r1 == null) {
            if (this.f15769l0 != 0) {
                AndroidUtilities.hideKeyboard(this.f15789w);
                return;
            }
            float f9 = 0.0f;
            if (!this.Y && this.f15743a0 == 0.0f) {
                return;
            }
            this.F0.lock();
            if (!z10) {
                float f10 = this.f15743a0;
                l5 l5Var = this.f15789w;
                float f11 = l5Var.f15884c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f15743a0 = f12;
                    l5Var.setOffset(f12);
                }
            }
            float f13 = this.f15743a0;
            if (z10) {
                f9 = this.f15789w.f15884c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f9);
            this.f15782r1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.f15782r1.addListener(new bg.z2(7, this, z10));
            if (z10) {
                this.f15782r1.setDuration(350L);
                this.f15782r1.setInterpolator(jr.h);
            } else {
                this.f15782r1.setDuration(350L);
                this.f15782r1.setInterpolator(jr.f29800f);
            }
            this.f15782r1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f15745b && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        d4 currentPeerView;
        boolean z10 = false;
        if (this.f15743a0 != 0.0f) {
            l5 l5Var = this.f15789w;
            if (l5Var.f15891x > 0) {
                AndroidUtilities.hideKeyboard(l5Var);
                return true;
            }
            c5 currentPage = l5Var.getCurrentPage();
            if (currentPage != null) {
                j4 j4Var = currentPage.f15438r;
                r4 r4Var = currentPage.f15436f;
                if (r4Var != null && r4Var.f32371b) {
                    r4Var.a();
                    return true;
                } else if (Math.abs(currentPage.f15434c.getTranslationY() - j4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    j4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    j4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        y8 y8Var = this.f15765j0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f15789w == null) {
            l5 l5Var = new l5(this.v.getContext(), this);
            this.f15789w = l5Var;
            this.v.addView(l5Var, 0);
        }
        d4 currentPeerView = this.f15765j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.K0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.K0.f15838i.size(); i10++) {
                    arrayList.add(((MessageObject) this.K0.f15838i.get(i10)).storyItem);
                }
                this.f15789w.b(currentPeerView.getListPosition(), this.K0.d, arrayList);
                return;
            }
            this.f15789w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f15783s);
        this.D0 = true;
        this.f15752d1 = true;
        P();
        M(false);
        Q();
        this.F0.lock();
        this.X = this.S;
        this.A = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (!z10) {
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.f15774o0;
            ImageReceiver imageReceiver = f9Var.f15602b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f15603c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f15603c = null;
            f9Var.f15602b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new j3(this, 2), 16L);
        if (this.Y0) {
            this.Y0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (f15741z1) {
            O();
            return;
        }
        d4 currentPeerView = this.f15765j0.getCurrentPeerView();
        if (currentPeerView != null) {
            b4 b4Var = currentPeerView.K1;
            if (!b4Var.j() && b4Var.f15377e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.Z0.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f15786t0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f15769l0 != i10) {
            this.f15769l0 = i10;
            this.f15765j0.setKeyboardHeight(i10);
            this.f15765j0.requestLayout();
            l5 l5Var = this.f15789w;
            if (l5Var != null) {
                l5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f15778q0 = dialog;
            dialog.setOnDismissListener(new cg.d0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f15778q0 = null;
            return false;
        }
    }

    public final d4 t() {
        y8 y8Var = this.f15765j0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.f15763i0) {
            AndroidUtilities.hideKeyboard(this.f15783s);
            this.D0 = true;
            this.G0 = false;
            this.Q = 0.0f;
            this.R = 0.0f;
            P();
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.f15774o0;
            ImageReceiver imageReceiver = f9Var.f15602b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f15603c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f15603c = null;
            f9Var.f15602b = null;
            x8 x8Var = this.v;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.F0.unlock();
            c4 c4Var = this.C0;
            if (c4Var != null) {
                c4Var.a();
            }
            I();
            if (this.f15745b) {
                AndroidUtilities.removeFromParent(this.f15783s);
            } else {
                this.f15771n.removeView(this.f15783s);
            }
            this.f15783s = null;
            this.f15763i0 = false;
            this.d = false;
            o();
            j3 j3Var = this.f15768k1;
            if (j3Var != null) {
                j3Var.run();
                this.f15768k1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (!this.T0 && !this.V0 && !this.U0 && !this.H0 && !this.m0 && !this.f15791x && this.f15778q0 == null && this.f15781r0 == null && !this.D0 && !this.E0 && this.Q == 1.0f && this.f15743a0 == 0.0f && !this.f15755e1) {
            if ((!this.f15762h1 || !this.f15742a) && !this.f15760g1 && !this.f15758f1 && !this.l1 && this.R == 0.0f && this.f15779q1 == null) {
                if (!this.f15745b || (o2Var = this.f15756f) == null || o2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: lh.i9.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f15756f.getContext());
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
    public final void c(Canvas canvas) {
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
