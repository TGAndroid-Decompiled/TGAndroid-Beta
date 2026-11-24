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
public final class bpc extends d {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public u41 e;
    public Runnable f;
    public boolean h;

    public bpc() {
        super(null);
        this.a = new ArrayList();
    }

    public final void Y() {
        ArrayList arrayList = this.a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        fqc fqcVar = new fqc(arrayList, new kbc(this, (byte) 26));
        fqcVar.setCurrentAccount(this.currentAccount);
        presentFragment(fqcVar);
    }

    public final void Z() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.a;
            boolean z = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(toc.i0(0, size, this.resourceProvider, context, arrayList), nme.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), nme.o(10, 0));
            this.d.addView(toc.i0(size, arrayList.size(), this.resourceProvider, context, arrayList), nme.p(0, -2, 1.0f, 48));
            u41 u41Var = this.e;
            if (u41Var != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z = false;
                }
                u41Var.setEnabled(z);
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
        zkb.h(bkb.c6, this.resourceProvider, frameLayout);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, gl.L(96.0f), 0, 0);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(36.0f), 0, gl.L(36.0f), gl.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i3 = bkb.F6;
        zkb.s(imageView2, i3, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.c.setImageResource(2131231244);
        ImageView imageView3 = this.c;
        int i4 = bkb.h6;
        zkb.R(imageView3, bkb.f0(bkb.v0(i4, this.resourceProvider), 3, -1), null, zkb.M(i4), this.resourceProvider);
        this.c.setOnClickListener(new View.OnClickListener(this) {
            public final bpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                bpc bpcVar = this.b;
                switch (b) {
                    case 0:
                        bpcVar.finishFragment();
                        return;
                    default:
                        bpcVar.Y();
                        return;
                }
            }
        });
        frameLayout.addView(this.c, nme.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        zkb.X(textView, i3, this.resourceProvider);
        if (this.h) {
            i = 2131742903;
        } else {
            i = 2131742826;
        }
        textView.setText(k96.M0(i, null));
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        zkb.X(m, bkb.y6, this.resourceProvider);
        if (this.h) {
            i2 = 2131742902;
        } else {
            i2 = 2131742825;
        }
        m.setText(k96.M0(i2, null));
        linearLayout.addView(m, nme.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, nme.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), nme.l(1.0f, -1, 0));
        u41 u41Var = new u41(this.resourceProvider, context, true);
        this.e = u41Var;
        u41Var.f();
        this.e.setText(k96.M0(2131742911, null));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final bpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                bpc bpcVar = this.b;
                switch (b) {
                    case 0:
                        bpcVar.finishFragment();
                        return;
                    default:
                        bpcVar.Y();
                        return;
                }
            }
        });
        linearLayout.addView(this.e, nme.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
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
            scrollView.setPadding(i, gl.L(96.0f) + i2, i3, i4);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = gl.L(4.0f) + i;
            layoutParams.topMargin = gl.L(12.0f) + i2;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
