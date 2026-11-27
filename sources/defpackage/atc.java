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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class atc extends e {
    public byte a;
    public pqc b;
    public LinearLayout c;
    public c51 d;
    public ImageView e;
    public ScrollView f;
    public p66 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public atc() {
        super(null);
        this.a = (byte) 12;
        this.w = new ArrayList();
    }

    public static SpannableStringBuilder Z(String str) {
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
                    sk skVar = new sk(false);
                    skVar.b = 191;
                    spannableStringBuilder.setSpan(skVar, i, spannableStringBuilder.length(), 33);
                }
                i = spannableStringBuilder.length();
                i2 = i5;
            }
        }
        return spannableStringBuilder;
    }

    public final void Y(Context context) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((zuc) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        for (int i3 = 0; i3 < this.a; i3++) {
            if (i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            zuc zucVar = new zuc(i3, this.resourceProvider, context, z);
            zucVar.setOnTextChangedListener(new ysc(this, (byte) 1));
            zucVar.setOnPasteListener(new zsc(this, i3, (byte) 0));
            zucVar.setOnNextListener(new mpc(this, i3, zucVar, (byte) 3));
            LinearLayout linearLayout = this.c;
            if (i3 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout.addView(zucVar, tre.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(zucVar);
        }
        for (int i4 = 0; i4 < arrayList.size() && i4 < arrayList2.size(); i4++) {
            if (!((String) arrayList.get(i4)).isEmpty()) {
                ((zuc) arrayList2.get(i4)).setText((String) arrayList.get(i4));
            }
        }
    }

    public final void a0(String str, c cVar, e eVar, String str2) {
        this.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                d31.b0(this).f0(str2, false);
                return;
            }
            if (this.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, cVar.x())) {
                new k35(this.currentAccount, getParentActivity(), str).C();
            }
            hl.d3(new vlc(this, eVar, (byte) 20), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131742733, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131742732, null);
        c00.u(null, 2131742713, alertDialog$Builder, null);
    }

    public final void b0() {
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
            arrayList.add(((zuc) obj).getWord().toLowerCase().trim());
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
            c35 c35Var = new c35(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            try {
                this.d.setLoading(true);
                if (this.s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(c35Var);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        bArr = null;
                    }
                    if (bArr == null) {
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        id idVar = alertDialog$Builder.a;
                        idVar.S = ob6.M0(2131742733, null);
                        idVar.U = ob6.M0(2131742732, null);
                        alertDialog$Builder.j(ob6.M0(2131742713, null), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, this.s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(c35Var);
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(getParentActivity());
                            TextView textView = new TextView(getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            yob.X(textView, aob.G6, this.resourceProvider);
                            textView.setText(Z(str));
                            textView.setPadding(hl.L(10.0f), hl.L(12.0f), hl.L(10.0f), hl.L(12.0f));
                            textView.setTypeface(hl.n1("fonts/rmono.ttf"));
                            int L = hl.L(10.0f);
                            int i5 = aob.a7;
                            ShapeDrawable b0 = aob.b0(L, aob.v0(i5, this.resourceProvider));
                            uob M = yob.M(i5);
                            vnb vnbVar = this.resourceProvider;
                            textView.setBackground(b0);
                            yob.j(textView, b0, M, null, vnbVar);
                            textView.setGravity(17);
                            frameLayout.addView(textView, tre.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                        } else {
                            frameLayout = null;
                        }
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.S = ob6.M0(2131742588, null);
                        idVar2.U = ob6.M0(2131742587, null);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                        alertDialog$Builder2.o();
                    } else {
                        c C = c.C(this.currentAccount);
                        C.c.q(yac.h(this.currentAccount).e(), bArr, c35Var, new ku9(this, C, (byte) 21));
                    }
                } else {
                    this.d.setLoading(true);
                    c C2 = c.C(this.currentAccount);
                    e eVar = null;
                    String x = C2.x();
                    if (getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
                        eVar = (e) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
                    }
                    C2.H(false, true, c35Var, new ku0((Object) this, x, (Object) C2, (Object) eVar, (byte) 22));
                }
                c35Var.close();
            } catch (Throwable th) {
                try {
                    c35Var.close();
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

    public final void c0() {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((zuc) obj).getWord().isEmpty()) {
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
    public final View createView(Context context) {
        int i;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        yob.h(aob.d6, this.resourceProvider, wmaVar);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, hl.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new pk1(this, (byte) 9));
        ((FrameLayout) this.fragmentView).addView(scrollView, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, tre.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i2 = aob.G6;
        yob.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(2131231244);
        ImageView imageView3 = this.e;
        int i3 = aob.i6;
        yob.R(imageView3, aob.f0(aob.v0(i3, this.resourceProvider), 3, -1), null, yob.M(i3), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final atc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                atc atcVar = this.b;
                switch (b) {
                    case 0:
                        atcVar.finishFragment();
                        return;
                    default:
                        atcVar.b0();
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, tre.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setAspectFit(true);
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "📝", "100_100");
        de0Var.getImageReceiver().N(1);
        linearLayout.addView(de0Var, tre.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        yob.X(textView, i2, this.resourceProvider);
        if (this.s != null) {
            i = 2131742655;
        } else {
            i = 2131742745;
        }
        textView.setText(ob6.M0(i, null));
        linearLayout.addView(textView, tre.t(-1, -2, 1, 32, 0, 32, 10));
        p66 p66Var = new p66(context, null);
        this.h = p66Var;
        p66Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        yob.X(this.h, aob.z6, this.resourceProvider);
        yob.G(this.h, aob.Xc, this.resourceProvider);
        byte[] bArr = this.s;
        p66 p66Var2 = this.h;
        if (bArr != null) {
            p66Var2.setText(hl.N2(ob6.M0(2131742776, null), -1, 0, new ysc(this, (byte) 0), null));
        } else {
            p66Var2.setText(ob6.V(null, null, 2131742741, 12));
        }
        linearLayout.addView(this.h, tre.t(-1, -2, 1, 32, 0, 32, 8));
        pqc pqcVar = new pqc(context, new CharSequence[]{ob6.G(12, "WalletPhraseWords", new Object[0]), ob6.G(24, "WalletPhraseWords", new Object[0])}, new sh9(this, (byte) 28), this.resourceProvider);
        this.b = pqcVar;
        pqcVar.e = true;
        pqcVar.updateColors();
        this.b.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, tre.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, tre.t(-1, -2, 1, 0, 16, 0, 0));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.d = c51Var;
        c51Var.f();
        this.d.setText(ob6.M0(2131742744, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final atc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                atc atcVar = this.b;
                switch (b) {
                    case 0:
                        atcVar.finishFragment();
                        return;
                    default:
                        atcVar.b0();
                        return;
                }
            }
        });
        linearLayout.addView(this.d, tre.t(-1, 48, 1, 0, 24, 0, 0));
        Y(context);
        c0();
        return this.fragmentView;
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
            scrollView.setPadding(i, hl.L(96.0f) + i2, i3, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            int max = Math.max(i4, this.n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = hl.L(12.0f) + i2;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final l2d onInsetsInternal(View view, l2d l2dVar) {
        this.n = l2dVar.a.f(8).d;
        return super.onInsetsInternal(view, l2dVar);
    }
}
