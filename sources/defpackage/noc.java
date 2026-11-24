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
public final class noc extends d {
    public byte a;
    public cmc b;
    public LinearLayout c;
    public u41 d;
    public ImageView e;
    public ScrollView f;
    public l46 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public noc() {
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
                    rk rkVar = new rk(false);
                    rkVar.b = 191;
                    spannableStringBuilder.setSpan(rkVar, i, spannableStringBuilder.length(), 33);
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
            arrayList.add(((lqc) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        for (int i3 = 0; i3 < this.a; i3++) {
            if (i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            lqc lqcVar = new lqc(i3, this.resourceProvider, context, z);
            lqcVar.setOnTextChangedListener(new moc(this, (byte) 1));
            lqcVar.setOnPasteListener(new on7(this, i3, (byte) 27));
            lqcVar.setOnNextListener(new clc(this, i3, lqcVar, (byte) 2));
            LinearLayout linearLayout = this.c;
            if (i3 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout.addView(lqcVar, nme.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(lqcVar);
        }
        for (int i4 = 0; i4 < arrayList.size() && i4 < arrayList2.size(); i4++) {
            if (!((String) arrayList.get(i4)).isEmpty()) {
                ((lqc) arrayList2.get(i4)).setText((String) arrayList.get(i4));
            }
        }
    }

    public final void a0(String str, c cVar, d dVar, String str2) {
        this.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                u21.b0(this).f0(str2, false);
                return;
            }
            if (this.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, cVar.x())) {
                new g15(this.currentAccount, getParentActivity(), str).C();
            }
            gl.e3(new mhc(this, dVar, (byte) 21), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131742839, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131742838, null);
        b00.t(null, 2131742819, alertDialog$Builder, null);
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
            arrayList.add(((lqc) obj).getWord().toLowerCase().trim());
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
            y05 y05Var = new y05(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            try {
                this.d.setLoading(true);
                if (this.s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(y05Var);
                    } catch (Exception e) {
                        fa4.g(e, true);
                        bArr = null;
                    }
                    if (bArr == null) {
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = k96.M0(2131742839, null);
                        hdVar.U = k96.M0(2131742838, null);
                        alertDialog$Builder.j(k96.M0(2131742819, null), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, this.s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(y05Var);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(getParentActivity());
                            TextView textView = new TextView(getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            zkb.X(textView, bkb.F6, this.resourceProvider);
                            textView.setText(Z(str));
                            textView.setPadding(gl.L(10.0f), gl.L(12.0f), gl.L(10.0f), gl.L(12.0f));
                            textView.setTypeface(gl.n1("fonts/rmono.ttf"));
                            int L = gl.L(10.0f);
                            int i5 = bkb.Z6;
                            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i5, this.resourceProvider));
                            vkb M = zkb.M(i5);
                            wjb wjbVar = this.resourceProvider;
                            textView.setBackground(b0);
                            zkb.j(textView, b0, M, null, wjbVar);
                            textView.setGravity(17);
                            frameLayout.addView(textView, nme.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                        } else {
                            frameLayout = null;
                        }
                        this.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = k96.M0(2131742694, null);
                        hdVar2.U = k96.M0(2131742693, null);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                        alertDialog$Builder2.o();
                    } else {
                        c C = c.C(this.currentAccount);
                        C.c.q(y6c.h(this.currentAccount).e(), bArr, y05Var, new nu9(this, C, (byte) 21));
                    }
                } else {
                    this.d.setLoading(true);
                    c C2 = c.C(this.currentAccount);
                    d dVar = null;
                    String x = C2.x();
                    if (getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
                        dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
                    }
                    C2.H(false, true, y05Var, new au0((Object) this, x, (Object) C2, (Object) dVar, (byte) 22));
                }
                y05Var.close();
            } catch (Throwable th) {
                try {
                    y05Var.close();
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
                if (((lqc) obj).getWord().isEmpty()) {
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
        cja cjaVar = new cja(context, null);
        this.fragmentView = cjaVar;
        zkb.h(bkb.c6, this.resourceProvider, cjaVar);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, gl.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new gk1(this, (byte) 9));
        ((FrameLayout) this.fragmentView).addView(scrollView, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(36.0f), 0, gl.L(36.0f), gl.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, nme.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i2 = bkb.F6;
        zkb.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(2131231244);
        ImageView imageView3 = this.e;
        int i3 = bkb.h6;
        zkb.R(imageView3, bkb.f0(bkb.v0(i3, this.resourceProvider), 3, -1), null, zkb.M(i3), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final noc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                noc nocVar = this.b;
                switch (b) {
                    case 0:
                        nocVar.finishFragment();
                        return;
                    default:
                        nocVar.b0();
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, nme.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        be0Var.setAspectFit(true);
        be0Var.getImageReceiver().d = gl.t0();
        hq6.d0(gl.t0()).e2(be0Var, "RestrictedEmoji", "📝", "100_100");
        be0Var.getImageReceiver().N(1);
        linearLayout.addView(be0Var, nme.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        zkb.X(textView, i2, this.resourceProvider);
        if (this.s != null) {
            i = 2131742761;
        } else {
            i = 2131742851;
        }
        textView.setText(k96.M0(i, null));
        linearLayout.addView(textView, nme.t(-1, -2, 1, 32, 0, 32, 10));
        l46 l46Var = new l46(context, null);
        this.h = l46Var;
        l46Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        zkb.X(this.h, bkb.y6, this.resourceProvider);
        zkb.G(this.h, bkb.Wc, this.resourceProvider);
        byte[] bArr = this.s;
        l46 l46Var2 = this.h;
        if (bArr != null) {
            l46Var2.setText(gl.O2(k96.M0(2131742882, null), -1, 0, new moc(this, (byte) 0), null));
        } else {
            l46Var2.setText(k96.V(null, null, 2131742847, 12));
        }
        linearLayout.addView(this.h, nme.t(-1, -2, 1, 32, 0, 32, 8));
        cmc cmcVar = new cmc(context, new CharSequence[]{k96.G(12, "WalletPhraseWords", new Object[0]), k96.G(24, "WalletPhraseWords", new Object[0])}, new ae9(this, (byte) 28), this.resourceProvider);
        this.b = cmcVar;
        cmcVar.e = true;
        cmcVar.updateColors();
        this.b.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, nme.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, nme.t(-1, -2, 1, 0, 16, 0, 0));
        u41 u41Var = new u41(this.resourceProvider, context, true);
        this.d = u41Var;
        u41Var.f();
        this.d.setText(k96.M0(2131742850, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final noc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                noc nocVar = this.b;
                switch (b) {
                    case 0:
                        nocVar.finishFragment();
                        return;
                    default:
                        nocVar.b0();
                        return;
                }
            }
        });
        linearLayout.addView(this.d, nme.t(-1, 48, 1, 0, 24, 0, 0));
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
            scrollView.setPadding(i, gl.L(96.0f) + i2, i3, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            int max = Math.max(i4, this.n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = gl.L(12.0f) + i2;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final vxc onInsetsInternal(View view, vxc vxcVar) {
        this.n = vxcVar.a.f(8).d;
        return super.onInsetsInternal(view, vxcVar);
    }
}
