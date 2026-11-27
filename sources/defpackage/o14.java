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
public final class o14 extends c79 {
    public boolean E;
    public boolean F;
    public final o24 G;
    public final j14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public n14 y;

    public o14(o24 o24Var, Context context) {
        this.G = o24Var;
        j14 j14Var = new j14(context, o24Var.d1, new n82(this, (byte) 25), new lu3(this, (byte) 3), o24Var.a2);
        this.c = j14Var;
        j14Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), hl.L(5.0f));
        j14Var.setClipToPadding(false);
        j14Var.g3.r = false;
        j14Var.setNestedScrollingEnabled(false);
        j14Var.setDrawSelection(false);
        j14Var.setOnTouchListener(new k14(this, (byte) 0));
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 0 && i != 4) {
            return false;
        }
        return true;
    }

    public final void E(String str, boolean z) {
        o24 o24Var = this.G;
        b14 b14Var = o24Var.Q;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            j79 adapter = b14Var.getAdapter();
            y04 y04Var = o24Var.S;
            if (adapter != y04Var) {
                b14Var.setAdapter(y04Var);
                this.E = false;
            }
            this.d = 0L;
            o24Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        n14 n14Var = this.y;
        if (n14Var != null) {
            hl.r(n14Var);
        }
        if (!TextUtils.isEmpty(this.w)) {
            this.n.clear();
            this.F = false;
            o24Var.W.d(true);
            n14 n14Var2 = new n14(this);
            this.y = n14Var2;
            if (z) {
                j = 300;
            }
            hl.d3(n14Var2, j);
        }
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        String str;
        o24 o24Var = this.G;
        String[] strArr = o24Var.X0;
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
        ls6.d0(o24Var.d1).b2(true, str2, str3, new ku0((Object) this, str3, (Object) arrayList, (Object) runnable, (byte) 8), z);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.d(int):int");
    }

    @Override
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    @Override
    public final void t(defpackage.f89 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        zc zcVar;
        o24 o24Var = this.G;
        vnb vnbVar = o24Var.a2;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            zc zcVar2 = new zc((byte) 18, o24Var.getContext(), this);
                            TextView textView = new TextView(o24Var.getContext());
                            qd4.u(16.0f, 2131747944, 1, textView, null);
                            int i2 = aob.Df;
                            yob.X(textView, i2, vnbVar);
                            zcVar2.addView(textView, tre.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(o24Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232129);
                            yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                            zcVar2.addView(imageView, tre.e(48, 48, 85));
                            imageView.setOnClickListener(new h6(this, (byte) 5));
                            zcVar2.setLayoutParams(new r79(-1, -2));
                            zcVar = zcVar2;
                        } else {
                            View view = new View(o24Var.getContext());
                            view.setLayoutParams(new r79(-1, hl.L(68.0f)));
                            zcVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams r79Var = new r79(-1, hl.L(79.0f));
                        View view2 = this.c;
                        view2.setLayoutParams(r79Var);
                        zcVar = view2;
                    }
                } else {
                    zcVar = new u3b(o24Var.getContext(), true, false, o24Var.a2, o24Var.j2);
                }
            } else {
                View view3 = new View(o24Var.getContext());
                view3.setLayoutParams(new r79(-1, o24Var.c1));
                zcVar = view3;
            }
        } else {
            zcVar = new x14(o24Var.getContext());
        }
        return new f89(zcVar);
    }
}
