package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.PixelCopy;
import android.view.RoundedCorner;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.utils.twidget.z;
public final class rs0 extends d implements jm7 {
    public static final d53 F = new d53(0.2d, 0.1d, 0.35d, 0.9d);
    public final RectF E;
    public final long a;
    public TLRPC.UserFull b;
    public su c;
    public ss0 d;
    public qs0 e;
    public zja f;
    public boolean h;
    public final ls0 n;
    public float r;
    public eq s;
    public boolean w;
    public float x;
    public AnimatorSet y;

    public rs0(Bundle bundle) {
        super(bundle);
        this.n = new ls0(this, (byte) 0);
        this.r = -1.0f;
        this.x = 1.0f;
        this.E = new RectF();
        this.a = bundle.getLong("user_id");
        this.hasOwnBackground = true;
    }

    public static rs0 f0(int i, long j) {
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
        if (W1 != null && W1.bot && !z.a()) {
            TLRPC.UserFull X1 = oc7.r1(i).X1(j);
            boolean z = e21.a;
            if (X1 != null && X1.bot_profile_widget != null) {
                return new rs0(kt6.k(j, "user_id"));
            }
            return null;
        }
        return null;
    }

    public static void k0(View view, int[] iArr, RectF rectF) {
        if (view == null) {
            return;
        }
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int i = iArr2[0] - iArr[0];
        rectF.set(i, iArr2[1] - iArr[1], view.getWidth() + i, view.getHeight() + (iArr2[1] - iArr[1]));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 9));
        zja a = this.simpleActionBar.t().a(0, 2131231248);
        this.f = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        this.f.e(1, 2131232191, jb6.M0(2131752959, null));
        this.f.e(2, 2131232119, jb6.M0(2131752965, null));
        this.f.e(3, 2131232360, jb6.M0(2131745570, null));
        this.f.e(4, 2131232262, jb6.M0(2131748071, null));
        this.f.e(5, 2131232418, jb6.M0(2131743536, null));
        this.f.e(6, 2131232369, jb6.M0(2131752935, null));
        this.f.e(7, 2131232074, jb6.M0(2131752960, null));
        this.f.e(8, 2131232348, jb6.M0(2131752948, null));
        this.f.e(9, 2131231866, jb6.M0(2131752966, null));
        this.f.e(10, 2131232339, jb6.M0(2131745964, null));
        p0();
        this.c = new su(this, context);
        this.d = new ss0(context, this.currentAccount, this.a, getResourceProvider(), new os0(this));
        su suVar = this.c;
        xg0 xg0Var = new xg0(this, (byte) 13);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(suVar, xg0Var);
        this.c.addView(this.d, qoe.c(-1.0f, -1));
        this.fragmentView = this.c;
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.g(this.c, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new ms0(this, (byte) 0);
        this.simpleActionBar.setBackground(null);
        qs0 qs0Var = new qs0(this, context, baseSimpleGlass);
        this.e = qs0Var;
        this.c.addView(qs0Var, qoe.c(-1.0f, -1));
        im0 im0Var = this.e.a;
        im0Var.p(qqd.l(getResourceProvider()));
        im0Var.q(gm.L(6.0f));
        this.e.c();
        q0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ss0 ss0Var;
        if (i == nm7.E0) {
            if (((Long) objArr[0]).longValue() == this.a) {
                this.b = (TLRPC.UserFull) objArr[1];
                q0();
                p0();
            }
        } else if (i == 2) {
            qs0 qs0Var = this.e;
            if (qs0Var != null) {
                qs0Var.c();
            }
            p0();
        } else if (i == nm7.r && (ss0Var = this.d) != null) {
            ss0Var.k();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e0() {
        if (getMessagesController().x0.indexOfKey(this.a) < 0) {
            TLRPC.UserFull userFull = this.b;
            if (userFull == null || !userFull.blocked) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void g0(int i) {
        boolean z;
        String p;
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User W1 = messagesController.W1(Long.valueOf(j));
        if (i == -1) {
            finishFragment();
            return;
        }
        boolean z2 = true;
        if (i == 1) {
            presentFragment(new ProfileActivity(kt6.k(j, "user_id"), null));
        } else if (i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    z = false;
                } else if (i == 6) {
                    if (W1 == null) {
                        p = null;
                    } else {
                        p = m9c.p(W1);
                    }
                    if (!TextUtils.isEmpty(p)) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", "https://" + getMessagesController().N2 + "/" + p);
                            startActivityForResult(Intent.createChooser(intent, jb6.M0(2131752935, null)), 500);
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    return;
                } else if (i == 7 && W1 != null) {
                    ik.r(this, false, null, W1, false, true, false, true, new o(this, W1, (byte) 23));
                    return;
                } else if (i == 8) {
                    ls0 ls0Var = new ls0(this, (byte) 1);
                    if (e0()) {
                        getMessagesController().n5(ls0Var, j);
                        return;
                    } else {
                        ls0Var.run();
                        return;
                    }
                } else if (i == 9) {
                    wu0.l(this.currentAccount, j);
                    return;
                } else if (i == 10) {
                    da9.E0(this.currentAccount, getParentActivity(), c41.b0(this), j);
                    return;
                } else {
                    return;
                }
            } else {
                z = true;
            }
            getNotificationsController().G(this.a, 0L, z);
            c41.A(this, z, getResourceProvider()).j();
            p0();
        } else {
            if (i != 3) {
                z2 = false;
            }
            h0(z2);
        }
    }

    public final void h0(boolean z) {
        if (j0() != null && !z) {
            finishFragment();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a);
        yv1 yv1Var = new yv1(bundle);
        presentFragment(yv1Var);
        if (z) {
            gm.d3(new mz(yv1Var, (byte) 1), 300L);
        }
    }

    public final void i0(RectF rectF) {
        eq eqVar = this.s;
        if (eqVar != null) {
            RectF rectF2 = (RectF) eqVar.a;
            float f = this.x;
            if (f < 1.0f) {
                rectF.set(gm.R1(rectF2.left, 0.0f, f), gm.R1(rectF2.top, 0.0f, f), gm.R1(rectF2.right, this.c.getWidth(), f), gm.R1(rectF2.bottom, this.c.getHeight(), f));
                return;
            }
        }
        rectF.set(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight());
    }

    @Override
    public final boolean isLightStatusBar() {
        float f = this.r;
        if (f < 0.0f) {
            f = gm.B(getThemedColor(cmb.c6));
        }
        if (f > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final yv1 j0() {
        int indexOf;
        d dVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            if (fragmentStack == null) {
                indexOf = -1;
            } else {
                indexOf = fragmentStack.indexOf(this);
            }
            if (indexOf > 0) {
                dVar = (d) fragmentStack.get(indexOf - 1);
            } else {
                dVar = null;
            }
            if (dVar instanceof yv1) {
                yv1 yv1Var = (yv1) dVar;
                if (yv1Var.a() == this.a) {
                    return yv1Var;
                }
            }
        }
        return null;
    }

    public final void l0() {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && getParentActivity() != null && this.c.isAttachedToWindow()) {
            int[] iArr = new int[2];
            this.c.getLocationInWindow(iArr);
            int max = Math.max(1, this.d.x.top);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + max);
            if (rect.width() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(16, 4, Bitmap.Config.ARGB_8888);
                try {
                    PixelCopy.request(getParentActivity().getWindow(), rect, createBitmap, new ol(this, createBitmap, (byte) 1), new Handler(Looper.getMainLooper()));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final float m0() {
        su suVar;
        RoundedCorner roundedCorner;
        if (Build.VERSION.SDK_INT >= 31 && (suVar = this.c) != null && suVar.getRootWindowInsets() != null && (roundedCorner = this.c.getRootWindowInsets().getRoundedCorner(0)) != null) {
            return roundedCorner.getRadius();
        }
        return 0.0f;
    }

    public final void n0(float f) {
        float min;
        this.x = f;
        su suVar = this.c;
        if (suVar != null) {
            suVar.invalidate();
            this.d.invalidateOutline();
            ss0 ss0Var = this.d;
            eq eqVar = this.s;
            float f2 = 1.0f;
            if (eqVar != null && !this.w) {
                min = 0.0f;
            } else if (eqVar == null) {
                min = 1.0f;
            } else {
                min = Math.min(1.0f, this.x / 0.22f);
            }
            ss0Var.setAlpha(min);
            rja rjaVar = this.simpleActionBar;
            if (this.s != null && !this.w) {
                f2 = 0.0f;
            }
            rjaVar.setAlpha(f2);
        }
        qs0 qs0Var = this.e;
        if (qs0Var != null) {
            qs0Var.invalidate();
        }
        this.glassEngine.g();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return false;
    }

    public final void o0(int i, boolean z) {
        zja zjaVar = this.f;
        if (z) {
            zjaVar.S(i);
        } else {
            zjaVar.u(i);
        }
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs0.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User W1 = messagesController.W1(Long.valueOf(j));
        if (W1 == null) {
            return false;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(j);
        this.b = X1;
        if (X1 == null) {
            getMessagesController().b3(W1, this.classGuid, true, null);
        }
        getNotificationCenter().a(this, nm7.E0);
        getNotificationCenter().a(this, 2);
        getNotificationCenter().a(this, nm7.r);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.r);
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.c();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.setActive(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.setActive(true);
            this.d.k();
        }
        p0();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            gm.d3(new ls0(this, (byte) 0), 32L);
        }
    }

    public final void p0() {
        if (this.f == null) {
            return;
        }
        boolean o2 = getMessagesController().o2(this.a, 0L, null);
        boolean e0 = e0();
        o0(4, !o2);
        o0(5, o2);
        o0(7, !e0);
        o0(8, e0);
    }

    public final void q0() {
        TL_bots.TL_botProfileWidget tL_botProfileWidget;
        boolean z = e21.a;
        TLRPC.UserFull userFull = this.b;
        if (userFull != null) {
            tL_botProfileWidget = userFull.bot_profile_widget;
        } else {
            tL_botProfileWidget = null;
        }
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            if (tL_botProfileWidget == null) {
                if (userFull != null && !this.h && !this.finishing) {
                    this.h = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.a);
                    presentFragment(new ProfileActivity(bundle, null), true);
                    return;
                }
                return;
            }
            ss0Var.setWidget(tL_botProfileWidget);
            this.d.k();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
