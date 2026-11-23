package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.LaunchActivity;
public abstract class v5 extends du0 implements tg.l1, tg.l, tg.h1, bu0, jb {
    public final c5 A0;
    public ArrayList A1;
    public final q5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final r5 D0;
    public sg.q D1;
    public final c5 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public i5 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public xi0 J1;
    public float K0;
    public tg.v1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.r1 N0;
    public boolean N1;
    public final h6.o O0;
    public org.telegram.ui.Components.ba O1;
    public final int P0;
    public final e6 P1;
    public BigInteger Q0;
    public final f6 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public boolean T1;
    public final tg.m1 U0;
    public final a0 U1;
    public final tg.j1 V0;
    public final x7 V1;
    public final tg.o1 W0;
    public final f5 W1;
    public final ImageView X0;
    public final float[] X1;
    public final TextView Y0;
    public j5 Y1;
    public final TextView Z0;
    public boolean Z1;
    public final TextView f15553a1;
    public boolean f15554a2;
    public final Paint f15555b1;
    public boolean f15556b2;
    public final Paint f15557c1;
    public final int[] f15558c2;
    public float f15559d1;
    public qy d2;
    public boolean f15560e1;
    public boolean f15561e2;
    public r1.g f15562f1;
    public boolean f15563f2;
    public final d5 f15564g1;
    public boolean f15565g2;
    public final Paint f15566h1;
    public int f15567h2;
    public final Paint f15568i1;
    public boolean f15569i2;
    public final Paint f15570j1;
    public int f15571j2;
    public final tg.a1 f15572k0;
    public final sg.g1 f15573k1;
    public int f15574k2;
    public final tg.e1 f15575l0;
    public boolean l1;
    public int f15576l2;
    public final Bitmap m0;
    public r1.g f15577m1;
    public boolean f15578m2;
    public final sg.j1 f15579n0;
    public float n1;
    public final org.telegram.messenger.r5 f15580o0;
    public final Paint f15581o1;
    public final we f15582p0;
    public final int f15583p1;
    public boolean f15584q0;
    public final n5 f15585q1;
    public xt0 f15586r0;
    public org.telegram.ui.ActionBar.g1 f15587r1;
    public boolean f15588s0;
    public t5 f15589s1;
    public tg.n f15590t0;
    public Rect f15591t1;
    public boolean f15592u0;
    public Runnable f15593u1;
    public int f15594v0;
    public Runnable f15595v1;
    public boolean f15596w0;
    public final mb f15597w1;
    public final boolean f15598x0;
    public AnimatorSet f15599x1;
    public final p5 f15600y0;
    public final e5 f15601y1;
    public final bi.o3 f15602z0;
    public x7 f15603z1;

