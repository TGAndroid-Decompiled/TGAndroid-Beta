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
public final class zea extends FrameLayout implements snb, jq3 {
    public final int E;
    public r47 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final b29 L;
    public final vnb M;
    public tk4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final mb0 b;
    public final TextView c;
    public final TextView d;
    public final gm e;
    public final e29 f;
    public final n46 h;
    public final og2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public zea(int i, vnb vnbVar, Context context) {
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
        int i22 = yac.t0;
        this.y = i22;
        this.S = 1.0f;
        this.M = vnbVar;
        this.I = i;
        this.E = lq3.q(i22).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = ob6.a0;
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
            addView(imageView, tre.d(42, 42.0f, i23, f34, 12.0f, f35, 0.0f));
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
            addView(imageView, tre.d(40, 40.0f, i24, f, 8.0f, f2, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        qd4.w(textView, aob.sj, vnbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = ob6.a0;
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
            addView(textView, tre.d(32, -2.0f, i25, f32, 28.0f, f33, 0.0f));
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
            addView(textView, tre.d(32, -2.0f, i26, f3, 22.0f, f4, 0.0f));
        }
        mb0 mb0Var = new mb0((byte) 9, context, this);
        this.b = mb0Var;
        mb0Var.setRoundRadius(hl.L(4.0f));
        boolean z3 = ob6.a0;
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
            addView(mb0Var, tre.d(42, 42.0f, i27, f30, 12.0f, f31, 0.0f));
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
            addView(mb0Var, tre.d(40, 40.0f, i28, f5, 8.0f, f6, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i29 = aob.G6;
        qd4.w(textView2, i29, vnbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5 | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = ob6.a0;
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
            addView(textView2, tre.d(-1, -2.0f, i30, f28, 9.0f, f29, 0.0f));
            f7 = 14.0f;
        } else if (i == 2) {
            LinearLayout j = uh9.j(context, 0);
            boolean z5 = ob6.a0;
            if (z5) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i31 = i7 | 48;
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
            addView(j, tre.d(-1, -2.0f, i31, f10, 5.0f, f11, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            yob.X(textView3, aob.A6, vnbVar);
            textView3.setTextSize(1, 14.0f);
            f7 = 14.0f;
            if (!ob6.a0) {
                j.addView(textView2, tre.l(1.0f, -2, -2));
                j.addView(textView3, tre.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                j.addView(textView3, tre.l(0.0f, -2, -2));
                j.addView(textView2, tre.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            yob.X(textView4, i29, vnbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (ob6.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            textView4.setGravity(i8 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = ob6.a0;
            if (z6) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i32 = i9 | 48;
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
            addView(textView4, tre.d(-1, -2.0f, i32, f12, 30.0f, f13, 0.0f));
            textView4.setVisibility(8);
        } else {
            f7 = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = ob6.a0;
            if (z7) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            int i33 = i6 | 48;
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
            addView(textView2, tre.d(-1, -2.0f, i33, f8, 5.0f, f9, 0.0f));
        }
        b29 b29Var = new b29(2131624003, hl.L(f7), hl.L(f7), true, null);
        this.L = b29Var;
        ?? imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setAnimation(b29Var);
        imageView2.setVisibility(4);
        int i34 = aob.zi;
        yob.s(imageView2, i34, vnbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = ob6.a0;
        if (i == 1) {
            if (z8) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i35 = i17 | 48;
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
            addView((View) imageView2, tre.d(14, 14.0f, i35, f26, 37.0f, f27, 0.0f));
        } else {
            if (z8) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i36 = i10 | 48;
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
            addView((View) imageView2, tre.d(14, 14.0f, i36, f14, 33.0f, f15, 0.0f));
        }
        gm gmVar = new gm(context);
        this.e = gmVar;
        yob.X(gmVar, aob.A6, vnbVar);
        gmVar.setLines(1);
        gmVar.setMaxLines(1);
        gmVar.setSingleLine(true);
        gmVar.setEllipsize(truncateAt);
        if (ob6.a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        gmVar.setGravity(i11 | 16);
        jn7.i(gmVar);
        if (i == 1) {
            gmVar.setTextSize(1, 13.0f);
            boolean z9 = ob6.a0;
            if (z9) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i37 = i16 | 48;
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
            addView(gmVar, tre.d(-1, -2.0f, i37, f24, 34.0f, f25, 0.0f));
        } else {
            gmVar.setTextSize(1, 13.0f);
            boolean z10 = ob6.a0;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i38 = i12 | 48;
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
            addView(gmVar, tre.d(-1, -2.0f, i38, f16, 30.0f, f17, 0.0f));
        }
        n46 n46Var = new n46(context);
        this.h = n46Var;
        n46Var.setProgressColor(aob.v0(i34, vnbVar));
        boolean z11 = ob6.a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i39 = i13 | 48;
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
        addView(n46Var, tre.d(-1, 2.0f, i39, f18, 54.0f, f19, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.n = og2Var;
        og2Var.setVisibility(4);
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(2);
        boolean z12 = ob6.a0;
        if (i == 1) {
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i40 = i15 | 48;
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
            addView(og2Var, tre.d(24, 24.0f, i40, f22, 36.0f, f23, 0.0f));
        } else {
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i41 = i14 | 48;
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
            addView(og2Var, tre.d(24, 24.0f, i41, f20, 28.0f, f21, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
        }
    }

    @Override
    public final void B(boolean z) {
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
            canvas.drawLine(hl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        og2 og2Var = this.n;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, z2);
    }

    public final void c(r47 r47Var, boolean z) {
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
        r47 r47Var2 = this.F;
        if (r47Var2 != null && r47Var != null && r47Var2.e1() != r47Var.e1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z;
        this.F = r47Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = r47Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        String str7 = "";
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        mb0 mb0Var = this.b;
        if (F0 != null) {
            if (r47Var.I3()) {
                str = null;
                for (int i2 = 0; i2 < F0.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = r47Var.w1(true) + " - " + r47Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!r47.K4(r47Var.k) && !(r47Var.k.media instanceof TLRPC.TL_messageMediaPhoto) && !r47.s3(F0, false)) {
                str2 = xb4.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (r47.s3(F0, false)) {
                        str2 = ob6.M0(2131753964, null);
                    } else {
                        str2 = ob6.M0(2131753926, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (r47.s3(F0, false)) {
                        str2 = ob6.M0(2131753964, null);
                    } else {
                        str2 = ob6.M0(2131753941, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = ob6.M0(2131753975, null);
                } else {
                    str2 = ob6.M0(2131753968, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = r47Var.a2;
            vnb vnbVar = this.M;
            CharSequence v1 = hl.v1(str3, arrayList, vnbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(hl.l1(str2, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str7 = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(str7);
            TLRPC.PhotoSize w = xb4.w(F0.thumbs, 320, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if (!(w2 instanceof TLRPC.TL_photoSizeEmpty) && w2 != null) {
                ImageReceiver imageReceiver = mb0Var.getImageReceiver();
                if (w == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                imageReceiver.G0 = z3;
                ImageReceiver imageReceiver2 = mb0Var.getImageReceiver();
                if (w == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                imageReceiver2.H0 = z4;
                mb0Var.setVisibility(0);
                if (r47Var.I1 != null) {
                    mb0Var.k(jn5.c(w, F0), "40_40", null, null, r47Var.I1, null, 1, r47Var);
                } else {
                    mb0Var.g(1, 0L, jn5.c(w, F0), jn5.c(w2, F0), r47Var, "40_40", "40_40_b", null);
                }
            } else {
                mb0Var.setVisibility(4);
                mb0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (r47Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = hl.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, vnbVar);
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
            mb0Var.setVisibility(4);
            mb0Var.setImageBitmap(null);
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
            imageView.setImageResource(hl.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        mb0 mb0Var = this.b;
        if (str4 == null) {
            if (i != 0) {
                zm2 M = aob.M(hl.L(42.0f), i);
                if (i == 2131231076) {
                    i2 = aob.na;
                    i3 = aob.ia;
                } else if (i == 2131231073) {
                    i2 = aob.la;
                    i3 = aob.ia;
                } else if (i == 2131231075) {
                    i2 = aob.ka;
                    i3 = aob.ia;
                } else if (i == 2131231074) {
                    i2 = aob.ja;
                    i3 = aob.ia;
                } else {
                    i2 = aob.rj;
                    i3 = aob.qj;
                }
                vnb vnbVar = this.M;
                aob.z1(M, aob.v0(i2, vnbVar), false);
                aob.z1(M, aob.v0(i3, vnbVar), true);
                mb0Var.setImageDrawable(M);
            } else {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    mb0Var.setImageBitmap(null);
                    mb0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
        } else if (b != 3) {
            mb0Var.o(str4, "42_42", null);
        }
        mb0Var.setVisibility(0);
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
        int measuredWidth = (getMeasuredWidth() - hl.L(12.0f)) - aob.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - aob.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (aob.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (aob.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = aob.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, aob.Y0.getIntrinsicHeight() + measuredHeight);
        aob.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String y;
        r47 r47Var = this.F;
        if (r47Var != null && r47Var.F0() != null) {
            r47 r47Var2 = this.F;
            long j = r47Var2.k.date * 1000;
            long j2 = this.O;
            if (j2 == 0) {
                y = hl.i0(r47Var2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                y = qd4.y(hl.i0(j2, false, false), " / ", hl.i0(this.F.F0().size, false, false));
            }
            byte b = this.I;
            gm gmVar = this.e;
            if (b == 2) {
                gmVar.setText(new SpannableStringBuilder().append((CharSequence) y).append(' ').append((CharSequence) this.J).append(' ').append(yg4.c(this.F, true, 2, gmVar.getPaint())));
                this.r.setText(ob6.e1(this.F.k.date));
                return;
            }
            String a0 = ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().B0().format(new Date(j)), ob6.D0().o0().format(new Date(j)));
            gmVar.setText(y + ", " + a0);
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
            transitionSet.setInterpolator((TimeInterpolator) k43.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        r47 r47Var = this.F;
        float f4 = 72.0f;
        int i2 = this.y;
        n46 n46Var = this.h;
        e29 e29Var = this.f;
        float f5 = 8.0f;
        gm gmVar = this.e;
        if (r47Var != null && r47Var.k.media != null) {
            this.H = false;
            if (!r47Var.y0 && !r47Var.z0 && this.w) {
                String r = xb4.r(null, r47Var.F0());
                lq3.q(i2).a(r, this.F, this);
                this.G = xb4.G(i2).S(r);
                e29Var.setVisibility(0);
                int i3 = 15;
                if (this.G) {
                    i = 15;
                } else {
                    i = 0;
                }
                b29 b29Var = this.L;
                b29Var.K(i);
                b29Var.h = true;
                if (z) {
                    e29Var.d();
                } else {
                    if (!this.G) {
                        i3 = 0;
                    }
                    b29Var.H(i3);
                    e29Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
                if (layoutParams != null) {
                    if (ob6.a0) {
                        f3 = 8.0f;
                    } else {
                        f3 = 86.0f;
                    }
                    layoutParams.leftMargin = hl.L(f3);
                    if (ob6.a0) {
                        f5 = 86.0f;
                    }
                    layoutParams.rightMargin = hl.L(f5);
                    gmVar.requestLayout();
                }
                if (this.G) {
                    n46Var.setVisibility(0);
                    Float s = in5.z().s(r);
                    if (s == null) {
                        s = Float.valueOf(0.0f);
                    }
                    n46Var.a(false, s.floatValue());
                    return;
                }
                n46Var.setVisibility(4);
                return;
            }
            e29Var.setVisibility(4);
            n46Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
            if (layoutParams2 != null) {
                if (ob6.a0) {
                    f2 = 8.0f;
                } else {
                    f2 = 72.0f;
                }
                layoutParams2.leftMargin = hl.L(f2);
                if (!ob6.a0) {
                    f4 = 8.0f;
                }
                layoutParams2.rightMargin = hl.L(f4);
                gmVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            lq3.q(i2).v(this);
            return;
        }
        this.G = false;
        this.H = true;
        n46Var.setVisibility(4);
        n46Var.a(false, 0.0f);
        e29Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
        if (layoutParams3 != null) {
            if (ob6.a0) {
                f = 8.0f;
            } else {
                f = 72.0f;
            }
            layoutParams3.leftMargin = hl.L(f);
            if (!ob6.a0) {
                f4 = 8.0f;
            }
            layoutParams3.rightMargin = hl.L(f4);
            gmVar.requestLayout();
        }
        lq3.q(i2).v(this);
    }

    public de0 getImageView() {
        return this.b;
    }

    public r47 getMessage() {
        return this.F;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j, long j2) {
        n46 n46Var = this.h;
        if (n46Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        n46Var.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
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
        lq3.q(this.y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.n;
        if (og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(og2Var.a.q);
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
                int measuredHeight = textView.getMeasuredHeight() - hl.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = uh9.w(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                gm gmVar = this.e;
                gmVar.layout(gmVar.getLeft(), gmVar.getTop() + measuredHeight, gmVar.getRight(), gmVar.getBottom() + measuredHeight);
                e29 e29Var = this.f;
                e29Var.layout(e29Var.getLeft(), e29Var.getTop() + measuredHeight, e29Var.getRight(), e29Var.getBottom() + measuredHeight);
                n46 n46Var = this.h;
                n46Var.layout(n46Var.getLeft(), (getMeasuredHeight() - n46Var.getMeasuredHeight()) - (this.x ? 1 : 0), n46Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.x ? 1 : 0), 1073741824));
        } else if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
            int measuredHeight = this.c.getMeasuredHeight() + hl.L(34.0f) + (this.x ? 1 : 0);
            if (this.K != null && (textView = this.s) != null && this.F.r2()) {
                this.R = true;
                textView.setText(hl.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.R = false;
                measuredHeight = uh9.w(3.0f, textView.getMeasuredHeight(), measuredHeight);
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
        mb0 mb0Var = this.b;
        if (endsWith) {
            mb0Var.o("vthumb://0:".concat(str), null, null);
            mb0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            mb0Var.setVisibility(8);
        } else {
            mb0Var.o("thumb://0:".concat(str), null, null);
            mb0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(no6 no6Var) {
        String str = no6Var.c;
        long j = no6Var.H;
        int i = no6Var.G;
        int i2 = no6Var.F;
        int i3 = no6Var.C;
        String str2 = no6Var.I;
        mb0 mb0Var = this.b;
        if (str != null) {
            mb0Var.o(str, null, aob.R4);
            str2 = no6Var.c;
        } else if (str2 != null) {
            if (no6Var.b) {
                mb0Var.q();
                mb0Var.o("vthumb://" + i3 + ":" + str2, null, aob.R4);
            } else {
                mb0Var.r(no6Var.J, no6Var.K, true);
                mb0Var.o("thumb://" + i3 + ":" + str2, null, aob.R4);
            }
        } else {
            mb0Var.setImageDrawable(aob.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        xb4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (no6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(hl.g0(no6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(hl.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(ob6.D0().y0().format(no6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(aob.v0(aob.zi, this.M));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
