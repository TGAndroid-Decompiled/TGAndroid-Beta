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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.utils.twidget.z;
public final class rr0 extends e implements fn7 {
    public static final k43 F = new k43(0.2d, 0.1d, 0.35d, 0.9d);
    public final RectF E;
    public final long a;
    public TLRPC.UserFull b;
    public tt c;
    public sr0 d;
    public qr0 e;
    public sla f;
    public boolean h;
    public final lr0 n;
    public float r;
    public fp s;
    public boolean w;
    public float x;
    public AnimatorSet y;

    public rr0(Bundle bundle) {
        super(bundle);
        this.n = new lr0(this, (byte) 0);
        this.r = -1.0f;
        this.x = 1.0f;
        this.E = new RectF();
        this.a = bundle.getLong("user_id");
        this.hasOwnBackground = true;
    }

    public static rr0 e0(int i, long j) {
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
        if (X1 != null && X1.bot && !z.a()) {
            TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
            boolean z = f11.a;
            if (Y1 != null && Y1.bot_profile_widget != null) {
                return new rr0(qu6.k(j, "user_id"));
            }
            return null;
        }
        return null;
    }

    public static void j0(View view, int[] iArr, RectF rectF) {
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 9));
        sla a = this.simpleActionBar.v().a(0, 2131231247);
        this.f = a;
        a.setContentDescription(ob6.M0(2131754834, null));
        this.f.e(1, 2131232190, ob6.M0(2131752987, null));
        this.f.e(2, 2131232118, ob6.M0(2131752993, null));
        this.f.e(3, 2131232359, ob6.M0(2131745564, null));
        this.f.e(4, 2131232261, ob6.M0(2131748068, null));
        this.f.e(5, 2131232417, ob6.M0(2131743504, null));
        this.f.e(6, 2131232368, ob6.M0(2131752963, null));
        this.f.e(7, 2131232073, ob6.M0(2131752988, null));
        this.f.e(8, 2131232347, ob6.M0(2131752976, null));
        this.f.e(9, 2131231865, ob6.M0(2131752994, null));
        this.f.e(10, 2131232338, ob6.M0(2131745958, null));
        o0();
        this.c = new tt(this, context);
        this.d = new sr0(context, this.currentAccount, this.a, getResourceProvider(), new or0(this));
        tt ttVar = this.c;
        tg0 tg0Var = new tg0(this, (byte) 11);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(ttVar, tg0Var);
        this.c.addView(this.d, tre.c(-1.0f, -1));
        this.fragmentView = this.c;
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.i(this.c, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new mr0(this, (byte) 0);
        this.simpleActionBar.setBackground(null);
        qr0 qr0Var = new qr0(this, context, baseSimpleGlass);
        this.e = qr0Var;
        this.c.addView(qr0Var, tre.c(-1.0f, -1));
        jl0 jl0Var = this.e.a;
        jl0Var.p(dtd.l(getResourceProvider()));
        jl0Var.q(hl.L(6.0f));
        this.e.c();
        p0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (getMessagesController().x0.indexOfKey(this.a) < 0) {
            TLRPC.UserFull userFull = this.b;
            if (userFull == null || !userFull.blocked) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sr0 sr0Var;
        if (i == jn7.E0) {
            if (((Long) objArr[0]).longValue() == this.a) {
                this.b = (TLRPC.UserFull) objArr[1];
                p0();
                o0();
            }
        } else if (i == 2) {
            qr0 qr0Var = this.e;
            if (qr0Var != null) {
                qr0Var.c();
            }
            o0();
        } else if (i == jn7.r && (sr0Var = this.d) != null) {
            sr0Var.k();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0(int i) {
        boolean z;
        String p;
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User X1 = messagesController.X1(Long.valueOf(j));
        if (i == -1) {
            finishFragment();
            return;
        }
        boolean z2 = true;
        if (i == 1) {
            presentFragment(new ProfileActivity(qu6.k(j, "user_id"), null));
        } else if (i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    z = false;
                } else if (i == 6) {
                    if (X1 == null) {
                        p = null;
                    } else {
                        p = lbc.p(X1);
                    }
                    if (!TextUtils.isEmpty(p)) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", "https://" + getMessagesController().N2 + "/" + p);
                            startActivityForResult(Intent.createChooser(intent, ob6.M0(2131752963, null)), 500);
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    return;
                } else if (i == 7 && X1 != null) {
                    jj.r(this, false, null, X1, false, true, false, true, new o(this, X1, (byte) 23));
                    return;
                } else if (i == 8) {
                    lr0 lr0Var = new lr0(this, (byte) 1);
                    if (d0()) {
                        getMessagesController().t5(lr0Var, j);
                        return;
                    } else {
                        lr0Var.run();
                        return;
                    }
                } else if (i == 9) {
                    wt0.l(this.currentAccount, j);
                    return;
                } else if (i == 10) {
                    nb9.F0(this.currentAccount, getParentActivity(), d31.b0(this), j);
                    return;
                } else {
                    return;
                }
            } else {
                z = true;
            }
            getNotificationsController().G(this.a, 0L, z);
            d31.A(this, z, getResourceProvider()).j();
            o0();
        } else {
            if (i != 3) {
                z2 = false;
            }
            g0(z2);
        }
    }

    public final void g0(boolean z) {
        if (i0() != null && !z) {
            finishFragment();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a);
        zu1 zu1Var = new zu1(bundle);
        presentFragment(zu1Var);
        if (z) {
            hl.d3(new ny(zu1Var, (byte) 1), 300L);
        }
    }

    public final void h0(RectF rectF) {
        fp fpVar = this.s;
        if (fpVar != null) {
            RectF rectF2 = (RectF) fpVar.a;
            float f = this.x;
            if (f < 1.0f) {
                rectF.set(hl.R1(rectF2.left, 0.0f, f), hl.R1(rectF2.top, 0.0f, f), hl.R1(rectF2.right, this.c.getWidth(), f), hl.R1(rectF2.bottom, this.c.getHeight(), f));
                return;
            }
        }
        rectF.set(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight());
    }

    public final zu1 i0() {
        int indexOf;
        e eVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            if (fragmentStack == null) {
                indexOf = -1;
            } else {
                indexOf = fragmentStack.indexOf(this);
            }
            if (indexOf > 0) {
                eVar = (e) fragmentStack.get(indexOf - 1);
            } else {
                eVar = null;
            }
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (zu1Var.a() == this.a) {
                    return zu1Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        float f = this.r;
        if (f < 0.0f) {
            f = hl.B(getThemedColor(aob.d6));
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

    public final void k0() {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && getParentActivity() != null && this.c.isAttachedToWindow()) {
            int[] iArr = new int[2];
            this.c.getLocationInWindow(iArr);
            int max = Math.max(1, this.d.x.top);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + max);
            if (rect.width() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(16, 4, Bitmap.Config.ARGB_8888);
                try {
                    PixelCopy.request(getParentActivity().getWindow(), rect, createBitmap, new pk(this, createBitmap, (byte) 1), new Handler(Looper.getMainLooper()));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final float l0() {
        tt ttVar;
        RoundedCorner roundedCorner;
        if (Build.VERSION.SDK_INT >= 31 && (ttVar = this.c) != null && ttVar.getRootWindowInsets() != null && (roundedCorner = this.c.getRootWindowInsets().getRoundedCorner(0)) != null) {
            return roundedCorner.getRadius();
        }
        return 0.0f;
    }

    public final void m0(float f) {
        float min;
        this.x = f;
        tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.invalidate();
            this.d.invalidateOutline();
            sr0 sr0Var = this.d;
            fp fpVar = this.s;
            float f2 = 1.0f;
            if (fpVar != null && !this.w) {
                min = 0.0f;
            } else if (fpVar == null) {
                min = 1.0f;
            } else {
                min = Math.min(1.0f, this.x / 0.22f);
            }
            sr0Var.setAlpha(min);
            jla jlaVar = this.simpleActionBar;
            if (this.s != null && !this.w) {
                f2 = 0.0f;
            }
            jlaVar.setAlpha(f2);
        }
        qr0 qr0Var = this.e;
        if (qr0Var != null) {
            qr0Var.invalidate();
        }
        this.glassEngine.g();
    }

    public final void n0(int i, boolean z) {
        sla slaVar = this.f;
        if (z) {
            slaVar.S(i);
        } else {
            slaVar.u(i);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return false;
    }

    public final void o0() {
        if (this.f == null) {
            return;
        }
        boolean p2 = getMessagesController().p2(this.a, 0L, null);
        boolean d0 = d0();
        n0(4, !p2);
        n0(5, p2);
        n0(7, !d0);
        n0(8, d0);
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User X1 = messagesController.X1(Long.valueOf(j));
        if (X1 == null) {
            return false;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(j);
        this.b = Y1;
        if (Y1 == null) {
            getMessagesController().f3(X1, this.classGuid, true, null);
        }
        getNotificationCenter().a(this, jn7.E0);
        getNotificationCenter().a(this, 2);
        getNotificationCenter().a(this, jn7.r);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.r);
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.c();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.setActive(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.setActive(true);
            this.d.k();
        }
        o0();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            hl.d3(new lr0(this, (byte) 0), 32L);
        }
    }

    public final void p0() {
        TL_bots.TL_botProfileWidget tL_botProfileWidget;
        boolean z = f11.a;
        TLRPC.UserFull userFull = this.b;
        if (userFull != null) {
            tL_botProfileWidget = userFull.bot_profile_widget;
        } else {
            tL_botProfileWidget = null;
        }
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
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
            sr0Var.setWidget(tL_botProfileWidget);
            this.d.k();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
