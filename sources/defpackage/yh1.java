package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class yh1 extends d implements gk7, vl5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public ld5 I;
    public EditTextBoldCursor J;
    public boolean K;
    public oy8 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public f36 R;
    public uy8 S;
    public uy8 T;
    public mhb U;
    public TextView V;
    public ke1 W;
    public ld5 X;
    public int Y;
    public String Z;
    public r7 a;
    public q21 a0;
    public m33 b;
    public boolean b0;
    public ih2 c;
    public boolean c0;
    public rt3 d;
    public boolean d0;
    public b9a e;
    public TLRPC.TL_chatInviteExported e0;
    public kb0 f;
    public boolean f0;
    public mhb g0;
    public s71 h;
    public final ArrayList h0;
    public q86 i0;
    public final int j0;
    public final long k0;
    public boolean l0;
    public final Boolean m0;
    public vh1 n;
    public TLRPC.InputFile n0;
    public TLRPC.InputFile o0;
    public TLRPC.VideoSize p0;
    public String q0;
    public AnimatorSet r;
    public double r0;
    public wh1 s;
    public boolean s0;
    public boolean t0;
    public Integer u0;
    public i8c v0;
    public final pb0 w;
    public hd w0;
    public final wl5 x;
    public final oh1 x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public yh1(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        this.l0 = true;
        this.x0 = new oh1(this, (byte) 0);
        int i = bundle.getInt("step", 0);
        this.j0 = i;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i == 0) {
            this.w = new pb0((wjb) null);
            this.x = new wl5(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new qh1(this, (byte) 1));
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z;
            this.c0 = !z;
            if (!z && !this.f0) {
                this.f0 = true;
                m0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qh1(this, (byte) 0));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    @Override
    public final void H(float f) {
        wh1 wh1Var = this.s;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        wh1 wh1Var = this.s;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0() {
        int w0 = bkb.w0(null, bkb.N7, false);
        int w02 = bkb.w0(null, bkb.O7, false);
        int w03 = bkb.w0(null, bkb.P7, false);
        int w04 = bkb.w0(null, bkb.Q7, false);
        int w05 = bkb.w0(null, bkb.R7, false);
        int w06 = bkb.w0(null, bkb.S7, false);
        int w07 = bkb.w0(null, bkb.T7, false) + ((w06 + ((w05 + ((w04 + ((w03 + ((w02 + ((w0 + (bkb.w0(null, bkb.I7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (w07 != this.z0) {
            this.z0 = w07;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.N.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        float f6;
        int i10;
        float f7;
        float f8;
        float f9;
        float f10;
        int i11;
        int i12;
        int i13;
        final yh1 yh1Var = this;
        rt3 rt3Var = yh1Var.d;
        if (rt3Var != null) {
            rt3Var.o();
        }
        yh1Var.actionBar.setBackButtonImage(2131231243);
        yh1Var.actionBar.setAllowOverlayTitle(true);
        yh1Var.actionBar.setActionBarMenuOnItemClick(new r8(yh1Var, (byte) 21));
        r6 t = yh1Var.actionBar.t();
        Drawable d = b00.d(context, 2131231245);
        int i14 = bkb.u8;
        int w0 = bkb.w0(null, i14, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        d.setColorFilter(new PorterDuffColorFilter(w0, mode));
        ih2 ih2Var = new ih2(bkb.w0(null, i14, false));
        yh1Var.c = ih2Var;
        m33 m33Var = new m33(d, ih2Var);
        yh1Var.b = m33Var;
        int L = gl.L(56.0f);
        String M0 = k96.M0(2131751342, null);
        boolean z2 = t.c;
        a aVar = t.b;
        if (z2) {
            i = aVar.r0;
        } else {
            i = aVar.q0;
        }
        r7 c = t.c(1, 0, null, i, m33Var, L, M0, null);
        yh1Var.a = c;
        zkb.x(c, d, i14, null, mode);
        int i15 = yh1Var.j0;
        if (i15 == 0) {
            yh1Var.actionBar.setTitle(k96.M0(2131748094, null));
            ay0 ay0Var = new ay0(yh1Var, context, (byte) 1);
            ay0Var.setOnTouchListener(new p8((byte) 26));
            yh1Var.fragmentView = ay0Var;
            int i16 = bkb.c6;
            ay0Var.setTag(Integer.valueOf(i16));
            zkb.h(i16, null, yh1Var.fragmentView);
            LinearLayout linearLayout = new LinearLayout(context);
            yh1Var.M = linearLayout;
            linearLayout.setOrientation(1);
            ay0Var.addView(yh1Var.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            yh1Var.M.addView(frameLayout, nme.o(-1, -2));
            kb0 kb0Var = new kb0((byte) 2, context, yh1Var);
            yh1Var.f = kb0Var;
            kb0Var.setRoundRadius(gl.L(32.0f));
            pb0 pb0Var = yh1Var.w;
            pb0Var.j(5L, null, null, null);
            yh1Var.f.setImageDrawable(pb0Var);
            kb0 kb0Var2 = yh1Var.f;
            boolean z3 = k96.a0;
            if (z3) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i17 = i7 | 48;
            if (z3) {
                f = 0.0f;
            } else {
                f = 16.0f;
            }
            if (z3) {
                f2 = 16.0f;
            } else {
                f2 = 0.0f;
            }
            frameLayout.addView(kb0Var2, nme.d(64, 64.0f, i17, f, 12.0f, f2, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            s71 s71Var = new s71(yh1Var, context, paint, (byte) 1);
            yh1Var.h = s71Var;
            s71Var.setContentDescription(k96.M0(2131752200, null));
            s71 s71Var2 = yh1Var.h;
            boolean z4 = k96.a0;
            if (z4) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            int i18 = i8 | 48;
            if (z4) {
                f3 = 0.0f;
            } else {
                f3 = 16.0f;
            }
            if (z4) {
                f4 = 16.0f;
            } else {
                f4 = 0.0f;
            }
            frameLayout.addView(s71Var2, nme.d(64, 64.0f, i18, f3, 12.0f, f4, 12.0f));
            yh1Var.h.setOnClickListener(new sh1(yh1Var, (byte) 1));
            yh1Var.L = new oy8(2131623959, gl.L(60.0f), gl.L(60.0f), false, null);
            vh1 vh1Var = new vh1((byte) 0, context, yh1Var);
            yh1Var.n = vh1Var;
            vh1Var.setScaleType(ImageView.ScaleType.CENTER);
            yh1Var.n.setAnimation(yh1Var.L);
            yh1Var.n.setEnabled(false);
            yh1Var.n.setClickable(false);
            yh1Var.n.setPadding(gl.L(0.0f), 0, 0, gl.L(1.0f));
            vh1 vh1Var2 = yh1Var.n;
            boolean z5 = k96.a0;
            if (z5) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i19 = i9 | 48;
            if (z5) {
                f5 = 0.0f;
            } else {
                f5 = 15.0f;
            }
            if (z5) {
                f6 = 15.0f;
            } else {
                f6 = 0.0f;
            }
            frameLayout.addView(vh1Var2, nme.d(64, 64.0f, i19, f5, 12.0f, f6, 12.0f));
            wh1 wh1Var = new wh1(yh1Var, context, (byte) 0);
            yh1Var.s = wh1Var;
            wh1Var.setSize(gl.L(30.0f));
            yh1Var.s.setProgressColor(-1);
            yh1Var.s.setNoProgress(false);
            wh1 wh1Var2 = yh1Var.s;
            boolean z6 = k96.a0;
            if (z6) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i20 = i10 | 48;
            if (z6) {
                f7 = 0.0f;
            } else {
                f7 = 16.0f;
            }
            if (z6) {
                f8 = 16.0f;
            } else {
                f8 = 0.0f;
            }
            frameLayout.addView(wh1Var2, nme.d(64, 64.0f, i20, f7, 12.0f, f8, 12.0f));
            yh1Var.i0(false, false);
            rt3 rt3Var2 = new rt3(context, ay0Var, yh1Var, 0, false, null);
            yh1Var = yh1Var;
            yh1Var.d = rt3Var2;
            rt3Var2.setHint(k96.M0(2131751112, null));
            String str = yh1Var.G;
            if (str != null) {
                yh1Var.d.setText(str);
                yh1Var.G = null;
            }
            yh1Var.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            yh1Var.d.getEditText().setSingleLine(true);
            yh1Var.d.getEditText().setImeOptions(5);
            yh1Var.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(yh1Var) {
                public final yh1 b;

                {
                    this.b = yh1Var;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i21, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b = r2;
                    yh1 yh1Var2 = this.b;
                    switch (b) {
                        case 0:
                            if (i21 != 5 || TextUtils.isEmpty(yh1Var2.d.getEditText().getText())) {
                                return false;
                            }
                            yh1Var2.y.requestFocus();
                            return true;
                        default:
                            if (i21 != 6 || (r7Var = yh1Var2.a) == null) {
                                return false;
                            }
                            r7Var.performClick();
                            return true;
                    }
                }
            });
            rt3 rt3Var3 = yh1Var.d;
            boolean z7 = k96.a0;
            if (z7) {
                f9 = 5.0f;
            } else {
                f9 = 96.0f;
            }
            if (z7) {
                f10 = 96.0f;
            } else {
                f10 = 5.0f;
            }
            frameLayout.addView(rt3Var3, nme.d(-1, -2.0f, 16, f9, 0.0f, f10, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            yh1Var.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            zkb.D(yh1Var.y, bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor2 = yh1Var.y;
            int i21 = bkb.F6;
            zkb.X(editTextBoldCursor2, i21, null);
            yh1Var.y.setBackgroundDrawable(null);
            zkb.F(yh1Var.y, bkb.j6, bkb.k6, bkb.o7, yh1Var.getResourceProvider());
            yh1Var.y.setPadding(0, 0, 0, gl.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = yh1Var.y;
            if (k96.a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            editTextBoldCursor3.setGravity(i11);
            yh1Var.y.setInputType(180225);
            yh1Var.y.setImeOptions(6);
            yh1Var.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            yh1Var.y.setHint(k96.M0(2131751447, null));
            zkb.v(yh1Var.y, i21, null);
            yh1Var.y.setCursorSize(gl.L(20.0f));
            yh1Var.y.setCursorWidth(1.5f);
            yh1Var.M.addView(yh1Var.y, nme.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            yh1Var.y.setOnEditorActionListener(new TextView.OnEditorActionListener(yh1Var) {
                public final yh1 b;

                {
                    this.b = yh1Var;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i212, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b = r2;
                    yh1 yh1Var2 = this.b;
                    switch (b) {
                        case 0:
                            if (i212 != 5 || TextUtils.isEmpty(yh1Var2.d.getEditText().getText())) {
                                return false;
                            }
                            yh1Var2.y.requestFocus();
                            return true;
                        default:
                            if (i212 != 6 || (r7Var = yh1Var2.a) == null) {
                                return false;
                            }
                            r7Var.performClick();
                            return true;
                    }
                }
            });
            yh1Var.y.addTextChangedListener(new xh1((byte) 0));
            TextView textView = new TextView(context);
            yh1Var.V = textView;
            textView.setTextSize(1, 15.0f);
            zkb.X(yh1Var.V, bkb.E6, null);
            TextView textView2 = yh1Var.V;
            if (k96.a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12);
            yh1Var.V.setText(k96.M0(2131751450, null));
            LinearLayout linearLayout2 = yh1Var.M;
            TextView textView3 = yh1Var.V;
            if (k96.a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout2.addView(textView3, nme.t(-2, -2, i13, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            yh1Var.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            yh1Var.M = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(yh1Var.M, new FrameLayout.LayoutParams(-1, -2));
            na7 messagesController = yh1Var.getMessagesController();
            long j = yh1Var.k0;
            TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
            if (K0 != null && (!hc2.T(K0) || hc2.n0(K0))) {
                z = true;
            } else {
                z = false;
            }
            yh1Var.K = z;
            a aVar2 = yh1Var.actionBar;
            if (z) {
                i2 = 2131749208;
            } else {
                i2 = 2131752285;
            }
            aVar2.setTitle(k96.M0(i2, null));
            View view = yh1Var.fragmentView;
            int i22 = bkb.Z6;
            view.setTag(Integer.valueOf(i22));
            zkb.h(i22, null, yh1Var.fragmentView);
            ld5 ld5Var = new ld5(context, 23);
            yh1Var.I = ld5Var;
            ld5Var.setHeight(46);
            ld5 ld5Var2 = yh1Var.I;
            int i23 = bkb.c6;
            zkb.h(i23, null, ld5Var2);
            ld5 ld5Var3 = yh1Var.I;
            if (yh1Var.K) {
                i3 = 2131749199;
            } else {
                i3 = 2131752263;
            }
            ld5Var3.setText(k96.M0(i3, null));
            yh1Var.M.addView(yh1Var.I);
            LinearLayout linearLayout4 = new LinearLayout(context);
            yh1Var.H = linearLayout4;
            linearLayout4.setOrientation(1);
            zkb.h(i23, null, yh1Var.H);
            yh1Var.M.addView(yh1Var.H, nme.o(-1, -2));
            uy8 uy8Var = new uy8(context, false);
            yh1Var.S = uy8Var;
            ff0 L0 = bkb.L0(false);
            int i24 = bkb.h6;
            vkb M = zkb.M(i24);
            uy8Var.setBackground(L0);
            zkb.j(uy8Var, L0, null, M, null);
            Boolean bool = yh1Var.m0;
            if (bool != null && !bool.booleanValue()) {
                yh1Var.c0 = true;
            }
            boolean z8 = yh1Var.K;
            uy8 uy8Var2 = yh1Var.S;
            if (z8) {
                i4 = 1;
                uy8Var2.b(k96.M0(2131748446, null), k96.M0(2131748445, null), false, !yh1Var.c0);
            } else {
                i4 = 1;
                uy8Var2.b(k96.M0(2131752306, null), k96.M0(2131752303, null), false, !yh1Var.c0);
            }
            yh1Var.S.setOnClickListener(new sh1(yh1Var, (byte) 2));
            if (bool == null || bool.booleanValue()) {
                yh1Var.H.addView(yh1Var.S, nme.o(-1, -2));
            }
            uy8 uy8Var3 = new uy8(context, false);
            yh1Var.T = uy8Var3;
            ff0 L02 = bkb.L0(false);
            vkb M2 = zkb.M(i24);
            uy8Var3.setBackground(L02);
            zkb.j(uy8Var3, L02, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                yh1Var.c0 = false;
            }
            boolean z9 = yh1Var.K;
            uy8 uy8Var4 = yh1Var.T;
            if (z9) {
                uy8Var4.b(k96.M0(2131748449, null), k96.M0(2131748448, null), false, yh1Var.c0);
            } else {
                uy8Var4.b(k96.M0(2131752317, null), k96.M0(2131752316, null), false, yh1Var.c0);
            }
            yh1Var.T.setOnClickListener(new sh1(yh1Var, (byte) 3));
            if (bool == null || !bool.booleanValue()) {
                yh1Var.H.addView(yh1Var.T, nme.o(-1, -2));
            }
            b9a b9aVar = new b9a(context, (de9) null);
            yh1Var.e = b9aVar;
            yh1Var.M.addView(b9aVar, nme.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            yh1Var.O = linearLayout5;
            linearLayout5.setOrientation(i4);
            zkb.h(i23, null, yh1Var.O);
            yh1Var.M.addView(yh1Var.O, nme.o(-1, -2));
            ld5 ld5Var4 = new ld5(context);
            yh1Var.X = ld5Var4;
            yh1Var.O.addView(ld5Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            yh1Var.P = linearLayout6;
            linearLayout6.setOrientation(0);
            yh1Var.O.addView(yh1Var.P, nme.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            yh1Var.J = editTextBoldCursor4;
            editTextBoldCursor4.setText(na7.q1(yh1Var.currentAccount).N2 + "/");
            yh1Var.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = yh1Var.J;
            int i25 = bkb.G6;
            zkb.D(editTextBoldCursor5, i25, null);
            EditTextBoldCursor editTextBoldCursor6 = yh1Var.J;
            int i26 = bkb.F6;
            zkb.X(editTextBoldCursor6, i26, null);
            yh1Var.J.setMaxLines(1);
            yh1Var.J.setLines(1);
            yh1Var.J.setEnabled(false);
            yh1Var.J.setBackgroundDrawable(null);
            yh1Var.J.setPadding(0, 0, 0, 0);
            yh1Var.J.setSingleLine(true);
            yh1Var.J.setInputType(163840);
            yh1Var.J.setImeOptions(6);
            yh1Var.P.addView(yh1Var.J, nme.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            yh1Var.y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            zkb.D(yh1Var.y, i25, null);
            zkb.X(yh1Var.y, i26, null);
            yh1Var.y.setMaxLines(1);
            yh1Var.y.setLines(1);
            yh1Var.y.setBackgroundDrawable(null);
            yh1Var.y.setPadding(0, 0, 0, 0);
            yh1Var.y.setSingleLine(true);
            yh1Var.y.setInputType(163872);
            yh1Var.y.setImeOptions(6);
            yh1Var.y.setHint(k96.M0(2131752254, null));
            zkb.v(yh1Var.y, i26, null);
            yh1Var.y.setCursorSize(gl.L(20.0f));
            yh1Var.y.setCursorWidth(1.5f);
            yh1Var.P.addView(yh1Var.y, nme.o(-1, 36));
            yh1Var.y.addTextChangedListener(new b7(yh1Var, (byte) 6));
            LinearLayout linearLayout7 = new LinearLayout(context);
            yh1Var.Q = linearLayout7;
            linearLayout7.setOrientation(1);
            yh1Var.O.addView(yh1Var.Q, nme.o(-1, -2));
            f36 f36Var = new f36(context, yh1Var, null, true, hc2.T(yh1Var.getMessagesController().K0(Long.valueOf(j))));
            yh1Var.R = f36Var;
            f36Var.b(true);
            yh1Var.R.d(0, null, false);
            yh1Var.Q.addView(yh1Var.R);
            ke1 ke1Var = new ke1((byte) 1, context, yh1Var);
            yh1Var.W = ke1Var;
            zkb.G(ke1Var, bkb.I6, null);
            zkb.C(yh1Var.W, bkb.J6, null);
            yh1Var.W.setTextSize(1, 15.0f);
            ke1 ke1Var2 = yh1Var.W;
            if (k96.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            ke1Var2.setGravity(i5);
            yh1Var.W.setVisibility(8);
            yh1Var.W.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
            LinearLayout linearLayout8 = yh1Var.O;
            ke1 ke1Var3 = yh1Var.W;
            if (k96.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            linearLayout8.addView(ke1Var3, nme.t(-2, -2, i6, 18, 3, 18, 7));
            mhb mhbVar = new mhb(context);
            yh1Var.U = mhbVar;
            int i27 = bkb.a7;
            zkb.Z(mhbVar, context, 2131231233, i27);
            yh1Var.M.addView(yh1Var.U, nme.o(-1, -2));
            q86 q86Var = new q86(context);
            yh1Var.i0 = q86Var;
            yh1Var.M.addView(q86Var, nme.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            yh1Var.N = linearLayout9;
            zkb.h(i23, null, linearLayout9);
            yh1Var.N.setOrientation(1);
            yh1Var.M.addView(yh1Var.N, nme.o(-1, -2));
            mhb mhbVar2 = new mhb(context);
            yh1Var.g0 = mhbVar2;
            zkb.Z(mhbVar2, context, 2131231233, i27);
            yh1Var.M.addView(yh1Var.g0, nme.o(-1, -2));
            yh1Var.m0();
        }
        return yh1Var.fragmentView;
    }

    public final void d0(String str) {
        if (str != null && str.length() > 0) {
            this.W.setVisibility(0);
        } else {
            this.W.setVisibility(8);
        }
        q21 q21Var = this.a0;
        if (q21Var != null) {
            gl.r(q21Var);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (i == 0 && charAt >= '0' && charAt <= '9') {
                        this.W.setText(k96.M0(2131748713, null));
                        ke1 ke1Var = this.W;
                        int i2 = bkb.o7;
                        ke1Var.setTag(Integer.valueOf(i2));
                        zkb.X(this.W, i2, null);
                        return;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.W.setText(k96.M0(2131748717, null));
                        ke1 ke1Var2 = this.W;
                        int i3 = bkb.o7;
                        ke1Var2.setTag(Integer.valueOf(i3));
                        zkb.X(this.W, i3, null);
                        return;
                    }
                }
            } else {
                this.W.setText(k96.M0(2131748717, null));
                ke1 ke1Var3 = this.W;
                int i4 = bkb.o7;
                ke1Var3.setTag(Integer.valueOf(i4));
                zkb.X(this.W, i4, null);
                return;
            }
        }
        if (str != null && str.length() >= 4) {
            int length = str.length();
            ke1 ke1Var4 = this.W;
            if (length > 32) {
                ke1Var4.setText(k96.M0(2131748716, null));
                ke1 ke1Var5 = this.W;
                int i5 = bkb.o7;
                ke1Var5.setTag(Integer.valueOf(i5));
                zkb.X(this.W, i5, null);
                return;
            }
            ke1Var4.setText(k96.M0(2131748730, null));
            ke1 ke1Var6 = this.W;
            int i6 = bkb.E6;
            ke1Var6.setTag(Integer.valueOf(i6));
            zkb.X(this.W, i6, null);
            this.Z = str;
            q21 q21Var2 = new q21(this, str, (byte) 26);
            this.a0 = q21Var2;
            gl.e3(q21Var2, 300L);
            return;
        }
        this.W.setText(k96.M0(2131748715, null));
        ke1 ke1Var7 = this.W;
        int i7 = bkb.o7;
        ke1Var7.setTag(Integer.valueOf(i7));
        zkb.X(this.W, i7, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.R) {
            hd hdVar = this.w0;
            if (hdVar != null) {
                try {
                    hdVar.dismiss();
                    this.w0 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            l0(false);
            this.t0 = false;
        } else if (i == kk7.Q) {
            hd hdVar2 = this.w0;
            if (hdVar2 != null) {
                try {
                    hdVar2.dismiss();
                    this.w0 = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.n0 != null || this.o0 != null || this.p0 != null) {
                na7.q1(this.currentAccount).x(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            yh1 yh1Var = new yh1(bundle);
            yh1Var.v0 = this.v0;
            presentFragment(yh1Var, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        wl5 wl5Var = this.x;
        if (wl5Var != null && wl5Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wl5 wl5Var = this.x;
        if ((wl5Var == null || dialog != wl5Var.c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e0(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = na7.q1(this.currentAccount).f1(this.k0);
        this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new en0(this, str, tL_channels_checkUsername, (byte) 14), 2);
    }

    public final void f0(TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = na7.g1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new qh1(this, (byte) 2), 64);
    }

    public final void g0(View view) {
        TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        boolean z = currentChannel.megagroup;
        int i = this.currentAccount;
        if (z) {
            hdVar.U = gl.T2(k96.a0("RevokeLinkAlert", null, 2131745829, na7.q1(i).N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
        } else {
            hdVar.U = gl.T2(k96.a0("RevokeLinkAlertChannel", null, 2131745828, na7.q1(i).N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131745831, null), new q31(this, currentChannel, (byte) 9));
        showDialog(hdVar);
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        rt3 rt3Var = this.d;
        int i = bkb.j6;
        arrayList.add(new blb(rt3Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        rt3 rt3Var2 = this.d;
        int i2 = bkb.k6;
        arrayList.add(new blb(rt3Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.a7));
        LinearLayout linearLayout = this.Q;
        int i3 = bkb.h6;
        arrayList.add(new blb(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.i0, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        return arrayList;
    }

    public final void h0(hd hdVar) {
        this.t0 = false;
        this.s0 = false;
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        l0(false);
        hdVar.dismiss();
    }

    public final void i0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (z2) {
            this.r = new AnimatorSet();
            if (z) {
                this.s.setVisibility(0);
                AnimatorSet animatorSet2 = this.r;
                vh1 vh1Var = this.n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(vh1Var, property, 0.0f), ObjectAnimator.ofFloat(this.s, property, 1.0f));
            } else {
                if (this.n.getVisibility() != 0) {
                    this.n.setAlpha(0.0f);
                }
                this.n.setVisibility(0);
                AnimatorSet animatorSet3 = this.r;
                vh1 vh1Var2 = this.n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(vh1Var2, property2, 1.0f), ObjectAnimator.ofFloat(this.s, property2, 0.0f));
            }
            this.r.setDuration(180L);
            this.r.addListener(new y7((byte) 13, this, z));
            this.r.start();
            return;
        }
        vh1 vh1Var3 = this.n;
        if (z) {
            vh1Var3.setAlpha(1.0f);
            this.n.setVisibility(4);
            this.s.setAlpha(1.0f);
            this.s.setVisibility(0);
            return;
        }
        vh1Var3.setAlpha(1.0f);
        this.n.setVisibility(0);
        this.s.setAlpha(0.0f);
        this.s.setVisibility(4);
    }

    public final void j0() {
        if (this.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131744595, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744596, null);
        alertDialog$Builder.j(k96.M0(2131742971, null), null);
        alertDialog$Builder.g(k96.M0(2131744604, null), new rh1(this, (byte) 0));
        this.w0 = alertDialog$Builder.o();
    }

    public final void k0() {
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(2, this.currentAccount, null, getParentActivity(), this);
        h26Var.q2 = true;
        h26Var.C2 = new oh1(this, (byte) 1);
        showDialog(h26Var);
    }

    public final void l0(boolean z) {
        float f;
        if (!z) {
            gl.r(this.x0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = this.b.c;
            float f3 = 0.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 25));
            ValueAnimator valueAnimator2 = this.y0;
            float f4 = this.b.c;
            if (z) {
                f3 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f4 - f3) * 200.0f);
            this.y0.setInterpolator(s33.f);
            this.y0.start();
        }
    }

    public final void m0() {
        int i;
        String M0;
        int i2;
        int i3;
        int L;
        int i4;
        String M02;
        if (this.e == null) {
            return;
        }
        int i5 = 8;
        String str = null;
        if (!this.c0 && !this.l0) {
            this.U.setText(k96.M0(2131752521, null));
            mhb mhbVar = this.U;
            int i6 = bkb.o7;
            mhbVar.setTag(Integer.valueOf(i6));
            zkb.X(this.U.getTextView(), i6, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                mhb mhbVar2 = this.U;
                zkb.Z(mhbVar2, mhbVar2.getContext(), 2131231233, bkb.a7);
                this.g0.setVisibility(8);
            } else {
                mhb mhbVar3 = this.U;
                zkb.Z(mhbVar3, mhbVar3.getContext(), 2131231232, bkb.a7);
                this.i0.setVisibility(8);
                this.N.setVisibility(0);
                this.g0.setVisibility(0);
            }
        } else {
            mhb mhbVar4 = this.U;
            int i7 = bkb.A6;
            mhbVar4.setTag(Integer.valueOf(i7));
            zkb.X(this.U.getTextView(), i7, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            mhb mhbVar5 = this.U;
            zkb.Z(mhbVar5, mhbVar5.getContext(), 2131231233, bkb.a7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            boolean z = this.K;
            mhb mhbVar6 = this.U;
            boolean z2 = this.c0;
            if (z) {
                if (z2) {
                    i4 = 2131748447;
                } else {
                    i4 = 2131748444;
                }
                mhbVar6.setText(k96.M0(i4, null));
                ld5 ld5Var = this.X;
                if (this.c0) {
                    M02 = k96.M0(2131752391, null);
                } else {
                    M02 = k96.M0(2131752373, null);
                }
                ld5Var.setText(M02);
            } else {
                if (z2) {
                    i = 2131752315;
                } else {
                    i = 2131752255;
                }
                mhbVar6.setText(k96.M0(i, null));
                ld5 ld5Var2 = this.X;
                if (this.c0) {
                    M0 = k96.M0(2131752391, null);
                } else {
                    M0 = k96.M0(2131752373, null);
                }
                ld5Var2.setText(M0);
            }
            LinearLayout linearLayout = this.P;
            if (this.c0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            LinearLayout linearLayout2 = this.Q;
            if (this.c0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            linearLayout2.setVisibility(i3);
            LinearLayout linearLayout3 = this.O;
            if (this.c0) {
                L = 0;
            } else {
                L = gl.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            f36 f36Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            f36Var.setLink(str);
            ke1 ke1Var = this.W;
            if (!this.c0 && ke1Var.length() != 0) {
                i5 = 0;
            }
            ke1Var.setVisibility(i5);
        }
        this.S.a(!this.c0);
        this.T.a(this.c0);
        this.y.clearFocus();
        gl.t1(this.y);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.d;
        if (rt3Var == null || !rt3Var.e) {
            return true;
        }
        if (z) {
            rt3Var.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.Q);
        kk7.f(this.currentAccount).b(this, kk7.R);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            na7 messagesController = getMessagesController();
            long j = this.k0;
            TLRPC.ChatFull L0 = messagesController.L0(j);
            if (L0 != null) {
                this.e0 = L0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().h1(-j);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new qh1(this, (byte) 3));
            }
        }
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.a = this;
            wl5Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        kk7.f(this.currentAccount).n(this, kk7.Q);
        kk7.f(this.currentAccount).n(this, kk7.R);
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.c();
        }
        gl.y2(getParentActivity(), this.classGuid);
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.r();
        }
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.j(i, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.s();
        }
        gl.W2(getParentActivity(), this.classGuid);
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            ih2 ih2Var = this.c;
            if (ih2Var != null) {
                ih2Var.b(bkb.w0(null, bkb.u8, false));
            }
            q86 q86Var = this.i0;
            if (q86Var != null && q86Var.getChildCount() > 0 && (this.i0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(bkb.w0(null, bkb.g6, false));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && this.j0 != 1) {
            this.d.requestFocus();
            mt3 mt3Var = this.d.a;
            mt3Var.requestFocus();
            gl.F3(mt3Var);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            wl5 wl5Var = this.x;
            if (wl5Var != null) {
                wl5Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                rt3 rt3Var = this.d;
                if (rt3Var != null) {
                    rt3Var.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            wl5 wl5Var = this.x;
            if (wl5Var != null && (str = wl5Var.f) != null) {
                bundle.putString("path", str);
            }
            rt3 rt3Var = this.d;
            if (rt3Var != null) {
                String obj = rt3Var.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }
}
