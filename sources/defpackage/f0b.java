package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f0b implements View.OnClickListener {
    public final byte a;
    public final u0b b;

    public f0b(u0b u0bVar, byte b) {
        this.a = b;
        this.b = u0bVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        TLRPC.StickerSet stickerSet;
        int i;
        pha phaVar;
        byte b = this.a;
        u0b u0bVar = this.b;
        switch (b) {
            case 0:
                d dVar = u0bVar.F1;
                if (dVar != null) {
                    new jh8(dVar, 11, false).show();
                    return;
                } else if (u0bVar.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) u0bVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                hq6 d0 = hq6.d0(u0bVar.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
                if (tL_messages_stickerSet != null && d0.D0(tL_messages_stickerSet.set.id, true)) {
                    z = false;
                } else {
                    z = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u0bVar.M1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && u0bVar.s1 == null) {
                    u0bVar.r1.e(3, 2131232778, k96.M0(2131744614, null));
                    u0bVar.r1.e(4, 2131232121, k96.M0(2131751252, null));
                    if (z) {
                        u0bVar.s1 = u0bVar.r1.e(5, 2131232113, k96.M0(2131751586, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, u0bVar.J0, u0bVar.getContext());
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, k96.M0(2131753753, null), false, u0bVar.J0).setOnClickListener(new f0b(u0bVar, (byte) 4));
                        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131744624, null), false, u0bVar.J0);
                        int i2 = bkb.p7;
                        u0bVar.T(i2);
                        c.c(i2, i2);
                        c.h(0.1f, i2);
                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131744617, null), false, u0bVar.J0).setOnClickListener(new f0b(u0bVar, (byte) 6));
                        c.setOnClickListener(new f0b(u0bVar, (byte) 7));
                        u0bVar.s1 = u0bVar.r1.i(2131232113, null, k96.M0(2131751586, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    u0bVar.r1.a(-1);
                    j17 j17Var = new j17(u0bVar.a, 4, u0bVar.J0, u0bVar.getContext(), new ArrayList());
                    j17Var.setOnClickListener(new f0b(u0bVar, (byte) 8));
                    j17Var.setTag(2131296439, 1);
                    r7 r7Var = u0bVar.r1;
                    r7Var.q();
                    r7Var.b.a(j17Var, new LinearLayout.LayoutParams(-1, -2));
                    int v0 = bkb.v0(bkb.p7, u0bVar.J0);
                    u0bVar.s1.d(v0, v0);
                    u0bVar.s1.setSelectorColor(bkb.p1(0.1f, v0));
                    if (u0bVar.s1.getRightIcon() != null) {
                        u0bVar.s1.getRightIcon().setColorFilter(v0);
                    }
                }
                if (u0bVar.r1.getPopupLayout() != null) {
                    u0bVar.r1.getPopupLayout().requestLayout();
                }
                u0bVar.r1.U(null, null);
                return;
            case 2:
                u0bVar.I0();
                return;
            case 3:
                if (u0bVar.S1 != null) {
                    u0bVar.M0(u0bVar.O1);
                    u0bVar.I0();
                    u0bVar.O1 = null;
                    return;
                }
                u0bVar.V1.e(u0bVar.N1, null, u0bVar.M1, null, u0bVar.c2, true, 0, 0);
                u0bVar.dismiss();
                return;
            case 4:
                u0bVar.r1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                gb5 gb5Var = u0bVar.X1;
                mb5 mb5Var = gb5Var.c;
                t26 t26Var = mb5Var.h;
                boolean z2 = mb5Var.O;
                int K0 = t26Var.K0();
                y29 y29Var = (y29) mb5Var.d.K(K0);
                if (y29Var != null) {
                    i = y29Var.a.getTop();
                } else {
                    i = Integer.MAX_VALUE;
                }
                int i3 = mb5Var.n;
                if (gb5Var.a) {
                    mb5Var.r = null;
                    mb5Var.s = true;
                } else {
                    mb5Var.r = gb5Var.b;
                    mb5Var.s = false;
                }
                if (z2) {
                    gl.d3(new iu4(gb5Var, (byte) 20), 350L);
                }
                mb5Var.l0();
                mb5Var.j0(mb5Var.r, true);
                if (i3 != -1) {
                    if (!mb5Var.N) {
                        for (int i4 = 0; i4 < mb5Var.d.getChildCount(); i4++) {
                            View childAt = mb5Var.d.getChildAt(i4);
                            if (mb5Var.d.T(childAt).b() == mb5Var.F + i3) {
                                ((rza) childAt).b(false, true);
                            }
                        }
                    }
                    mb5Var.e.g(i3);
                }
                if (mb5Var.n != -1) {
                    if (!mb5Var.N) {
                        for (int i5 = 0; i5 < mb5Var.d.getChildCount(); i5++) {
                            View childAt2 = mb5Var.d.getChildAt(i5);
                            if (mb5Var.d.T(childAt2).b() == mb5Var.F + mb5Var.n) {
                                ((rza) childAt2).b(true, true);
                            }
                        }
                    }
                    mb5Var.e.g(mb5Var.n);
                }
                if (i != Integer.MAX_VALUE && !z2) {
                    mb5Var.h.g1(K0 + 1, i);
                }
                if (mb5Var.N) {
                    mb5Var.M.P("", false);
                    phaVar = ((d) mb5Var).simpleActionBar;
                    phaVar.n(true);
                }
                u0bVar.dismiss();
                return;
            case 6:
                u0bVar.r1.p();
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, true, true);
                return;
            case 7:
                u0bVar.r1.p();
                a1b.b(u0bVar.M1.set, u0bVar.J0, u0bVar.getContext(), new h0b(u0bVar, (byte) 4));
                return;
            case 8:
                u0bVar.r1.p();
                u0bVar.dismiss();
                gl.d3(new h0b(u0bVar, (byte) 3), 200L);
                return;
            case 9:
                u0bVar.dismiss();
                s0b s0bVar = u0bVar.W1;
                if (s0bVar != null) {
                    s0bVar.a();
                }
                if (u0bVar.P1 != null) {
                    Runnable runnable = (Runnable) hq6.d0(u0bVar.a).U.f(u0bVar.P1.id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = u0bVar.P1;
                    ConnectionsManager.getInstance(u0bVar.a).sendRequest(tL_messages_installStickerSet, new wx9(u0bVar, (byte) 6));
                    return;
                }
                return;
            case 10:
                if (u0bVar.L1) {
                    u0bVar.F0();
                    return;
                } else {
                    u0bVar.H0();
                    return;
                }
            case 11:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, true, u0bVar.d2);
                return;
            case 12:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 0, u0bVar.F1, true, u0bVar.d2);
                return;
            case 13:
                u0b u0bVar2 = this.b;
                Context context = u0bVar2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = k96.M0(2131749047, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                alertDialog$Builder.j(k96.M0(2131748058, null), new ho9((byte) 13));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, nme.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                zkb.X(textView2, bkb.s5, u0bVar2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, gl.L(4.0f), 0, 0);
                frameLayout.addView(textView2, nme.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                zkb.F(editTextBoldCursor, bkb.t5, bkb.u5, bkb.p7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                zkb.X(editTextBoldCursor, bkb.i5, u0bVar2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                zkb.l(editTextBoldCursor, 30, bkb.F6, u0bVar2.J0);
                editTextBoldCursor.setCursorSize(gl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ww7(u0bVar2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, nme.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new gc4(alertDialog$Builder, (byte) 3));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.g(k96.M0(2131752577, null), new kt3(editTextBoldCursor, (byte) 6));
                textView.setText(gl.S2(k96.M0(2131749046, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(gl.L(23.0f), gl.L(12.0f), gl.L(23.0f), gl.L(6.0f));
                zkb.X(textView, bkb.p5, u0bVar2.J0);
                linearLayout.addView(textView, nme.o(-1, -2));
                hdVar.setOnShowListener(new hc4(editTextBoldCursor, (byte) 3));
                hdVar.show();
                editTextBoldCursor.requestFocus();
                hdVar.c(-1).setOnClickListener(new ff(u0bVar2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, (byte) 4));
                return;
            default:
                u0bVar.dismiss();
                return;
        }
    }
}
