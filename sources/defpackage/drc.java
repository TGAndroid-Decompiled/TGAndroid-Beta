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
import org.telegram.ui.ActionBar.d;
public final class drc extends d {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public b61 e;
    public Runnable f;
    public boolean h;

    public drc() {
        super(null);
        this.a = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList = this.a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        hsc hscVar = new hsc(arrayList, new cpc(this, (byte) 4));
        hscVar.setCurrentAccount(this.currentAccount);
        presentFragment(hscVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.a;
            boolean z = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(vqc.j0(0, size, this.resourceProvider, context, arrayList), qoe.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), qoe.o(10, 0));
            this.d.addView(vqc.j0(size, arrayList.size(), this.resourceProvider, context, arrayList), qoe.p(0, -2, 1.0f, 48));
            b61 b61Var = this.e;
            if (b61Var != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z = false;
                }
                b61Var.setEnabled(z);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        anb.h(cmb.c6, this.resourceProvider, frameLayout);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, gm.L(96.0f), 0, 0);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(36.0f), 0, gm.L(36.0f), gm.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i3 = cmb.F6;
        anb.s(imageView2, i3, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.c.setImageResource(2131231245);
        ImageView imageView3 = this.c;
        int i4 = cmb.h6;
        anb.R(imageView3, cmb.f0(cmb.v0(i4, this.resourceProvider), 3, -1), null, anb.M(i4), this.resourceProvider);
        this.c.setOnClickListener(new View.OnClickListener(this) {
            public final drc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                drc drcVar = this.b;
                switch (b) {
                    case 0:
                        drcVar.finishFragment();
                        return;
                    default:
                        drcVar.Z();
                        return;
                }
            }
        });
        frameLayout.addView(this.c, qoe.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        anb.X(textView, i3, this.resourceProvider);
        if (this.h) {
            i = 2131742829;
        } else {
            i = 2131742752;
        }
        textView.setText(jb6.M0(i, null));
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        anb.X(m, cmb.y6, this.resourceProvider);
        if (this.h) {
            i2 = 2131742828;
        } else {
            i2 = 2131742751;
        }
        m.setText(jb6.M0(i2, null));
        linearLayout.addView(m, qoe.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, qoe.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), qoe.l(1.0f, -1, 0));
        b61 b61Var = new b61(this.resourceProvider, context, true);
        this.e = b61Var;
        b61Var.f();
        this.e.setText(jb6.M0(2131742837, null));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final drc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                drc drcVar = this.b;
                switch (b) {
                    case 0:
                        drcVar.finishFragment();
                        return;
                    default:
                        drcVar.Z();
                        return;
                }
            }
        });
        linearLayout.addView(this.e, qoe.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        ScrollView scrollView = this.b;
        if (scrollView != null) {
            scrollView.setPadding(i, gm.L(96.0f) + i2, i3, i4);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = gm.L(4.0f) + i;
            layoutParams.topMargin = gm.L(12.0f) + i2;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
