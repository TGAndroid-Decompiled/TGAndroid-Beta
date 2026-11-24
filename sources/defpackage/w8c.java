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
public class w8c extends FrameLayout implements jm7, vlb {
    public final ylb E;
    public final pc0 F;
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
    public final u82 U;
    public long V;
    public boolean W;
    public final kc0 a;
    public boolean a0;
    public final lka b;
    public boolean b0;
    public final lka c;
    public final ImageView d;
    public final jh2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final tm w;
    public final tm x;
    public ImageView y;

    public w8c(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
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
        this.Q = z8c.t0;
        this.U = new u82(this);
        this.E = ylbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            td4.x(textView, cmb.Ii, ylbVar, 1, 14.0f);
            textView.setBackground(ulb.f(cmb.Ei, 14.0f));
            textView.setText(jb6.M0(2131754483, null));
            textView.setPadding(gm.L(17.0f), 0, gm.L(17.0f), 0);
            boolean z3 = jb6.a0;
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
            addView(textView, qoe.d(-2, 28.0f, i20, f13, 15.0f, f14, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + gm.L(48.0f)) / gm.p);
        } else {
            i3 = 0;
        }
        this.R = cmb.v0(cmb.x6, ylbVar);
        this.S = cmb.v0(cmb.Yl, ylbVar);
        this.F = new pc0((ylb) null);
        kc0 kc0Var = new kc0((byte) 10, context, this);
        this.a = kc0Var;
        kc0Var.setRoundRadius(gm.L(24.0f));
        boolean z4 = jb6.a0;
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
        addView(kc0Var, qoe.d(46, 46.0f, i21, f, 6.0f, f2, 0.0f));
        setClipChildren(false);
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        lkaVar.setGravity(i5 | 48);
        boolean z5 = jb6.a0;
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
        addView(lkaVar, qoe.d(-1, 20.0f, i22, f15, 10.0f, i8, 0.0f));
        this.w = new tm(gm.L(20.0f), lkaVar);
        this.x = new tm(gm.L(20.0f), lkaVar);
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(15);
        if (jb6.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        lkaVar2.setGravity(i9 | 48);
        boolean z6 = jb6.a0;
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
        addView(lkaVar2, qoe.d(-1, 20.0f, i23, f16, 32.0f, i12, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i24 = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i24, ylbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = jb6.a0;
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
        addView(imageView, qoe.d(-2, -2.0f, i25, f3, 0.0f, f4, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = jb6.a0;
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
            addView(checkBoxSquare, qoe.d(18, 18.0f, i26, f11, 0.0f, f12, 0.0f));
        } else if (i2 == 1) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.e = jh2Var;
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            jh2Var.b(-1, cmb.c6, cmb.j7);
            boolean z9 = jb6.a0;
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
            addView(jh2Var, qoe.d(24, 24.0f, i27, f7, 36.0f, f8, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            anb.s(imageView2, cmb.Ei, ylbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = jb6.a0;
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
            addView(imageView2, qoe.d(24, 24.0f, i28, f5, 0.0f, f6, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            rve.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            anb.X(textView2, cmb.ki, ylbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = jb6.a0;
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
            addView(textView2, qoe.d(-2, -2.0f, i29, f9, 10.0f, f10, 0.0f));
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
            i = cmb.ti;
        } else if (z) {
            i = cmb.si;
        } else if (z3 && TextUtils.isEmpty(str)) {
            i = cmb.Ei;
        } else {
            i = cmb.be;
        }
        ylb ylbVar = this.E;
        int v0 = cmb.v0(i, ylbVar);
        anb.X(textView, i, ylbVar);
        if (!z && !z2) {
            if (z3 && TextUtils.isEmpty(str)) {
                textView.setText(jb6.M0(2131754379, null));
                textView.setPadding(gm.L(6.0f), gm.L(0.66f), gm.L(6.0f), gm.L(1.0f));
                textView.setTranslationX(gm.L(6.0f));
                fg0 Y = cmb.Y(cmb.p1(0.12f, v0), gm.L(32.0f), gm.L(32.0f));
                wmb K = anb.K(0.12f, i);
                textView.setBackground(Y);
                anb.j(textView, Y, null, K, ylbVar);
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
            textView.setPadding(gm.L(6.0f), gm.L(0.66f), gm.L(6.0f), gm.L(1.0f));
            textView.setTranslationX(gm.L(6.0f));
            ShapeDrawable b0 = cmb.b0(gm.L(32.0f), cmb.p1(0.12f, v0));
            wmb K2 = anb.K(0.12f, i);
            textView.setBackground(b0);
            anb.j(textView, b0, K2, null, ylbVar);
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
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.ti));
        hashSet.add(Integer.valueOf(cmb.si));
        hashSet.add(Integer.valueOf(cmb.be));
    }

    public final void b(int i, int i2) {
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        kc0 kc0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kc0Var.getLayoutParams();
        float f6 = 0.0f;
        if (jb6.a0) {
            f = 0.0f;
        } else {
            f = i + 7;
        }
        layoutParams.leftMargin = gm.L(f);
        if (jb6.a0) {
            f2 = i + 7;
        } else {
            f2 = 0.0f;
        }
        layoutParams.rightMargin = gm.L(f2);
        kc0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = jb6.a0;
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
        layoutParams2.leftMargin = gm.L(i3);
        if (jb6.a0) {
            f3 = i + 64 + i2;
        } else {
            if (checkBoxSquare != null) {
                i5 = 18;
            }
            f3 = i5 + 28;
        }
        layoutParams2.rightMargin = gm.L(f3);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        float f7 = 28.0f;
        if (jb6.a0) {
            f4 = 28.0f;
        } else {
            f4 = i + 64 + i2;
        }
        layoutParams3.leftMargin = gm.L(f4);
        if (jb6.a0) {
            f7 = i + 64 + i2;
        }
        layoutParams3.rightMargin = gm.L(f7);
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jh2Var.getLayoutParams();
            if (jb6.a0) {
                f5 = 0.0f;
            } else {
                f5 = i + 32 + i2;
            }
            layoutParams4.leftMargin = gm.L(f5);
            if (jb6.a0) {
                f6 = i + 32 + i2;
            }
            layoutParams4.rightMargin = gm.L(f6);
        }
    }

    public final void c(boolean z, boolean z2) {
        int i = 0;
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            if (jh2Var.getVisibility() != 0) {
                jh2Var.setVisibility(0);
            }
            jh2Var.a(z, z2);
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
        lka lkaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            lkaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && lkaVar != null) {
            try {
                charSequence = gw3.m(charSequence, lkaVar.getPaint().getFontMetricsInt(), false, null, 0);
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
        if (i == nm7.m4) {
            this.b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            ur3.a(canvas, cmb.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(zo7 zo7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object W1;
        boolean z2 = zo7Var.e;
        int i = this.Q;
        if (z2) {
            if (zo7Var.c <= 0) {
                if (zo7Var.f) {
                    M0 = jb6.M0(2131747773, null);
                } else {
                    M0 = jb6.M0(2131747774, null);
                }
            } else {
                M0 = jb6.M0(2131747778, null);
            }
        } else {
            boolean z3 = zo7Var.b;
            int i2 = zo7Var.c;
            int i3 = zo7Var.a;
            int i4 = 2131747589;
            if (i2 == 3 && i3 != Integer.MAX_VALUE) {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                if (currentTime <= 0) {
                    if (z3) {
                        M0 = jb6.M0(2131747651, null);
                    } else {
                        M0 = jb6.M0(2131747589, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i2 == 0 || i2 == 1) {
                    if (z3) {
                        M0 = jb6.M0(2131747651, null);
                    }
                } else {
                    i4 = 2131747634;
                }
                M0 = jb6.M0(i4, null);
            }
            if (M0 == null) {
                M0 = jb6.M0(2131747627, null);
            }
            if (zo7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (pg3.B(zo7Var.d)) {
            TLRPC.EncryptedChat Z0 = oc7.r1(i).Z0(Integer.valueOf((int) (zo7Var.d & 4294967295L)));
            if (Z0 != null && (W1 = oc7.r1(i).W1(Long.valueOf(Z0.user_id))) != null) {
                d(W1, charSequence, M0, false);
            }
        } else if (pg3.D(zo7Var.d)) {
            Object W12 = oc7.r1(i).W1(Long.valueOf(zo7Var.d));
            if (W12 != null) {
                d(W12, charSequence, M0, z);
            }
        } else {
            Object L0 = oc7.r1(i).L0(Long.valueOf(-zo7Var.d));
            if (L0 != null) {
                d(L0, charSequence, M0, z);
            }
        }
    }

    public final void g(int i, c6c c6cVar, boolean z) {
        CharSequence M0;
        CharSequence M02;
        long j = c6cVar.y;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            String p = m9c.p(W1);
            if (W1 != null) {
                if (!TextUtils.isEmpty(p)) {
                    M02 = b10.h("@", p);
                } else if (W1.bot) {
                    M02 = jb6.M0(2131753121, null);
                } else if (W1.contact) {
                    M02 = jb6.M0(2131750729, null);
                } else {
                    M02 = jb6.M0(2131750656, null);
                }
                d(W1, null, M02, z);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        if (L0 != null) {
            if (L0.participants_count != 0) {
                boolean V = sd2.V(L0);
                int i2 = L0.participants_count;
                if (V) {
                    M0 = jb6.H(',', "Subscribers", i2);
                } else {
                    M0 = jb6.H(',', "Members", i2);
                }
            } else if (!sd2.t0(L0)) {
                if (sd2.T(L0) && !L0.megagroup) {
                    M0 = jb6.M0(2131752271, null);
                } else {
                    M0 = jb6.M0(2131748398, null);
                }
            } else if (sd2.T(L0) && !L0.megagroup) {
                M0 = jb6.M0(2131752260, null);
            } else {
                M0 = jb6.M0(2131748395, null);
            }
            d(L0, null, M0, z);
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
            i += gm.L(6.0f);
        }
        if (jb6.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (jb6.a0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8c.i(int):void");
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
        nm7.e().b(this, nm7.m4);
        this.x.a();
        this.w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(68.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
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
            jh2 jh2Var = this.e;
            if (jh2Var != null && jh2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(jh2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb = new StringBuilder();
        lka lkaVar = this.b;
        if (lkaVar != null) {
            CharSequence text = lkaVar.getText();
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
        lka lkaVar2 = this.c;
        if (lkaVar2 != null) {
            CharSequence text3 = lkaVar2.getText();
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f) + (this.T ? 1 : 0), 1073741824));
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
        lka lkaVar = this.b;
        lkaVar.setTextSize(15);
        boolean z = jb6.a0;
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
        lkaVar.setLayoutParams(qoe.d(-1, 20.0f, i6, f, 10.0f, f2, 0.0f));
        lka lkaVar2 = this.c;
        lkaVar2.setTextSize(13);
        boolean z2 = jb6.a0;
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
        lkaVar2.setLayoutParams(qoe.d(-1, 20.0f, i7, f3, 32.0f, f7, 0.0f));
        int L = gm.L(22.0f);
        kc0 kc0Var = this.a;
        kc0Var.setRoundRadius(L);
        boolean z3 = jb6.a0;
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
        kc0Var.setLayoutParams(qoe.d(44, 44.0f, i8, f4, 6.0f, f5, 0.0f));
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            boolean z4 = jb6.a0;
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
            jh2Var.setLayoutParams(qoe.d(24, 24.0f, i9, f6, 32.0f, f8, 0.0f));
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
            rve.a(this.y);
            this.y.setImageResource(2131231273);
            ImageView imageView3 = this.y;
            int i = cmb.z6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ylb ylbVar = this.E;
            anb.s(imageView3, i, ylbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = cmb.h6;
            int i3 = 5;
            anb.R(imageView4, cmb.f0(cmb.v0(i2, ylbVar), 5, -1), null, anb.M(i2), ylbVar);
            ImageView imageView5 = this.y;
            boolean z = jb6.a0;
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
            addView(imageView5, qoe.d(30, 30.0f, i4, f, 0.0f, f2, 0.0f));
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
            ylb ylbVar = this.E;
            if (!this.b0) {
                this.R = cmb.v0(cmb.x6, ylbVar);
                this.S = cmb.v0(cmb.Yl, ylbVar);
            }
            lka lkaVar = this.c;
            if (lkaVar != null) {
                int textColor = lkaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    lkaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    lkaVar.setTextColor(this.R);
                }
            }
            kc0 kc0Var = this.a;
            if (kc0Var != null) {
                kc0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public w8c(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
