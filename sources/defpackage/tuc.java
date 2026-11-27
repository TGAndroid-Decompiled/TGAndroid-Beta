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
import org.telegram.ui.ActionBar.e;
public final class tuc extends e {
    public final String[] a;
    public final int[] b;
    public final olc c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public c51 h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public tuc(ArrayList arrayList, olc olcVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            lq5.j("Expected a 12- or 24-word recovery phrase");
            throw null;
        }
        this.c = olcVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.a.length; i2 = qd4.g(i2, i2, 1, arrayList2)) {
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
            z &= !((zuc) obj).getWord().isEmpty();
        }
        c51 c51Var = this.h;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        c51Var.setVisibility(i);
        c51 c51Var2 = this.h;
        if (z && !this.y) {
            z2 = true;
        }
        c51Var2.setEnabled(z2);
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        wma wmaVar = new wma(context, null);
        wmaVar.setDelegate(new yv0(this, (byte) 3));
        yob.h(aob.d6, this.resourceProvider, wmaVar);
        this.fragmentView = wmaVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, hl.L(96.0f), 0, 0);
        wmaVar.addView(this.e, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i2 = aob.G6;
        yob.s(imageView2, i2, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(2131231244);
        ImageView imageView3 = this.f;
        int i3 = aob.i6;
        yob.R(imageView3, aob.f0(aob.v0(i3, this.resourceProvider), 3, -1), null, yob.M(i3), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final tuc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                tuc tucVar = this.b;
                switch (b) {
                    case 0:
                        tucVar.finishFragment();
                        return;
                    default:
                        int[] iArr = tucVar.b;
                        ArrayList arrayList = tucVar.d;
                        if (!tucVar.y && arrayList.size() == iArr.length) {
                            boolean z = f11.a;
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (((zuc) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i5 = 0; i5 < iArr.length; i5++) {
                                zuc zucVar = (zuc) arrayList.get(i5);
                                boolean equalsIgnoreCase = tucVar.a[iArr[i5]].equalsIgnoreCase(zucVar.getWord());
                                if (!equalsIgnoreCase && zucVar.w) {
                                    hl.B3(zucVar);
                                }
                                zucVar.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                tucVar.y = true;
                                tucVar.Y();
                                hl.t1(tucVar.fragmentView);
                                olc olcVar = tucVar.c;
                                if (olcVar != null) {
                                    olcVar.run();
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
        wmaVar.addView(this.f, tre.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setAspectFit(true);
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        de0Var.getImageReceiver().N(1);
        linearLayout.addView(de0Var, tre.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        ik8.x(textView, i2, this.resourceProvider, null, 2131742636);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        yob.X(m, aob.z6, this.resourceProvider);
        int[] iArr = this.b;
        uh9.r(null, null, 2131742635, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, m);
        linearLayout.addView(m, tre.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, tre.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList.add(((zuc) obj).getWord());
        }
        arrayList2.clear();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            zuc zucVar = new zuc(iArr[i5], this.resourceProvider, context, false);
            if (i5 < arrayList.size()) {
                zucVar.setText((String) arrayList.get(i5));
            }
            zucVar.setOnTextChangedListener(new olc(this, (byte) 15));
            zucVar.setOnNextListener(new mpc(this, i5, zucVar, (byte) 4));
            if (i5 == 0) {
                i = 0;
            } else {
                i = 12;
            }
            linearLayout2.addView(zucVar, tre.t(-1, 50, 1, 0, i, 0, 0));
            arrayList2.add(zucVar);
        }
        linearLayout.addView(new View(context), tre.l(1.0f, -1, 0));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.h = c51Var;
        c51Var.f();
        this.h.setText(ob6.M0(2131742805, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final tuc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                tuc tucVar = this.b;
                switch (b) {
                    case 0:
                        tucVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = tucVar.b;
                        ArrayList arrayList3 = tucVar.d;
                        if (!tucVar.y && arrayList3.size() == iArr2.length) {
                            boolean z = f11.a;
                            int size2 = arrayList3.size();
                            int i42 = 0;
                            while (i42 < size2) {
                                Object obj2 = arrayList3.get(i42);
                                i42++;
                                if (((zuc) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z2 = true;
                            for (int i52 = 0; i52 < iArr2.length; i52++) {
                                zuc zucVar2 = (zuc) arrayList3.get(i52);
                                boolean equalsIgnoreCase = tucVar.a[iArr2[i52]].equalsIgnoreCase(zucVar2.getWord());
                                if (!equalsIgnoreCase && zucVar2.w) {
                                    hl.B3(zucVar2);
                                }
                                zucVar2.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                tucVar.y = true;
                                tucVar.Y();
                                hl.t1(tucVar.fragmentView);
                                olc olcVar = tucVar.c;
                                if (olcVar != null) {
                                    olcVar.run();
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
        linearLayout.addView(this.h, tre.t(-1, 48, 1, 0, 24, 0, 0));
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
            scrollView.setPadding(i, hl.L(96.0f) + i2, i3, i4 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = hl.L(4.0f) + i;
            layoutParams.topMargin = hl.L(12.0f) + i2;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
