package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da1 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        String str;
        byte b2;
        boolean z2;
        SpannableString spannableString;
        int i2;
        boolean z3;
        ?? r12;
        int i3;
        fa1 fa1Var = (fa1) c6cVar.H;
        ea1 ea1Var = (ea1) view;
        View.OnClickListener onClickListener = c6cVar.E;
        int i4 = ea1Var.a;
        hd0 hd0Var = ea1Var.b;
        ut8 ut8Var = ea1Var.d;
        ImageView imageView = ea1Var.c;
        boolean z4 = fa1Var.e;
        ArrayList arrayList = fa1Var.c;
        ArrayList arrayList2 = fa1Var.b;
        if (z4) {
            i = 2131231920;
        } else {
            i = 2131231776;
        }
        imageView.setImageResource(i);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (jb6.a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder k = b10.k(str, "  ");
            b2 = 1;
            k.append(jb6.t(message.date));
            spannableString = new SpannableString(k.toString());
            z2 = false;
        } else {
            b2 = 1;
            z2 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), jb6.t(message.date)));
        }
        byte b3 = fa1Var.d;
        Object obj = null;
        if (b3 != 0) {
            if (b3 != b2) {
                if (b3 != 2) {
                    if (b3 == 3) {
                        Drawable mutate = ea1Var.getContext().getResources().getDrawable(2131231940).mutate();
                        boolean z5 = z2;
                        mutate.setBounds(z5 ? 1 : 0, z5 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.q7, z5), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z5 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = ea1Var.getContext().getResources().getDrawable(2131231938).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.q7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (ea1Var.h == null) {
                    Drawable mutate3 = ea1Var.getContext().getResources().getDrawable(2131231938).mutate();
                    i3 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    anb.x(ut8Var, mutate3, cmb.z6, null, PorterDuff.Mode.MULTIPLY);
                    ea1Var.h = mutate3;
                } else {
                    i3 = 0;
                }
                spannableString.setSpan(new ImageSpan(ea1Var.h, i3), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (ea1Var.f == null) {
                Drawable mutate4 = ea1Var.getContext().getResources().getDrawable(2131231940).mutate();
                i2 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                anb.x(ut8Var, mutate4, cmb.z6, null, PorterDuff.Mode.MULTIPLY);
                ea1Var.f = mutate4;
            } else {
                i2 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(ea1Var.f, i2), str.length(), str.length() + 1, 33);
        }
        if (fa1Var.a != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < Math.min(3, arrayList2.size()); i5++) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(pg3.t((TLObject) arrayList2.get(i5)));
            }
            if (arrayList2.size() > 3) {
                sb.append(" ");
                r12 = 0;
                sb.append(jb6.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(z8c.h(i4).f());
            ut8Var.setAllowEmojiStatus(r12);
            ut8 ut8Var2 = ea1Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            ut8Var2.x(obj, null, sb.toString(), spannableString, false, false);
            hd0Var.setVisibility(r12);
            ut8Var.r.f();
            ut8Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i6 = 0; i6 < min; i6++) {
                hd0Var.b(i6, i4, (TLObject) arrayList3.get(i6));
            }
            z3 = false;
            hd0Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z3 = false;
            ut8Var.setAllowEmojiStatus(true);
            ut8 ut8Var3 = ea1Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            ut8Var3.x(obj, null, null, spannableString2, false, false);
            hd0Var.setVisibility(8);
            ut8Var.f = false;
        }
        imageView.setTag(fa1Var);
        imageView.setOnClickListener(onClickListener);
        boolean z6 = c6cVar.e;
        jh2 jh2Var = ea1Var.e;
        if (jh2Var == null) {
            return;
        }
        jh2Var.a(z6, z3);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ea1(context, i);
    }
}
