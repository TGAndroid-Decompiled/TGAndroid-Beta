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
public abstract class o71 extends FrameLayout implements tjb, ui7 {
    public static final int H = 0;
    public boolean E;
    public final fb F;
    public d71 G;
    public final ed0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final vec d;
    public final d e;
    public final ArrayList f;
    public v61 h;
    public final wec n;
    public final m71[] r;
    public c71 s;
    public int w;
    public final dha x;
    public int y;

    public o71(Context context, d dVar, qw4 qw4Var, dha dhaVar) {
        super(context);
        wec s39Var;
        float f;
        this.b = new ArrayList();
        this.f = new ArrayList();
        m71[] m71VarArr = new m71[5];
        this.r = m71VarArr;
        this.F = new fb(this, (byte) 1);
        this.e = dVar;
        this.x = dhaVar;
        if (dhaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        m71VarArr[0] = new m71(k96.M0(2131750784, null), 0, new e71(this));
        m71VarArr[1] = new m71(k96.M0(2131748459, null), 1, new j71(this));
        m71VarArr[2] = new m71(k96.M0(2131745222, null), 2, new g71(this));
        m71VarArr[3] = new m71(k96.M0(2131748127, null), 3, new l71(this));
        int i = 0;
        while (true) {
            m71[] m71VarArr2 = this.r;
            if (i >= m71VarArr2.length) {
                break;
            }
            m71 m71Var = m71VarArr2[i];
            if (m71Var != null) {
                this.f.add(i, m71Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        if (dhaVar == null) {
            s39Var = new wec(getContext(), null);
        } else {
            s39Var = new s39(context, dVar.getResourceProvider(), dhaVar);
        }
        this.n = s39Var;
        s39Var.setAllowDisallowInterceptTouch(false);
        if (qw4Var != null) {
            qw4Var.c(s39Var);
        }
        if (qw4Var == null && dhaVar == null) {
            f = 48.0f;
        } else {
            f = 0.0f;
        }
        addView(s39Var, nme.d(-1, -1.0f, 48, 0.0f, f, 0.0f, 0.0f));
        vec l = s39Var.l(qw4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, nme.c(48.0f, -1));
        if (qw4Var != null) {
            frameLayout.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        }
        addView(frameLayout, nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        s39Var.setAdapter(new z61(this, context, qw4Var, dVar, dhaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        zkb.h(bkb.c6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, nme.c(48.0f, -1));
        gl.T3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ed0 ed0Var = new ed0(true);
        this.a = ed0Var;
        imageView.setImageDrawable(ed0Var);
        int i2 = bkb.x8;
        ed0Var.a(bkb.w0(null, i2, false));
        int i3 = bkb.y8;
        ff0 f0 = bkb.f0(bkb.w0(null, i3, false), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        imageView.setContentDescription(k96.M0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
        this.b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o71 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                o71 o71Var = this.b;
                switch (b) {
                    case 0:
                        o71Var.G.H();
                        return;
                    default:
                        o71Var.G.clear();
                        return;
                }
            }
        });
        hn hnVar = new hn(context, true, true, true);
        hnVar.setTextSize(gl.L(18.0f));
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, i2, null);
        linearLayout.addView(hnVar, nme.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(hnVar);
        r7 r7Var = new r7(context, null, bkb.w0(null, i3, false), bkb.w0(null, i2, false), false, null);
        r7Var.setIcon(2131232097);
        if (r7Var.getBackground() != null) {
            Drawable background = r7Var.getBackground();
            vkb M2 = zkb.M(i3);
            r7Var.setBackground(background);
            zkb.j(r7Var, background, null, M2, null);
        }
        if (r7Var.getIconView() != null) {
            zkb.s(r7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        r7Var.setContentDescription(k96.M0(2131751586, null));
        r7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r7Var, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
        this.b.add(r7Var);
        r7Var.setOnClickListener(new View.OnClickListener(this) {
            public final o71 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                o71 o71Var = this.b;
                switch (b) {
                    case 0:
                        o71Var.G.H();
                        return;
                    default:
                        o71Var.G.clear();
                        return;
                }
            }
        });
    }

    public final o39 a(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof n71) {
            return ((n71) view).a;
        }
        return (o39) view;
    }

    public final void b(u61 u61Var, f71 f71Var) {
        boolean z;
        o39 listView = getListView();
        if (f71Var.e == 2) {
            if (listView.getAdapter() instanceof g71) {
                g71 g71Var = (g71) listView.getAdapter();
                PhotoViewer r0 = PhotoViewer.r0();
                d dVar = this.e;
                r0.T1(null, dVar, null);
                c71 c71Var = this.s;
                if (c71Var == null) {
                    c71Var = new c71(this);
                    this.s = c71Var;
                }
                c71Var.a = listView;
                File file = u61Var.a;
                File file2 = u61Var.a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    gl.s2(file2, file2.getName(), null, dVar.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file2.getPath();
                    if (u61Var.d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new jm6(0, path, 0, z, 0, 0));
                    PhotoViewer.r0().o1(arrayList, 0, -1, false, this.s, null);
                }
            } else {
                return;
            }
        }
        if (f71Var.e == 3) {
            if (MediaController.w().D(u61Var.f)) {
                if (!MediaController.w().C()) {
                    MediaController.w().Q(u61Var.f, true);
                    return;
                } else {
                    MediaController.w().R(u61Var.f);
                    return;
                }
            }
            MediaController.w().R(u61Var.f);
        }
    }

    public final void c(h71 h71Var, j71 j71Var, o39 o39Var) {
        ArrayList arrayList = j71Var.e;
        PhotoViewer.r0().T1(null, this.e, null);
        c71 c71Var = this.s;
        if (c71Var == null) {
            c71Var = new c71(this);
            this.s = c71Var;
        }
        c71Var.a = o39Var;
        if (arrayList.indexOf(h71Var) >= 0) {
            PhotoViewer.r0().o1(j71Var.r, arrayList.indexOf(h71Var), -1, false, this.s, null);
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o71.d():void");
    }

    public final void e() {
        int i = 0;
        while (true) {
            wec wecVar = this.n;
            if (i < wecVar.getViewPages().length) {
                o39 a = a(wecVar.getViewPages()[i]);
                if (a != null) {
                    gl.V3(a);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public o39 getListView() {
        return a(this.n.getCurrentView());
    }

    public wec getViewPager() {
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

    public void setCacheModel(v61 v61Var) {
        this.h = v61Var;
        d();
    }

    public void setDelegate(d71 d71Var) {
        this.G = d71Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.a.a(bkb.w0(null, bkb.x8, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
