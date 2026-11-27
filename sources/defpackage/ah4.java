package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ah4 extends nx0 implements fn7 {
    public static final int w1 = 0;
    public int l1;
    public final gu m1;
    public final t20 n1;
    public final TextView o1;
    public AnimatorSet p1;
    public final View q1;
    public int r1;
    public boolean s1;
    public ht2 t1;
    public final ArrayList u1;
    public final ArrayList v1;

    public ah4(uj3 uj3Var, ArrayList arrayList) {
        super(uj3Var.getParentActivity(), false);
        J();
        this.v1 = arrayList;
        this.u1 = new ArrayList(uj3Var.getMessagesController().G0);
        int i = 0;
        while (i < this.u1.size()) {
            if (((ac7) this.u1.get(i)).d()) {
                this.u1.remove(i);
                i--;
            }
            i++;
        }
        Activity parentActivity = uj3Var.getParentActivity();
        pa2 pa2Var = new pa2(this, parentActivity);
        this.b = pa2Var;
        pa2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(48.0f);
        View view = new View(parentActivity);
        this.q1 = view;
        yob.h(aob.V5, null, view);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        gu guVar = new gu((byte) 20, parentActivity, this);
        this.m1 = guVar;
        guVar.setTag(14);
        getContext();
        guVar.setLayoutManager(new x46(1, false));
        t20 t20Var = new t20(this, parentActivity, (byte) 5);
        this.n1 = t20Var;
        guVar.setAdapter(t20Var);
        guVar.setVerticalScrollBarEnabled(false);
        guVar.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        guVar.setClipToPadding(false);
        yob.l(guVar, 21, aob.A5, null);
        guVar.setOnScrollListener(new to2(this, (byte) 12));
        guVar.setOnItemClickListener(new zg4(this, (byte) 0));
        this.b.addView(guVar, tre.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.o1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 20.0f);
        yob.G(textView, aob.k5, null);
        yob.C(textView, aob.l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(ob6.M0(2131750758, null));
        textView.setTypeface(hl.o());
        this.b.addView(textView, tre.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        jn7.e().b(this, jn7.l4);
    }

    public static ArrayList E0(e eVar, ac7 ac7Var, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (wf3.B(longValue)) {
                TLRPC.EncryptedChat a1 = eVar.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a1 != null) {
                    longValue = a1.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (ac7Var != null) {
                if (z) {
                    if (ac7Var.h.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else if (ac7Var.i.contains(Long.valueOf(longValue))) {
                    continue;
                }
            }
            arrayList2.add(Long.valueOf(longValue));
            if (z2) {
                break;
            }
        }
        return arrayList2;
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void F0(boolean z) {
        Integer num;
        float f;
        View view = this.q1;
        Object tag = view.getTag();
        if (z) {
            if (tag != null) {
                num = null;
            } else {
                return;
            }
        } else if (tag == null) {
            num = 1;
        } else {
            return;
        }
        view.setTag(num);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.p1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.p1 = animatorSet2;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f));
        this.p1.setDuration(150L);
        this.p1.addListener(new gf4((byte) 1, this, z));
        this.p1.start();
    }

    public final void G0() {
        gu guVar = this.m1;
        int childCount = guVar.getChildCount();
        View view = this.q1;
        TextView textView = this.o1;
        if (childCount <= 0) {
            int paddingTop = guVar.getPaddingTop();
            this.r1 = paddingTop;
            guVar.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = childAt.getTop();
        if (top >= 0 && n69Var != null && n69Var.b() == 0) {
            F0(false);
            i = top;
        } else {
            F0(true);
        }
        if (this.r1 != i) {
            this.r1 = i;
            guVar.setTopGlowOffset(i);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            hl.d0(this.m1, new bm0((byte) 11));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void p0() {
        super.p0();
        gu guVar = this.m1;
        if (guVar != null) {
            try {
                int v0 = aob.v0(aob.Fi, this.J0);
                if (v0 != this.l1) {
                    this.l1 = v0;
                    for (int i = 0; i < guVar.getChildCount(); i++) {
                        View childAt = guVar.getChildAt(i);
                        if ((childAt instanceof hx0) && ((hx0) childAt).getTextView() != null) {
                            ((hx0) childAt).getTextView().setEmojiColor(v0);
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
