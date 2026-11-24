package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class pp9 extends Dialog implements jm7, VoIPService.StateListener {
    public static pp9 Q0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final View E;
    public int E0;
    public final rja F;
    public long F0;
    public final LinearLayout G;
    public boolean G0;
    public final nh2 H;
    public boolean H0;
    public final nh2 I;
    public boolean I0;
    public final UndoView J;
    public boolean J0;
    public final bka K;
    public kp9 K0;
    public final sy2 L;
    public final wo9 L0;
    public final zja M;
    public final wo9 M0;
    public final a8 N;
    public final wo9 N0;
    public final a8 O;
    public final wo9 O0;
    public final a8 P;
    public final ep9 P0;
    public final a8 Q;
    public iq5 R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public final wo9 Z;
    public final LaunchActivity a;
    public boolean a0;
    public final j5 b;
    public float b0;
    public final qd2 c;
    public float c0;
    public TLRPC.Chat d;
    public int d0;
    public final r63 e;
    public int e0;
    public final op9 f;
    public int f0;
    public int g0;
    public final FrameLayout h;
    public int h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public zna l0;
    public boolean m0;
    public final TextureView n;
    public boolean n0;
    public float o0;
    public ValueAnimator p0;
    public final wo9 q0;
    public final sy4 r;
    public Surface r0;
    public final mp9 s;
    public boolean s0;
    public float t0;
    public boolean u0;
    public boolean v0;
    public final RadialProgressView w;
    public boolean w0;
    public final TextView x;
    public float x0;
    public final View y;
    public ValueAnimator y0;
    public int z0;

    public pp9(LaunchActivity launchActivity, j5 j5Var, qd2 qd2Var, TLRPC.Chat chat) {
        super(launchActivity, 2131755352);
        int i;
        int i2;
        float f;
        r63 r63Var = new r63();
        this.e = r63Var;
        sy4 sy4Var = new sy4();
        this.r = sy4Var;
        this.L = new sy2(this);
        this.R = iq5.e;
        this.Z = new wo9(this, (byte) 6);
        this.h0 = gm.L(5.0f);
        boolean z = true;
        this.n0 = true;
        this.o0 = 1.0f;
        this.q0 = new wo9(this, (byte) 7);
        this.F0 = -1L;
        this.L0 = new wo9(this, (byte) 1);
        this.M0 = new wo9(this, (byte) 2);
        this.N0 = new wo9(this, (byte) 3);
        this.O0 = new wo9(this, (byte) 4);
        this.P0 = new ep9(this);
        this.a = launchActivity;
        this.b = j5Var;
        this.c = qd2Var;
        this.d = chat;
        ArrayList arrayList = qd2Var.f;
        if (!arrayList.isEmpty() && ((rd2) arrayList.get(0)).c > 0.0f) {
            this.t0 = ((rd2) arrayList.get(0)).c;
        }
        op9 op9Var = new op9(this, launchActivity);
        this.f = op9Var;
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setOutlineProvider(new fp9(this));
        frameLayout.setClipToOutline(true);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final pp9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                int i3 = 1;
                pp9 pp9Var = this.b;
                switch (b) {
                    case 0:
                        wo9 wo9Var = pp9Var.Z;
                        if (pp9Var.g()) {
                            if (pp9Var.a0) {
                                pp9Var.a0 = false;
                                gm.r(wo9Var);
                                pp9Var.l(!pp9Var.W, true);
                                return;
                            }
                            pp9Var.a0 = true;
                            gm.d3(wo9Var, ViewConfiguration.getDoubleTapTimeout());
                            return;
                        } else if (pp9Var.T) {
                            pp9Var.k(!pp9Var.n0, true);
                            return;
                        } else {
                            pp9Var.m(true, true);
                            return;
                        }
                    case 1:
                        pp9Var.j();
                        pp9Var.f();
                        return;
                    case 2:
                        LaunchActivity launchActivity2 = pp9Var.a;
                        pp9Var.j();
                        if (pp9Var.v0) {
                            if (pp9Var.g()) {
                                pp9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                return;
                            } else if (gm.O1()) {
                                pp9Var.m(true, true);
                                return;
                            } else {
                                if (pp9Var.S == pp9Var.h()) {
                                    pp9Var.m(true, true);
                                }
                                if (pp9Var.h()) {
                                    i3 = 6;
                                }
                                launchActivity2.setRequestedOrientation(i3);
                                return;
                            }
                        }
                        return;
                    default:
                        pp9Var.j();
                        g95.l1(pp9Var.getContext(), new wo9(pp9Var, (byte) 5), false, false);
                        return;
                }
            }
        });
        TextureView textureView = new TextureView(launchActivity);
        this.n = textureView;
        textureView.setSurfaceTextureListener(new gp9(this));
        frameLayout.addView(textureView, qoe.e(-1, -1, 17));
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity, null);
        this.w = radialProgressView;
        radialProgressView.setSize(gm.L(36.0f));
        radialProgressView.setProgressColor(-1);
        frameLayout.addView(radialProgressView, qoe.e(48, 48, 17));
        TextView textView = new TextView(launchActivity);
        this.x = textView;
        textView.setTextColor(on2.p(-1, 204));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        op9Var.addView(frameLayout);
        View view = new View(launchActivity);
        this.y = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{on2.p(-16777216, 204), on2.p(-16777216, 102), 0}));
        op9Var.addView(view);
        View view2 = new View(launchActivity);
        this.E = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.p(-16777216, 204), on2.p(-16777216, 102), 0}));
        op9Var.addView(view2);
        rja rjaVar = new rja(launchActivity, r63Var);
        this.F = rjaVar;
        rjaVar.setOccupyStatusBar(false);
        rjaVar.setForceSkipTouches(true);
        rjaVar.setTitleColor(-1);
        rjaVar.setSubtitleColor(on2.p(-1, 179));
        rjaVar.m0 = true;
        rjaVar.g0 = -1;
        rjaVar.updateColors();
        int p = on2.p(-1, 42);
        rjaVar.n0 = true;
        rjaVar.i0 = p;
        rjaVar.updateColors();
        rjaVar.setBackButtonImage(2131231244);
        kz4 kz4Var = new kz4();
        kz4Var.a(-14933463);
        kz4 kz4Var2 = kz4Var;
        if (Build.VERSION.SDK_INT >= 31) {
            mp9 mp9Var = new mp9(new yf9(op9Var, (byte) 8));
            this.s = mp9Var;
            kz4Var2 = mp9Var;
        }
        ?? km0Var = new km0(kz4Var2, kz4Var2, kz4Var2);
        sy4Var.i(op9Var);
        km0Var.j = sy4Var;
        km0Var.k = true;
        es esVar = new es(this, (byte) 6);
        nm0 nm0Var = new nm0(r63Var);
        nm0Var.e = new yf9(esVar, (byte) 9);
        nm0Var.f(0, 0);
        nm0Var.e(0, 0);
        nm0Var.d(0, 0);
        rjaVar.M = km0Var;
        rjaVar.N = nm0Var;
        rjaVar.r();
        bka bkaVar = new bka(launchActivity);
        this.K = bkaVar;
        bkaVar.setOnShownChanged(new bn0((byte) 25));
        rjaVar.setMenuOverlayProvider(new wg0(this, (byte) 5));
        yja t = rjaVar.t();
        t.a(1, 2131232435).setContentDescription(jb6.M0(2131754807, null));
        boolean W = sd2.W(chat);
        zja a = t.a(2, 2131231248);
        this.M = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        this.N = a.e(9, 2131232209, jb6.M0(2131743021, null));
        if (W) {
            i = 2131743169;
        } else {
            i = 2131743068;
        }
        this.O = a.e(10, 2131232122, jb6.M0(i, null));
        this.P = a.e(11, 2131232437, jb6.M0(2131743032, null));
        if (W) {
            i2 = 2131743165;
        } else {
            i2 = 2131743064;
        }
        a8 e = a.e(12, 2131232093, jb6.M0(i2, null));
        this.Q = e;
        int v0 = cmb.v0(cmb.p7, r63Var);
        e.d(v0, v0);
        rjaVar.setActionBarMenuOnItemClick(new ip9(this));
        op9Var.addView(rjaVar);
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        es esVar2 = new es(this, (byte) 6);
        nm0 nm0Var2 = new nm0(r63Var);
        nm0Var2.e = new yf9(esVar2, (byte) 9);
        nm0Var2.f(0, 0);
        nm0Var2.e(0, 0);
        nm0Var2.d(0, 0);
        nh2 nh2Var = new nh2(launchActivity, 2131232441, km0Var, nm0Var2, jb6.M0(2131743121, null));
        this.H = nh2Var;
        nh2Var.setOnClickListener(new View.OnClickListener(this) {
            public final pp9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                int i3 = 1;
                pp9 pp9Var = this.b;
                switch (b) {
                    case 0:
                        wo9 wo9Var = pp9Var.Z;
                        if (pp9Var.g()) {
                            if (pp9Var.a0) {
                                pp9Var.a0 = false;
                                gm.r(wo9Var);
                                pp9Var.l(!pp9Var.W, true);
                                return;
                            }
                            pp9Var.a0 = true;
                            gm.d3(wo9Var, ViewConfiguration.getDoubleTapTimeout());
                            return;
                        } else if (pp9Var.T) {
                            pp9Var.k(!pp9Var.n0, true);
                            return;
                        } else {
                            pp9Var.m(true, true);
                            return;
                        }
                    case 1:
                        pp9Var.j();
                        pp9Var.f();
                        return;
                    case 2:
                        LaunchActivity launchActivity2 = pp9Var.a;
                        pp9Var.j();
                        if (pp9Var.v0) {
                            if (pp9Var.g()) {
                                pp9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                return;
                            } else if (gm.O1()) {
                                pp9Var.m(true, true);
                                return;
                            } else {
                                if (pp9Var.S == pp9Var.h()) {
                                    pp9Var.m(true, true);
                                }
                                if (pp9Var.h()) {
                                    i3 = 6;
                                }
                                launchActivity2.setRequestedOrientation(i3);
                                return;
                            }
                        }
                        return;
                    default:
                        pp9Var.j();
                        g95.l1(pp9Var.getContext(), new wo9(pp9Var, (byte) 5), false, false);
                        return;
                }
            }
        });
        es esVar3 = new es(this, (byte) 6);
        nm0 nm0Var3 = new nm0(r63Var);
        nm0Var3.e = new yf9(esVar3, (byte) 9);
        nm0Var3.f(0, 0);
        nm0Var3.e(0, 0);
        nm0Var3.d(0, 0);
        nh2 nh2Var2 = new nh2(launchActivity, 2131232817, km0Var, nm0Var3, jb6.M0(2131743062, null));
        this.I = nh2Var2;
        nh2Var2.setOnClickListener(new View.OnClickListener(this) {
            public final pp9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                int i3 = 1;
                pp9 pp9Var = this.b;
                switch (b) {
                    case 0:
                        wo9 wo9Var = pp9Var.Z;
                        if (pp9Var.g()) {
                            if (pp9Var.a0) {
                                pp9Var.a0 = false;
                                gm.r(wo9Var);
                                pp9Var.l(!pp9Var.W, true);
                                return;
                            }
                            pp9Var.a0 = true;
                            gm.d3(wo9Var, ViewConfiguration.getDoubleTapTimeout());
                            return;
                        } else if (pp9Var.T) {
                            pp9Var.k(!pp9Var.n0, true);
                            return;
                        } else {
                            pp9Var.m(true, true);
                            return;
                        }
                    case 1:
                        pp9Var.j();
                        pp9Var.f();
                        return;
                    case 2:
                        LaunchActivity launchActivity2 = pp9Var.a;
                        pp9Var.j();
                        if (pp9Var.v0) {
                            if (pp9Var.g()) {
                                pp9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                return;
                            } else if (gm.O1()) {
                                pp9Var.m(true, true);
                                return;
                            } else {
                                if (pp9Var.S == pp9Var.h()) {
                                    pp9Var.m(true, true);
                                }
                                if (pp9Var.h()) {
                                    i3 = 6;
                                }
                                launchActivity2.setRequestedOrientation(i3);
                                return;
                            }
                        }
                        return;
                    default:
                        pp9Var.j();
                        g95.l1(pp9Var.getContext(), new wo9(pp9Var, (byte) 5), false, false);
                        return;
                }
            }
        });
        zo9 zo9Var = new zo9(on2.p(on2.l(cmb.w0(null, cmb.th, false), -14933463), 191));
        nm0 nm0Var4 = new nm0(r63Var);
        nm0Var4.e = new yf9(zo9Var, (byte) 9);
        nm0Var4.f(0, 0);
        nm0Var4.e(0, 0);
        nm0Var4.d(0, 0);
        nh2 nh2Var3 = new nh2(launchActivity, 2131232440, km0Var, nm0Var4, jb6.M0(2131743048, null));
        nh2Var3.setOnClickListener(new View.OnClickListener(this) {
            public final pp9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                int i3 = 1;
                pp9 pp9Var = this.b;
                switch (b) {
                    case 0:
                        wo9 wo9Var = pp9Var.Z;
                        if (pp9Var.g()) {
                            if (pp9Var.a0) {
                                pp9Var.a0 = false;
                                gm.r(wo9Var);
                                pp9Var.l(!pp9Var.W, true);
                                return;
                            }
                            pp9Var.a0 = true;
                            gm.d3(wo9Var, ViewConfiguration.getDoubleTapTimeout());
                            return;
                        } else if (pp9Var.T) {
                            pp9Var.k(!pp9Var.n0, true);
                            return;
                        } else {
                            pp9Var.m(true, true);
                            return;
                        }
                    case 1:
                        pp9Var.j();
                        pp9Var.f();
                        return;
                    case 2:
                        LaunchActivity launchActivity2 = pp9Var.a;
                        pp9Var.j();
                        if (pp9Var.v0) {
                            if (pp9Var.g()) {
                                pp9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                return;
                            } else if (gm.O1()) {
                                pp9Var.m(true, true);
                                return;
                            } else {
                                if (pp9Var.S == pp9Var.h()) {
                                    pp9Var.m(true, true);
                                }
                                if (pp9Var.h()) {
                                    i3 = 6;
                                }
                                launchActivity2.setRequestedOrientation(i3);
                                return;
                            }
                        }
                        return;
                    default:
                        pp9Var.j();
                        g95.l1(pp9Var.getContext(), new wo9(pp9Var, (byte) 5), false, false);
                        return;
                }
            }
        });
        linearLayout.addView(nh2Var, qoe.o(104, 92));
        linearLayout.addView(nh2Var2, qoe.o(104, 92));
        linearLayout.addView(nh2Var3, qoe.o(104, 92));
        op9Var.addView(linearLayout);
        UndoView undoView = new UndoView(launchActivity);
        this.J = undoView;
        op9Var.addView(undoView, new FrameLayout.LayoutParams(-1, -2));
        op9Var.addView(bkaVar, new FrameLayout.LayoutParams(-1, -1));
        bp9 bp9Var = new bp9(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(op9Var, bp9Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        z = (sharedInstance == null || sharedInstance.getCallState() != 3) ? false : z;
        this.v0 = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.x0 = f;
        s();
    }

    public static int b(int i, Bitmap bitmap) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < i + 2; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                int pixel = bitmap.getPixel(i6, i5);
                i2 += Color.red(pixel);
                i3 += Color.green(pixel);
                i4 += Color.blue(pixel);
            }
        }
        return Color.rgb(i2 / 8, i3 / 8, i4 / 8);
    }

    public static void o(he heVar) {
        heVar.j(cmb.w0(null, cmb.kh, false));
        heVar.show();
        heVar.o(cmb.w0(null, cmb.dh, false));
    }

    public final void a(float f) {
        int i;
        int i2;
        this.o0 = f;
        int i3 = 0;
        if (f <= 0.0f) {
            i = 4;
        } else {
            i = 0;
        }
        rja rjaVar = this.F;
        rjaVar.setAlpha(f);
        rjaVar.setVisibility(i);
        LinearLayout linearLayout = this.G;
        linearLayout.setAlpha(f);
        linearLayout.setVisibility(i);
        float f2 = f * this.U;
        View view = this.y;
        view.setAlpha(f2);
        View view2 = this.E;
        view2.setAlpha(f2);
        int i4 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i4 <= 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (i4 <= 0) {
            i3 = 4;
        }
        view2.setVisibility(i3);
    }

    public final AlertDialog$Builder c() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.e, getContext());
        alertDialog$Builder.a.J = cmb.fh;
        return alertDialog$Builder;
    }

    public final EditTextBoldCursor d(AlertDialog$Builder alertDialog$Builder, CharSequence charSequence) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(cmb.T(getContext()));
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = cmb.dh;
        editTextBoldCursor.setTextColor(cmb.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(cmb.w0(null, cmb.eh, false));
        editTextBoldCursor.setCursorColor(cmb.w0(null, i, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setHint(charSequence);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, qoe.t(-1, 36, 51, 24, 6, 24, 12));
        alertDialog$Builder.n(linearLayout);
        return editTextBoldCursor;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        String M0;
        int i4;
        int i5 = nm7.w2;
        qd2 qd2Var = this.c;
        if (i == i5) {
            if (qd2Var.b.id == ((Long) objArr[1]).longValue()) {
                if (qd2Var.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                } else {
                    s();
                }
            }
        } else if (i == nm7.T) {
            if (((TLRPC.ChatFull) objArr[0]).id == qd2Var.c) {
                s();
            }
        } else if (i == nm7.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                boolean W = sd2.W(this.d);
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (W) {
                        i4 = 2131743136;
                    } else {
                        i4 = 2131743003;
                    }
                    M0 = jb6.M0(i4, null);
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = b10.j(new StringBuilder(jb6.M0(2131751042, null)), "\n", str);
                } else {
                    if (W) {
                        i3 = 2131743162;
                    } else {
                        i3 = 2131743054;
                    }
                    M0 = jb6.M0(i3, null);
                }
                AlertDialog$Builder c = c();
                he heVar = c.a;
                heVar.S = jb6.M0(2131742990, null);
                heVar.U = M0;
                c.j(jb6.M0(2131747564, null), null);
                c.i(new cp9(this, (byte) 1));
                try {
                    o(heVar);
                } catch (Exception unused) {
                }
            }
        } else if (i == nm7.D2 && VoIPService.getSharedInstance() == null) {
            dismiss();
        }
    }

    @Override
    public final void dismiss() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        gm.r(this.q0);
        this.a0 = false;
        gm.r(this.Z);
        gm.r(this.M0);
        gm.r(this.N0);
        gm.r(this.O0);
        kp9 kp9Var = this.K0;
        if (kp9Var != null) {
            kp9Var.dismiss();
        }
        wo9 wo9Var = new wo9(this, (byte) 0);
        op9 op9Var = this.f;
        pp9 pp9Var = op9Var.P;
        pp9Var.H0 = true;
        pp9Var.u();
        if (!pp9Var.T && op9Var.getHeight() != 0) {
            op9Var.a(op9Var.getHeight() - pp9Var.e0, 250L, wo9Var);
        } else {
            op9Var.animate().alpha(0.0f).setDuration(150L).withEndAction(wo9Var).start();
        }
    }

    public final void e() {
        this.K.a(false);
        this.r.i(null);
        this.J0 = true;
        gm.r(this.q0);
        this.a0 = false;
        gm.r(this.Z);
        gm.r(this.M0);
        gm.r(this.N0);
        gm.r(this.O0);
        if (Q0 == this) {
            Q0 = null;
        }
        v();
        j5 j5Var = this.b;
        int i = j5Var.a;
        int i2 = j5Var.a;
        nm7.f(i).n(this, nm7.w2);
        nm7.f(i2).n(this, nm7.M0);
        nm7.f(i2).n(this, nm7.T);
        nm7.e().n(this, nm7.D2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        wo9 wo9Var = this.L0;
        LaunchActivity launchActivity = this.a;
        launchActivity.a1.remove(wo9Var);
        launchActivity.setRequestedOrientation(-1);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        g95.t5 = false;
        nm7.e().k(nm7.F2, new Object[0]);
        oa5.k(launchActivity);
    }

    public final void f() {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        String p;
        if (this.d == null) {
            return;
        }
        j5 j5Var = this.b;
        int i = j5Var.a;
        int i2 = j5Var.a;
        oc7 r1 = oc7.r1(i);
        String K = sd2.K(this.d, false);
        if (sd2.t0(this.d)) {
            if (TextUtils.isEmpty(K)) {
                p = null;
            } else {
                p = kt6.p(r1.N2, "/", K, new StringBuilder());
            }
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            qd2 qd2Var = this.c;
            exportgroupcallinvite.call = qd2Var.h(qd2Var.a);
            ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new jl7(this, p, (byte) 17));
        } else if (!TextUtils.isEmpty(K)) {
            i(kt6.p(r1.N2, "/", K, new StringBuilder()), true);
        } else {
            TLRPC.ChatFull M0 = r1.M0(this.d.id);
            if (M0 != null && (tL_chatInviteExported = M0.exported_invite) != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
                i(M0.exported_invite.link, true);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = oc7.k1(this.d);
            ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new jl7(this, M0, (byte) 18));
        }
    }

    public final boolean g() {
        if (this.T) {
            if (gm.O1() || this.S == h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        float f = this.t0;
        if (f <= 0.0f) {
            f = 1.7777778f;
        }
        if (f >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void i(String str, boolean z) {
        String str2;
        int i;
        if (!this.J0 && !TextUtils.isEmpty(str) && this.K0 == null) {
            if (z) {
                if (sd2.W(this.d)) {
                    i = 2131743164;
                } else {
                    i = 2131743056;
                }
                str2 = jb6.a0(null, null, i, str);
            } else {
                str2 = str;
            }
            kp9 kp9Var = new kp9(this, getContext(), str2, str);
            this.K0 = kp9Var;
            kp9Var.n2 = new x59(this, (byte) 7);
            kp9Var.setOnDismissListener(new cp9(this, (byte) 0));
            this.K0.show();
        }
    }

    public final void j() {
        wo9 wo9Var = this.q0;
        gm.r(wo9Var);
        if (this.T && this.n0 && !this.J0) {
            gm.d3(wo9Var, 3000L);
        }
    }

    public final void k(boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp9.k(boolean, boolean):void");
    }

    public final void l(boolean z, boolean z2) {
        float f;
        this.W = z;
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            float f2 = this.X;
            if (f2 != f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.Y = ofFloat;
                ofFloat.setDuration(250L);
                this.Y.setInterpolator(d53.f);
                this.Y.addUpdateListener(new yo9(this, (byte) 3));
                this.Y.addListener(new jp9(this, (byte) 0));
                this.Y.start();
                return;
            }
        }
        if (this.X != f) {
            this.X = f;
            this.f.requestLayout();
        }
    }

    public final void m(boolean z, boolean z2) {
        float f;
        if (this.T == z) {
            return;
        }
        this.T = z;
        this.a0 = false;
        gm.r(this.Z);
        if (!z) {
            l(false, z2);
        }
        op9 op9Var = this.f;
        op9Var.i();
        this.K.a(false);
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2 && op9Var.getWidth() > 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f);
            this.V = ofFloat;
            ofFloat.setDuration(250L);
            this.V.setInterpolator(d53.f);
            this.V.addUpdateListener(new yo9(this, (byte) 0));
            this.V.addListener(new jp9(this, (byte) 1));
            this.V.start();
        } else {
            n(f);
        }
        k(true, false);
        r();
        t();
    }

    public final void n(float f) {
        this.U = f;
        rja rjaVar = this.F;
        im0 im0Var = rjaVar.I;
        if (im0Var != null) {
            im0Var.updateColors();
            rjaVar.J.updateColors();
            rjaVar.K.updateColors();
        }
        rjaVar.invalidate();
        bka bkaVar = rjaVar.R;
        if (bkaVar != null) {
            bkaVar.invalidate();
        }
        im0 im0Var2 = (im0) this.H.c;
        im0Var2.updateColors();
        im0Var2.invalidateSelf();
        im0 im0Var3 = (im0) this.I.c;
        im0Var3.updateColors();
        im0Var3.invalidateSelf();
        u();
        a(this.o0);
        op9 op9Var = this.f;
        op9Var.requestLayout();
        op9Var.invalidate();
    }

    @Override
    public final void onBackPressed() {
        bka bkaVar = this.K;
        if (bkaVar.I) {
            bkaVar.a(true);
        } else if (this.T) {
            m(false, true);
            this.a.setRequestedOrientation(-1);
        } else {
            dismiss();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        m0f xzcVar;
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        op9 op9Var = this.f;
        setContentView(op9Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = (-2147286656) | i;
        attributes.softInputMode = 48;
        boolean z = e21.a;
        attributes.flags = i | (-2147278464);
        gm.f2();
        gm.m(attributes);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 >= 30) {
            attributes.setFitInsetsTypes(0);
        }
        window.setAttributes(attributes);
        op9Var.setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i2 >= 29) {
            window.setNavigationBarContrastEnforced(false);
            window.setStatusBarContrastEnforced(false);
        }
        i0f.a(window);
        if ((this.a.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
            z2 = true;
        }
        this.m0 = z2;
        x59 x59Var = new x59(window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            xzcVar = new zzc(window, x59Var);
        } else if (i3 >= 30) {
            xzcVar = new zzc(window, x59Var);
        } else if (i3 >= 26) {
            xzcVar = new xzc(window, x59Var);
        } else {
            xzcVar = new xzc(window, x59Var);
        }
        xzcVar.b();
        xzcVar.d();
        t();
    }

    @Override
    public final void onStateChanged(int i) {
        if (i == 11) {
            dismiss();
        } else {
            p();
        }
    }

    public final void p() {
        boolean z;
        float f;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (!this.u0 && (sharedInstance == null || sharedInstance.getCallState() != 3)) {
            z = false;
        } else {
            z = true;
        }
        if (this.v0 != z) {
            this.v0 = z;
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = this.x0;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.y0 = ofFloat;
            ofFloat.setDuration(300L);
            this.y0.addUpdateListener(new yo9(this, (byte) 2));
            this.y0.start();
        }
        r();
    }

    public final void q() {
        if (this.J0) {
            return;
        }
        qd2 qd2Var = this.c;
        boolean z = qd2Var.w;
        a8 a8Var = this.P;
        if (z) {
            a8Var.setSubtext(gm.g0(ConnectionsManager.getInstance(this.b.a).getCurrentTime() - qd2Var.b.record_start_date, false, false));
            gm.d3(this.O0, 1000L);
            return;
        }
        a8Var.setSubtext(null);
    }

    public final void r() {
        int i;
        int i2;
        float f;
        boolean g = g();
        if (g) {
            i = 2131232819;
        } else {
            i = 2131232817;
        }
        if (!this.v0) {
            i2 = 2131743076;
        } else if (g) {
            i2 = 2131743044;
        } else {
            i2 = 2131743062;
        }
        String M0 = jb6.M0(i2, null);
        nh2 nh2Var = this.I;
        ((ImageView) nh2Var.b).setImageResource(i);
        ((TextView) nh2Var.d).setText(M0);
        nh2Var.setContentDescription(M0);
        boolean z = this.v0;
        ((ImageView) nh2Var.b).setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        nh2Var.setAlpha(f);
    }

    public final void s() {
        String str;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        oc7 r1 = oc7.r1(this.b.a);
        qd2 qd2Var = this.c;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(qd2Var.c));
        if (L0 != null) {
            this.d = L0;
        }
        if (!TextUtils.isEmpty(qd2Var.b.title)) {
            str = qd2Var.b.title;
        } else {
            TLRPC.Chat chat = this.d;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        rja rjaVar = this.F;
        if (!TextUtils.equals(rjaVar.getTitle(), str)) {
            rjaVar.setTitle(str);
        }
        if (rjaVar.getTitleTextView() != null && (rjaVar.getTitleTextView().getRightDrawable() == null || this.w0 != qd2Var.w)) {
            this.w0 = qd2Var.w;
            rjaVar.getTitleTextView().i(null);
            rjaVar.getTitleTextView().i(this.L);
        }
        boolean z2 = false;
        rjaVar.setSubtitle(jb6.G(qd2Var.b.participants_count, "ViewersWatching", new Object[0]));
        boolean w = sd2.w(14, this.d);
        if (!sd2.t0(this.d) && !sd2.y(3, this.d)) {
            z = false;
        } else {
            z = true;
        }
        int i6 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.N.setVisibility(i);
        if (w) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.O.setVisibility(i2);
        if (w) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        a8 a8Var = this.P;
        a8Var.setVisibility(i3);
        if (w) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.Q.setVisibility(i4);
        if (w || z) {
            i6 = 0;
        }
        this.M.setVisibility(i6);
        if (qd2Var.w) {
            i5 = 2131743007;
        } else {
            i5 = 2131743032;
        }
        a8Var.setText(jb6.M0(i5, null));
        if (sd2.t0(this.d) || (sd2.N(this.d) && sd2.w(3, this.d))) {
            z2 = true;
        }
        nh2 nh2Var = this.H;
        ((ImageView) nh2Var.b).setEnabled(z2);
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        nh2Var.setAlpha(f);
        gm.r(this.O0);
        q();
        p();
    }

    @Override
    public final void show() {
        ad8 ad8Var;
        super.show();
        j5 j5Var = this.b;
        nm7.f(j5Var.a).a(this, nm7.w2);
        nm7.f(j5Var.a).a(this, nm7.M0);
        nm7.f(j5Var.a).a(this, nm7.T);
        nm7.e().a(this, nm7.D2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        this.a.a1.add(this.L0);
        tp9 tp9Var = tp9.w;
        if (tp9Var != null && (ad8Var = tp9Var.a) != null && ad8Var.f()) {
            tp9 tp9Var2 = tp9.w;
            if (tp9Var2.a != null) {
                wc8 wc8Var = tp9Var2.e;
                tp9Var2.e = null;
                tp9Var2.b.a = null;
                tp9Var2.a.a(new u35(tp9Var2, wc8Var, (byte) 29));
                gm.c3(new bo6((byte) 19));
            }
        }
        g95.t5 = true;
        nm7.e().k(nm7.F2, new Object[0]);
        oa5.k(this.a);
        this.f.O = true;
        v();
        s();
        gm.d3(this.M0, 15000L);
        gm.d3(this.N0, 2000L);
    }

    public final void t() {
        m0f xzcVar;
        boolean z;
        Window window = getWindow();
        if (window == null) {
            return;
        }
        x59 x59Var = new x59(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            xzcVar = new zzc(window, x59Var);
        } else if (i >= 30) {
            xzcVar = new zzc(window, x59Var);
        } else if (i >= 26) {
            xzcVar = new xzc(window, x59Var);
        } else {
            xzcVar = new xzc(window, x59Var);
        }
        if (!this.T && this.m0 && this.f.g() > this.R.b / 2) {
            z = true;
        } else {
            z = false;
        }
        xzcVar.c(z);
        if (g() && !this.n0) {
            xzcVar.a();
        } else {
            xzcVar.e();
        }
    }

    public final void u() {
        boolean z;
        View findViewById;
        int i = 0;
        if (!this.J0 && !this.H0) {
            op9 op9Var = this.f;
            if (op9Var.isShown() && op9Var.getAlpha() >= 1.0f && op9Var.getTranslationY() == 0.0f && (this.U >= 1.0f || op9Var.g() <= 0)) {
                z = true;
                if (z != this.G0 || (findViewById = this.a.findViewById(16908290)) == null) {
                }
                this.G0 = z;
                if (z) {
                    i = 4;
                }
                findViewById.setVisibility(i);
                return;
            }
        }
        z = false;
        if (z != this.G0) {
        }
    }

    public final void v() {
        boolean z;
        u();
        if (this.r0 != null && !this.I0 && !this.J0 && this.f.isShown()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.s0) {
            if (z) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    this.s0 = true;
                    sharedInstance.setRtmpStreamVideoOutput(this.P0, null);
                    return;
                }
                return;
            }
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (this.s0 && sharedInstance2 != null) {
                this.s0 = false;
                sharedInstance2.setRtmpStreamVideoOutput(null, null);
                return;
            }
            this.s0 = false;
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onCameraSwitch(boolean z) {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
