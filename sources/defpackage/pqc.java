package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class pqc extends d {
    public byte a;
    public boc b;
    public LinearLayout c;
    public b61 d;
    public ImageView e;
    public ScrollView f;
    public l66 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public pqc() {
        super(null);
        this.a = (byte) 12;
        this.w = new ArrayList();
    }

    public static SpannableStringBuilder a0(String str) {
        char c;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 > 0 && i3 % 4 == 0) {
                int i4 = i3 % 24;
                if (i4 == 0) {
                    c = '\n';
                } else {
                    c = ' ';
                }
                spannableStringBuilder.append(c);
                if (i4 == 0) {
                    i2++;
                }
                i = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i3));
            if (i3 % 4 == 3) {
                int i5 = i2 + 1;
                if (i2 % 2 == 1) {
                    rl rlVar = new rl(false);
                    rlVar.b = 191;
                    spannableStringBuilder.setSpan(rlVar, i, spannableStringBuilder.length(), 33);
                }
                i = spannableStringBuilder.length();
                i2 = i5;
            }
        }
        return spannableStringBuilder;
    }

    public final void Z(Context context) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((nsc) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        for (int i3 = 0; i3 < this.a; i3++) {
            if (i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            nsc nscVar = new nsc(i3, this.resourceProvider, context, z);
            nscVar.setOnTextChangedListener(new oqc(this, (byte) 1));
            nscVar.setOnPasteListener(new ge7(this, i3, (byte) 29));
            nscVar.setOnNextListener(new bnc(this, i3, nscVar, (byte) 2));
            LinearLayout linearLayout = this.c;
            if (i3 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout.addView(nscVar, qoe.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(nscVar);
        }
        for (int i4 = 0; i4 < arrayList.size() && i4 < arrayList2.size(); i4++) {
            if (!((String) arrayList.get(i4)).isEmpty()) {
                ((nsc) arrayList2.get(i4)).setText((String) arrayList.get(i4));
            }
        }
    }

    public final void b0(String str, c cVar, d dVar, String str2) {
        this.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                c41.b0(this).f0(str2, false);
                return;
            }
            if (this.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, cVar.x())) {
                new g35(this.currentAccount, getParentActivity(), str).C();
            }
            gm.d3(new qhc(this, dVar, (byte) 23), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131742765, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131742764, null);
        b10.t(null, 2131742745, alertDialog$Builder, null);
    }

    public final void c0() {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        byte[] bytes;
        if (this.d.R) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((nsc) obj).getWord().toLowerCase().trim());
        }
        int max = Math.max(0, arrayList.size() - 1);
        ArrayList arrayList3 = new ArrayList();
        try {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                arrayList3.add(((String) obj2).getBytes(StandardCharsets.UTF_8));
                long length = max + bytes.length;
                max = (int) length;
                if (length != max) {
                    throw new ArithmeticException();
                }
            }
            byte[] bArr2 = new byte[max];
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                if (i4 > 0) {
                    bArr2[i3] = 32;
                    i3++;
                }
                byte[] bArr3 = (byte[]) arrayList3.get(i4);
                System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
                i3 += bArr3.length;
            }
            y25 y25Var = new y25(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            try {
                this.d.setLoading(true);
                if (this.s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(y25Var);
                    } catch (Exception e) {
                        fc4.g(e, true);
                        bArr = null;
                    }
                    if (bArr == null) {
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        he heVar = alertDialog$Builder.a;
                        heVar.S = jb6.M0(2131742765, null);
                        heVar.U = jb6.M0(2131742764, null);
                        alertDialog$Builder.j(jb6.M0(2131742745, null), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, this.s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(y25Var);
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(getParentActivity());
                            TextView textView = new TextView(getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            anb.X(textView, cmb.F6, this.resourceProvider);
                            textView.setText(a0(str));
                            textView.setPadding(gm.L(10.0f), gm.L(12.0f), gm.L(10.0f), gm.L(12.0f));
                            textView.setTypeface(gm.n1("fonts/rmono.ttf"));
                            int L = gm.L(10.0f);
                            int i5 = cmb.Z6;
                            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i5, this.resourceProvider));
                            wmb M = anb.M(i5);
                            ylb ylbVar = this.resourceProvider;
                            textView.setBackground(b0);
                            anb.j(textView, b0, M, null, ylbVar);
                            textView.setGravity(17);
                            frameLayout.addView(textView, qoe.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                        } else {
                            frameLayout = null;
                        }
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.S = jb6.M0(2131742620, null);
                        heVar2.U = jb6.M0(2131742619, null);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                        alertDialog$Builder2.o();
                    } else {
                        c C = c.C(this.currentAccount);
                        C.c.q(z8c.h(this.currentAccount).e(), bArr, y25Var, new ts9(this, C, (byte) 22));
                    }
                } else {
                    this.d.setLoading(true);
                    c C2 = c.C(this.currentAccount);
                    d dVar = null;
                    String x = C2.x();
                    if (getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
                        dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
                    }
                    C2.H(false, true, y25Var, new jv0((Object) this, x, (Object) C2, (Object) dVar, (byte) 22));
                }
                y25Var.close();
            } catch (Throwable th) {
                try {
                    y25Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ela elaVar = new ela(context, null);
        this.fragmentView = elaVar;
        anb.h(cmb.c6, this.resourceProvider, elaVar);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, gm.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new ol1(this, (byte) 9));
        ((FrameLayout) this.fragmentView).addView(scrollView, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(36.0f), 0, gm.L(36.0f), gm.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, qoe.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i2 = cmb.F6;
        anb.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(2131231245);
        ImageView imageView3 = this.e;
        int i3 = cmb.h6;
        anb.R(imageView3, cmb.f0(cmb.v0(i3, this.resourceProvider), 3, -1), null, anb.M(i3), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final pqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pqc pqcVar = this.b;
                switch (b) {
                    case 0:
                        pqcVar.finishFragment();
                        return;
                    default:
                        pqcVar.c0();
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, qoe.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.setAspectFit(true);
        bf0Var.getImageReceiver().d = gm.t0();
        hs6.d0(gm.t0()).e2(bf0Var, "RestrictedEmoji", "📝", "100_100");
        bf0Var.getImageReceiver().N(1);
        linearLayout.addView(bf0Var, qoe.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        anb.X(textView, i2, this.resourceProvider);
        if (this.s != null) {
            i = 2131742687;
        } else {
            i = 2131742777;
        }
        textView.setText(jb6.M0(i, null));
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 32, 0, 32, 10));
        l66 l66Var = new l66(context, null);
        this.h = l66Var;
        l66Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        anb.X(this.h, cmb.y6, this.resourceProvider);
        anb.G(this.h, cmb.Wc, this.resourceProvider);
        byte[] bArr = this.s;
        l66 l66Var2 = this.h;
        if (bArr != null) {
            l66Var2.setText(gm.N2(jb6.M0(2131742808, null), -1, 0, new oqc(this, (byte) 0), null));
        } else {
            l66Var2.setText(jb6.V(null, null, 2131742773, 12));
        }
        linearLayout.addView(this.h, qoe.t(-1, -2, 1, 32, 0, 32, 8));
        boc bocVar = new boc(context, new CharSequence[]{jb6.G(12, "WalletPhraseWords", new Object[0]), jb6.G(24, "WalletPhraseWords", new Object[0])}, new eg9(this, (byte) 28), this.resourceProvider);
        this.b = bocVar;
        bocVar.e = true;
        bocVar.updateColors();
        this.b.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, qoe.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, qoe.t(-1, -2, 1, 0, 16, 0, 0));
        b61 b61Var = new b61(this.resourceProvider, context, true);
        this.d = b61Var;
        b61Var.f();
        this.d.setText(jb6.M0(2131742776, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final pqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pqc pqcVar = this.b;
                switch (b) {
                    case 0:
                        pqcVar.finishFragment();
                        return;
                    default:
                        pqcVar.c0();
                        return;
                }
            }
        });
        linearLayout.addView(this.d, qoe.t(-1, 48, 1, 0, 24, 0, 0));
        Z(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((nsc) obj).getWord().isEmpty()) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        this.d.setEnabled(z);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f;
        if (scrollView != null) {
            scrollView.setPadding(i, gm.L(96.0f) + i2, i3, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            int max = Math.max(i4, this.n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = gm.L(12.0f) + i2;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final wzc onInsetsInternal(View view, wzc wzcVar) {
        this.n = wzcVar.a.f(8).d;
        return super.onInsetsInternal(view, wzcVar);
    }
}
