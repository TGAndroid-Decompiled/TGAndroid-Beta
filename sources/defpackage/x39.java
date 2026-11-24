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
public final class x39 extends LinearLayout {
    public final ArrayList a;
    public final v39 b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final l66 e;

    public x39(Context context) {
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
        frameLayout.addView(frameLayout2, qoe.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ct8 ct8Var = new ct8(context, (byte) 1);
        ImageView imageView = new ImageView(ct8Var.getContext());
        imageView.setImageResource(2131232062);
        anb.s(imageView, cmb.D6, null, PorterDuff.Mode.SRC_ATOP);
        ct8Var.addView(imageView);
        frameLayout.addView(ct8Var, qoe.e(24, 24, 17));
        v39 v39Var = new v39(context);
        this.b = v39Var;
        v39Var.setLayerType(2, null);
        frameLayout.addView(v39Var, qoe.e(70, 70, 17));
        addView(frameLayout, qoe.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131753286, null));
        textView.setTextSize(1, 20.0f);
        anb.X(textView, cmb.F6, null);
        addView(textView, qoe.t(-2, -2, 1, 0, 15, 0, 7));
        l66 l66Var = new l66(getContext(), null);
        this.e = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(1);
        anb.X(l66Var, cmb.i5, null);
        l66Var.setLineSpacing(l66Var.getLineSpacingExtra(), l66Var.getLineSpacingMultiplier() * 1.1f);
        addView(l66Var, qoe.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        v39 v39Var;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(oc7.r1(z8c.t0).L0(Long.valueOf(-pg3.n(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        d53 d53Var = d53.f;
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
            v39 v39Var2 = (v39) frameLayout.getChildAt(i5);
            if (v39Var2.getTag() == null) {
                arrayList6.add(v39Var2);
            }
            i5++;
        }
        int size4 = arrayList5.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList5.get(i6);
            i6++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            v39 v39Var3 = new v39(getContext());
            v39Var3.setLayerType(2, null);
            v39Var3.d = chat4;
            pc0 pc0Var = v39Var3.e;
            pc0Var.p(chat4);
            v39Var3.a.f(chat4, pc0Var);
            int size5 = arrayList6.size();
            frameLayout.addView(v39Var3, i, qoe.e(70, 70, 17));
            v39Var3.setTranslationX(gm.L(23.0f) * (-size5));
            v39Var3.setAlpha(0.0f);
            v39Var3.setScaleX(0.1f);
            v39Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            v39Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(d53Var).setDuration(200L).start();
            if (size5 == 0) {
                kw kwVar = v39Var3.b;
                kwVar.setScaleY(1.0f);
                kwVar.setScaleX(1.0f);
                kwVar.setAlpha(1.0f);
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
                    v39Var = (v39) obj6;
                    if (v39Var.d == chat5) {
                        break;
                    }
                } else {
                    v39Var = null;
                    break;
                }
            }
            if (v39Var != null) {
                v39Var.setTag("REMOVED");
                v39Var.animate().alpha(0.0f).translationXBy(gm.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(d53Var).setDuration(200L).setListener(new w39(this, v39Var)).start();
                int size8 = arrayList6.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size8) {
                    Object obj7 = arrayList6.get(i11);
                    i11++;
                    v39 v39Var4 = (v39) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (v39Var4 != v39Var) {
                        i10++;
                        frameLayout3 = frameLayout;
                        v39Var4.animate().translationX((-(size9 - i10)) * gm.L(23.0f)).setInterpolator(d53Var).setDuration(200L).start();
                    } else {
                        frameLayout3 = frameLayout;
                    }
                    frameLayout = frameLayout3;
                    i8 = 1;
                }
                frameLayout2 = frameLayout;
                if (b10.f(i8, arrayList6) == v39Var && arrayList6.size() > i8) {
                    ((v39) b10.f(2, arrayList6)).b.setScaleY(0.1f);
                    ((v39) arrayList6.get(arrayList6.size() - 2)).b.setScaleX(0.1f);
                    ((v39) arrayList6.get(arrayList6.size() - 2)).b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).setInterpolator(d53Var).start();
                }
            } else {
                frameLayout2 = frameLayout;
            }
            frameLayout = frameLayout2;
        }
        FrameLayout frameLayout4 = frameLayout;
        v39 v39Var5 = this.b;
        if (v39Var5.d == null) {
            v39Var5.d = chat;
            pc0 pc0Var2 = v39Var5.e;
            pc0Var2.p(chat);
            v39Var5.a.f(chat, pc0Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout5 = this.c;
        frameLayout5.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout5.animate().setInterpolator(d53Var).translationX(gm.L(11.5f) * (arrayList2.size() - 1)).setDuration(200L).start();
        } else {
            frameLayout5.animate().setInterpolator(d53Var).translationX(0.0f).setDuration(200L).start();
        }
        v39Var5.animate().cancel();
        frameLayout4.animate().cancel();
        if (arrayList2.isEmpty()) {
            frameLayout4.animate().setInterpolator(d53Var).translationX(0.0f).setDuration(200L).start();
            v39Var5.animate().setInterpolator(d53Var).translationX(0.0f).setDuration(200L).start();
            return;
        }
        frameLayout4.animate().setInterpolator(d53Var).translationX(-gm.L(48.0f)).setDuration(200L).start();
        v39Var5.animate().setInterpolator(d53Var).translationX(gm.L(48.0f)).setDuration(200L).start();
    }
}
