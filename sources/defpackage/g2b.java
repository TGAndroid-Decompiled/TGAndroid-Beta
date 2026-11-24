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
public final class g2b implements View.OnClickListener {
    public final byte a;
    public final x2b b;

    public g2b(x2b x2bVar, byte b) {
        this.a = b;
        this.b = x2bVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        TLRPC.StickerSet stickerSet;
        int i;
        rja rjaVar;
        byte b = this.a;
        x2b x2bVar = this.b;
        switch (b) {
            case 0:
                d dVar = x2bVar.F1;
                if (dVar != null) {
                    new kj8(dVar, 11, false).show();
                    return;
                } else if (x2bVar.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) x2bVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                hs6 d0 = hs6.d0(x2bVar.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
                if (tL_messages_stickerSet != null && d0.D0(tL_messages_stickerSet.set.id, true)) {
                    z = false;
                } else {
                    z = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = x2bVar.M1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && x2bVar.s1 == null) {
                    x2bVar.r1.e(3, 2131232791, jb6.M0(2131744540, null));
                    x2bVar.r1.e(4, 2131232122, jb6.M0(2131751201, null));
                    if (z) {
                        x2bVar.s1 = x2bVar.r1.e(5, 2131232114, jb6.M0(2131751535, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, x2bVar.J0, x2bVar.getContext());
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232063, jb6.M0(2131753721, null), false, x2bVar.J0).setOnClickListener(new g2b(x2bVar, (byte) 4));
                        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131744550, null), false, x2bVar.J0);
                        int i2 = cmb.p7;
                        x2bVar.S(i2);
                        c.c(i2, i2);
                        c.h(0.1f, i2);
                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131744543, null), false, x2bVar.J0).setOnClickListener(new g2b(x2bVar, (byte) 6));
                        c.setOnClickListener(new g2b(x2bVar, (byte) 7));
                        x2bVar.s1 = x2bVar.r1.i(2131232114, null, jb6.M0(2131751535, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    x2bVar.r1.a(-1);
                    j37 j37Var = new j37(x2bVar.a, 4, x2bVar.J0, x2bVar.getContext(), new ArrayList());
                    j37Var.setOnClickListener(new g2b(x2bVar, (byte) 8));
                    j37Var.setTag(2131296439, 1);
                    r7 r7Var = x2bVar.r1;
                    r7Var.q();
                    r7Var.b.a(j37Var, new LinearLayout.LayoutParams(-1, -2));
                    int v0 = cmb.v0(cmb.p7, x2bVar.J0);
                    x2bVar.s1.d(v0, v0);
                    x2bVar.s1.setSelectorColor(cmb.p1(0.1f, v0));
                    if (x2bVar.s1.getRightIcon() != null) {
                        x2bVar.s1.getRightIcon().setColorFilter(v0);
                    }
                }
                if (x2bVar.r1.getPopupLayout() != null) {
                    x2bVar.r1.getPopupLayout().requestLayout();
                }
                x2bVar.r1.U(null, null);
                return;
            case 2:
                x2bVar.I0();
                return;
            case 3:
                if (x2bVar.S1 != null) {
                    x2bVar.M0(x2bVar.O1);
                    x2bVar.I0();
                    x2bVar.O1 = null;
                    return;
                }
                x2bVar.V1.e(x2bVar.N1, null, x2bVar.M1, null, x2bVar.c2, true, 0, 0);
                x2bVar.dismiss();
                return;
            case 4:
                x2bVar.r1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                ed5 ed5Var = x2bVar.X1;
                kd5 kd5Var = ed5Var.c;
                u46 u46Var = kd5Var.h;
                boolean z2 = kd5Var.O;
                int K0 = u46Var.K0();
                b59 b59Var = (b59) kd5Var.d.K(K0);
                if (b59Var != null) {
                    i = b59Var.a.getTop();
                } else {
                    i = Integer.MAX_VALUE;
                }
                int i3 = kd5Var.n;
                if (ed5Var.a) {
                    kd5Var.r = null;
                    kd5Var.s = true;
                } else {
                    kd5Var.r = ed5Var.b;
                    kd5Var.s = false;
                }
                if (z2) {
                    gm.d3(new qn4(ed5Var, (byte) 27), 350L);
                }
                kd5Var.m0();
                kd5Var.k0(kd5Var.r, true);
                if (i3 != -1) {
                    if (!kd5Var.N) {
                        for (int i4 = 0; i4 < kd5Var.d.getChildCount(); i4++) {
                            View childAt = kd5Var.d.getChildAt(i4);
                            if (kd5Var.d.T(childAt).b() == kd5Var.F + i3) {
                                ((s1b) childAt).b(false, true);
                            }
                        }
                    }
                    kd5Var.e.g(i3);
                }
                if (kd5Var.n != -1) {
                    if (!kd5Var.N) {
                        for (int i5 = 0; i5 < kd5Var.d.getChildCount(); i5++) {
                            View childAt2 = kd5Var.d.getChildAt(i5);
                            if (kd5Var.d.T(childAt2).b() == kd5Var.F + kd5Var.n) {
                                ((s1b) childAt2).b(true, true);
                            }
                        }
                    }
                    kd5Var.e.g(kd5Var.n);
                }
                if (i != Integer.MAX_VALUE && !z2) {
                    kd5Var.h.g1(K0 + 1, i);
                }
                if (kd5Var.N) {
                    kd5Var.M.P("", false);
                    rjaVar = ((d) kd5Var).simpleActionBar;
                    rjaVar.o(true);
                }
                x2bVar.dismiss();
                return;
            case 6:
                x2bVar.r1.p();
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, true, true);
                return;
            case 7:
                x2bVar.r1.p();
                c3b.b(x2bVar.M1.set, x2bVar.J0, x2bVar.getContext(), new i2b(x2bVar, (byte) 4));
                return;
            case 8:
                x2bVar.r1.p();
                x2bVar.dismiss();
                gm.d3(new i2b(x2bVar, (byte) 3), 200L);
                return;
            case 9:
                x2bVar.dismiss();
                v2b v2bVar = x2bVar.W1;
                if (v2bVar != null) {
                    v2bVar.a();
                }
                if (x2bVar.P1 != null) {
                    Runnable runnable = (Runnable) hs6.d0(x2bVar.a).U.f(x2bVar.P1.id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = x2bVar.P1;
                    ConnectionsManager.getInstance(x2bVar.a).sendRequest(tL_messages_installStickerSet, new go9(x2bVar, (byte) 7));
                    return;
                }
                return;
            case 10:
                if (x2bVar.L1) {
                    x2bVar.F0();
                    return;
                } else {
                    x2bVar.H0();
                    return;
                }
            case 11:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, true, x2bVar.d2);
                return;
            case 12:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 0, x2bVar.F1, true, x2bVar.d2);
                return;
            case 13:
                x2b x2bVar2 = this.b;
                Context context = x2bVar2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = jb6.M0(2131748996, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                alertDialog$Builder.j(jb6.M0(2131747984, null), new dq9((byte) 14));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, qoe.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                anb.X(textView2, cmb.s5, x2bVar2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, gm.L(4.0f), 0, 0);
                frameLayout.addView(textView2, qoe.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                anb.F(editTextBoldCursor, cmb.t5, cmb.u5, cmb.p7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                anb.X(editTextBoldCursor, cmb.i5, x2bVar2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                anb.l(editTextBoldCursor, 30, cmb.F6, x2bVar2.J0);
                editTextBoldCursor.setCursorSize(gm.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new zy7(x2bVar2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, qoe.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new ge4(alertDialog$Builder, (byte) 3));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.g(jb6.M0(2131752542, null), new uu3(editTextBoldCursor, (byte) 6));
                textView.setText(gm.S2(jb6.M0(2131748995, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(gm.L(23.0f), gm.L(12.0f), gm.L(23.0f), gm.L(6.0f));
                anb.X(textView, cmb.p5, x2bVar2.J0);
                linearLayout.addView(textView, qoe.o(-1, -2));
                heVar.setOnShowListener(new he4(editTextBoldCursor, (byte) 3));
                heVar.show();
                editTextBoldCursor.requestFocus();
                heVar.c(-1).setOnClickListener(new gg(x2bVar2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, (byte) 4));
                return;
            default:
                x2bVar.dismiss();
                return;
        }
    }
}
