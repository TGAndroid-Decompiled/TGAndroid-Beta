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
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
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
public final class d8a extends d implements gk7, vl5, zg6, x74 {
    public oc6 E;
    public w7a F;
    public pb0 G;
    public be0 H;
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
    public wtc S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fm0 a;
    public float a0;
    public n81 b;
    public float b0;
    public q5c c;
    public final ArrayList c0;
    public xha d;
    public int d0;
    public xha e;
    public int e0;
    public v7a f;
    public int f0;
    public boolean g0;
    public wl5 h;
    public AnimatorSet n;
    public u95 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public d8a(Bundle bundle) {
        super(bundle);
        this.a = new fm0(0, this, s33.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(float f) {
        u95 u95Var = this.r;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        u95 u95Var = this.r;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 6));
    }

    public final void Z() {
        pha phaVar;
        boolean z;
        int i;
        int i2;
        if (this.O && (z = (phaVar = this.simpleActionBar).G) != this.g0) {
            this.g0 = z;
            if (z) {
                i = 2131231243;
            } else {
                i = 2131232490;
            }
            phaVar.setBackButtonImageAnimated(i);
            pha phaVar2 = this.simpleActionBar;
            if (z) {
                i2 = 2131754878;
            } else {
                i2 = 2131746307;
            }
            phaVar2.setBackButtonContentDescription(k96.M0(i2, null));
        }
    }

