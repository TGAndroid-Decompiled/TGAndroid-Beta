package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public abstract class w81 extends FrameLayout implements vlb, wk7 {
    public static final int H = 0;
    public boolean E;
    public final fb F;
    public l81 G;
    public final ee0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final vgc d;
    public final d e;
    public final ArrayList f;
    public c81 h;
    public final wgc n;
    public final u81[] r;
    public j81 s;
    public int w;
    public final fja x;
    public int y;

    public w81(Context context, d dVar, sy4 sy4Var, fja fjaVar) {
        super(context);
        wgc v59Var;
        float f;
        this.b = new ArrayList();
        this.f = new ArrayList();
        u81[] u81VarArr = new u81[5];
        this.r = u81VarArr;
        this.F = new fb(this, (byte) 1);
        this.e = dVar;
        this.x = fjaVar;
        if (fjaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        u81VarArr[0] = new u81(jb6.M0(2131750733, null), 0, new m81(this));
        u81VarArr[1] = new u81(jb6.M0(2131748408, null), 1, new r81(this));
        u81VarArr[2] = new u81(jb6.M0(2131745148, null), 2, new o81(this));
        u81VarArr[3] = new u81(jb6.M0(2131748076, null), 3, new t81(this));
        int i = 0;
        while (true) {
            u81[] u81VarArr2 = this.r;
            if (i >= u81VarArr2.length) {
                break;
            }
            u81 u81Var = u81VarArr2[i];
            if (u81Var != null) {
                this.f.add(i, u81Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        if (fjaVar == null) {
            v59Var = new wgc(getContext(), null);
        } else {
            v59Var = new v59(context, dVar.getResourceProvider(), fjaVar);
        }
        this.n = v59Var;
        v59Var.setAllowDisallowInterceptTouch(false);
        if (sy4Var != null) {
            sy4Var.c(v59Var);
        }
        if (sy4Var == null && fjaVar == null) {
            f = 48.0f;
        } else {
            f = 0.0f;
        }
        addView(v59Var, qoe.d(-1, -1.0f, 48, 0.0f, f, 0.0f, 0.0f));
        vgc l = v59Var.l(sy4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, qoe.c(48.0f, -1));
        if (sy4Var != null) {
            frameLayout.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        }
        addView(frameLayout, qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        v59Var.setAdapter(new g81(this, context, sy4Var, dVar, fjaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        anb.h(cmb.c6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, qoe.c(48.0f, -1));
        gm.T3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ee0 ee0Var = new ee0(true);
        this.a = ee0Var;
        imageView.setImageDrawable(ee0Var);
        int i2 = cmb.x8;
        ee0Var.a(cmb.w0(null, i2, false));
        int i3 = cmb.y8;
        fg0 f0 = cmb.f0(cmb.w0(null, i3, false), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        imageView.setContentDescription(jb6.M0(2131751978, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
        this.b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w81 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                w81 w81Var = this.b;
                switch (b) {
                    case 0:
                        w81Var.G.v();
                        return;
                    default:
                        w81Var.G.clear();
                        return;
                }
            }
        });
        io ioVar = new io(context, true, true, true);
        ioVar.setTextSize(gm.L(18.0f));
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, i2, null);
        linearLayout.addView(ioVar, qoe.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(ioVar);
        r7 r7Var = new r7(context, null, cmb.w0(null, i3, false), cmb.w0(null, i2, false), false, null);
        r7Var.setIcon(2131232098);
        if (r7Var.getBackground() != null) {
            Drawable background = r7Var.getBackground();
            wmb M2 = anb.M(i3);
            r7Var.setBackground(background);
            anb.j(r7Var, background, null, M2, null);
        }
        if (r7Var.getIconView() != null) {
            anb.s(r7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        r7Var.setContentDescription(jb6.M0(2131751535, null));
        r7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r7Var, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
        this.b.add(r7Var);
        r7Var.setOnClickListener(new View.OnClickListener(this) {
            public final w81 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                w81 w81Var = this.b;
                switch (b) {
                    case 0:
                        w81Var.G.v();
                        return;
                    default:
                        w81Var.G.clear();
                        return;
                }
            }
        });
    }

    public final r59 a(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof v81) {
            return ((v81) view).a;
        }
        return (r59) view;
    }

    public final void b(b81 b81Var, n81 n81Var) {
        boolean z;
        r59 listView = getListView();
        if (n81Var.e == 2) {
            if (listView.getAdapter() instanceof o81) {
                o81 o81Var = (o81) listView.getAdapter();
                PhotoViewer r0 = PhotoViewer.r0();
                d dVar = this.e;
                r0.T1(null, dVar, null);
                j81 j81Var = this.s;
                if (j81Var == null) {
                    j81Var = new j81(this);
                    this.s = j81Var;
                }
                j81Var.a = listView;
                File file = b81Var.a;
                File file2 = b81Var.a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    gm.s2(file2, file2.getName(), null, dVar.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file2.getPath();
                    if (b81Var.d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new jo6(0, path, 0, z, 0, 0));
                    PhotoViewer.r0().o1(arrayList, 0, -1, false, this.s, null);
                }
            } else {
                return;
            }
        }
        if (n81Var.e == 3) {
            if (MediaController.w().D(b81Var.f)) {
                if (!MediaController.w().C()) {
                    MediaController.w().Q(b81Var.f, true);
                    return;
                } else {
                    MediaController.w().R(b81Var.f);
                    return;
                }
            }
            MediaController.w().R(b81Var.f);
        }
    }

    public final void c(p81 p81Var, r81 r81Var, r59 r59Var) {
        ArrayList arrayList = r81Var.e;
        PhotoViewer.r0().T1(null, this.e, null);
        j81 j81Var = this.s;
        if (j81Var == null) {
            j81Var = new j81(this);
            this.s = j81Var;
        }
        j81Var.a = r59Var;
        if (arrayList.indexOf(p81Var) >= 0) {
            PhotoViewer.r0().o1(r81Var.r, arrayList.indexOf(p81Var), -1, false, this.s, null);
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.d():void");
    }

    public final void e() {
        int i = 0;
        while (true) {
            wgc wgcVar = this.n;
            if (i < wgcVar.getViewPages().length) {
                r59 a = a(wgcVar.getViewPages()[i]);
                if (a != null) {
                    gm.V3(a);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public r59 getListView() {
        return a(this.n.getCurrentView());
    }

    public wgc getViewPager() {
        return this.n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.F);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    public void setCacheModel(c81 c81Var) {
        this.h = c81Var;
        d();
    }

    public void setDelegate(l81 l81Var) {
        this.G = l81Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.a.a(cmb.w0(null, cmb.x8, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
