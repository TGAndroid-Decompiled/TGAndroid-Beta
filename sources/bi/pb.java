package bi;

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
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
public final class pb implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, sf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f3555x1;
    public static TL_stories.StoryItem f3557z1;
    public t1 A0;
    public hb B0;
    public SurfaceView C0;
    public di.l4 D0;
    public boolean E;
    public di.l4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public n5 G0;
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
    public a9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public l8 O0;
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
    public boolean f3559a0;
    public boolean f3560a1;
    public float f3562b0;
    public final p4 f3563b1;
    public boolean f3565c0;
    public boolean f3566c1;
    public float f3567d0;
    public v9 f3568d1;
    public float f3570e0;
    public final LongSparseIntArray f3571e1;
    public final org.telegram.ui.ActionBar.n2 f3572f;
    public boolean f3573f0;
    public boolean f3574f1;
    public boolean f3575g0;
    public boolean f3576g1;
    public int h;
    public boolean f3577h0;
    public boolean f3578h1;
    public GestureDetector f3579i0;
    public boolean f3580i1;
    public boolean f3581j0;
    public boolean f3582j1;
    public boolean f3583k0;
    public boolean f3584k1;
    public boolean f3585l0;
    public boolean l1;
    public boolean m0;
    public boolean f3586m1;
    public WindowManager f3587n;
    public fb f3588n0;
    public oa f3589n1;
    public p4 f3591o1;
    public int f3592p0;
    public boolean f3593p1;
    public boolean f3594q0;
    public float f3595q1;
    public WindowManager.LayoutParams f3596r;
    public float f3597r0;
    public boolean f3598r1;
    public db f3599s;
    public final mb f3600s0;
    public boolean f3601s1;
    public lb f3602t0;
    public long f3603t1;
    public Dialog f3604u0;
    public y8 f3605u1;
    public eb v;
    public org.telegram.ui.ActionBar.j2 f3606v0;
    public ValueAnimator f3607v1;
    public a7 f3608w;
    public boolean f3609w0;
    public boolean f3610w1;
    public boolean f3611x;
    public final ArrayList f3612x0;
    public org.telegram.ui.l4 f3614y0;
    public ob f3615z0;
    public static final ArrayList f3556y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f3558a = SharedConfig.useSurfaceInStories;
    public boolean f3561b = true;
    public boolean f3564c = false;
    public boolean d = false;
    public boolean f3569e = true;
    public final b f3613y = new b();
    public final RectF T = new RectF();
    public final float[] f3590o0 = new float[2];

    public pb(org.telegram.ui.ActionBar.n2 n2Var) {
        ?? obj = new Object();
        obj.f3368k = 1.0f;
        this.f3600s0 = obj;
        this.f3612x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f3563b1 = new p4(this, 4);
        this.f3571e1 = new LongSparseIntArray();
        new Paint(1);
        this.f3572f = n2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f20134id << 16), editable);
        }
    }

    public static boolean i(pb pbVar, db dbVar, float f7, float f10, boolean z10) {
        n3 n3Var;
        n3 n3Var2;
        if (dbVar != null) {
            if (!pbVar.X0) {
                if (pbVar.f3608w == null || pbVar.f3570e0 == 0.0f) {
                    o5 currentPeerView = pbVar.f3588n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - pbVar.v.getX()) - pbVar.f3588n0.getX()) - currentPeerView.getX(), ((f10 - pbVar.v.getY()) - pbVar.f3588n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f3494v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (n3Var2 = currentPeerView.f3433b2) != null && n3Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f3433b2.getY() + currentPeerView.getY() + pbVar.f3588n0.getY() + pbVar.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (n3Var = currentPeerView.f3433b2) != null && n3Var.w0()) || pbVar.f3605u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(dbVar, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(pb pbVar) {
        c4 c4Var;
        zt editField;
        o5 currentPeerView = pbVar.f3588n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f3433b2 != null && (((c4Var = currentPeerView.f3434b3) == null || c4Var.getVisibility() != 0) && (editField = currentPeerView.f3433b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new p4(pbVar, 6), 200L);
            return;
        }
        pbVar.m();
    }

    public static void k(pb pbVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(pbVar.X, pbVar.W) / AndroidUtilities.dp(80.0f)));
        if (pbVar.V != clamp01) {
            pbVar.V = clamp01;
            pbVar.o();
            o5 currentPeerView = pbVar.f3588n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f3502x2) {
                currentPeerView.invalidate();
            }
            t1 t1Var = pbVar.A0;
            if (t1Var != null) {
                t1Var.v((1.0f - pbVar.V) * pbVar.U);
            }
        }
        db dbVar = pbVar.f3599s;
        if (dbVar != null) {
            dbVar.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f20134id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f3557z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f3557z1.messageId != messageObject.getId() || f3557z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, lb lbVar) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, lbVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, l8 l8Var, TL_stories.PeerStories peerStories, lb lbVar, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f3612x0;
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
        ob obVar = this.f3615z0;
        if (obVar != null) {
            obVar.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f3598r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3561b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f3558a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && l8Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f3557z1 = storyItem;
        }
        this.O0 = l8Var;
        this.Q0 = peerStories;
        this.f3602t0 = lbVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        fb fbVar = this.f3588n0;
        if (fbVar != null) {
            fbVar.setHorizontalProgressToDismiss(0.0f);
            this.f3588n0.F0 = 0;
        }
        this.f3567d0 = 0.0f;
        this.Z = 0.0f;
        this.f3585l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f3560a1 = false;
        this.Z0 = false;
        this.f3571e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f3563b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3596r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f3596r.flags = -2147417728;
        this.H0 = false;
        this.f3566c1 = false;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (this.f3599s == null) {
            this.f3579i0 = new GestureDetector(new za(this));
            this.f3599s = new db(this, context, R);
        }
        if (this.v == null) {
            this.v = new eb(context, this);
            fb fbVar2 = new fb(this, this.h, context, this, this.f3613y);
            this.f3588n0 = fbVar2;
            fbVar2.setDelegate(new gb(this, l8Var, arrayList, context));
            this.v.addView(this.f3588n0, w7.x5.e(-1, -1, 1));
            this.f3614y0 = new org.telegram.ui.l4(context);
            if (this.f3558a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f3614y0.addView(this.C0);
            } else {
                hb hbVar = new hb(context, this);
                this.B0 = hbVar;
                this.f3614y0.addView(hbVar);
            }
            di.l4 l4Var = new di.l4(context, this.h);
            this.D0 = l4Var;
            l4Var.setVisibility(8);
            this.f3614y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f3933a = paint;
            view.f3935c = new androidx.activity.i((Object) view, 10);
            view.d = new org.telegram.ui.Components.e6((View) view);
            view.f3936e = new org.telegram.ui.Components.e6((View) view);
            paint.setColor(-1);
            this.f3568d1 = view;
            this.v.addView((View) view, w7.x5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        di.l4 l4Var2 = this.D0;
        if (l4Var2 != null) {
            l4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f3614y0);
        this.f3599s.addView(this.f3614y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f3599s.addView(this.v);
        this.f3599s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (l8Var != null) {
            this.f3588n0.D(this.h, l8Var.d, l8Var.h());
        } else {
            fb fbVar3 = this.f3588n0;
            int i13 = this.h;
            fbVar3.A0 = arrayList;
            fbVar3.f3857y0 = i13;
            fbVar3.setAdapter(null);
            fbVar3.setAdapter(fbVar3.f3858z0);
            fbVar3.setCurrentItem(i11);
            fbVar3.C0 = true;
        }
        this.f3587n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f3561b = false;
        }
        if (this.f3561b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f3564c = z14;
        eb ebVar = this.v;
        a1.c cVar = new a1.c(this, 10);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.a0.j(ebVar, cVar);
        if (this.f3561b) {
            AndroidUtilities.removeFromParent(this.f3599s);
            this.f3599s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f3599s);
            if (!this.f3564c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f3599s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f3587n, this.f3599s, this.f3596r);
            this.f3587n.addView(this.f3599s, this.f3596r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f3599s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
            }
        }
        this.f3599s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f3555x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f3599s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f3561b) {
            z(true);
        }
        if (!this.f3561b) {
            f3556y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, l8 l8Var, d9 d9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(l8Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, l8Var, null, d9Var, false);
    }

    public final void D(Context context, long j3, lb lbVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        u8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f3832a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (p9.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.f3837g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, lbVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, lb lbVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, lbVar, false);
            return;
        }
        this.f3612x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, d9 d9Var) {
        A(UserConfig.selectedAccount, context, storyItem, d9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, l8 l8Var, TL_stories.PeerStories peerStories, lb lbVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, l8Var, peerStories, lbVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f3561b) {
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
        ob obVar = this.f3615z0;
        if (obVar != null) {
            obVar.release(null);
            this.f3615z0 = null;
        }
        di.l4 l4Var = this.D0;
        if (l4Var != null) {
            l4Var.d(0L, null);
        }
        t1 t1Var = this.A0;
        if (t1Var != null) {
            a2 a2Var = a2.Z;
            if (!a2Var.S || a2Var.v != t1Var) {
                if (t1Var.f3747n) {
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
            ((ob) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().f3842m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((yb) iVar.n(i11)).b(false);
        }
        if (this.f3561b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f3572f;
        if (n2Var != null) {
            n2Var.removeSheet(this);
        }
        f3556y1.remove(this);
        this.f3612x0.clear();
        this.f3570e0 = 0.0f;
        f3557z1 = null;
    }

    public final void K(boolean z10) {
        this.f3594q0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.f3568d1.f3935c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        o5 currentPeerView;
        o5 currentPeerView2;
        m5 m5Var;
        ob obVar;
        n5 n5Var;
        if (this.f3560a1 != z10) {
            this.f3560a1 = z10;
            if (z10 && !this.f3574f1 && (currentPeerView2 = this.f3588n0.getCurrentPeerView()) != null && (m5Var = currentPeerView2.O1) != null && !m5Var.f3341f && m5Var.f3338b == null) {
                if (!this.f3583k0 && !this.f3581j0 && (n5Var = this.G0) != null && ((ob) n5Var.f3393c) != null) {
                    currentPeerView2.f3436c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                n5 n5Var2 = this.G0;
                if (n5Var2 != null && (obVar = (ob) n5Var2.f3393c) != null && !this.f3583k0) {
                    obVar.setSeeking(true);
                }
                this.f3583k0 = true;
            }
            P();
            fb fbVar = this.f3588n0;
            if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f3560a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f3561b && launchActivity != null) {
            if (z10) {
                this.f3609w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f3609w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.A0 != null && (n2Var = this.f3572f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(n2Var.getContext());
            if (tf.c.a(findActivity) > 0) {
                a2.o(findActivity, this.A0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        ob obVar = this.f3615z0;
        int i10 = 0;
        if (obVar != null) {
            obVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ob) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        o5 currentPeerView = this.f3588n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f3501x1.a(D1, true);
        }
        if (!D1) {
            this.f3568d1.b();
        }
    }

    public final void P() {
        if (this.f3588n0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f3561b) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f3572f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.i4.x().V) {
            w10 = true;
        }
        this.f3588n0.setPaused(w10);
        ob obVar = this.f3615z0;
        if (obVar != null) {
            if (w10) {
                obVar.pause();
            } else {
                obVar.play(B1);
            }
        }
        this.f3588n0.D0 = (this.f3611x || this.H0 || this.I0 || this.f3560a1 || this.f3574f1 || this.f3570e0 != 0.0f || this.f3582j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: bi.pb.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        di.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f3561b) {
            AndroidUtilities.removeFromParent(this.f3599s);
        } else {
            this.f3587n.removeView(this.f3599s);
        }
        this.f3599s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f3561b && this.f3599s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        di.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f3561b) {
            AndroidUtilities.removeFromParent(this.f3599s);
            this.f3572f.getLayoutContainer().addView(this.f3599s);
        } else {
            this.f3587n.addView(this.f3599s, this.f3596r);
        }
        di.l4 l4Var2 = this.E0;
        if (l4Var2 != null) {
            l4Var2.b();
            this.E0 = null;
        }
        this.f3599s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        di.l4 l4Var = this.E0;
        if (l4Var != null && l4Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((l8) objArr[0])) {
                t();
                fb fbVar = this.f3588n0;
                l8 l8Var = this.O0;
                fbVar.D(this.h, l8Var.d, l8Var.h());
                a7 a7Var = this.f3608w;
                if (a7Var != null) {
                    TL_stories.StoryItem selectedStory = a7Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f3302i.size()) {
                        if (selectedStory != null && selectedStory.f20134id == ((MessageObject) this.O0.f3302i.get(i12)).storyItem.f20134id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f3302i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f3608w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            lb lbVar = this.f3602t0;
            if (lbVar instanceof d9) {
                d9 d9Var = (d9) lbVar;
                if (d9Var.f2901r && !d9Var.f2900n) {
                    u8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (d9Var.f2899f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f3837g;
                    }
                    ArrayList<Long> dialogIds = this.f3588n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!d9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f3588n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            a7 a7Var2 = this.f3608w;
            if (a7Var2 != null) {
                ArrayList arrayList3 = a7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((v5) arrayList3.get(i12)).b();
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
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f20134id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                ob obVar = this.f3615z0;
                if (obVar != null) {
                    this.f3603t1 = obVar.currentPosition;
                    this.f3615z0.release(null);
                    this.f3615z0 = null;
                    return;
                }
                this.f3603t1 = 0L;
            } else if (!this.f3601s1 && t() != null) {
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
        di.l4 l4Var = this.D0;
        if (l4Var != null && l4Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f3572f;
        if (n2Var != null && t() != null && AndroidUtilities.findActivity(n2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final yc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f3599s;
    }

    @Override
    public final View h() {
        di.l4 l4Var = new di.l4(this.D0.getContext(), this.h);
        this.E0 = l4Var;
        return l4Var;
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
            if (this.f3569e != z11) {
                this.f3569e = z11;
                SurfaceView surfaceView = this.C0;
                if (surfaceView != null) {
                    surfaceView.setSecure(!z11);
                }
                di.l4 l4Var = this.D0;
                if (l4Var != null) {
                    l4Var.setSecure(!z11);
                }
                if (this.f3561b) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f3572f;
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
                    this.f3596r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f3596r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f3587n.updateViewLayout(this.f3599s, this.f3596r);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f3581j0 = false;
            this.f3585l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new xa(this, 2));
            this.H.addListener(new ya(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f3607v1 == null) {
            if (this.f3592p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f3608w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f3565c0 && this.f3570e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f3570e0;
                a7 a7Var = this.f3608w;
                float f11 = a7Var.f2790c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f3570e0 = f12;
                    a7Var.setOffset(f12);
                }
            }
            float f13 = this.f3570e0;
            if (z10) {
                f7 = this.f3608w.f2790c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f3607v1 = ofFloat;
            ofFloat.addUpdateListener(new xa(this, 3));
            this.f3607v1.addListener(new ah.q0(4, this, z10));
            if (z10) {
                this.f3607v1.setDuration(350L);
                this.f3607v1.setInterpolator(pr.h);
            } else {
                this.f3607v1.setDuration(350L);
                this.f3607v1.setInterpolator(pr.f29493f);
            }
            this.f3607v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f3561b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        o5 currentPeerView;
        boolean z10 = false;
        if (this.f3570e0 != 0.0f) {
            a7 a7Var = this.f3608w;
            if (a7Var.f2797x > 0) {
                AndroidUtilities.hideKeyboard(a7Var);
                return true;
            }
            s6 currentPage = a7Var.getCurrentPage();
            if (currentPage != null) {
                y5 y5Var = currentPage.f3723r;
                g6 g6Var = currentPage.f3721f;
                if (g6Var != null && g6Var.f32350b) {
                    g6Var.a();
                    return true;
                } else if (Math.abs(currentPage.f3719c.getTranslationY() - y5Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    y5Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    y5Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        fb fbVar = this.f3588n0;
        if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f3608w == null) {
            a7 a7Var = new a7(this.v.getContext(), this);
            this.f3608w = a7Var;
            this.v.addView(a7Var, 0);
        }
        o5 currentPeerView = this.f3588n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f3302i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f3302i.get(i10)).storyItem);
                }
                this.f3608w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f3608w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f3599s);
        this.H0 = true;
        this.f3578h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f3562b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new xa(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            mb mbVar = this.f3600s0;
            ImageReceiver imageReceiver = mbVar.f3361b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = mbVar.f3362c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            mbVar.f3362c = null;
            mbVar.f3361b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new p4(this, 2), 16L);
        if (this.f3566c1) {
            this.f3566c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        o5 currentPeerView = this.f3588n0.getCurrentPeerView();
        if (currentPeerView != null) {
            m5 m5Var = currentPeerView.O1;
            if (!m5Var.j() && m5Var.f3340e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f3568d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f3612x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f3592p0 != i10) {
            this.f3592p0 = i10;
            this.f3588n0.setKeyboardHeight(i10);
            this.f3588n0.requestLayout();
            a7 a7Var = this.f3608w;
            if (a7Var != null) {
                a7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f3604u0 = dialog;
            dialog.setOnDismissListener(new r4(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f3604u0 = null;
            return false;
        }
    }

    public final o5 t() {
        fb fbVar = this.f3588n0;
        if (fbVar == null) {
            return null;
        }
        return fbVar.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f3599s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            mb mbVar = this.f3600s0;
            ImageReceiver imageReceiver = mbVar.f3361b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = mbVar.f3362c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            mbVar.f3362c = null;
            mbVar.f3361b = null;
            eb ebVar = this.v;
            if (ebVar != null) {
                ebVar.a(true);
            }
            this.J0.unlock();
            n5 n5Var = this.G0;
            if (n5Var != null) {
                n5Var.b();
            }
            I();
            if (this.f3561b) {
                AndroidUtilities.removeFromParent(this.f3599s);
            } else {
                this.f3587n.removeView(this.f3599s);
            }
            this.f3599s = null;
            this.m0 = false;
            this.d = false;
            o();
            p4 p4Var = this.f3591o1;
            if (p4Var != null) {
                p4Var.run();
                this.f3591o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f3594q0 && !this.f3611x && this.f3604u0 == null && this.f3606v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f3570e0 == 0.0f && !this.f3580i1) {
            if ((!this.l1 || !this.f3558a) && !this.f3584k1 && !this.f3582j1 && !this.f3593p1 && this.V == 0.0f && this.f3605u1 == null) {
                if (!this.f3561b || (n2Var = this.f3572f) == null || n2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: bi.pb.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f3572f.getContext());
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
