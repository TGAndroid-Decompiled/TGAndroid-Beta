package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class au implements View.OnLongClickListener {
    public final byte a;
    public final Object b;

    public au(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(View view) {
        int measuredHeight;
        yv1 yv1Var;
        final tca tcaVar = (tca) this.b;
        vi3 vi3Var = tcaVar.o1;
        boolean z = tcaVar.c2;
        Activity activity = tcaVar.b2;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(tcaVar.getContext());
        linearLayout.setOrientation(1);
        if (tcaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, tcaVar.J0);
            if (z) {
                anb.h(cmb.Vg, tcaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new dca(tcaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new pba(tcaVar, (byte) 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final a8 a8Var = new a8(1, tcaVar.J0, tcaVar.getContext(), true, false);
            if (z) {
                a8Var.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, qoe.o(-1, 48));
            a8Var.j(jb6.M0(2131745065, null), 0, null);
            tcaVar.D2 = true;
            a8Var.setChecked(true);
            final a8 a8Var2 = new a8(1, tcaVar.J0, tcaVar.getContext(), false, true);
            if (z) {
                a8Var2.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, qoe.o(-1, 48));
            a8Var2.j(jb6.M0(2131749065, null), 0, null);
            a8Var2.setChecked(!tcaVar.D2);
            a8Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    tca tcaVar2 = tcaVar;
                    switch (b) {
                        case 0:
                            tcaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!tcaVar2.D2);
                            return;
                        default:
                            tcaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!tcaVar2.D2);
                            return;
                    }
                }
            });
            a8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    tca tcaVar2 = tcaVar;
                    switch (b) {
                        case 0:
                            tcaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!tcaVar2.D2);
                            return;
                        default:
                            tcaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!tcaVar2.D2);
                            return;
                    }
                }
            });
            tca.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout, cmb.H5, tcaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, tcaVar.J0);
        if (z) {
            anb.h(cmb.Vg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new dca(tcaVar, (byte) 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new pba(tcaVar, (byte) 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        a8 a8Var3 = new a8(0, tcaVar.J0, tcaVar.getContext(), true, true);
        if (z) {
            a8Var3.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            a8Var3.setIconColor(cmb.v0(cmb.G6, tcaVar.J0));
        }
        a8Var3.j(jb6.M0(2131745317, null), 2131231513, null);
        a8Var3.setMinimumWidth(gm.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var3, qoe.o(-1, 48));
        a8Var3.setOnClickListener(new oba(tcaVar, (byte) 2));
        a8 a8Var4 = new a8(0, tcaVar.J0, tcaVar.getContext(), true, true);
        if (z) {
            a8Var4.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            a8Var4.setIconColor(cmb.v0(cmb.G6, tcaVar.J0));
        }
        a8Var4.j(jb6.M0(2131745335, null), 2131232364, null);
        a8Var4.setMinimumWidth(gm.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var4, qoe.o(-1, 48));
        a8Var4.setOnClickListener(new oba(tcaVar, (byte) 3));
        tca.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout2, cmb.H5, tcaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, qoe.o(-1, -2));
        m8 m8Var = new m8(linearLayout, -2, -2);
        tcaVar.E2 = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(2131755193);
        tcaVar.E2.setOutsideTouchable(true);
        tcaVar.E2.setClippingEnabled(true);
        tcaVar.E2.setInputMethodMode(2);
        tcaVar.E2.setSoftInputMode(0);
        tcaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = gda.a;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
        tcaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        vi3Var.getLocationInWindow(iArr);
        if (tcaVar.d && (yv1Var = tcaVar.a2) != null && yv1Var.m1.getMeasuredHeight() > gm.L(58.0f)) {
            measuredHeight = vi3Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - gm.L(2.0f);
        }
        tcaVar.E2.showAtLocation(vi3Var, 51, gm.L(8.0f) + ((vi3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        tcaVar.E2.b();
        try {
            vi3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final boolean onLongClick(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au.onLongClick(android.view.View):boolean");
    }
}
