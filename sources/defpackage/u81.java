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
public final class u81 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        String str;
        byte b2;
        boolean z2;
        SpannableString spannableString;
        int i2;
        boolean z3;
        ?? r12;
        int i3;
        w81 w81Var = (w81) c4cVar.H;
        v81 v81Var = (v81) view;
        View.OnClickListener onClickListener = c4cVar.E;
        int i4 = v81Var.a;
        hc0 hc0Var = v81Var.b;
        rr8 rr8Var = v81Var.d;
        ImageView imageView = v81Var.c;
        boolean z4 = w81Var.e;
        ArrayList arrayList = w81Var.c;
        ArrayList arrayList2 = w81Var.b;
        if (z4) {
            i = 2131231919;
        } else {
            i = 2131231775;
        }
        imageView.setImageResource(i);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (k96.a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder k = b00.k(str, "  ");
            b2 = 1;
            k.append(k96.t(message.date));
            spannableString = new SpannableString(k.toString());
            z2 = false;
        } else {
            b2 = 1;
            z2 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), k96.t(message.date)));
        }
        byte b3 = w81Var.d;
        Object obj = null;
        if (b3 != 0) {
            if (b3 != b2) {
                if (b3 != 2) {
                    if (b3 == 3) {
                        Drawable mutate = v81Var.getContext().getResources().getDrawable(2131231939).mutate();
                        boolean z5 = z2;
                        mutate.setBounds(z5 ? 1 : 0, z5 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.q7, z5), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z5 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = v81Var.getContext().getResources().getDrawable(2131231937).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.q7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (v81Var.h == null) {
                    Drawable mutate3 = v81Var.getContext().getResources().getDrawable(2131231937).mutate();
                    i3 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    zkb.x(rr8Var, mutate3, bkb.z6, null, PorterDuff.Mode.MULTIPLY);
                    v81Var.h = mutate3;
                } else {
                    i3 = 0;
                }
                spannableString.setSpan(new ImageSpan(v81Var.h, i3), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (v81Var.f == null) {
                Drawable mutate4 = v81Var.getContext().getResources().getDrawable(2131231939).mutate();
                i2 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                zkb.x(rr8Var, mutate4, bkb.z6, null, PorterDuff.Mode.MULTIPLY);
                v81Var.f = mutate4;
            } else {
                i2 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(v81Var.f, i2), str.length(), str.length() + 1, 33);
        }
        if (w81Var.a != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < Math.min(3, arrayList2.size()); i5++) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(cf3.t((TLObject) arrayList2.get(i5)));
            }
            if (arrayList2.size() > 3) {
                sb.append(" ");
                r12 = 0;
                sb.append(k96.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(y6c.h(i4).f());
            rr8Var.setAllowEmojiStatus(r12);
            rr8 rr8Var2 = v81Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            rr8Var2.z(obj, null, sb.toString(), spannableString, false, false);
            hc0Var.setVisibility(r12);
            rr8Var.r.f();
            rr8Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i6 = 0; i6 < min; i6++) {
                hc0Var.b(i6, i4, (TLObject) arrayList3.get(i6));
            }
            z3 = false;
            hc0Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z3 = false;
            rr8Var.setAllowEmojiStatus(true);
            rr8 rr8Var3 = v81Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            rr8Var3.z(obj, null, null, spannableString2, false, false);
            hc0Var.setVisibility(8);
            rr8Var.f = false;
        }
        imageView.setTag(w81Var);
        imageView.setOnClickListener(onClickListener);
        boolean z6 = c4cVar.e;
        wf2 wf2Var = v81Var.e;
        if (wf2Var == null) {
            return;
        }
        wf2Var.a(z6, z3);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new v81(context, i);
    }
}
