package mg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class n1 extends LinearLayout {
    public final ArrayList f13195a;
    public final j1 f13196b;
    public final FrameLayout f13197c;
    public final FrameLayout d;
    public final p80 e;

    public n1(Context context) {
        super(context);
        this.f13195a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13197c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, b6.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        a5 a5Var = new a5(context, 7);
        ImageView imageView = new ImageView(a5Var.getContext());
        imageView.setImageResource(2131232055);
        a7.t(imageView, t6.E6, null, PorterDuff.Mode.SRC_ATOP);
        a5Var.addView(imageView);
        frameLayout.addView(a5Var, b6.e(24, 24, 17));
        j1 j1Var = new j1(context);
        this.f13196b = j1Var;
        j1Var.setLayerType(2, null);
        frameLayout.addView(j1Var, b6.e(70, 70, 17));
        addView(frameLayout, b6.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(dd.L0(2131753321, null));
        textView.setTextSize(1, 20.0f);
        a7.V(textView, t6.G6, null);
        addView(textView, b6.t(-2, -2, 1, 0, 15, 0, 7));
        p80 p80Var = new p80(getContext(), null);
        this.e = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        a7.V(p80Var, t6.f21038j5, null);
        p80Var.setLineSpacing(p80Var.getLineSpacingExtra(), p80Var.getLineSpacingMultiplier() * 1.1f);
        addView(p80Var, b6.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c10;
        j1 j1Var;
        int i10;
        char c11;
        int i11;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            arrayList3.add(wp.r1(e20.f15506s0).L0(Long.valueOf(-o5.o(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        gr grVar = gr.f26523f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f13195a;
            if (i14 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i14);
            i14++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        while (i15 < size3) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i16 = 0;
        while (true) {
            frameLayout = this.d;
            if (i16 >= frameLayout.getChildCount()) {
                break;
            }
            j1 j1Var2 = (j1) frameLayout.getChildAt(i16);
            if (j1Var2.getTag() == null) {
                arrayList6.add(j1Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (true) {
            c10 = 2;
            if (i17 >= size4) {
                break;
            }
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            j1 j1Var3 = new j1(getContext());
            j1Var3.setLayerType(2, null);
            j1Var3.d = chat4;
            r8 r8Var = j1Var3.e;
            r8Var.q(chat4);
            j1Var3.f13172a.e(chat4, r8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(j1Var3, i12, b6.e(70, 70, 17));
            j1Var3.setTranslationX(org.telegram.messenger.i0.L(23.0f) * (-size5));
            j1Var3.setAlpha(0.0f);
            j1Var3.setScaleX(0.1f);
            j1Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            j1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(grVar).setDuration(200).start();
            if (size5 == 0) {
                k1 k1Var = j1Var3.f13173b;
                k1Var.setScaleY(1.0f);
                k1Var.setScaleX(1.0f);
                k1Var.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i12 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj5 = arrayList4.get(i18);
            i18++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i19 = 0;
            while (true) {
                if (i19 < size7) {
                    Object obj6 = arrayList6.get(i19);
                    i19++;
                    j1Var = (j1) obj6;
                    if (j1Var.d == chat5) {
                        break;
                    }
                } else {
                    j1Var = null;
                    break;
                }
            }
            if (j1Var != null) {
                j1Var.setTag("REMOVED");
                long j10 = 200;
                j1Var.animate().alpha(0.0f).translationXBy(org.telegram.messenger.i0.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(grVar).setDuration(j10).setListener(new m1(this, j1Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    j1 j1Var4 = (j1) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (j1Var4 != j1Var) {
                        i21++;
                        i11 = size6;
                        j1Var4.animate().translationX((-(size9 - i21)) * org.telegram.messenger.i0.L(23.0f)).setInterpolator(grVar).setDuration(j10).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (i0.a.g(1, arrayList6) == j1Var && arrayList6.size() > 1) {
                    c11 = 2;
                    ((j1) i0.a.g(2, arrayList6)).f13173b.setScaleY(0.1f);
                    ((j1) arrayList6.get(arrayList6.size() - 2)).f13173b.setScaleX(0.1f);
                    ((j1) arrayList6.get(arrayList6.size() - 2)).f13173b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(grVar).start();
                    c10 = c11;
                    size6 = i10;
                } else {
                    c11 = 2;
                }
            } else {
                i10 = size6;
                c11 = c10;
            }
            c10 = c11;
            size6 = i10;
        }
        j1 j1Var5 = this.f13196b;
        if (j1Var5.d == null) {
            j1Var5.d = chat;
            r8 r8Var2 = j1Var5.e;
            r8Var2.q(chat);
            j1Var5.f13172a.e(chat, r8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f13197c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(grVar).translationX(org.telegram.messenger.i0.L(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(grVar).translationX(0.0f).setDuration(200).start();
        }
        j1Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(grVar).translationX(0.0f).setDuration(j11).start();
            j1Var5.animate().setInterpolator(grVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(grVar).translationX(-org.telegram.messenger.i0.L(48.0f)).setDuration(j12).start();
        j1Var5.animate().setInterpolator(grVar).translationX(org.telegram.messenger.i0.L(48.0f)).setDuration(j12).start();
    }
}
