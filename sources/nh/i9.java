package nh;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ut;
import org.telegram.ui.LaunchActivity;
public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.l2, df.a {
    public static boolean A1;
    public static boolean f15422u1;
    public static TL_stories.StoryItem f15424w1;
    public static boolean f15425x1;
    public ph.k3 A0;
    public boolean B;
    public ph.k3 B0;
    public ValueAnimator C;
    public Uri C0;
    public ValueAnimator D;
    public c4 D0;
    public ValueAnimator E;
    public boolean E0;
    public long F;
    public boolean F0;
    public int G;
    public final AnimationNotificationsLocker G0;
    public float H;
    public boolean H0;
    public float I;
    public boolean I0;
    public z6 J;
    public final ArrayList J0;
    public float K;
    public boolean K0;
    public float L;
    public l6 L0;
    public float M;
    public int M0;
    public float N;
    public TL_stories.PeerStories N0;
    public float O;
    public boolean O0;
    public float P;
    public boolean P0;
    public TL_stories.StoryItem Q0;
    public float R;
    public int R0;
    public float S;
    public boolean S0;
    public float T;
    public int[] T0;
    public float U;
    public boolean U0;
    public float V;
    public boolean V0;
    public float W;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public float Y;
    public final k3 Y0;
    public boolean Z;
    public boolean Z0;
    public float f15429a0;
    public s7 f15430a1;
    public float f15432b0;
    public final LongSparseIntArray f15433b1;
    public boolean f15435c0;
    public boolean f15436c1;
    public boolean f15437d0;
    public boolean f15438d1;
    public boolean f15439e0;
    public boolean f15440e1;
    public final org.telegram.ui.ActionBar.p2 f15441f;
    public GestureDetector f15442f0;
    public boolean f15443f1;
    public boolean f15444g0;
    public boolean f15445g1;
    public int h;
    public boolean f15446h0;
    public boolean f15447h1;
    public boolean f15448i0;
    public boolean f15449i1;
    public boolean f15450j0;
    public boolean f15451j1;
    public y8 f15452k0;
    public n5 f15453k1;
    public k3 l1;
    public int m0;
    public boolean f15455m1;
    public WindowManager f15456n;
    public boolean f15457n0;
    public float f15458n1;
    public float f15459o0;
    public boolean f15460o1;
    public final f9 f15461p0;
    public boolean f15462p1;
    public e9 f15463q0;
    public long f15464q1;
    public WindowManager.LayoutParams f15465r;
    public Dialog f15466r0;
    public x6 f15467r1;
    public w8 f15468s;
    public org.telegram.ui.ActionBar.l2 f15469s0;
    public ValueAnimator f15470s1;
    public boolean f15471t0;
    public boolean f15472t1;
    public final ArrayList f15473u0;
    public x8 v;
    public org.telegram.ui.q4 f15474v0;
    public m5 f15475w;
    public h9 f15476w0;
    public boolean f15477x;
    public e1 f15478x0;
    public a9 f15480y0;
    public SurfaceView f15481z0;
    public static final ArrayList f15423v1 = new ArrayList();
    public static float f15426y1 = 1.0f;
    public static boolean f15427z1 = true;
    public static final LongSparseArray B1 = new LongSparseArray();
    public boolean f15428a = SharedConfig.useSurfaceInStories;
    public boolean f15431b = true;
    public boolean f15434c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f15479y = new b();
    public final RectF Q = new RectF();
    public final float[] f15454l0 = new float[2];

    public i9(org.telegram.ui.ActionBar.p2 p2Var) {
        ?? obj = new Object();
        obj.f15319k = 1.0f;
        this.f15461p0 = obj;
        this.f15473u0 = new ArrayList();
        this.E0 = true;
        this.G0 = new AnimationNotificationsLocker();
        this.J0 = new ArrayList();
        this.W0 = false;
        this.Y0 = new k3(this, 4);
        this.f15433b1 = new LongSparseIntArray();
        new Paint(1);
        this.f15441f = p2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            B1.put(j10 + (j10 >> 16) + (storyItem.f19394id << 16), editable);
        }
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f10, float f11, boolean z4) {
        o2 o2Var;
        o2 o2Var2;
        if (w8Var != null) {
            if (!i9Var.U0) {
                if (i9Var.f15475w == null || i9Var.f15432b0 == 0.0f) {
                    d4 currentPeerView = i9Var.f15452k0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f10 - i9Var.v.getX()) - i9Var.f15452k0.getX()) - currentPeerView.getX(), ((f11 - i9Var.v.getY()) - i9Var.f15452k0.getY()) - currentPeerView.getY(), z4)) {
                            if (currentPeerView.f15215s2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z4) {
                        return false;
                    }
                    if (currentPeerView != null && (o2Var2 = currentPeerView.Y1) != null && o2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.Y1.getY() + currentPeerView.getY() + i9Var.f15452k0.getY() + i9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (o2Var = currentPeerView.Y1) != null && o2Var.w0()) || i9Var.f15467r1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(w8Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(i9 i9Var) {
        gg.q qVar;
        ut editField;
        d4 currentPeerView = i9Var.f15452k0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.Y1 != null && (((qVar = currentPeerView.Y2) == null || qVar.getVisibility() != 0) && (editField = currentPeerView.Y1.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new k3(i9Var, 6), 200L);
            return;
        }
        i9Var.m();
    }

    public static void k(i9 i9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.U, i9Var.T) / AndroidUtilities.dp(80.0f)));
        if (i9Var.S != clamp01) {
            i9Var.S = clamp01;
            i9Var.o();
            d4 currentPeerView = i9Var.f15452k0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f15223u2) {
                currentPeerView.invalidate();
            }
            e1 e1Var = i9Var.f15478x0;
            if (e1Var != null) {
                e1Var.v((1.0f - i9Var.S) * i9Var.R);
            }
        }
        w8 w8Var = i9Var.f15468s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) B1.get(j10 + (j10 >> 16) + (storyItem.f19394id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f15424w1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || f15425x1 || f15424w1.messageId != messageObject.getId() || f15424w1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, l6 l6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z4) {
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f15473u0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (this.f15450j0) {
            arrayList2.clear();
            return;
        }
        f15426y1 = 1.0f;
        h9 h9Var = this.f15476w0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z14 = false;
        if (!AndroidUtilities.isTablet() && !this.f15460o1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15431b = z10;
        if (SharedConfig.useSurfaceInStories && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15428a = z11;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.R0 = i12;
        if (storyItem != null && l6Var == null && peerStories == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.K0 = z12;
        this.P0 = false;
        if (storyItem != null) {
            this.Q0 = storyItem;
            f15424w1 = storyItem;
        }
        this.L0 = l6Var;
        this.N0 = peerStories;
        this.f15463q0 = e9Var;
        this.O0 = z4;
        this.h = i10;
        this.T = 0.0f;
        this.U = 0.0f;
        y8 y8Var = this.f15452k0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.f15452k0.C0 = 0;
        }
        this.f15429a0 = 0.0f;
        this.W = 0.0f;
        this.f15448i0 = false;
        this.S = 0.0f;
        this.f15450j0 = true;
        this.X0 = false;
        this.W0 = false;
        this.f15433b1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.Y0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f15465r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f15465r.flags = -2147417728;
        this.E0 = false;
        this.Z0 = false;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (this.f15468s == null) {
            this.f15442f0 = new GestureDetector(new s8(this));
            this.f15468s = new w8(this, context, R);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.f15479y);
            this.f15452k0 = y8Var2;
            y8Var2.setDelegate(new z8(this, l6Var, arrayList, context));
            this.v.addView(this.f15452k0, k7.b6.e(-1, -1, 1));
            this.f15474v0 = new org.telegram.ui.q4(context);
            if (this.f15428a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.f15481z0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.f15481z0.setZOrderOnTop(false);
                this.f15474v0.addView(this.f15481z0);
            } else {
                a9 a9Var = new a9(context, this);
                this.f15480y0 = a9Var;
                this.f15474v0.addView(a9Var);
            }
            ph.k3 k3Var = new ph.k3(context, this.h);
            this.A0 = k3Var;
            k3Var.setVisibility(8);
            this.f15474v0.addView(this.A0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f15871a = paint;
            view.f15873c = new m2.b((Object) view, 4);
            view.d = new org.telegram.ui.Components.z5((View) view);
            view.e = new org.telegram.ui.Components.z5((View) view);
            paint.setColor(-1);
            this.f15430a1 = view;
            this.v.addView((View) view, k7.b6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        ph.k3 k3Var2 = this.A0;
        if (k3Var2 != null) {
            k3Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f15474v0);
        this.f15468s.addView(this.f15474v0);
        SurfaceView surfaceView2 = this.f15481z0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f15468s.addView(this.v);
        this.f15468s.setClipChildren(false);
        if (this.K0) {
            Q();
        }
        if (l6Var != null) {
            this.f15452k0.D(this.h, l6Var.d, l6Var.h());
        } else {
            y8 y8Var3 = this.f15452k0;
            int i13 = this.h;
            y8Var3.f15829x0 = arrayList;
            y8Var3.f15827v0 = i13;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.f15828w0);
            y8Var3.setCurrentItem(i11);
            y8Var3.f15831z0 = true;
        }
        this.f15456n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f15431b = false;
        }
        if (this.f15431b && R != null && R.isSupportEdgeToEdge()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f15434c = z13;
        x8 x8Var = this.v;
        lh.m5 m5Var = new lh.m5(this, 13);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(x8Var, m5Var);
        if (this.f15431b) {
            AndroidUtilities.removeFromParent(this.f15468s);
            this.f15468s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f15468s);
            if (!this.f15434c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f15468s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f15456n, this.f15468s, this.f15465r);
            this.f15456n.addView(this.f15468s, this.f15465r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f15468s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
            }
        }
        this.f15468s.requestLayout();
        f15425x1 = true;
        Q();
        this.R = 0.0f;
        o();
        f15422u1 = true;
        if (f15427z1) {
            f15427z1 = false;
            if (((AudioManager) this.f15468s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z14 = true;
            }
            A1 = z14;
        }
        if (this.f15431b) {
            z(true);
        }
        if (!this.f15431b) {
            f15423v1.add(this);
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

    public final void C(Context context, int i10, l6 l6Var, c7 c7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(l6Var.d));
        this.M0 = i10;
        F(context, null, arrayList, 0, l6Var, null, c7Var, false);
    }

    public final void D(Context context, long j10, e9 e9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        t6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f15897a;
        TL_stories.PeerStories y10 = storiesController.y(j10);
        if (y10 != null) {
            int i11 = 0;
            while (i11 < y10.stories.size()) {
                if (m7.w(i10, y10.stories.get(i11))) {
                    y10.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y10.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f15901g.remove(y10);
                storiesController.h.remove(y10);
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
        this.f15473u0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, l6 l6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z4) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, l6Var, peerStories, e9Var, z4);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, c7 c7Var) {
        B(UserConfig.selectedAccount, context, storyItem, c7Var);
    }

    public final void H(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f15431b) {
            R.presentFragment(p2Var);
            return;
        }
        R.presentFragment(p2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.C0 = null;
        K(false);
        l(true);
        h9 h9Var = this.f15476w0;
        if (h9Var != null) {
            h9Var.release(null);
            this.f15476w0 = null;
        }
        ph.k3 k3Var = this.A0;
        if (k3Var != null) {
            k3Var.d(0L, null);
        }
        e1 e1Var = this.f15478x0;
        if (e1Var != null) {
            j1 j1Var = j1.W;
            if (!j1Var.P || j1Var.v != e1Var) {
                if (e1Var.f15276n) {
                    e1Var.s(null);
                } else {
                    e1Var.e();
                }
            }
        }
        this.f15478x0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.J0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f15906m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((r9) hVar.n(i11)).b(false);
        }
        if (this.f15431b) {
            z(false);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f15441f;
        if (p2Var != null) {
            p2Var.removeSheet(this);
        }
        f15423v1.remove(this);
        this.f15473u0.clear();
        this.f15432b0 = 0.0f;
        f15424w1 = null;
    }

    public final void K(boolean z4) {
        this.f15457n0 = z4;
        if (z4) {
            m2.b bVar = this.f15430a1.f15873c;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
        P();
    }

    public final void L(boolean z4) {
        d4 currentPeerView;
        d4 currentPeerView2;
        b4 b4Var;
        h9 h9Var;
        c4 c4Var;
        if (this.X0 != z4) {
            this.X0 = z4;
            if (z4 && !this.f15436c1 && (currentPeerView2 = this.f15452k0.getCurrentPeerView()) != null && (b4Var = currentPeerView2.L1) != null && !b4Var.f15094f && b4Var.f15092b == null) {
                if (!this.f15446h0 && !this.f15444g0 && (c4Var = this.D0) != null && c4Var.f15122b != null) {
                    currentPeerView2.Z0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                c4 c4Var2 = this.D0;
                if (c4Var2 != null && (h9Var = c4Var2.f15122b) != null && !this.f15446h0) {
                    h9Var.setSeeking(true);
                }
                this.f15446h0 = true;
            }
            P();
            y8 y8Var = this.f15452k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.X0);
            }
        }
    }

    public final void M(boolean z4) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (this.f15431b && launchActivity != null) {
            if (z4) {
                this.f15471t0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f15471t0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z4);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.f15478x0 != null && (p2Var = this.f15441f) != null && this.A0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(p2Var.getContext());
            if (ef.d.a(findActivity) > 0) {
                j1.o(findActivity, this.f15478x0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z4 = A1;
        A1 = !z4;
        h9 h9Var = this.f15476w0;
        int i10 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z4, false);
        }
        while (true) {
            ArrayList arrayList = this.J0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).setAudioEnabled(!A1, true);
            i10++;
        }
        d4 currentPeerView = this.f15452k0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f15222u1.a(A1, true);
        }
        if (!A1) {
            this.f15430a1.b();
        }
    }

    public final void P() {
        if (this.f15452k0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z4 = true;
        if (this.f15431b) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f15441f;
            if (p2Var.isPaused() || !p2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.n4.x().S) {
            w10 = true;
        }
        this.f15452k0.setPaused(w10);
        h9 h9Var = this.f15476w0;
        if (h9Var != null) {
            if (w10) {
                h9Var.pause();
            } else {
                h9Var.play(f15426y1);
            }
        }
        this.f15452k0.A0 = (this.f15477x || this.E0 || this.F0 || this.X0 || this.f15436c1 || this.f15432b0 != 0.0f || this.f15445g1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: nh.i9.Q():void");
    }

    @Override
    public final void a(c2.p pVar) {
        ph.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f15431b) {
            AndroidUtilities.removeFromParent(this.f15468s);
            this.f15441f.getLayoutContainer().addView(this.f15468s);
        } else {
            this.f15456n.addView(this.f15468s, this.f15465r);
        }
        ph.k3 k3Var2 = this.B0;
        if (k3Var2 != null) {
            k3Var2.b();
            this.B0 = null;
        }
        this.f15468s.invalidate();
        this.f15478x0.s(this.A0.getSink());
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f15431b && this.f15468s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Bitmap b() {
        ph.k3 k3Var = this.B0;
        if (k3Var != null && k3Var.a()) {
            return this.B0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        ph.k3 k3Var = this.A0;
        if (k3Var != null && k3Var.a()) {
            return this.A0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.L0 == ((l6) objArr[0])) {
                t();
                y8 y8Var = this.f15452k0;
                l6 l6Var = this.L0;
                y8Var.D(this.h, l6Var.d, l6Var.h());
                m5 m5Var = this.f15475w;
                if (m5Var != null) {
                    TL_stories.StoryItem selectedStory = m5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.L0.f15560i.size()) {
                        if (selectedStory != null && selectedStory.f19394id == ((MessageObject) this.L0.f15560i.get(i12)).storyItem.f19394id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.L0.f15560i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f15475w.b(i13, this.L0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.f15463q0;
            if (e9Var instanceof c7) {
                c7 c7Var = (c7) e9Var;
                if (c7Var.f15148r && !c7Var.f15147n) {
                    t6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (c7Var.f15146f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f15901g;
                    }
                    ArrayList<Long> dialogIds = this.f15452k0.getDialogIds();
                    boolean z4 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!c7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z4 = true;
                        }
                    }
                    if (z4) {
                        this.f15452k0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            m5 m5Var2 = this.f15475w;
            if (m5Var2 != null) {
                ArrayList arrayList3 = m5Var2.h.D;
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
                    TL_stories.StoryItem storyItem = this.Q0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f19394id == intValue) {
                        this.P0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                h9 h9Var = this.f15476w0;
                if (h9Var != null) {
                    this.f15464q1 = h9Var.currentPosition;
                    this.f15476w0.release(null);
                    this.f15476w0 = null;
                    return;
                }
                this.f15464q1 = 0L;
            } else if (!this.f15462p1 && t() != null) {
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
        ph.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
            this.f15478x0.s(this.B0.getSink());
        }
        if (this.f15431b) {
            AndroidUtilities.removeFromParent(this.f15468s);
        } else {
            this.f15456n.removeView(this.f15468s);
        }
        this.f15468s.invalidate();
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f15441f;
        if (p2Var != null && t() != null && AndroidUtilities.findActivity(p2Var.getContext()) != null && this.f15478x0 != null && this.A0 != null && !this.E0) {
            return true;
        }
        return false;
    }

    @Override
    public final qc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.S) * 0.5f) + 0.5f) * this.R, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f15468s;
    }

    @Override
    public final View h() {
        ph.k3 k3Var = new ph.k3(this.A0.getContext(), this.h);
        this.B0 = k3Var;
        return k3Var;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.H0;
    }

    @Override
    public final boolean isShown() {
        return !this.E0;
    }

    public final void l(boolean z4) {
        boolean z10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            if (this.f15450j0 && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.e != z10) {
                this.e = z10;
                SurfaceView surfaceView = this.f15481z0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z10);
                }
                ph.k3 k3Var = this.A0;
                if (k3Var != null) {
                    k3Var.setSecure(!z10);
                }
                if (this.f15431b) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f15441f;
                    if (p2Var.getParentActivity() != null) {
                        if (z10) {
                            p2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        p2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z10) {
                    this.f15465r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f15465r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f15456n.updateViewLayout(this.f15468s, this.f15465r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.E == null) {
            this.f15444g0 = false;
            this.f15448i0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.E.addListener(new r8(this, 1));
            this.E.setDuration(250L);
            this.E.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
            this.E.start();
        }
    }

    public final void n(boolean z4) {
        if (this.f15470s1 == null) {
            if (this.m0 != 0) {
                AndroidUtilities.hideKeyboard(this.f15475w);
                return;
            }
            float f10 = 0.0f;
            if (!this.Z && this.f15432b0 == 0.0f) {
                return;
            }
            this.G0.lock();
            if (!z4) {
                float f11 = this.f15432b0;
                m5 m5Var = this.f15475w;
                float f12 = m5Var.f15590c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f15432b0 = f13;
                    m5Var.setOffset(f13);
                }
            }
            float f14 = this.f15432b0;
            if (z4) {
                f10 = this.f15475w.f15590c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f15470s1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.f15470s1.addListener(new dg.w2(7, this, z4));
            if (z4) {
                this.f15470s1.setDuration(350L);
                this.f15470s1.setInterpolator(mr.h);
            } else {
                this.f15470s1.setDuration(350L);
                this.f15470s1.setInterpolator(mr.f27122f);
            }
            this.f15470s1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f15431b && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        d4 currentPeerView;
        boolean z4 = false;
        if (this.f15432b0 != 0.0f) {
            m5 m5Var = this.f15475w;
            if (m5Var.f15596x > 0) {
                AndroidUtilities.hideKeyboard(m5Var);
                return true;
            }
            d5 currentPage = m5Var.getCurrentPage();
            if (currentPage != null) {
                j4 j4Var = currentPage.f15250r;
                s4 s4Var = currentPage.f15248f;
                if (s4Var != null && s4Var.f29290b) {
                    s4Var.a();
                    return true;
                } else if (Math.abs(currentPage.f15247c.getTranslationY() - j4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    j4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    j4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        y8 y8Var = this.f15452k0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            z4 = currentPeerView.s0();
        }
        if (z4) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f15475w == null) {
            m5 m5Var = new m5(this.v.getContext(), this);
            this.f15475w = m5Var;
            this.v.addView(m5Var, 0);
        }
        d4 currentPeerView = this.f15452k0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.L0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.L0.f15560i.size(); i10++) {
                    arrayList.add(((MessageObject) this.L0.f15560i.get(i10)).storyItem);
                }
                this.f15475w.b(currentPeerView.getListPosition(), this.L0.d, arrayList);
                return;
            }
            this.f15475w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z4) {
        AndroidUtilities.hideKeyboard(this.f15468s);
        this.E0 = true;
        this.f15440e1 = true;
        P();
        M(false);
        Q();
        this.G0.lock();
        this.Y = this.T;
        this.B = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (!z4) {
            this.L = 0.0f;
            this.K = 0.0f;
            f9 f9Var = this.f15461p0;
            ImageReceiver imageReceiver = f9Var.f15313b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f15314c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f15314c = null;
            f9Var.f15313b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new k3(this, 2), 16L);
        if (this.Z0) {
            this.Z0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (A1) {
            O();
            return;
        }
        d4 currentPeerView = this.f15452k0.getCurrentPeerView();
        if (currentPeerView != null) {
            b4 b4Var = currentPeerView.L1;
            if (!b4Var.j() && b4Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f15430a1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f15473u0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.m0 != i10) {
            this.m0 = i10;
            this.f15452k0.setKeyboardHeight(i10);
            this.f15452k0.requestLayout();
            m5 m5Var = this.f15475w;
            if (m5Var != null) {
                m5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f15466r0 = dialog;
            dialog.setOnDismissListener(new eg.d0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f15466r0 = null;
            return false;
        }
    }

    public final d4 t() {
        y8 y8Var = this.f15452k0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.f15450j0) {
            AndroidUtilities.hideKeyboard(this.f15468s);
            this.E0 = true;
            this.H0 = false;
            this.R = 0.0f;
            this.S = 0.0f;
            P();
            this.L = 0.0f;
            this.K = 0.0f;
            f9 f9Var = this.f15461p0;
            ImageReceiver imageReceiver = f9Var.f15313b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f15314c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f15314c = null;
            f9Var.f15313b = null;
            x8 x8Var = this.v;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.G0.unlock();
            c4 c4Var = this.D0;
            if (c4Var != null) {
                c4Var.a();
            }
            I();
            if (this.f15431b) {
                AndroidUtilities.removeFromParent(this.f15468s);
            } else {
                this.f15456n.removeView(this.f15468s);
            }
            this.f15468s = null;
            this.f15450j0 = false;
            this.d = false;
            o();
            k3 k3Var = this.l1;
            if (k3Var != null) {
                k3Var.run();
                this.l1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (!this.U0 && !this.W0 && !this.V0 && !this.I0 && !this.f15457n0 && !this.f15477x && this.f15466r0 == null && this.f15469s0 == null && !this.E0 && !this.F0 && this.R == 1.0f && this.f15432b0 == 0.0f && !this.f15443f1) {
            if ((!this.f15449i1 || !this.f15428a) && !this.f15447h1 && !this.f15445g1 && !this.f15455m1 && this.S == 0.0f && this.f15467r1 == null) {
                if (!this.f15431b || (p2Var = this.f15441f) == null || p2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: nh.i9.y():void");
    }

    public final void z(boolean z4) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f15441f.getContext());
        if (findActivity != null) {
            if (z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            try {
                findActivity.setRequestedOrientation(i10);
            } catch (Exception unused) {
            }
            if (z4) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override
    public final void dismiss(boolean z4) {
        q(true);
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void setLastVisible(boolean z4) {
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }
}
