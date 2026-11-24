package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.ui.ActionBar.d;
public final class hsc extends d {
    public final String[] a;
    public final int[] b;
    public final cpc c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public b61 h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public hsc(ArrayList arrayList, cpc cpcVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            u36.j("Expected a 12- or 24-word recovery phrase");
            throw null;
        }
        this.c = cpcVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.a.length; i2 = td4.g(i2, i2, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                i++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void Z() {
        boolean z;
        int i;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z2 = false;
        if (arrayList.size() == this.b.length) {
            z = true;
        } else {
            z = false;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z &= !((nsc) obj).getWord().isEmpty();
        }
        b61 b61Var = this.h;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        b61Var.setVisibility(i);
        b61 b61Var2 = this.h;
        if (z && !this.y) {
            z2 = true;
        }
        b61Var2.setEnabled(z2);
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ela elaVar = new ela(context, null);
        elaVar.setDelegate(new xw0(this, (byte) 3));
        anb.h(cmb.c6, this.resourceProvider, elaVar);
        this.fragmentView = elaVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, gm.L(96.0f), 0, 0);
        elaVar.addView(this.e, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(36.0f), 0, gm.L(36.0f), gm.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i2 = cmb.F6;
        anb.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(2131231245);
        ImageView imageView3 = this.f;
        int i3 = cmb.h6;
        anb.R(imageView3, cmb.f0(cmb.v0(i3, this.resourceProvider), 3, -1), null, anb.M(i3), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final hsc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hsc hscVar = this.b;
                switch (b) {
                    case 0:
                        hscVar.finishFragment();
                        return;
                    default:
                        int[] iArr = hscVar.b;
                        ArrayList arrayList = hscVar.d;
                        if (!hscVar.y && arrayList.size() == iArr.length) {
                            boolean z = e21.a;
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (((nsc) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i5 = 0; i5 < iArr.length; i5++) {
                                nsc nscVar = (nsc) arrayList.get(i5);
                                boolean equalsIgnoreCase = hscVar.a[iArr[i5]].equalsIgnoreCase(nscVar.getWord());
                                if (!equalsIgnoreCase && nscVar.w) {
                                    gm.B3(nscVar);
                                }
                                nscVar.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                hscVar.y = true;
                                hscVar.Z();
                                gm.t1(hscVar.fragmentView);
                                cpc cpcVar = hscVar.c;
                                if (cpcVar != null) {
                                    cpcVar.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        elaVar.addView(this.f, qoe.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.setAspectFit(true);
        bf0Var.getImageReceiver().d = gm.t0();
        hs6.d0(gm.t0()).e2(bf0Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        bf0Var.getImageReceiver().N(1);
        linearLayout.addView(bf0Var, qoe.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        wi8.x(textView, i2, this.resourceProvider, null, 2131742668);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        anb.X(m, cmb.y6, this.resourceProvider);
        int[] iArr = this.b;
        hg9.q(null, null, 2131742667, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, m);
        linearLayout.addView(m, qoe.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, qoe.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList.add(((nsc) obj).getWord());
        }
        arrayList2.clear();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            nsc nscVar = new nsc(iArr[i5], this.resourceProvider, context, false);
            if (i5 < arrayList.size()) {
                nscVar.setText((String) arrayList.get(i5));
            }
            nscVar.setOnTextChangedListener(new cpc(this, (byte) 6));
            nscVar.setOnNextListener(new bnc(this, i5, nscVar, (byte) 3));
            if (i5 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout2.addView(nscVar, qoe.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(nscVar);
        }
        linearLayout.addView(new View(context), qoe.l(1.0f, -1, 0));
        b61 b61Var = new b61(this.resourceProvider, context, true);
        this.h = b61Var;
        b61Var.f();
        this.h.setText(jb6.M0(2131742837, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final hsc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hsc hscVar = this.b;
                switch (b) {
                    case 0:
                        hscVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = hscVar.b;
                        ArrayList arrayList3 = hscVar.d;
                        if (!hscVar.y && arrayList3.size() == iArr2.length) {
                            boolean z = e21.a;
                            int size2 = arrayList3.size();
                            int i42 = 0;
                            while (i42 < size2) {
                                Object obj2 = arrayList3.get(i42);
                                i42++;
                                if (((nsc) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i52 = 0; i52 < iArr2.length; i52++) {
                                nsc nscVar2 = (nsc) arrayList3.get(i52);
                                boolean equalsIgnoreCase = hscVar.a[iArr2[i52]].equalsIgnoreCase(nscVar2.getWord());
                                if (!equalsIgnoreCase && nscVar2.w) {
                                    gm.B3(nscVar2);
                                }
                                nscVar2.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                hscVar.y = true;
                                hscVar.Z();
                                gm.t1(hscVar.fragmentView);
                                cpc cpcVar = hscVar.c;
                                if (cpcVar != null) {
                                    cpcVar.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout.addView(this.h, qoe.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.r = i;
        this.s = i2;
        this.w = i3;
        this.x = i4;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i, gm.L(96.0f) + i2, i3, i4 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = gm.L(4.0f) + i;
            layoutParams.topMargin = gm.L(12.0f) + i2;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
