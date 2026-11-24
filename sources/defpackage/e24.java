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
public final class e24 extends q59 {
    public boolean E;
    public boolean F;
    public final e34 G;
    public final z14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public d24 y;

    public e24(e34 e34Var, Context context) {
        this.G = e34Var;
        z14 z14Var = new z14(context, e34Var.d1, new h92(this, (byte) 25), new yu3(this, (byte) 4), e34Var.a2);
        this.c = z14Var;
        z14Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), gm.L(5.0f));
        z14Var.setClipToPadding(false);
        z14Var.g3.r = false;
        z14Var.setNestedScrollingEnabled(false);
        z14Var.setDrawSelection(false);
        z14Var.setOnTouchListener(new a24(this, (byte) 0));
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 0 && i != 4) {
            return false;
        }
        return true;
    }

    public final void E(String str, boolean z) {
        e34 e34Var = this.G;
        r14 r14Var = e34Var.Q;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            y59 adapter = r14Var.getAdapter();
            o14 o14Var = e34Var.S;
            if (adapter != o14Var) {
                r14Var.setAdapter(o14Var);
                this.E = false;
            }
            this.d = 0L;
            e34Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        d24 d24Var = this.y;
        if (d24Var != null) {
            gm.r(d24Var);
        }
        if (!TextUtils.isEmpty(this.w)) {
            this.n.clear();
            this.F = false;
            e34Var.W.d(true);
            d24 d24Var2 = new d24(this);
            this.y = d24Var2;
            if (z) {
                j = 300;
            }
            gm.d3(d24Var2, j);
        }
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        String str;
        e34 e34Var = this.G;
        String[] strArr = e34Var.X0;
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
        hs6.d0(e34Var.d1).b2(true, str2, str3, new jv0((Object) this, str3, (Object) arrayList, (Object) runnable, (byte) 8), z);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e24.d(int):int");
    }

    @Override
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    @Override
    public final void t(defpackage.u69 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e24.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        yd ydVar;
        e34 e34Var = this.G;
        ylb ylbVar = e34Var.a2;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            yd ydVar2 = new yd((byte) 18, e34Var.getContext(), this);
                            TextView textView = new TextView(e34Var.getContext());
                            td4.v(16.0f, 2131747947, 1, textView, null);
                            int i2 = cmb.Cf;
                            anb.X(textView, i2, ylbVar);
                            ydVar2.addView(textView, qoe.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(e34Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232130);
                            anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
                            ydVar2.addView(imageView, qoe.e(48, 48, 85));
                            imageView.setOnClickListener(new g6(this, (byte) 5));
                            ydVar2.setLayoutParams(new g69(-1, -2));
                            ydVar = ydVar2;
                        } else {
                            View view = new View(e34Var.getContext());
                            view.setLayoutParams(new g69(-1, gm.L(68.0f)));
                            ydVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams g69Var = new g69(-1, gm.L(79.0f));
                        View view2 = this.c;
                        view2.setLayoutParams(g69Var);
                        ydVar = view2;
                    }
                } else {
                    ydVar = new w1b(e34Var.getContext(), true, false, e34Var.a2, e34Var.j2);
                }
            } else {
                View view3 = new View(e34Var.getContext());
                view3.setLayoutParams(new g69(-1, e34Var.c1));
                ydVar = view3;
            }
        } else {
            ydVar = new n24(e34Var.getContext());
        }
        return new u69(ydVar);
    }
}
