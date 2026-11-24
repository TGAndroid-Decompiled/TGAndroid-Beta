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
import org.telegram.ui.ActionBar.d;
public final class cf4 extends fx0 implements gk7 {
    public static final int w1 = 0;
    public int l1;
    public final fu m1;
    public final s20 n1;
    public final TextView o1;
    public AnimatorSet p1;
    public final View q1;
    public int r1;
    public boolean s1;
    public vu2 t1;
    public final ArrayList u1;
    public final ArrayList v1;

    public cf4(cj3 cj3Var, ArrayList arrayList) {
        super(cj3Var.getParentActivity(), false);
        K();
        this.v1 = arrayList;
        this.u1 = new ArrayList(cj3Var.getMessagesController().G0);
        int i = 0;
        while (i < this.u1.size()) {
            if (((t97) this.u1.get(i)).d()) {
                this.u1.remove(i);
                i--;
            }
            i++;
        }
        Activity parentActivity = cj3Var.getParentActivity();
        z92 z92Var = new z92(this, parentActivity);
        this.b = z92Var;
        z92Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L(48.0f);
        View view = new View(parentActivity);
        this.q1 = view;
        zkb.h(bkb.U5, null, view);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        fu fuVar = new fu((byte) 20, parentActivity, this);
        this.m1 = fuVar;
        fuVar.setTag(14);
        getContext();
        fuVar.setLayoutManager(new t26(1, false));
        s20 s20Var = new s20(this, parentActivity, (byte) 5);
        this.n1 = s20Var;
        fuVar.setAdapter(s20Var);
        fuVar.setVerticalScrollBarEnabled(false);
        fuVar.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        fuVar.setClipToPadding(false);
        zkb.l(fuVar, 21, bkb.z5, null);
        fuVar.setOnScrollListener(new ao2(this, (byte) 12));
        fuVar.setOnItemClickListener(new bf4(this, (byte) 0));
        this.b.addView(fuVar, nme.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.o1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 20.0f);
        zkb.G(textView, bkb.j5, null);
        zkb.C(textView, bkb.k5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(k96.M0(2131750781, null));
        textView.setTypeface(gl.o());
        this.b.addView(textView, nme.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        kk7.e().b(this, kk7.k4);
    }

    public static ArrayList D0(d dVar, t97 t97Var, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (cf3.B(longValue)) {
                TLRPC.EncryptedChat Y0 = dVar.getMessagesController().Y0(Integer.valueOf((int) (longValue & 4294967295L)));
                if (Y0 != null) {
                    longValue = Y0.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (t97Var != null) {
                if (z) {
                    if (t97Var.h.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else if (t97Var.i.contains(Long.valueOf(longValue))) {
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

    public final void E0(boolean z) {
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
        this.p1.addListener(new id4((byte) 1, this, z));
        this.p1.start();
    }

    public final void F0() {
        fu fuVar = this.m1;
        int childCount = fuVar.getChildCount();
        View view = this.q1;
        TextView textView = this.o1;
        if (childCount <= 0) {
            int paddingTop = fuVar.getPaddingTop();
            this.r1 = paddingTop;
            fuVar.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && y29Var != null && y29Var.b() == 0) {
            E0(false);
            i = top;
        } else {
            E0(true);
        }
        if (this.r1 != i) {
            this.r1 = i;
            fuVar.setTopGlowOffset(i);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            gl.d0(this.m1, new bm0((byte) 11));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void p0() {
        super.p0();
        fu fuVar = this.m1;
        if (fuVar != null) {
            try {
                int v0 = bkb.v0(bkb.Ei, this.J0);
                if (v0 != this.l1) {
                    this.l1 = v0;
                    for (int i = 0; i < fuVar.getChildCount(); i++) {
                        View childAt = fuVar.getChildAt(i);
                        if ((childAt instanceof zw0) && ((zw0) childAt).getTextView() != null) {
                            ((zw0) childAt).getTextView().setEmojiColor(v0);
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
