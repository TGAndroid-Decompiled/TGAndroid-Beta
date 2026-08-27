package jh;

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
import hh.y9;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, af.a {

    public static boolean f13457t1;

    public static TL_stories.StoryItem f13459v1;

    public static boolean f13460w1;

    public static boolean f13463z1;
    public boolean A;
    public lh.c4 A0;
    public ValueAnimator B;
    public Uri B0;
    public ValueAnimator C;
    public d4 C0;
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
    public j6 K0;
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
    public final l3 X0;
    public boolean Y;
    public boolean Y0;
    public float Z;
    public r7 Z0;

    public float f13465a0;

    public final LongSparseIntArray f13466a1;

    public boolean f13468b0;

    public boolean f13469b1;

    public boolean f13471c0;

    public boolean f13472c1;

    public boolean f13473d0;

    public boolean f13474d1;

    public GestureDetector f13476e0;

    public boolean f13477e1;

    public final org.telegram.ui.ActionBar.n2 f13478f;

    public boolean f13479f0;

    public boolean f13480f1;

    public boolean f13481g0;

    public boolean f13482g1;
    public int h;

    public boolean f13483h0;

    public boolean f13484h1;

    public boolean f13485i0;

    public boolean f13486i1;

    public y8 f13487j0;

    public y9 f13488j1;

    public l3 f13490k1;

    public int f13491l0;
    public boolean l1;
    public boolean m0;

    public float f13492m1;

    public WindowManager f13493n;

    public float f13494n0;

    public boolean f13495n1;

    public final f9 f13496o0;

    public boolean f13497o1;

    public e9 f13498p0;

    public long f13499p1;

    public Dialog f13500q0;

    public w6 f13501q1;

    public WindowManager.LayoutParams f13502r;

    public org.telegram.ui.ActionBar.j2 f13503r0;

    public ValueAnimator f13504r1;

    public w8 f13505s;

    public boolean f13506s0;

    public boolean f13507s1;

    public final ArrayList f13508t0;

    public c5.c f13509u0;
    public x8 v;

    public h9 f13510v0;

    public k5 f13511w;

    public d1 f13512w0;

    public boolean f13513x;

    public a9 f13514x0;

    public SurfaceView f13516y0;

    public lh.c4 f13517z0;

    public static final ArrayList f13458u1 = new ArrayList();

    public static float f13461x1 = 1.0f;

    public static boolean f13462y1 = true;
    public static final LongSparseArray A1 = new LongSparseArray();

    public boolean f13464a = SharedConfig.useSurfaceInStories;

    public boolean f13467b = true;

    public boolean f13470c = false;
    public boolean d = false;

    public boolean f13475e = true;

    public final b f13515y = new b();
    public final RectF P = new RectF();

    public final float[] f13489k0 = new float[2];

    public i9(org.telegram.ui.ActionBar.n2 n2Var) {
        f9 f9Var = new f9();
        f9Var.f13341k = 1.0f;
        this.f13496o0 = f9Var;
        this.f13508t0 = new ArrayList();
        this.D0 = true;
        this.F0 = new AnimationNotificationsLocker();
        this.I0 = new ArrayList();
        this.V0 = false;
        this.X0 = new l3(this, 4);
        this.f13466a1 = new LongSparseIntArray();
        new Paint(1);
        this.f13478f = n2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        A1.put(j10 + (j10 >> 16) + (((long) storyItem.f22617id) << 16), editable);
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f10, float f11, boolean z10) {
        o2 o2Var;
        o2 o2Var2;
        if (w8Var == null) {
            return false;
        }
        if (i9Var.T0) {
            return true;
        }
        if (i9Var.f13511w != null && i9Var.f13465a0 != 0.0f) {
            return true;
        }
        e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f10 - i9Var.v.getX()) - i9Var.f13487j0.getX()) - currentPeerView.getX(), ((f11 - i9Var.v.getY()) - i9Var.f13487j0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.f13268r2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (o2Var2 = currentPeerView.X1) != null && o2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.X1.getY() + currentPeerView.getY() + i9Var.f13487j0.getY() + i9Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (o2Var = currentPeerView.X1) == null || !o2Var.w0()) && i9Var.f13501q1 == null) {
            return AndroidUtilities.findClickableView(w8Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void j(i9 i9Var) {
        cg.q qVar;
        lt editField;
        e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.X1 == null || (((qVar = currentPeerView.X2) != null && qVar.getVisibility() == 0) || (editField = currentPeerView.X1.getEditField()) == null)) {
            i9Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new l3(i9Var, 6), 200L);
    }

    public static void k(i9 i9Var) {
        float fClamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.T, i9Var.S) / AndroidUtilities.dp(80.0f)));
        if (i9Var.R != fClamp01) {
            i9Var.R = fClamp01;
            i9Var.o();
            e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f13276t2) {
                currentPeerView.invalidate();
            }
            d1 d1Var = i9Var.f13512w0;
            if (d1Var != null) {
                d1Var.v((1.0f - i9Var.R) * i9Var.Q);
            }
        }
        w8 w8Var = i9Var.f13505s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) A1.get(j10 + (j10 >> 16) + (((long) storyItem.f22617id) << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return f13459v1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !f13460w1 && f13459v1.messageId == messageObject.getId() && f13459v1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, j6 j6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        boolean zIsContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f13508t0;
        if (!zIsContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (this.f13485i0) {
            arrayList2.clear();
            return;
        }
        f13461x1 = 1.0f;
        h9 h9Var = this.f13510v0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.f13495n1) ? false : true;
        this.f13467b = z11;
        this.f13464a = SharedConfig.useSurfaceInStories && z11;
        this.Q0 = storyItem == null ? 0 : storyItem.messageId;
        this.J0 = storyItem != null && j6Var == null && peerStories == null;
        this.O0 = false;
        if (storyItem != null) {
            this.P0 = storyItem;
            f13459v1 = storyItem;
        }
        this.K0 = j6Var;
        this.M0 = peerStories;
        this.f13498p0 = e9Var;
        this.N0 = z10;
        this.h = i10;
        this.S = 0.0f;
        this.T = 0.0f;
        y8 y8Var = this.f13487j0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.f13487j0.B0 = 0;
        }
        this.Z = 0.0f;
        this.V = 0.0f;
        this.f13483h0 = false;
        this.R = 0.0f;
        this.f13485i0 = true;
        this.W0 = false;
        this.V0 = false;
        this.f13466a1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.X0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f13502r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f13502r.flags = -2147417728;
        this.D0 = false;
        this.Y0 = false;
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (this.f13505s == null) {
            this.f13476e0 = new GestureDetector(new s8(this));
            this.f13505s = new w8(this, context, n2VarR);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.f13515y);
            this.f13487j0 = y8Var2;
            y8Var2.setDelegate(new z8(this, j6Var, arrayList, context));
            this.v.addView(this.f13487j0, h7.z5.e(-1, -1, 1));
            this.f13509u0 = new c5.c(context);
            if (this.f13464a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.f13516y0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.f13516y0.setZOrderOnTop(false);
                this.f13509u0.addView(this.f13516y0);
            } else {
                a9 a9Var = new a9(context, this);
                this.f13514x0 = a9Var;
                this.f13509u0.addView(a9Var);
            }
            lh.c4 c4Var = new lh.c4(context, this.h);
            this.f13517z0 = c4Var;
            c4Var.setVisibility(8);
            this.f13509u0.addView(this.f13517z0);
            r7 r7Var = new r7(context);
            Paint paint = new Paint(1);
            r7Var.f13916a = paint;
            r7Var.f13918c = new a8.b(r7Var, 26);
            r7Var.d = new org.telegram.ui.Components.y5(r7Var);
            r7Var.f13919e = new org.telegram.ui.Components.y5(r7Var);
            paint.setColor(-1);
            this.Z0 = r7Var;
            this.v.addView(r7Var, h7.z5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        lh.c4 c4Var2 = this.f13517z0;
        if (c4Var2 != null) {
            c4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f13509u0);
        this.f13505s.addView(this.f13509u0);
        SurfaceView surfaceView2 = this.f13516y0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f13505s.addView(this.v);
        this.f13505s.setClipChildren(false);
        if (this.J0) {
            Q();
        }
        if (j6Var != null) {
            this.f13487j0.D(this.h, j6Var.d, j6Var.h());
        } else {
            y8 y8Var3 = this.f13487j0;
            int i12 = this.h;
            y8Var3.f13867w0 = arrayList;
            y8Var3.f13865u0 = i12;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.f13866v0);
            y8Var3.setCurrentItem(i11);
            y8Var3.f13869y0 = true;
        }
        this.f13493n = (WindowManager) context.getSystemService("window");
        if (n2VarR == null || n2VarR.getLayoutContainer() == null || n2VarR.isSupportEdgeToEdge()) {
            this.f13467b = false;
        }
        this.f13470c = this.f13467b && n2VarR != null && n2VarR.isSupportEdgeToEdge();
        x8 x8Var = this.v;
        h3.x xVar = new h3.x(this, 27);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(x8Var, xVar);
        if (this.f13467b) {
            AndroidUtilities.removeFromParent(this.f13505s);
            this.f13505s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            n2VarR.getLayoutContainer().addView(this.f13505s);
            if (!this.f13470c) {
                AndroidUtilities.requestAdjustResize(n2VarR.getParentActivity(), n2VarR.getClassGuid());
            }
        } else {
            this.f13505s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f13493n, this.f13505s, this.f13502r);
            this.f13493n.addView(this.f13505s, this.f13502r);
            if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.f13505s.findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
            }
        }
        this.f13505s.requestLayout();
        f13460w1 = true;
        Q();
        this.Q = 0.0f;
        o();
        f13457t1 = true;
        if (f13462y1) {
            f13462y1 = false;
            f13463z1 = ((AudioManager) this.f13505s.getContext().getSystemService("audio")).getRingerMode() != 2;
        }
        if (this.f13467b) {
            z(true);
        }
        if (!this.f13467b) {
            f13458u1.add(this);
        }
        if (n2VarR != null) {
            AndroidUtilities.hideKeyboard(n2VarR.getFragmentView());
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, e9 e9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                A(i10, context, storyItem, arrayList, 0, null, null, e9Var, false);
            }
        }
    }

    public final void C(Context context, int i10, j6 j6Var, b7 b7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j6Var.d));
        this.L0 = i10;
        F(context, null, arrayList, 0, j6Var, null, b7Var, false);
    }

    public final void D(Context context, long j10, e9 e9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f13955a;
        TL_stories.PeerStories peerStoriesY = storiesController.y(j10);
        if (peerStoriesY != null) {
            int i11 = 0;
            while (i11 < peerStoriesY.stories.size()) {
                if (l7.w(i10, peerStoriesY.stories.get(i11))) {
                    peerStoriesY.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (peerStoriesY.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f13960g.remove(peerStoriesY);
                storiesController.h.remove(peerStoriesY);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.f13508t0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, j6 j6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, j6Var, peerStories, e9Var, z10);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, b7 b7Var) {
        B(UserConfig.selectedAccount, context, storyItem, b7Var);
    }

    public final void H(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        if (this.f13467b) {
            n2VarR.presentFragment(n2Var);
        } else {
            n2VarR.presentFragment(n2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.B0 = null;
        K(false);
        l(true);
        h9 h9Var = this.f13510v0;
        if (h9Var != null) {
            h9Var.release(null);
            this.f13510v0 = null;
        }
        lh.c4 c4Var = this.f13517z0;
        if (c4Var != null) {
            c4Var.d(0L, null);
        }
        d1 d1Var = this.f13512w0;
        if (d1Var != null) {
            i1 i1Var = i1.V;
            if (!i1Var.O || i1Var.v != d1Var) {
                if (d1Var.f13179n) {
                    d1Var.s(null);
                } else {
                    d1Var.e();
                }
            }
        }
        this.f13512w0 = null;
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
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f13965m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((r9) hVar.n(i11)).b(false);
        }
        if (this.f13467b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f13478f;
        if (n2Var != null) {
            n2Var.removeSheet(this);
        }
        f13458u1.remove(this);
        this.f13508t0.clear();
        this.f13465a0 = 0.0f;
        f13459v1 = null;
    }

    public final void K(boolean z10) {
        this.m0 = z10;
        if (z10) {
            a8.b bVar = this.Z0.f13918c;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        e4 currentPeerView;
        e4 currentPeerView2;
        c4 c4Var;
        h9 h9Var;
        d4 d4Var;
        if (this.W0 != z10) {
            this.W0 = z10;
            if (z10 && !this.f13469b1 && (currentPeerView2 = this.f13487j0.getCurrentPeerView()) != null && (c4Var = currentPeerView2.K1) != null && !c4Var.f13145f && c4Var.f13142b == null) {
                if (!this.f13481g0 && !this.f13479f0 && (d4Var = this.C0) != null && d4Var.f13192b != null) {
                    currentPeerView2.Y0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                d4 d4Var2 = this.C0;
                if (d4Var2 != null && (h9Var = d4Var2.f13192b) != null && !this.f13481g0) {
                    h9Var.setSeeking(true);
                }
                this.f13481g0 = true;
            }
            P();
            y8 y8Var = this.f13487j0;
            if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.W0);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (!this.f13467b || launchActivity == null) {
            return;
        }
        if (z10) {
            this.f13506s0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
        }
        if (this.f13506s0) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.f13512w0 == null || (n2Var = this.f13478f) == null || this.f13517z0 == null) {
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(n2Var.getContext());
        if (bf.d.a(activityFindActivity) > 0) {
            i1.o(activityFindActivity, this.f13512w0);
            q(true);
        }
    }

    public final void O() {
        boolean z10 = f13463z1;
        f13463z1 = !z10;
        h9 h9Var = this.f13510v0;
        int i10 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.I0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).setAudioEnabled(!f13463z1, true);
            i10++;
        }
        e4 currentPeerView = this.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f13275t1.a(f13463z1, true);
        }
        if (f13463z1) {
            return;
        }
        this.Z0.b();
    }

    public final void P() {
        if (this.f13487j0 == null) {
            return;
        }
        boolean zW = w();
        if (this.f13467b) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f13478f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                zW = true;
            }
        }
        if (org.telegram.ui.m4.x().R) {
            zW = true;
        }
        this.f13487j0.setPaused(zW);
        h9 h9Var = this.f13510v0;
        if (h9Var != null) {
            if (zW) {
                h9Var.pause();
            } else {
                h9Var.play(f13461x1);
            }
        }
        this.f13487j0.f13870z0 = (this.f13513x || this.D0 || this.E0 || this.W0 || this.f13469b1 || this.f13465a0 != 0.0f || this.f13480f1) ? false : true;
    }

    public final void Q() {
        int i10;
        TL_stories.StoryItem storyItem;
        if (this.f13498p0 == null) {
            this.R0 = false;
            this.K = 0.0f;
            this.J = 0.0f;
            return;
        }
        f9 f9Var = this.f13496o0;
        ImageReceiver imageReceiver = f9Var.f13334b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.f13335c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.f13335c.setVisible(true, true);
        }
        e4 currentPeerView = this.f13487j0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.f13267r1;
            if (selectedPosition < 0 || selectedPosition >= arrayList.size()) {
                i10 = 0;
            } else {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).f22617id;
            }
        } else {
            i10 = 0;
        }
        if (currentPeerView != null) {
            ArrayList arrayList2 = currentPeerView.f13267r1;
            if (selectedPosition < 0 || selectedPosition >= arrayList2.size()) {
                storyItem = null;
            } else {
                storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
            }
        } else {
            storyItem = null;
        }
        if (storyItem == null && this.J0) {
            storyItem = this.P0;
        }
        long currentDialogId = this.f13487j0.getCurrentDialogId();
        j6 j6Var = this.K0;
        if ((j6Var instanceof d6) && storyItem != null) {
            currentDialogId = storyItem.dialogId;
            i10 = storyItem.messageId;
        } else if ((j6Var instanceof m6) && storyItem != null) {
            currentDialogId = storyItem.dialogId;
            i10 = storyItem.f22617id;
        } else if (j6Var != null) {
            i10 = this.L0;
        }
        long j10 = currentDialogId;
        int i11 = i10;
        f9Var.f13333a = null;
        f9Var.f13343m = null;
        f9Var.f13334b = null;
        f9Var.f13335c = null;
        f9Var.f13336e = null;
        f9Var.f13337f = null;
        f9Var.f13338g = null;
        f9Var.d = null;
        f9Var.f13342l = null;
        f9Var.h = 0.0f;
        f9Var.f13339i = 0.0f;
        f9Var.f13345o = 0;
        f9Var.f13340j = null;
        f9Var.f13341k = 1.0f;
        if (!this.f13498p0.y0(j10, this.Q0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
            this.R0 = false;
            this.K = 0.0f;
            this.J = 0.0f;
            return;
        }
        f9Var.f13345o = i11;
        View view = f9Var.f13333a;
        if (view == null) {
            this.R0 = false;
            this.K = 0.0f;
            this.J = 0.0f;
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View view2 = f9Var.f13333a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            iArr[1] = view2.getPaddingTop() + iArr[1];
        }
        float f10 = iArr[0];
        this.G = f10;
        this.H = iArr[1];
        KeyEvent.Callback callback = f9Var.f13333a;
        if (callback instanceof y6) {
            this.I = (y6) callback;
        } else {
            this.I = null;
        }
        this.R0 = false;
        ImageReceiver imageReceiver3 = f9Var.f13334b;
        if (imageReceiver3 != null) {
            this.J = imageReceiver3.getCenterX() + f10;
            this.K = f9Var.f13334b.getCenterY() + iArr[1];
            this.N = f9Var.f13334b.getImageWidth();
            this.O = f9Var.f13334b.getImageHeight();
            h7 h7Var = f9Var.f13343m;
            if (h7Var != null) {
                this.N = h7Var.b() * this.N;
                this.O = f9Var.f13343m.b() * this.O;
            }
            if (f9Var.f13333a.getParent() instanceof View) {
                View view3 = (View) f9Var.f13333a.getParent();
                this.J = (view3.getScaleX() * f9Var.f13334b.getCenterX()) + iArr[0];
                this.K = (view3.getScaleY() * f9Var.f13334b.getCenterY()) + iArr[1];
                this.N = view3.getScaleX() * this.N;
                this.O = view3.getScaleY() * this.O;
            }
            this.R0 = true;
        } else {
            ImageReceiver imageReceiver4 = f9Var.f13335c;
            if (imageReceiver4 != null) {
                this.J = imageReceiver4.getCenterX() + f10;
                this.K = f9Var.f13335c.getCenterY() + iArr[1];
                this.N = f9Var.f13335c.getImageWidth();
                this.O = f9Var.f13335c.getImageHeight();
                this.S0 = f9Var.f13335c.getRoundRadius();
            }
        }
        f9Var.f13338g.getLocationOnScreen(iArr);
        float f11 = f9Var.h;
        if (f11 == 0.0f && f9Var.f13339i == 0.0f) {
            this.L = 0.0f;
            this.M = 0.0f;
        } else {
            float f12 = iArr[1];
            this.L = f11 + f12;
            this.M = f12 + f9Var.f13339i;
        }
    }

    @Override
    public final Bitmap a() {
        lh.c4 c4Var = this.A0;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.A0.getBitmap();
    }

    @Override
    public final boolean attachedToParent() {
        return this.f13467b && this.f13505s != null;
    }

    @Override
    public final Bitmap c() {
        lh.c4 c4Var = this.f13517z0;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.f13517z0.getBitmap();
    }

    @Override
    public final void d(bf.e eVar) {
        lh.c4 c4Var = this.A0;
        if (c4Var != null) {
            c4Var.setOnFirstFrameCallback(eVar);
            this.f13512w0.s(this.A0.getSink());
        }
        if (this.f13467b) {
            AndroidUtilities.removeFromParent(this.f13505s);
        } else {
            this.f13493n.removeView(this.f13505s);
        }
        this.f13505s.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.K0 == ((j6) objArr[0])) {
                t();
                y8 y8Var = this.f13487j0;
                j6 j6Var = this.K0;
                y8Var.D(this.h, j6Var.d, j6Var.h());
                k5 k5Var = this.f13511w;
                if (k5Var != null) {
                    TL_stories.StoryItem selectedStory = k5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.K0.f13540i.size()) {
                        if (selectedStory != null && selectedStory.f22617id == ((MessageObject) this.K0.f13540i.get(i12)).storyItem.f22617id) {
                            i13 = i12;
                        }
                        arrayList.add(((MessageObject) this.K0.f13540i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f13511w.b(i13, this.K0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.f13498p0;
            if (e9Var instanceof b7) {
                b7 b7Var = (b7) e9Var;
                if (!b7Var.f13124r || b7Var.f13123n) {
                    return;
                }
                s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = b7Var.f13122f ? storiesController.h : storiesController.f13960g;
                ArrayList<Long> dialogIds = this.f13487j0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!b7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.f13487j0.getAdapter().g();
                }
            }
            k5 k5Var2 = this.f13511w;
            if (k5Var2 != null) {
                ArrayList arrayList3 = k5Var2.h.C;
                while (i12 < arrayList3.size()) {
                    ((h4) arrayList3.get(i12)).b();
                    i12++;
                }
                return;
            }
            return;
        }
        int i15 = NotificationCenter.openArticle;
        if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
            if (i10 == NotificationCenter.storyDeleted) {
                long jLongValue = ((Long) objArr[0]).longValue();
                int iIntValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.P0;
                if (storyItem != null && storyItem.dialogId == jLongValue && storyItem.f22617id == iIntValue) {
                    this.O0 = true;
                    return;
                }
                return;
            }
            return;
        }
        P();
        if (i10 != i15) {
            if (this.f13497o1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        h9 h9Var = this.f13510v0;
        if (h9Var == null) {
            this.f13499p1 = 0L;
            return;
        }
        this.f13499p1 = h9Var.currentPosition;
        this.f13510v0.release(null);
        this.f13510v0 = null;
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final void f(bf.e eVar) {
        lh.c4 c4Var = this.A0;
        if (c4Var != null) {
            c4Var.setOnFirstFrameCallback(eVar);
        }
        if (this.f13467b) {
            AndroidUtilities.removeFromParent(this.f13505s);
            this.f13478f.getLayoutContainer().addView(this.f13505s);
        } else {
            this.f13493n.addView(this.f13505s, this.f13502r);
        }
        lh.c4 c4Var2 = this.A0;
        if (c4Var2 != null) {
            c4Var2.b();
            this.A0 = null;
        }
        this.f13505s.invalidate();
        this.f13512w0.s(this.f13517z0.getSink());
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f13478f;
        return (n2Var == null || t() == null || AndroidUtilities.findActivity(n2Var.getContext()) == null || this.f13512w0 == null || this.f13517z0 == null || this.D0) ? false : true;
    }

    @Override
    public final mc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.b.d((((1.0f - this.R) * 0.5f) + 0.5f) * this.Q, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f13505s;
    }

    @Override
    public final View h() {
        lh.c4 c4Var = new lh.c4(this.f13517z0.getContext(), this.h);
        this.A0 = c4Var;
        return c4Var;
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
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z11 = !this.f13485i0 || z10;
        if (this.f13475e != z11) {
            this.f13475e = z11;
            SurfaceView surfaceView = this.f13516y0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            lh.c4 c4Var = this.f13517z0;
            if (c4Var != null) {
                c4Var.setSecure(!z11);
            }
            if (this.f13467b) {
                org.telegram.ui.ActionBar.n2 n2Var = this.f13478f;
                if (n2Var.getParentActivity() != null) {
                    if (z11) {
                        n2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        n2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                }
                return;
            }
            if (z11) {
                this.f13502r.flags &= -8193;
                AndroidUtilities.logFlagSecure();
            } else {
                this.f13502r.flags |= 8192;
                AndroidUtilities.logFlagSecure();
            }
            try {
                this.f13493n.updateViewLayout(this.f13505s, this.f13502r);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void m() {
        if (this.D == null) {
            this.f13479f0 = false;
            this.f13483h0 = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            this.D = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new q8(this, 2));
            this.D.addListener(new r8(this, 1));
            this.D.setDuration(250L);
            this.D.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            this.D.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f13504r1 != null) {
            return;
        }
        if (this.f13491l0 != 0) {
            AndroidUtilities.hideKeyboard(this.f13511w);
            return;
        }
        if (this.Y || this.f13465a0 != 0.0f) {
            this.F0.lock();
            if (!z10) {
                float f10 = this.f13465a0;
                k5 k5Var = this.f13511w;
                float f11 = k5Var.f13579c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f13465a0 = f12;
                    k5Var.setOffset(f12);
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13465a0, z10 ? this.f13511w.f13579c : 0.0f);
            this.f13504r1 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new q8(this, 3));
            this.f13504r1.addListener(new ag.x(6, this, z10));
            if (z10) {
                this.f13504r1.setDuration(350L);
                this.f13504r1.setInterpolator(er.h);
            } else {
                this.f13504r1.setDuration(350L);
                this.f13504r1.setInterpolator(er.f28122f);
            }
            this.f13504r1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.f13467b || (launchActivity = LaunchActivity.C1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override
    public final boolean onAttachedBackPressed() {
        e4 currentPeerView;
        boolean zS0 = false;
        if (this.f13465a0 == 0.0f) {
            y8 y8Var = this.f13487j0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                zS0 = currentPeerView.s0();
            }
            if (zS0) {
                return true;
            }
            q(true);
            return true;
        }
        k5 k5Var = this.f13511w;
        if (k5Var.f13586x > 0) {
            AndroidUtilities.hideKeyboard(k5Var);
            return true;
        }
        c5 currentPage = k5Var.getCurrentPage();
        if (currentPage != null) {
            j4 j4Var = currentPage.f13156r;
            r4 r4Var = currentPage.f13154f;
            if (r4Var != null && r4Var.f30454b) {
                r4Var.a();
                return true;
            }
            if (Math.abs(currentPage.f13152c.getTranslationY() - j4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                j4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                j4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.f13511w == null) {
            k5 k5Var = new k5(this.v.getContext(), this);
            this.f13511w = k5Var;
            this.v.addView(k5Var, 0);
        }
        e4 currentPeerView = this.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.K0 == null) {
                this.f13511w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.K0.f13540i.size(); i10++) {
                arrayList.add(((MessageObject) this.K0.f13540i.get(i10)).storyItem);
            }
            this.f13511w.b(currentPeerView.getListPosition(), this.K0.d, arrayList);
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f13505s);
        this.D0 = true;
        this.f13474d1 = true;
        P();
        M(false);
        Q();
        this.F0.lock();
        this.X = this.S;
        this.A = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.Q, 0.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new q8(this, 0));
        if (z10) {
            y();
        } else {
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.f13496o0;
            ImageReceiver imageReceiver = f9Var.f13334b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f13335c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f13335c = null;
            f9Var.f13334b = null;
        }
        AndroidUtilities.runOnUIThread(new l3(this, 2), 16L);
        if (this.Y0) {
            this.Y0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (f13463z1) {
            O();
            return;
        }
        e4 currentPeerView = this.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            c4 c4Var = currentPeerView.K1;
            if (!c4Var.j() && c4Var.f13144e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.Z0.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f13508t0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f13491l0 != i10) {
            this.f13491l0 = i10;
            this.f13487j0.setKeyboardHeight(i10);
            this.f13487j0.requestLayout();
            k5 k5Var = this.f13511w;
            if (k5Var != null) {
                k5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f13500q0 = dialog;
            dialog.setOnDismissListener(new ag.j0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            this.f13500q0 = null;
            return false;
        }
    }

    public final e4 t() {
        y8 y8Var = this.f13487j0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.f13485i0) {
            AndroidUtilities.hideKeyboard(this.f13505s);
            this.D0 = true;
            this.G0 = false;
            this.Q = 0.0f;
            this.R = 0.0f;
            P();
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.f13496o0;
            ImageReceiver imageReceiver = f9Var.f13334b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f13335c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.f13335c = null;
            f9Var.f13334b = null;
            x8 x8Var = this.v;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.F0.unlock();
            d4 d4Var = this.C0;
            if (d4Var != null) {
                d4Var.a();
            }
            I();
            if (this.f13467b) {
                AndroidUtilities.removeFromParent(this.f13505s);
            } else {
                this.f13493n.removeView(this.f13505s);
            }
            this.f13505s = null;
            this.f13485i0 = false;
            this.d = false;
            o();
            l3 l3Var = this.f13490k1;
            if (l3Var != null) {
                l3Var.run();
                this.f13490k1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.T0 || this.V0 || this.U0 || this.H0 || this.m0 || this.f13513x || this.f13500q0 != null || this.f13503r0 != null || this.D0 || this.E0 || this.Q != 1.0f || this.f13465a0 != 0.0f || this.f13477e1) {
            return true;
        }
        if ((this.f13484h1 && this.f13464a) || this.f13482g1 || this.f13480f1 || this.l1 || this.R != 0.0f || this.f13501q1 != null) {
            return true;
        }
        return (!this.f13467b || (n2Var = this.f13478f) == null || n2Var.getLastStoryViewer() == this) ? false : true;
    }

    public final void y() {
        TL_stories.StoryItem storyItem;
        e4 currentPeerView;
        int selectedPosition;
        this.d = true;
        f9 f9Var = this.f13496o0;
        ImageReceiver imageReceiver = f9Var.f13334b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.f13335c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.f13335c.setVisible(true, true);
        }
        if (this.K0 != null && (currentPeerView = this.f13487j0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.K0.f13540i.size()) {
            this.Q0 = ((MessageObject) this.K0.f13540i.get(selectedPosition)).getId();
        }
        if (this.f13498p0 != null) {
            long currentDialogId = this.f13487j0.getCurrentDialogId();
            int i10 = this.Q0;
            if (this.K0 instanceof m6) {
                e4 currentPeerView2 = this.f13487j0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.f13267r1;
                    if (selectedPosition2 < 0 || selectedPosition2 >= arrayList.size()) {
                        storyItem = null;
                    } else {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                    }
                } else {
                    storyItem = null;
                }
                if (storyItem != null) {
                    currentDialogId = storyItem.dialogId;
                    i10 = storyItem.f22617id;
                }
            }
            this.f13498p0.g1(currentDialogId, i10, new l3(this, 5));
        }
    }

    public final void z(boolean z10) {
        Activity activityFindActivity = AndroidUtilities.findActivity(this.f13478f.getContext());
        if (activityFindActivity != null) {
            try {
                activityFindActivity.setRequestedOrientation(z10 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z10) {
                activityFindActivity.getWindow().addFlags(128);
            } else {
                activityFindActivity.getWindow().clearFlags(128);
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
    public final void e(Canvas canvas) {
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }
}
