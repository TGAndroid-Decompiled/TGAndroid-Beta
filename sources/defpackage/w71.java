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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public abstract class w71 extends FrameLayout implements snb, cl7 {
    public static final int H = 0;
    public boolean E;
    public final gb F;
    public l71 G;
    public final gd0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final uic d;
    public final e e;
    public final ArrayList f;
    public d71 h;
    public final vic n;
    public final u71[] r;
    public k71 s;
    public int w;
    public final wka x;
    public int y;

    public w71(Context context, e eVar, vy4 vy4Var, wka wkaVar) {
        super(context);
        vic h79Var;
        float f;
        this.b = new ArrayList();
        this.f = new ArrayList();
        u71[] u71VarArr = new u71[5];
        this.r = u71VarArr;
        this.F = new gb(this, (byte) 1);
        this.e = eVar;
        this.x = wkaVar;
        if (wkaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        u71VarArr[0] = new u71(ob6.M0(2131750761, null), 0, new m71(this));
        u71VarArr[1] = new u71(ob6.M0(2131748405, null), 1, new r71(this));
        u71VarArr[2] = new u71(ob6.M0(2131745142, null), 2, new o71(this));
        u71VarArr[3] = new u71(ob6.M0(2131748073, null), 3, new t71(this));
        int i = 0;
        while (true) {
            u71[] u71VarArr2 = this.r;
            if (i >= u71VarArr2.length) {
                break;
            }
            u71 u71Var = u71VarArr2[i];
            if (u71Var != null) {
                this.f.add(i, u71Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        if (wkaVar == null) {
            h79Var = new vic(getContext(), null);
        } else {
            h79Var = new h79(context, eVar.getResourceProvider(), wkaVar);
        }
        this.n = h79Var;
        h79Var.setAllowDisallowInterceptTouch(false);
        if (vy4Var != null) {
            vy4Var.c(h79Var);
        }
        if (vy4Var == null && wkaVar == null) {
            f = 48.0f;
        } else {
            f = 0.0f;
        }
        addView(h79Var, tre.d(-1, -1.0f, 48, 0.0f, f, 0.0f, 0.0f));
        uic l = h79Var.l(vy4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, tre.c(48.0f, -1));
        if (vy4Var != null) {
            frameLayout.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        }
        addView(frameLayout, tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        h79Var.setAdapter(new h71(this, context, vy4Var, eVar, wkaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        yob.h(aob.d6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, tre.c(48.0f, -1));
        hl.T3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        gd0 gd0Var = new gd0(true);
        this.a = gd0Var;
        imageView.setImageDrawable(gd0Var);
        int i2 = aob.y8;
        gd0Var.a(aob.w0(null, i2, false));
        int i3 = aob.z8;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        imageView.setContentDescription(ob6.M0(2131752006, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        this.b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w71 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                w71 w71Var = this.b;
                switch (b) {
                    case 0:
                        w71Var.G.v();
                        return;
                    default:
                        w71Var.G.clear();
                        return;
                }
            }
        });
        in inVar = new in(context, true, true, true);
        inVar.setTextSize(hl.L(18.0f));
        inVar.setTypeface(hl.o());
        yob.U(inVar, i2, null);
        linearLayout.addView(inVar, tre.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(inVar);
        s7 s7Var = new s7(context, null, aob.w0(null, i3, false), aob.w0(null, i2, false), false, null);
        s7Var.setIcon(2131232097);
        if (s7Var.getBackground() != null) {
            Drawable background = s7Var.getBackground();
            uob M2 = yob.M(i3);
            s7Var.setBackground(background);
            yob.j(s7Var, background, null, M2, null);
        }
        if (s7Var.getIconView() != null) {
            yob.s(s7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        s7Var.setContentDescription(ob6.M0(2131751563, null));
        s7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(s7Var, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        this.b.add(s7Var);
        s7Var.setOnClickListener(new View.OnClickListener(this) {
            public final w71 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                w71 w71Var = this.b;
                switch (b) {
                    case 0:
                        w71Var.G.v();
                        return;
                    default:
                        w71Var.G.clear();
                        return;
                }
            }
        });
    }

    public final d79 a(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof v71) {
            return ((v71) view).a;
        }
        return (d79) view;
    }

    public final void b(c71 c71Var, n71 n71Var) {
        boolean z;
        d79 listView = getListView();
        if (n71Var.e == 2) {
            if (listView.getAdapter() instanceof o71) {
                o71 o71Var = (o71) listView.getAdapter();
                PhotoViewer q0 = PhotoViewer.q0();
                e eVar = this.e;
                q0.T1(null, eVar, null);
                k71 k71Var = this.s;
                if (k71Var == null) {
                    k71Var = new k71(this);
                    this.s = k71Var;
                }
                k71Var.a = listView;
                File file = c71Var.a;
                File file2 = c71Var.a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    hl.s2(file2, file2.getName(), null, eVar.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file2.getPath();
                    if (c71Var.d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new no6(0, path, 0, z, 0, 0));
                    PhotoViewer.q0().o1(arrayList, 0, -1, false, this.s, null);
                }
            } else {
                return;
            }
        }
        if (n71Var.e == 3) {
            if (MediaController.z().H(c71Var.f)) {
                if (!MediaController.z().G()) {
                    MediaController.z().U(c71Var.f, true);
                    return;
                } else {
                    MediaController.z().V(c71Var.f);
                    return;
                }
            }
            MediaController.z().V(c71Var.f);
        }
    }

    public final void c(p71 p71Var, r71 r71Var, d79 d79Var) {
        ArrayList arrayList = r71Var.e;
        PhotoViewer.q0().T1(null, this.e, null);
        k71 k71Var = this.s;
        if (k71Var == null) {
            k71Var = new k71(this);
            this.s = k71Var;
        }
        k71Var.a = d79Var;
        if (arrayList.indexOf(p71Var) >= 0) {
            PhotoViewer.q0().o1(r71Var.r, arrayList.indexOf(p71Var), -1, false, this.s, null);
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w71.d():void");
    }

    public final void e() {
        int i = 0;
        while (true) {
            vic vicVar = this.n;
            if (i < vicVar.getViewPages().length) {
                d79 a = a(vicVar.getViewPages()[i]);
                if (a != null) {
                    hl.V3(a);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public d79 getListView() {
        return a(this.n.getCurrentView());
    }

    public vic getViewPager() {
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

    public void setCacheModel(d71 d71Var) {
        this.h = d71Var;
        d();
    }

    public void setDelegate(l71 l71Var) {
        this.G = l71Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.a.a(aob.w0(null, aob.y8, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
