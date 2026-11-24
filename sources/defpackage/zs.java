package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zs implements View.OnLongClickListener {
    public final byte a;
    public final Object b;

    public zs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(View view) {
        int measuredHeight;
        mu1 mu1Var;
        final taa taaVar = (taa) this.b;
        jh3 jh3Var = taaVar.o1;
        boolean z = taaVar.c2;
        Activity activity = taaVar.b2;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(taaVar.getContext());
        linearLayout.setOrientation(1);
        if (taaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, taaVar.J0);
            if (z) {
                zkb.h(bkb.Vg, taaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new daa(taaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p9a(taaVar, (byte) 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final a8 a8Var = new a8(1, taaVar.J0, taaVar.getContext(), true, false);
            if (z) {
                a8Var.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, nme.o(-1, 48));
            a8Var.j(k96.M0(2131745139, null), 0, null);
            taaVar.D2 = true;
            a8Var.setChecked(true);
            final a8 a8Var2 = new a8(1, taaVar.J0, taaVar.getContext(), false, true);
            if (z) {
                a8Var2.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, nme.o(-1, 48));
            a8Var2.j(k96.M0(2131749116, null), 0, null);
            a8Var2.setChecked(!taaVar.D2);
            a8Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    taa taaVar2 = taaVar;
                    switch (b) {
                        case 0:
                            taaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!taaVar2.D2);
                            return;
                        default:
                            taaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!taaVar2.D2);
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
                    taa taaVar2 = taaVar;
                    switch (b) {
                        case 0:
                            taaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!taaVar2.D2);
                            return;
                        default:
                            taaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!taaVar2.D2);
                            return;
                    }
                }
            });
            taa.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout, bkb.H5, taaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, taaVar.J0);
        if (z) {
            zkb.h(bkb.Vg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new daa(taaVar, (byte) 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new p9a(taaVar, (byte) 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        a8 a8Var3 = new a8(0, taaVar.J0, taaVar.getContext(), true, true);
        if (z) {
            a8Var3.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            a8Var3.setIconColor(bkb.v0(bkb.G6, taaVar.J0));
        }
        a8Var3.j(k96.M0(2131745391, null), 2131231512, null);
        a8Var3.setMinimumWidth(gl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var3, nme.o(-1, 48));
        a8Var3.setOnClickListener(new o9a(taaVar, (byte) 2));
        a8 a8Var4 = new a8(0, taaVar.J0, taaVar.getContext(), true, true);
        if (z) {
            a8Var4.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            a8Var4.setIconColor(bkb.v0(bkb.G6, taaVar.J0));
        }
        a8Var4.j(k96.M0(2131745409, null), 2131232363, null);
        a8Var4.setMinimumWidth(gl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var4, nme.o(-1, 48));
        a8Var4.setOnClickListener(new o9a(taaVar, (byte) 3));
        taa.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout2, bkb.H5, taaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, nme.o(-1, -2));
        m8 m8Var = new m8(linearLayout, -2, -2);
        taaVar.E2 = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(2131755193);
        taaVar.E2.setOutsideTouchable(true);
        taaVar.E2.setClippingEnabled(true);
        taaVar.E2.setInputMethodMode(2);
        taaVar.E2.setSoftInputMode(0);
        taaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = gba.a;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
        taaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        jh3Var.getLocationInWindow(iArr);
        if (taaVar.d && (mu1Var = taaVar.a2) != null && mu1Var.m1.getMeasuredHeight() > gl.L(58.0f)) {
            measuredHeight = jh3Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - gl.L(2.0f);
        }
        taaVar.E2.showAtLocation(jh3Var, 51, gl.L(8.0f) + ((jh3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        taaVar.E2.b();
        try {
            jh3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final boolean onLongClick(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.onLongClick(android.view.View):boolean");
    }
}
