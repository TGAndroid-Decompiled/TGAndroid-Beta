package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ida extends FrameLayout implements vlb, cr3 {
    public final int E;
    public k47 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final p09 L;
    public final ylb M;
    public tk4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final kc0 b;
    public final TextView c;
    public final TextView d;
    public final fn e;
    public final s09 f;
    public final k46 h;
    public final jh2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public ida(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4;
        float f5;
        float f6;
        int i5;
        float f7;
        int i6;
        float f8;
        float f9;
        int i7;
        float f10;
        float f11;
        int i8;
        int i9;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        int i11;
        int i12;
        float f16;
        float f17;
        int i13;
        float f18;
        float f19;
        int i14;
        float f20;
        float f21;
        int i15;
        float f22;
        float f23;
        int i16;
        float f24;
        float f25;
        int i17;
        float f26;
        float f27;
        int i18;
        float f28;
        float f29;
        int i19;
        float f30;
        float f31;
        int i20;
        float f32;
        float f33;
        int i21;
        float f34;
        float f35;
        this.w = true;
        int i22 = z8c.t0;
        this.y = i22;
        this.S = 1.0f;
        this.M = ylbVar;
        this.I = i;
        this.E = er3.q(i22).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = jb6.a0;
        if (i == 1) {
            if (z) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i23 = i21 | 48;
            if (z) {
                f34 = 0.0f;
            } else {
                f34 = 15.0f;
            }
            if (z) {
                f35 = 15.0f;
            } else {
                f35 = 0.0f;
            }
            addView(imageView, qoe.d(42, 42.0f, i23, f34, 12.0f, f35, 0.0f));
        } else {
            if (z) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            int i24 = i2 | 48;
            if (z) {
                f = 0.0f;
            } else {
                f = 12.0f;
            }
            if (z) {
                f2 = 12.0f;
            } else {
                f2 = 0.0f;
            }
            addView(imageView, qoe.d(40, 40.0f, i24, f, 8.0f, f2, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        td4.x(textView, cmb.rj, ylbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = jb6.a0;
        if (i == 1) {
            if (z2) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i25 = i20 | 48;
            if (z2) {
                f32 = 0.0f;
            } else {
                f32 = 20.0f;
            }
            if (z2) {
                f33 = 20.0f;
            } else {
                f33 = 0.0f;
            }
            addView(textView, qoe.d(32, -2.0f, i25, f32, 28.0f, f33, 0.0f));
        } else {
            if (z2) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i26 = i3 | 48;
            if (z2) {
                f3 = 0.0f;
            } else {
                f3 = 16.0f;
            }
            if (z2) {
                f4 = 16.0f;
            } else {
                f4 = 0.0f;
            }
            addView(textView, qoe.d(32, -2.0f, i26, f3, 22.0f, f4, 0.0f));
        }
        kc0 kc0Var = new kc0((byte) 9, context, this);
        this.b = kc0Var;
        kc0Var.setRoundRadius(gm.L(4.0f));
        boolean z3 = jb6.a0;
        if (i == 1) {
            if (z3) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            int i27 = i19 | 48;
            if (z3) {
                f30 = 0.0f;
            } else {
                f30 = 16.0f;
            }
            if (z3) {
                f31 = 16.0f;
            } else {
                f31 = 0.0f;
            }
            addView(kc0Var, qoe.d(42, 42.0f, i27, f30, 12.0f, f31, 0.0f));
        } else {
            if (z3) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            int i28 = i4 | 48;
            if (z3) {
                f5 = 0.0f;
            } else {
                f5 = 12.0f;
            }
            if (z3) {
                f6 = 12.0f;
            } else {
                f6 = 0.0f;
            }
            addView(kc0Var, qoe.d(40, 40.0f, i28, f5, 8.0f, f6, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i29 = cmb.F6;
        td4.x(textView2, i29, ylbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5 | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = jb6.a0;
            if (z4) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i30 = i18 | 48;
            if (z4) {
                f28 = 8.0f;
            } else {
                f28 = 72.0f;
            }
            if (z4) {
                f29 = 72.0f;
            } else {
                f29 = 8.0f;
            }
            addView(textView2, qoe.d(-1, -2.0f, i30, f28, 9.0f, f29, 0.0f));
            f7 = 14.0f;
        } else if (i == 2) {
            LinearLayout i31 = hg9.i(context, 0);
            boolean z5 = jb6.a0;
            if (z5) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i32 = i7 | 48;
            if (z5) {
                f10 = 16.0f;
            } else {
                f10 = 72.0f;
            }
            if (z5) {
                f11 = 72.0f;
            } else {
                f11 = 16.0f;
            }
            addView(i31, qoe.d(-1, -2.0f, i32, f10, 5.0f, f11, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            anb.X(textView3, cmb.z6, ylbVar);
            textView3.setTextSize(1, 14.0f);
            f7 = 14.0f;
            if (!jb6.a0) {
                i31.addView(textView2, qoe.l(1.0f, -2, -2));
                i31.addView(textView3, qoe.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                i31.addView(textView3, qoe.l(0.0f, -2, -2));
                i31.addView(textView2, qoe.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            anb.X(textView4, i29, ylbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (jb6.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            textView4.setGravity(i8 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = jb6.a0;
            if (z6) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i33 = i9 | 48;
            if (z6) {
                f12 = 8.0f;
            } else {
                f12 = 72.0f;
            }
            if (z6) {
                f13 = 72.0f;
            } else {
                f13 = 8.0f;
            }
            addView(textView4, qoe.d(-1, -2.0f, i33, f12, 30.0f, f13, 0.0f));
            textView4.setVisibility(8);
        } else {
            f7 = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = jb6.a0;
            if (z7) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            int i34 = i6 | 48;
            if (z7) {
                f8 = 8.0f;
            } else {
                f8 = 72.0f;
            }
            if (z7) {
                f9 = 72.0f;
            } else {
                f9 = 8.0f;
            }
            addView(textView2, qoe.d(-1, -2.0f, i34, f8, 5.0f, f9, 0.0f));
        }
        p09 p09Var = new p09(2131624003, gm.L(f7), gm.L(f7), true, null);
        this.L = p09Var;
        ?? imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setAnimation(p09Var);
        imageView2.setVisibility(4);
        int i35 = cmb.yi;
        anb.s(imageView2, i35, ylbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = jb6.a0;
        if (i == 1) {
            if (z8) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i36 = i17 | 48;
            if (z8) {
                f26 = 8.0f;
            } else {
                f26 = 70.0f;
            }
            if (z8) {
                f27 = 72.0f;
            } else {
                f27 = 8.0f;
            }
            addView((View) imageView2, qoe.d(14, 14.0f, i36, f26, 37.0f, f27, 0.0f));
        } else {
            if (z8) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i37 = i10 | 48;
            if (z8) {
                f14 = 8.0f;
            } else {
                f14 = 70.0f;
            }
            if (z8) {
                f15 = 72.0f;
            } else {
                f15 = 8.0f;
            }
            addView((View) imageView2, qoe.d(14, 14.0f, i37, f14, 33.0f, f15, 0.0f));
        }
        fn fnVar = new fn(context);
        this.e = fnVar;
        anb.X(fnVar, cmb.z6, ylbVar);
        fnVar.setLines(1);
        fnVar.setMaxLines(1);
        fnVar.setSingleLine(true);
        fnVar.setEllipsize(truncateAt);
        if (jb6.a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        fnVar.setGravity(i11 | 16);
        nm7.i(fnVar);
        if (i == 1) {
            fnVar.setTextSize(1, 13.0f);
            boolean z9 = jb6.a0;
            if (z9) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i38 = i16 | 48;
            if (z9) {
                f24 = 8.0f;
            } else {
                f24 = 72.0f;
            }
            if (z9) {
                f25 = 72.0f;
            } else {
                f25 = 8.0f;
            }
            addView(fnVar, qoe.d(-1, -2.0f, i38, f24, 34.0f, f25, 0.0f));
        } else {
            fnVar.setTextSize(1, 13.0f);
            boolean z10 = jb6.a0;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i39 = i12 | 48;
            if (z10) {
                f16 = 8.0f;
            } else {
                f16 = 72.0f;
            }
            if (z10) {
                f17 = 72.0f;
            } else {
                f17 = 8.0f;
            }
            addView(fnVar, qoe.d(-1, -2.0f, i39, f16, 30.0f, f17, 0.0f));
        }
        k46 k46Var = new k46(context);
        this.h = k46Var;
        k46Var.setProgressColor(cmb.v0(i35, ylbVar));
        boolean z11 = jb6.a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i40 = i13 | 48;
        if (z11) {
            f18 = 0.0f;
        } else {
            f18 = 72.0f;
        }
        if (z11) {
            f19 = 72.0f;
        } else {
            f19 = 0.0f;
        }
        addView(k46Var, qoe.d(-1, 2.0f, i40, f18, 54.0f, f19, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.n = jh2Var;
        jh2Var.setVisibility(4);
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(2);
        boolean z12 = jb6.a0;
        if (i == 1) {
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i41 = i15 | 48;
            if (z12) {
                f22 = 0.0f;
            } else {
                f22 = 38.0f;
            }
            if (z12) {
                f23 = 38.0f;
            } else {
                f23 = 0.0f;
            }
            addView(jh2Var, qoe.d(24, 24.0f, i41, f22, 36.0f, f23, 0.0f));
        } else {
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i42 = i14 | 48;
            if (z12) {
                f20 = 0.0f;
            } else {
                f20 = 33.0f;
            }
            if (z12) {
                f21 = 33.0f;
            } else {
                f21 = 0.0f;
            }
            addView(jh2Var, qoe.d(24, 24.0f, i42, f20, 28.0f, f21, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new gq3(), 0, 1, 0);
        }
    }

    @Override
    public final void A(boolean z) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(gm.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, cmb.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        jh2 jh2Var = this.n;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, z2);
    }

    public final void c(k47 k47Var, boolean z) {
        boolean z2;
        String str;
        String str2;
        String str3;
        int i;
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        String str6;
        k47 k47Var2 = this.F;
        if (k47Var2 != null && k47Var != null && k47Var2.e1() != k47Var.e1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z;
        this.F = k47Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = k47Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        String str7 = "";
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        kc0 kc0Var = this.b;
        if (F0 != null) {
            if (k47Var.I3()) {
                str = null;
                for (int i2 = 0; i2 < F0.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = k47Var.w1(true) + " - " + k47Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!k47.K4(k47Var.k) && !(k47Var.k.media instanceof TLRPC.TL_messageMediaPhoto) && !k47.s3(F0, false)) {
                str2 = bc4.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (k47.s3(F0, false)) {
                        str2 = jb6.M0(2131753936, null);
                    } else {
                        str2 = jb6.M0(2131753898, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (k47.s3(F0, false)) {
                        str2 = jb6.M0(2131753936, null);
                    } else {
                        str2 = jb6.M0(2131753913, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = jb6.M0(2131753947, null);
                } else {
                    str2 = jb6.M0(2131753940, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = k47Var.a2;
            ylb ylbVar = this.M;
            CharSequence v1 = gm.v1(str3, arrayList, ylbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(gm.l1(str2, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str7 = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(str7);
            TLRPC.PhotoSize w = bc4.w(F0.thumbs, 320, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if (!(w2 instanceof TLRPC.TL_photoSizeEmpty) && w2 != null) {
                ImageReceiver imageReceiver = kc0Var.getImageReceiver();
                if (w == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                imageReceiver.G0 = z3;
                ImageReceiver imageReceiver2 = kc0Var.getImageReceiver();
                if (w == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                imageReceiver2.H0 = z4;
                kc0Var.setVisibility(0);
                if (k47Var.I1 != null) {
                    kc0Var.k(gn5.c(w, F0), "40_40", null, null, k47Var.I1, null, 1, k47Var);
                } else {
                    kc0Var.g(1, 0L, gn5.c(w, F0), gn5.c(w2, F0), k47Var, "40_40", "40_40_b", null);
                }
            } else {
                kc0Var.setVisibility(4);
                kc0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (k47Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = gm.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, ylbVar);
                this.K = v12;
                if (textView2 != null) {
                    if (v12 == null) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView2.setVisibility(i);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            textView.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            kc0Var.setVisibility(4);
            kc0Var.setImageBitmap(null);
            this.K = null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z2);
    }

    public final void d(String str, String str2, String str3, String str4, int i, boolean z) {
        int i2;
        int i3;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.x = z;
        ImageView imageView = this.a;
        if (i == 0) {
            imageView.setImageResource(gm.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        kc0 kc0Var = this.b;
        if (str4 == null) {
            if (i != 0) {
                sn2 M = cmb.M(gm.L(42.0f), i);
                if (i == 2131231077) {
                    i2 = cmb.ma;
                    i3 = cmb.ha;
                } else if (i == 2131231074) {
                    i2 = cmb.ka;
                    i3 = cmb.ha;
                } else if (i == 2131231076) {
                    i2 = cmb.ja;
                    i3 = cmb.ha;
                } else if (i == 2131231075) {
                    i2 = cmb.ia;
                    i3 = cmb.ha;
                } else {
                    i2 = cmb.qj;
                    i3 = cmb.pj;
                }
                ylb ylbVar = this.M;
                cmb.z1(M, cmb.v0(i2, ylbVar), false);
                cmb.z1(M, cmb.v0(i3, ylbVar), true);
                kc0Var.setImageDrawable(M);
            } else {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    kc0Var.setImageBitmap(null);
                    kc0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
        } else if (b != 3) {
            kc0Var.o(str4, "42_42", null);
        }
        kc0Var.setVisibility(0);
        setWillNotDraw(!this.x);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.S != 1.0f && this.N != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.S) * 255.0f), 31);
            this.N.setViewType(3);
            this.N.updateColors();
            this.N.f();
            this.N.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.S * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z = this.P;
        float f = this.Q;
        if (!z) {
            if (f != 0.0f) {
                if (f != 0.0f) {
                    this.Q = f - 0.10666667f;
                    invalidate();
                }
            } else {
                return;
            }
        } else if (f != 1.0f) {
            this.Q = f + 0.10666667f;
            invalidate();
        }
        this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - gm.L(12.0f)) - cmb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - cmb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (cmb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (cmb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = cmb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, cmb.Y0.getIntrinsicHeight() + measuredHeight);
        cmb.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String o;
        k47 k47Var = this.F;
        if (k47Var != null && k47Var.F0() != null) {
            k47 k47Var2 = this.F;
            long j = k47Var2.k.date * 1000;
            long j2 = this.O;
            if (j2 == 0) {
                o = gm.i0(k47Var2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                o = kt6.o(gm.i0(j2, false, false), " / ", gm.i0(this.F.F0().size, false, false));
            }
            byte b = this.I;
            fn fnVar = this.e;
            if (b == 2) {
                fnVar.setText(new SpannableStringBuilder().append((CharSequence) o).append(' ').append((CharSequence) this.J).append(' ').append(ch4.c(this.F, true, 2, fnVar.getPaint())));
                this.r.setText(jb6.e1(this.F.k.date));
                return;
            }
            String a0 = jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().B0().format(new Date(j)), jb6.D0().o0().format(new Date(j)));
            fnVar.setText(o + ", " + a0);
        }
    }

    public final void f(boolean z) {
        float f;
        float f2;
        int i;
        float f3;
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) d53.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        k47 k47Var = this.F;
        float f4 = 72.0f;
        int i2 = this.y;
        k46 k46Var = this.h;
        s09 s09Var = this.f;
        float f5 = 8.0f;
        fn fnVar = this.e;
        if (k47Var != null && k47Var.k.media != null) {
            this.H = false;
            if (!k47Var.y0 && !k47Var.z0 && this.w) {
                String r = bc4.r(null, k47Var.F0());
                er3.q(i2).a(r, this.F, this);
                this.G = bc4.G(i2).S(r);
                s09Var.setVisibility(0);
                int i3 = 15;
                if (this.G) {
                    i = 15;
                } else {
                    i = 0;
                }
                p09 p09Var = this.L;
                p09Var.K(i);
                p09Var.h = true;
                if (z) {
                    s09Var.d();
                } else {
                    if (!this.G) {
                        i3 = 0;
                    }
                    p09Var.H(i3);
                    s09Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
                if (layoutParams != null) {
                    if (jb6.a0) {
                        f3 = 8.0f;
                    } else {
                        f3 = 86.0f;
                    }
                    layoutParams.leftMargin = gm.L(f3);
                    if (jb6.a0) {
                        f5 = 86.0f;
                    }
                    layoutParams.rightMargin = gm.L(f5);
                    fnVar.requestLayout();
                }
                if (this.G) {
                    k46Var.setVisibility(0);
                    Float s = fn5.z().s(r);
                    if (s == null) {
                        s = Float.valueOf(0.0f);
                    }
                    k46Var.a(false, s.floatValue());
                    return;
                }
                k46Var.setVisibility(4);
                return;
            }
            s09Var.setVisibility(4);
            k46Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
            if (layoutParams2 != null) {
                if (jb6.a0) {
                    f2 = 8.0f;
                } else {
                    f2 = 72.0f;
                }
                layoutParams2.leftMargin = gm.L(f2);
                if (!jb6.a0) {
                    f4 = 8.0f;
                }
                layoutParams2.rightMargin = gm.L(f4);
                fnVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            er3.q(i2).v(this);
            return;
        }
        this.G = false;
        this.H = true;
        k46Var.setVisibility(4);
        k46Var.a(false, 0.0f);
        s09Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
        if (layoutParams3 != null) {
            if (jb6.a0) {
                f = 8.0f;
            } else {
                f = 72.0f;
            }
            layoutParams3.leftMargin = gm.L(f);
            if (!jb6.a0) {
                f4 = 8.0f;
            }
            layoutParams3.rightMargin = gm.L(f4);
            fnVar.requestLayout();
        }
        er3.q(i2).v(this);
    }

    public bf0 getImageView() {
        return this.b;
    }

    public k47 getMessage() {
        return this.F;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j, long j2) {
        k46 k46Var = this.h;
        if (k46Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        k46Var.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        er3.q(this.y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.n;
        if (jh2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.I != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - gm.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = hg9.v(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                fn fnVar = this.e;
                fnVar.layout(fnVar.getLeft(), fnVar.getTop() + measuredHeight, fnVar.getRight(), fnVar.getBottom() + measuredHeight);
                s09 s09Var = this.f;
                s09Var.layout(s09Var.getLeft(), s09Var.getTop() + measuredHeight, s09Var.getRight(), s09Var.getBottom() + measuredHeight);
                k46 k46Var = this.h;
                k46Var.layout(k46Var.getLeft(), (getMeasuredHeight() - k46Var.getMeasuredHeight()) - (this.x ? 1 : 0), k46Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.x ? 1 : 0), 1073741824));
        } else if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
            int measuredHeight = this.c.getMeasuredHeight() + gm.L(34.0f) + (this.x ? 1 : 0);
            if (this.K != null && (textView = this.s) != null && this.F.r2()) {
                this.R = true;
                textView.setText(gm.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.R = false;
                measuredHeight = hg9.v(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.R) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z) {
        this.w = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.S != f) {
            this.S = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.N = tk4Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        kc0 kc0Var = this.b;
        if (endsWith) {
            kc0Var.o("vthumb://0:".concat(str), null, null);
            kc0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            kc0Var.setVisibility(8);
        } else {
            kc0Var.o("thumb://0:".concat(str), null, null);
            kc0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(jo6 jo6Var) {
        String str = jo6Var.c;
        long j = jo6Var.H;
        int i = jo6Var.G;
        int i2 = jo6Var.F;
        int i3 = jo6Var.C;
        String str2 = jo6Var.I;
        kc0 kc0Var = this.b;
        if (str != null) {
            kc0Var.o(str, null, cmb.Q4);
            str2 = jo6Var.c;
        } else if (str2 != null) {
            if (jo6Var.b) {
                kc0Var.q();
                kc0Var.o("vthumb://" + i3 + ":" + str2, null, cmb.Q4);
            } else {
                kc0Var.r(jo6Var.J, jo6Var.K, true);
                kc0Var.o("thumb://" + i3 + ":" + str2, null, cmb.Q4);
            }
        } else {
            kc0Var.setImageDrawable(cmb.Q4);
            str2 = "";
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        bc4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (jo6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gm.g0(jo6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gm.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(jb6.D0().y0().format(jo6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(cmb.v0(cmb.yi, this.M));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
