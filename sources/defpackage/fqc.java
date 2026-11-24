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
public final class fqc extends d {
    public final String[] a;
    public final int[] b;
    public final kbc c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public u41 h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public fqc(ArrayList arrayList, kbc kbcVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            w26.j("Expected a 12- or 24-word recovery phrase");
            throw null;
        }
        this.c = kbcVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.a.length; i2 = tb4.g(i2, i2, 1, arrayList2)) {
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

    public final void Y() {
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
            z &= !((lqc) obj).getWord().isEmpty();
        }
        u41 u41Var = this.h;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        u41Var.setVisibility(i);
        u41 u41Var2 = this.h;
        if (z && !this.y) {
            z2 = true;
        }
        u41Var2.setEnabled(z2);
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        cja cjaVar = new cja(context, null);
        cjaVar.setDelegate(new ov0(this, (byte) 3));
        zkb.h(bkb.c6, this.resourceProvider, cjaVar);
        this.fragmentView = cjaVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, gl.L(96.0f), 0, 0);
        cjaVar.addView(this.e, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(36.0f), 0, gl.L(36.0f), gl.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i2 = bkb.F6;
        zkb.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(2131231244);
        ImageView imageView3 = this.f;
        int i3 = bkb.h6;
        zkb.R(imageView3, bkb.f0(bkb.v0(i3, this.resourceProvider), 3, -1), null, zkb.M(i3), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final fqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fqc fqcVar = this.b;
                switch (b) {
                    case 0:
                        fqcVar.finishFragment();
                        return;
                    default:
                        int[] iArr = fqcVar.b;
                        ArrayList arrayList = fqcVar.d;
                        if (!fqcVar.y && arrayList.size() == iArr.length) {
                            boolean z = w01.a;
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (((lqc) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i5 = 0; i5 < iArr.length; i5++) {
                                lqc lqcVar = (lqc) arrayList.get(i5);
                                boolean equalsIgnoreCase = fqcVar.a[iArr[i5]].equalsIgnoreCase(lqcVar.getWord());
                                if (!equalsIgnoreCase && lqcVar.w) {
                                    gl.C3(lqcVar);
                                }
                                lqcVar.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                fqcVar.y = true;
                                fqcVar.Y();
                                gl.t1(fqcVar.fragmentView);
                                kbc kbcVar = fqcVar.c;
                                if (kbcVar != null) {
                                    kbcVar.run();
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
        cjaVar.addView(this.f, nme.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        be0Var.setAspectFit(true);
        be0Var.getImageReceiver().d = gl.t0();
        hq6.d0(gl.t0()).e2(be0Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        be0Var.getImageReceiver().N(1);
        linearLayout.addView(be0Var, nme.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        ug8.x(textView, i2, this.resourceProvider, null, 2131742742);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        zkb.X(m, bkb.y6, this.resourceProvider);
        int[] iArr = this.b;
        de9.r(null, null, 2131742741, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, m);
        linearLayout.addView(m, nme.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, nme.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList.add(((lqc) obj).getWord());
        }
        arrayList2.clear();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            lqc lqcVar = new lqc(iArr[i5], this.resourceProvider, context, false);
            if (i5 < arrayList.size()) {
                lqcVar.setText((String) arrayList.get(i5));
            }
            lqcVar.setOnTextChangedListener(new kbc(this, (byte) 28));
            lqcVar.setOnNextListener(new clc(this, i5, lqcVar, (byte) 3));
            if (i5 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout2.addView(lqcVar, nme.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(lqcVar);
        }
        linearLayout.addView(new View(context), nme.l(1.0f, -1, 0));
        u41 u41Var = new u41(this.resourceProvider, context, true);
        this.h = u41Var;
        u41Var.f();
        this.h.setText(k96.M0(2131742911, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final fqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fqc fqcVar = this.b;
                switch (b) {
                    case 0:
                        fqcVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = fqcVar.b;
                        ArrayList arrayList3 = fqcVar.d;
                        if (!fqcVar.y && arrayList3.size() == iArr2.length) {
                            boolean z = w01.a;
                            int size2 = arrayList3.size();
                            int i42 = 0;
                            while (i42 < size2) {
                                Object obj2 = arrayList3.get(i42);
                                i42++;
                                if (((lqc) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i52 = 0; i52 < iArr2.length; i52++) {
                                lqc lqcVar2 = (lqc) arrayList3.get(i52);
                                boolean equalsIgnoreCase = fqcVar.a[iArr2[i52]].equalsIgnoreCase(lqcVar2.getWord());
                                if (!equalsIgnoreCase && lqcVar2.w) {
                                    gl.C3(lqcVar2);
                                }
                                lqcVar2.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                fqcVar.y = true;
                                fqcVar.Y();
                                gl.t1(fqcVar.fragmentView);
                                kbc kbcVar = fqcVar.c;
                                if (kbcVar != null) {
                                    kbcVar.run();
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
        linearLayout.addView(this.h, nme.t(-1, 48, 1, 0, 24, 0, 0));
        Y();
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
            scrollView.setPadding(i, gl.L(96.0f) + i2, i3, i4 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = gl.L(4.0f) + i;
            layoutParams.topMargin = gl.L(12.0f) + i2;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
