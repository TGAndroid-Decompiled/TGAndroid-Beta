package ci;

import ai.cb;
import ai.wd;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class z9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f6217x1;
    public static TL_stories.StoryItem f6219z1;
    public h1 A0;
    public r9 B0;
    public SurfaceView C0;
    public ei.d4 D0;
    public boolean E;
    public ei.d4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public o4 G0;
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
    public boolean f6221a0;
    public boolean f6222a1;
    public float f6224b0;
    public final s3 f6225b1;
    public boolean f6227c0;
    public boolean f6228c1;
    public float f6229d0;
    public i8 f6230d1;
    public float f6231e0;
    public final LongSparseIntArray f6232e1;
    public final org.telegram.ui.ActionBar.o2 f6233f;
    public boolean f6234f0;
    public boolean f6235f1;
    public boolean f6236g0;
    public boolean f6237g1;
    public int h;
    public boolean f6238h0;
    public boolean f6239h1;
    public GestureDetector f6240i0;
    public boolean f6241i1;
    public boolean f6242j0;
    public boolean f6243j1;
    public boolean f6244k0;
    public boolean f6245k1;
    public boolean f6246l0;
    public boolean l1;
    public boolean m0;
    public boolean f6247m1;
    public WindowManager f6248n;
    public p9 f6249n0;
    public androidx.fragment.app.d f6250n1;
    public s3 f6252o1;
    public int f6253p0;
    public boolean f6254p1;
    public boolean f6255q0;
    public float f6256q1;
    public WindowManager.LayoutParams f6257r;
    public float f6258r0;
    public boolean f6259r1;
    public n9 f6260s;
    public final w9 f6261s0;
    public boolean f6262s1;
    public v9 f6263t0;
    public long f6264t1;
    public Dialog f6265u0;
    public l7 f6266u1;
    public o9 v;
    public org.telegram.ui.ActionBar.k2 f6267v0;
    public ValueAnimator f6268v1;
    public b6 f6269w;
    public boolean f6270w0;
    public boolean f6271w1;
    public boolean f6272x;
    public final ArrayList f6273x0;
    public org.telegram.ui.n4 f6275y0;
    public y9 f6276z0;
    public static final ArrayList f6218y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f6220a = SharedConfig.useSurfaceInStories;
    public boolean f6223b = true;
    public boolean f6226c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f6274y = new b();
    public final RectF T = new RectF();
    public final float[] f6251o0 = new float[2];

    public z9(org.telegram.ui.ActionBar.o2 o2Var) {
        ?? obj = new Object();
        obj.f6074k = 1.0f;
        this.f6261s0 = obj;
        this.f6273x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f6225b1 = new s3(this, 4);
        this.f6232e1 = new LongSparseIntArray();
        new Paint(1);
        this.f6233f = o2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            E1.put(j10 + (j10 >> 16) + (storyItem.f20577id << 16), editable);
        }
    }

    public static boolean i(z9 z9Var, n9 n9Var, float f7, float f10, boolean z10) {
        u2 u2Var;
        u2 u2Var2;
        if (n9Var != null) {
            if (!z9Var.X0) {
                if (z9Var.f6269w == null || z9Var.f6231e0 == 0.0f) {
                    p4 currentPeerView = z9Var.f6249n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.F0(currentPeerView, ((f7 - z9Var.v.getX()) - z9Var.f6249n0.getX()) - currentPeerView.getX(), ((f10 - z9Var.v.getY()) - z9Var.f6249n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f5715v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (u2Var2 = currentPeerView.f5653b2) != null && u2Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f5653b2.getY() + currentPeerView.getY() + z9Var.f6249n0.getY() + z9Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (u2Var = currentPeerView.f5653b2) != null && u2Var.t0()) || z9Var.f6266u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(n9Var, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(z9 z9Var) {
        wd wdVar;
        iu editField;
        p4 currentPeerView = z9Var.f6249n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f5653b2 != null && (((wdVar = currentPeerView.f5654b3) == null || wdVar.getVisibility() != 0) && (editField = currentPeerView.f5653b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new s3(z9Var, 6), 200L);
            return;
        }
        z9Var.m();
    }

    public static void k(z9 z9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(z9Var.X, z9Var.W) / AndroidUtilities.dp(80.0f)));
        if (z9Var.V != clamp01) {
            z9Var.V = clamp01;
            z9Var.o();
            p4 currentPeerView = z9Var.f6249n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f5723x2) {
                currentPeerView.invalidate();
            }
            h1 h1Var = z9Var.A0;
            if (h1Var != null) {
                h1Var.v((1.0f - z9Var.V) * z9Var.U);
            }
        }
        n9 n9Var = z9Var.f6260s;
        if (n9Var != null) {
            n9Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.f20577id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f6219z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f6219z1.messageId != messageObject.getId() || f6219z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, v9 v9Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, v9Var, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, z6 z6Var, TL_stories.PeerStories peerStories, v9 v9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f6273x0;
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
        y9 y9Var = this.f6276z0;
        if (y9Var != null) {
            y9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f6259r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6223b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f6220a = z12;
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
            f6219z1 = storyItem;
        }
        this.O0 = z6Var;
        this.Q0 = peerStories;
        this.f6263t0 = v9Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        p9 p9Var = this.f6249n0;
        if (p9Var != null) {
            p9Var.setHorizontalProgressToDismiss(0.0f);
            this.f6249n0.F0 = 0;
        }
        this.f6229d0 = 0.0f;
        this.Z = 0.0f;
        this.f6246l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f6222a1 = false;
        this.Z0 = false;
        this.f6232e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f6225b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f6257r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f6257r.flags = -2147417728;
        this.H0 = false;
        this.f6228c1 = false;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (this.f6260s == null) {
            this.f6240i0 = new GestureDetector(new j9(this));
            this.f6260s = new n9(this, context, R);
        }
        if (this.v == null) {
            this.v = new o9(context, this);
            p9 p9Var2 = new p9(this, this.h, context, this, this.f6274y);
            this.f6249n0 = p9Var2;
            p9Var2.setDelegate(new q9(this, z6Var, arrayList, context));
            this.v.addView(this.f6249n0, w7.z5.e(-1, -1, 1));
            this.f6275y0 = new org.telegram.ui.n4(context);
            if (this.f6220a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f6275y0.addView(this.C0);
            } else {
                r9 r9Var = new r9(context, this);
                this.B0 = r9Var;
                this.f6275y0.addView(r9Var);
            }
            ei.d4 d4Var = new ei.d4(context, this.h);
            this.D0 = d4Var;
            d4Var.setVisibility(8);
            this.f6275y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f5455a = paint;
            view.f5457c = new androidx.activity.i((Object) view, 11);
            view.d = new org.telegram.ui.Components.f6((View) view);
            view.e = new org.telegram.ui.Components.f6((View) view);
            paint.setColor(-1);
            this.f6230d1 = view;
            this.v.addView((View) view, w7.z5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        ei.d4 d4Var2 = this.D0;
        if (d4Var2 != null) {
            d4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f6275y0);
        this.f6260s.addView(this.f6275y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f6260s.addView(this.v);
        this.f6260s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (z6Var != null) {
            this.f6249n0.D(this.h, z6Var.d, z6Var.h());
        } else {
            p9 p9Var3 = this.f6249n0;
            int i13 = this.h;
            p9Var3.A0 = arrayList;
            p9Var3.f5423y0 = i13;
            p9Var3.setAdapter(null);
            p9Var3.setAdapter(p9Var3.f5424z0);
            p9Var3.setCurrentItem(i11);
            p9Var3.C0 = true;
        }
        this.f6248n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f6223b = false;
        }
        if (this.f6223b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f6226c = z14;
        o9 o9Var = this.v;
        a1.c cVar = new a1.c(this, 21);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(o9Var, cVar);
        if (this.f6223b) {
            AndroidUtilities.removeFromParent(this.f6260s);
            this.f6260s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f6260s);
            if (!this.f6226c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f6260s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f6248n, this.f6260s, this.f6257r);
            this.f6248n.addView(this.f6260s, this.f6257r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f6260s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
            }
        }
        this.f6260s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f6217x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f6260s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f6223b) {
            z(true);
        }
        if (!this.f6223b) {
            f6218y1.add(this);
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

    public final void D(Context context, long j10, v9 v9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f5399a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (c8.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f5403g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, v9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, v9 v9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, v9Var, false);
            return;
        }
        this.f6273x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, q7 q7Var) {
        A(UserConfig.selectedAccount, context, storyItem, q7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, z6 z6Var, TL_stories.PeerStories peerStories, v9 v9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, z6Var, peerStories, v9Var, z10);
    }

    public final void H(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f6223b) {
            R.presentFragment(o2Var);
            return;
        }
        R.presentFragment(o2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        y9 y9Var = this.f6276z0;
        if (y9Var != null) {
            y9Var.release(null);
            this.f6276z0 = null;
        }
        ei.d4 d4Var = this.D0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        h1 h1Var = this.A0;
        if (h1Var != null) {
            o1 o1Var = o1.Z;
            if (!o1Var.S || o1Var.v != h1Var) {
                if (h1Var.f5383n) {
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
            ((y9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f5408m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((ia) hVar.n(i11)).b(false);
        }
        if (this.f6223b) {
            z(false);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f6233f;
        if (o2Var != null) {
            o2Var.removeSheet(this);
        }
        f6218y1.remove(this);
        this.f6273x0.clear();
        this.f6231e0 = 0.0f;
        f6219z1 = null;
    }

    public final void K(boolean z10) {
        this.f6255q0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.f6230d1.f5457c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        p4 currentPeerView;
        p4 currentPeerView2;
        n4 n4Var;
        y9 y9Var;
        o4 o4Var;
        if (this.f6222a1 != z10) {
            this.f6222a1 = z10;
            if (z10 && !this.f6235f1 && (currentPeerView2 = this.f6249n0.getCurrentPeerView()) != null && (n4Var = currentPeerView2.O1) != null && !n4Var.f5598f && n4Var.f5596b == null) {
                if (!this.f6244k0 && !this.f6242j0 && (o4Var = this.G0) != null && ((y9) o4Var.f5633c) != null) {
                    currentPeerView2.f5656c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                o4 o4Var2 = this.G0;
                if (o4Var2 != null && (y9Var = (y9) o4Var2.f5633c) != null && !this.f6244k0) {
                    y9Var.setSeeking(true);
                }
                this.f6244k0 = true;
            }
            P();
            p9 p9Var = this.f6249n0;
            if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f6222a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (this.f6223b && launchActivity != null) {
            if (z10) {
                this.f6270w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f6270w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.o2 o2Var;
        Context context;
        if (this.A0 != null && (o2Var = this.f6233f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(o2Var.getContext());
            if (uf.b.a(findActivity) > 0) {
                h1 h1Var = this.A0;
                o1 o1Var = o1.Z;
                if (h1Var != null && !o1Var.S) {
                    o1Var.S = true;
                    o1Var.v = h1Var;
                    int i10 = h1Var.e;
                    o1Var.f5624w = i10;
                    NotificationCenter.getInstance(i10).addObserver(o1Var, NotificationCenter.liveStoryUpdated);
                    o1Var.J = o1Var.n();
                    o1Var.K = o1Var.m();
                    o1Var.M = 1.0f;
                    o1Var.H = false;
                    o1.k kVar = new o1.k(o1Var, o1.X);
                    o1.l lVar = new o1.l();
                    lVar.a(0.75f);
                    lVar.b(650.0f);
                    kVar.f17622u = lVar;
                    o1Var.P = kVar;
                    o1.k kVar2 = new o1.k(o1Var, o1.Y);
                    o1.l lVar2 = new o1.l();
                    lVar2.a(0.75f);
                    lVar2.b(650.0f);
                    kVar2.f17622u = lVar2;
                    o1Var.Q = kVar2;
                    if (findActivity != null) {
                        context = findActivity;
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    o1Var.f5625x = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    o1Var.f5625x.setStylusScaleEnabled(false);
                    o1Var.f5626y = new le.b(context, new k1(scaledTouchSlop));
                    l1 l1Var = new l1(context, 0);
                    l1Var.f5509b = new Path();
                    o1Var.e = l1Var;
                    ?? viewGroup = new ViewGroup(context);
                    o1Var.d = viewGroup;
                    viewGroup.addView(o1Var.e, w7.z5.c(-1.0f, -1));
                    o1Var.e.setOutlineProvider(new n1(0));
                    o1Var.e.setClipToOutline(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21246gg, o1Var.e, null);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                    o1Var.f5621n = w9Var;
                    o1Var.e.addView(w9Var, w7.z5.c(-1.0f, -1));
                    ei.d4 d4Var = new ei.d4(context, o1Var.f5624w);
                    o1Var.f5620f = d4Var;
                    d4Var.setAlpha(0.0f);
                    o1Var.e.addView(o1Var.f5620f, w7.z5.c(-1.0f, -1));
                    un unVar = new un(context, 1);
                    o1Var.f5622r = unVar;
                    o1Var.e.addView(unVar, w7.z5.c(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    o1Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    o1Var.h.addView(view, w7.z5.c(-1.0f, -1));
                    int dp = AndroidUtilities.dp(8.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.pip_video_close);
                    int i11 = org.telegram.ui.ActionBar.k6.f21262hg;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
                    int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(dp, dp, dp, dp);
                    imageView.setOnClickListener(new ah.f(2));
                    float f7 = 38;
                    float f10 = 4;
                    o1Var.h.addView(imageView, w7.z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.pip_video_expand);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
                    imageView2.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1));
                    imageView2.setPadding(dp, dp, dp, dp);
                    imageView2.setOnClickListener(new ai.p(10, h1Var, context));
                    o1Var.h.addView(imageView2, w7.z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
                    o1Var.e.addView(o1Var.h, w7.z5.c(-1.0f, -1));
                    o1Var.f5618b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = uf.b.b(context, false);
                    o1Var.f5619c = b10;
                    int i13 = o1Var.J;
                    b10.width = i13;
                    b10.height = o1Var.K;
                    float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
                    o1Var.N = dp2;
                    b10.x = (int) dp2;
                    WindowManager.LayoutParams layoutParams = o1Var.f5619c;
                    float dp3 = (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f);
                    o1Var.O = dp3;
                    layoutParams.y = (int) dp3;
                    WindowManager.LayoutParams layoutParams2 = o1Var.f5619c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    o1Var.d.setAlpha(0.0f);
                    o1Var.d.setScaleX(0.1f);
                    o1Var.d.setScaleY(0.1f);
                    AndroidUtilities.setPreferredMaxRefreshRate(o1Var.f5618b, o1Var.d, o1Var.f5619c);
                    o1Var.f5618b.addView(o1Var.d, o1Var.f5619c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(bs.f25133f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(o1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(o1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(o1Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new ah.z(1));
                    animatorSet.start();
                    o1Var.i();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                    rf.d dVar = o1Var.L;
                    if (dVar != null) {
                        dVar.c();
                        o1Var.L = null;
                    }
                    if (findActivity != null && uf.b.a(findActivity) == 1) {
                        rf.c cVar = new rf.c(findActivity, o1Var);
                        cVar.f45679c = "pip-live-story";
                        cVar.e = 1;
                        cVar.d = AndroidUtilities.dp(10.0f);
                        cVar.f45683j = o1Var.d;
                        cVar.f45684k = o1Var.f5620f.getPlaceholderView();
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
        y9 y9Var = this.f6276z0;
        int i10 = 0;
        if (y9Var != null) {
            y9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((y9) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        p4 currentPeerView = this.f6249n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f5722x1.a(D1, true);
        }
        if (!D1) {
            this.f6230d1.b();
        }
    }

    public final void P() {
        if (this.f6249n0 == null) {
            return;
        }
        boolean w9 = w();
        boolean z10 = true;
        if (this.f6223b) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f6233f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.k4.x().V) {
            w9 = true;
        }
        this.f6249n0.setPaused(w9);
        y9 y9Var = this.f6276z0;
        if (y9Var != null) {
            if (w9) {
                y9Var.pause();
            } else {
                y9Var.play(B1);
            }
        }
        this.f6249n0.D0 = (this.f6272x || this.H0 || this.I0 || this.f6222a1 || this.f6235f1 || this.f6231e0 != 0.0f || this.f6243j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: ci.z9.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ei.d4 d4Var = this.E0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f6223b) {
            AndroidUtilities.removeFromParent(this.f6260s);
        } else {
            this.f6248n.removeView(this.f6260s);
        }
        this.f6260s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f6223b && this.f6260s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        ei.d4 d4Var = this.E0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f6223b) {
            AndroidUtilities.removeFromParent(this.f6260s);
            this.f6233f.getLayoutContainer().addView(this.f6260s);
        } else {
            this.f6248n.addView(this.f6260s, this.f6257r);
        }
        ei.d4 d4Var2 = this.E0;
        if (d4Var2 != null) {
            d4Var2.b();
            this.E0 = null;
        }
        this.f6260s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        ei.d4 d4Var = this.E0;
        if (d4Var != null && d4Var.a()) {
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
                p9 p9Var = this.f6249n0;
                z6 z6Var = this.O0;
                p9Var.D(this.h, z6Var.d, z6Var.h());
                b6 b6Var = this.f6269w;
                if (b6Var != null) {
                    TL_stories.StoryItem selectedStory = b6Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f6193i.size()) {
                        if (selectedStory != null && selectedStory.f20577id == ((MessageObject) this.O0.f6193i.get(i12)).storyItem.f20577id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f6193i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f6269w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            v9 v9Var = this.f6263t0;
            if (v9Var instanceof q7) {
                q7 q7Var = (q7) v9Var;
                if (q7Var.f5796r && !q7Var.f5795n) {
                    h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (q7Var.f5794f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f5403g;
                    }
                    ArrayList<Long> dialogIds = this.f6249n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!q7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f6249n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            b6 b6Var2 = this.f6269w;
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f20577id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                y9 y9Var = this.f6276z0;
                if (y9Var != null) {
                    this.f6264t1 = y9Var.currentPosition;
                    this.f6276z0.release(null);
                    this.f6276z0 = null;
                    return;
                }
                this.f6264t1 = 0L;
            } else if (!this.f6262s1 && t() != null) {
                t().e1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final Bitmap e() {
        ei.d4 d4Var = this.D0;
        if (d4Var != null && d4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f6233f;
        if (o2Var != null && t() != null && AndroidUtilities.findActivity(o2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
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
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f6260s;
    }

    @Override
    public final View h() {
        ei.d4 d4Var = new ei.d4(this.D0.getContext(), this.h);
        this.E0 = d4Var;
        return d4Var;
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
                ei.d4 d4Var = this.D0;
                if (d4Var != null) {
                    d4Var.setSecure(!z11);
                }
                if (this.f6223b) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f6233f;
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
                    this.f6257r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f6257r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f6248n.updateViewLayout(this.f6260s, this.f6257r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f6242j0 = false;
            this.f6246l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new h9(this, 2));
            this.H.addListener(new i9(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f6268v1 == null) {
            if (this.f6253p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f6269w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f6227c0 && this.f6231e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f6231e0;
                b6 b6Var = this.f6269w;
                float f11 = b6Var.f5180c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f6231e0 = f12;
                    b6Var.setOffset(f12);
                }
            }
            float f13 = this.f6231e0;
            if (z10) {
                f7 = this.f6269w.f5180c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f6268v1 = ofFloat;
            ofFloat.addUpdateListener(new h9(this, 3));
            this.f6268v1.addListener(new ah.p0(4, this, z10));
            if (z10) {
                this.f6268v1.setDuration(350L);
                this.f6268v1.setInterpolator(bs.h);
            } else {
                this.f6268v1.setDuration(350L);
                this.f6268v1.setInterpolator(bs.f25133f);
            }
            this.f6268v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f6223b && (launchActivity = LaunchActivity.J1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        p4 currentPeerView;
        boolean z10 = false;
        if (this.f6231e0 != 0.0f) {
            b6 b6Var = this.f6269w;
            if (b6Var.f5186x > 0) {
                AndroidUtilities.hideKeyboard(b6Var);
                return true;
            }
            t5 currentPage = b6Var.getCurrentPage();
            if (currentPage != null) {
                y4 y4Var = currentPage.f5958r;
                h5 h5Var = currentPage.f5956f;
                if (h5Var != null && h5Var.f27043b) {
                    h5Var.a();
                    return true;
                } else if (Math.abs(currentPage.f5955c.getTranslationY() - y4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    y4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    y4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        p9 p9Var = this.f6249n0;
        if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.r0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f6269w == null) {
            b6 b6Var = new b6(this.v.getContext(), this);
            this.f6269w = b6Var;
            this.v.addView(b6Var, 0);
        }
        p4 currentPeerView = this.f6249n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f6193i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f6193i.get(i10)).storyItem);
                }
                this.f6269w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f6269w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f6260s);
        this.H0 = true;
        this.f6239h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f6224b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new h9(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            w9 w9Var = this.f6261s0;
            ImageReceiver imageReceiver = w9Var.f6068b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = w9Var.f6069c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            w9Var.f6069c = null;
            w9Var.f6068b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new s3(this, 2), 16L);
        if (this.f6228c1) {
            this.f6228c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        p4 currentPeerView = this.f6249n0.getCurrentPeerView();
        if (currentPeerView != null) {
            n4 n4Var = currentPeerView.O1;
            if (!n4Var.j() && n4Var.e) {
                currentPeerView.b1(true);
                return;
            }
        }
        this.f6230d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f6273x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f6253p0 != i10) {
            this.f6253p0 = i10;
            this.f6249n0.setKeyboardHeight(i10);
            this.f6249n0.requestLayout();
            b6 b6Var = this.f6269w;
            if (b6Var != null) {
                b6Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f6265u0 = dialog;
            dialog.setOnDismissListener(new cb(this, 4));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f6265u0 = null;
            return false;
        }
    }

    public final p4 t() {
        p9 p9Var = this.f6249n0;
        if (p9Var == null) {
            return null;
        }
        return p9Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f6260s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            w9 w9Var = this.f6261s0;
            ImageReceiver imageReceiver = w9Var.f6068b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = w9Var.f6069c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            w9Var.f6069c = null;
            w9Var.f6068b = null;
            o9 o9Var = this.v;
            if (o9Var != null) {
                o9Var.a(true);
            }
            this.J0.unlock();
            o4 o4Var = this.G0;
            if (o4Var != null) {
                o4Var.b();
            }
            I();
            if (this.f6223b) {
                AndroidUtilities.removeFromParent(this.f6260s);
            } else {
                this.f6248n.removeView(this.f6260s);
            }
            this.f6260s = null;
            this.m0 = false;
            this.d = false;
            o();
            s3 s3Var = this.f6252o1;
            if (s3Var != null) {
                s3Var.run();
                this.f6252o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f6255q0 && !this.f6272x && this.f6265u0 == null && this.f6267v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f6231e0 == 0.0f && !this.f6241i1) {
            if ((!this.l1 || !this.f6220a) && !this.f6245k1 && !this.f6243j1 && !this.f6254p1 && this.V == 0.0f && this.f6266u1 == null) {
                if (!this.f6223b || (o2Var = this.f6233f) == null || o2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: ci.z9.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f6233f.getContext());
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
