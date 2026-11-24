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
public final class iba extends FrameLayout implements tjb, sp3 {
    public final int E;
    public k27 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final oy8 L;
    public final wjb M;
    public pi4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final kb0 b;
    public final TextView c;
    public final TextView d;
    public final fm e;
    public final ry8 f;
    public final j26 h;
    public final wf2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public iba(int i, wjb wjbVar, Context context) {
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
        int i22 = y6c.t0;
        this.y = i22;
        this.S = 1.0f;
        this.M = wjbVar;
        this.I = i;
        this.E = up3.q(i22).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = k96.a0;
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
            addView(imageView, nme.d(42, 42.0f, i23, f34, 12.0f, f35, 0.0f));
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
            addView(imageView, nme.d(40, 40.0f, i24, f, 8.0f, f2, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        tb4.w(textView, bkb.rj, wjbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = k96.a0;
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
            addView(textView, nme.d(32, -2.0f, i25, f32, 28.0f, f33, 0.0f));
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
            addView(textView, nme.d(32, -2.0f, i26, f3, 22.0f, f4, 0.0f));
        }
        kb0 kb0Var = new kb0((byte) 9, context, this);
        this.b = kb0Var;
        kb0Var.setRoundRadius(gl.L(4.0f));
        boolean z3 = k96.a0;
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
            addView(kb0Var, nme.d(42, 42.0f, i27, f30, 12.0f, f31, 0.0f));
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
            addView(kb0Var, nme.d(40, 40.0f, i28, f5, 8.0f, f6, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i29 = bkb.F6;
        tb4.w(textView2, i29, wjbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5 | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = k96.a0;
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
            addView(textView2, nme.d(-1, -2.0f, i30, f28, 9.0f, f29, 0.0f));
            f7 = 14.0f;
        } else if (i == 2) {
            LinearLayout j = de9.j(context, 0);
            boolean z5 = k96.a0;
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
            addView(j, nme.d(-1, -2.0f, i31, f10, 5.0f, f11, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            zkb.X(textView3, bkb.z6, wjbVar);
            textView3.setTextSize(1, 14.0f);
            f7 = 14.0f;
            if (!k96.a0) {
                j.addView(textView2, nme.l(1.0f, -2, -2));
                j.addView(textView3, nme.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                j.addView(textView3, nme.l(0.0f, -2, -2));
                j.addView(textView2, nme.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            zkb.X(textView4, i29, wjbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (k96.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            textView4.setGravity(i8 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = k96.a0;
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
            addView(textView4, nme.d(-1, -2.0f, i32, f12, 30.0f, f13, 0.0f));
            textView4.setVisibility(8);
        } else {
            f7 = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = k96.a0;
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
            addView(textView2, nme.d(-1, -2.0f, i33, f8, 5.0f, f9, 0.0f));
        }
        oy8 oy8Var = new oy8(2131624003, gl.L(f7), gl.L(f7), true, null);
        this.L = oy8Var;
        ?? imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setAnimation(oy8Var);
        imageView2.setVisibility(4);
        int i34 = bkb.yi;
        zkb.s(imageView2, i34, wjbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = k96.a0;
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
            addView((View) imageView2, nme.d(14, 14.0f, i35, f26, 37.0f, f27, 0.0f));
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
            addView((View) imageView2, nme.d(14, 14.0f, i36, f14, 33.0f, f15, 0.0f));
        }
        fm fmVar = new fm(context);
        this.e = fmVar;
        zkb.X(fmVar, bkb.z6, wjbVar);
        fmVar.setLines(1);
        fmVar.setMaxLines(1);
        fmVar.setSingleLine(true);
        fmVar.setEllipsize(truncateAt);
        if (k96.a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        fmVar.setGravity(i11 | 16);
        kk7.i(fmVar);
        if (i == 1) {
            fmVar.setTextSize(1, 13.0f);
            boolean z9 = k96.a0;
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
            addView(fmVar, nme.d(-1, -2.0f, i37, f24, 34.0f, f25, 0.0f));
        } else {
            fmVar.setTextSize(1, 13.0f);
            boolean z10 = k96.a0;
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
            addView(fmVar, nme.d(-1, -2.0f, i38, f16, 30.0f, f17, 0.0f));
        }
        j26 j26Var = new j26(context);
        this.h = j26Var;
        j26Var.setProgressColor(bkb.v0(i34, wjbVar));
        boolean z11 = k96.a0;
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
        addView(j26Var, nme.d(-1, 2.0f, i39, f18, 54.0f, f19, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.n = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(2);
        boolean z12 = k96.a0;
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
            addView(wf2Var, nme.d(24, 24.0f, i40, f22, 36.0f, f23, 0.0f));
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
            addView(wf2Var, nme.d(24, 24.0f, i41, f20, 28.0f, f21, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
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
            canvas.drawLine(gl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        wf2 wf2Var = this.n;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void c(k27 k27Var, boolean z) {
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
        k27 k27Var2 = this.F;
        if (k27Var2 != null && k27Var != null && k27Var2.e1() != k27Var.e1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z;
        this.F = k27Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = k27Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        String str7 = "";
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        kb0 kb0Var = this.b;
        if (F0 != null) {
            if (k27Var.I3()) {
                str = null;
                for (int i2 = 0; i2 < F0.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = k27Var.w1(true) + " - " + k27Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!k27.K4(k27Var.k) && !(k27Var.k.media instanceof TLRPC.TL_messageMediaPhoto) && !k27.s3(F0, false)) {
                str2 = ba4.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (k27.s3(F0, false)) {
                        str2 = k96.M0(2131753968, null);
                    } else {
                        str2 = k96.M0(2131753930, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (k27.s3(F0, false)) {
                        str2 = k96.M0(2131753968, null);
                    } else {
                        str2 = k96.M0(2131753945, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = k96.M0(2131753979, null);
                } else {
                    str2 = k96.M0(2131753972, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = k27Var.a2;
            wjb wjbVar = this.M;
            CharSequence v1 = gl.v1(str3, arrayList, wjbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(gl.l1(str2, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str7 = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(str7);
            TLRPC.PhotoSize w = ba4.w(F0.thumbs, 320, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if (!(w2 instanceof TLRPC.TL_photoSizeEmpty) && w2 != null) {
                ImageReceiver imageReceiver = kb0Var.getImageReceiver();
                if (w == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                imageReceiver.G0 = z3;
                ImageReceiver imageReceiver2 = kb0Var.getImageReceiver();
                if (w == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                imageReceiver2.H0 = z4;
                kb0Var.setVisibility(0);
                if (k27Var.I1 != null) {
                    kb0Var.k(gl5.c(w, F0), "40_40", null, null, k27Var.I1, null, 1, k27Var);
                } else {
                    kb0Var.g(1, 0L, gl5.c(w, F0), gl5.c(w2, F0), k27Var, "40_40", "40_40_b", null);
                }
            } else {
                kb0Var.setVisibility(4);
                kb0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (k27Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = gl.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, wjbVar);
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
            kb0Var.setVisibility(4);
            kb0Var.setImageBitmap(null);
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
            imageView.setImageResource(gl.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        kb0 kb0Var = this.b;
        if (str4 == null) {
            if (i != 0) {
                fm2 M = bkb.M(gl.L(42.0f), i);
                if (i == 2131231076) {
                    i2 = bkb.ma;
                    i3 = bkb.ha;
                } else if (i == 2131231073) {
                    i2 = bkb.ka;
                    i3 = bkb.ha;
                } else if (i == 2131231075) {
                    i2 = bkb.ja;
                    i3 = bkb.ha;
                } else if (i == 2131231074) {
                    i2 = bkb.ia;
                    i3 = bkb.ha;
                } else {
                    i2 = bkb.qj;
                    i3 = bkb.pj;
                }
                wjb wjbVar = this.M;
                bkb.z1(M, bkb.v0(i2, wjbVar), false);
                bkb.z1(M, bkb.v0(i3, wjbVar), true);
                kb0Var.setImageDrawable(M);
            } else {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    kb0Var.setImageBitmap(null);
                    kb0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
        } else if (b != 3) {
            kb0Var.o(str4, "42_42", null);
        }
        kb0Var.setVisibility(0);
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
        int measuredWidth = (getMeasuredWidth() - gl.L(12.0f)) - bkb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - bkb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (bkb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (bkb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = bkb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, bkb.Y0.getIntrinsicHeight() + measuredHeight);
        bkb.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String y;
        k27 k27Var = this.F;
        if (k27Var != null && k27Var.F0() != null) {
            k27 k27Var2 = this.F;
            long j = k27Var2.k.date * 1000;
            long j2 = this.O;
            if (j2 == 0) {
                y = gl.i0(k27Var2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                y = tb4.y(gl.i0(j2, false, false), " / ", gl.i0(this.F.F0().size, false, false));
            }
            byte b = this.I;
            fm fmVar = this.e;
            if (b == 2) {
                fmVar.setText(new SpannableStringBuilder().append((CharSequence) y).append(' ').append((CharSequence) this.J).append(' ').append(af4.c(this.F, true, 2, fmVar.getPaint())));
                this.r.setText(k96.e1(this.F.k.date));
                return;
            }
            String a0 = k96.a0("formatDateAtTime", null, 2131742520, k96.D0().B0().format(new Date(j)), k96.D0().o0().format(new Date(j)));
            fmVar.setText(y + ", " + a0);
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
            transitionSet.setInterpolator((TimeInterpolator) s33.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        k27 k27Var = this.F;
        float f4 = 72.0f;
        int i2 = this.y;
        j26 j26Var = this.h;
        ry8 ry8Var = this.f;
        float f5 = 8.0f;
        fm fmVar = this.e;
        if (k27Var != null && k27Var.k.media != null) {
            this.H = false;
            if (!k27Var.y0 && !k27Var.z0 && this.w) {
                String r = ba4.r(null, k27Var.F0());
                up3.q(i2).a(r, this.F, this);
                this.G = ba4.G(i2).S(r);
                ry8Var.setVisibility(0);
                int i3 = 15;
                if (this.G) {
                    i = 15;
                } else {
                    i = 0;
                }
                oy8 oy8Var = this.L;
                oy8Var.K(i);
                oy8Var.h = true;
                if (z) {
                    ry8Var.d();
                } else {
                    if (!this.G) {
                        i3 = 0;
                    }
                    oy8Var.H(i3);
                    ry8Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
                if (layoutParams != null) {
                    if (k96.a0) {
                        f3 = 8.0f;
                    } else {
                        f3 = 86.0f;
                    }
                    layoutParams.leftMargin = gl.L(f3);
                    if (k96.a0) {
                        f5 = 86.0f;
                    }
                    layoutParams.rightMargin = gl.L(f5);
                    fmVar.requestLayout();
                }
                if (this.G) {
                    j26Var.setVisibility(0);
                    Float s = fl5.z().s(r);
                    if (s == null) {
                        s = Float.valueOf(0.0f);
                    }
                    j26Var.a(false, s.floatValue());
                    return;
                }
                j26Var.setVisibility(4);
                return;
            }
            ry8Var.setVisibility(4);
            j26Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
            if (layoutParams2 != null) {
                if (k96.a0) {
                    f2 = 8.0f;
                } else {
                    f2 = 72.0f;
                }
                layoutParams2.leftMargin = gl.L(f2);
                if (!k96.a0) {
                    f4 = 8.0f;
                }
                layoutParams2.rightMargin = gl.L(f4);
                fmVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            up3.q(i2).v(this);
            return;
        }
        this.G = false;
        this.H = true;
        j26Var.setVisibility(4);
        j26Var.a(false, 0.0f);
        ry8Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
        if (layoutParams3 != null) {
            if (k96.a0) {
                f = 8.0f;
            } else {
                f = 72.0f;
            }
            layoutParams3.leftMargin = gl.L(f);
            if (!k96.a0) {
                f4 = 8.0f;
            }
            layoutParams3.rightMargin = gl.L(f4);
            fmVar.requestLayout();
        }
        up3.q(i2).v(this);
    }

    public be0 getImageView() {
        return this.b;
    }

    public k27 getMessage() {
        return this.F;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j, long j2) {
        j26 j26Var = this.h;
        if (j26Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        j26Var.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
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
        up3.q(this.y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.n;
        if (wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(wf2Var.a.q);
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
                int measuredHeight = textView.getMeasuredHeight() - gl.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = de9.w(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                fm fmVar = this.e;
                fmVar.layout(fmVar.getLeft(), fmVar.getTop() + measuredHeight, fmVar.getRight(), fmVar.getBottom() + measuredHeight);
                ry8 ry8Var = this.f;
                ry8Var.layout(ry8Var.getLeft(), ry8Var.getTop() + measuredHeight, ry8Var.getRight(), ry8Var.getBottom() + measuredHeight);
                j26 j26Var = this.h;
                j26Var.layout(j26Var.getLeft(), (getMeasuredHeight() - j26Var.getMeasuredHeight()) - (this.x ? 1 : 0), j26Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.x ? 1 : 0), 1073741824));
        } else if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
            int measuredHeight = this.c.getMeasuredHeight() + gl.L(34.0f) + (this.x ? 1 : 0);
            if (this.K != null && (textView = this.s) != null && this.F.r2()) {
                this.R = true;
                textView.setText(gl.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.R = false;
                measuredHeight = de9.w(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setGlobalGradientView(pi4 pi4Var) {
        this.N = pi4Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        kb0 kb0Var = this.b;
        if (endsWith) {
            kb0Var.o("vthumb://0:".concat(str), null, null);
            kb0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            kb0Var.setVisibility(8);
        } else {
            kb0Var.o("thumb://0:".concat(str), null, null);
            kb0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(jm6 jm6Var) {
        String str = jm6Var.c;
        long j = jm6Var.H;
        int i = jm6Var.G;
        int i2 = jm6Var.F;
        int i3 = jm6Var.C;
        String str2 = jm6Var.I;
        kb0 kb0Var = this.b;
        if (str != null) {
            kb0Var.o(str, null, bkb.Q4);
            str2 = jm6Var.c;
        } else if (str2 != null) {
            if (jm6Var.b) {
                kb0Var.q();
                kb0Var.o("vthumb://" + i3 + ":" + str2, null, bkb.Q4);
            } else {
                kb0Var.r(jm6Var.J, jm6Var.K, true);
                kb0Var.o("thumb://" + i3 + ":" + str2, null, bkb.Q4);
            }
        } else {
            kb0Var.setImageDrawable(bkb.Q4);
            str2 = "";
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        ba4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (jm6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gl.g0(jm6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gl.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(k96.D0().y0().format(jm6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(bkb.v0(bkb.yi, this.M));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
