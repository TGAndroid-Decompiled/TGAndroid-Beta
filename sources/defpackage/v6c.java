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
public class v6c extends FrameLayout implements gk7, tjb {
    public final wjb E;
    public final pb0 F;
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
    public final j72 U;
    public long V;
    public boolean W;
    public final kb0 a;
    public boolean a0;
    public final jia b;
    public boolean b0;
    public final jia c;
    public final ImageView d;
    public final wf2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final tl w;
    public final tl x;
    public ImageView y;

    public v6c(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
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
        this.Q = y6c.t0;
        this.U = new j72(this);
        this.E = wjbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            tb4.w(textView, bkb.Ii, wjbVar, 1, 14.0f);
            textView.setBackground(sjb.f(bkb.Ei, 14.0f));
            textView.setText(k96.M0(2131754483, null));
            textView.setPadding(gl.L(17.0f), 0, gl.L(17.0f), 0);
            boolean z3 = k96.a0;
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
            addView(textView, nme.d(-2, 28.0f, i20, f13, 15.0f, f14, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + gl.L(48.0f)) / gl.p);
        } else {
            i3 = 0;
        }
        this.R = bkb.v0(bkb.x6, wjbVar);
        this.S = bkb.v0(bkb.Yl, wjbVar);
        this.F = new pb0((wjb) null);
        kb0 kb0Var = new kb0((byte) 10, context, this);
        this.a = kb0Var;
        kb0Var.setRoundRadius(gl.L(24.0f));
        boolean z4 = k96.a0;
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
        addView(kb0Var, nme.d(46, 46.0f, i21, f, 6.0f, f2, 0.0f));
        setClipChildren(false);
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        jiaVar.setGravity(i5 | 48);
        boolean z5 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i22, f15, 10.0f, i8, 0.0f));
        this.w = new tl(gl.L(20.0f), jiaVar);
        this.x = new tl(gl.L(20.0f), jiaVar);
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(15);
        if (k96.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        jiaVar2.setGravity(i9 | 48);
        boolean z6 = k96.a0;
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
        addView(jiaVar2, nme.d(-1, 20.0f, i23, f16, 32.0f, i12, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i24 = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i24, wjbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = k96.a0;
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
        addView(imageView, nme.d(-2, -2.0f, i25, f3, 0.0f, f4, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = k96.a0;
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
            addView(checkBoxSquare, nme.d(18, 18.0f, i26, f11, 0.0f, f12, 0.0f));
        } else if (i2 == 1) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.e = wf2Var;
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            wf2Var.b(-1, bkb.c6, bkb.j7);
            boolean z9 = k96.a0;
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
            addView(wf2Var, nme.d(24, 24.0f, i27, f7, 36.0f, f8, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            zkb.s(imageView2, bkb.Ei, wjbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = k96.a0;
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
            addView(imageView2, nme.d(24, 24.0f, i28, f5, 0.0f, f6, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            ote.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            zkb.X(textView2, bkb.ki, wjbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = k96.a0;
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
            addView(textView2, nme.d(-2, -2.0f, i29, f9, 10.0f, f10, 0.0f));
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
            i = bkb.ti;
        } else if (z) {
            i = bkb.si;
        } else if (z3 && TextUtils.isEmpty(str)) {
            i = bkb.Ei;
        } else {
            i = bkb.be;
        }
        wjb wjbVar = this.E;
        int v0 = bkb.v0(i, wjbVar);
        zkb.X(textView, i, wjbVar);
        if (!z && !z2) {
            if (z3 && TextUtils.isEmpty(str)) {
                textView.setText(k96.M0(2131754379, null));
                textView.setPadding(gl.L(6.0f), gl.L(0.66f), gl.L(6.0f), gl.L(1.0f));
                textView.setTranslationX(gl.L(6.0f));
                ff0 Y = bkb.Y(bkb.p1(0.12f, v0), gl.L(32.0f), gl.L(32.0f));
                vkb K = zkb.K(0.12f, i);
                textView.setBackground(Y);
                zkb.j(textView, Y, null, K, wjbVar);
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
            textView.setPadding(gl.L(6.0f), gl.L(0.66f), gl.L(6.0f), gl.L(1.0f));
            textView.setTranslationX(gl.L(6.0f));
            ShapeDrawable b0 = bkb.b0(gl.L(32.0f), bkb.p1(0.12f, v0));
            vkb K2 = zkb.K(0.12f, i);
            textView.setBackground(b0);
            zkb.j(textView, b0, K2, null, wjbVar);
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
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.ti));
        hashSet.add(Integer.valueOf(bkb.si));
        hashSet.add(Integer.valueOf(bkb.be));
    }

    public final void b(int i, int i2) {
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        kb0 kb0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kb0Var.getLayoutParams();
        float f6 = 0.0f;
        if (k96.a0) {
            f = 0.0f;
        } else {
            f = i + 7;
        }
        layoutParams.leftMargin = gl.L(f);
        if (k96.a0) {
            f2 = i + 7;
        } else {
            f2 = 0.0f;
        }
        layoutParams.rightMargin = gl.L(f2);
        kb0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = k96.a0;
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
        layoutParams2.leftMargin = gl.L(i3);
        if (k96.a0) {
            f3 = i + 64 + i2;
        } else {
            if (checkBoxSquare != null) {
                i5 = 18;
            }
            f3 = i5 + 28;
        }
        layoutParams2.rightMargin = gl.L(f3);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        float f7 = 28.0f;
        if (k96.a0) {
            f4 = 28.0f;
        } else {
            f4 = i + 64 + i2;
        }
        layoutParams3.leftMargin = gl.L(f4);
        if (k96.a0) {
            f7 = i + 64 + i2;
        }
        layoutParams3.rightMargin = gl.L(f7);
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wf2Var.getLayoutParams();
            if (k96.a0) {
                f5 = 0.0f;
            } else {
                f5 = i + 32 + i2;
            }
            layoutParams4.leftMargin = gl.L(f5);
            if (k96.a0) {
                f6 = i + 32 + i2;
            }
            layoutParams4.rightMargin = gl.L(f6);
        }
    }

    public final void c(boolean z, boolean z2) {
        int i = 0;
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            if (wf2Var.getVisibility() != 0) {
                wf2Var.setVisibility(0);
            }
            wf2Var.a(z, z2);
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
        jia jiaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            jiaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && jiaVar != null) {
            try {
                charSequence = vu3.m(charSequence, jiaVar.getPaint().getFontMetricsInt(), false, null, 0);
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
        if (i == kk7.k4) {
            this.b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            kq3.a(canvas, bkb.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(vm7 vm7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object V1;
        boolean z2 = vm7Var.e;
        int i = this.Q;
        if (z2) {
            if (vm7Var.c <= 0) {
                if (vm7Var.f) {
                    M0 = k96.M0(2131747847, null);
                } else {
                    M0 = k96.M0(2131747848, null);
                }
            } else {
                M0 = k96.M0(2131747852, null);
            }
        } else {
            boolean z3 = vm7Var.b;
            int i2 = vm7Var.c;
            int i3 = vm7Var.a;
            int i4 = 2131747663;
            if (i2 == 3 && i3 != Integer.MAX_VALUE) {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                if (currentTime <= 0) {
                    if (z3) {
                        M0 = k96.M0(2131747725, null);
                    } else {
                        M0 = k96.M0(2131747663, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = k96.a0("WillUnmuteIn", null, 2131742602, k96.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = k96.a0("WillUnmuteIn", null, 2131742602, k96.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = k96.a0("WillUnmuteIn", null, 2131742602, k96.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i2 == 0 || i2 == 1) {
                    if (z3) {
                        M0 = k96.M0(2131747725, null);
                    }
                } else {
                    i4 = 2131747708;
                }
                M0 = k96.M0(i4, null);
            }
            if (M0 == null) {
                M0 = k96.M0(2131747701, null);
            }
            if (vm7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (cf3.B(vm7Var.d)) {
            TLRPC.EncryptedChat Y0 = na7.q1(i).Y0(Integer.valueOf((int) (vm7Var.d & 4294967295L)));
            if (Y0 != null && (V1 = na7.q1(i).V1(Long.valueOf(Y0.user_id))) != null) {
                d(V1, charSequence, M0, false);
            }
        } else if (cf3.D(vm7Var.d)) {
            Object V12 = na7.q1(i).V1(Long.valueOf(vm7Var.d));
            if (V12 != null) {
                d(V12, charSequence, M0, z);
            }
        } else {
            Object K0 = na7.q1(i).K0(Long.valueOf(-vm7Var.d));
            if (K0 != null) {
                d(K0, charSequence, M0, z);
            }
        }
    }

    public final void g(int i, c4c c4cVar, boolean z) {
        CharSequence M0;
        CharSequence M02;
        long j = c4cVar.y;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            String p = l7c.p(V1);
            if (V1 != null) {
                if (!TextUtils.isEmpty(p)) {
                    M02 = b00.h("@", p);
                } else if (V1.bot) {
                    M02 = k96.M0(2131753153, null);
                } else if (V1.contact) {
                    M02 = k96.M0(2131750780, null);
                } else {
                    M02 = k96.M0(2131750707, null);
                }
                d(V1, null, M02, z);
                return;
            }
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        if (K0 != null) {
            if (K0.participants_count != 0) {
                boolean V = hc2.V(K0);
                int i2 = K0.participants_count;
                if (V) {
                    M0 = k96.H(',', "Subscribers", i2);
                } else {
                    M0 = k96.H(',', "Members", i2);
                }
            } else if (!hc2.t0(K0)) {
                if (hc2.T(K0) && !K0.megagroup) {
                    M0 = k96.M0(2131752317, null);
                } else {
                    M0 = k96.M0(2131748449, null);
                }
            } else if (hc2.T(K0) && !K0.megagroup) {
                M0 = k96.M0(2131752306, null);
            } else {
                M0 = k96.M0(2131748446, null);
            }
            d(K0, null, M0, z);
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
            i += gl.L(6.0f);
        }
        if (k96.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (k96.a0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6c.i(int):void");
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
        kk7.e().b(this, kk7.k4);
        this.x.a();
        this.w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(68.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
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
            wf2 wf2Var = this.e;
            if (wf2Var != null && wf2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(wf2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb = new StringBuilder();
        jia jiaVar = this.b;
        if (jiaVar != null) {
            CharSequence text = jiaVar.getText();
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
        jia jiaVar2 = this.c;
        if (jiaVar2 != null) {
            CharSequence text3 = jiaVar2.getText();
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f) + (this.T ? 1 : 0), 1073741824));
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
        jia jiaVar = this.b;
        jiaVar.setTextSize(15);
        boolean z = k96.a0;
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
        jiaVar.setLayoutParams(nme.d(-1, 20.0f, i6, f, 10.0f, f2, 0.0f));
        jia jiaVar2 = this.c;
        jiaVar2.setTextSize(13);
        boolean z2 = k96.a0;
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
        jiaVar2.setLayoutParams(nme.d(-1, 20.0f, i7, f3, 32.0f, f7, 0.0f));
        int L = gl.L(22.0f);
        kb0 kb0Var = this.a;
        kb0Var.setRoundRadius(L);
        boolean z3 = k96.a0;
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
        kb0Var.setLayoutParams(nme.d(44, 44.0f, i8, f4, 6.0f, f5, 0.0f));
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            boolean z4 = k96.a0;
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
            wf2Var.setLayoutParams(nme.d(24, 24.0f, i9, f6, 32.0f, f8, 0.0f));
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
            ote.a(this.y);
            this.y.setImageResource(2131231272);
            ImageView imageView3 = this.y;
            int i = bkb.z6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            wjb wjbVar = this.E;
            zkb.s(imageView3, i, wjbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = bkb.h6;
            int i3 = 5;
            zkb.R(imageView4, bkb.f0(bkb.v0(i2, wjbVar), 5, -1), null, zkb.M(i2), wjbVar);
            ImageView imageView5 = this.y;
            boolean z = k96.a0;
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
            addView(imageView5, nme.d(30, 30.0f, i4, f, 0.0f, f2, 0.0f));
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
            wjb wjbVar = this.E;
            if (!this.b0) {
                this.R = bkb.v0(bkb.x6, wjbVar);
                this.S = bkb.v0(bkb.Yl, wjbVar);
            }
            jia jiaVar = this.c;
            if (jiaVar != null) {
                int textColor = jiaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    jiaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    jiaVar.setTextColor(this.R);
                }
            }
            kb0 kb0Var = this.a;
            if (kb0Var != null) {
                kb0Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public v6c(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
