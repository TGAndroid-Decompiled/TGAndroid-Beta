package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.c;
public final class uba extends e implements fn7, yn5, ej6, s84 {
    public d26 E;
    public nba F;
    public rb0 G;
    public de0 H;
    public FrameLayout I;
    public FrameLayout J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public boolean O;
    public View P;
    public View Q;
    public int R;
    public u8a S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fm0 a;
    public float a0;
    public w81 b;
    public float b0;
    public q9c c;
    public final ArrayList c0;
    public sla d;
    public int d0;
    public sla e;
    public int e0;
    public mba f;
    public int f0;
    public boolean g0;
    public zn5 h;
    public AnimatorSet n;
    public vb5 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public uba(Bundle bundle) {
        super(bundle);
        this.a = new fm0(0, this, k43.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    @Override
    public final void H(float f) {
        vb5 vb5Var = this.r;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        vb5 vb5Var = this.r;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 6));
    }

    public final void Z() {
        jla jlaVar;
        boolean z;
        int i;
        int i2;
        if (this.O && (z = (jlaVar = this.simpleActionBar).L) != this.g0) {
            this.g0 = z;
            if (z) {
                i = 2131231243;
            } else {
                i = 2131232501;
            }
            jlaVar.setBackButtonImageAnimated(i);
            jla jlaVar2 = this.simpleActionBar;
            if (z) {
                i2 = 2131754874;
            } else {
                i2 = 2131746227;
            }
            jlaVar2.setBackButtonContentDescription(ob6.M0(i2, null));
        }
    }

