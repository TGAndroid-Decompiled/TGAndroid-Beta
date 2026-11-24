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
public final class dh4 extends my0 implements jm7 {
    public static final int w1 = 0;
    public int l1;
    public final fv m1;
    public final s30 n1;
    public final TextView o1;
    public AnimatorSet p1;
    public final View q1;
    public int r1;
    public boolean s1;
    public wm2 t1;
    public final ArrayList u1;
    public final ArrayList v1;

    public dh4(nk3 nk3Var, ArrayList arrayList) {
        super(nk3Var.getParentActivity(), false);
        J();
        this.v1 = arrayList;
        this.u1 = new ArrayList(nk3Var.getMessagesController().G0);
        int i = 0;
        while (i < this.u1.size()) {
            if (((ub7) this.u1.get(i)).d()) {
                this.u1.remove(i);
                i--;
            }
            i++;
        }
        Activity parentActivity = nk3Var.getParentActivity();
        kb2 kb2Var = new kb2(this, parentActivity);
        this.b = kb2Var;
        kb2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
        layoutParams.topMargin = gm.L(48.0f);
        View view = new View(parentActivity);
        this.q1 = view;
        anb.h(cmb.U5, null, view);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        fv fvVar = new fv((byte) 20, parentActivity, this);
        this.m1 = fvVar;
        fvVar.setTag(14);
        getContext();
        fvVar.setLayoutManager(new u46(1, false));
        s30 s30Var = new s30(this, parentActivity, (byte) 5);
        this.n1 = s30Var;
        fvVar.setAdapter(s30Var);
        fvVar.setVerticalScrollBarEnabled(false);
        fvVar.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        fvVar.setClipToPadding(false);
        anb.l(fvVar, 21, cmb.z5, null);
        fvVar.setOnScrollListener(new ip2(this, (byte) 13));
        fvVar.setOnItemClickListener(new kg4(this, (byte) 1));
        this.b.addView(fvVar, qoe.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.o1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        anb.X(textView, cmb.i5, null);
        textView.setTextSize(1, 20.0f);
        anb.G(textView, cmb.j5, null);
        anb.C(textView, cmb.k5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(jb6.M0(2131750730, null));
        textView.setTypeface(gm.o());
        this.b.addView(textView, qoe.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        nm7.e().b(this, nm7.m4);
    }

    public static ArrayList D0(d dVar, ub7 ub7Var, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (pg3.B(longValue)) {
                TLRPC.EncryptedChat Z0 = dVar.getMessagesController().Z0(Integer.valueOf((int) (longValue & 4294967295L)));
                if (Z0 != null) {
                    longValue = Z0.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (ub7Var != null) {
                if (z) {
                    if (ub7Var.h.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else if (ub7Var.i.contains(Long.valueOf(longValue))) {
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
    public final boolean C() {
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
        this.p1.addListener(new jf4((byte) 1, this, z));
        this.p1.start();
    }

    public final void F0() {
        fv fvVar = this.m1;
        int childCount = fvVar.getChildCount();
        View view = this.q1;
        TextView textView = this.o1;
        if (childCount <= 0) {
            int paddingTop = fvVar.getPaddingTop();
            this.r1 = paddingTop;
            fvVar.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && b59Var != null && b59Var.b() == 0) {
            E0(false);
            i = top;
        } else {
            E0(true);
        }
        if (this.r1 != i) {
            this.r1 = i;
            fvVar.setTopGlowOffset(i);
            textView.setTranslationY(this.r1);
            view.setTranslationY(this.r1);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            gm.d0(this.m1, new bn0((byte) 11));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nm7.e().n(this, nm7.m4);
    }

    @Override
    public final void p0() {
        super.p0();
        fv fvVar = this.m1;
        if (fvVar != null) {
            try {
                int v0 = cmb.v0(cmb.Ei, this.J0);
                if (v0 != this.l1) {
                    this.l1 = v0;
                    for (int i = 0; i < fvVar.getChildCount(); i++) {
                        View childAt = fvVar.getChildAt(i);
                        if ((childAt instanceof gy0) && ((gy0) childAt).getTextView() != null) {
                            ((gy0) childAt).getTextView().setEmojiColor(v0);
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
