package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.sl0;
public final class e2 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f14522a;
    public final FrameLayout f14523b;
    public final ImageView f14524c;
    public final sl0 d;
    public final ah.i f14525e;
    public final int f14526f;
    public d2 h;
    public boolean f14527n;
    public final ImageView f14528r;
    public boolean f14529s;
    public boolean f14530w;
    public q10 f14531x;

    public e2(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f14526f = -1;
        this.f14522a = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14523b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14524c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        sl0 sl0Var = new sl0();
        this.d = sl0Var;
        sl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.n6.Bf;
        sl0Var.a(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        imageView.setImageDrawable(sl0Var);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f14525e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.D(iVar, i10, i6Var);
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(gd.M0(2131745641, null));
        int i11 = org.telegram.ui.ActionBar.n6.Di;
        org.telegram.ui.ActionBar.u6.l(iVar, 30, i11, i6Var);
        org.telegram.ui.ActionBar.u6.l(iVar, 36, i11, i6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 6));
        ImageView imageView2 = new ImageView(context);
        this.f14528r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new c2(i6Var));
        int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f14208b;

            {
                this.f14208b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14208b.b();
                        return;
                    default:
                        e2 e2Var = this.f14208b;
                        int i13 = e2Var.d.f39777k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f14525e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f14208b;

            {
                this.f14208b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14208b.b();
                        return;
                    default:
                        e2 e2Var = this.f14208b;
                        int i13 = e2Var.d.f39777k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f14525e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i7, boolean z10) {
        int i10;
        ah.i iVar;
        if (this.f14526f == i7 && this.h != null) {
            return;
        }
        d2 d2Var = this.h;
        FrameLayout frameLayout = this.f14523b;
        if (d2Var != null) {
            frameLayout.removeView(d2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        d2 d2Var2 = new d2(this, context, i10, this.f14522a, z10);
        this.h = d2Var2;
        d2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f14525e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new x10(this) {
            public final e2 f14261b;

            {
                this.f14261b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f14261b;
                        ah.i iVar2 = e2Var.f14525e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        ev0 ev0Var = (ev0) obj;
                        e2 e2Var2 = this.f14261b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == ev0Var) {
                                e2Var2.h.I1(null);
                                q10 q10Var = e2Var2.f14531x;
                                if (q10Var != null) {
                                    q10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(ev0Var);
                            String str = ev0Var.f34808a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            q10 q10Var2 = e2Var2.f14531x;
                            if (q10Var2 != null) {
                                q10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new x10(this) {
            public final e2 f14261b;

            {
                this.f14261b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f14261b;
                        ah.i iVar2 = e2Var.f14525e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        ev0 ev0Var = (ev0) obj;
                        e2 e2Var2 = this.f14261b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == ev0Var) {
                                e2Var2.h.I1(null);
                                q10 q10Var = e2Var2.f14531x;
                                if (q10Var != null) {
                                    q10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(ev0Var);
                            String str = ev0Var.f34808a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            q10 q10Var2 = e2Var2.f14531x;
                            if (q10Var2 != null) {
                                q10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f14525e.setText("");
        q10 q10Var = this.f14531x;
        if (q10Var != null) {
            q10Var.a(null, -1);
        }
        d2 d2Var = this.h;
        if (d2Var != null) {
            d2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f14530w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i7;
        d2 d2Var;
        d2 d2Var2;
        boolean z11 = this.f14530w;
        ah.i iVar = this.f14525e;
        if (z11 && ((iVar.length() != 0 || ((d2Var2 = this.h) != null && d2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iVar.length() <= 0 && ((d2Var = this.h) == null || d2Var.f36227w3 <= 0.5f || ((d2Var == null || !d2Var.f36222r3) && d2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f14530w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            sl0 sl0Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = this.f14522a;
            if (sl0Var != null) {
                sl0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
            ImageView imageView = this.f14524c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f14525e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            ImageView imageView2 = this.f14528r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