    public v5(android.content.Context r32, boolean r33, java.io.File r34, boolean r35, boolean r36, hi.mb r37, android.app.Activity r38, final int r39, android.graphics.Bitmap r40, android.graphics.Bitmap r41, int r42, java.util.ArrayList r43, hi.x7 r44, int r45, int r46, org.telegram.messenger.we r47, org.telegram.ui.Components.ba r48, org.telegram.ui.ActionBar.i6 r49, hi.e6 r50, hi.f6 r51) {
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, hi.mb, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, hi.x7, int, int, org.telegram.messenger.we, org.telegram.ui.Components.ba, org.telegram.ui.ActionBar.i6, hi.e6, hi.f6):void");
    }

    public static void G0(tg.q2 q2Var, int i7) {
        int i10;
        q2Var.setAlign(i7);
        int i11 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        q2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !gd.f24314a0 : gd.f24314a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        q2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(pa paVar, Integer num) {
        paVar.setNewColor(num.intValue());
        paVar.I0(false);
    }

    public static void Y(pa paVar, sg.j0 j0Var, Integer num) {
        j0Var.h(num.intValue(), true);
        j0Var.g();
        paVar.setNewColor(num.intValue());
        paVar.f15564g1.setSelectedColorIndex(j0Var.d());
        paVar.D1 = null;
    }

    public ViewGroup getBarView() {
        if (this.I0 == 2) {
            return this.V0;
        }
        return this.U0;
    }

    private int getFrameRotation() {
        int i7 = this.P0;
        if (i7 != 90) {
            if (i7 != 180) {
                if (i7 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private xt0 getPaintingSize() {
        xt0 xt0Var = this.f15586r0;
        if (xt0Var != null) {
            return xt0Var;
        }
        xt0 xt0Var2 = new xt0(1080.0f, 1920.0f);
        this.f15586r0 = xt0Var2;
        return xt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i7);
                if (childAt instanceof tg.j2) {
                    ImageReceiver imageReceiver = ((tg.j2) childAt).f58008z0;
                    nh0 C = imageReceiver.C();
                    org.telegram.ui.Components.b6 m10 = imageReceiver.m();
                    boolean z11 = !z10;
                    imageReceiver.f22764v0 = z11;
                    imageReceiver.f22762u0 = z11;
                    if (C != null) {
                        if (z10) {
                            C.stop();
                        } else {
                            C.start();
                        }
                    } else if (m10 != null) {
                        m10.E = z10;
                        if (z10) {
                            m10.x(false);
                        }
                        if (z10) {
                            m10.stop();
                        } else {
                            m10.start();
                        }
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i7) {
        sg.g1 g1Var = this.f15573k1;
        int i10 = g1Var.f57335a;
        g1Var.f57335a = i7;
        E0(g1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new q4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.f15594v0 = i7;
        tg.n nVar = this.f15590t0;
        if (nVar instanceof tg.q2) {
            ((tg.q2) nVar).setType(i7);
        }
        sg.j0 e10 = sg.j0.e(this.f15583p1);
        e10.h = i7;
        e10.f57376a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    public void setTextWeightRange(tg.n nVar) {
        boolean z10 = nVar instanceof tg.d;
        tg.r1 r1Var = this.N0;
        if (z10) {
            r1Var.b(0.3f, 1.1f);
        } else {
            r1Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        i5 i5Var = new i5(this, context);
        this.G0 = i5Var;
        i5Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.na.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(gd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.R0;
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        n5 n5Var = this.f15585q1;
        org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), n5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f14672b;

            {
                this.f14672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f14672b;
                        if (v5Var.f15592u0) {
                            v5Var.D0(null, true);
                            return;
                        } else {
                            v5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f14672b.z0();
                        return;
                    default:
                        v5 v5Var2 = this.f14672b;
                        v5Var2.R0(2);
                        if (!(v5Var2.f15590t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.R0, c8.na.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(gd.N0(2131747082, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.S0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), n5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f14672b;

            {
                this.f14672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f14672b;
                        if (v5Var.f15592u0) {
                            v5Var.D0(null, true);
                            return;
                        } else {
                            v5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f14672b.z0();
                        return;
                    default:
                        v5 v5Var2 = this.f14672b;
                        v5Var2.R0(2);
                        if (!(v5Var2.f15590t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.g0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.G0.addView(this.S0, c8.na.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(gd.N0(2131747081, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.T0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), n5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f14672b;

            {
                this.f14672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f14672b;
                        if (v5Var.f15592u0) {
                            v5Var.D0(null, true);
                            return;
                        } else {
                            v5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f14672b.z0();
                        return;
                    default:
                        v5 v5Var2 = this.f14672b;
                        v5Var2.R0(2);
                        if (!(v5Var2.f15590t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.T0, c8.na.l(1.0f, 0, -2));
    }

    public static boolean w0(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void A() {
        N0(new s4(this, 4), this, 53, 0, getHeight(), false);
    }

    public final void A0(tg.n nVar) {
        this.f15579n0.b(nVar.getUUID(), new r4(this, nVar, 0));
    }

    public final void B0(tg.n nVar) {
        tg.n nVar2 = this.f15590t0;
        if (nVar == nVar2 && nVar2 != null) {
            nVar2.l(nVar2.f58106o0, false);
            D0(null, true);
            if (nVar instanceof tg.q2) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.B0.removeView(nVar);
        e0();
        if (nVar != null) {
            UUID uuid = nVar.getUUID();
            sg.j1 j1Var = this.f15579n0;
            j1Var.f57387b.remove(uuid);
            j1Var.f57388c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var, 14));
        }
        tg.r1 r1Var = this.N0;
        h6.o oVar = this.O0;
        r1Var.setValueOverride(oVar);
        r1Var.setShowPreview(true);
        float f10 = oVar.get();
        sg.g1 g1Var = this.f15573k1;
        g1Var.f57337c = f10;
        E0(g1Var, null, false);
        if (!this.f15556b2 && (nVar instanceof tg.w1)) {
            nb nbVar = ((pa) this).f15198o2;
            bb bbVar = nbVar.Y0;
            if (bbVar != null) {
                bbVar.s(null, null, true);
            }
            pa paVar = nbVar.f15126w1;
            if (paVar != null) {
                paVar.p0();
            }
            db dbVar = nbVar.f15067d1;
            if (dbVar != null) {
                dbVar.setHasRoundVideo(false);
            }
            x7 x7Var = nbVar.L1;
            if (x7Var != null) {
                File file = x7Var.f15764o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    nbVar.L1.f15764o0 = null;
                }
                if (nbVar.L1.f15766p0 != null) {
                    try {
                        new File(nbVar.L1.f15766p0).delete();
                    } catch (Exception unused2) {
                    }
                    nbVar.L1.f15766p0 = null;
                }
            }
        }
    }

    public final void C0() {
        D0(null, true);
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(tg.n nVar, boolean z10) {
        boolean z11;
        xb xbVar;
        xb xbVar2;
        xi0 xi0Var;
        int i7;
        boolean z12 = nVar instanceof tg.q2;
        int i10 = 2;
        int i11 = 0;
        if (z12 && (((i7 = this.J0) == -1 && this.I0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            tg.q2 q2Var = (tg.q2) nVar;
            int gravity = q2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            tg.j1 j1Var = this.V0;
            j1Var.setAlignment(i10);
            sg.a0 typeface = q2Var.getTypeface();
            if (typeface != null) {
                j1Var.setTypeface(typeface.f57278a);
            }
            j1Var.e(q2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.n nVar2 = this.f15590t0;
        if (nVar2 != null) {
            if (nVar2 == nVar) {
                if (!nVar.f58097f0) {
                    if (nVar instanceof tg.s0) {
                        tg.s0 s0Var = (tg.s0) nVar;
                        s0Var.setType((s0Var.getType() + 1) % s0Var.getTypesCount());
                        return true;
                    } else if (nVar instanceof tg.r2) {
                        tg.r2 r2Var = (tg.r2) nVar;
                        r2Var.setType((r2Var.getType() + 1) % r2Var.getTypesCount());
                        return true;
                    } else if (nVar instanceof tg.p0) {
                        tg.p0 p0Var = (tg.p0) nVar;
                        tg.n0 n0Var = p0Var.f58164s0;
                        if (n0Var.e()) {
                            if (n0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            n0Var.setPreviewType(i11);
                            return true;
                        }
                        p0Var.setType(p0Var.getNextType());
                        return true;
                    } else if (!this.f15592u0) {
                        if (nVar instanceof tg.q2) {
                            this.f15596w0 = true;
                            q0();
                            return true;
                        } else if (nVar instanceof tg.v1) {
                            tg.v1 v1Var = (tg.v1) nVar;
                            if (this.M1 && this.K1 == nVar) {
                                v1Var.q(true);
                                return true;
                            }
                            tg.v1 v1Var2 = this.K1;
                            if (v1Var2 != null && v1Var2 != v1Var && (xi0Var = this.J1) != null) {
                                xi0Var.animate().alpha(0.0f).setListener(new ai.g0(xi0Var, 22));
                                this.J1 = null;
                                this.M1 = false;
                                this.L1 = 0.0f;
                            }
                            if (this.J1 == null) {
                                xi0 xi0Var2 = new xi0(2, this.f15583p1, getContext(), LaunchActivity.Q(), new fi.g2(6, new fi.b()));
                                this.J1 = xi0Var2;
                                org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.O1, xi0Var2, 0, false);
                                this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                                this.f15597w1.addView(this.J1, c8.na.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                this.J1.setDelegate(new a8.r7(this, faVar, paint));
                                this.J1.p(null, null, true);
                            }
                            this.J1.setFragment(LaunchActivity.Q());
                            this.K1 = v1Var;
                            O0(true);
                            return true;
                        } else {
                            M0(nVar2);
                            return true;
                        }
                    } else if (nVar2 instanceof tg.q2) {
                        org.telegram.messenger.g0.I3(((tg.q2) nVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            nVar2.l(nVar2.f58106o0, false);
            tg.n nVar3 = this.f15590t0;
            if (nVar3 instanceof tg.q2) {
                ((tg.q2) nVar3).r();
                if (!z12) {
                    this.f15592u0 = false;
                    org.telegram.messenger.g0.v1(((tg.q2) this.f15590t0).getFocusedView());
                    u0(false);
                }
            } else if ((nVar3 instanceof tg.w1) && (xbVar2 = ((pa) this).f15198o2.f15056a1) != null) {
                xbVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        tg.n nVar4 = this.f15590t0;
        this.f15590t0 = nVar;
        if ((nVar4 instanceof tg.q2) && TextUtils.isEmpty(((tg.q2) nVar4).getText()) && !(nVar4 instanceof tg.d)) {
            B0(nVar4);
        }
        tg.n nVar5 = this.f15590t0;
        if (nVar4 != nVar5 && (nVar5 instanceof tg.w1) && (xbVar = ((pa) this).f15198o2.f15056a1) != null) {
            xbVar.l(true);
        }
        tg.n nVar6 = this.f15590t0;
        h6.o oVar = this.O0;
        sg.g1 g1Var = this.f15573k1;
        tg.r1 r1Var = this.N0;
        if (nVar6 != null) {
            c5 c5Var = this.A0;
            nVar6.f58106o0 = c5Var;
            nVar6.l(c5Var, true);
            tg.n nVar7 = this.f15590t0;
            if (nVar7 instanceof tg.q2) {
                tg.q2 q2Var2 = (tg.q2) nVar7;
                q2Var2.getSwatch().f57337c = g1Var.f57337c;
                q2Var2.B0 = false;
                F0(q2Var2.getSwatch());
                setTextWeightRange(q2Var2);
                r1Var.setValueOverride(new g5(q2Var2, (int) (this.f15586r0.f42189a / 9.0f), 0));
                r1Var.setShowPreview(false);
            } else {
                r1Var.setValueOverride(oVar);
                r1Var.setShowPreview(true);
                g1Var.f57337c = oVar.get();
                E0(g1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                I0(false);
            }
            R0(0);
            r1Var.setValueOverride(oVar);
            r1Var.setShowPreview(true);
            g1Var.f57337c = oVar.get();
            E0(g1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(sg.g1 g1Var, Integer num, boolean z10) {
        sg.g1 g1Var2 = this.f15573k1;
        if (g1Var2 != g1Var) {
            g1Var2.f57335a = g1Var.f57335a;
            g1Var2.f57336b = g1Var.f57336b;
            g1Var2.f57337c = g1Var.f57337c;
            int i7 = this.f15583p1;
            sg.j0.e(i7).h(g1Var.f57335a, true);
            sg.j0.e(i7).j(g1Var.f57337c);
        }
        int i10 = g1Var.f57335a;
        p5 p5Var = this.f15600y0;
        p5Var.setColor(i10);
        p5Var.setBrushSize(g1Var.f57337c);
        int i11 = g1Var2.f57335a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j4(this, num, i11, 0));
            duration.start();
        } else {
            r5 r5Var = this.D0;
            if (r5Var != null) {
                r5Var.invalidate();
            }
        }
        tg.n nVar = this.f15590t0;
        if (nVar instanceof tg.q2) {
            if (!this.T1) {
                ((tg.q2) nVar).setSwatch(new sg.g1(g1Var.f57336b, g1Var.f57337c, g1Var.f57335a));
            }
        } else if (z10 && (nVar instanceof tg.s0)) {
            ((tg.s0) nVar).setColor(g1Var.f57335a);
            ((tg.s0) this.f15590t0).setType(3);
        } else if (z10 && (nVar instanceof tg.r2)) {
            ((tg.r2) nVar).setColor(g1Var.f57335a);
            ((tg.r2) this.f15590t0).setType(3);
        } else if (z10 && (nVar instanceof tg.p0)) {
            ((tg.p0) nVar).setColor(g1Var.f57335a);
            ((tg.p0) this.f15590t0).setType(0);
        }
    }

    public final void F0(sg.g1 g1Var) {
        E0(g1Var, null, false);
    }

    public final void H0() {
        int i7;
        b20 b20Var;
        float f10;
        tg.n nVar;
        tg.n nVar2;
        org.telegram.messenger.g6[] g6VarArr;
        tg.n nVar3;
        ArrayList arrayList = this.A1;
        if (arrayList != null) {
            x7 x7Var = this.f15603z1;
            this.f15603z1 = null;
            this.A1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            tg.d dVar = null;
            int i10 = 0;
            while (true) {
                ?? r15 = this.B0;
                if (i10 < size) {
                    b20 b20Var2 = (b20) arrayList.get(i10);
                    byte b10 = b20Var2.f23124a;
                    if (b10 == 11) {
                        if (dVar != null) {
                            dVar.u(b20Var2.V, b20Var2.W, b20Var2.f23132j, b20Var2.X);
                            i7 = i10;
                            i10 = i7 + 1;
                            z10 = false;
                        } else {
                            tg.d g02 = g0();
                            g02.setType(b20Var2.f23126b);
                            g02.setTypeface(b20Var2.f23136n);
                            g02.setBaseFontSize(b20Var2.f23135m);
                            G0(g02, b20Var2.f23138p);
                            sg.g1 swatch = g02.getSwatch();
                            swatch.f57335a = b20Var2.f23134l;
                            g02.setSwatch(swatch);
                            g02.u(b20Var2.V, b20Var2.W, b20Var2.f23132j, b20Var2.X);
                            f10 = 1.0f;
                            i7 = i10;
                            dVar = g02;
                            nVar3 = g02;
                            b20Var = b20Var2;
                            nVar = nVar3;
                        }
                    } else if (b10 == 0) {
                        m5 m0 = m0(b20Var2.C, b20Var2.B);
                        if ((b20Var2.f23126b & 2) != 0) {
                            m0.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                        layoutParams.width = b20Var2.f23139q;
                        layoutParams.height = b20Var2.f23140r;
                        f10 = 1.0f;
                        i7 = i10;
                        nVar3 = m0;
                        b20Var = b20Var2;
                        nVar = nVar3;
                    } else {
                        if (b10 == 1) {
                            tg.q2 n02 = n0(z10);
                            n02.setType(b20Var2.f23126b);
                            n02.setTypeface(b20Var2.f23136n);
                            n02.setBaseFontSize(b20Var2.f23135m);
                            SpannableString spannableString = new SpannableString(b20Var2.f23132j);
                            ArrayList arrayList2 = b20Var2.f23133k;
                            int size2 = arrayList2.size();
                            ArrayList arrayList3 = arrayList2;
                            for (int i11 = z10; i11 < size2; i11++) {
                                a20 a20Var = (a20) arrayList3.get(i11);
                                ArrayList arrayList4 = arrayList3;
                                org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(a20Var.document_id, 1.0f, n02.getFontMetricsInt());
                                int i12 = a20Var.offset;
                                spannableString.setSpan(x5Var, i12, a20Var.length + i12, 33);
                                i10 = i10;
                                arrayList3 = arrayList4;
                            }
                            i7 = i10;
                            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, n02.getFontMetricsInt(), false, null, 0);
                            if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                                for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                    g6Var.f24275b = 0.85f;
                                }
                            }
                            n02.setText(m10);
                            G0(n02, b20Var2.f23138p);
                            sg.g1 swatch2 = n02.getSwatch();
                            swatch2.f57335a = b20Var2.f23134l;
                            n02.setSwatch(swatch2);
                            nVar2 = n02;
                        } else {
                            i7 = i10;
                            if (b10 == 2) {
                                tg.s1 j02 = j0(b20Var2.f23132j, false);
                                j02.I0 = b20Var2.f23143u;
                                j02.D0 = false;
                                if ((b20Var2.f23126b & 2) != 0) {
                                    j02.r(false);
                                }
                                if ((b20Var2.f23126b & 16) != 0) {
                                    j02.t(false);
                                }
                                ViewGroup.LayoutParams layoutParams2 = j02.getLayoutParams();
                                layoutParams2.width = b20Var2.f23139q;
                                layoutParams2.height = b20Var2.f23140r;
                                nVar2 = j02;
                            } else if (b10 == 6) {
                                ArrayList arrayList5 = x7Var.v;
                                boolean z11 = x7Var.K;
                                this.Z1 = true;
                                f10 = 1.0f;
                                b20Var = b20Var2;
                                tg.n l5Var = new l5(this, getContext(), d0(), arrayList5, this.O1, z11, this.P1);
                                l5Var.setDelegate(this);
                                r15.addView(l5Var);
                                e0();
                                if (b20Var.f23139q > 0 && b20Var.f23140r > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = l5Var.getLayoutParams();
                                    layoutParams3.width = b20Var.f23139q;
                                    layoutParams3.height = b20Var.f23140r;
                                }
                                nVar = l5Var;
                            } else {
                                b20Var = b20Var2;
                                f10 = 1.0f;
                                if (b10 == 3) {
                                    tg.s0 i02 = i0(b20Var.O, b20Var.N);
                                    int i13 = b20Var.f23134l;
                                    if (i13 != 0) {
                                        i02.setColor(i13);
                                    }
                                    i02.setType(b20Var.f23126b);
                                    nVar = i02;
                                } else {
                                    if (b10 == 8) {
                                        kc kcVar = b20Var.P;
                                        if (kcVar != null) {
                                            tg.r2 o02 = o0(kcVar);
                                            int i14 = b20Var.f23134l;
                                            if (i14 != 0) {
                                                o02.setColor(i14);
                                            }
                                            o02.setType(b20Var.f23126b);
                                            nVar = o02;
                                        }
                                    } else if (b10 == 7) {
                                        tg.p0 h02 = h0(b20Var.f23125a0);
                                        tg.n0 n0Var = h02.f58164s0;
                                        int i15 = b20Var.f23134l;
                                        if (i15 != 0) {
                                            h02.setColor(i15);
                                        }
                                        boolean e10 = n0Var.e();
                                        int i16 = n0Var.h;
                                        int i17 = n0Var.f58123f;
                                        if (e10) {
                                            n0Var.setPreviewType(b20Var.f23126b);
                                        }
                                        byte b11 = b20Var.f23126b;
                                        if (b11 == -1) {
                                            h02.setType(3);
                                            n0Var.d();
                                            b20Var.f23139q = ((int) Math.ceil(n0Var.f58117b0)) + i17 + i17;
                                            b20Var.f23140r = ((int) Math.ceil(n0Var.f58119c0)) + i16 + i16;
                                            PointF position = h02.getPosition();
                                            position.y = (this.C1 * 0.3f) + position.y;
                                            h02.setPosition(position);
                                        } else {
                                            h02.setType(b11);
                                            nVar = h02;
                                        }
                                    } else if (b10 == 4) {
                                        tg.v1 k02 = k0(false);
                                        k02.s(ch.p0.d(b20Var.N.reaction), false);
                                        if (b20Var.N.flipped) {
                                            k02.r(false);
                                        }
                                        nVar = k02;
                                        if (b20Var.N.dark) {
                                            k02.q(false);
                                            nVar = k02;
                                        }
                                    } else if (b10 == 5 && x7Var.f15764o0 != null) {
                                        tg.w1 l02 = l0(x7Var.f15766p0, false);
                                        nb nbVar = ((pa) this).f15198o2;
                                        bb bbVar = nbVar.Y0;
                                        if (bbVar != null) {
                                            bbVar.f14475x = l02;
                                            h61 h61Var = bbVar.f14477y;
                                            if (h61Var != null) {
                                                h61Var.A0(l02.f58282w0);
                                            }
                                        }
                                        db dbVar = nbVar.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.setHasRoundVideo(true);
                                        }
                                        nVar = l02;
                                        if ((b20Var.f23126b & 2) != 0) {
                                            boolean z12 = !l02.f58279t0;
                                            l02.f58279t0 = z12;
                                            l02.f58280u0.f(z12, true);
                                            l02.invalidate();
                                            nVar = l02;
                                        }
                                    }
                                    i10 = i7 + 1;
                                    z10 = false;
                                }
                            }
                        }
                        b20Var = b20Var2;
                        f10 = 1.0f;
                        nVar = nVar2;
                    }
                    nVar.setX((b20Var.f23127c * this.B1) - (((f10 - b20Var.v) * b20Var.f23139q) / 2.0f));
                    nVar.setY((b20Var.d * this.C1) - (((f10 - b20Var.v) * b20Var.f23140r) / 2.0f));
                    nVar.setPosition(new PointF((b20Var.f23139q / 2.0f) + nVar.getX(), (b20Var.f23140r / 2.0f) + nVar.getY()));
                    nVar.setScale(b20Var.v);
                    nVar.setRotation((float) (((-b20Var.f23128e) / 3.141592653589793d) * 180.0d));
                    i10 = i7 + 1;
                    z10 = false;
                } else {
                    r15.setVisibility(z10 ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.l1 != z10) {
            this.l1 = z10;
            r1.g gVar = this.f15577m1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f15577m1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56454i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56446m = hVar;
            if (!this.f15601y1.c() && this.f15567h2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.f15575l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f15577m1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14;
                    int i7;
                    v5 v5Var = v5.this;
                    r5 r5Var = v5Var.D0;
                    float f15 = f12 / 1000.0f;
                    v5Var.n1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(v5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(v5Var.n1, 0.25f) / 0.25f));
                    d5 d5Var = v5Var.f15564g1;
                    float f18 = v5Var.n1;
                    boolean z12 = z10;
                    d5Var.B1(z12, f18);
                    tg.e1 e1Var = v5Var.f15575l0;
                    e1Var.setProgress(v5Var.n1);
                    tg.a1 a1Var = v5Var.f15572k0;
                    a1Var.setProgress(v5Var.n1);
                    v5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * v5Var.n1);
                    AnimatorSet animatorSet = v5Var.f15599x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = v5Var.n1;
                        if (!z12) {
                            f19 = 1.0f - f19;
                        }
                        if (z12) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        e1Var.setAlpha(org.telegram.messenger.g0.T1(f20, f14, f19));
                        if (!z12) {
                            f16 = 0.0f;
                        }
                        a1Var.setAlpha(org.telegram.messenger.g0.T1(f20, f16, f19));
                        float L = org.telegram.messenger.g0.L(39.0f) * f19;
                        if (z12) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        r5Var.setTranslationY(translationY - (L * i7));
                    }
                    r5Var.invalidate();
                    if (view == v5Var.V0) {
                        v5Var.E0.invalidate();
                    }
                }
            });
            this.f15577m1.a(new l4(this, z10, 0));
            this.f15577m1.h();
            if (z10) {
                d5 d5Var = this.f15564g1;
                d5Var.setVisibility(0);
                d5Var.setSelectedColorIndex(sg.j0.e(this.f15583p1).d());
            }
        }
    }

    public final void J0(int i7) {
        boolean z10;
        int i10;
        tg.j1 j1Var = this.V0;
        e5 e5Var = this.f15601y1;
        if (i7 == 1) {
            qy qyVar = this.d2;
            if (qyVar != null && qyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            qy qyVar2 = this.d2;
            mb mbVar = this.f15597w1;
            if (qyVar2 != null && qyVar2.f39047d1 != i10.f24637t0) {
                mbVar.removeView(qyVar2);
                this.d2 = null;
            }
            if (this.d2 == null) {
                qy qyVar3 = new qy(null, true, false, false, getContext(), false, null, null, true, this.f15585q1, false, false);
                this.d2 = qyVar3;
                qyVar3.f39115y2 = false;
                qyVar3.V0 = true;
                qyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.d2.setForseMultiwindowLayout(true);
                }
                this.d2.setDelegate(new o5(this));
                mbVar.addView(this.d2);
            }
            this.d2.setVisibility(0);
            this.f15561e2 = true;
            qy qyVar4 = this.d2;
            if (this.f15571j2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f15571j2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f15571j2 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f15574k2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f15574k2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f15574k2 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                i10 = this.f15574k2;
            } else {
                i10 = this.f15571j2;
            }
            int paddingUnderContainer = mbVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            qyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.n nVar = this.f15590t0;
                if (nVar instanceof tg.q2) {
                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getEditText());
                }
            }
            this.f15567h2 = paddingUnderContainer;
            e5Var.a();
            requestLayout();
            zg emojiButton = j1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(xg.d, true);
            }
            if (!z10) {
                if (this.f15563f2) {
                    this.f15569i2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15567h2, 0.0f);
                    ofFloat.addUpdateListener(new n4(this, 1));
                    ofFloat.addListener(new h5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                    ofFloat.start();
                }
            }
        } else {
            zg emojiButton2 = j1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(xg.f41996e, true);
            }
            qy qyVar5 = this.d2;
            if (qyVar5 != null) {
                this.f15561e2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    qyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f15567h2 = 0;
                e5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(tg.p0 p0Var) {
        f8 f8Var = new f8(getContext(), this.f15585q1, this.Q1, new ai.s1(19, this, p0Var));
        if (p0Var != null) {
            tg.m0 m0Var = p0Var.f58168w0;
            f8Var.Y1 = true;
            org.telegram.ui.Cells.l3 l3Var = f8Var.V1;
            org.telegram.ui.Cells.l3 l3Var2 = f8Var.U1;
            if (m0Var != null) {
                f8Var.f14486c2 = m0Var.d;
                f8Var.d2 = false;
                l3Var2.setText(m0Var.f58074c);
                l3Var.setText(m0Var.f58073b);
                f8Var.f14491i2 = !TextUtils.isEmpty(m0Var.f58073b);
                f8Var.f14492j2 = m0Var.f58076f;
                f8Var.f14493k2 = m0Var.f58075e;
            } else {
                l3Var2.setText("");
                l3Var.setText("");
                f8Var.f14492j2 = true;
                f8Var.f14493k2 = false;
            }
            String N0 = gd.N0(2131744397, null);
            e eVar = f8Var.X1;
            eVar.i(N0, false, true);
            di.f0 f0Var = f8Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            eVar.setEnabled(f8Var.g1(l3Var2.getText().toString()));
            f8Var.Y1 = false;
        }
        f8Var.setOnDismissListener(new x4(this, 1));
        f8Var.show();
        y0(true);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f15563f2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.f15574k2 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.f15574k2).commit();
            } else {
                this.f15571j2 = i7;
                mp.f1().edit().putInt("kbd_height", this.f15571j2).commit();
            }
        }
        boolean z13 = this.f15561e2;
        e5 e5Var = this.f15601y1;
        if (z13) {
            if (z10) {
                i10 = this.f15574k2;
            } else {
                i10 = this.f15571j2;
            }
            int paddingUnderContainer = this.f15597w1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f24226q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.d2.setLayoutParams(layoutParams);
                this.f15567h2 = layoutParams.height;
                e5Var.a();
                requestLayout();
            }
        }
        if (this.f15576l2 == i7 && this.f15578m2 == z10) {
            return;
        }
        this.f15576l2 = i7;
        this.f15578m2 = z10;
        boolean z14 = this.f15563f2;
        tg.n nVar = this.f15590t0;
        if (nVar instanceof tg.q2) {
            if (((tg.q2) nVar).getEditText().isFocused() && e5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f15563f2 = z12;
        } else {
            this.f15563f2 = false;
        }
        if (this.f15563f2 && this.f15561e2) {
            J0(0);
        }
        if (this.f15567h2 != 0 && !(z11 = this.f15563f2) && z11 != z14 && !this.f15561e2) {
            this.f15567h2 = 0;
            e5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f15563f2 && this.f15567h2 > 0 && this.f15569i2) {
            this.f15569i2 = false;
        }
        S0();
    }

    public final void L0(tg.s0 s0Var, p10 p10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new k5(this, p10Var), false, true, false, this.f15585q1);
        tiVar.X3 = new w7.s(10);
        th thVar = tiVar.f40026v3;
        if (s0Var != null && (messageMedia = s0Var.f58221w0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.f40039y4 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.J1 = true;
            thVar.setVisibility(8);
        } else if (this.E1) {
            tiVar.f40031w4 = this.G1;
            tiVar.f40035x4 = this.F1;
            tiVar.J1 = true;
            thVar.setVisibility(8);
        } else {
            tiVar.J1 = true;
            thVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new x4(this, 0));
        tiVar.f1();
        tiVar.show();
    }

    public final void M0(tg.n nVar) {
        if (nVar instanceof tg.z0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.f15587r1;
            if (g1Var != null && g1Var.isShowing()) {
                this.f15587r1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f15558c2;
        nVar.getLocationInWindow(iArr);
        float scaleX = nVar.getScaleX() * nVar.getWidth();
        q5 q5Var = this.B0;
        float scaleX2 = q5Var.getScaleX() * scaleX;
        float scaleY = nVar.getScaleY();
        float scaleY2 = q5Var.getScaleY() * scaleY * nVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        N0(new r4(this, nVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void N0(Runnable runnable, v5 v5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.f15587r1;
        if (g1Var != null && g1Var.isShowing()) {
            this.f15587r1.d(true);
            return;
        }
        if (this.f15589s1 == null) {
            this.f15591t1 = new Rect();
            t5 t5Var = new t5(this, getContext());
            this.f15589s1 = t5Var;
            t5Var.setAnimationEnabled(true);
            this.f15589s1.setOnTouchListener(new t4(0, this));
            this.f15589s1.setDispatchKeyEventListener(new u4(this));
            this.f15589s1.setShownFromBottom(true);
        }
        t5 t5Var2 = this.f15589s1;
        t5Var2.f15438a0 = z10;
        t5Var2.d();
        runnable.run();
        if (this.f15587r1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.f15589s1, -2, -2);
            this.f15587r1 = g1Var2;
            g1Var2.f29034b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.f15587r1.setOutsideTouchable(true);
            this.f15587r1.setClippingEnabled(true);
            this.f15587r1.setInputMethodMode(2);
            this.f15587r1.setSoftInputMode(0);
            this.f15587r1.getContentView().setFocusableInTouchMode(true);
            this.f15587r1.setOnDismissListener(new v4(0, this));
        }
        this.f15589s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE));
        this.f15587r1.setFocusable(true);
        int measuredWidth = i10 - (this.f15589s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.f15589s1.getMeasuredHeight();
        this.f15587r1.showAtLocation(v5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.f15589s1);
        Drawable mutate = getContext().getResources().getDrawable(2131232571).mutate();
        if (z10) {
            t5 t5Var3 = this.f15589s1;
            t5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.O1, t5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
            return;
        }
        this.f15589s1.setBackgroundDrawable(mutate);
        this.f15589s1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.M1 != z10) {
            if (z10 || this.J1 != null) {
                this.M1 = z10;
                if (z10) {
                    this.J1.n();
                    this.J1.setVisibility(0);
                    this.J1.setSelectedReaction(this.K1.getCurrentReaction());
                    this.J1.getParent().bringChildToFront(this.J1);
                } else {
                    this.K1 = null;
                }
                float f10 = 0.0f;
                if (z10) {
                    this.N1 = true;
                    this.f15597w1.invalidate();
                    float f11 = this.L1;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.J1.setTransitionProgress(this.L1);
                    ofFloat.addUpdateListener(new n4(this, 2));
                    ofFloat.addListener(new bi.j7(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(kr.f36859g);
                    ofFloat.start();
                    return;
                }
                if (this.J1.getReactionsWindow() != null) {
                    this.J1.getReactionsWindow().e();
                }
                this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new h5(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z10) {
        float f10;
        if (this.f15560e1 != z10) {
            this.f15560e1 = z10;
            r1.g gVar = this.f15562f1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f15562f1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56454i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56446m = hVar;
            if (z10) {
                tg.o1 o1Var = this.W0;
                o1Var.setAlpha(0.0f);
                o1Var.setVisibility(0);
            }
            this.f15562f1.b(new fi.q7(1, this));
            this.f15562f1.a(new l4(this, z10, 1));
            this.f15562f1.h();
        }
    }

    @Override
    public final int Q() {
        return this.f15601y1.f15717l - this.f15597w1.getBottomPadding2();
    }

    public final PointF Q0(tg.n nVar) {
        float f10;
        float f11;
        float f12 = 200.0f;
        we weVar = this.f15582p0;
        if (weVar != null) {
            f12 = 200.0f / weVar.f27770c;
        }
        float f13 = 0.2f;
        if (nVar != null) {
            PointF position = nVar.getPosition();
            float min = Math.min(nVar.getHeight(), nVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = 100.0f;
        if (weVar != null) {
            f14 = 100.0f / weVar.f27770c;
        }
        PointF d02 = d0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                q5 q5Var = this.B0;
                if (i10 >= q5Var.getChildCount()) {
                    break;
                }
                View childAt = q5Var.getChildAt(i10);
                if (!(childAt instanceof tg.n) || (childAt instanceof tg.z0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.n) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - d02.y, 2.0d) + Math.pow(position2.x - d02.x, 2.0d))) < f11) {
                        f12 = Math.min(childAt.getHeight(), childAt.getWidth()) * f10;
                        z10 = true;
                    }
                }
                i10++;
                f14 = f11;
                f13 = f10;
            }
            float f15 = f13;
            float f16 = f14;
            if (!z10) {
                break;
            }
            i7++;
            d02 = new PointF(d02.x + f12, d02.y + f12);
            f13 = f15;
            f14 = f16;
        }
        return d02;
    }

    public final void R0(int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        boolean z11;
        if (this.I0 != i7 && this.J0 != i7) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.I0;
            ViewGroup viewGroup3 = this.V0;
            ViewGroup viewGroup4 = this.U0;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.J0 = i7;
            if (i7 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i7 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f15583p1;
            sg.j0 e10 = sg.j0.e(i11);
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f57385l != z10) {
                e10.f57385l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f57376a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.j0.e(i11).c();
            sg.g1 g1Var = this.f15573k1;
            g1Var.f57335a = c10;
            if (i7 != 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.T1 = z11;
            E0(g1Var, null, false);
            this.T1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.L0 = duration;
            duration.setInterpolator(kr.f36858f);
            this.L0.addUpdateListener(new fi.z2(this, viewGroup, viewGroup2, 1));
            this.L0.addListener(new bi.z0(this, viewGroup, viewGroup2, i7, 1));
            this.L0.start();
        }
    }

    public final void S0() {
        boolean z10;
        e5 e5Var = this.f15601y1;
        tg.j1 j1Var = this.V0;
        if (j1Var != null) {
            if (e5Var.c()) {
                j1Var.a(2131231516);
            } else if (this.f15561e2) {
                j1Var.a(2131231508);
            } else {
                j1Var.a(2131232047);
            }
        }
        if (!e5Var.c() && !this.f15561e2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        org.telegram.messenger.g0.S3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.f15553a1, z10, false);
        org.telegram.messenger.g0.S3(1.0f, this.Z0, z10, false);
    }

    public final void T0() {
        float f10;
        tg.n nVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f15600y0.getParent();
        if (view == null) {
            return;
        }
        e5 e5Var = this.f15601y1;
        if (((e5Var.c() && !e5Var.d) || this.f15567h2 > 0) && (nVar = this.f15590t0) != null) {
            f10 = view.getScaleY() * (-(nVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(kr.h);
        this.S1.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29524h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29709r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29871zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29816wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29797vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29835xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29854yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394a7));
    }

    @Override
    public final void b() {
        setTextType((this.f15594v0 + 1) % 4);
    }

    @Override
    public final void c(int i7) {
        tg.n nVar = this.f15590t0;
        if (nVar instanceof tg.q2) {
            G0((tg.q2) nVar, i7);
            sg.j0 e10 = sg.j0.e(this.f15583p1);
            e10.f57381g = i7;
            e10.f57376a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void c0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new c(5, this, view)).start();
    }

    public final PointF d0() {
        q5 q5Var = this.B0;
        int measuredWidth = q5Var.getMeasuredWidth();
        int measuredHeight = q5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15554a2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        we weVar;
        int i7 = 0;
        if ((view == this.f15600y0 || view == this.f15602z0 || view == this.B0 || view == this.A0) && (weVar = this.f15582p0) != null) {
            canvas.save();
            if (!this.f15598x0) {
                i7 = org.telegram.messenger.g0.f24220m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = weVar.f27775k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * weVar.f27771e)) / weVar.f27770c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * weVar.f27772f)) / weVar.f27770c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + i7 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i7 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i7 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e0() {
        org.telegram.ui.Components.x5[] x5VarArr;
        boolean z10 = this.G1;
        q5 q5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 < q5Var.getChildCount()) {
                    View childAt = q5Var.getChildAt(i7);
                    boolean z12 = childAt instanceof tg.q2;
                    int i10 = this.f15583p1;
                    if (z12) {
                        CharSequence text = ((tg.q2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) {
                                TLRPC.Document document = x5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.o5.e(i10, x5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.o5.g(i10).e(document);
                                }
                                org.telegram.messenger.w7.G(i10);
                                if (x7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i7++;
                    } else if (childAt instanceof tg.j2) {
                        TLRPC.Document sticker = ((tg.j2) childAt).getSticker();
                        org.telegram.messenger.w7.G(i10);
                        if (x7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i7++;
                    } else if (childAt instanceof tg.w1) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i11 = 0; i11 < q5Var.getChildCount(); i11++) {
            View childAt2 = q5Var.getChildAt(i11);
            if (childAt2 instanceof tg.n) {
                ((tg.n) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override
    public final void f(tg.n nVar) {
        O0(false);
        M0(nVar);
    }

    public final TextView f0(int i7, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, this.f15585q1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i7));
        textView.setText(str);
        return textView;
    }

    public final tg.d g0() {
        xt0 paintingSize = getPaintingSize();
        PointF d02 = d0();
        d02.y *= 1.5f;
        tg.d dVar = new tg.d(getContext(), d02, (int) ((paintingSize.f42189a / 9.0f) * 0.5f), new sg.g1(1.0f, this.f15573k1.f57337c, -1));
        float f10 = paintingSize.f42189a / 9.0f;
        s4 s4Var = new s4(this, 2);
        dVar.f58184y0 = (int) (0.5f * f10);
        dVar.f58185z0 = (int) (f10 * 2.0f);
        dVar.A0 = s4Var;
        dVar.B0 = true;
        dVar.setStickyX(2);
        dVar.setDelegate(this);
        dVar.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        dVar.setTypeface(sg.j0.e(this.f15583p1).f57383j);
        dVar.setType(3);
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.b(dVar);
        } else {
            f5 f5Var = this.W1;
            Objects.requireNonNull(f5Var);
            dVar.setPositionProvider(new x(f5Var, 2));
            dVar.setOnEditing(new y(f5Var, 1));
            dVar.setOnSeek(new y(f5Var, 2));
        }
        this.B0.addView(dVar, c8.na.c(-2.0f, -2));
        G0(dVar, 1);
        e0();
        we weVar = this.f15582p0;
        if (weVar != null) {
            dVar.j(1.0f / weVar.f27770c);
            dVar.f(-(weVar.f27775k + weVar.d));
        }
        return dVar;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.f15600y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.f15572k0;
    }

    public float getCropRotation() {
        we weVar = this.f15582p0;
        if (weVar != null) {
            return weVar.d + weVar.f27775k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f15575l0;
    }

    public View getEntitiesView() {
        return this.B0;
    }

    public long getLcm() {
        return this.Q0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.x5[] x5VarArr;
        q5 q5Var = this.B0;
        int childCount = q5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.j2) {
                TLRPC.Document sticker = ((tg.j2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28504id = sticker.f28498id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof tg.q2) {
                CharSequence text = ((tg.q2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(this.f15583p1, x5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28504id = document.f28498id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.f15600y0, this.f15602z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.f15602z0;
    }

    public sg.t0 getRenderView() {
        return this.f15600y0;
    }

    public tg.n getSelectedEntity() {
        return this.f15590t0;
    }

    public View getSelectionEntitiesView() {
        return this.A0;
    }

    public View getTextDimView() {
        return this.H0;
    }

    public View getTopLayout() {
        return this.C0;
    }

    public View getWeightChooserView() {
        return this.N0;
    }

    public final tg.p0 h0(tg.m0 m0Var) {
        int measuredWidth;
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        if (q5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = q5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.p0 p0Var = new tg.p0(getContext(), Q0, this.f15583p1, m0Var, f10 / 360.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            p0Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            p0Var.setStickyY(2);
        }
        sg.g1 g1Var = this.f15573k1;
        if (g1Var != null && (i7 = g1Var.f57335a) != -47814) {
            p0Var.setColor(i7);
        }
        p0Var.setDelegate(this);
        p0Var.setMaxWidth(L);
        q5Var.addView(p0Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.f15582p0;
        if (weVar != null) {
            p0Var.j(1.0f / weVar.f27770c);
            p0Var.f(-(weVar.f27775k + weVar.d));
        }
        return p0Var;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f15554a2) {
            return false;
        }
        if (this.f15590t0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.f15600y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.s0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        if (q5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = q5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.s0 s0Var = new tg.s0(getContext(), Q0, this.f15583p1, messageMedia, mediaArea, f10 / 240.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        sg.g1 g1Var = this.f15573k1;
        if (g1Var != null && (i7 = g1Var.f57335a) != -47814) {
            s0Var.setColor(i7);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(L);
        q5Var.addView(s0Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.f15582p0;
        if (weVar != null) {
            s0Var.j(1.0f / weVar.f27770c);
            s0Var.f(-(weVar.f27775k + weVar.d));
        }
        return s0Var;
    }

    public final tg.s1 j0(String str, boolean z10) {
        float f10;
        xt0 xt0Var;
        this.Z1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        q5 q5Var = this.B0;
        if (i7 > 0) {
            float floor = (float) Math.floor(Math.max(this.B1, q5Var.getMeasuredWidth()) * 0.5d);
            xt0Var = new xt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, q5Var.getMeasuredHeight()) * 0.5d);
            xt0Var = new xt0(f10 * floor2, floor2);
        }
        xt0 xt0Var2 = xt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = xt0Var2.f42189a;
            xt0Var2.f42189a = xt0Var2.f42190b;
            xt0Var2.f42190b = f11;
        }
        Context context = getContext();
        PointF d02 = d0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.s1 s1Var = new tg.s1(context, d02, xt0Var2, str, intValue);
        s1Var.setDelegate(this);
        q5Var.addView(s1Var);
        e0();
        return s1Var;
    }

    public final tg.v1 k0(boolean z10) {
        String str;
        xt0 xt0Var = new xt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF d02 = d0();
        q5 q5Var = this.B0;
        if (q5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < q5Var.getChildCount(); i7++) {
                    View childAt = q5Var.getChildAt(i7);
                    if (a8.x9.a(d02.x, d02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                d02.x = (q5Var.getMeasuredWidth() * 0.05f) + d02.x;
                d02.y = (q5Var.getMeasuredHeight() * 0.05f) + d02.y;
                d02.x = Utilities.i(d02.x, q5Var.getMeasuredWidth(), 0.0f);
                d02.y = Utilities.i(d02.y, q5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? nVar = new tg.n(getContext(), d02);
        nVar.f58269t0 = new fi.l8(nVar);
        nVar.f58270u0 = new fi.l8(nVar);
        nVar.f58271v0 = new ch.g0(nVar);
        nVar.f58272w0 = new ch.g0(nVar);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6((View) nVar);
        nVar.f58274y0 = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6((View) nVar);
        nVar.f58275z0 = c6Var2;
        nVar.B0 = 1.0f;
        nVar.f58268s0 = xt0Var;
        c6Var2.e(true, 1.0f);
        c6Var.e(true, 1.0f);
        ArrayList arrayList = ri.d0(i10.f24637t0).h;
        ch.g0 g0Var = nVar.f58271v0;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((TLRPC.TL_availableReaction) arrayList.get(i10)).title.equals("Red Heart")) {
                    str = ((TLRPC.TL_availableReaction) arrayList.get(i10)).reaction;
                    break;
                }
                i10++;
            } else {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
        }
        ch.p0 b10 = ch.p0.b(str);
        nVar.f58273x0 = b10;
        g0Var.e(b10);
        nVar.k();
        nVar.setDelegate(this);
        q5Var.addView(nVar);
        e0();
        if (z10) {
            A0(nVar);
            D0(nVar, true);
        }
        return nVar;
    }

    public final tg.w1 l0(String str, boolean z10) {
        float f10;
        this.Z1 = true;
        this.f15556b2 = true;
        p0();
        q5 q5Var = this.B0;
        int measuredWidth = q5Var.getMeasuredWidth();
        q5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        xt0 xt0Var = new xt0(floor, floor);
        tg.w1 w1Var = new tg.w1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (xt0Var.f42190b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), xt0Var, str);
        w1Var.setDelegate(this);
        q5Var.addView(w1Var);
        e0();
        if (z10) {
            A0(w1Var);
            post(new h4(this, w1Var, 0));
        }
        this.f15556b2 = false;
        return w1Var;
    }

    public final m5 m0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        we weVar = this.f15582p0;
        if (weVar != null) {
            f10 = -(weVar.f27775k + weVar.d);
            f11 = 0.75f / weVar.f27770c;
        } else {
            f10 = 0.0f;
        }
        u5 u5Var = new u5(d0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f42189a * 0.5d);
        m5 m5Var = new m5(this, context, u5Var.f15520a, u5Var.f15522c, u5Var.f15521b, new xt0(floor, floor), document, obj);
        boolean C4 = fj.C4(document);
        ImageReceiver imageReceiver = m5Var.f58008z0;
        if (C4) {
            imageReceiver.f22751p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.F0(12);
        m5Var.setDelegate(this);
        this.B0.addView(m5Var);
        e0();
        return m5Var;
    }

    @Override
    public final int[] n(tg.n nVar) {
        int[] iArr = this.f15558c2;
        iArr[0] = (int) nVar.getPosition().x;
        iArr[1] = (int) nVar.getPosition().y;
        return iArr;
    }

    public final tg.q2 n0(boolean z10) {
        xt0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        tg.q2 q2Var = new tg.q2(getContext(), Q0, (int) (paintingSize.f42189a / 9.0f), "", this.f15573k1, this.f15594v0);
        float f10 = paintingSize.f42189a / 9.0f;
        s4 s4Var = new s4(this, 0);
        q2Var.f58184y0 = (int) (0.5f * f10);
        q2Var.f58185z0 = (int) (f10 * 2.0f);
        q2Var.A0 = s4Var;
        float f11 = Q0.x;
        q5 q5Var = this.B0;
        if (f11 == q5Var.getMeasuredWidth() / 2.0f) {
            q2Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            q2Var.setStickyY(2);
        }
        q2Var.setDelegate(this);
        q2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.f15583p1;
        q2Var.setTypeface(sg.j0.e(i7).f57383j);
        q2Var.setType(sg.j0.e(i7).h);
        q5Var.addView(q2Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.f15582p0;
        if (weVar != null) {
            q2Var.j(1.0f / weVar.f27770c);
            q2Var.f(-(weVar.f27775k + weVar.d));
        }
        if (z10) {
            A0(q2Var);
            q2Var.q();
            D0(q2Var, false);
            q2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(q2Var.getFocusedView());
            this.f15592u0 = true;
            int i10 = sg.j0.e(i7).f57381g;
            tg.j1 j1Var = this.V0;
            j1Var.d(i10, true);
            j1Var.setOutlineType(sg.j0.e(i7).h);
        }
        return q2Var;
    }

    public final tg.r2 o0(kc kcVar) {
        int measuredWidth;
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        if (q5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = q5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.r2 r2Var = new tg.r2(getContext(), Q0, this.f15583p1, kcVar, f10 / 240.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            r2Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            r2Var.setStickyY(2);
        }
        sg.g1 g1Var = this.f15573k1;
        if (g1Var != null && (i7 = g1Var.f57335a) != -47814) {
            r2Var.setColor(i7);
        }
        r2Var.setDelegate(this);
        r2Var.setMaxWidth(L);
        q5Var.addView(r2Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.f15582p0;
        if (weVar != null) {
            r2Var.j(1.0f / weVar.f27770c);
            r2Var.f(-(weVar.f27775k + weVar.d));
        }
        return r2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.f(null);
            m.o3 o3Var = a0Var.f14170c;
            if (o3Var != null) {
                o3Var.f20256f = null;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.f14170c = null;
            }
            a0Var.f14168a.w(false);
        }
        this.W1.w(false);
        xi0 xi0Var = this.J1;
        if (xi0Var != null) {
            org.telegram.messenger.g0.E2(xi0Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        u uVar;
        this.f15584q0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((f11 * f10) / currentActionBarHeight);
        }
        float f12 = this.f15586r0.f42189a;
        tg.n nVar = this.f15590t0;
        if (nVar != null) {
            nVar.m();
        }
        measureChild(this.D0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.F0, i7, i10);
        a0 a0Var = this.U1;
        if (a0Var != null && (uVar = a0Var.f14171e) != null) {
            uVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.E0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f15567h2 - this.f15597w1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f15584q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.f15561e2 && !this.f15565g2) {
            this.f15584q0 = true;
            v0();
            this.f15584q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        v0();
    }

    @Override
    public final boolean p() {
        return !(this.f15590t0 instanceof tg.z0);
    }

    public final void p0() {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i7);
                if (childAt instanceof tg.w1) {
                    if (this.f15590t0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(kr.h).withEndAction(new h4(this, (tg.w1) childAt, 1)).start();
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        return !this.f15592u0;
    }

    public abstract void q0();

    public final tg.z0 r0() {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i7);
                if (childAt instanceof tg.z0) {
                    return (tg.z0) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f15584q0) {
            return;
        }
        super.requestLayout();
    }

    public final android.graphics.Bitmap s0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, hi.x7 r44) {
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.s0(java.util.ArrayList, boolean, boolean, boolean, boolean, hi.x7):android.graphics.Bitmap");
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.O1 = baVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f15554a2 != z10) {
            this.f15554a2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i7);
                if (childAt instanceof tg.j2) {
                    ImageReceiver imageReceiver = ((tg.j2) childAt).f58008z0;
                    nh0 C = imageReceiver.C();
                    imageReceiver.m();
                    if (C != null) {
                        C.N(Math.round(((((float) j3) % ((float) C.r())) / ((float) C.r())) * C.f37805e[0]), true, false);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.I1) {
            this.I1 = z10;
            e0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.f15595v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f15593u1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f15563f2 && !this.f15561e2) {
            this.Z1 = true;
            n0(true);
            return;
        }
        if (this.f15561e2) {
            tg.n nVar = this.f15590t0;
            if (nVar instanceof tg.q2) {
                this.f15601y1.f15711e = true;
                org.telegram.messenger.g0.I3(((tg.q2) nVar).getEditText());
            }
        }
        J0(!this.f15561e2 ? 1 : 0);
    }

    public final boolean t0() {
        if (!this.f15579n0.a() && !this.Z1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean u(tg.n nVar) {
        return D0(nVar, true);
    }

    public final void u0(boolean z10) {
        if (this.f15561e2) {
            J0(0);
        }
        if (z10) {
            qy qyVar = this.d2;
            if (qyVar != null && qyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.d2.getMeasuredHeight());
                ofFloat.addUpdateListener(new n4(this, 0));
                this.f15565g2 = true;
                ofFloat.addListener(new h5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                ofFloat.start();
                return;
            }
            v0();
        }
    }

    @Override
    public final void updateColors() {
        this.f15581o1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.f15600y0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y10 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final void v0() {
        qy qyVar;
        if (!this.f15561e2 && (qyVar = this.d2) != null && qyVar.getVisibility() != 8) {
            this.d2.setVisibility(8);
        }
        int i7 = this.f15567h2;
        this.f15567h2 = 0;
        if (i7 != 0) {
            this.f15601y1.a();
        }
    }

    @Override
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        tg.r1 r1Var = this.N0;
        if (!z10 && !(hVar instanceof sg.d)) {
            r1Var.b(0.05f, 1.0f);
        } else {
            r1Var.b(0.4f, 1.75f);
        }
        r1Var.setDrawCenter(!(hVar instanceof sg.g));
        p5 p5Var = this.f15600y0;
        if (p5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        p5Var.setBrush(hVar);
        sg.g1 g1Var = this.f15573k1;
        int i7 = g1Var.f57335a;
        g1Var.f57335a = sg.j0.e(this.f15583p1).c();
        g1Var.f57337c = this.O0.get();
        E0(g1Var, Integer.valueOf(i7), false);
        this.f15602z0.invalidate();
    }

    @Override
    public final sg.j0 x() {
        return sg.j0.e(this.f15583p1);
    }

    public final boolean x0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() != null && !this.J1.getReactionsWindow().f5303q) {
                this.J1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.l1) {
            I0(false);
            return true;
        } else if (this.f15561e2) {
            u0(true);
            return true;
        } else if (!this.f15592u0) {
            return false;
        } else {
            if (this.f15596w0) {
                this.f15596w0 = false;
                this.f15601y1.b(true);
                return false;
            }
            D0(null, true);
            return true;
        }
    }

    public abstract void y0(boolean z10);

    public final void z0() {
        int i7 = this.I0;
        R0(1);
        postDelayed(new ai.k(this, 18), 350L);
        j5 j5Var = new j5(this, getContext(), this.f15585q1, i7);
        this.Y1 = j5Var;
        mb mbVar = this.f15597w1;
        Objects.requireNonNull(mbVar);
        j5Var.f15286x1 = new bi.b(mbVar, 29);
        boolean[] zArr = {true};
        j5Var.setOnDismissListener(new a5(this, zArr, i7, 0));
        j5Var.f15288z1 = new u4(this);
        j5Var.P0(new b5(this, zArr, j5Var, 0));
        j5Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f10) {
    }
}
