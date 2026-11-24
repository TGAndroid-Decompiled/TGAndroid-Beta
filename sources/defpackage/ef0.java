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
public final class ef0 implements Runnable {
    public final byte a;
    public int b;
    public final Object c;

    public ef0(ChatActivityEnterView chatActivityEnterView) {
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
                hf0 hf0Var = (hf0) obj;
                if (hf0Var.a && hf0Var.getParent() != null && this.b == hf0Var.c) {
                    hf0Var.a = false;
                    if (hf0Var.r()) {
                        try {
                            hf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        hf0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null && (currentPage = wx1Var.getCurrentPage()) != this.b) {
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
                            chatActivityEnterView.O1(i, true);
                            chatActivityEnterView.O();
                        } else if (!z) {
                            chatActivityEnterView.P1(false, true, false, true);
                        }
                    }
                    if (z3 != chatActivityEnterView.n4 || z4 != chatActivityEnterView.o4) {
                        chatActivityEnterView.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                xd2 xd2Var = (xd2) obj;
                d49 layoutManager = xd2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    if (i2 > xd2Var.J1) {
                        max = Math.min(i2 + 1, xd2Var.q1.d.size() - 1);
                    } else {
                        max = Math.max(i2 - 1, 0);
                    }
                    sd2 sd2Var = xd2Var.A1;
                    sd2Var.a = max;
                    layoutManager.v0(sd2Var);
                }
                xd2Var.J1 = i2;
                return;
            case 3:
                int i3 = this.b;
                tv7 tv7Var = (tv7) obj;
                if (((ef0) tv7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) tv7Var.b).get(i3);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) tv7Var.c).get(i3);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    tv7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) tv7Var.e).playTogether(arrayList);
                    ((AnimatorSet) tv7Var.e).addListener(new v85(this, (byte) 26));
                    ((AnimatorSet) tv7Var.e).start();
                    return;
                }
                return;
            case 4:
                lba lbaVar = (lba) obj;
                if (lbaVar.a && lbaVar.getParent() != null && this.b == lbaVar.c) {
                    lbaVar.a = false;
                    try {
                        lbaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i4 = lbaVar.h;
                    if (i4 >= 0) {
                        lbaVar.y.c(((CharSequence) lbaVar.F.get(i4)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    lbaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    return;
                }
                return;
            case 5:
                ((u1d) obj).b(this.b);
                return;
            default:
                ((ygf) obj).H.b(this.b);
                return;
        }
    }

    public ef0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public ef0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
