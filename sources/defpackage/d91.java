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
public final class d91 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i;
        String str;
        byte b2;
        boolean z2;
        SpannableString spannableString;
        int i2;
        boolean z3;
        ?? r12;
        int i3;
        f91 f91Var = (f91) b8cVar.H;
        e91 e91Var = (e91) view;
        View.OnClickListener onClickListener = b8cVar.E;
        int i4 = e91Var.a;
        jc0 jc0Var = e91Var.b;
        bv8 bv8Var = e91Var.d;
        ImageView imageView = e91Var.c;
        boolean z4 = f91Var.e;
        ArrayList arrayList = f91Var.c;
        ArrayList arrayList2 = f91Var.b;
        if (z4) {
            i = 2131231919;
        } else {
            i = 2131231775;
        }
        imageView.setImageResource(i);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (ob6.a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder l = c00.l(str, "  ");
            b2 = 1;
            l.append(ob6.t(message.date));
            spannableString = new SpannableString(l.toString());
            z2 = false;
        } else {
            b2 = 1;
            z2 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), ob6.t(message.date)));
        }
        byte b3 = f91Var.d;
        Object obj = null;
        if (b3 != 0) {
            if (b3 != b2) {
                if (b3 != 2) {
                    if (b3 == 3) {
                        Drawable mutate = e91Var.getContext().getResources().getDrawable(2131231939).mutate();
                        boolean z5 = z2;
                        mutate.setBounds(z5 ? 1 : 0, z5 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.r7, z5), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z5 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = e91Var.getContext().getResources().getDrawable(2131231937).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (e91Var.h == null) {
                    Drawable mutate3 = e91Var.getContext().getResources().getDrawable(2131231937).mutate();
                    i3 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    yob.x(bv8Var, mutate3, aob.A6, null, PorterDuff.Mode.MULTIPLY);
                    e91Var.h = mutate3;
                } else {
                    i3 = 0;
                }
                spannableString.setSpan(new ImageSpan(e91Var.h, i3), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (e91Var.f == null) {
                Drawable mutate4 = e91Var.getContext().getResources().getDrawable(2131231939).mutate();
                i2 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                yob.x(bv8Var, mutate4, aob.A6, null, PorterDuff.Mode.MULTIPLY);
                e91Var.f = mutate4;
            } else {
                i2 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(e91Var.f, i2), str.length(), str.length() + 1, 33);
        }
        if (f91Var.a != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < Math.min(3, arrayList2.size()); i5++) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(wf3.t((TLObject) arrayList2.get(i5)));
            }
            if (arrayList2.size() > 3) {
                sb.append(" ");
                r12 = 0;
                sb.append(ob6.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(yac.h(i4).f());
            bv8Var.setAllowEmojiStatus(r12);
            bv8 bv8Var2 = e91Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            bv8Var2.C(obj, null, sb.toString(), spannableString, false, false);
            jc0Var.setVisibility(r12);
            bv8Var.r.f();
            bv8Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i6 = 0; i6 < min; i6++) {
                jc0Var.b(i6, i4, (TLObject) arrayList3.get(i6));
            }
            z3 = false;
            jc0Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z3 = false;
            bv8Var.setAllowEmojiStatus(true);
            bv8 bv8Var3 = e91Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            bv8Var3.C(obj, null, null, spannableString2, false, false);
            jc0Var.setVisibility(8);
            bv8Var.f = false;
        }
        imageView.setTag(f91Var);
        imageView.setOnClickListener(onClickListener);
        boolean z6 = b8cVar.e;
        og2 og2Var = e91Var.e;
        if (og2Var == null) {
            return;
        }
        og2Var.a(z6, z3);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new e91(context, i);
    }
}
