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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class d4b implements View.OnClickListener {
    public final byte a;
    public final s4b b;

    public d4b(s4b s4bVar, byte b) {
        this.a = b;
        this.b = s4bVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        TLRPC.StickerSet stickerSet;
        int i;
        jla jlaVar;
        byte b = this.a;
        s4b s4bVar = this.b;
        switch (b) {
            case 0:
                s4bVar.dismiss();
                return;
            case 1:
                ls6 d0 = ls6.d0(s4bVar.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
                if (tL_messages_stickerSet != null && d0.D0(tL_messages_stickerSet.set.id, true)) {
                    z = false;
                } else {
                    z = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s4bVar.M1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && s4bVar.s1 == null) {
                    s4bVar.r1.e(3, 2131232797, ob6.M0(2131744508, null));
                    s4bVar.r1.e(4, 2131232121, ob6.M0(2131751229, null));
                    if (z) {
                        s4bVar.s1 = s4bVar.r1.e(5, 2131232113, ob6.M0(2131751563, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, s4bVar.J0, s4bVar.getContext());
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, ob6.M0(2131753749, null), false, s4bVar.J0).setOnClickListener(new d4b(s4bVar, (byte) 4));
                        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131744518, null), false, s4bVar.J0);
                        int i2 = aob.q7;
                        s4bVar.T(i2);
                        c.c(i2, i2);
                        c.h(0.1f, i2);
                        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131744511, null), false, s4bVar.J0).setOnClickListener(new d4b(s4bVar, (byte) 5));
                        c.setOnClickListener(new d4b(s4bVar, (byte) 6));
                        s4bVar.s1 = s4bVar.r1.i(2131232113, null, ob6.M0(2131751563, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    s4bVar.r1.a(-1);
                    q37 q37Var = new q37(s4bVar.a, 4, s4bVar.J0, s4bVar.getContext(), new ArrayList());
                    q37Var.setOnClickListener(new d4b(s4bVar, (byte) 7));
                    q37Var.setTag(2131296439, 1);
                    s7 s7Var = s4bVar.r1;
                    s7Var.q();
                    s7Var.b.a(q37Var, new LinearLayout.LayoutParams(-1, -2));
                    int v0 = aob.v0(aob.q7, s4bVar.J0);
                    s4bVar.s1.d(v0, v0);
                    s4bVar.s1.setSelectorColor(aob.p1(0.1f, v0));
                    if (s4bVar.s1.getRightIcon() != null) {
                        s4bVar.s1.getRightIcon().setColorFilter(v0);
                    }
                }
                if (s4bVar.r1.getPopupLayout() != null) {
                    s4bVar.r1.getPopupLayout().requestLayout();
                }
                s4bVar.r1.U(null, null);
                return;
            case 2:
                s4bVar.J0();
                return;
            case 3:
                if (s4bVar.S1 != null) {
                    s4bVar.N0(s4bVar.O1);
                    s4bVar.J0();
                    s4bVar.O1 = null;
                    return;
                }
                s4bVar.V1.e(s4bVar.N1, null, s4bVar.M1, null, s4bVar.c2, true, 0, 0);
                s4bVar.dismiss();
                return;
            case 4:
                s4bVar.r1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                s4bVar.r1.p();
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, true, true);
                return;
            case 6:
                s4bVar.r1.p();
                x4b.b(s4bVar.M1.set, s4bVar.J0, s4bVar.getContext(), new f4b(s4bVar, (byte) 4));
                return;
            case 7:
                s4bVar.r1.p();
                s4bVar.dismiss();
                hl.d3(new f4b(s4bVar, (byte) 3), 200L);
                return;
            case 8:
                e eVar = s4bVar.F1;
                if (eVar != null) {
                    new xk8(eVar, 11, false).show();
                    return;
                } else if (s4bVar.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) s4bVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 9:
                id5 id5Var = s4bVar.X1;
                nd5 nd5Var = id5Var.c;
                x46 x46Var = nd5Var.h;
                boolean z2 = nd5Var.O;
                int K0 = x46Var.K0();
                n69 n69Var = (n69) nd5Var.d.L(K0);
                if (n69Var != null) {
                    i = n69Var.a.getTop();
                } else {
                    i = Integer.MAX_VALUE;
                }
                int i3 = nd5Var.n;
                if (id5Var.a) {
                    nd5Var.r = null;
                    nd5Var.s = true;
                } else {
                    nd5Var.r = id5Var.b;
                    nd5Var.s = false;
                }
                if (z2) {
                    hl.d3(new ea5(id5Var, (byte) 5), 350L);
                }
                nd5Var.l0();
                nd5Var.j0(nd5Var.r, true);
                if (i3 != -1) {
                    if (!nd5Var.N) {
                        for (int i4 = 0; i4 < nd5Var.d.getChildCount(); i4++) {
                            View childAt = nd5Var.d.getChildAt(i4);
                            if (nd5Var.d.U(childAt).b() == nd5Var.F + i3) {
                                ((p3b) childAt).b(false, true);
                            }
                        }
                    }
                    nd5Var.e.g(i3);
                }
                if (nd5Var.n != -1) {
                    if (!nd5Var.N) {
                        for (int i5 = 0; i5 < nd5Var.d.getChildCount(); i5++) {
                            View childAt2 = nd5Var.d.getChildAt(i5);
                            if (nd5Var.d.U(childAt2).b() == nd5Var.F + nd5Var.n) {
                                ((p3b) childAt2).b(true, true);
                            }
                        }
                    }
                    nd5Var.e.g(nd5Var.n);
                }
                if (i != Integer.MAX_VALUE && !z2) {
                    nd5Var.h.g1(K0 + 1, i);
                }
                if (nd5Var.N) {
                    nd5Var.M.P("", false);
                    jlaVar = ((e) nd5Var).simpleActionBar;
                    jlaVar.o(true);
                }
                s4bVar.dismiss();
                return;
            case 10:
                s4bVar.dismiss();
                q4b q4bVar = s4bVar.W1;
                if (q4bVar != null) {
                    q4bVar.a();
                }
                if (s4bVar.P1 != null) {
                    Runnable runnable = (Runnable) ls6.d0(s4bVar.a).U.f(s4bVar.P1.id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = s4bVar.P1;
                    ConnectionsManager.getInstance(s4bVar.a).sendRequest(tL_messages_installStickerSet, new yp9(s4bVar, (byte) 7));
                    return;
                }
                return;
            case 11:
                if (s4bVar.L1) {
                    s4bVar.G0();
                    return;
                } else {
                    s4bVar.I0();
                    return;
                }
            case 12:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, true, s4bVar.d2);
                return;
            case 13:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 0, s4bVar.F1, true, s4bVar.d2);
                return;
            default:
                s4b s4bVar2 = this.b;
                Context context = s4bVar2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = ob6.M0(2131748993, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                alertDialog$Builder.j(ob6.M0(2131747981, null), new vr9((byte) 16));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, tre.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                yob.X(textView2, aob.t5, s4bVar2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, hl.L(4.0f), 0, 0);
                frameLayout.addView(textView2, tre.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                yob.F(editTextBoldCursor, aob.u5, aob.v5, aob.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                yob.X(editTextBoldCursor, aob.j5, s4bVar2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                yob.l(editTextBoldCursor, 30, aob.G6, s4bVar2.J0);
                editTextBoldCursor.setCursorSize(hl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new e08(s4bVar2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, tre.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new de4(alertDialog$Builder, (byte) 3));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.g(ob6.M0(2131752570, null), new bu3(editTextBoldCursor, (byte) 6));
                textView.setText(hl.S2(ob6.M0(2131748992, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(hl.L(23.0f), hl.L(12.0f), hl.L(23.0f), hl.L(6.0f));
                yob.X(textView, aob.q5, s4bVar2.J0);
                linearLayout.addView(textView, tre.o(-1, -2));
                idVar.setOnShowListener(new ee4(editTextBoldCursor, (byte) 3));
                idVar.show();
                editTextBoldCursor.requestFocus();
                idVar.c(-1).setOnClickListener(new xf(s4bVar2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, (byte) 4));
                return;
        }
    }
}
