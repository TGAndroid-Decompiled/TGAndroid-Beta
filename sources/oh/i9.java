package oh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.l2, ef.a {
    public static boolean A1;
    public static boolean f17246u1;
    public static TL_stories.StoryItem f17248w1;
    public static boolean f17249x1;
    public qh.k3 A0;
    public boolean B;
    public qh.k3 B0;
    public ValueAnimator C;
    public Uri C0;
    public ValueAnimator D;
    public e4 D0;
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
    public final l3 Y0;
    public boolean Z;
    public boolean Z0;
    public float f17253a0;
    public s7 f17254a1;
    public float f17256b0;
    public final LongSparseIntArray f17257b1;
    public boolean f17259c0;
    public boolean f17260c1;
    public boolean f17261d0;
    public boolean f17262d1;
    public boolean f17264e0;
    public boolean f17265e1;
    public final org.telegram.ui.ActionBar.p2 f17266f;
    public GestureDetector f17267f0;
    public boolean f17268f1;
    public boolean f17269g0;
    public boolean f17270g1;
    public int h;
    public boolean f17271h0;
    public boolean f17272h1;
    public boolean f17273i0;
    public boolean f17274i1;
    public boolean f17275j0;
    public boolean f17276j1;
    public y8 f17277k0;
    public t3 f17278k1;
    public l3 l1;
    public int m0;
    public boolean f17280m1;
    public WindowManager f17281n;
    public boolean f17282n0;
    public float f17283n1;
    public float f17284o0;
    public boolean f17285o1;
    public final f9 f17286p0;
    public boolean f17287p1;
    public e9 f17288q0;
    public long f17289q1;
    public WindowManager.LayoutParams f17290r;
    public Dialog f17291r0;
    public x6 f17292r1;
    public w8 f17293s;
    public org.telegram.ui.ActionBar.l2 f17294s0;
    public ValueAnimator f17295s1;
    public boolean f17296t0;
    public boolean f17297t1;
    public final ArrayList f17298u0;
    public x8 v;
    public org.telegram.ui.o4 f17299v0;
    public n5 f17300w;
    public h9 f17301w0;
    public boolean f17302x;
    public e1 f17303x0;
    public a9 f17305y0;
    public SurfaceView f17306z0;
    public static final ArrayList f17247v1 = new ArrayList();
    public static float f17250y1 = 1.0f;
    public static boolean f17251z1 = true;
    public static final LongSparseArray B1 = new LongSparseArray();
    public boolean f17252a = SharedConfig.useSurfaceInStories;
    public boolean f17255b = true;
    public boolean f17258c = false;
    public boolean d = false;
    public boolean f17263e = true;
    public final b f17304y = new b();
    public final RectF Q = new RectF();
    public final float[] f17279l0 = new float[2];

    public i9(org.telegram.ui.ActionBar.p2 p2Var) {
        ?? obj = new Object();
        obj.f17152k = 1.0f;
        this.f17286p0 = obj;
        this.f17298u0 = new ArrayList();
        this.E0 = true;
        this.G0 = new AnimationNotificationsLocker();
        this.J0 = new ArrayList();
        this.W0 = false;
        this.Y0 = new l3(this, 4);
        this.f17257b1 = new LongSparseIntArray();
        new Paint(1);
        this.f17266f = p2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            B1.put(j10 + (j10 >> 16) + (storyItem.f21080id << 16), editable);
        }
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f10, float f11, boolean z4) {
        p2 p2Var;
        p2 p2Var2;
        if (w8Var != null) {
            if (!i9Var.U0) {
                if (i9Var.f17300w == null || i9Var.f17256b0 == 0.0f) {
                    f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f10 - i9Var.v.getX()) - i9Var.f17277k0.getX()) - currentPeerView.getX(), ((f11 - i9Var.v.getY()) - i9Var.f17277k0.getY()) - currentPeerView.getY(), z4)) {
                            if (currentPeerView.f17105s2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z4) {
                        return false;
                    }
                    if (currentPeerView != null && (p2Var2 = currentPeerView.Y1) != null && p2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.Y1.getY() + currentPeerView.getY() + i9Var.f17277k0.getY() + i9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (p2Var = currentPeerView.Y1) != null && p2Var.w0()) || i9Var.f17292r1 != null) {
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
        hg.q qVar;
        xt editField;
        f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.Y1 != null && (((qVar = currentPeerView.Y2) == null || qVar.getVisibility() != 0) && (editField = currentPeerView.Y1.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new l3(i9Var, 6), 200L);
            return;
        }
        i9Var.m();
    }

    public static void k(i9 i9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.U, i9Var.T) / AndroidUtilities.dp(80.0f)));
        if (i9Var.S != clamp01) {
            i9Var.S = clamp01;
            i9Var.o();
            f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f17113u2) {
                currentPeerView.invalidate();
            }
            e1 e1Var = i9Var.f17303x0;
            if (e1Var != null) {
                e1Var.v((1.0f - i9Var.S) * i9Var.R);
            }
        }
        w8 w8Var = i9Var.f17293s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) B1.get(j10 + (j10 >> 16) + (storyItem.f21080id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f17248w1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || f17249x1 || f17248w1.messageId != messageObject.getId() || f17248w1.messageType == 3)) {
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
        ArrayList arrayList2 = this.f17298u0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (this.f17275j0) {
            arrayList2.clear();
            return;
        }
        f17250y1 = 1.0f;
        h9 h9Var = this.f17301w0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z14 = false;
        if (!AndroidUtilities.isTablet() && !this.f17285o1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17255b = z10;
        if (SharedConfig.useSurfaceInStories && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f17252a = z11;
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
            f17248w1 = storyItem;
        }
        this.L0 = l6Var;
        this.N0 = peerStories;
        this.f17288q0 = e9Var;
        this.O0 = z4;
        this.h = i10;
        this.T = 0.0f;
        this.U = 0.0f;
        y8 y8Var = this.f17277k0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.f17277k0.C0 = 0;
        }
        this.f17253a0 = 0.0f;
        this.W = 0.0f;
        this.f17273i0 = false;
        this.S = 0.0f;
        this.f17275j0 = true;
        this.X0 = false;
        this.W0 = false;
        this.f17257b1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.Y0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f17290r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f17290r.flags = -2147417728;
        this.E0 = false;
        this.Z0 = false;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (this.f17293s == null) {
            this.f17267f0 = new GestureDetector(new s8(this));
            this.f17293s = new w8(this, context, R);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.f17304y);
            this.f17277k0 = y8Var2;
            y8Var2.setDelegate(new z8(this, l6Var, arrayList, context));
            this.v.addView(this.f17277k0, k7.c6.e(-1, -1, 1));
            this.f17299v0 = new org.telegram.ui.o4(context);
            if (this.f17252a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.f17306z0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.f17306z0.setZOrderOnTop(false);
                this.f17299v0.addView(this.f17306z0);
            } else {
                a9 a9Var = new a9(context, this);
                this.f17305y0 = a9Var;
                this.f17299v0.addView(a9Var);
            }
            qh.k3 k3Var = new qh.k3(context, this.h);
            this.A0 = k3Var;
            k3Var.setVisibility(8);
            this.f17299v0.addView(this.A0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f17746a = paint;
            view.f17748c = new m2.b((Object) view, 5);
            view.d = new org.telegram.ui.Components.z5((View) view);
            view.f17749e = new org.telegram.ui.Components.z5((View) view);
            paint.setColor(-1);
            this.f17254a1 = view;
            this.v.addView((View) view, k7.c6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        qh.k3 k3Var2 = this.A0;
        if (k3Var2 != null) {
            k3Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f17299v0);
        this.f17293s.addView(this.f17299v0);
        SurfaceView surfaceView2 = this.f17306z0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f17293s.addView(this.v);
        this.f17293s.setClipChildren(false);
        if (this.K0) {
            Q();
        }
        if (l6Var != null) {
            this.f17277k0.D(this.h, l6Var.d, l6Var.h());
        } else {
            y8 y8Var3 = this.f17277k0;
            int i13 = this.h;
            y8Var3.f17697x0 = arrayList;
            y8Var3.f17695v0 = i13;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.f17696w0);
            y8Var3.setCurrentItem(i11);
            y8Var3.f17699z0 = true;
        }
        this.f17281n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f17255b = false;
        }
        if (this.f17255b && R != null && R.isSupportEdgeToEdge()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f17258c = z13;
        x8 x8Var = this.v;
        mh.m5 m5Var = new mh.m5(this, 14);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(x8Var, m5Var);
        if (this.f17255b) {
            AndroidUtilities.removeFromParent(this.f17293s);
            this.f17293s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f17293s);
            if (!this.f17258c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f17293s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f17281n, this.f17293s, this.f17290r);
            this.f17281n.addView(this.f17293s, this.f17290r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f17293s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
            }
        }
        this.f17293s.requestLayout();
        f17249x1 = true;
        Q();
        this.R = 0.0f;
        o();
        f17246u1 = true;
        if (f17251z1) {
            f17251z1 = false;
            if (((AudioManager) this.f17293s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z14 = true;
            }
            A1 = z14;
        }
        if (this.f17255b) {
            z(true);
        }
        if (!this.f17255b) {
            f17247v1.add(this);
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
        int i10 = storiesController.f17770a;
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
                storiesController.f17775g.remove(y10);
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
        this.f17298u0.clear();
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
        if (this.f17255b) {
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
        h9 h9Var = this.f17301w0;
        if (h9Var != null) {
            h9Var.release(null);
            this.f17301w0 = null;
        }
        qh.k3 k3Var = this.A0;
        if (k3Var != null) {
            k3Var.d(0L, null);
        }
        e1 e1Var = this.f17303x0;
        if (e1Var != null) {
            j1 j1Var = j1.W;
            if (!j1Var.P || j1Var.v != e1Var) {
                if (e1Var.f17007n) {
                    e1Var.s(null);
                } else {
                    e1Var.e();
                }
            }
        }
        this.f17303x0 = null;
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
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f17780m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((r9) hVar.n(i11)).b(false);
        }
        if (this.f17255b) {
            z(false);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f17266f;
        if (p2Var != null) {
            p2Var.removeSheet(this);
        }
        f17247v1.remove(this);
        this.f17298u0.clear();
        this.f17256b0 = 0.0f;
        f17248w1 = null;
    }

    public final void K(boolean z4) {
        this.f17282n0 = z4;
        if (z4) {
            m2.b bVar = this.f17254a1.f17748c;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
        P();
    }

    public final void L(boolean z4) {
        f4 currentPeerView;
        f4 currentPeerView2;
        d4 d4Var;
        h9 h9Var;
        e4 e4Var;
        if (this.X0 != z4) {
            this.X0 = z4;
            if (z4 && !this.f17260c1 && (currentPeerView2 = this.f17277k0.getCurrentPeerView()) != null && (d4Var = currentPeerView2.L1) != null && !d4Var.f16965f && d4Var.f16962b == null) {
                if (!this.f17271h0 && !this.f17269g0 && (e4Var = this.D0) != null && e4Var.f17020b != null) {
                    currentPeerView2.Z0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                e4 e4Var2 = this.D0;
                if (e4Var2 != null && (h9Var = e4Var2.f17020b) != null && !this.f17271h0) {
                    h9Var.setSeeking(true);
                }
                this.f17271h0 = true;
            }
            P();
            y8 y8Var = this.f17277k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.X0);
            }
        }
    }

    public final void M(boolean z4) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (this.f17255b && launchActivity != null) {
            if (z4) {
                this.f17296t0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f17296t0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z4);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.f17303x0 != null && (p2Var = this.f17266f) != null && this.A0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(p2Var.getContext());
            if (ff.d.a(findActivity) > 0) {
                j1.o(findActivity, this.f17303x0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z4 = A1;
        A1 = !z4;
        h9 h9Var = this.f17301w0;
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
        f4 currentPeerView = this.f17277k0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f17112u1.a(A1, true);
        }
        if (!A1) {
            this.f17254a1.b();
        }
    }

    public final void P() {
        if (this.f17277k0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z4 = true;
        if (this.f17255b) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f17266f;
            if (p2Var.isPaused() || !p2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.l4.x().S) {
            w10 = true;
        }
        this.f17277k0.setPaused(w10);
        h9 h9Var = this.f17301w0;
        if (h9Var != null) {
            if (w10) {
                h9Var.pause();
            } else {
                h9Var.play(f17250y1);
            }
        }
        this.f17277k0.A0 = (this.f17302x || this.E0 || this.F0 || this.X0 || this.f17260c1 || this.f17256b0 != 0.0f || this.f17270g1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: oh.i9.Q():void");
    }

    @Override
    public final void a(c2.p pVar) {
        qh.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f17255b) {
            AndroidUtilities.removeFromParent(this.f17293s);
            this.f17266f.getLayoutContainer().addView(this.f17293s);
        } else {
            this.f17281n.addView(this.f17293s, this.f17290r);
        }
        qh.k3 k3Var2 = this.B0;
        if (k3Var2 != null) {
            k3Var2.b();
            this.B0 = null;
        }
        this.f17293s.invalidate();
        this.f17303x0.s(this.A0.getSink());
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f17255b && this.f17293s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Bitmap b() {
        qh.k3 k3Var = this.B0;
        if (k3Var != null && k3Var.a()) {
            return this.B0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        qh.k3 k3Var = this.A0;
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
                y8 y8Var = this.f17277k0;
                l6 l6Var = this.L0;
                y8Var.D(this.h, l6Var.d, l6Var.h());
                n5 n5Var = this.f17300w;
                if (n5Var != null) {
                    TL_stories.StoryItem selectedStory = n5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.L0.f17402i.size()) {
                        if (selectedStory != null && selectedStory.f21080id == ((MessageObject) this.L0.f17402i.get(i12)).storyItem.f21080id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.L0.f17402i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f17300w.b(i13, this.L0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.f17288q0;
            if (e9Var instanceof c7) {
                c7 c7Var = (c7) e9Var;
                if (c7Var.f16947r && !c7Var.f16946n) {
                    t6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (c7Var.f16945f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f17775g;
                    }
                    ArrayList<Long> dialogIds = this.f17277k0.getDialogIds();
                    boolean z4 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!c7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z4 = true;
                        }
                    }
                    if (z4) {
                        this.f17277k0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            n5 n5Var2 = this.f17300w;
            if (n5Var2 != null) {
                ArrayList arrayList3 = n5Var2.h.D;
                while (i12 < arrayList3.size()) {
                    ((j4) arrayList3.get(i12)).b();
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f21080id == intValue) {
                        this.P0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                h9 h9Var = this.f17301w0;
                if (h9Var != null) {
                    this.f17289q1 = h9Var.currentPosition;
                    this.f17301w0.release(null);
                    this.f17301w0 = null;
                    return;
                }
                this.f17289q1 = 0L;
            } else if (!this.f17287p1 && t() != null) {
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
        qh.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
            this.f17303x0.s(this.B0.getSink());
        }
        if (this.f17255b) {
            AndroidUtilities.removeFromParent(this.f17293s);
        } else {
            this.f17281n.removeView(this.f17293s);
        }
        this.f17293s.invalidate();
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f17266f;
        if (p2Var != null && t() != null && AndroidUtilities.findActivity(p2Var.getContext()) != null && this.f17303x0 != null && this.A0 != null && !this.E0) {
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
        return this.f17293s;
    }

    @Override
    public final View h() {
        qh.k3 k3Var = new qh.k3(this.A0.getContext(), this.h);
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
            if (this.f17275j0 && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f17263e != z10) {
                this.f17263e = z10;
                SurfaceView surfaceView = this.f17306z0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z10);
                }
                qh.k3 k3Var = this.A0;
                if (k3Var != null) {
                    k3Var.setSecure(!z10);
                }
                if (this.f17255b) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f17266f;
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
                    this.f17290r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f17290r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f17281n.updateViewLayout(this.f17293s, this.f17290r);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public final void m() {
        if (this.E == null) {
            this.f17269g0 = false;
            this.f17273i0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.E.addListener(new r8(this, 1));
            this.E.setDuration(250L);
            this.E.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
            this.E.start();
        }
    }

    public final void n(boolean z4) {
        if (this.f17295s1 == null) {
            if (this.m0 != 0) {
                AndroidUtilities.hideKeyboard(this.f17300w);
                return;
            }
            float f10 = 0.0f;
            if (!this.Z && this.f17256b0 == 0.0f) {
                return;
            }
            this.G0.lock();
            if (!z4) {
                float f11 = this.f17256b0;
                n5 n5Var = this.f17300w;
                float f12 = n5Var.f17489c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f17256b0 = f13;
                    n5Var.setOffset(f13);
                }
            }
            float f14 = this.f17256b0;
            if (z4) {
                f10 = this.f17300w.f17489c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f17295s1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.f17295s1.addListener(new eg.u2(7, this, z4));
            if (z4) {
                this.f17295s1.setDuration(350L);
                this.f17295s1.setInterpolator(pr.h);
            } else {
                this.f17295s1.setDuration(350L);
                this.f17295s1.setInterpolator(pr.f30183f);
            }
            this.f17295s1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f17255b && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        f4 currentPeerView;
        boolean z4 = false;
        if (this.f17256b0 != 0.0f) {
            n5 n5Var = this.f17300w;
            if (n5Var.f17496x > 0) {
                AndroidUtilities.hideKeyboard(n5Var);
                return true;
            }
            e5 currentPage = n5Var.getCurrentPage();
            if (currentPage != null) {
                l4 l4Var = currentPage.f17031r;
                t4 t4Var = currentPage.f17029f;
                if (t4Var != null && t4Var.f33167b) {
                    t4Var.a();
                    return true;
                } else if (Math.abs(currentPage.f17027c.getTranslationY() - l4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    l4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    l4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        y8 y8Var = this.f17277k0;
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
        if (this.f17300w == null) {
            n5 n5Var = new n5(this.v.getContext(), this);
            this.f17300w = n5Var;
            this.v.addView(n5Var, 0);
        }
        f4 currentPeerView = this.f17277k0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.L0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.L0.f17402i.size(); i10++) {
                    arrayList.add(((MessageObject) this.L0.f17402i.get(i10)).storyItem);
                }
                this.f17300w.b(currentPeerView.getListPosition(), this.L0.d, arrayList);
                return;
            }
            this.f17300w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z4) {
        AndroidUtilities.hideKeyboard(this.f17293s);
        this.E0 = true;
        this.f17265e1 = true;
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
            f9 f9Var = this.f17286p0;
            ImageReceiver imageReceiver = f9Var.f17145b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f17146c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f17146c = null;
            f9Var.f17145b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new l3(this, 2), 16L);
        if (this.Z0) {
            this.Z0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (A1) {
            O();
            return;
        }
        f4 currentPeerView = this.f17277k0.getCurrentPeerView();
        if (currentPeerView != null) {
            d4 d4Var = currentPeerView.L1;
            if (!d4Var.j() && d4Var.f16964e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f17254a1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f17298u0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.m0 != i10) {
            this.m0 = i10;
            this.f17277k0.setKeyboardHeight(i10);
            this.f17277k0.requestLayout();
            n5 n5Var = this.f17300w;
            if (n5Var != null) {
                n5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f17291r0 = dialog;
            dialog.setOnDismissListener(new fg.d0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f17291r0 = null;
            return false;
        }
    }

    public final f4 t() {
        y8 y8Var = this.f17277k0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.f17275j0) {
            AndroidUtilities.hideKeyboard(this.f17293s);
            this.E0 = true;
            this.H0 = false;
            this.R = 0.0f;
            this.S = 0.0f;
            P();
            this.L = 0.0f;
            this.K = 0.0f;
            f9 f9Var = this.f17286p0;
            ImageReceiver imageReceiver = f9Var.f17145b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f17146c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f17146c = null;
            f9Var.f17145b = null;
            x8 x8Var = this.v;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.G0.unlock();
            e4 e4Var = this.D0;
            if (e4Var != null) {
                e4Var.a();
            }
            I();
            if (this.f17255b) {
                AndroidUtilities.removeFromParent(this.f17293s);
            } else {
                this.f17281n.removeView(this.f17293s);
            }
            this.f17293s = null;
            this.f17275j0 = false;
            this.d = false;
            o();
            l3 l3Var = this.l1;
            if (l3Var != null) {
                l3Var.run();
                this.l1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (!this.U0 && !this.W0 && !this.V0 && !this.I0 && !this.f17282n0 && !this.f17302x && this.f17291r0 == null && this.f17294s0 == null && !this.E0 && !this.F0 && this.R == 1.0f && this.f17256b0 == 0.0f && !this.f17268f1) {
            if ((!this.f17274i1 || !this.f17252a) && !this.f17272h1 && !this.f17270g1 && !this.f17280m1 && this.S == 0.0f && this.f17292r1 == null) {
                if (!this.f17255b || (p2Var = this.f17266f) == null || p2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: oh.i9.y():void");
    }

    public final void z(boolean z4) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f17266f.getContext());
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
