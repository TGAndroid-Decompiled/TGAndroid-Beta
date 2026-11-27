package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
public class vac extends FrameLayout implements fn7, snb {
    public final vnb E;
    public final rb0 F;
    public boolean G;
    public Object H;
    public CharSequence I;
    public CharSequence J;
    public int K;
    public boolean L;
    public String M;
    public String N;
    public int O;
    public TLRPC.FileLocation P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public final a82 U;
    public long V;
    public boolean W;
    public final mb0 a;
    public boolean a0;
    public final ema b;
    public boolean b0;
    public final ema c;
    public final ImageView d;
    public final og2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final ul w;
    public final ul x;
    public ImageView y;

    public vac(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f3;
        float f4;
        int i14;
        float f5;
        float f6;
        int i15;
        float f7;
        float f8;
        int i16;
        float f9;
        float f10;
        int i17;
        float f11;
        float f12;
        int i18;
        int i19;
        float f13;
        float f14;
        this.Q = yac.t0;
        this.U = new a82(this);
        this.E = vnbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            qd4.w(textView, aob.Ji, vnbVar, 1, 14.0f);
            textView.setBackground(rnb.f(aob.Fi, 14.0f));
            textView.setText(ob6.M0(2131754479, null));
            textView.setPadding(hl.L(17.0f), 0, hl.L(17.0f), 0);
            boolean z3 = ob6.a0;
            if (z3) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            int i20 = i19 | 48;
            if (z3) {
                f13 = 14.0f;
            } else {
                f13 = 0.0f;
            }
            if (z3) {
                f14 = 0.0f;
            } else {
                f14 = 14.0f;
            }
            addView(textView, tre.d(-2, 28.0f, i20, f13, 15.0f, f14, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + hl.L(48.0f)) / hl.p);
        } else {
            i3 = 0;
        }
        this.R = aob.v0(aob.y6, vnbVar);
        this.S = aob.v0(aob.Zl, vnbVar);
        this.F = new rb0((vnb) null);
        mb0 mb0Var = new mb0((byte) 10, context, this);
        this.a = mb0Var;
        mb0Var.setRoundRadius(hl.L(24.0f));
        boolean z4 = ob6.a0;
        if (z4) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i21 = i4 | 48;
        if (z4) {
            f = 0.0f;
        } else {
            f = i + 7;
        }
        if (z4) {
            f2 = i + 7;
        } else {
            f2 = 0.0f;
        }
        addView(mb0Var, tre.d(46, 46.0f, i21, f, 6.0f, f2, 0.0f));
        setClipChildren(false);
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        emaVar.setGravity(i5 | 48);
        boolean z5 = ob6.a0;
        if (z5) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i22 = i6 | 48;
        if (z5) {
            if (i2 == 2) {
                i18 = 18;
            } else {
                i18 = 0;
            }
            i7 = i18 + 28 + i3;
        } else {
            i7 = i + 64;
        }
        float f15 = i7;
        if (z5) {
            i8 = i + 64;
        } else {
            i8 = (i2 != 2 ? 0 : 18) + 28 + i3;
        }
        addView(emaVar, tre.d(-1, 20.0f, i22, f15, 10.0f, i8, 0.0f));
        this.w = new ul(hl.L(20.0f), emaVar);
        this.x = new ul(hl.L(20.0f), emaVar);
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(15);
        if (ob6.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        emaVar2.setGravity(i9 | 48);
        boolean z6 = ob6.a0;
        if (z6) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i23 = i10 | 48;
        if (z6) {
            i11 = i3 + 28;
        } else {
            i11 = i + 64;
        }
        float f16 = i11;
        if (z6) {
            i12 = i + 64;
        } else {
            i12 = i3 + 28;
        }
        addView(emaVar2, tre.d(-1, 20.0f, i23, f16, 32.0f, i12, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i24 = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i24, vnbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = ob6.a0;
        if (z7) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i25 = i13 | 16;
        if (z7) {
            f3 = 0.0f;
        } else {
            f3 = 16.0f;
        }
        if (z7) {
            f4 = 16.0f;
        } else {
            f4 = 0.0f;
        }
        addView(imageView, tre.d(-2, -2.0f, i25, f3, 0.0f, f4, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = ob6.a0;
            if (z8) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            int i26 = i17 | 16;
            if (z8) {
                f11 = 19.0f;
            } else {
                f11 = 0.0f;
            }
            if (z8) {
                f12 = 0.0f;
            } else {
                f12 = 19.0f;
            }
            addView(checkBoxSquare, tre.d(18, 18.0f, i26, f11, 0.0f, f12, 0.0f));
        } else if (i2 == 1) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.e = og2Var;
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            og2Var.b(-1, aob.d6, aob.k7);
            boolean z9 = ob6.a0;
            if (z9) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i27 = i15 | 48;
            if (z9) {
                f7 = 0.0f;
            } else {
                f7 = i + 24;
            }
            if (z9) {
                f8 = i + 24;
            } else {
                f8 = 0.0f;
            }
            addView(og2Var, tre.d(24, 24.0f, i27, f7, 36.0f, f8, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            yob.s(imageView2, aob.Fi, vnbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = ob6.a0;
            if (z10) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            int i28 = i14 | 16;
            if (z10) {
                f5 = i + 10;
            } else {
                f5 = 0.0f;
            }
            if (z10) {
                f6 = 0.0f;
            } else {
                f6 = i + 10;
            }
            addView(imageView2, tre.d(24, 24.0f, i28, f5, 0.0f, f6, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            iye.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            yob.X(textView2, aob.li, vnbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = ob6.a0;
            if (z11) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i29 = i16 | 48;
            if (z11) {
                f9 = 23.0f;
            } else {
                f9 = 0.0f;
            }
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 23.0f;
            }
            addView(textView2, tre.d(-2, -2.0f, i29, f9, 10.0f, f10, 0.0f));
        }
        setFocusable(true);
    }

    public final void a(String str, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        int i;
        int i2;
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        if (z2) {
            i = aob.ui;
        } else if (z) {
            i = aob.ti;
        } else if (z3 && TextUtils.isEmpty(str)) {
            i = aob.Fi;
        } else {
            i = aob.ce;
        }
        vnb vnbVar = this.E;
        int v0 = aob.v0(i, vnbVar);
        yob.X(textView, i, vnbVar);
        if (!z && !z2) {
            if (z3 && TextUtils.isEmpty(str)) {
                textView.setText(ob6.M0(2131754375, null));
                textView.setPadding(hl.L(6.0f), hl.L(0.66f), hl.L(6.0f), hl.L(1.0f));
                textView.setTranslationX(hl.L(6.0f));
                hf0 Y = aob.Y(aob.p1(0.12f, v0), hl.L(32.0f), hl.L(32.0f));
                uob K = yob.K(0.12f, i);
                textView.setBackground(Y);
                yob.j(textView, Y, null, K, vnbVar);
                textView.setOnClickListener(onClickListener);
            } else {
                textView.setText(str);
                textView.setPadding(0, 0, 0, 0);
                textView.setTranslationX(0.0f);
                textView.setBackground(null);
                textView.setOnClickListener(onClickListener);
            }
        } else {
            textView.setText(str);
            textView.setPadding(hl.L(6.0f), hl.L(0.66f), hl.L(6.0f), hl.L(1.0f));
            textView.setTranslationX(hl.L(6.0f));
            ShapeDrawable b0 = aob.b0(hl.L(32.0f), aob.p1(0.12f, v0));
            uob K2 = yob.K(0.12f, i);
            textView.setBackground(b0);
            yob.j(textView, b0, K2, null, vnbVar);
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z3) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (str == null && !z3) {
            h(0, false);
            return;
        }
        CharSequence text = textView.getText();
        h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.ui));
        hashSet.add(Integer.valueOf(aob.ti));
        hashSet.add(Integer.valueOf(aob.ce));
    }

    public final void b(int i, int i2) {
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        mb0 mb0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mb0Var.getLayoutParams();
        float f6 = 0.0f;
        if (ob6.a0) {
            f = 0.0f;
        } else {
            f = i + 7;
        }
        layoutParams.leftMargin = hl.L(f);
        if (ob6.a0) {
            f2 = i + 7;
        } else {
            f2 = 0.0f;
        }
        layoutParams.rightMargin = hl.L(f2);
        mb0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = ob6.a0;
        int i5 = 0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z) {
            if (checkBoxSquare != null) {
                i4 = 18;
            } else {
                i4 = 0;
            }
            i3 = i4 + 28;
        } else {
            i3 = i + 64 + i2;
        }
        layoutParams2.leftMargin = hl.L(i3);
        if (ob6.a0) {
            f3 = i + 64 + i2;
        } else {
            if (checkBoxSquare != null) {
                i5 = 18;
            }
            f3 = i5 + 28;
        }
        layoutParams2.rightMargin = hl.L(f3);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        float f7 = 28.0f;
        if (ob6.a0) {
            f4 = 28.0f;
        } else {
            f4 = i + 64 + i2;
        }
        layoutParams3.leftMargin = hl.L(f4);
        if (ob6.a0) {
            f7 = i + 64 + i2;
        }
        layoutParams3.rightMargin = hl.L(f7);
        og2 og2Var = this.e;
        if (og2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) og2Var.getLayoutParams();
            if (ob6.a0) {
                f5 = 0.0f;
            } else {
                f5 = i + 32 + i2;
            }
            layoutParams4.leftMargin = hl.L(f5);
            if (ob6.a0) {
                f6 = i + 32 + i2;
            }
            layoutParams4.rightMargin = hl.L(f6);
        }
    }

    public final void c(boolean z, boolean z2) {
        int i = 0;
        og2 og2Var = this.e;
        if (og2Var != null) {
            if (og2Var.getVisibility() != 0) {
                og2Var.setVisibility(0);
            }
            og2Var.a(z, z2);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z, z2);
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ema emaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            emaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && emaVar != null) {
            try {
                charSequence = pv3.m(charSequence, emaVar.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.I = charSequence;
        this.G = !(obj instanceof String);
        this.H = obj;
        this.T = z;
        setWillNotDraw(!z);
        i(0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            this.b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            br3.a(canvas, aob.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(vp7 vp7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object X1;
        boolean z2 = vp7Var.e;
        int i = this.Q;
        if (z2) {
            if (vp7Var.c <= 0) {
                if (vp7Var.f) {
                    M0 = ob6.M0(2131747767, null);
                } else {
                    M0 = ob6.M0(2131747768, null);
                }
            } else {
                M0 = ob6.M0(2131747772, null);
            }
        } else {
            boolean z3 = vp7Var.b;
            int i2 = vp7Var.c;
            int i3 = vp7Var.a;
            int i4 = 2131747583;
            if (i2 == 3 && i3 != Integer.MAX_VALUE) {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                if (currentTime <= 0) {
                    if (z3) {
                        M0 = ob6.M0(2131747645, null);
                    } else {
                        M0 = ob6.M0(2131747583, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i2 == 0 || i2 == 1) {
                    if (z3) {
                        M0 = ob6.M0(2131747645, null);
                    }
                } else {
                    i4 = 2131747628;
                }
                M0 = ob6.M0(i4, null);
            }
            if (M0 == null) {
                M0 = ob6.M0(2131747621, null);
            }
            if (vp7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (wf3.B(vp7Var.d)) {
            TLRPC.EncryptedChat a1 = uc7.s1(i).a1(Integer.valueOf((int) (vp7Var.d & 4294967295L)));
            if (a1 != null && (X1 = uc7.s1(i).X1(Long.valueOf(a1.user_id))) != null) {
                d(X1, charSequence, M0, false);
            }
        } else if (wf3.D(vp7Var.d)) {
            Object X12 = uc7.s1(i).X1(Long.valueOf(vp7Var.d));
            if (X12 != null) {
                d(X12, charSequence, M0, z);
            }
        } else {
            Object M02 = uc7.s1(i).M0(Long.valueOf(-vp7Var.d));
            if (M02 != null) {
                d(M02, charSequence, M0, z);
            }
        }
    }

    public final void g(int i, b8c b8cVar, boolean z) {
        CharSequence M0;
        CharSequence M02;
        long j = b8cVar.y;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            String p = lbc.p(X1);
            if (X1 != null) {
                if (!TextUtils.isEmpty(p)) {
                    M02 = c00.i("@", p);
                } else if (X1.bot) {
                    M02 = ob6.M0(2131753149, null);
                } else if (X1.contact) {
                    M02 = ob6.M0(2131750757, null);
                } else {
                    M02 = ob6.M0(2131750684, null);
                }
                d(X1, null, M02, z);
                return;
            }
            return;
        }
        TLRPC.Chat M03 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M03 != null) {
            if (M03.participants_count != 0) {
                boolean V = xc2.V(M03);
                int i2 = M03.participants_count;
                if (V) {
                    M0 = ob6.H(',', "Subscribers", i2);
                } else {
                    M0 = ob6.H(',', "Members", i2);
                }
            } else if (!xc2.t0(M03)) {
                if (xc2.T(M03) && !M03.megagroup) {
                    M0 = ob6.M0(2131752299, null);
                } else {
                    M0 = ob6.M0(2131748395, null);
                }
            } else if (xc2.T(M03) && !M03.megagroup) {
                M0 = ob6.M0(2131752288, null);
            } else {
                M0 = ob6.M0(2131748392, null);
            }
            d(M03, null, M0, z);
        }
    }

    public Object getCurrentObject() {
        return this.H;
    }

    public long getDialogId() {
        return this.V;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i > 0) {
            i += hl.L(6.0f);
        }
        if (ob6.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (ob6.a0) {
                i4 = i;
                i = 0;
            } else {
                i4 = 0;
            }
            this.c.setPadding(i4, 0, i, 0);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vac.i(int):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
        this.x.a();
        this.w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(68.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            og2 og2Var = this.e;
            if (og2Var != null && og2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(og2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb = new StringBuilder();
        ema emaVar = this.b;
        if (emaVar != null) {
            CharSequence text = emaVar.getText();
            if (!TextUtils.isEmpty(text)) {
                sb.append(text);
            }
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text2);
            }
        }
        ema emaVar2 = this.c;
        if (emaVar2 != null) {
            CharSequence text3 = emaVar2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text3);
            }
        }
        if (sb.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.a0) {
            f = 56.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f) + (this.T ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z) {
        int i;
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setAvatarPadding(int i) {
        b(i, 0);
    }

    public void setCallCellStyle(int i) {
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        float f4;
        float f5;
        float f6;
        this.a0 = true;
        ema emaVar = this.b;
        emaVar.setTextSize(15);
        boolean z = ob6.a0;
        int i5 = 3;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i6 = i2 | 48;
        float f7 = 30.0f;
        if (z) {
            f = 30.0f;
        } else {
            f = i + 66;
        }
        if (z) {
            f2 = i + 66;
        } else {
            f2 = 30.0f;
        }
        emaVar.setLayoutParams(tre.d(-1, 20.0f, i6, f, 10.0f, f2, 0.0f));
        ema emaVar2 = this.c;
        emaVar2.setTextSize(13);
        boolean z2 = ob6.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i7 = i3 | 48;
        if (z2) {
            f3 = 30.0f;
        } else {
            f3 = i + 66;
        }
        if (z2) {
            f7 = i + 66;
        }
        emaVar2.setLayoutParams(tre.d(-1, 20.0f, i7, f3, 32.0f, f7, 0.0f));
        int L = hl.L(22.0f);
        mb0 mb0Var = this.a;
        mb0Var.setRoundRadius(L);
        boolean z3 = ob6.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i8 = i4 | 48;
        float f8 = 0.0f;
        if (z3) {
            f4 = 0.0f;
        } else {
            f4 = i + 8;
        }
        if (z3) {
            f5 = i + 8;
        } else {
            f5 = 0.0f;
        }
        mb0Var.setLayoutParams(tre.d(44, 44.0f, i8, f4, 6.0f, f5, 0.0f));
        og2 og2Var = this.e;
        if (og2Var != null) {
            boolean z4 = ob6.a0;
            if (z4) {
                i5 = 5;
            }
            int i9 = i5 | 48;
            if (z4) {
                f6 = 0.0f;
            } else {
                f6 = i + 37;
            }
            if (z4) {
                f8 = i + 37;
            }
            og2Var.setLayoutParams(tre.d(24, 24.0f, i9, f6, 32.0f, f8, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f;
        float f2;
        ImageView imageView = this.y;
        if (onClickListener == null) {
            if (imageView != null) {
                removeView(imageView);
                this.y = null;
                return;
            }
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            iye.a(this.y);
            this.y.setImageResource(2131231272);
            ImageView imageView3 = this.y;
            int i = aob.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            vnb vnbVar = this.E;
            yob.s(imageView3, i, vnbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = aob.i6;
            int i3 = 5;
            yob.R(imageView4, aob.f0(aob.v0(i2, vnbVar), 5, -1), null, yob.M(i2), vnbVar);
            ImageView imageView5 = this.y;
            boolean z = ob6.a0;
            if (z) {
                i3 = 3;
            }
            int i4 = i3 | 16;
            if (z) {
                f = 14.0f;
            } else {
                f = 0.0f;
            }
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 14.0f;
            }
            addView(imageView5, tre.d(30, 30.0f, i4, f, 0.0f, f2, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i) {
        this.K = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.M = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z) {
        this.L = z;
    }

    @Override
    public final void updateColors() {
        try {
            int i = this.R;
            int i2 = this.S;
            vnb vnbVar = this.E;
            if (!this.b0) {
                this.R = aob.v0(aob.y6, vnbVar);
                this.S = aob.v0(aob.Zl, vnbVar);
            }
            ema emaVar = this.c;
            if (emaVar != null) {
                int textColor = emaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    emaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    emaVar.setTextColor(this.R);
                }
            }
            mb0 mb0Var = this.a;
            if (mb0Var != null) {
                mb0Var.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public vac(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
