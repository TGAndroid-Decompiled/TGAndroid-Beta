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
public final class gf0 implements Runnable {
    public final byte a;
    public int b;
    public final Object c;

    public gf0(ChatActivityEnterView chatActivityEnterView) {
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
                jf0 jf0Var = (jf0) obj;
                if (jf0Var.a && jf0Var.getParent() != null && this.b == jf0Var.c) {
                    jf0Var.a = false;
                    if (jf0Var.q()) {
                        try {
                            jf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        jf0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null && (currentPage = my1Var.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z3 = chatActivityEnterView.m4;
                    int i = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    chatActivityEnterView.m4 = z;
                    boolean z4 = chatActivityEnterView.n4;
                    if (currentPage == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    chatActivityEnterView.n4 = z2;
                    if (chatActivityEnterView.o4) {
                        if (chatActivityEnterView.G2 != 0) {
                            if (currentPage != 0) {
                                i = 1;
                            }
                            chatActivityEnterView.Z1(i, true);
                            chatActivityEnterView.Q();
                        } else if (!z) {
                            chatActivityEnterView.a2(false, true, false, true);
                        }
                    }
                    if (z3 != chatActivityEnterView.m4 || z4 != chatActivityEnterView.n4) {
                        chatActivityEnterView.P(true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                oe2 oe2Var = (oe2) obj;
                q79 layoutManager = oe2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    if (i2 > oe2Var.J1) {
                        max = Math.min(i2 + 1, oe2Var.q1.d.size() - 1);
                    } else {
                        max = Math.max(i2 - 1, 0);
                    }
                    je2 je2Var = oe2Var.A1;
                    je2Var.a = max;
                    layoutManager.v0(je2Var);
                }
                oe2Var.J1 = i2;
                return;
            case 3:
                int i3 = this.b;
                az7 az7Var = (az7) obj;
                if (((gf0) az7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) az7Var.b).get(i3);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) az7Var.c).get(i3);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    az7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) az7Var.e).playTogether(arrayList);
                    ((AnimatorSet) az7Var.e).addListener(new ad5(this, (byte) 25));
                    ((AnimatorSet) az7Var.e).start();
                    return;
                }
                return;
            case 4:
                cfa cfaVar = (cfa) obj;
                if (cfaVar.a && cfaVar.getParent() != null && this.b == cfaVar.c) {
                    cfaVar.a = false;
                    try {
                        cfaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i4 = cfaVar.h;
                    if (i4 >= 0) {
                        cfaVar.y.c(((CharSequence) cfaVar.F.get(i4)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    cfaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    return;
                }
                return;
            case 5:
                ((l6d) obj).b(this.b);
                return;
            default:
                ((olf) obj).H.b(this.b);
                return;
        }
    }

    public gf0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public gf0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
