package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class woa extends n9c {
    public soa e;
    public voa f;
    public voa[] h = new voa[0];
    public String[] n = new String[0];
    public final roa r = new roa(this, (byte) 0);
    public boolean s;
    public LinearLayout w;

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        LinearLayout linearLayout = this.w;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(hl.L(21.0f), hl.L(16.0f), hl.L(21.0f), hl.L(13.0f));
            FrameLayout c0 = c0(2131232769, ob6.M0(2131744974, null), ob6.M0(2131744975, null));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            int i = aob.q6;
            int v0 = aob.v0(i, getResourceProvider());
            textView.setTextColor(v0);
            SpannableStringBuilder append = new SpannableStringBuilder(ob6.M0(2131744968, null)).append((CharSequence) " >");
            wm2 wm2Var = new wm2(2131232064, 0);
            wm2Var.a(i);
            wm2Var.c(hl.L(16.0f));
            wm2Var.F = hl.L(10.0f);
            wm2Var.r = -hl.L(4.5f);
            wm2Var.s = hl.L(1.0f);
            append.setSpan(wm2Var, append.length() - 1, append.length(), 33);
            textView.setText(append);
            textView.setPadding(hl.L(6.75f), hl.L(3.0f), hl.L(5.0f), hl.L(3.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(hl.L(8.0f));
            textView.setBackground(new RippleDrawable(ColorStateList.valueOf(aob.p1(0.14f, v0)), null, gradientDrawable));
            textView.setOnClickListener(new toa(this, (byte) 1));
            ((LinearLayout) c0.getChildAt(1)).addView(textView, tre.s(-2, -2, 3, -6.75f, -1.0f, 0.0f, 0.0f));
            linearLayout.addView(c0(2131232770, ob6.M0(2131744957, null), ob6.M0(2131744976, null)));
            linearLayout.addView(c0(2131232768, ob6.M0(2131744989, null), ob6.M0(2131744977, null)), tre.k(0.0f, 16.0f, 0.0f, 0.0f, -1, -2));
            linearLayout.addView(c0, tre.k(0.0f, 16.0f, 0.0f, 0.0f, -1, -2));
            linearLayout.setBackgroundColor(aob.v0(aob.d6, getResourceProvider()));
            this.w = linearLayout;
        }
        arrayList.add(b8c.j(12, linearLayout));
        arrayList.add(b8c.C(null));
        b8c i2 = b8c.i(6, ob6.M0(2131744963, null));
        i2.L(uc7.e1().getBoolean("asr_live_text", true));
        arrayList.add(i2);
        arrayList.add(b8c.C(ob6.M0(2131744962, null)));
        l9cVar.V();
        bp1.o(2131744971, null, arrayList);
        voa voaVar = this.f;
        if (voaVar != null) {
            arrayList.add(b8c.j(1, voaVar));
        }
        int i3 = 0;
        while (true) {
            voa[] voaVarArr = this.h;
            if (i3 >= voaVarArr.length) {
                break;
            }
            voa voaVar2 = voaVarArr[i3];
            if (voaVar2 != null) {
                arrayList.add(b8c.j(i3 + 100, voaVar2));
            }
            i3++;
        }
        boolean l = DictationAsr.l();
        this.s = l;
        voa[] voaVarArr2 = this.h;
        if (voaVarArr2.length > 0 && voaVarArr2[voaVarArr2.length - 1] != null) {
            voa voaVar3 = voaVarArr2[voaVarArr2.length - 1];
            if (voaVar3.f != l) {
                voaVar3.f = l;
                voaVar3.requestLayout();
                voaVar3.invalidate();
            }
        }
        if (this.s) {
            b8c e = b8c.e(4, ob6.M0(2131744988, null));
            e.s = true;
            arrayList.add(e);
        }
        l9cVar.U();
        arrayList.add(b8c.C(null));
        boolean C = DictationAsr.C(this.currentAccount);
        l9cVar.V();
        arrayList.add(b8c.u(ob6.M0(2131744935, null)));
        b8c x = b8c.x(10, ob6.M0(2131744933, null));
        x.L(C);
        arrayList.add(x);
        SpannableStringBuilder append2 = new SpannableStringBuilder(ob6.M0(2131744937, null)).append((CharSequence) "  *");
        zk8 zk8Var = bl8.d().f;
        if (zk8Var != null) {
            vl vlVar = new vl(hl.L(18.0f), hl.L(18.0f), zk8Var);
            vlVar.setBounds(0, 0, hl.L(18.0f), hl.L(18.0f));
            append2.setSpan(new ImageSpan(vlVar, 2), append2.length() - 1, append2.length(), 33);
        }
        b8c x2 = b8c.x(11, append2);
        x2.L(!C);
        arrayList.add(x2);
        l9cVar.U();
        arrayList.add(b8c.C(ob6.M0(2131744934, null)));
        boolean z = f11.a;
        b8c i4 = b8c.i(8, "Show Detected Languages");
        i4.L(DictationAsr.E());
        arrayList.add(i4);
        arrayList.add(b8c.C(null));
        f0();
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131744958, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        boolean z;
        boolean z2;
        int i = b8cVar.d;
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 10) {
                            if (i == 11) {
                                z2 = false;
                            } else {
                                return;
                            }
                        } else {
                            z2 = true;
                        }
                        if (!z2 && !yac.h(this.currentAccount).p()) {
                            v21 J = d31.b0(this).J(2131624211, hl.S2(ob6.M0(2131744936, null)), ob6.M0(2131743215, null), 2750, false, new roa(this, (byte) 1));
                            z11 z11Var = J.e;
                            if (z11Var instanceof c21) {
                                ((c21) z11Var).b.setMaxLines(5);
                            }
                            J.j();
                            return;
                        } else if (z2 != DictationAsr.C(this.currentAccount)) {
                            if (yac.h(this.currentAccount).p()) {
                                uc7.e1().edit().putBoolean("asr_local_premium", z2).apply();
                            }
                            for (int i2 = 0; i2 < 4; i2++) {
                                if (yac.h(i2).o()) {
                                    jn7.f(i2).k(jn7.E1, new Object[0]);
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        uc7.e1().edit().putBoolean("asr_show_detected", !DictationAsr.E()).apply();
                    }
                } else {
                    uc7.e1().edit().putBoolean("asr_live_text", !uc7.e1().getBoolean("asr_live_text", true)).apply();
                }
            } else {
                for (int i3 = 0; i3 < 4; i3++) {
                    if (yac.h(i3).o()) {
                        if (i3 == this.currentAccount) {
                            z = true;
                        } else {
                            z = false;
                        }
                        kf7 a0 = kf7.a0(i3);
                        a0.a.c(new t87(a0, new sa((byte) 6, this, z), (byte) 15));
                    }
                }
                return;
            }
        } else {
            DictationAsr.q();
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    public final FrameLayout c0(int i, String str, String str2) {
        Activity parentActivity = getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        ImageView imageView = new ImageView(parentActivity);
        imageView.setImageResource(i);
        int i2 = aob.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(aob.v0(i2, getResourceProvider()), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, tre.d(26, 26.0f, 51, -1.0f, 5.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(aob.v0(i2, getResourceProvider()));
        textView.setText(str);
        linearLayout.addView(textView);
        p66 p66Var = new p66(parentActivity, getResourceProvider());
        p66Var.setTextSize(1, 14.0f);
        p66Var.setTextColor(aob.v0(aob.B6, getResourceProvider()));
        p66Var.setLineSpacing(hl.L(1.5f), 1.0f);
        p66Var.setText(str2);
        linearLayout.addView(p66Var, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 48, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        voa voaVar = new voa(context, null, ob6.M0(2131744990, null), false, true);
        this.f = voaVar;
        voaVar.setOnClickListener(new toa(this, (byte) 0));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.i(this.r);
        qn3.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z;
        boolean z2;
        String str;
        String[] I = DictationAsr.I();
        this.n = I;
        this.h = new voa[I.length];
        int i = 0;
        while (i < I.length) {
            nm3 N = DictationAsr.N(I[i]);
            if (i != 0 && DictationAsr.N(I[i - 1]) == N) {
                z = false;
            } else {
                z = true;
            }
            if (i < I.length - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            String t = bn3.t(I[i]);
            voa[] voaVarArr = this.h;
            String str2 = I[i];
            if (t != null) {
                str = t;
            } else {
                str = str2;
            }
            Context context2 = context;
            voa voaVar = new voa(context2, str2, str, z, z2);
            voaVarArr[i] = voaVar;
            voaVar.i0 = new kba(this, voaVar, (byte) 8);
            voaVar.setOnClickListener(new jy8(this, voaVar, (byte) 12));
            i++;
            context = context2;
        }
    }

    public final boolean e0() {
        if (hl.B(aob.v0(aob.d6, super.getResourceProvider())) < 0.5f) {
            return true;
        }
        return false;
    }

    public final void f0() {
        voa[] voaVarArr;
        voa voaVar = this.f;
        if (voaVar != null) {
            voaVar.e();
        }
        for (voa voaVar2 : this.h) {
            if (voaVar2 != null) {
                voaVar2.e();
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final vnb getResourceProvider() {
        soa soaVar = this.e;
        if (soaVar == null) {
            final vnb resourceProvider = super.getResourceProvider();
            ?? r1 = new vnb() {
                @Override
                public final boolean a() {
                    return aob.I.o();
                }

                @Override
                public final void b(float f, float f2, int i, int i2) {
                    aob.q(f, f2, i, i2);
                }

                @Override
                public final ColorFilter c() {
                    return aob.v3;
                }

                @Override
                public final Paint d(String str) {
                    return aob.T0(str);
                }

                @Override
                public final boolean e() {
                    return xea.D0;
                }

                @Override
                public final int f(int i) {
                    return h(i);
                }

                @Override
                public final boolean g() {
                    return false;
                }

                @Override
                public final Drawable getDrawable(String str) {
                    return null;
                }

                @Override
                public final int h(int i) {
                    woa woaVar = woa.this;
                    boolean e0 = woaVar.e0();
                    vnb vnbVar = resourceProvider;
                    if (e0 && i == aob.N6) {
                        return aob.v0(aob.Fi, vnbVar);
                    }
                    if (woaVar.e0() && i == aob.L6) {
                        return vm2.f(0.28f, aob.v0(aob.Fi, vnbVar), -1);
                    }
                    return aob.v0(i, vnbVar);
                }

                @Override
                public final int j(int i) {
                    return h(i);
                }

                @Override
                public final void i(int i, int i2) {
                }
            };
            this.e = r1;
            return r1;
        }
        return soaVar;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.V(this.r);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
