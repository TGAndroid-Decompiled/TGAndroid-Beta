package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class eg0 implements Runnable {
    public final byte a;
    public int b;
    public final Object c;

    public eg0(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
        this.b = -1;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z;
        boolean z2;
        int max;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                hg0 hg0Var = (hg0) obj;
                if (hg0Var.a && hg0Var.getParent() != null && this.b == hg0Var.c) {
                    hg0Var.a = false;
                    if (hg0Var.q()) {
                        try {
                            hg0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        hg0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null && (currentPage = jz1Var.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z3 = chatActivityEnterView.n4;
                    int i = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    chatActivityEnterView.n4 = z;
                    boolean z4 = chatActivityEnterView.o4;
                    if (currentPage == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    chatActivityEnterView.o4 = z2;
                    if (chatActivityEnterView.p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            if (currentPage != 0) {
                                i = 1;
                            }
                            chatActivityEnterView.R1(i, true);
                            chatActivityEnterView.N();
                        } else if (!z) {
                            chatActivityEnterView.S1(false, true, false, true);
                        }
                    }
                    if (z3 != chatActivityEnterView.n4 || z4 != chatActivityEnterView.o4) {
                        chatActivityEnterView.M(true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                if2 if2Var = (if2) obj;
                f69 layoutManager = if2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    if (i2 > if2Var.J1) {
                        max = Math.min(i2 + 1, if2Var.q1.d.size() - 1);
                    } else {
                        max = Math.max(i2 - 1, 0);
                    }
                    df2 df2Var = if2Var.A1;
                    df2Var.a = max;
                    layoutManager.v0(df2Var);
                }
                if2Var.J1 = i2;
                return;
            case 3:
                int i3 = this.b;
                wx7 wx7Var = (wx7) obj;
                if (((eg0) wx7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) wx7Var.b).get(i3);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) wx7Var.c).get(i3);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    wx7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) wx7Var.e).playTogether(arrayList);
                    ((AnimatorSet) wx7Var.e).addListener(new v85(this, (byte) 28));
                    ((AnimatorSet) wx7Var.e).start();
                    return;
                }
                return;
            case 4:
                lda ldaVar = (lda) obj;
                if (ldaVar.a && ldaVar.getParent() != null && this.b == ldaVar.c) {
                    ldaVar.a = false;
                    try {
                        ldaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i4 = ldaVar.h;
                    if (i4 >= 0) {
                        ldaVar.y.c(((CharSequence) ldaVar.F.get(i4)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    ldaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    return;
                }
                return;
            case 5:
                ((w3d) obj).b(this.b);
                return;
            default:
                ((zif) obj).H.b(this.b);
                return;
        }
    }

    public eg0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public eg0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
