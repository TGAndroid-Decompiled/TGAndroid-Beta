package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
public abstract class f4c extends FrameLayout implements snb {
    public final int a;
    public final long b;
    public final e c;
    public final vnb d;
    public final si e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public f4c(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(activity);
        final int currentAccount = zu1Var.getCurrentAccount();
        final long a = zu1Var.a();
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a;
        this.c = zu1Var;
        this.d = vnbVar;
        si siVar = new si(activity, true, true, false, (byte) 4);
        this.e = siVar;
        siVar.b(0.3f, 450L, k43.h);
        siVar.setTextSize(hl.L(14.0f));
        siVar.setTypeface(hl.o());
        siVar.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        siVar.setGravity(1);
        siVar.setIgnoreRTL(!ob6.a0);
        siVar.n = false;
        final as1 as1Var = (as1) this;
        siVar.setOnClickListener(new kla(as1Var, (byte) 25));
        addView(siVar, tre.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232413).mutate();
        this.f = mutate;
        mutate.setBounds(0, hl.L(-6.0f), hl.L(20.0f), hl.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232242);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a0;
                int i;
                int i2 = currentAccount;
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-a));
                boolean p = yac.h(i2).p();
                as1 as1Var2 = as1.this;
                if (!p && (M0 == null || !M0.autotranslation)) {
                    zu1 zu1Var2 = as1Var2.E;
                    i = ((e) zu1Var2).currentAccount;
                    SharedPreferences.Editor edit = uc7.s1(i).W3.edit();
                    edit.putInt("dialog_show_translate_count" + zu1Var2.a(), 140).commit();
                    zu1Var2.zd(true);
                    return;
                }
                int i3 = as1Var2.a;
                a5c a5cVar = uc7.s1(i3).i4;
                Context context = as1Var2.getContext();
                vnb vnbVar2 = as1Var2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232583, 1, vnbVar2, context);
                n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                yob.h(aob.G8, vnbVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                LinearLayout linearLayout = new LinearLayout(as1Var2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(as1Var2.getContext());
                scrollView.b = new mm(350L, (View) scrollView, k43.h);
                LinearLayout linearLayout2 = new LinearLayout(as1Var2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                b8 b8Var = new b8(0, as1Var2.d, as1Var2.getContext(), true, false);
                b8Var.j(ob6.M0(2131743608, null), 2131232413, null);
                long j = as1Var2.b;
                b8Var.setSubtext(r3c.F0(r3c.K0(a5cVar.l(j), null, null)));
                b8Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                b8 b8Var2 = new b8(0, as1Var2.d, as1Var2.getContext(), true, false);
                b8Var2.j(ob6.M0(2131753749, null), 2131231243, null);
                b8Var2.setOnClickListener(new co1(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 3));
                linearLayout.addView(b8Var2);
                linearLayout.addView((View) scrollView, tre.o(-1, 420));
                String str = (String) a5cVar.e.get(Long.valueOf(j));
                r3c.K0(str, null, null);
                boolean[] zArr = as1Var2.r;
                String K0 = r3c.K0(str, zArr, null);
                String l = a5cVar.l(j);
                ArrayList n = a5c.n(l);
                ArrayList m = a5c.m();
                linearLayout2.addView(new k8(as1Var2.getContext(), vnbVar2), tre.o(-1, 8));
                b8Var.setOnClickListener(new ae(new x35(as1Var2, new boolean[1], l, linearLayout2, n, str, a5cVar, n8Var, m), actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 18));
                if (yac.h(i3).p() && K0 != null) {
                    b8 b8Var3 = new b8(0, as1Var2.d, as1Var2.getContext(), false, false);
                    if (zArr[0]) {
                        a0 = ob6.a0(null, null, 2131751322, K0);
                    } else {
                        a0 = ob6.a0(null, null, 2131751321, K0);
                    }
                    b8Var3.setMultiline(false);
                    b8Var3.j(kg5.b(a0, b8Var3.getTextView().getPaint()), 2131232073, null);
                    b8Var3.setOnClickListener(new nh(as1Var2, str, a5cVar, K0, n8Var, (byte) 15));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var3);
                }
                b8 b8Var4 = new b8(0, as1Var2.d, as1Var2.getContext(), false, false);
                b8Var4.j(ob6.M0(2131749079, null), 2131232092, null);
                b8Var4.setOnClickListener(new lw4(as1Var2, a5cVar, n8Var, (byte) 25));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new k8(as1Var2.getContext(), vnbVar2), tre.o(-1, 8));
                p66 p66Var = new p66(as1Var2.getContext(), null);
                p66Var.setPadding(hl.L(13.0f), hl.L(8.33f), hl.L(13.0f), hl.L(8.33f));
                p66Var.setDisablePaddingsOffsetY(true);
                int i4 = aob.j5;
                yob.X(p66Var, i4, vnbVar2);
                yob.G(p66Var, aob.Xc, vnbVar2);
                p66Var.setEmojiColor(aob.v0(i4, vnbVar2));
                CharSequence concat = TextUtils.concat(hl.S2(ob6.M0(2131751991, null)), " ", hl.N2(ob6.M0(2131751990, null), -1, 2, new bcb(as1Var2, n8Var, (byte) 22), null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new hm(5197252827247841976L, p66Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                p66Var.setText(kg5.b(hl.G2(hl.G2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), p66Var.getPaint()));
                int i5 = aob.i6;
                hf0 Y = aob.Y(aob.v0(i5, vnbVar2), 0, 12);
                uob M = yob.M(i5);
                p66Var.setBackground(Y);
                yob.j(p66Var, Y, null, M, vnbVar2);
                p66Var.setOnClickListener(new jjb(as1Var2, n8Var, (byte) 5));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p66Var);
                n8Var.e = true;
                n8Var.c = (short) 220;
                n8Var.setOutsideTouchable(true);
                n8Var.setClippingEnabled(true);
                n8Var.setAnimationStyle(2131755192);
                n8Var.setFocusable(true);
                n8Var.setInputMethodMode(2);
                n8Var.setSoftInputMode(0);
                ImageView imageView2 = as1Var2.n;
                n8Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - hl.L(8.0f));
            }
        });
        addView(imageView, tre.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, vnb vnbVar) {
        nx0 h = uh9.h(1, vnbVar, context, false);
        h.w0 = false;
        h.v0 = false;
        nx0[] nx0VarArr = new nx0[1];
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(hl.L(150.0f));
        float L = hl.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, tre.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231009);
        linearLayout.addView(imageView, tre.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231010);
        linearLayout.addView(imageView2, tre.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131751989, null));
        y7c[] y7cVarArr = (y7c[]) S2.getSpans(0, S2.length(), y7c.class);
        for (int i = 0; i < y7cVarArr.length; i++) {
            S2.setSpan(new ForegroundColorSpan(-1), S2.getSpanStart(y7cVarArr[i]), S2.getSpanEnd(y7cVarArr[i]), S2.getSpanFlags(y7cVarArr[i]));
        }
        textView.setText(S2);
        linearLayout.addView(textView, tre.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        j.addView(frameLayout, tre.c(-2.0f, -1));
        j.addView(new b6(context, 2131231864, ob6.M0(2131751999, null), hl.N2(ob6.M0(2131752001, null), -1, 0, new vxa(nx0VarArr, context, (byte) 1), null), vnbVar), tre.t(-1, -2, 49, 32, 16, 32, 16));
        j.addView(new b6(context, 2131232383, ob6.M0(2131751997, null), ob6.M0(2131751998, null), vnbVar), tre.t(-1, -2, 49, 32, 0, 32, 16));
        j.addView(new b6(context, 2131231831, ob6.M0(2131751994, null), hl.N2(ob6.M0(2131751996, null), -1, 0, new vxa(nx0VarArr, context, (byte) 2), null), vnbVar), tre.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        yob.h(aob.d7, vnbVar, view);
        j.addView(view, tre.n(1.0f / hl.p, -1, 7, 24, 0, 24, 0));
        p66 p66Var = new p66(context, null);
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.y6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setGravity(17);
        p66Var.setText(hl.N2(ob6.M0(2131751993, null), -1, 0, new vxa(nx0VarArr, context, (byte) 3), null));
        p66Var.setPadding(0, hl.L(18.0f), 0, hl.L(18.0f));
        p66Var.setDisablePaddingsOffsetY(true);
        j.addView(p66Var, tre.t(-1, -2, 7, 32, 0, 32, 0));
        c51 i2 = xnb.i(24, vnbVar, context, true);
        i2.setText(wua.l2(ob6.M0(2131743543, null)));
        i2.setOnClickListener(new g5(nx0VarArr, (byte) 7));
        j.addView(i2, tre.t(-1, 48, 7, 16, 0, 16, 16));
        h.O = j;
        nx0VarArr[0] = h;
        h.J();
        nx0VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Ye));
        hashSet.add(Integer.valueOf(aob.Ue));
    }

    public final void b() {
        String a0;
        int i;
        int i2 = this.a;
        a5c a5cVar = uc7.s1(i2).i4;
        uc7 s1 = uc7.s1(i2);
        long j = this.b;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        boolean A = a5cVar.A(j);
        si siVar = this.e;
        SpannableString spannableString = this.h;
        if (A) {
            String K0 = r3c.K0((String) a5cVar.e.get(Long.valueOf(j)), null, null);
            if (!TextUtils.isEmpty(K0)) {
                siVar.setText(TextUtils.concat(spannableString, " ", ob6.a0(null, null, 2131745061, K0)));
            } else {
                siVar.setText(TextUtils.concat(spannableString, " ", ob6.M0(2131745062, null)));
            }
        } else {
            String l = a5cVar.l(j);
            if (l == null) {
                l = "en";
            }
            boolean[] zArr = this.r;
            String K02 = r3c.K0(l, zArr, null);
            if (zArr[0]) {
                a0 = ob6.a0(null, null, 2131743607, K02);
            } else {
                a0 = ob6.a0(null, null, 2131743606, K02);
            }
            siVar.setText(TextUtils.concat(spannableString, " ", a0));
        }
        if (!yac.h(i2).p() && (M0 == null || !M0.autotranslation)) {
            i = 2131232101;
        } else {
            i = 2131232242;
        }
        this.n.setImageResource(i);
    }

    public void setLeftMargin(float f) {
        this.e.setTranslationX(f / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i = aob.Ye;
        vnb vnbVar = this.d;
        int v0 = aob.v0(i, vnbVar);
        int i2 = aob.i6;
        int v02 = aob.v0(i2, vnbVar);
        int i3 = aob.Ue;
        int v03 = aob.v0(i3, vnbVar);
        if (this.y && v0 == this.s && v02 == this.w && v03 == this.x) {
            return;
        }
        this.y = true;
        this.s = v0;
        this.w = v02;
        this.x = v03;
        int v04 = aob.v0(i, vnbVar);
        si siVar = this.e;
        siVar.setTextColor(v04);
        int v05 = aob.v0(i, vnbVar) & 436207615;
        int L = hl.L(3.0f);
        siVar.setBackground(aob.W(hl.L(15.0f), v05, L, L, L, L));
        hf0 N = aob.N(aob.v0(i2, vnbVar), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(N);
        int v06 = aob.v0(i3, vnbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v06, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
    }
}