    public final void a0(ArrayList arrayList) {
        boolean z;
        CharSequence charSequence;
        int i;
        String str;
        int i2;
        String str2;
        int i3 = 0;
        if (this.d.x()) {
            arrayList.add(b8c.D(a.getCurrentActionBarHeight()));
            mba mbaVar = this.f;
            ArrayList arrayList2 = mbaVar.d;
            ArrayList arrayList3 = mbaVar.w;
            if (mbaVar.x) {
                ArrayList arrayList4 = mbaVar.r;
                int size = arrayList4.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList4.get(i5);
                    i5++;
                    int i6 = dca.b;
                    b8c K = b8c.K(dca.class);
                    K.m = (CharSequence) mbaVar.n.get(i4);
                    K.H = (es8) obj;
                    arrayList.add(K);
                    i4++;
                }
                if (!mbaVar.s.isEmpty()) {
                    arrayList.add(b8c.r(ob6.M0(2131745210, null)));
                    ArrayList arrayList5 = mbaVar.s;
                    int size2 = arrayList5.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList5.get(i3);
                        i3++;
                        int i7 = dca.b;
                        b8c K2 = b8c.K(dca.class);
                        K2.m = (CharSequence) mbaVar.n.get(i4);
                        K2.H = (hc7) obj2;
                        arrayList.add(K2);
                        i4++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(b8c.r(ob6.M0(2131745197, null)));
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList3.get(i8);
                    i8++;
                    if (obj3 instanceof es8) {
                        es8 es8Var = (es8) obj3;
                        String str3 = es8Var.a;
                        int i9 = dca.b;
                        b8c K3 = b8c.K(dca.class);
                        K3.m = str3;
                        K3.H = es8Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof hc7) {
                        hc7 hc7Var = (hc7) obj3;
                        String str4 = hc7Var.a;
                        int i10 = dca.b;
                        b8c K4 = b8c.K(dca.class);
                        K4.m = str4;
                        K4.H = hc7Var;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(b8c.r(ob6.M0(2131745210, null)));
                int size4 = arrayList2.size();
                while (i3 < size4) {
                    Object obj4 = arrayList2.get(i3);
                    i3++;
                    hc7 hc7Var2 = (hc7) obj4;
                    String str5 = hc7Var2.a;
                    int i11 = dca.b;
                    b8c K5 = b8c.K(dca.class);
                    K5.m = str5;
                    K5.H = hc7Var2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(b8c.n(this.x, 188));
        this.c0.clear();
        for (int i12 = 0; i12 < 4; i12++) {
            if (yac.h(i12).o() && this.currentAccount != i12) {
                this.c0.add(Integer.valueOf(i12));
            }
        }
        Collections.sort(this.c0, new qq7((byte) 25));
        Set set = getMessagesController().v3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(sba.i(ob6.M0(2131749297, null), ob6.M0(2131749298, null), null, null, ob6.M0(2131749299, null), new jba(this, (byte) 0)));
            arrayList.add(b8c.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().f() != null) {
            arrayList.add(sba.i(ob6.a0(null, null, 2131752121, xnb.k(new StringBuilder("+"), getUserConfig().f().phone, f78.f())), hl.N2(ob6.M0(2131752120, null), -1, 0, new iba(this, (byte) 1), null), ob6.M0(2131752118, null), new jba(this, (byte) 1), wua.l2(ob6.M0(2131752116, null)), new jba(this, (byte) 2)));
            arrayList.add(b8c.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(sba.i(ob6.M0(2131742434, null), ob6.M0(2131742433, null), ob6.M0(2131742432, null), new jba(this, (byte) 3), ob6.M0(2131742431, null), new jba(this, (byte) 4)));
            arrayList.add(b8c.C(null));
        }
        if (this.c0.size() > 0) {
            bp1.o(2131745220, null, arrayList);
            for (int i13 = 0; i13 < this.c0.size(); i13++) {
                int intValue = ((Integer) this.c0.get(i13)).intValue();
                int i14 = oba.b;
                b8c K6 = b8c.K(oba.class);
                K6.d = i13;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(b8c.C(null));
        }
        if (getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z = true;
        } else {
            z = false;
        }
        if (z && getMessagesController().l4.v0.f) {
            c C = c.C(this.currentAccount);
            if (aob.I.o()) {
                i2 = 2131232736;
            } else {
                i2 = 2131232735;
            }
            String M0 = ob6.M0(2131742845, null);
            int i15 = skb.W;
            String str6 = M0;
            if (ConnectionsManager.getInstance(yac.t0).getCurrentTime() - 1790679020 <= 2419200) {
                str6 = skb.b(M0);
            }
            String str7 = str6;
            if (C.z() > 0) {
                str2 = c.s(C.z(), false);
            } else {
                str2 = null;
            }
            arrayList.add(qba.i(25, 0, 0, i2, str7, null, str2));
            arrayList.add(b8c.C(null));
        }
        arrayList.add(qba.i(1, -14899731, -15431455, 2131232712, ob6.M0(2131745222, null), ob6.M0(2131745221, null), null));
        arrayList.add(qba.i(2, -1007845, -1996271, 2131232718, ob6.M0(2131745218, null), ob6.M0(2131745217, null), null));
        arrayList.add(qba.i(3, -11154873, -14175180, 2131232732, ob6.M0(2131745199, null), ob6.M0(2131745198, null), null));
        arrayList.add(qba.i(5, -765355, -2148011, 2131232733, ob6.M0(2131745203, null), ob6.M0(2131745202, null), null));
        arrayList.add(qba.i(6, -11565578, -13276952, 2131232719, ob6.M0(2131745216, null), ob6.M0(2131745215, null), null));
        arrayList.add(qba.i(7, -14899731, -15497247, 2131232723, ob6.M0(2131745209, null), ob6.M0(2131745208, null), null));
        arrayList.add(qba.i(8, -13451058, -14836538, 2131232720, ob6.M0(2131745213, null), ob6.M0(2131745212, null), null));
        arrayList.add(qba.i(9, -881871, -1940716, 2131232730, ob6.M0(2131745201, null), ob6.M0(2131745200, null), null));
        arrayList.add(qba.i(10, -3903756, -6335009, 2131232728, ob6.M0(2131745206, null), ob6.j0(), null));
        arrayList.add(b8c.C(null));
        if (!z && getMessagesController().l4.v0.f) {
            c C2 = c.C(this.currentAccount);
            if (aob.I.o()) {
                i = 2131232736;
            } else {
                i = 2131232735;
            }
            String M02 = ob6.M0(2131742845, null);
            int i16 = skb.W;
            String str8 = M02;
            if (ConnectionsManager.getInstance(yac.t0).getCurrentTime() - 1790679020 <= 2419200) {
                str8 = skb.b(M02);
            }
            String str9 = str8;
            if (C2.z() > 0) {
                str = c.s(C2.z(), false);
            } else {
                str = null;
            }
            arrayList.add(qba.i(25, 0, 0, i, str9, null, str));
            arrayList.add(b8c.C(null));
        }
        if (!getMessagesController().M3()) {
            arrayList.add(qba.i(11, -4826625, -10388225, 2131232731, ob6.M0(2131743884, null), null, null));
        }
        if (getMessagesController().i5()) {
            jxa v = jxa.v(this.currentAccount, false);
            long j = v.m().amount;
            String M03 = ob6.M0(2131743868, null);
            if (v.e && j > 0) {
                charSequence = nza.H0(v.m(), 0.85f, ' ');
            } else {
                charSequence = "";
            }
            arrayList.add(qba.i(12, -1071598, -1608430, 2131232734, M03, null, charSequence));
        }
        jxa v2 = jxa.v(this.currentAccount, true);
        TL_stars.StarsAmount m = v2.m();
        if (v2.e && m.positive()) {
            arrayList.add(qba.i(13, -14965523, -15431455, 2131231127, ob6.M0(2131749286, null), null, nza.H0(m, 0.85f, ' ')));
        }
        if (!getMessagesController().M3()) {
            arrayList.add(qba.i(15, -765355, -2148011, 2131232715, ob6.M0(2131743905, null), null, null));
        }
        if (!getMessagesController().N3()) {
            arrayList.add(qba.i(16, -816335, -1940716, 2131232724, ob6.M0(2131745367, null), null, null));
        }
        if (((b8c) c00.g(1, arrayList)).a != 7) {
            arrayList.add(b8c.C(null));
        }
        arrayList.add(b8c.u(ob6.M0(2131745207, null)));
        arrayList.add(qba.i(17, -1007845, -1996271, 2131232714, ob6.M0(2131753979, null), null, null));
        arrayList.add(qba.i(18, -14965523, -15431455, 2131232721, ob6.M0(2131743895, null), null, null));
        arrayList.add(qba.i(23, -3903756, -6335009, 2131232722, ob6.M0(2131743892, null), null, null));
        arrayList.add(qba.i(19, -11154873, -14175180, 2131232729, ob6.M0(2131746512, null), null, null));
        im0 im0Var = phd.a;
        im0Var.a();
        if (im0Var.d) {
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131745211, null)));
            arrayList.add(qba.i(24, -765355, -2148011, 0, ob6.M0(2131745712, null), null, null));
            arrayList.add(qba.i(26, -11154873, -14175180, 0, ob6.M0(2131753912, null), null, null));
            arrayList.add(qba.i(27, -12743701, -13996071, 0, ob6.M0(2131749084, null), null, null));
        }
        if (f11.a) {
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131745214, null)));
            arrayList.add(qba.i(20, -11154873, -14175180, 0, ob6.M0(2131751578, null), null, null));
            arrayList.add(qba.i(21, -11154873, -14175180, 0, ob6.M0(2131751579, null), null, null));
            arrayList.add(qba.i(22, -765355, -2148011, 0, ob6.M0(2131751615, null), null, null));
        }
        arrayList.add(b8c.m(this.N));
    }