    public final void a0(ArrayList arrayList) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        int i;
        String str;
        int i2;
        String str2;
        int i3 = 0;
        if (this.d.x()) {
            arrayList.add(c4c.D(a.getCurrentActionBarHeight()));
            v7a v7aVar = this.f;
            ArrayList arrayList2 = v7aVar.d;
            ArrayList arrayList3 = v7aVar.w;
            if (v7aVar.x) {
                ArrayList arrayList4 = v7aVar.r;
                int size = arrayList4.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList4.get(i5);
                    i5++;
                    int i6 = m8a.b;
                    c4c K = c4c.K(m8a.class);
                    K.m = (CharSequence) v7aVar.n.get(i4);
                    K.H = (so8) obj;
                    arrayList.add(K);
                    i4++;
                }
                if (!v7aVar.s.isEmpty()) {
                    arrayList.add(c4c.r(k96.M0(2131745290, null)));
                    ArrayList arrayList5 = v7aVar.s;
                    int size2 = arrayList5.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList5.get(i3);
                        i3++;
                        int i7 = m8a.b;
                        c4c K2 = c4c.K(m8a.class);
                        K2.m = (CharSequence) v7aVar.n.get(i4);
                        K2.H = (aa7) obj2;
                        arrayList.add(K2);
                        i4++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(c4c.r(k96.M0(2131745277, null)));
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList3.get(i8);
                    i8++;
                    if (obj3 instanceof so8) {
                        so8 so8Var = (so8) obj3;
                        String str3 = so8Var.a;
                        int i9 = m8a.b;
                        c4c K3 = c4c.K(m8a.class);
                        K3.m = str3;
                        K3.H = so8Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof aa7) {
                        aa7 aa7Var = (aa7) obj3;
                        String str4 = aa7Var.a;
                        int i10 = m8a.b;
                        c4c K4 = c4c.K(m8a.class);
                        K4.m = str4;
                        K4.H = aa7Var;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(c4c.r(k96.M0(2131745290, null)));
                int size4 = arrayList2.size();
                while (i3 < size4) {
                    Object obj4 = arrayList2.get(i3);
                    i3++;
                    aa7 aa7Var2 = (aa7) obj4;
                    String str5 = aa7Var2.a;
                    int i11 = m8a.b;
                    c4c K5 = c4c.K(m8a.class);
                    K5.m = str5;
                    K5.H = aa7Var2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(c4c.n(this.x, 188));
        this.c0.clear();
        for (int i12 = 0; i12 < 4; i12++) {
            if (y6c.h(i12).o() && this.currentAccount != i12) {
                this.c0.add(Integer.valueOf(i12));
            }
        }
        Collections.sort(this.c0, new fx7((byte) 22));
        Set set = getMessagesController().u3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(b8a.i(k96.M0(2131749351, null), k96.M0(2131749352, null), null, null, k96.M0(2131749353, null), new s7a(this, (byte) 0)));
            arrayList.add(c4c.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().f() != null) {
            arrayList.add(b8a.i(k96.a0(null, null, 2131752144, yjb.k(new StringBuilder("+"), getUserConfig().f().phone, p38.f())), gl.O2(k96.M0(2131752143, null), -1, 0, new r7a(this, (byte) 1), null), k96.M0(2131752141, null), new s7a(this, (byte) 1), vqa.k2(k96.M0(2131752139, null)), new s7a(this, (byte) 2)));
            arrayList.add(c4c.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(b8a.i(k96.M0(2131742540, null), k96.M0(2131742539, null), k96.M0(2131742538, null), new s7a(this, (byte) 3), k96.M0(2131742537, null), new s7a(this, (byte) 4)));
            arrayList.add(c4c.C(null));
        }
        if (this.c0.size() > 0) {
            oo1.o(2131745300, null, arrayList);
            for (int i13 = 0; i13 < this.c0.size(); i13++) {
                int intValue = ((Integer) this.c0.get(i13)).intValue();
                int i14 = x7a.b;
                c4c K6 = c4c.K(x7a.class);
                K6.d = i13;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(c4c.C(null));
        }
        if (getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z = true;
        } else {
            z = false;
        }
        if (z && getMessagesController().k4.n0.f) {
            c C = c.C(this.currentAccount);
            if (bkb.I.o()) {
                i2 = 2131232725;
            } else {
                i2 = 2131232724;
            }
            String M0 = k96.M0(2131742951, null);
            int i15 = wgb.W;
            String str6 = M0;
            if (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                str6 = wgb.b(M0);
            }
            String str7 = str6;
            if (C.z() > 0) {
                str2 = c.s(C.z(), false);
            } else {
                str2 = null;
            }
            arrayList.add(z7a.i(25, 0, 0, i2, str7, null, str2));
            arrayList.add(c4c.C(null));
        }
        arrayList.add(z7a.i(1, -14899731, -15431455, 2131232701, k96.M0(2131745302, null), k96.M0(2131745301, null), null));
        arrayList.add(z7a.i(2, -1007845, -1996271, 2131232707, k96.M0(2131745298, null), k96.M0(2131745297, null), null));
        arrayList.add(z7a.i(3, -11154873, -14175180, 2131232721, k96.M0(2131745279, null), k96.M0(2131745278, null), null));
        arrayList.add(z7a.i(5, -765355, -2148011, 2131232722, k96.M0(2131745283, null), k96.M0(2131745282, null), null));
        arrayList.add(z7a.i(6, -11565578, -13276952, 2131232708, k96.M0(2131745296, null), k96.M0(2131745295, null), null));
        arrayList.add(z7a.i(7, -14899731, -15497247, 2131232712, k96.M0(2131745289, null), k96.M0(2131745288, null), null));
        arrayList.add(z7a.i(8, -13451058, -14836538, 2131232709, k96.M0(2131745293, null), k96.M0(2131745292, null), null));
        arrayList.add(z7a.i(9, -881871, -1940716, 2131232719, k96.M0(2131745281, null), k96.M0(2131745280, null), null));
        arrayList.add(z7a.i(10, -3903756, -6335009, 2131232717, k96.M0(2131745286, null), k96.j0(), null));
        arrayList.add(c4c.C(null));
        if (!z && getMessagesController().k4.n0.f) {
            c C2 = c.C(this.currentAccount);
            if (bkb.I.o()) {
                i = 2131232725;
            } else {
                i = 2131232724;
            }
            String M02 = k96.M0(2131742951, null);
            int i16 = wgb.W;
            String str8 = M02;
            if (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                str8 = wgb.b(M02);
            }
            String str9 = str8;
            if (C2.z() > 0) {
                str = c.s(C2.z(), false);
            } else {
                str = null;
            }
            arrayList.add(z7a.i(25, 0, 0, i, str9, null, str));
            arrayList.add(c4c.C(null));
        }
        if (!getMessagesController().E3()) {
            arrayList.add(z7a.i(11, -4826625, -10388225, 2131232720, k96.M0(2131743990, null), null, null));
        }
        CharSequence charSequence = "";
        if (getMessagesController().Z4()) {
            gta v = gta.v(this.currentAccount, false);
            long j = v.m().amount;
            String M03 = k96.M0(2131743974, null);
            if (!v.e || j <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = jva.G0(v.m(), 0.85f, ' ');
            }
            arrayList.add(z7a.i(12, -1071598, -1608430, 2131232723, M03, null, spannableStringBuilder));
        }
        gta.v(this.currentAccount, true).m();
        org.telegram.messenger.a.m();
        gta v2 = gta.v(this.currentAccount, true);
        long j2 = v2.m().amount;
        String M04 = k96.M0(2131749340, null);
        if (v2.e && j2 > 0) {
            charSequence = jva.G0(v2.m(), 0.85f, ' ');
        }
        arrayList.add(z7a.i(13, -14965523, -15431455, 2131231127, M04, null, charSequence));
        if (!getMessagesController().E3()) {
            arrayList.add(z7a.i(15, -765355, -2148011, 2131232704, k96.M0(2131744011, null), null, null));
        }
        if (!getMessagesController().F3()) {
            arrayList.add(z7a.i(16, -816335, -1940716, 2131232713, k96.M0(2131745447, null), null, null));
        }
        if (((c4c) b00.f(1, arrayList)).a != 7) {
            arrayList.add(c4c.C(null));
        }
        arrayList.add(c4c.u(k96.M0(2131745287, null)));
        arrayList.add(z7a.i(17, -1007845, -1996271, 2131232703, k96.M0(2131753983, null), null, null));
        arrayList.add(z7a.i(18, -14965523, -15431455, 2131232710, k96.M0(2131744001, null), null, null));
        arrayList.add(z7a.i(23, -3903756, -6335009, 2131232711, k96.M0(2131743998, null), null, null));
        arrayList.add(z7a.i(19, -11154873, -14175180, 2131232718, k96.M0(2131746592, null), null, null));
        im0 im0Var = wcd.a;
        im0Var.a();
        if (im0Var.d) {
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131745291, null)));
            arrayList.add(z7a.i(24, -765355, -2148011, 0, k96.M0(2131745792, null), null, null));
            arrayList.add(z7a.i(26, -11154873, -14175180, 0, k96.M0(2131753916, null), null, null));
            arrayList.add(z7a.i(27, -12743701, -13996071, 0, k96.M0(2131749138, null), null, null));
        }
        if (w01.a) {
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131745294, null)));
            arrayList.add(z7a.i(20, -11154873, -14175180, 0, k96.M0(2131751601, null), null, null));
            arrayList.add(z7a.i(21, -11154873, -14175180, 0, k96.M0(2131751602, null), null, null));
            arrayList.add(z7a.i(22, -765355, -2148011, 0, k96.M0(2131751638, null), null, null));
        }
        arrayList.add(c4c.m(this.N));
    }

    public final void b0() {
        na7.q1(this.currentAccount).h0(null);
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0() {
        boolean z;
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
        if (V1 == null) {
            V1 = y6c.h(this.currentAccount).f();
        }
        if (V1 == null) {
            return;
        }
        wl5 wl5Var = this.h;
        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = true;
        } else {
            z = false;
        }
        wl5Var.n(z, new r7a(this, (byte) 0), new g5((byte) 6), 0);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new n81((byte) 8, context, this);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.g0 = true;
        this.simpleActionBar.setTitle(k96.M0(2131745303, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 13));
        this.simpleActionBar.setBackground(null);
        wha t = this.simpleActionBar.t();
        xha a = t.a(0, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 21);
        this.d = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        xha a2 = t.a(1, 2131231247);
        this.e = a2;
        a2.setContentDescription(k96.M0(2131754838, null));
        this.e.e(2, 2131232200, k96.M0(2131748551, null));
        v7a v7aVar = new v7a(this, this, context);
        this.f = v7aVar;
        v7aVar.G();
        q5c q5cVar = new q5c(this, new tf8(this, (byte) 21), new u7a(this), new u7a(this));
        this.c = q5cVar;
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        q5c q5cVar2 = this.c;
        q5cVar2.g3.r = false;
        q5cVar2.r1();
        this.c.setSectionsDrawBackground(true);
        dg0.e(this.c, 0, 0, gl.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new n58(this, (byte) 20));
        this.b.addView(this.c, nme.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, nme.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, nme.e(-1, -2, 55));
        wl5 wl5Var = new wl5(0, true, true);
        this.h = wl5Var;
        wl5Var.I = true;
        wl5Var.a = this;
        wl5Var.b = this;
        this.x = new FrameLayout(context);
        oc6 oc6Var = new oc6((byte) 21, context, this);
        this.E = oc6Var;
        this.x.addView(oc6Var, nme.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new s7a(this, (byte) 5));
        ote.a(this.E);
        this.x.addOnLayoutChangeListener(new gk1(this, (byte) 6));
        this.F = new zq8(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, nme.e(90, 90, 51));
        n81 n81Var = this.b;
        n81Var.addView(this.F, n81Var.indexOfChild(this.c) + 1, nme.c(-1.0f, -1));
        this.G = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.H = be0Var;
        be0Var.setRoundRadius(gl.L(90.0f));
        this.y.addView(this.H, nme.c(-1.0f, -1));
        u95 u95Var = new u95(this, context);
        this.r = u95Var;
        u95Var.setSize(gl.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, nme.c(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = gl.L(32.0f);
        int i = bkb.Z6;
        ShapeDrawable K = bkb.K(L, getThemedColor(i));
        vkb M = zkb.M(i);
        wjb resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        zkb.j(frameLayout2, K, M, null, resourceProvider);
        this.I.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L2 = gl.L(30.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K2 = bkb.K(L2, getThemedColor(i2));
        vkb M2 = zkb.M(i2);
        wjb resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        zkb.j(frameLayout3, K2, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(2131231148);
        this.J.addView(this.K, nme.e(22, 22, 17));
        this.I.addView(this.J, nme.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        n81 n81Var2 = this.b;
        n81Var2.addView(this.I, n81Var2.indexOfChild(this.F) + 1, nme.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(gl.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l = ug8.l(this.x, this.L, nme.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView l2 = ug8.l(this.x, this.M, nme.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = l2;
        l2.setTextSize(1, 14.0f);
        zkb.X(this.N, bkb.A6, getResourceProvider());
        this.N.setPadding(gl.L(21.0f), gl.L(10.0f), gl.L(21.0f), gl.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i3 = bkb.h6;
        zkb.R(textView3, bkb.f0(getThemedColor(i3), 2, -1), null, zkb.M(i3), getResourceProvider());
        this.N.setOnClickListener(new s7a(this, (byte) 6));
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
        n81 n81Var3 = this.b;
        u7a u7aVar = new u7a(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(n81Var3, u7aVar);
        n81 n81Var4 = this.b;
        this.fragmentView = n81Var4;
        return n81Var4;
    }

    public final void d0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x;
        this.f0 = -1;
        if (tL_error == null) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(getUserConfig().e()));
            if (V1 == null) {
                V1 = getUserConfig().f();
                if (V1 == null) {
                    return;
                }
                getMessagesController().Z3(V1, false, false);
            } else {
                getUserConfig().v(V1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = ba4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = ba4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            V1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.s != null) {
                ba4.G(this.currentAccount);
                File J = ba4.J(w, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.s, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.s.volume_id);
                sb.append("_");
                String l = de9.l(sb, this.s.local_id, "@90_90");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fl5.z().O(l, de9.l(sb2, w.location.local_id, "@90_90"), gl5.m(this.currentAccount, 1, V1));
            }
            if (x != null && str != null) {
                ba4.G(this.currentAccount);
                new File(str).renameTo(ba4.J(x, "mp4", true, true));
            } else if (w2 != null && this.w != null) {
                ba4.G(this.currentAccount);
                File J2 = ba4.J(w2, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.w, null, true, true).renameTo(J2);
            }
            getMessagesController().S0(V1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(V1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
            if (W1 != null) {
                W1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(W1, false);
            }
            l0(V1);
        }
        this.s = null;
        this.w = null;
        m0(false, true);
        getNotificationCenter().k(2, Integer.valueOf(na7.q5));
        getNotificationCenter().k(kk7.i0, new Object[0]);
        getUserConfig().u(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q5c q5cVar;
        if (i == kk7.z3) {
            l0(getUserConfig().f());
            q5c q5cVar2 = this.c;
            if (q5cVar2 != null) {
                q5cVar2.g3.O(true);
            }
        } else if (i == 2) {
            l0(getUserConfig().f());
        } else if (i == kk7.r1 && (q5cVar = this.c) != null) {
            q5cVar.g3.O(true);
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
            this.H.m(gl5.e(fileLocation), "90_90", this.G, null);
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
            this.f0 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new hj7(this, str, (byte) 25));
        }
        this.simpleActionBar.t().requestLayout();
    }

    public final void f0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
        hq6 d0 = hq6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o57(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void g0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hj7(this, tL_attachMenuBot, (byte) 24), 66);
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void h0(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
            } else {
                psc.a(getParentActivity(), new nu9(this, tL_attachMenuBot, (byte) 3), null);
            }
        } else if (c4cVar.H(x7a.class)) {
            int i = c4cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
            }
        } else if (c4cVar.H(m8a.class)) {
            Object obj2 = c4cVar.H;
            if (obj2 instanceof so8) {
                so8 so8Var = (so8) obj2;
                ui5 parentLayout = getParentLayout();
                so8Var.b.run();
                gl.g3(parentLayout, so8Var.c);
            } else if (obj2 instanceof aa7) {
                kk7.f(this.currentAccount).k(kk7.b1, this.f.F, ((aa7) obj2).c);
            }
            Object obj3 = c4cVar.H;
            if (obj3 != null) {
                this.f.E(obj3);
            }
        } else {
            switch (c4cVar.d) {
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
                    j0(new m66());
                    return;
                case 10:
                    j0(new LanguageSelectActivity());
                    return;
                case 11:
                    j0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    j0(new jva());
                    return;
                case 13:
                    j0(new ydb());
                    return;
                case 15:
                    j0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    xu4.f1(false, oj0.a(y6c.t0).b());
                    return;
                case 17:
                    showDialog(ij.R(this, this.resourceProvider));
                    return;
                case 18:
                    d01.t(getParentActivity(), k96.M0(2131743999, null));
                    return;
                case 19:
                    d01.t(getParentActivity(), k96.M0(2131746590, null));
                    return;
                case 20:
                    ProfileActivity.l3(getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.l3(getParentActivity(), true);
                    return;
                case 22:
                    fa4.a();
                    return;
                case 23:
                    if (na7.q1(this.currentAccount).t2()) {
                        h5.b(this.currentAccount);
                        return;
                    } else {
                        d01.t(getParentActivity(), k96.M0(2131743997, null));
                        return;
                    }
                case 24:
                    presentFragment(new vl9(null, (byte) 0));
                    return;
                case 25:
                    j0(new hmc());
                    return;
                case 26:
                    presentFragment(new vl9(null, (byte) 1));
                    return;
                case 27:
                    ?? n5cVar = new n5c();
                    n5cVar.e = true;
                    presentFragment((d) n5cVar);
                    return;
            }
        }
    }

    public final boolean i0(c4c c4cVar, View view) {
        String str;
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ow0.l(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new r7a(this, (byte) 2));
            return true;
        }
        if (c4cVar.H(m8a.class)) {
            Object obj2 = c4cVar.H;
            if (obj2 instanceof so8) {
                str = ((so8) obj2).h;
            } else if (obj2 instanceof aa7) {
                str = ((aa7) obj2).c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                cs5 I = cs5.I(this, view);
                I.b(2131232209, k96.M0(2131751750, null), new tj9(this, str, (byte) 29), false);
                I.X(this.c.V0(view, false));
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
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(d dVar) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (gl.O1() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.r0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.c0((d) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.j(false, false);
            }
            ri5 ri5Var = new ri5(dVar);
            ri5Var.c = true;
            ri5Var.g = true;
            actionBarLayout.R(ri5Var);
            return;
        }
        presentFragment(dVar);
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
        this.L.setText(l7c.q(user));
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(p38.f().e("+" + user.phone));
        }
        String o = l7c.o(user);
        if (o != null) {
            sb.append(" • @");
            sb.append(o);
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
            str2 = k96.a0(null, null, 2131743969, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
        } catch (Exception e) {
            fa4.g(e, true);
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
            u95 u95Var = this.r;
            if (z) {
                u95Var.setVisibility(0);
                this.n.playTogether(ObjectAnimator.ofFloat(this.r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(u95Var, View.ALPHA, 0.0f));
            }
            this.n.setDuration(180L);
            this.n.addListener(new pu9((byte) 2, this, z));
            this.n.start();
            return;
        }
        u95 u95Var2 = this.r;
        if (z) {
            u95Var2.setAlpha(1.0f);
            this.r.setVisibility(0);
            return;
        }
        u95Var2.setAlpha(0.0f);
        this.r.setVisibility(4);
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8a.n0(boolean, boolean):void");
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
                w7a w7aVar = this.F;
                float f3 = -gl.L(16.0f);
                vj7 vj7Var = w7aVar.n;
                if (vj7Var != null && vj7Var.c) {
                    f3 = vj7Var.e.centerY();
                }
                float a = moe.a((height - f3) / Math.max(1.0f, paddingTop - f3), 0.0f, 1.0f);
                float max = Math.max(height, f3);
                this.Z = height;
                this.a0 = paddingTop;
                this.b0 = f3;
                float L = gl.L(90.0f);
                float scaleX = this.E.getScaleX() * (gl.R1(gl.L(this.F.getHiddenAvatarSizeDp()), L, a) / L);
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
                    this.I.setAlpha(moe.a(gl.x1(a, 0.75f, 1.0f), 0.0f, 1.0f) * f);
                    this.I.setScaleX(scaleX);
                    this.I.setScaleY(scaleX);
                    this.I.setTranslationX((gl.L(60.0f) * scaleX) + width);
                    this.I.setTranslationY((gl.L(60.0f) * scaleX) + f5);
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
        pha phaVar = this.simpleActionBar;
        if (phaVar.G) {
            if (z) {
                phaVar.n(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        wtc wtcVar = this.S;
        if (wtcVar != null) {
            wtcVar.a();
            this.S = null;
        }
        wtc wtcVar2 = new wtc(kk7.e(), this);
        wtcVar2.b(2);
        wtcVar2.b(kk7.z3);
        wtcVar2.b(kk7.r1);
        this.S = wtcVar2;
        Bundle bundle = this.arguments;
        int i = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i = gl.L(72.0f);
        }
        this.e0 = i;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wtc wtcVar = this.S;
        if (wtcVar != null) {
            wtcVar.a();
            this.S = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l5c l5cVar = this.c.g3;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            Z();
        }
    }

    public final void p0() {
        this.L.setTextColor(getThemedColor(bkb.F6));
        this.M.setTextColor(getThemedColor(bkb.x6));
        this.d.V();
        int themedColor = getThemedColor(bkb.c6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
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
        this.c.z0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }

    public d8a() {
        this(null);
    }

    @Override
    public final void D(float f, int i) {
    }
}
