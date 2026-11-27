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
public final class i59 extends LinearLayout {
    public final ArrayList a;
    public final g59 b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final p66 e;

    public i59(Context context) {
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
        frameLayout.addView(frameLayout2, tre.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ir8 ir8Var = new ir8(context, (byte) 2);
        ImageView imageView = new ImageView(ir8Var.getContext());
        imageView.setImageResource(2131232061);
        yob.s(imageView, aob.E6, null, PorterDuff.Mode.SRC_ATOP);
        ir8Var.addView(imageView);
        frameLayout.addView(ir8Var, tre.e(24, 24, 17));
        g59 g59Var = new g59(context);
        this.b = g59Var;
        g59Var.setLayerType(2, null);
        frameLayout.addView(g59Var, tre.e(70, 70, 17));
        addView(frameLayout, tre.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131753314, null));
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.G6, null);
        addView(textView, tre.t(-2, -2, 1, 0, 15, 0, 7));
        p66 p66Var = new p66(getContext(), null);
        this.e = p66Var;
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(1);
        yob.X(p66Var, aob.j5, null);
        p66Var.setLineSpacing(p66Var.getLineSpacingExtra(), p66Var.getLineSpacingMultiplier() * 1.1f);
        addView(p66Var, tre.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        g59 g59Var;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(uc7.s1(yac.t0).M0(Long.valueOf(-wf3.n(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        k43 k43Var = k43.f;
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
            g59 g59Var2 = (g59) frameLayout.getChildAt(i5);
            if (g59Var2.getTag() == null) {
                arrayList6.add(g59Var2);
            }
            i5++;
        }
        int size4 = arrayList5.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList5.get(i6);
            i6++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            g59 g59Var3 = new g59(getContext());
            g59Var3.setLayerType(2, null);
            g59Var3.d = chat4;
            rb0 rb0Var = g59Var3.e;
            rb0Var.p(chat4);
            g59Var3.a.f(chat4, rb0Var);
            int size5 = arrayList6.size();
            frameLayout.addView(g59Var3, i, tre.e(70, 70, 17));
            g59Var3.setTranslationX(hl.L(23.0f) * (-size5));
            g59Var3.setAlpha(0.0f);
            g59Var3.setScaleX(0.1f);
            g59Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            g59Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(k43Var).setDuration(200L).start();
            if (size5 == 0) {
                lv lvVar = g59Var3.b;
                lvVar.setScaleY(1.0f);
                lvVar.setScaleX(1.0f);
                lvVar.setAlpha(1.0f);
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
                    g59Var = (g59) obj6;
                    if (g59Var.d == chat5) {
                        break;
                    }
                } else {
                    g59Var = null;
                    break;
                }
            }
            if (g59Var != null) {
                g59Var.setTag("REMOVED");
                g59Var.animate().alpha(0.0f).translationXBy(hl.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(k43Var).setDuration(200L).setListener(new h59(this, g59Var)).start();
                int size8 = arrayList6.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size8) {
                    Object obj7 = arrayList6.get(i11);
                    i11++;
                    g59 g59Var4 = (g59) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (g59Var4 != g59Var) {
                        i10++;
                        frameLayout3 = frameLayout;
                        g59Var4.animate().translationX((-(size9 - i10)) * hl.L(23.0f)).setInterpolator(k43Var).setDuration(200L).start();
                    } else {
                        frameLayout3 = frameLayout;
                    }
                    frameLayout = frameLayout3;
                    i8 = 1;
                }
                frameLayout2 = frameLayout;
                if (c00.g(i8, arrayList6) == g59Var && arrayList6.size() > i8) {
                    ((g59) c00.g(2, arrayList6)).b.setScaleY(0.1f);
                    ((g59) arrayList6.get(arrayList6.size() - 2)).b.setScaleX(0.1f);
                    ((g59) arrayList6.get(arrayList6.size() - 2)).b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).setInterpolator(k43Var).start();
                }
            } else {
                frameLayout2 = frameLayout;
            }
            frameLayout = frameLayout2;
        }
        FrameLayout frameLayout4 = frameLayout;
        g59 g59Var5 = this.b;
        if (g59Var5.d == null) {
            g59Var5.d = chat;
            rb0 rb0Var2 = g59Var5.e;
            rb0Var2.p(chat);
            g59Var5.a.f(chat, rb0Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout5 = this.c;
        frameLayout5.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout5.animate().setInterpolator(k43Var).translationX(hl.L(11.5f) * (arrayList2.size() - 1)).setDuration(200L).start();
        } else {
            frameLayout5.animate().setInterpolator(k43Var).translationX(0.0f).setDuration(200L).start();
        }
        g59Var5.animate().cancel();
        frameLayout4.animate().cancel();
        if (arrayList2.isEmpty()) {
            frameLayout4.animate().setInterpolator(k43Var).translationX(0.0f).setDuration(200L).start();
            g59Var5.animate().setInterpolator(k43Var).translationX(0.0f).setDuration(200L).start();
            return;
        }
        frameLayout4.animate().setInterpolator(k43Var).translationX(-hl.L(48.0f)).setDuration(200L).start();
        g59Var5.animate().setInterpolator(k43Var).translationX(hl.L(48.0f)).setDuration(200L).start();
    }
}
