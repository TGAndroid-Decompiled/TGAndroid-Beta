package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t19 extends LinearLayout {
    public final ArrayList a;
    public final r19 b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final l46 e;

    public t19(Context context) {
        super(context);
        this.a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, nme.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ar8 ar8Var = new ar8(context, (byte) 1);
        ImageView imageView = new ImageView(ar8Var.getContext());
        imageView.setImageResource(2131232061);
        zkb.s(imageView, bkb.D6, null, PorterDuff.Mode.SRC_ATOP);
        ar8Var.addView(imageView);
        frameLayout.addView(ar8Var, nme.e(24, 24, 17));
        r19 r19Var = new r19(context);
        this.b = r19Var;
        r19Var.setLayerType(2, null);
        frameLayout.addView(r19Var, nme.e(70, 70, 17));
        addView(frameLayout, nme.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131753318, null));
        textView.setTextSize(1, 20.0f);
        zkb.X(textView, bkb.F6, null);
        addView(textView, nme.t(-2, -2, 1, 0, 15, 0, 7));
        l46 l46Var = new l46(getContext(), null);
        this.e = l46Var;
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(1);
        zkb.X(l46Var, bkb.i5, null);
        l46Var.setLineSpacing(l46Var.getLineSpacingExtra(), l46Var.getLineSpacingMultiplier() * 1.1f);
        addView(l46Var, nme.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        r19 r19Var;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(na7.q1(y6c.t0).K0(Long.valueOf(-cf3.n(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        s33 s33Var = s33.f;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (true) {
            arrayList2 = this.a;
            if (i3 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i3);
            i3++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i5 = 0;
        while (true) {
            frameLayout = this.d;
            if (i5 >= frameLayout.getChildCount()) {
                break;
            }
            r19 r19Var2 = (r19) frameLayout.getChildAt(i5);
            if (r19Var2.getTag() == null) {
                arrayList6.add(r19Var2);
            }
            i5++;
        }
        int size4 = arrayList5.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList5.get(i6);
            i6++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            r19 r19Var3 = new r19(getContext());
            r19Var3.setLayerType(2, null);
            r19Var3.d = chat4;
            pb0 pb0Var = r19Var3.e;
            pb0Var.p(chat4);
            r19Var3.a.f(chat4, pb0Var);
            int size5 = arrayList6.size();
            frameLayout.addView(r19Var3, i, nme.e(70, 70, 17));
            r19Var3.setTranslationX(gl.L(23.0f) * (-size5));
            r19Var3.setAlpha(0.0f);
            r19Var3.setScaleX(0.1f);
            r19Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            r19Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(s33Var).setDuration(200L).start();
            if (size5 == 0) {
                kv kvVar = r19Var3.b;
                kvVar.setScaleY(1.0f);
                kvVar.setScaleX(1.0f);
                kvVar.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (i7 >= size6) {
                break;
            }
            Object obj5 = arrayList4.get(i7);
            i7++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i9 = 0;
            while (true) {
                if (i9 < size7) {
                    Object obj6 = arrayList6.get(i9);
                    i9++;
                    r19Var = (r19) obj6;
                    if (r19Var.d == chat5) {
                        break;
                    }
                } else {
                    r19Var = null;
                    break;
                }
            }
            if (r19Var != null) {
                r19Var.setTag("REMOVED");
                r19Var.animate().alpha(0.0f).translationXBy(gl.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(s33Var).setDuration(200L).setListener(new s19(this, r19Var)).start();
                int size8 = arrayList6.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size8) {
                    Object obj7 = arrayList6.get(i11);
                    i11++;
                    r19 r19Var4 = (r19) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (r19Var4 != r19Var) {
                        i10++;
                        frameLayout3 = frameLayout;
                        r19Var4.animate().translationX((-(size9 - i10)) * gl.L(23.0f)).setInterpolator(s33Var).setDuration(200L).start();
                    } else {
                        frameLayout3 = frameLayout;
                    }
                    frameLayout = frameLayout3;
                    i8 = 1;
                }
                frameLayout2 = frameLayout;
                if (b00.f(i8, arrayList6) == r19Var && arrayList6.size() > i8) {
                    ((r19) b00.f(2, arrayList6)).b.setScaleY(0.1f);
                    ((r19) arrayList6.get(arrayList6.size() - 2)).b.setScaleX(0.1f);
                    ((r19) arrayList6.get(arrayList6.size() - 2)).b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).setInterpolator(s33Var).start();
                }
            } else {
                frameLayout2 = frameLayout;
            }
            frameLayout = frameLayout2;
        }
        FrameLayout frameLayout4 = frameLayout;
        r19 r19Var5 = this.b;
        if (r19Var5.d == null) {
            r19Var5.d = chat;
            pb0 pb0Var2 = r19Var5.e;
            pb0Var2.p(chat);
            r19Var5.a.f(chat, pb0Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout5 = this.c;
        frameLayout5.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout5.animate().setInterpolator(s33Var).translationX(gl.L(11.5f) * (arrayList2.size() - 1)).setDuration(200L).start();
        } else {
            frameLayout5.animate().setInterpolator(s33Var).translationX(0.0f).setDuration(200L).start();
        }
        r19Var5.animate().cancel();
        frameLayout4.animate().cancel();
        if (arrayList2.isEmpty()) {
            frameLayout4.animate().setInterpolator(s33Var).translationX(0.0f).setDuration(200L).start();
            r19Var5.animate().setInterpolator(s33Var).translationX(0.0f).setDuration(200L).start();
            return;
        }
        frameLayout4.animate().setInterpolator(s33Var).translationX(-gl.L(48.0f)).setDuration(200L).start();
        r19Var5.animate().setInterpolator(s33Var).translationX(gl.L(48.0f)).setDuration(200L).start();
    }
}