    public final void b0() {
        uc7.s1(this.currentAccount).j0(null);
    }

    public final void c0() {
        boolean z;
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        if (X1 == null) {
            return;
        }
        zn5 zn5Var = this.h;
        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = true;
        } else {
            z = false;
        }
        zn5Var.n(z, new iba(this, (byte) 0), new h5((byte) 6), 0);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new w81((byte) 8, context, this);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.g0 = true;
        this.simpleActionBar.setTitle(ob6.M0(2131745223, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 15));
        this.simpleActionBar.setBackground(null);
        rla v = this.simpleActionBar.v();
        sla a = v.a(0, 2131232502);
        a.N();
        a.C0 = new r10(this, (byte) 22);
        this.d = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        sla a2 = v.a(1, 2131231247);
        this.e = a2;
        a2.setContentDescription(ob6.M0(2131754834, null));
        this.e.e(2, 2131232200, ob6.M0(2131748497, null));
        mba mbaVar = new mba(this, this, context);
        this.f = mbaVar;
        mbaVar.G();
        q9c q9cVar = new q9c(this, new hj8(this, (byte) 21), new lba(this), new lba(this));
        this.c = q9cVar;
        q9cVar.setCaptureSectionsDecoratorAllowed(true);
        q9c q9cVar2 = this.c;
        q9cVar2.g3.r = false;
        q9cVar2.s1();
        this.c.setSectionsDrawBackground(true);
        eg0.g(this.c, 0, 0, hl.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new e98(this, (byte) 20));
        this.b.addView(this.c, tre.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, tre.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, tre.e(-1, -2, 55));
        zn5 zn5Var = new zn5(0, true, true);
        this.h = zn5Var;
        zn5Var.I = true;
        zn5Var.a = this;
        zn5Var.b = this;
        this.x = new FrameLayout(context);
        d26 d26Var = new d26((byte) 23, context, this);
        this.E = d26Var;
        this.x.addView(d26Var, tre.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new jba(this, (byte) 5));
        iye.a(this.E);
        this.x.addOnLayoutChangeListener(new pk1(this, (byte) 6));
        this.F = new ku8(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, tre.e(90, 90, 51));
        w81 w81Var = this.b;
        w81Var.addView(this.F, w81Var.indexOfChild(this.c) + 1, tre.c(-1.0f, -1));
        this.G = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.H = de0Var;
        de0Var.setRoundRadius(hl.L(90.0f));
        this.y.addView(this.H, tre.c(-1.0f, -1));
        vb5 vb5Var = new vb5(this, context);
        this.r = vb5Var;
        vb5Var.setSize(hl.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, tre.c(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = hl.L(32.0f);
        int i = aob.a7;
        ShapeDrawable K = aob.K(L, getThemedColor(i));
        uob M = yob.M(i);
        vnb resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        yob.j(frameLayout2, K, M, null, resourceProvider);
        this.I.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L2 = hl.L(30.0f);
        int i2 = aob.Fi;
        ShapeDrawable K2 = aob.K(L2, getThemedColor(i2));
        uob M2 = yob.M(i2);
        vnb resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        yob.j(frameLayout3, K2, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(2131231148);
        this.J.addView(this.K, tre.e(22, 22, 17));
        this.I.addView(this.J, tre.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        w81 w81Var2 = this.b;
        w81Var2.addView(this.I, w81Var2.indexOfChild(this.F) + 1, tre.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(hl.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l = ik8.l(this.x, this.L, tre.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView l2 = ik8.l(this.x, this.M, tre.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = l2;
        l2.setTextSize(1, 14.0f);
        yob.X(this.N, aob.B6, getResourceProvider());
        this.N.setPadding(hl.L(21.0f), hl.L(10.0f), hl.L(21.0f), hl.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i3 = aob.i6;
        yob.R(textView3, aob.f0(getThemedColor(i3), 2, -1), null, yob.M(i3), getResourceProvider());
        this.N.setOnClickListener(new jba(this, (byte) 6));
        this.P = new View(context);
        n0(true, false);
        this.c.g3.O(false);
        l0(getUserConfig().f());
        p0();
        Z();
        this.simpleActionBar.setBackground(null);
        int i4 = this.mSystemInsets.b;
        if (this.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i4;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        w81 w81Var3 = this.b;
        lba lbaVar = new lba(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(w81Var3, lbaVar);
        w81 w81Var4 = this.b;
        this.fragmentView = w81Var4;
        return w81Var4;
    }

    public final void d0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x;
        this.f0 = -1;
        if (tL_error == null) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(getUserConfig().e()));
            if (X1 == null) {
                X1 = getUserConfig().f();
                if (X1 == null) {
                    return;
                }
                getMessagesController().i4(X1, false, false);
            } else {
                getUserConfig().v(X1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = xb4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            X1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.s != null) {
                xb4.G(this.currentAccount);
                File J = xb4.J(w, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.s, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.s.volume_id);
                sb.append("_");
                String l = uh9.l(sb, this.s.local_id, "@90_90");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                in5.z().O(l, uh9.l(sb2, w.location.local_id, "@90_90"), jn5.m(this.currentAccount, 1, X1));
            }
            if (x != null && str != null) {
                xb4.G(this.currentAccount);
                new File(str).renameTo(xb4.J(x, "mp4", true, true));
            } else if (w2 != null && this.w != null) {
                xb4.G(this.currentAccount);
                File J2 = xb4.J(w2, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.w, null, true, true).renameTo(J2);
            }
            getMessagesController().U0(X1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(X1);
            getMessagesStorage().n1(arrayList2, null, false, true);
            TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
            if (Y1 != null) {
                Y1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().l2(Y1, false);
            }
            l0(X1);
        }
        this.s = null;
        this.w = null;
        m0(false, true);
        getNotificationCenter().k(2, Integer.valueOf(uc7.s5));
        getNotificationCenter().k(jn7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q9c q9cVar;
        if (i == jn7.A3) {
            l0(getUserConfig().f());
            q9c q9cVar2 = this.c;
            if (q9cVar2 != null) {
                q9cVar2.g3.O(true);
            }
        } else if (i == 2) {
            l0(getUserConfig().f());
        } else if (i == jn7.s1 && (q9cVar = this.c) != null) {
            q9cVar.g3.O(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.s = fileLocation;
            this.w = photoSize2.location;
            this.H.m(jn5.e(fileLocation), "90_90", this.G, null);
            m0(true, false);
        } else if (this.s == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.f0 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new pl7(this, str, (byte) 26));
        }
        this.simpleActionBar.v().requestLayout();
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
        ls6 d0 = ls6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new r77(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void g0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = uc7.s1(this.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new pl7(this, tL_attachMenuBot, (byte) 25), 66);
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void h0(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
            } else {
                exc.a(getParentActivity(), new ku9(this, tL_attachMenuBot, (byte) 4), null);
            }
        } else if (b8cVar.H(oba.class)) {
            int i = b8cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
            }
        } else if (b8cVar.H(dca.class)) {
            Object obj2 = b8cVar.H;
            if (obj2 instanceof es8) {
                es8 es8Var = (es8) obj2;
                wk5 parentLayout = getParentLayout();
                es8Var.b.run();
                hl.f3(parentLayout, es8Var.c);
            } else if (obj2 instanceof hc7) {
                jn7.f(this.currentAccount).k(jn7.c1, this.f.F, ((hc7) obj2).c);
            }
            Object obj3 = b8cVar.H;
            if (obj3 != null) {
                this.f.E(obj3);
            }
        } else {
            switch (b8cVar.d) {
                case 1:
                    j0(new UserInfoActivity());
                    return;
                case 2:
                    j0(new ThemeActivity(0));
                    return;
                case 3:
                    j0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    j0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    j0(new DataSettingsActivity());
                    return;
                case 7:
                    j0(new FiltersSetupActivity());
                    return;
                case 8:
                    j0(new SessionsActivity(0));
                    return;
                case 9:
                    j0(new q86());
                    return;
                case 10:
                    j0(new LanguageSelectActivity());
                    return;
                case 11:
                    j0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    j0(new nza());
                    return;
                case 13:
                    j0(new thb());
                    return;
                case 15:
                    j0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    bx4.g1(false, pj0.a(yac.t0).b());
                    return;
                case 17:
                    showDialog(jj.R(this, this.resourceProvider));
                    return;
                case 18:
                    m01.u(getParentActivity(), ob6.M0(2131743893, null));
                    return;
                case 19:
                    m01.u(getParentActivity(), ob6.M0(2131746510, null));
                    return;
                case 20:
                    ProfileActivity.m3(getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.m3(getParentActivity(), true);
                    return;
                case 22:
                    cc4.a();
                    return;
                case 23:
                    if (uc7.s1(this.currentAccount).x2()) {
                        i5.b(this.currentAccount);
                        return;
                    } else {
                        m01.u(getParentActivity(), ob6.M0(2131743891, null));
                        return;
                    }
                case 24:
                    presentFragment(new kp9(null, (byte) 0));
                    return;
                case 25:
                    j0(new uqc());
                    return;
                case 26:
                    presentFragment(new kp9(null, (byte) 1));
                    return;
                case 27:
                    ?? n9cVar = new n9c();
                    n9cVar.e = true;
                    presentFragment((e) n9cVar);
                    return;
            }
        }
    }

    public final boolean i0(b8c b8cVar, View view) {
        String str;
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            xw0.l(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new iba(this, (byte) 2));
            return true;
        }
        if (b8cVar.H(dca.class)) {
            Object obj2 = b8cVar.H;
            if (obj2 instanceof es8) {
                str = ((es8) obj2).h;
            } else if (obj2 instanceof hc7) {
                str = ((hc7) obj2).c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                fu5 I = fu5.I(this, view);
                I.b(2131232209, ob6.M0(2131751727, null), new dn9(this, str, (byte) 29), false);
                I.X(this.c.W0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    @Override
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final void j0(e eVar) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (hl.O1() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.r0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.c0((e) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.j(false, false);
            }
            tk5 tk5Var = new tk5(eVar);
            tk5Var.c = true;
            tk5Var.g = true;
            actionBarLayout.R(tk5Var);
            return;
        }
        presentFragment(eVar);
    }

    public final void k0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        if (this.H == null || this.f0 != -1) {
            return;
        }
        this.G.q(user);
        this.H.f(user, this.G);
        this.L.setText(lbc.r(user));
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(f78.f().e("+" + user.phone));
        }
        String p = lbc.p(user);
        if (p != null) {
            sb.append(" • @");
            sb.append(p);
        }
        this.M.setText(sb);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0);
            int i = packageInfo.versionCode;
            int i2 = i / 10;
            int i3 = i % 10;
            if (i3 != 1 && i3 != 2) {
                org.telegram.messenger.a.t();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            str2 = ob6.a0(null, null, 2131743863, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        textView.setText(str2);
    }

    public final void m0(boolean z, boolean z2) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n = animatorSet2;
            vb5 vb5Var = this.r;
            if (z) {
                vb5Var.setVisibility(0);
                this.n.playTogether(ObjectAnimator.ofFloat(this.r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(vb5Var, View.ALPHA, 0.0f));
            }
            this.n.setDuration(180L);
            this.n.addListener(new i1a((byte) 1, this, z));
            this.n.start();
            return;
        }
        vb5 vb5Var2 = this.r;
        if (z) {
            vb5Var2.setAlpha(1.0f);
            this.r.setVisibility(0);
            return;
        }
        vb5Var2.setAlpha(0.0f);
        this.r.setVisibility(4);
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uba.n0(boolean, boolean):void");
    }

    public final void o0() {
        if (this.F != null && this.y != null) {
            float height = this.E.getHeight() / 2.0f;
            View view = this.E;
            float f = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.E.isAttachedToWindow() && this.E.getHeight() != 0) {
                float f2 = 0.0f;
                for (View view2 = this.x; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f2 += view2.getY();
                }
                float paddingTop = (height - f2) + this.c.getPaddingTop();
                nba nbaVar = this.F;
                float f3 = -hl.L(16.0f);
                um7 um7Var = nbaVar.n;
                if (um7Var != null && um7Var.c) {
                    f3 = um7Var.e.centerY();
                }
                float a = ete.a((height - f3) / Math.max(1.0f, paddingTop - f3), 0.0f, 1.0f);
                float max = Math.max(height, f3);
                this.Z = height;
                this.a0 = paddingTop;
                this.b0 = f3;
                float L = hl.L(90.0f);
                float scaleX = this.E.getScaleX() * (hl.R1(hl.L(this.F.getHiddenAvatarSizeDp()), L, a) / L);
                float f4 = (L * scaleX) / 2.0f;
                float width = (this.F.getWidth() / 2.0f) - f4;
                if (max != this.W || scaleX != this.X || a != this.Y || f != this.F.getAlpha() || width != this.y.getTranslationX()) {
                    this.W = max;
                    this.X = scaleX;
                    this.Y = a;
                    this.F.setAlpha(f);
                    this.y.setScaleX(scaleX);
                    this.y.setScaleY(scaleX);
                    this.y.setTranslationX(width);
                    float f5 = max - f4;
                    this.y.setTranslationY(f5);
                    this.I.setAlpha(ete.a(hl.x1(a, 0.75f, 1.0f), 0.0f, 1.0f) * f);
                    this.I.setScaleX(scaleX);
                    this.I.setScaleY(scaleX);
                    this.I.setTranslationX((hl.L(60.0f) * scaleX) + width);
                    this.I.setTranslationY((hl.L(60.0f) * scaleX) + f5);
                    this.F.setHideProgress(1.0f - a);
                }
            } else if (this.Y != 0.0f) {
                this.Y = 0.0f;
                this.F.setHideProgress(1.0f);
                this.I.setAlpha(0.0f);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar.L) {
            if (z) {
                jlaVar.o(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        u8a u8aVar = this.S;
        if (u8aVar != null) {
            u8aVar.a();
            this.S = null;
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar2 = new u8a(notificationCenter, this);
        u8aVar2.b(2);
        u8aVar2.b(jn7.A3);
        u8aVar2.b(jn7.s1);
        this.S = u8aVar2;
        Bundle bundle = this.arguments;
        int i = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i = hl.L(72.0f);
        }
        this.e0 = i;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        u8a u8aVar = this.S;
        if (u8aVar != null) {
            u8aVar.a();
            this.S = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l9c l9cVar = this.c.g3;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    public final void p0() {
        this.L.setTextColor(getThemedColor(aob.G6));
        this.M.setTextColor(getThemedColor(aob.y6));
        this.d.V();
        int themedColor = getThemedColor(aob.d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            Z();
        }
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        this.c.A0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void T() {
    }

    public uba() {
        this(null);
    }

    @Override
    public final void v0(float f, int i) {
    }
}
