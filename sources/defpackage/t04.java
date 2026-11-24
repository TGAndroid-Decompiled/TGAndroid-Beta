package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t04 extends n39 {
    public boolean E;
    public boolean F;
    public final t14 G;
    public final o04 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public s04 y;

    public t04(t14 t14Var, Context context) {
        this.G = t14Var;
        o04 o04Var = new o04(context, t14Var.d1, new w72(this, (byte) 25), new kx3(this, (byte) 1), t14Var.a2);
        this.c = o04Var;
        o04Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), gl.L(5.0f));
        o04Var.setClipToPadding(false);
        o04Var.g3.r = false;
        o04Var.setNestedScrollingEnabled(false);
        o04Var.setDrawSelection(false);
        o04Var.setOnTouchListener(new p04(this, (byte) 0));
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 0 && i != 4) {
            return false;
        }
        return true;
    }

    public final void E(String str, boolean z) {
        t14 t14Var = this.G;
        g04 g04Var = t14Var.Q;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            w39 adapter = g04Var.getAdapter();
            d04 d04Var = t14Var.S;
            if (adapter != d04Var) {
                g04Var.setAdapter(d04Var);
                this.E = false;
            }
            this.d = 0L;
            t14Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        s04 s04Var = this.y;
        if (s04Var != null) {
            gl.r(s04Var);
        }
        if (!TextUtils.isEmpty(this.w)) {
            this.n.clear();
            this.F = false;
            t14Var.W.d(true);
            s04 s04Var2 = new s04(this);
            this.y = s04Var2;
            if (z) {
                j = 300;
            }
            gl.e3(s04Var2, j);
        }
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        String str;
        t14 t14Var = this.G;
        String[] strArr = t14Var.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = this.w;
        if (str3 == null) {
            return;
        }
        hq6.d0(t14Var.d1).b2(true, str2, str3, new au0((Object) this, str3, (Object) arrayList, (Object) runnable, (byte) 8), z);
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i = 3;
        } else if (arrayList.isEmpty()) {
            i = 1;
        }
        int size = arrayList.size() + i;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t04.d(int):int");
    }

    @Override
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    @Override
    public final void t(defpackage.s49 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t04.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        yc ycVar;
        t14 t14Var = this.G;
        wjb wjbVar = t14Var.a2;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            yc ycVar2 = new yc((byte) 18, t14Var.getContext(), this);
                            TextView textView = new TextView(t14Var.getContext());
                            tb4.u(16.0f, 2131748021, 1, textView, null);
                            int i2 = bkb.Cf;
                            zkb.X(textView, i2, wjbVar);
                            ycVar2.addView(textView, nme.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(t14Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232129);
                            zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
                            ycVar2.addView(imageView, nme.e(48, 48, 85));
                            imageView.setOnClickListener(new g6(this, (byte) 5));
                            ycVar2.setLayoutParams(new e49(-1, -2));
                            ycVar = ycVar2;
                        } else {
                            View view = new View(t14Var.getContext());
                            view.setLayoutParams(new e49(-1, gl.L(68.0f)));
                            ycVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams e49Var = new e49(-1, gl.L(79.0f));
                        View view2 = this.c;
                        view2.setLayoutParams(e49Var);
                        ycVar = view2;
                    }
                } else {
                    ycVar = new vza(t14Var.getContext(), true, false, t14Var.a2, t14Var.j2);
                }
            } else {
                View view3 = new View(t14Var.getContext());
                view3.setLayoutParams(new e49(-1, t14Var.c1));
                ycVar = view3;
            }
        } else {
            ycVar = new c14(t14Var.getContext());
        }
        return new s49(ycVar);
    }
}
