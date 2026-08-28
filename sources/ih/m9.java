package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public final class m9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, ze.a {
    public static boolean f11776t1;
    public static TL_stories.StoryItem f11778v1;
    public static boolean f11779w1;
    public static boolean f11782z1;
    public boolean A;
    public kh.d4 A0;
    public ValueAnimator B;
    public Uri B0;
    public ValueAnimator C;
    public h4 C0;
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
    public b7 I;
    public final ArrayList I0;
    public float J;
    public boolean J0;
    public float K;
    public n6 K0;
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
    public final n3 X0;
    public boolean Y;
    public boolean Y0;
    public float Z;
    public v7 Z0;
    public float f11784a0;
    public final LongSparseIntArray f11785a1;
    public boolean f11787b0;
    public boolean f11788b1;
    public boolean f11790c0;
    public boolean f11791c1;
    public boolean f11792d0;
    public boolean f11793d1;
    public GestureDetector f11795e0;
    public boolean f11796e1;
    public final org.telegram.ui.ActionBar.o2 f11797f;
    public boolean f11798f0;
    public boolean f11799f1;
    public boolean f11800g0;
    public boolean f11801g1;
    public int h;
    public boolean f11802h0;
    public boolean f11803h1;
    public boolean f11804i0;
    public boolean f11805i1;
    public c9 f11806j0;
    public g f11807j1;
    public n3 f11809k1;
    public int f11810l0;
    public boolean l1;
    public boolean m0;
    public float f11811m1;
    public WindowManager f11812n;
    public float f11813n0;
    public boolean f11814n1;
    public final j9 f11815o0;
    public boolean f11816o1;
    public i9 f11817p0;
    public long f11818p1;
    public Dialog f11819q0;
    public z6 f11820q1;
    public WindowManager.LayoutParams f11821r;
    public org.telegram.ui.ActionBar.k2 f11822r0;
    public ValueAnimator f11823r1;
    public a9 f11824s;
    public boolean f11825s0;
    public boolean f11826s1;
    public final ArrayList f11827t0;
    public c5.c f11828u0;
    public b9 v;
    public l9 f11829v0;
    public o5 f11830w;
    public f1 f11831w0;
    public boolean f11832x;
    public e9 f11833x0;
    public SurfaceView f11835y0;
    public kh.d4 f11836z0;
    public static final ArrayList f11777u1 = new ArrayList();
    public static float f11780x1 = 1.0f;
    public static boolean f11781y1 = true;
    public static final LongSparseArray A1 = new LongSparseArray();
    public boolean f11783a = SharedConfig.useSurfaceInStories;
    public boolean f11786b = true;
    public boolean f11789c = false;
    public boolean d = false;
    public boolean f11794e = true;
    public final b f11834y = new b();
    public final RectF P = new RectF();
    public final float[] f11808k0 = new float[2];

    public m9(org.telegram.ui.ActionBar.o2 o2Var) {
        ?? obj = new Object();
        obj.f11650k = 1.0f;
        this.f11815o0 = obj;
        this.f11827t0 = new ArrayList();
        this.D0 = true;
        this.F0 = new AnimationNotificationsLocker();
        this.I0 = new ArrayList();
        this.V0 = false;
        this.X0 = new n3(this, 4);
        this.f11785a1 = new LongSparseIntArray();
        new Paint(1);
        this.f11797f = o2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            A1.put(j10 + (j10 >> 16) + (storyItem.f22617id << 16), editable);
        }
    }

    public static boolean i(m9 m9Var, a9 a9Var, float f10, float f11, boolean z10) {
        p2 p2Var;
        p2 p2Var2;
        if (a9Var != null) {
            if (!m9Var.T0) {
                if (m9Var.f11830w == null || m9Var.f11784a0 == 0.0f) {
                    i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f10 - m9Var.v.getX()) - m9Var.f11806j0.getX()) - currentPeerView.getX(), ((f11 - m9Var.v.getY()) - m9Var.f11806j0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f11581r2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (p2Var2 = currentPeerView.X1) != null && p2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.X1.getY() + currentPeerView.getY() + m9Var.f11806j0.getY() + m9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (p2Var = currentPeerView.X1) != null && p2Var.v0()) || m9Var.f11820q1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(a9Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(m9 m9Var) {
        bg.t tVar;
        mt editField;
        i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.X1 != null && (((tVar = currentPeerView.X2) == null || tVar.getVisibility() != 0) && (editField = currentPeerView.X1.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new n3(m9Var, 6), 200L);
            return;
        }
        m9Var.m();
    }

    public static void k(m9 m9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(m9Var.T, m9Var.S) / AndroidUtilities.dp(80.0f)));
        if (m9Var.R != clamp01) {
            m9Var.R = clamp01;
            m9Var.o();
            i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f11589t2) {
                currentPeerView.invalidate();
            }
            f1 f1Var = m9Var.f11831w0;
            if (f1Var != null) {
                f1Var.v((1.0f - m9Var.R) * m9Var.Q);
            }
        }
        a9 a9Var = m9Var.f11824s;
        if (a9Var != null) {
            a9Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) A1.get(j10 + (j10 >> 16) + (storyItem.f22617id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f11778v1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || f11779w1 || f11778v1.messageId != messageObject.getId() || f11778v1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i9, Context context, TL_stories.StoryItem storyItem, i9 i9Var) {
        if (storyItem != null) {
            this.h = i9;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i9).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i9, context, storyItem, arrayList, 0, null, null, i9Var, false);
            }
        }
    }

    public final void B(int i9, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, n6 n6Var, TL_stories.PeerStories peerStories, i9 i9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f11827t0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (this.f11804i0) {
            arrayList2.clear();
            return;
        }
        f11780x1 = 1.0f;
        l9 l9Var = this.f11829v0;
        if (l9Var != null) {
            l9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f11814n1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11786b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11783a = z12;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.Q0 = i11;
        if (storyItem != null && n6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.J0 = z13;
        this.O0 = false;
        if (storyItem != null) {
            this.P0 = storyItem;
            f11778v1 = storyItem;
        }
        this.K0 = n6Var;
        this.M0 = peerStories;
        this.f11817p0 = i9Var;
        this.N0 = z10;
        this.h = i9;
        this.S = 0.0f;
        this.T = 0.0f;
        c9 c9Var = this.f11806j0;
        if (c9Var != null) {
            c9Var.setHorizontalProgressToDismiss(0.0f);
            this.f11806j0.B0 = 0;
        }
        this.Z = 0.0f;
        this.V = 0.0f;
        this.f11802h0 = false;
        this.R = 0.0f;
        this.f11804i0 = true;
        this.W0 = false;
        this.V0 = false;
        this.f11785a1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.X0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11821r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f11821r.flags = -2147417728;
        this.D0 = false;
        this.Y0 = false;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (this.f11824s == null) {
            this.f11795e0 = new GestureDetector(new w8(this));
            this.f11824s = new a9(this, context, R);
        }
        if (this.v == null) {
            this.v = new b9(context, this);
            c9 c9Var2 = new c9(this, this.h, context, this, this.f11834y);
            this.f11806j0 = c9Var2;
            c9Var2.setDelegate(new d9(this, n6Var, arrayList, context));
            this.v.addView(this.f11806j0, g7.e6.e(-1, -1, 1));
            this.f11828u0 = new c5.c(context);
            if (this.f11783a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.f11835y0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.f11835y0.setZOrderOnTop(false);
                this.f11828u0.addView(this.f11835y0);
            } else {
                e9 e9Var = new e9(context, this);
                this.f11833x0 = e9Var;
                this.f11828u0.addView(e9Var);
            }
            kh.d4 d4Var = new kh.d4(context, this.h);
            this.f11836z0 = d4Var;
            d4Var.setVisibility(8);
            this.f11828u0.addView(this.f11836z0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f12259a = paint;
            view.f12261c = new androidx.activity.i((Object) view, 26);
            view.d = new org.telegram.ui.Components.y5((View) view);
            view.f12262e = new org.telegram.ui.Components.y5((View) view);
            paint.setColor(-1);
            this.Z0 = view;
            this.v.addView((View) view, g7.e6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        kh.d4 d4Var2 = this.f11836z0;
        if (d4Var2 != null) {
            d4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f11828u0);
        this.f11824s.addView(this.f11828u0);
        SurfaceView surfaceView2 = this.f11835y0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f11824s.addView(this.v);
        this.f11824s.setClipChildren(false);
        if (this.J0) {
            Q();
        }
        if (n6Var != null) {
            this.f11806j0.D(this.h, n6Var.d, n6Var.h());
        } else {
            c9 c9Var3 = this.f11806j0;
            int i12 = this.h;
            c9Var3.f12206w0 = arrayList;
            c9Var3.f12204u0 = i12;
            c9Var3.setAdapter(null);
            c9Var3.setAdapter(c9Var3.f12205v0);
            c9Var3.setCurrentItem(i10);
            c9Var3.f12208y0 = true;
        }
        this.f11812n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f11786b = false;
        }
        if (this.f11786b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f11789c = z14;
        b9 b9Var = this.v;
        gh.i3 i3Var = new gh.i3(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(b9Var, i3Var);
        if (this.f11786b) {
            AndroidUtilities.removeFromParent(this.f11824s);
            this.f11824s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f11824s);
            if (!this.f11789c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f11824s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f11812n, this.f11824s, this.f11821r);
            this.f11812n.addView(this.f11824s, this.f11821r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f11824s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 2));
            }
        }
        this.f11824s.requestLayout();
        f11779w1 = true;
        Q();
        this.Q = 0.0f;
        o();
        f11776t1 = true;
        if (f11781y1) {
            f11781y1 = false;
            if (((AudioManager) this.f11824s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            f11782z1 = z15;
        }
        if (this.f11786b) {
            z(true);
        }
        if (!this.f11786b) {
            f11777u1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i9, n6 n6Var, e7 e7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(n6Var.d));
        this.L0 = i9;
        G(context, null, arrayList, 0, n6Var, null, e7Var, false);
    }

    public final void D(Context context, long j10, i9 i9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        v6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i9 = storiesController.f12236a;
        TL_stories.PeerStories y10 = storiesController.y(j10);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (p7.w(i9, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f12241g.remove(y10);
                storiesController.h.remove(y10);
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, i9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, i9 i9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, i9Var, false);
            return;
        }
        this.f11827t0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, e7 e7Var) {
        A(UserConfig.selectedAccount, context, storyItem, e7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i9, n6 n6Var, TL_stories.PeerStories peerStories, i9 i9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i9, n6Var, peerStories, i9Var, z10);
    }

    public final void H(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f11786b) {
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
        l9 l9Var = this.f11829v0;
        if (l9Var != null) {
            l9Var.release(null);
            this.f11829v0 = null;
        }
        kh.d4 d4Var = this.f11836z0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        f1 f1Var = this.f11831w0;
        if (f1Var != null) {
            k1 k1Var = k1.V;
            if (!k1Var.O || k1Var.v != f1Var) {
                if (f1Var.f11403n) {
                    f1Var.s(null);
                } else {
                    f1Var.e();
                }
            }
        }
        this.f11831w0 = null;
        int i9 = 0;
        while (true) {
            arrayList = this.I0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((l9) arrayList.get(i9)).release(null);
            i9++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f12246m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((v9) hVar.n(i10)).b(false);
        }
        if (this.f11786b) {
            z(false);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f11797f;
        if (o2Var != null) {
            o2Var.removeSheet(this);
        }
        f11777u1.remove(this);
        this.f11827t0.clear();
        this.f11784a0 = 0.0f;
        f11778v1 = null;
    }

    public final void K(boolean z10) {
        this.m0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.Z0.f12261c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        i4 currentPeerView;
        i4 currentPeerView2;
        g4 g4Var;
        l9 l9Var;
        h4 h4Var;
        if (this.W0 != z10) {
            this.W0 = z10;
            if (z10 && !this.f11788b1 && (currentPeerView2 = this.f11806j0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.K1) != null && !g4Var.f11470f && g4Var.f11467b == null) {
                if (!this.f11800g0 && !this.f11798f0 && (h4Var = this.C0) != null && h4Var.f11501b != null) {
                    currentPeerView2.Y0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                h4 h4Var2 = this.C0;
                if (h4Var2 != null && (l9Var = h4Var2.f11501b) != null && !this.f11800g0) {
                    l9Var.setSeeking(true);
                }
                this.f11800g0 = true;
            }
            P();
            c9 c9Var = this.f11806j0;
            if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.W0);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (this.f11786b && launchActivity != null) {
            if (z10) {
                this.f11825s0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f11825s0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.f11831w0 != null && (o2Var = this.f11797f) != null && this.f11836z0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(o2Var.getContext());
            if (af.d.a(findActivity) > 0) {
                k1.o(findActivity, this.f11831w0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = f11782z1;
        f11782z1 = !z10;
        l9 l9Var = this.f11829v0;
        int i9 = 0;
        if (l9Var != null) {
            l9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.I0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((l9) arrayList.get(i9)).setAudioEnabled(!f11782z1, true);
            i9++;
        }
        i4 currentPeerView = this.f11806j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f11588t1.a(f11782z1, true);
        }
        if (!f11782z1) {
            this.Z0.b();
        }
    }

    public final void P() {
        if (this.f11806j0 == null) {
            return;
        }
        boolean w8 = w();
        boolean z10 = true;
        if (this.f11786b) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f11797f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w8 = true;
            }
        }
        if (org.telegram.ui.l4.x().R) {
            w8 = true;
        }
        this.f11806j0.setPaused(w8);
        l9 l9Var = this.f11829v0;
        if (l9Var != null) {
            if (w8) {
                l9Var.pause();
            } else {
                l9Var.play(f11780x1);
            }
        }
        this.f11806j0.f12209z0 = (this.f11832x || this.D0 || this.E0 || this.W0 || this.f11788b1 || this.f11784a0 != 0.0f || this.f11799f1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: ih.m9.Q():void");
    }

    @Override
    public final Bitmap a() {
        kh.d4 d4Var = this.A0;
        if (d4Var != null && d4Var.a()) {
            return this.A0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f11786b && this.f11824s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Bitmap c() {
        kh.d4 d4Var = this.f11836z0;
        if (d4Var != null && d4Var.a()) {
            return this.f11836z0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i9 == NotificationCenter.storiesListUpdated) {
            if (this.K0 == ((n6) objArr[0])) {
                t();
                c9 c9Var = this.f11806j0;
                n6 n6Var = this.K0;
                c9Var.D(this.h, n6Var.d, n6Var.h());
                o5 o5Var = this.f11830w;
                if (o5Var != null) {
                    TL_stories.StoryItem selectedStory = o5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.K0.f11851i.size()) {
                        if (selectedStory != null && selectedStory.f22617id == ((MessageObject) this.K0.f11851i.get(i11)).storyItem.f22617id) {
                            i12 = i11;
                        }
                        arrayList2.add(((MessageObject) this.K0.f11851i.get(i11)).storyItem);
                        i11++;
                    }
                    this.f11830w.b(i12, this.K0.d, arrayList2);
                }
            }
        } else if (i9 == NotificationCenter.storiesUpdated) {
            i9 i9Var = this.f11817p0;
            if (i9Var instanceof e7) {
                e7 e7Var = (e7) i9Var;
                if (e7Var.f11373r && !e7Var.f11372n) {
                    v6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (e7Var.f11371f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f12241g;
                    }
                    ArrayList<Long> dialogIds = this.f11806j0.getDialogIds();
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!e7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f11806j0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            o5 o5Var2 = this.f11830w;
            if (o5Var2 != null) {
                ArrayList arrayList3 = o5Var2.h.C;
                while (i11 < arrayList3.size()) {
                    ((l4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = NotificationCenter.openArticle;
            if (i9 != i14 && i9 != NotificationCenter.articleClosed) {
                if (i9 == NotificationCenter.storyDeleted) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.P0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f22617id == intValue) {
                        this.O0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i9 == i14) {
                l9 l9Var = this.f11829v0;
                if (l9Var != null) {
                    this.f11818p1 = l9Var.currentPosition;
                    this.f11829v0.release(null);
                    this.f11829v0 = null;
                    return;
                }
                this.f11818p1 = 0L;
            } else if (!this.f11816o1 && t() != null) {
                t().f1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final void e(af.f fVar) {
        kh.d4 d4Var = this.A0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(fVar);
        }
        if (this.f11786b) {
            AndroidUtilities.removeFromParent(this.f11824s);
            this.f11797f.getLayoutContainer().addView(this.f11824s);
        } else {
            this.f11812n.addView(this.f11824s, this.f11821r);
        }
        kh.d4 d4Var2 = this.A0;
        if (d4Var2 != null) {
            d4Var2.b();
            this.A0 = null;
        }
        this.f11824s.invalidate();
        this.f11831w0.s(this.f11836z0.getSink());
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f11797f;
        if (o2Var != null && t() != null && AndroidUtilities.findActivity(o2Var.getContext()) != null && this.f11831w0 != null && this.f11836z0 != null && !this.D0) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(af.f fVar) {
        kh.d4 d4Var = this.A0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(fVar);
            this.f11831w0.s(this.A0.getSink());
        }
        if (this.f11786b) {
            AndroidUtilities.removeFromParent(this.f11824s);
        } else {
            this.f11812n.removeView(this.f11824s);
        }
        this.f11824s.invalidate();
    }

    @Override
    public final oc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i9) {
        return i0.a.d((((1.0f - this.R) * 0.5f) + 0.5f) * this.Q, i9, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f11824s;
    }

    @Override
    public final View h() {
        kh.d4 d4Var = new kh.d4(this.f11836z0.getContext(), this.h);
        this.A0 = d4Var;
        return d4Var;
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
            if (this.f11804i0 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.f11794e != z11) {
                this.f11794e = z11;
                SurfaceView surfaceView = this.f11835y0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                kh.d4 d4Var = this.f11836z0;
                if (d4Var != null) {
                    d4Var.setSecure(!z11);
                }
                if (this.f11786b) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f11797f;
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
                    this.f11821r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f11821r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f11812n.updateViewLayout(this.f11824s, this.f11821r);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void m() {
        if (this.D == null) {
            this.f11798f0 = false;
            this.f11802h0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new u8(this, 2));
            this.D.addListener(new v8(this, 1));
            this.D.setDuration(250L);
            this.D.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
            this.D.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f11823r1 == null) {
            if (this.f11810l0 != 0) {
                AndroidUtilities.hideKeyboard(this.f11830w);
                return;
            }
            float f10 = 0.0f;
            if (!this.Y && this.f11784a0 == 0.0f) {
                return;
            }
            this.F0.lock();
            if (!z10) {
                float f11 = this.f11784a0;
                o5 o5Var = this.f11830w;
                float f12 = o5Var.f11892c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f11784a0 = f13;
                    o5Var.setOffset(f13);
                }
            }
            float f14 = this.f11784a0;
            if (z10) {
                f10 = this.f11830w.f11892c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f11823r1 = ofFloat;
            ofFloat.addUpdateListener(new u8(this, 3));
            this.f11823r1.addListener(new hg.b0(4, this, z10));
            if (z10) {
                this.f11823r1.setDuration(350L);
                this.f11823r1.setInterpolator(gr.h);
            } else {
                this.f11823r1.setDuration(350L);
                this.f11823r1.setInterpolator(gr.f28844f);
            }
            this.f11823r1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f11786b && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        i4 currentPeerView;
        boolean z10 = false;
        if (this.f11784a0 != 0.0f) {
            o5 o5Var = this.f11830w;
            if (o5Var.f11899x > 0) {
                AndroidUtilities.hideKeyboard(o5Var);
                return true;
            }
            g5 currentPage = o5Var.getCurrentPage();
            if (currentPage != null) {
                n4 n4Var = currentPage.f11481r;
                v4 v4Var = currentPage.f11479f;
                if (v4Var != null && v4Var.f31171b) {
                    v4Var.a();
                    return true;
                } else if (Math.abs(currentPage.f11477c.getTranslationY() - n4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    n4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    n4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        c9 c9Var = this.f11806j0;
        if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f11830w == null) {
            o5 o5Var = new o5(this.v.getContext(), this);
            this.f11830w = o5Var;
            this.v.addView(o5Var, 0);
        }
        i4 currentPeerView = this.f11806j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.K0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < this.K0.f11851i.size(); i9++) {
                    arrayList.add(((MessageObject) this.K0.f11851i.get(i9)).storyItem);
                }
                this.f11830w.b(currentPeerView.getListPosition(), this.K0.d, arrayList);
                return;
            }
            this.f11830w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f11824s);
        this.D0 = true;
        this.f11793d1 = true;
        P();
        M(false);
        Q();
        this.F0.lock();
        this.X = this.S;
        this.A = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new u8(this, 0));
        if (!z10) {
            this.K = 0.0f;
            this.J = 0.0f;
            j9 j9Var = this.f11815o0;
            ImageReceiver imageReceiver = j9Var.f11643b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = j9Var.f11644c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            j9Var.f11644c = null;
            j9Var.f11643b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new n3(this, 2), 16L);
        if (this.Y0) {
            this.Y0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (f11782z1) {
            O();
            return;
        }
        i4 currentPeerView = this.f11806j0.getCurrentPeerView();
        if (currentPeerView != null) {
            g4 g4Var = currentPeerView.K1;
            if (!g4Var.j() && g4Var.f11469e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.Z0.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f11827t0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i9) {
        if (this.f11810l0 != i9) {
            this.f11810l0 = i9;
            this.f11806j0.setKeyboardHeight(i9);
            this.f11806j0.requestLayout();
            o5 o5Var = this.f11830w;
            if (o5Var != null) {
                o5Var.setKeyboardHeight(i9);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f11819q0 = dialog;
            dialog.setOnDismissListener(new eh.l(this, 5));
            dialog.show();
            P();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            this.f11819q0 = null;
            return false;
        }
    }

    public final i4 t() {
        c9 c9Var = this.f11806j0;
        if (c9Var == null) {
            return null;
        }
        return c9Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.f11804i0) {
            AndroidUtilities.hideKeyboard(this.f11824s);
            this.D0 = true;
            this.G0 = false;
            this.Q = 0.0f;
            this.R = 0.0f;
            P();
            this.K = 0.0f;
            this.J = 0.0f;
            j9 j9Var = this.f11815o0;
            ImageReceiver imageReceiver = j9Var.f11643b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = j9Var.f11644c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            j9Var.f11644c = null;
            j9Var.f11643b = null;
            b9 b9Var = this.v;
            if (b9Var != null) {
                b9Var.a(true);
            }
            this.F0.unlock();
            h4 h4Var = this.C0;
            if (h4Var != null) {
                h4Var.a();
            }
            I();
            if (this.f11786b) {
                AndroidUtilities.removeFromParent(this.f11824s);
            } else {
                this.f11812n.removeView(this.f11824s);
            }
            this.f11824s = null;
            this.f11804i0 = false;
            this.d = false;
            o();
            n3 n3Var = this.f11809k1;
            if (n3Var != null) {
                n3Var.run();
                this.f11809k1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (!this.T0 && !this.V0 && !this.U0 && !this.H0 && !this.m0 && !this.f11832x && this.f11819q0 == null && this.f11822r0 == null && !this.D0 && !this.E0 && this.Q == 1.0f && this.f11784a0 == 0.0f && !this.f11796e1) {
            if ((!this.f11803h1 || !this.f11783a) && !this.f11801g1 && !this.f11799f1 && !this.l1 && this.R == 0.0f && this.f11820q1 == null) {
                if (!this.f11786b || (o2Var = this.f11797f) == null || o2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: ih.m9.y():void");
    }

    public final void z(boolean z10) {
        int i9;
        Activity findActivity = AndroidUtilities.findActivity(this.f11797f.getContext());
        if (findActivity != null) {
            if (z10) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            try {
                findActivity.setRequestedOrientation(i9);
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
    public final void b(Canvas canvas) {
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }
}
