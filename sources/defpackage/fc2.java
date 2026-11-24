package defpackage;

import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_keyboard;
public final class fc2 {
    public final rc2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public fc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        float f;
        int L;
        rc2 rc2Var = this.a;
        ArrayList arrayList = rc2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) rc2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = rc2Var.getWidthForButtons();
                if (rc2Var.Q5.O3()) {
                    L = (rc2Var.getMeasuredWidth() - widthForButtons) - gm.L(10.0f);
                } else if (rc2Var.v2()) {
                    L = rc2Var.getCompactLeft();
                } else {
                    int i2 = rc2Var.N6;
                    if (rc2Var.C6) {
                        f = 1.0f;
                    } else {
                        f = 7.0f;
                    }
                    L = i2 + gm.L(f);
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    wp0 wp0Var = (wp0) arrayList.get(i3);
                    int L2 = (wp0Var.d + rc2Var.e7) - gm.L(2.0f);
                    float f2 = x;
                    float f3 = widthForButtons;
                    float f4 = (wp0Var.c * f3) + L;
                    if (f2 >= f4 && f2 <= (wp0Var.e * f3) + f4 && P1 >= L2 && P1 <= wp0Var.f + L2) {
                        rc2Var.N5 = i3;
                        rc2Var.r2();
                        if (wp0Var.s == null) {
                            fg0 Y = cmb.Y(cmb.v0(cmb.dd, rc2Var.cc), 6, 6);
                            wp0Var.s = Y;
                            Y.setCallback(rc2Var);
                            fg0 fg0Var = wp0Var.s;
                            int i4 = ((int) (wp0Var.c * f3)) + L;
                            fg0Var.setBounds(i4, L2, ((int) (wp0Var.e * f3)) + i4, wp0Var.f + L2);
                        }
                        wp0Var.s.setHotspot(f2, P1);
                        wp0Var.s.setState(rc2Var.N2);
                        wp0Var.b(!wp0Var.m);
                        rc2Var.postDelayed(new eh(this, rc2Var.N5, (byte) 27), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (rc2Var.N5 != -1) {
                    rc2Var.playSoundEffect(0);
                    wp0 wp0Var2 = (wp0) arrayList.get(rc2Var.N5);
                    fg0 fg0Var2 = wp0Var2.s;
                    if (fg0Var2 != null) {
                        fg0Var2.setState(StateSet.NOTHING);
                    }
                    wp0Var2.b(false);
                    if (rc2Var.Q5.r1) {
                        Toast.makeText(rc2Var.getContext(), jb6.M0(2131748287, null), 1).show();
                    } else {
                        mc2 mc2Var = rc2Var.eb;
                        if (mc2Var != null && !wp0Var2.m) {
                            ir0 ir0Var = wp0Var2.j;
                            if (ir0Var != null) {
                                mc2Var.B1(rc2Var, ir0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wp0Var2.i;
                                if (keyboardInlineButton != null) {
                                    mc2Var.L0(rc2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    rc2Var.N5 = -1;
                    rc2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = rc2Var.N5) != -1) {
                wp0 wp0Var3 = (wp0) arrayList.get(i);
                fg0 fg0Var3 = wp0Var3.s;
                if (fg0Var3 != null) {
                    fg0Var3.setState(StateSet.NOTHING);
                }
                wp0Var3.b(false);
                rc2Var.N5 = -1;
                rc2Var.r2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r28, java.util.ArrayList r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc2.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(defpackage.k47 r32, defpackage.de r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc2.c(k47, de, int, boolean):void");
    }
}
