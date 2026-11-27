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
        zu1 zu1Var;
        final kea keaVar = (kea) this.b;
        di3 di3Var = keaVar.o1;
        boolean z = keaVar.c2;
        Activity activity = keaVar.b2;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(keaVar.getContext());
        linearLayout.setOrientation(1);
        if (keaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, keaVar.J0);
            if (z) {
                yob.h(aob.Wg, keaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new uda(keaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new fda(keaVar, (byte) 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final b8 b8Var = new b8(1, keaVar.J0, keaVar.getContext(), true, false);
            if (z) {
                b8Var.setTextColor(aob.v0(aob.eh, keaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var, tre.o(-1, 48));
            b8Var.j(ob6.M0(2131745059, null), 0, null);
            keaVar.D2 = true;
            b8Var.setChecked(true);
            final b8 b8Var2 = new b8(1, keaVar.J0, keaVar.getContext(), false, true);
            if (z) {
                b8Var2.setTextColor(aob.v0(aob.eh, keaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var2, tre.o(-1, 48));
            b8Var2.j(ob6.M0(2131749062, null), 0, null);
            b8Var2.setChecked(!keaVar.D2);
            b8Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    b8 b8Var3 = b8Var2;
                    b8 b8Var4 = b8Var;
                    kea keaVar2 = keaVar;
                    switch (b) {
                        case 0:
                            keaVar2.D2 = true;
                            b8Var4.setChecked(true);
                            b8Var3.setChecked(!keaVar2.D2);
                            return;
                        default:
                            keaVar2.D2 = false;
                            b8Var4.setChecked(false);
                            b8Var3.setChecked(!keaVar2.D2);
                            return;
                    }
                }
            });
            b8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    b8 b8Var3 = b8Var2;
                    b8 b8Var4 = b8Var;
                    kea keaVar2 = keaVar;
                    switch (b) {
                        case 0:
                            keaVar2.D2 = true;
                            b8Var4.setChecked(true);
                            b8Var3.setChecked(!keaVar2.D2);
                            return;
                        default:
                            keaVar2.D2 = false;
                            b8Var4.setChecked(false);
                            b8Var3.setChecked(!keaVar2.D2);
                            return;
                    }
                }
            });
            kea.R0(actionBarPopupWindow$ActionBarPopupWindowLayout, aob.I5, keaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, keaVar.J0);
        if (z) {
            yob.h(aob.Wg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new uda(keaVar, (byte) 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new fda(keaVar, (byte) 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        b8 b8Var3 = new b8(0, keaVar.J0, keaVar.getContext(), true, true);
        if (z) {
            b8Var3.setTextColor(aob.v0(aob.eh, keaVar.J0));
            b8Var3.setIconColor(aob.v0(aob.H6, keaVar.J0));
        }
        b8Var3.j(ob6.M0(2131745311, null), 2131231512, null);
        b8Var3.setMinimumWidth(hl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b8Var3, tre.o(-1, 48));
        b8Var3.setOnClickListener(new eda(keaVar, (byte) 2));
        b8 b8Var4 = new b8(0, keaVar.J0, keaVar.getContext(), true, true);
        if (z) {
            b8Var4.setTextColor(aob.v0(aob.eh, keaVar.J0));
            b8Var4.setIconColor(aob.v0(aob.H6, keaVar.J0));
        }
        b8Var4.j(ob6.M0(2131745329, null), 2131232363, null);
        b8Var4.setMinimumWidth(hl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b8Var4, tre.o(-1, 48));
        b8Var4.setOnClickListener(new eda(keaVar, (byte) 3));
        kea.R0(actionBarPopupWindow$ActionBarPopupWindowLayout2, aob.I5, keaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, tre.o(-1, -2));
        n8 n8Var = new n8(linearLayout, -2, -2);
        keaVar.E2 = n8Var;
        n8Var.b = false;
        n8Var.setAnimationStyle(2131755193);
        keaVar.E2.setOutsideTouchable(true);
        keaVar.E2.setClippingEnabled(true);
        keaVar.E2.setInputMethodMode(2);
        keaVar.E2.setSoftInputMode(0);
        keaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
        keaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        di3Var.getLocationInWindow(iArr);
        if (keaVar.d && (zu1Var = keaVar.a2) != null && zu1Var.m1.getMeasuredHeight() > hl.L(58.0f)) {
            measuredHeight = di3Var.getMeasuredHeight() + iArr[1];
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - hl.L(2.0f);
        }
        keaVar.E2.showAtLocation(di3Var, 51, hl.L(8.0f) + ((di3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
        keaVar.E2.b();
        try {
            di3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final boolean onLongClick(android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.onLongClick(android.view.View):boolean");
    }
}
