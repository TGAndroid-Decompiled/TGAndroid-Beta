package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class sb implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.i2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f3657x1;
    public static TL_stories.StoryItem f3659z1;
    public t1 A0;
    public kb B0;
    public SurfaceView C0;
    public di.j4 D0;
    public boolean E;
    public di.j4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public p5 G0;
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
    public d9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public o8 O0;
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
    public boolean f3661a0;
    public boolean f3662a1;
    public float f3664b0;
    public final r4 f3665b1;
    public boolean f3667c0;
    public boolean f3668c1;
    public float f3669d0;
    public y9 f3670d1;
    public float f3671e0;
    public final LongSparseIntArray f3672e1;
    public final org.telegram.ui.ActionBar.m2 f3673f;
    public boolean f3674f0;
    public boolean f3675f1;
    public boolean f3676g0;
    public boolean f3677g1;
    public int h;
    public boolean f3678h0;
    public boolean f3679h1;
    public GestureDetector f3680i0;
    public boolean f3681i1;
    public boolean f3682j0;
    public boolean f3683j1;
    public boolean f3684k0;
    public boolean f3685k1;
    public boolean f3686l0;
    public boolean l1;
    public boolean m0;
    public boolean f3687m1;
    public WindowManager f3688n;
    public ib f3689n0;
    public la f3690n1;
    public r4 f3692o1;
    public int f3693p0;
    public boolean f3694p1;
    public boolean f3695q0;
    public float f3696q1;
    public WindowManager.LayoutParams f3697r;
    public float f3698r0;
    public boolean f3699r1;
    public gb f3700s;
    public final pb f3701s0;
    public boolean f3702s1;
    public ob f3703t0;
    public long f3704t1;
    public Dialog f3705u0;
    public b9 f3706u1;
    public hb v;
    public org.telegram.ui.ActionBar.i2 f3707v0;
    public ValueAnimator f3708v1;
    public e7 f3709w;
    public boolean f3710w0;
    public boolean f3711w1;
    public boolean f3712x;
    public final ArrayList f3713x0;
    public org.telegram.ui.n4 f3715y0;
    public rb f3716z0;
    public static final ArrayList f3658y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f3660a = SharedConfig.useSurfaceInStories;
    public boolean f3663b = true;
    public boolean f3666c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f3714y = new b();
    public final RectF T = new RectF();
    public final float[] f3691o0 = new float[2];

    public sb(org.telegram.ui.ActionBar.m2 m2Var) {
        ?? obj = new Object();
        obj.f3487k = 1.0f;
        this.f3701s0 = obj;
        this.f3713x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f3665b1 = new r4(this, 4);
        this.f3672e1 = new LongSparseIntArray();
        new Paint(1);
        this.f3673f = m2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            E1.put(j10 + (j10 >> 16) + (storyItem.f19451id << 16), editable);
        }
    }

    public static boolean i(sb sbVar, gb gbVar, float f7, float f10, boolean z10) {
        q3 q3Var;
        q3 q3Var2;
        if (gbVar != null) {
            if (!sbVar.X0) {
                if (sbVar.f3709w == null || sbVar.f3671e0 == 0.0f) {
                    q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - sbVar.v.getX()) - sbVar.f3689n0.getX()) - currentPeerView.getX(), ((f10 - sbVar.v.getY()) - sbVar.f3689n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f3570v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (q3Var2 = currentPeerView.f3508b2) != null && q3Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f3508b2.getY() + currentPeerView.getY() + sbVar.f3689n0.getY() + sbVar.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (q3Var = currentPeerView.f3508b2) != null && q3Var.u0()) || sbVar.f3706u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(gbVar, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(sb sbVar) {
        f4 f4Var;
        nu editField;
        q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f3508b2 != null && (((f4Var = currentPeerView.f3509b3) == null || f4Var.getVisibility() != 0) && (editField = currentPeerView.f3508b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new r4(sbVar, 6), 200L);
            return;
        }
        sbVar.m();
    }

    public static void k(sb sbVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(sbVar.X, sbVar.W) / AndroidUtilities.dp(80.0f)));
        if (sbVar.V != clamp01) {
            sbVar.V = clamp01;
            sbVar.o();
            q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f3578x2) {
                currentPeerView.invalidate();
            }
            t1 t1Var = sbVar.A0;
            if (t1Var != null) {
                t1Var.v((1.0f - sbVar.V) * sbVar.U);
            }
        }
        gb gbVar = sbVar.f3700s;
        if (gbVar != null) {
            gbVar.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.f19451id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f3659z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f3659z1.messageId != messageObject.getId() || f3659z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ob obVar) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, obVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, o8 o8Var, TL_stories.PeerStories peerStories, ob obVar, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f3713x0;
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
        rb rbVar = this.f3716z0;
        if (rbVar != null) {
            rbVar.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f3699r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3663b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f3660a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && o8Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f3659z1 = storyItem;
        }
        this.O0 = o8Var;
        this.Q0 = peerStories;
        this.f3703t0 = obVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        ib ibVar = this.f3689n0;
        if (ibVar != null) {
            ibVar.setHorizontalProgressToDismiss(0.0f);
            this.f3689n0.F0 = 0;
        }
        this.f3669d0 = 0.0f;
        this.Z = 0.0f;
        this.f3686l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f3662a1 = false;
        this.Z0 = false;
        this.f3672e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f3665b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3697r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f3697r.flags = -2147417728;
        this.H0 = false;
        this.f3668c1 = false;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (this.f3700s == null) {
            this.f3680i0 = new GestureDetector(new cb(this));
            this.f3700s = new gb(this, context, R);
        }
        if (this.v == null) {
            this.v = new hb(context, this);
            ib ibVar2 = new ib(this, this.h, context, this, this.f3714y);
            this.f3689n0 = ibVar2;
            ibVar2.setDelegate(new jb(this, o8Var, arrayList, context));
            this.v.addView(this.f3689n0, w7.a6.e(-1, -1, 1));
            this.f3715y0 = new org.telegram.ui.n4(context);
            if (this.f3660a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f3715y0.addView(this.C0);
            } else {
                kb kbVar = new kb(context, this);
                this.B0 = kbVar;
                this.f3715y0.addView(kbVar);
            }
            di.j4 j4Var = new di.j4(context, this.h);
            this.D0 = j4Var;
            j4Var.setVisibility(8);
            this.f3715y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f4029a = paint;
            view.f4031c = new androidx.activity.i((Object) view, 10);
            view.d = new org.telegram.ui.Components.g6((View) view);
            view.e = new org.telegram.ui.Components.g6((View) view);
            paint.setColor(-1);
            this.f3670d1 = view;
            this.v.addView((View) view, w7.a6.a(-1.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 0));
        }
        di.j4 j4Var2 = this.D0;
        if (j4Var2 != null) {
            j4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f3715y0);
        this.f3700s.addView(this.f3715y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f3700s.addView(this.v);
        this.f3700s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (o8Var != null) {
            this.f3689n0.D(this.h, o8Var.d, o8Var.h());
        } else {
            ib ibVar3 = this.f3689n0;
            int i13 = this.h;
            ibVar3.A0 = arrayList;
            ibVar3.f3986y0 = i13;
            ibVar3.setAdapter(null);
            ibVar3.setAdapter(ibVar3.f3987z0);
            ibVar3.setCurrentItem(i11);
            ibVar3.C0 = true;
        }
        this.f3688n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f3663b = false;
        }
        if (this.f3663b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f3666c = z14;
        hb hbVar = this.v;
        a1.c cVar = new a1.c(this, 11);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(hbVar, cVar);
        if (this.f3663b) {
            AndroidUtilities.removeFromParent(this.f3700s);
            this.f3700s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f3700s);
            if (!this.f3666c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f3700s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f3688n, this.f3700s, this.f3697r);
            this.f3688n.addView(this.f3700s, this.f3697r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f3700s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
            }
        }
        this.f3700s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f3657x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f3700s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f3663b) {
            z(true);
        }
        if (!this.f3663b) {
            f3658y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, o8 o8Var, g9 g9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(o8Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, o8Var, null, g9Var, false);
    }

    public final void D(Context context, long j10, ob obVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        x8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f3962a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (s9.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f3966g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, obVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, ob obVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, obVar, false);
            return;
        }
        this.f3713x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, g9 g9Var) {
        A(UserConfig.selectedAccount, context, storyItem, g9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, o8 o8Var, TL_stories.PeerStories peerStories, ob obVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, o8Var, peerStories, obVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f3663b) {
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
        rb rbVar = this.f3716z0;
        if (rbVar != null) {
            rbVar.release(null);
            this.f3716z0 = null;
        }
        di.j4 j4Var = this.D0;
        if (j4Var != null) {
            j4Var.d(0L, null);
        }
        t1 t1Var = this.A0;
        if (t1Var != null) {
            b2 b2Var = b2.Z;
            if (!b2Var.S || b2Var.v != t1Var) {
                if (t1Var.f3724n) {
                    t1Var.s(null);
                } else {
                    t1Var.e();
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
            ((rb) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f3971m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((bc) hVar.n(i11)).b(false);
        }
        if (this.f3663b) {
            z(false);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f3673f;
        if (m2Var != null) {
            m2Var.removeSheet(this);
        }
        f3658y1.remove(this);
        this.f3713x0.clear();
        this.f3671e0 = 0.0f;
        f3659z1 = null;
    }

    public final void K(boolean z10) {
        this.f3695q0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.f3670d1.f4031c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        q5 currentPeerView;
        q5 currentPeerView2;
        o5 o5Var;
        rb rbVar;
        p5 p5Var;
        if (this.f3662a1 != z10) {
            this.f3662a1 = z10;
            if (z10 && !this.f3675f1 && (currentPeerView2 = this.f3689n0.getCurrentPeerView()) != null && (o5Var = currentPeerView2.O1) != null && !o5Var.f3416f && o5Var.f3414b == null) {
                if (!this.f3684k0 && !this.f3682j0 && (p5Var = this.G0) != null && ((rb) p5Var.f3466c) != null) {
                    currentPeerView2.f3511c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                p5 p5Var2 = this.G0;
                if (p5Var2 != null && (rbVar = (rb) p5Var2.f3466c) != null && !this.f3684k0) {
                    rbVar.setSeeking(true);
                }
                this.f3684k0 = true;
            }
            P();
            ib ibVar = this.f3689n0;
            if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f3662a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f3663b && launchActivity != null) {
            if (z10) {
                this.f3710w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f3710w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.m2 m2Var;
        Context context;
        if (this.A0 != null && (m2Var = this.f3673f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(m2Var.getContext());
            if (uf.b.a(findActivity) > 0) {
                t1 t1Var = this.A0;
                b2 b2Var = b2.Z;
                if (t1Var != null && !b2Var.S) {
                    b2Var.S = true;
                    b2Var.v = t1Var;
                    int i10 = t1Var.e;
                    b2Var.f2860w = i10;
                    NotificationCenter.getInstance(i10).addObserver(b2Var, NotificationCenter.liveStoryUpdated);
                    b2Var.J = b2Var.n();
                    b2Var.K = b2Var.m();
                    b2Var.M = 1.0f;
                    b2Var.H = false;
                    o1.k kVar = new o1.k(b2Var, b2.X);
                    o1.l lVar = new o1.l();
                    lVar.a(0.75f);
                    lVar.b(650.0f);
                    kVar.f16468u = lVar;
                    b2Var.P = kVar;
                    o1.k kVar2 = new o1.k(b2Var, b2.Y);
                    o1.l lVar2 = new o1.l();
                    lVar2.a(0.75f);
                    lVar2.b(650.0f);
                    kVar2.f16468u = lVar2;
                    b2Var.Q = kVar2;
                    if (findActivity != null) {
                        context = findActivity;
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    b2Var.f2861x = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    b2Var.f2861x.setStylusScaleEnabled(false);
                    b2Var.f2862y = new ji.d4(context, new x1(scaledTouchSlop));
                    y1 y1Var = new y1(context, 0);
                    y1Var.f4002b = new Path();
                    b2Var.e = y1Var;
                    ?? viewGroup = new ViewGroup(context);
                    b2Var.d = viewGroup;
                    viewGroup.addView(b2Var.e, w7.a6.d(-1.0f, -1));
                    b2Var.e.setOutlineProvider(new a2(0));
                    b2Var.e.setClipToOutline(true);
                    b2Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19964gg, false));
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                    b2Var.f2857n = z9Var;
                    b2Var.e.addView(z9Var, w7.a6.d(-1.0f, -1));
                    di.j4 j4Var = new di.j4(context, b2Var.f2860w);
                    b2Var.f2856f = j4Var;
                    j4Var.setAlpha(0.0f);
                    b2Var.e.addView(b2Var.f2856f, w7.a6.d(-1.0f, -1));
                    xn xnVar = new xn(context, 1);
                    b2Var.f2858r = xnVar;
                    b2Var.e.addView(xnVar, w7.a6.d(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    b2Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    b2Var.h.addView(view, w7.a6.d(-1.0f, -1));
                    int dp = AndroidUtilities.dp(8.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.pip_video_close);
                    int i11 = org.telegram.ui.ActionBar.g6.f19980hg;
                    imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    int i12 = org.telegram.ui.ActionBar.g6.f19990i6;
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(dp, dp, dp, dp);
                    imageView.setOnClickListener(new ah.f(1));
                    float f7 = 38;
                    float f10 = 4;
                    b2Var.h.addView(imageView, w7.a6.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.pip_video_expand);
                    imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, -1));
                    imageView2.setPadding(dp, dp, dp, dp);
                    imageView2.setOnClickListener(new u1(0, t1Var, context));
                    b2Var.h.addView(imageView2, w7.a6.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
                    b2Var.e.addView(b2Var.h, w7.a6.d(-1.0f, -1));
                    b2Var.f2854b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = uf.b.b(context, false);
                    b2Var.f2855c = b10;
                    int i13 = b2Var.J;
                    b10.width = i13;
                    b10.height = b2Var.K;
                    float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
                    b2Var.N = dp2;
                    b10.x = (int) dp2;
                    WindowManager.LayoutParams layoutParams = b2Var.f2855c;
                    float dp3 = (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f);
                    b2Var.O = dp3;
                    layoutParams.y = (int) dp3;
                    WindowManager.LayoutParams layoutParams2 = b2Var.f2855c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    b2Var.d.setAlpha(0.0f);
                    b2Var.d.setScaleX(0.1f);
                    b2Var.d.setScaleY(0.1f);
                    AndroidUtilities.setPreferredMaxRefreshRate(b2Var.f2854b, b2Var.d, b2Var.f2855c);
                    b2Var.f2854b.addView(b2Var.d, b2Var.f2855c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(es.f24771f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(b2Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(b2Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(b2Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new ah.z(1));
                    animatorSet.start();
                    b2Var.i();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                    rf.d dVar = b2Var.L;
                    if (dVar != null) {
                        dVar.c();
                        b2Var.L = null;
                    }
                    if (findActivity != null && uf.b.a(findActivity) == 1) {
                        rf.c cVar = new rf.c(findActivity, b2Var);
                        cVar.f44166c = "pip-live-story";
                        cVar.e = 1;
                        cVar.d = AndroidUtilities.dp(10.0f);
                        cVar.f44170j = b2Var.d;
                        cVar.f44171k = b2Var.f2856f.getPlaceholderView();
                        b2Var.L = cVar.a();
                    }
                }
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        rb rbVar = this.f3716z0;
        int i10 = 0;
        if (rbVar != null) {
            rbVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((rb) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        q5 currentPeerView = this.f3689n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f3577x1.a(D1, true);
        }
        if (!D1) {
            this.f3670d1.b();
        }
    }

    public final void P() {
        if (this.f3689n0 == null) {
            return;
        }
        boolean w9 = w();
        boolean z10 = true;
        if (this.f3663b) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f3673f;
            if (m2Var.isPaused() || !m2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.k4.x().V) {
            w9 = true;
        }
        this.f3689n0.setPaused(w9);
        rb rbVar = this.f3716z0;
        if (rbVar != null) {
            if (w9) {
                rbVar.pause();
            } else {
                rbVar.play(B1);
            }
        }
        this.f3689n0.D0 = (this.f3712x || this.H0 || this.I0 || this.f3662a1 || this.f3675f1 || this.f3671e0 != 0.0f || this.f3683j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: bi.sb.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        di.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f3663b) {
            AndroidUtilities.removeFromParent(this.f3700s);
        } else {
            this.f3688n.removeView(this.f3700s);
        }
        this.f3700s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f3663b && this.f3700s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        di.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f3663b) {
            AndroidUtilities.removeFromParent(this.f3700s);
            this.f3673f.getLayoutContainer().addView(this.f3700s);
        } else {
            this.f3688n.addView(this.f3700s, this.f3697r);
        }
        di.j4 j4Var2 = this.E0;
        if (j4Var2 != null) {
            j4Var2.b();
            this.E0 = null;
        }
        this.f3700s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        di.j4 j4Var = this.E0;
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
            if (this.O0 == ((o8) objArr[0])) {
                t();
                ib ibVar = this.f3689n0;
                o8 o8Var = this.O0;
                ibVar.D(this.h, o8Var.d, o8Var.h());
                e7 e7Var = this.f3709w;
                if (e7Var != null) {
                    TL_stories.StoryItem selectedStory = e7Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f3429i.size()) {
                        if (selectedStory != null && selectedStory.f19451id == ((MessageObject) this.O0.f3429i.get(i12)).storyItem.f19451id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f3429i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f3709w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            ob obVar = this.f3703t0;
            if (obVar instanceof g9) {
                g9 g9Var = (g9) obVar;
                if (g9Var.f3086r && !g9Var.f3085n) {
                    x8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (g9Var.f3084f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f3966g;
                    }
                    ArrayList<Long> dialogIds = this.f3689n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!g9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f3689n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            e7 e7Var2 = this.f3709w;
            if (e7Var2 != null) {
                ArrayList arrayList3 = e7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((x5) arrayList3.get(i12)).b();
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f19451id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                rb rbVar = this.f3716z0;
                if (rbVar != null) {
                    this.f3704t1 = rbVar.currentPosition;
                    this.f3716z0.release(null);
                    this.f3716z0 = null;
                    return;
                }
                this.f3704t1 = 0L;
            } else if (!this.f3702s1 && t() != null) {
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
        di.j4 j4Var = this.D0;
        if (j4Var != null && j4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f3673f;
        if (m2Var != null && t() != null && AndroidUtilities.findActivity(m2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final zc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f3700s;
    }

    @Override
    public final View h() {
        di.j4 j4Var = new di.j4(this.D0.getContext(), this.h);
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
            if (this.e != z11) {
                this.e = z11;
                SurfaceView surfaceView = this.C0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                di.j4 j4Var = this.D0;
                if (j4Var != null) {
                    j4Var.setSecure(!z11);
                }
                if (this.f3663b) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.f3673f;
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
                    this.f3697r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f3697r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f3688n.updateViewLayout(this.f3700s, this.f3697r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f3682j0 = false;
            this.f3686l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new ab(this, 2));
            this.H.addListener(new bb(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f3708v1 == null) {
            if (this.f3693p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f3709w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f3667c0 && this.f3671e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f3671e0;
                e7 e7Var = this.f3709w;
                float f11 = e7Var.f2990c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f3671e0 = f12;
                    e7Var.setOffset(f12);
                }
            }
            float f13 = this.f3671e0;
            if (z10) {
                f7 = this.f3709w.f2990c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f3708v1 = ofFloat;
            ofFloat.addUpdateListener(new ab(this, 3));
            this.f3708v1.addListener(new ah.p0(4, this, z10));
            if (z10) {
                this.f3708v1.setDuration(350L);
                this.f3708v1.setInterpolator(es.h);
            } else {
                this.f3708v1.setDuration(350L);
                this.f3708v1.setInterpolator(es.f24771f);
            }
            this.f3708v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f3663b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        q5 currentPeerView;
        boolean z10 = false;
        if (this.f3671e0 != 0.0f) {
            e7 e7Var = this.f3709w;
            if (e7Var.f2996x > 0) {
                AndroidUtilities.hideKeyboard(e7Var);
                return true;
            }
            w6 currentPage = e7Var.getCurrentPage();
            if (currentPage != null) {
                a6 a6Var = currentPage.f3905r;
                j6 j6Var = currentPage.f3903f;
                if (j6Var != null && j6Var.f26797b) {
                    j6Var.a();
                    return true;
                } else if (Math.abs(currentPage.f3902c.getTranslationY() - a6Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    a6Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    a6Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        ib ibVar = this.f3689n0;
        if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f3709w == null) {
            e7 e7Var = new e7(this.v.getContext(), this);
            this.f3709w = e7Var;
            this.v.addView(e7Var, 0);
        }
        q5 currentPeerView = this.f3689n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f3429i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f3429i.get(i10)).storyItem);
                }
                this.f3709w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f3709w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f3700s);
        this.H0 = true;
        this.f3679h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f3664b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ab(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            pb pbVar = this.f3701s0;
            ImageReceiver imageReceiver = pbVar.f3481b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = pbVar.f3482c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            pbVar.f3482c = null;
            pbVar.f3481b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new r4(this, 2), 16L);
        if (this.f3668c1) {
            this.f3668c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        q5 currentPeerView = this.f3689n0.getCurrentPeerView();
        if (currentPeerView != null) {
            o5 o5Var = currentPeerView.O1;
            if (!o5Var.j() && o5Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f3670d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f3713x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f3693p0 != i10) {
            this.f3693p0 = i10;
            this.f3689n0.setKeyboardHeight(i10);
            this.f3689n0.requestLayout();
            e7 e7Var = this.f3709w;
            if (e7Var != null) {
                e7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f3705u0 = dialog;
            dialog.setOnDismissListener(new t4(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f3705u0 = null;
            return false;
        }
    }

    public final q5 t() {
        ib ibVar = this.f3689n0;
        if (ibVar == null) {
            return null;
        }
        return ibVar.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f3700s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            pb pbVar = this.f3701s0;
            ImageReceiver imageReceiver = pbVar.f3481b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = pbVar.f3482c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            pbVar.f3482c = null;
            pbVar.f3481b = null;
            hb hbVar = this.v;
            if (hbVar != null) {
                hbVar.a(true);
            }
            this.J0.unlock();
            p5 p5Var = this.G0;
            if (p5Var != null) {
                p5Var.b();
            }
            I();
            if (this.f3663b) {
                AndroidUtilities.removeFromParent(this.f3700s);
            } else {
                this.f3688n.removeView(this.f3700s);
            }
            this.f3700s = null;
            this.m0 = false;
            this.d = false;
            o();
            r4 r4Var = this.f3692o1;
            if (r4Var != null) {
                r4Var.run();
                this.f3692o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f3695q0 && !this.f3712x && this.f3705u0 == null && this.f3707v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f3671e0 == 0.0f && !this.f3681i1) {
            if ((!this.l1 || !this.f3660a) && !this.f3685k1 && !this.f3683j1 && !this.f3694p1 && this.V == 0.0f && this.f3706u1 == null) {
                if (!this.f3663b || (m2Var = this.f3673f) == null || m2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: bi.sb.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f3673f.getContext());
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
