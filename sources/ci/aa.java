package ci;

import ai.ab;
import ai.ud;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class aa implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f5173x1;
    public static TL_stories.StoryItem f5175z1;
    public h1 A0;
    public s9 B0;
    public SurfaceView C0;
    public ei.d4 D0;
    public boolean E;
    public ei.d4 E0;
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
    public o7 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public a7 O0;
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
    public boolean f5177a0;
    public boolean f5178a1;
    public float f5180b0;
    public final t3 f5181b1;
    public boolean f5183c0;
    public boolean f5184c1;
    public float f5185d0;
    public j8 f5186d1;
    public float f5187e0;
    public final LongSparseIntArray f5188e1;
    public final org.telegram.ui.ActionBar.n2 f5189f;
    public boolean f5190f0;
    public boolean f5191f1;
    public boolean f5192g0;
    public boolean f5193g1;
    public int h;
    public boolean f5194h0;
    public boolean f5195h1;
    public GestureDetector f5196i0;
    public boolean f5197i1;
    public boolean f5198j0;
    public boolean f5199j1;
    public boolean f5200k0;
    public boolean f5201k1;
    public boolean f5202l0;
    public boolean l1;
    public boolean m0;
    public boolean f5203m1;
    public WindowManager f5204n;
    public q9 f5205n0;
    public androidx.fragment.app.d f5206n1;
    public t3 f5208o1;
    public int f5209p0;
    public boolean f5210p1;
    public boolean f5211q0;
    public float f5212q1;
    public WindowManager.LayoutParams f5213r;
    public float f5214r0;
    public boolean f5215r1;
    public o9 f5216s;
    public final x9 f5217s0;
    public boolean f5218s1;
    public w9 f5219t0;
    public long f5220t1;
    public Dialog f5221u0;
    public m7 f5222u1;
    public p9 v;
    public org.telegram.ui.ActionBar.j2 f5223v0;
    public ValueAnimator f5224v1;
    public c6 f5225w;
    public boolean f5226w0;
    public boolean f5227w1;
    public boolean f5228x;
    public final ArrayList f5229x0;
    public org.telegram.ui.o4 f5231y0;
    public z9 f5232z0;
    public static final ArrayList f5174y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f5176a = SharedConfig.useSurfaceInStories;
    public boolean f5179b = true;
    public boolean f5182c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f5230y = new b();
    public final RectF T = new RectF();
    public final float[] f5207o0 = new float[2];

    public aa(org.telegram.ui.ActionBar.n2 n2Var) {
        ?? obj = new Object();
        obj.f6181k = 1.0f;
        this.f5217s0 = obj;
        this.f5229x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f5181b1 = new t3(this, 4);
        this.f5188e1 = new LongSparseIntArray();
        new Paint(1);
        this.f5189f = n2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            E1.put(j10 + (j10 >> 16) + (storyItem.f20506id << 16), editable);
        }
    }

    public static boolean i(aa aaVar, o9 o9Var, float f7, float f10, boolean z10) {
        v2 v2Var;
        v2 v2Var2;
        if (o9Var != null) {
            if (!aaVar.X0) {
                if (aaVar.f5225w == null || aaVar.f5187e0 == 0.0f) {
                    q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - aaVar.v.getX()) - aaVar.f5205n0.getX()) - currentPeerView.getX(), ((f10 - aaVar.v.getY()) - aaVar.f5205n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f5830v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (v2Var2 = currentPeerView.f5768b2) != null && v2Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f5768b2.getY() + currentPeerView.getY() + aaVar.f5205n0.getY() + aaVar.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (v2Var = currentPeerView.f5768b2) != null && v2Var.u0()) || aaVar.f5222u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(o9Var, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(aa aaVar) {
        ud udVar;
        iu editField;
        q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f5768b2 != null && (((udVar = currentPeerView.f5769b3) == null || udVar.getVisibility() != 0) && (editField = currentPeerView.f5768b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new t3(aaVar, 6), 200L);
            return;
        }
        aaVar.m();
    }

    public static void k(aa aaVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(aaVar.X, aaVar.W) / AndroidUtilities.dp(80.0f)));
        if (aaVar.V != clamp01) {
            aaVar.V = clamp01;
            aaVar.o();
            q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f5838x2) {
                currentPeerView.invalidate();
            }
            h1 h1Var = aaVar.A0;
            if (h1Var != null) {
                h1Var.v((1.0f - aaVar.V) * aaVar.U);
            }
        }
        o9 o9Var = aaVar.f5216s;
        if (o9Var != null) {
            o9Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.f20506id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f5175z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f5175z1.messageId != messageObject.getId() || f5175z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, w9 w9Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, w9Var, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, a7 a7Var, TL_stories.PeerStories peerStories, w9 w9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f5229x0;
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
        z9 z9Var = this.f5232z0;
        if (z9Var != null) {
            z9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f5215r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5179b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f5176a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && a7Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f5175z1 = storyItem;
        }
        this.O0 = a7Var;
        this.Q0 = peerStories;
        this.f5219t0 = w9Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        q9 q9Var = this.f5205n0;
        if (q9Var != null) {
            q9Var.setHorizontalProgressToDismiss(0.0f);
            this.f5205n0.F0 = 0;
        }
        this.f5185d0 = 0.0f;
        this.Z = 0.0f;
        this.f5202l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f5178a1 = false;
        this.Z0 = false;
        this.f5188e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f5181b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f5213r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f5213r.flags = -2147417728;
        this.H0 = false;
        this.f5184c1 = false;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (this.f5216s == null) {
            this.f5196i0 = new GestureDetector(new k9(this));
            this.f5216s = new o9(this, context, R);
        }
        if (this.v == null) {
            this.v = new p9(context, this);
            q9 q9Var2 = new q9(this, this.h, context, this, this.f5230y);
            this.f5205n0 = q9Var2;
            q9Var2.setDelegate(new r9(this, a7Var, arrayList, context));
            this.v.addView(this.f5205n0, w7.z5.e(-1, -1, 1));
            this.f5231y0 = new org.telegram.ui.o4(context);
            if (this.f5176a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f5231y0.addView(this.C0);
            } else {
                s9 s9Var = new s9(context, this);
                this.B0 = s9Var;
                this.f5231y0.addView(s9Var);
            }
            ei.d4 d4Var = new ei.d4(context, this.h);
            this.D0 = d4Var;
            d4Var.setVisibility(8);
            this.f5231y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f5549a = paint;
            view.f5551c = new androidx.activity.i((Object) view, 11);
            view.d = new org.telegram.ui.Components.f6((View) view);
            view.e = new org.telegram.ui.Components.f6((View) view);
            paint.setColor(-1);
            this.f5186d1 = view;
            this.v.addView((View) view, w7.z5.a(-1.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 0));
        }
        ei.d4 d4Var2 = this.D0;
        if (d4Var2 != null) {
            d4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f5231y0);
        this.f5216s.addView(this.f5231y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f5216s.addView(this.v);
        this.f5216s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (a7Var != null) {
            this.f5205n0.D(this.h, a7Var.d, a7Var.h());
        } else {
            q9 q9Var3 = this.f5205n0;
            int i13 = this.h;
            q9Var3.A0 = arrayList;
            q9Var3.f5517y0 = i13;
            q9Var3.setAdapter(null);
            q9Var3.setAdapter(q9Var3.f5518z0);
            q9Var3.setCurrentItem(i11);
            q9Var3.C0 = true;
        }
        this.f5204n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f5179b = false;
        }
        if (this.f5179b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f5182c = z14;
        p9 p9Var = this.v;
        a1.c cVar = new a1.c(this, 21);
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.a0.i(p9Var, cVar);
        if (this.f5179b) {
            AndroidUtilities.removeFromParent(this.f5216s);
            this.f5216s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f5216s);
            if (!this.f5182c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f5216s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f5204n, this.f5216s, this.f5213r);
            this.f5204n.addView(this.f5216s, this.f5213r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f5216s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
            }
        }
        this.f5216s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f5173x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f5216s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f5179b) {
            z(true);
        }
        if (!this.f5179b) {
            f5174y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, a7 a7Var, r7 r7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(a7Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, a7Var, null, r7Var, false);
    }

    public final void D(Context context, long j10, w9 w9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        i7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f5493a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (d8.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.f5497g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, w9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, w9 w9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, w9Var, false);
            return;
        }
        this.f5229x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, r7 r7Var) {
        A(UserConfig.selectedAccount, context, storyItem, r7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, a7 a7Var, TL_stories.PeerStories peerStories, w9 w9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, a7Var, peerStories, w9Var, z10);
    }

    public final void H(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f5179b) {
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
        z9 z9Var = this.f5232z0;
        if (z9Var != null) {
            z9Var.release(null);
            this.f5232z0 = null;
        }
        ei.d4 d4Var = this.D0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        h1 h1Var = this.A0;
        if (h1Var != null) {
            p1 p1Var = p1.Z;
            if (!p1Var.S || p1Var.v != h1Var) {
                if (h1Var.f5446n) {
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
            ((z9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().f5502m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((ja) hVar.n(i11)).b(false);
        }
        if (this.f5179b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f5189f;
        if (n2Var != null) {
            n2Var.removeSheet(this);
        }
        f5174y1.remove(this);
        this.f5229x0.clear();
        this.f5187e0 = 0.0f;
        f5175z1 = null;
    }

    public final void K(boolean z10) {
        this.f5211q0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.f5186d1.f5551c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        q4 currentPeerView;
        q4 currentPeerView2;
        o4 o4Var;
        z9 z9Var;
        p4 p4Var;
        if (this.f5178a1 != z10) {
            this.f5178a1 = z10;
            if (z10 && !this.f5191f1 && (currentPeerView2 = this.f5205n0.getCurrentPeerView()) != null && (o4Var = currentPeerView2.O1) != null && !o4Var.f5693f && o4Var.f5691b == null) {
                if (!this.f5200k0 && !this.f5198j0 && (p4Var = this.G0) != null && ((z9) p4Var.f5729c) != null) {
                    currentPeerView2.f5771c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                p4 p4Var2 = this.G0;
                if (p4Var2 != null && (z9Var = (z9) p4Var2.f5729c) != null && !this.f5200k0) {
                    z9Var.setSeeking(true);
                }
                this.f5200k0 = true;
            }
            P();
            q9 q9Var = this.f5205n0;
            if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f5178a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (this.f5179b && launchActivity != null) {
            if (z10) {
                this.f5226w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f5226w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.n2 n2Var;
        Context context;
        if (this.A0 != null && (n2Var = this.f5189f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(n2Var.getContext());
            if (uf.b.a(findActivity) > 0) {
                h1 h1Var = this.A0;
                p1 p1Var = p1.Z;
                if (h1Var != null && !p1Var.S) {
                    p1Var.S = true;
                    p1Var.v = h1Var;
                    int i10 = h1Var.e;
                    p1Var.f5720w = i10;
                    NotificationCenter.getInstance(i10).addObserver(p1Var, NotificationCenter.liveStoryUpdated);
                    p1Var.J = p1Var.n();
                    p1Var.K = p1Var.m();
                    p1Var.M = 1.0f;
                    p1Var.H = false;
                    o1.k kVar = new o1.k(p1Var, p1.X);
                    o1.l lVar = new o1.l();
                    lVar.a(0.75f);
                    lVar.b(650.0f);
                    kVar.f17555u = lVar;
                    p1Var.P = kVar;
                    o1.k kVar2 = new o1.k(p1Var, p1.Y);
                    o1.l lVar2 = new o1.l();
                    lVar2.a(0.75f);
                    lVar2.b(650.0f);
                    kVar2.f17555u = lVar2;
                    p1Var.Q = kVar2;
                    if (findActivity != null) {
                        context = findActivity;
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    p1Var.f5721x = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    p1Var.f5721x.setStylusScaleEnabled(false);
                    p1Var.f5722y = new k0.b(context, new l1(scaledTouchSlop));
                    m1 m1Var = new m1(context, 0);
                    m1Var.f5605b = new Path();
                    p1Var.e = m1Var;
                    ?? viewGroup = new ViewGroup(context);
                    p1Var.d = viewGroup;
                    viewGroup.addView(p1Var.e, w7.z5.d(-1.0f, -1));
                    p1Var.e.setOutlineProvider(new o1(0));
                    p1Var.e.setClipToOutline(true);
                    p1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21049gg, false));
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                    p1Var.f5717n = w9Var;
                    p1Var.e.addView(w9Var, w7.z5.d(-1.0f, -1));
                    ei.d4 d4Var = new ei.d4(context, p1Var.f5720w);
                    p1Var.f5716f = d4Var;
                    d4Var.setAlpha(0.0f);
                    p1Var.e.addView(p1Var.f5716f, w7.z5.d(-1.0f, -1));
                    un unVar = new un(context, 1);
                    p1Var.f5718r = unVar;
                    p1Var.e.addView(unVar, w7.z5.d(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    p1Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    p1Var.h.addView(view, w7.z5.d(-1.0f, -1));
                    int dp = AndroidUtilities.dp(8.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.pip_video_close);
                    int i11 = org.telegram.ui.ActionBar.h6.f21065hg;
                    imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    int i12 = org.telegram.ui.ActionBar.h6.f21075i6;
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(dp, dp, dp, dp);
                    imageView.setOnClickListener(new ah.f(2));
                    float f7 = 38;
                    float f10 = 4;
                    p1Var.h.addView(imageView, w7.z5.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.pip_video_expand);
                    imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                    imageView2.setPadding(dp, dp, dp, dp);
                    imageView2.setOnClickListener(new ai.p(10, h1Var, context));
                    p1Var.h.addView(imageView2, w7.z5.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
                    p1Var.e.addView(p1Var.h, w7.z5.d(-1.0f, -1));
                    p1Var.f5714b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = uf.b.b(context, false);
                    p1Var.f5715c = b10;
                    int i13 = p1Var.J;
                    b10.width = i13;
                    b10.height = p1Var.K;
                    float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
                    p1Var.N = dp2;
                    b10.x = (int) dp2;
                    WindowManager.LayoutParams layoutParams = p1Var.f5715c;
                    float dp3 = (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f);
                    p1Var.O = dp3;
                    layoutParams.y = (int) dp3;
                    WindowManager.LayoutParams layoutParams2 = p1Var.f5715c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    p1Var.d.setAlpha(0.0f);
                    p1Var.d.setScaleX(0.1f);
                    p1Var.d.setScaleY(0.1f);
                    AndroidUtilities.setPreferredMaxRefreshRate(p1Var.f5714b, p1Var.d, p1Var.f5715c);
                    p1Var.f5714b.addView(p1Var.d, p1Var.f5715c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(bs.f25030f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(p1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(p1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(p1Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new ah.z(1));
                    animatorSet.start();
                    p1Var.i();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                    rf.d dVar = p1Var.L;
                    if (dVar != null) {
                        dVar.c();
                        p1Var.L = null;
                    }
                    if (findActivity != null && uf.b.a(findActivity) == 1) {
                        rf.c cVar = new rf.c(findActivity, p1Var);
                        cVar.f45281c = "pip-live-story";
                        cVar.e = 1;
                        cVar.d = AndroidUtilities.dp(10.0f);
                        cVar.f45285j = p1Var.d;
                        cVar.f45286k = p1Var.f5716f.getPlaceholderView();
                        p1Var.L = cVar.a();
                    }
                }
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        z9 z9Var = this.f5232z0;
        int i10 = 0;
        if (z9Var != null) {
            z9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((z9) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        q4 currentPeerView = this.f5205n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f5837x1.a(D1, true);
        }
        if (!D1) {
            this.f5186d1.b();
        }
    }

    public final void P() {
        if (this.f5205n0 == null) {
            return;
        }
        boolean w9 = w();
        boolean z10 = true;
        if (this.f5179b) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f5189f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.l4.x().V) {
            w9 = true;
        }
        this.f5205n0.setPaused(w9);
        z9 z9Var = this.f5232z0;
        if (z9Var != null) {
            if (w9) {
                z9Var.pause();
            } else {
                z9Var.play(B1);
            }
        }
        this.f5205n0.D0 = (this.f5228x || this.H0 || this.I0 || this.f5178a1 || this.f5191f1 || this.f5187e0 != 0.0f || this.f5199j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: ci.aa.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ei.d4 d4Var = this.E0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f5179b) {
            AndroidUtilities.removeFromParent(this.f5216s);
        } else {
            this.f5204n.removeView(this.f5216s);
        }
        this.f5216s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f5179b && this.f5216s != null) {
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
        if (this.f5179b) {
            AndroidUtilities.removeFromParent(this.f5216s);
            this.f5189f.getLayoutContainer().addView(this.f5216s);
        } else {
            this.f5204n.addView(this.f5216s, this.f5213r);
        }
        ei.d4 d4Var2 = this.E0;
        if (d4Var2 != null) {
            d4Var2.b();
            this.E0 = null;
        }
        this.f5216s.invalidate();
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
            if (this.O0 == ((a7) objArr[0])) {
                t();
                q9 q9Var = this.f5205n0;
                a7 a7Var = this.O0;
                q9Var.D(this.h, a7Var.d, a7Var.h());
                c6 c6Var = this.f5225w;
                if (c6Var != null) {
                    TL_stories.StoryItem selectedStory = c6Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f5151i.size()) {
                        if (selectedStory != null && selectedStory.f20506id == ((MessageObject) this.O0.f5151i.get(i12)).storyItem.f20506id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f5151i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f5225w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            w9 w9Var = this.f5219t0;
            if (w9Var instanceof r7) {
                r7 r7Var = (r7) w9Var;
                if (r7Var.f5928r && !r7Var.f5927n) {
                    i7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (r7Var.f5926f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f5497g;
                    }
                    ArrayList<Long> dialogIds = this.f5205n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!r7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f5205n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            c6 c6Var2 = this.f5225w;
            if (c6Var2 != null) {
                ArrayList arrayList3 = c6Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((w4) arrayList3.get(i12)).b();
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f20506id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                z9 z9Var = this.f5232z0;
                if (z9Var != null) {
                    this.f5220t1 = z9Var.currentPosition;
                    this.f5232z0.release(null);
                    this.f5232z0 = null;
                    return;
                }
                this.f5220t1 = 0L;
            } else if (!this.f5218s1 && t() != null) {
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
        ei.d4 d4Var = this.D0;
        if (d4Var != null && d4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f5189f;
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
        return i0.b.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f5216s;
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
                if (this.f5179b) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f5189f;
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
                    this.f5213r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f5213r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f5204n.updateViewLayout(this.f5216s, this.f5213r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f5198j0 = false;
            this.f5202l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new i9(this, 2));
            this.H.addListener(new j9(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.o1.f21628w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f5224v1 == null) {
            if (this.f5209p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f5225w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f5183c0 && this.f5187e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f5187e0;
                c6 c6Var = this.f5225w;
                float f11 = c6Var.f5281c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f5187e0 = f12;
                    c6Var.setOffset(f12);
                }
            }
            float f13 = this.f5187e0;
            if (z10) {
                f7 = this.f5225w.f5281c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f5224v1 = ofFloat;
            ofFloat.addUpdateListener(new i9(this, 3));
            this.f5224v1.addListener(new ah.p0(4, this, z10));
            if (z10) {
                this.f5224v1.setDuration(350L);
                this.f5224v1.setInterpolator(bs.h);
            } else {
                this.f5224v1.setDuration(350L);
                this.f5224v1.setInterpolator(bs.f25030f);
            }
            this.f5224v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f5179b && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        q4 currentPeerView;
        boolean z10 = false;
        if (this.f5187e0 != 0.0f) {
            c6 c6Var = this.f5225w;
            if (c6Var.f5287x > 0) {
                AndroidUtilities.hideKeyboard(c6Var);
                return true;
            }
            u5 currentPage = c6Var.getCurrentPage();
            if (currentPage != null) {
                z4 z4Var = currentPage.f6053r;
                i5 i5Var = currentPage.f6051f;
                if (i5Var != null && i5Var.f26928b) {
                    i5Var.a();
                    return true;
                } else if (Math.abs(currentPage.f6050c.getTranslationY() - z4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    z4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    z4Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        q9 q9Var = this.f5205n0;
        if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f5225w == null) {
            c6 c6Var = new c6(this.v.getContext(), this);
            this.f5225w = c6Var;
            this.v.addView(c6Var, 0);
        }
        q4 currentPeerView = this.f5205n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f5151i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f5151i.get(i10)).storyItem);
                }
                this.f5225w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f5225w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f5216s);
        this.H0 = true;
        this.f5195h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f5180b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new i9(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            x9 x9Var = this.f5217s0;
            ImageReceiver imageReceiver = x9Var.f6175b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = x9Var.f6176c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            x9Var.f6176c = null;
            x9Var.f6175b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new t3(this, 2), 16L);
        if (this.f5184c1) {
            this.f5184c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        q4 currentPeerView = this.f5205n0.getCurrentPeerView();
        if (currentPeerView != null) {
            o4 o4Var = currentPeerView.O1;
            if (!o4Var.j() && o4Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f5186d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f5229x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f5209p0 != i10) {
            this.f5209p0 = i10;
            this.f5205n0.setKeyboardHeight(i10);
            this.f5205n0.requestLayout();
            c6 c6Var = this.f5225w;
            if (c6Var != null) {
                c6Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f5221u0 = dialog;
            dialog.setOnDismissListener(new ab(this, 4));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f5221u0 = null;
            return false;
        }
    }

    public final q4 t() {
        q9 q9Var = this.f5205n0;
        if (q9Var == null) {
            return null;
        }
        return q9Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f5216s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            x9 x9Var = this.f5217s0;
            ImageReceiver imageReceiver = x9Var.f6175b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = x9Var.f6176c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            x9Var.f6176c = null;
            x9Var.f6175b = null;
            p9 p9Var = this.v;
            if (p9Var != null) {
                p9Var.a(true);
            }
            this.J0.unlock();
            p4 p4Var = this.G0;
            if (p4Var != null) {
                p4Var.b();
            }
            I();
            if (this.f5179b) {
                AndroidUtilities.removeFromParent(this.f5216s);
            } else {
                this.f5204n.removeView(this.f5216s);
            }
            this.f5216s = null;
            this.m0 = false;
            this.d = false;
            o();
            t3 t3Var = this.f5208o1;
            if (t3Var != null) {
                t3Var.run();
                this.f5208o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f5211q0 && !this.f5228x && this.f5221u0 == null && this.f5223v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f5187e0 == 0.0f && !this.f5197i1) {
            if ((!this.l1 || !this.f5176a) && !this.f5201k1 && !this.f5199j1 && !this.f5210p1 && this.V == 0.0f && this.f5222u1 == null) {
                if (!this.f5179b || (n2Var = this.f5189f) == null || n2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: ci.aa.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f5189f.getContext());
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
