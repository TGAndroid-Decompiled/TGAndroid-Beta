package di;

import a8.fg;
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
import android.graphics.PorterDuff;
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
import bi.cb;
import bi.md;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class y9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.n2, uf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f9413x1;
    public static TL_stories.StoryItem f9415z1;
    public h1 A0;
    public q9 B0;
    public SurfaceView C0;
    public fi.b4 D0;
    public boolean E;
    public fi.b4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public p4 G0;
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
    public n7 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public z6 O0;
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
    public boolean f9417a0;
    public boolean f9418a1;
    public float f9420b0;
    public final s3 f9421b1;
    public boolean f9423c0;
    public boolean f9424c1;
    public float f9425d0;
    public g8 f9426d1;
    public float f9427e0;
    public final LongSparseIntArray f9428e1;
    public final org.telegram.ui.ActionBar.r2 f9429f;
    public boolean f9430f0;
    public boolean f9431f1;
    public boolean f9432g0;
    public boolean f9433g1;
    public int h;
    public boolean f9434h0;
    public boolean f9435h1;
    public GestureDetector f9436i0;
    public boolean f9437i1;
    public boolean f9438j0;
    public boolean f9439j1;
    public boolean f9440k0;
    public boolean f9441k1;
    public boolean f9442l0;
    public boolean l1;
    public boolean m0;
    public boolean f9443m1;
    public WindowManager f9444n;
    public o9 f9445n0;
    public s8 f9446n1;
    public s3 f9448o1;
    public int f9449p0;
    public boolean f9450p1;
    public boolean f9451q0;
    public float f9452q1;
    public WindowManager.LayoutParams f9453r;
    public float f9454r0;
    public boolean f9455r1;
    public m9 f9456s;
    public final v9 f9457s0;
    public boolean f9458s1;
    public u9 f9459t0;
    public long f9460t1;
    public Dialog f9461u0;
    public l7 f9462u1;
    public n9 v;
    public org.telegram.ui.ActionBar.n2 f9463v0;
    public ValueAnimator f9464v1;
    public b6 f9465w;
    public boolean f9466w0;
    public boolean f9467w1;
    public boolean f9468x;
    public final ArrayList f9469x0;
    public org.telegram.ui.m4 f9471y0;
    public x9 f9472z0;
    public static final ArrayList f9414y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f9416a = SharedConfig.useSurfaceInStories;
    public boolean f9419b = true;
    public boolean f9422c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f9470y = new b();
    public final RectF T = new RectF();
    public final float[] f9447o0 = new float[2];

    public y9(org.telegram.ui.ActionBar.r2 r2Var) {
        ?? obj = new Object();
        obj.f9276k = 1.0f;
        this.f9457s0 = obj;
        this.f9469x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f9421b1 = new s3(this, 4);
        this.f9428e1 = new LongSparseIntArray();
        new Paint(1);
        this.f9429f = r2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            E1.put(j10 + (j10 >> 16) + (storyItem.f22266id << 16), editable);
        }
    }

    public static boolean i(y9 y9Var, m9 m9Var, float f7, float f10, boolean z10) {
        u2 u2Var;
        u2 u2Var2;
        if (m9Var != null) {
            if (!y9Var.X0) {
                if (y9Var.f9465w == null || y9Var.f9427e0 == 0.0f) {
                    q4 currentPeerView = y9Var.f9445n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f7 - y9Var.v.getX()) - y9Var.f9445n0.getX()) - currentPeerView.getX(), ((f10 - y9Var.v.getY()) - y9Var.f9445n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f8995k2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (u2Var2 = currentPeerView.Q1) != null && u2Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.Q1.getY() + currentPeerView.getY() + y9Var.f9445n0.getY() + y9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (u2Var = currentPeerView.Q1) != null && u2Var.t0()) || y9Var.f9462u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(m9Var, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(y9 y9Var) {
        md mdVar;
        ju editField;
        q4 currentPeerView = y9Var.f9445n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.Q1 != null && (((mdVar = currentPeerView.Q2) == null || mdVar.getVisibility() != 0) && (editField = currentPeerView.Q1.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new s3(y9Var, 6), 200L);
            return;
        }
        y9Var.m();
    }

    public static void k(y9 y9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(y9Var.X, y9Var.W) / AndroidUtilities.dp(80.0f)));
        if (y9Var.V != clamp01) {
            y9Var.V = clamp01;
            y9Var.o();
            q4 currentPeerView = y9Var.f9445n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f9001m2) {
                currentPeerView.invalidate();
            }
            h1 h1Var = y9Var.A0;
            if (h1Var != null) {
                h1Var.v((1.0f - y9Var.V) * y9Var.U);
            }
        }
        m9 m9Var = y9Var.f9456s;
        if (m9Var != null) {
            m9Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.f22266id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f9415z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f9415z1.messageId != messageObject.getId() || f9415z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, u9 u9Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, u9Var, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, z6 z6Var, TL_stories.PeerStories peerStories, u9 u9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f9469x0;
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
        x9 x9Var = this.f9472z0;
        if (x9Var != null) {
            x9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f9455r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9419b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f9416a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && z6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f9415z1 = storyItem;
        }
        this.O0 = z6Var;
        this.Q0 = peerStories;
        this.f9459t0 = u9Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        o9 o9Var = this.f9445n0;
        if (o9Var != null) {
            o9Var.setHorizontalProgressToDismiss(0.0f);
            this.f9445n0.F0 = 0;
        }
        this.f9425d0 = 0.0f;
        this.Z = 0.0f;
        this.f9442l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f9418a1 = false;
        this.Z0 = false;
        this.f9428e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f9421b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9453r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f9453r.flags = -2147417728;
        this.H0 = false;
        this.f9424c1 = false;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (this.f9456s == null) {
            this.f9436i0 = new GestureDetector(new i9(this));
            this.f9456s = new m9(this, context, R);
        }
        if (this.v == null) {
            this.v = new n9(context, this);
            o9 o9Var2 = new o9(this, this.h, context, this, this.f9470y);
            this.f9445n0 = o9Var2;
            o9Var2.setDelegate(new p9(this, z6Var, arrayList, context));
            this.v.addView(this.f9445n0, gb1.i(-1, -1, 1));
            this.f9471y0 = new org.telegram.ui.m4(context);
            if (this.f9416a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f9471y0.addView(this.C0);
            } else {
                q9 q9Var = new q9(context, this);
                this.B0 = q9Var;
                this.f9471y0.addView(q9Var);
            }
            fi.b4 b4Var = new fi.b4(context, this.h);
            this.D0 = b4Var;
            b4Var.setVisibility(8);
            this.f9471y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f8593a = paint;
            view.f8595c = new a5.d((Object) view, 21);
            view.d = new org.telegram.ui.Components.h6((View) view);
            view.e = new org.telegram.ui.Components.h6((View) view);
            paint.setColor(-1);
            this.f9426d1 = view;
            this.v.addView((View) view, gb1.h(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        fi.b4 b4Var2 = this.D0;
        if (b4Var2 != null) {
            b4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f9471y0);
        this.f9456s.addView(this.f9471y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f9456s.addView(this.v);
        this.f9456s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (z6Var != null) {
            this.f9445n0.D(this.h, z6Var.d, z6Var.h());
        } else {
            o9 o9Var3 = this.f9445n0;
            int i13 = this.h;
            o9Var3.A0 = arrayList;
            o9Var3.f8565y0 = i13;
            o9Var3.setAdapter(null);
            o9Var3.setAdapter(o9Var3.f8566z0);
            o9Var3.setCurrentItem(i11);
            o9Var3.C0 = true;
        }
        this.f9444n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f9419b = false;
        }
        if (this.f9419b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f9422c = z14;
        n9 n9Var = this.v;
        a1.c cVar = new a1.c(this, 29);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(n9Var, cVar);
        if (this.f9419b) {
            AndroidUtilities.removeFromParent(this.f9456s);
            this.f9456s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f9456s);
            if (!this.f9422c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f9456s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f9444n, this.f9456s, this.f9453r);
            this.f9444n.addView(this.f9456s, this.f9453r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f9456s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f9456s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f9413x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f9456s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f9419b) {
            z(true);
        }
        if (!this.f9419b) {
            f9414y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, z6 z6Var, q7 q7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(z6Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, z6Var, null, q7Var, false);
    }

    public final void D(Context context, long j10, u9 u9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f8630a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (a8.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f8634g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, u9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, u9 u9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, u9Var, false);
            return;
        }
        this.f9469x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, q7 q7Var) {
        A(UserConfig.selectedAccount, context, storyItem, q7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, z6 z6Var, TL_stories.PeerStories peerStories, u9 u9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, z6Var, peerStories, u9Var, z10);
    }

    public final void H(org.telegram.ui.ActionBar.r2 r2Var) {
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f9419b) {
            R.presentFragment(r2Var);
            return;
        }
        R.presentFragment(r2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        x9 x9Var = this.f9472z0;
        if (x9Var != null) {
            x9Var.release(null);
            this.f9472z0 = null;
        }
        fi.b4 b4Var = this.D0;
        if (b4Var != null) {
            b4Var.d(0L, null);
        }
        h1 h1Var = this.A0;
        if (h1Var != null) {
            o1 o1Var = o1.Z;
            if (!o1Var.S || o1Var.v != h1Var) {
                if (h1Var.f8608n) {
                    h1Var.s(null);
                } else {
                    h1Var.e();
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
            ((x9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f8639m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((ha) hVar.n(i11)).b(false);
        }
        if (this.f9419b) {
            z(false);
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f9429f;
        if (r2Var != null) {
            r2Var.removeSheet(this);
        }
        f9414y1.remove(this);
        this.f9469x0.clear();
        this.f9427e0 = 0.0f;
        f9415z1 = null;
    }

    public final void K(boolean z10) {
        this.f9451q0 = z10;
        if (z10) {
            a5.d dVar = this.f9426d1.f8595c;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            dVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        q4 currentPeerView;
        q4 currentPeerView2;
        o4 o4Var;
        x9 x9Var;
        p4 p4Var;
        if (this.f9418a1 != z10) {
            this.f9418a1 = z10;
            if (z10 && !this.f9431f1 && (currentPeerView2 = this.f9445n0.getCurrentPeerView()) != null && (o4Var = currentPeerView2.D1) != null && !o4Var.f8874f && o4Var.f8872b == null) {
                if (!this.f9440k0 && !this.f9438j0 && (p4Var = this.G0) != null && ((x9) p4Var.f8902c) != null) {
                    currentPeerView2.R0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                p4 p4Var2 = this.G0;
                if (p4Var2 != null && (x9Var = (x9) p4Var2.f8902c) != null && !this.f9440k0) {
                    x9Var.setSeeking(true);
                }
                this.f9440k0 = true;
            }
            P();
            o9 o9Var = this.f9445n0;
            if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f9418a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (this.f9419b && launchActivity != null) {
            if (z10) {
                this.f9466w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f9466w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.r2 r2Var;
        Context context;
        if (this.A0 != null && (r2Var = this.f9429f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(r2Var.getContext());
            if (vf.b.a(findActivity) > 0) {
                h1 h1Var = this.A0;
                o1 o1Var = o1.Z;
                if (h1Var != null && !o1Var.S) {
                    o1Var.S = true;
                    o1Var.v = h1Var;
                    int i10 = h1Var.e;
                    o1Var.f8864w = i10;
                    NotificationCenter.getInstance(i10).addObserver(o1Var, NotificationCenter.liveStoryUpdated);
                    o1Var.J = o1Var.n();
                    o1Var.K = o1Var.m();
                    o1Var.M = 1.0f;
                    o1Var.H = false;
                    o1.j jVar = new o1.j(o1Var, o1.X);
                    o1.k kVar = new o1.k();
                    kVar.a(0.75f);
                    kVar.b(650.0f);
                    jVar.f18969u = kVar;
                    o1Var.P = jVar;
                    o1.j jVar2 = new o1.j(o1Var, o1.Y);
                    o1.k kVar2 = new o1.k();
                    kVar2.a(0.75f);
                    kVar2.b(650.0f);
                    jVar2.f18969u = kVar2;
                    o1Var.Q = jVar2;
                    if (findActivity != null) {
                        context = findActivity;
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    o1Var.f8865x = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    o1Var.f8865x.setStylusScaleEnabled(false);
                    o1Var.f8866y = new jg.s0(context, new k1(scaledTouchSlop));
                    l1 l1Var = new l1(context, 0);
                    l1Var.f8752b = new Path();
                    o1Var.e = l1Var;
                    ?? viewGroup = new ViewGroup(context);
                    o1Var.d = viewGroup;
                    viewGroup.addView(o1Var.e, gb1.g(-1.0f, -1));
                    o1Var.e.setOutlineProvider(new ag.v0(2));
                    o1Var.e.setClipToOutline(true);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.gg, o1Var.e, null);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    o1Var.f8861n = y9Var;
                    o1Var.e.addView(y9Var, gb1.g(-1.0f, -1));
                    fi.b4 b4Var = new fi.b4(context, o1Var.f8864w);
                    o1Var.f8860f = b4Var;
                    b4Var.setAlpha(0.0f);
                    o1Var.e.addView(o1Var.f8860f, gb1.g(-1.0f, -1));
                    vn vnVar = new vn(context, 1);
                    o1Var.f8862r = vnVar;
                    o1Var.e.addView(vnVar, gb1.g(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    o1Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    o1Var.h.addView(view, gb1.g(-1.0f, -1));
                    int dp = AndroidUtilities.dp(8.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.pip_video_close);
                    int i11 = org.telegram.ui.ActionBar.y6.f23438hg;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    org.telegram.ui.ActionBar.f7.t(imageView, i11, null, mode);
                    int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
                    imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(dp, dp, dp, dp);
                    imageView.setOnClickListener(new bh.f(2));
                    float f7 = 38;
                    float f10 = 4;
                    o1Var.h.addView(imageView, gb1.h(38, f7, 5, 0.0f, f10, f10, 0.0f));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.pip_video_expand);
                    org.telegram.ui.ActionBar.f7.t(imageView2, i11, null, mode);
                    imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1));
                    imageView2.setPadding(dp, dp, dp, dp);
                    imageView2.setOnClickListener(new bi.q(10, h1Var, context));
                    o1Var.h.addView(imageView2, gb1.h(38, f7, 5, 0.0f, f10, 48, 0.0f));
                    o1Var.e.addView(o1Var.h, gb1.g(-1.0f, -1));
                    o1Var.f8858b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = vf.b.b(context, false);
                    o1Var.f8859c = b10;
                    int i13 = o1Var.J;
                    b10.width = i13;
                    b10.height = o1Var.K;
                    float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
                    o1Var.N = dp2;
                    b10.x = (int) dp2;
                    WindowManager.LayoutParams layoutParams = o1Var.f8859c;
                    float dp3 = (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f);
                    o1Var.O = dp3;
                    layoutParams.y = (int) dp3;
                    WindowManager.LayoutParams layoutParams2 = o1Var.f8859c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    o1Var.d.setAlpha(0.0f);
                    o1Var.d.setScaleX(0.1f);
                    o1Var.d.setScaleY(0.1f);
                    AndroidUtilities.setPreferredMaxRefreshRate(o1Var.f8858b, o1Var.d, o1Var.f8859c);
                    o1Var.f8858b.addView(o1Var.d, o1Var.f8859c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(ds.f27586f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(o1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(o1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(o1Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new n1(0));
                    animatorSet.start();
                    o1Var.i();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                    sf.d dVar = o1Var.L;
                    if (dVar != null) {
                        dVar.c();
                        o1Var.L = null;
                    }
                    if (findActivity != null && vf.b.a(findActivity) == 1) {
                        sf.c cVar = new sf.c(findActivity, o1Var);
                        cVar.f48120c = "pip-live-story";
                        cVar.e = 1;
                        cVar.d = AndroidUtilities.dp(10.0f);
                        cVar.f48124j = o1Var.d;
                        cVar.f48125k = o1Var.f8860f.getPlaceholderView();
                        o1Var.L = cVar.a();
                    }
                }
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        x9 x9Var = this.f9472z0;
        int i10 = 0;
        if (x9Var != null) {
            x9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((x9) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        q4 currentPeerView = this.f9445n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f9000m1.a(D1, true);
        }
        if (!D1) {
            this.f9426d1.b();
        }
    }

    public final void P() {
        if (this.f9445n0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f9419b) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f9429f;
            if (r2Var.isPaused() || !r2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.j4.x().V) {
            w10 = true;
        }
        this.f9445n0.setPaused(w10);
        x9 x9Var = this.f9472z0;
        if (x9Var != null) {
            if (w10) {
                x9Var.pause();
            } else {
                x9Var.play(B1);
            }
        }
        this.f9445n0.D0 = (this.f9468x || this.H0 || this.I0 || this.f9418a1 || this.f9431f1 || this.f9427e0 != 0.0f || this.f9439j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: di.y9.Q():void");
    }

    @Override
    public final void a(fg fgVar) {
        fi.b4 b4Var = this.E0;
        if (b4Var != null) {
            b4Var.setOnFirstFrameCallback(fgVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f9419b) {
            AndroidUtilities.removeFromParent(this.f9456s);
        } else {
            this.f9444n.removeView(this.f9456s);
        }
        this.f9456s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f9419b && this.f9456s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(fg fgVar) {
        fi.b4 b4Var = this.E0;
        if (b4Var != null) {
            b4Var.setOnFirstFrameCallback(fgVar);
        }
        if (this.f9419b) {
            AndroidUtilities.removeFromParent(this.f9456s);
            this.f9429f.getLayoutContainer().addView(this.f9456s);
        } else {
            this.f9444n.addView(this.f9456s, this.f9453r);
        }
        fi.b4 b4Var2 = this.E0;
        if (b4Var2 != null) {
            b4Var2.b();
            this.E0 = null;
        }
        this.f9456s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        fi.b4 b4Var = this.E0;
        if (b4Var != null && b4Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((z6) objArr[0])) {
                t();
                o9 o9Var = this.f9445n0;
                z6 z6Var = this.O0;
                o9Var.D(this.h, z6Var.d, z6Var.h());
                b6 b6Var = this.f9465w;
                if (b6Var != null) {
                    TL_stories.StoryItem selectedStory = b6Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f9493i.size()) {
                        if (selectedStory != null && selectedStory.f22266id == ((MessageObject) this.O0.f9493i.get(i12)).storyItem.f22266id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f9493i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f9465w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            u9 u9Var = this.f9459t0;
            if (u9Var instanceof q7) {
                q7 q7Var = (q7) u9Var;
                if (q7Var.f9065r && !q7Var.f9064n) {
                    h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (q7Var.f9063f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f8634g;
                    }
                    ArrayList<Long> dialogIds = this.f9445n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!q7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f9445n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            b6 b6Var2 = this.f9465w;
            if (b6Var2 != null) {
                ArrayList arrayList3 = b6Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((v4) arrayList3.get(i12)).b();
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f22266id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                x9 x9Var = this.f9472z0;
                if (x9Var != null) {
                    this.f9460t1 = x9Var.currentPosition;
                    this.f9472z0.release(null);
                    this.f9472z0 = null;
                    return;
                }
                this.f9460t1 = 0L;
            } else if (!this.f9458s1 && t() != null) {
                t().d1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final Bitmap e() {
        fi.b4 b4Var = this.D0;
        if (b4Var != null && b4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f9429f;
        if (r2Var != null && t() != null && AndroidUtilities.findActivity(r2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final wc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f9456s;
    }

    @Override
    public final View h() {
        fi.b4 b4Var = new fi.b4(this.D0.getContext(), this.h);
        this.E0 = b4Var;
        return b4Var;
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
                fi.b4 b4Var = this.D0;
                if (b4Var != null) {
                    b4Var.setSecure(!z11);
                }
                if (this.f9419b) {
                    org.telegram.ui.ActionBar.r2 r2Var = this.f9429f;
                    if (r2Var.getParentActivity() != null) {
                        if (z11) {
                            r2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        r2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z11) {
                    this.f9453r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f9453r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f9444n.updateViewLayout(this.f9456s, this.f9453r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f9438j0 = false;
            this.f9442l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new g9(this, 2));
            this.H.addListener(new h9(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f9464v1 == null) {
            if (this.f9449p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f9465w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f9423c0 && this.f9427e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f9427e0;
                b6 b6Var = this.f9465w;
                float f11 = b6Var.f8428c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f9427e0 = f12;
                    b6Var.setOffset(f12);
                }
            }
            float f13 = this.f9427e0;
            if (z10) {
                f7 = this.f9465w.f8428c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f9464v1 = ofFloat;
            ofFloat.addUpdateListener(new g9(this, 3));
            this.f9464v1.addListener(new bh.f0(4, this, z10));
            if (z10) {
                this.f9464v1.setDuration(350L);
                this.f9464v1.setInterpolator(ds.h);
            } else {
                this.f9464v1.setDuration(350L);
                this.f9464v1.setInterpolator(ds.f27586f);
            }
            this.f9464v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f9419b && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        q4 currentPeerView;
        boolean z10 = false;
        if (this.f9427e0 != 0.0f) {
            b6 b6Var = this.f9465w;
            if (b6Var.f8434x > 0) {
                AndroidUtilities.hideKeyboard(b6Var);
                return true;
            }
            t5 currentPage = b6Var.getCurrentPage();
            if (currentPage != null) {
                y4 y4Var = currentPage.f9196r;
                h5 h5Var = currentPage.f9194f;
                if (h5Var != null && h5Var.f29713b) {
                    h5Var.a();
                    return true;
                } else if (Math.abs(currentPage.f9193c.getTranslationY() - y4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    y4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    y4Var.y0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        o9 o9Var = this.f9445n0;
        if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.q0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f9465w == null) {
            b6 b6Var = new b6(this.v.getContext(), this);
            this.f9465w = b6Var;
            this.v.addView(b6Var, 0);
        }
        q4 currentPeerView = this.f9445n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f9493i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f9493i.get(i10)).storyItem);
                }
                this.f9465w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f9465w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f9456s);
        this.H0 = true;
        this.f9435h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f9420b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new g9(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            v9 v9Var = this.f9457s0;
            ImageReceiver imageReceiver = v9Var.f9270b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = v9Var.f9271c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            v9Var.f9271c = null;
            v9Var.f9270b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new s3(this, 2), 16L);
        if (this.f9424c1) {
            this.f9424c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        q4 currentPeerView = this.f9445n0.getCurrentPeerView();
        if (currentPeerView != null) {
            o4 o4Var = currentPeerView.D1;
            if (!o4Var.j() && o4Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f9426d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f9469x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f9449p0 != i10) {
            this.f9449p0 = i10;
            this.f9445n0.setKeyboardHeight(i10);
            this.f9445n0.requestLayout();
            b6 b6Var = this.f9465w;
            if (b6Var != null) {
                b6Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f9461u0 = dialog;
            dialog.setOnDismissListener(new cb(this, 4));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f9461u0 = null;
            return false;
        }
    }

    public final q4 t() {
        o9 o9Var = this.f9445n0;
        if (o9Var == null) {
            return null;
        }
        return o9Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f9456s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            v9 v9Var = this.f9457s0;
            ImageReceiver imageReceiver = v9Var.f9270b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = v9Var.f9271c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            v9Var.f9271c = null;
            v9Var.f9270b = null;
            n9 n9Var = this.v;
            if (n9Var != null) {
                n9Var.a(true);
            }
            this.J0.unlock();
            p4 p4Var = this.G0;
            if (p4Var != null) {
                p4Var.b();
            }
            I();
            if (this.f9419b) {
                AndroidUtilities.removeFromParent(this.f9456s);
            } else {
                this.f9444n.removeView(this.f9456s);
            }
            this.f9456s = null;
            this.m0 = false;
            this.d = false;
            o();
            s3 s3Var = this.f9448o1;
            if (s3Var != null) {
                s3Var.run();
                this.f9448o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f9451q0 && !this.f9468x && this.f9461u0 == null && this.f9463v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f9427e0 == 0.0f && !this.f9437i1) {
            if ((!this.l1 || !this.f9416a) && !this.f9441k1 && !this.f9439j1 && !this.f9450p1 && this.V == 0.0f && this.f9462u1 == null) {
                if (!this.f9419b || (r2Var = this.f9429f) == null || r2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: di.y9.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f9429f.getContext());
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
