package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.o;
public final class bw implements Runnable {
    public final byte a;
    public final o b;

    public bw(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        amb ambVar;
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (oVar.L0 && (articleViewer$WindowView = oVar.g0) != null) {
                    oVar.L0 = false;
                    if (oVar.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        oVar.X(((plb) oVar.b.i).b);
                        oVar.b = null;
                        oVar.d = null;
                        View view = oVar.f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = oVar.f;
                    if (view2 != null && oVar.Q0.e0(view2)) {
                        if (oVar.f.getTag() != null && oVar.f.getTag() == "bottomSheet" && (ambVar = oVar.R0) != null) {
                            ambVar.k0();
                        } else {
                            oVar.Q0.k0();
                        }
                        if (oVar.Q0.w()) {
                            try {
                                oVar.g0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (oVar.d != null && oVar.f != null) {
                        try {
                            oVar.g0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        oVar.f.getLocationInWindow(iArr);
                        int L = (iArr[1] + oVar.e) - hl.L(54.0f);
                        if (L < 0) {
                            L = 0;
                        }
                        oVar.f.invalidate();
                        oVar.h = true;
                        View view3 = oVar.f;
                        n8 n8Var = oVar.I;
                        if (n8Var != null && n8Var.isShowing()) {
                            oVar.I.d(true);
                        } else {
                            if (oVar.C0 == null) {
                                oVar.E0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(oVar.M, null);
                                oVar.C0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
                                oVar.C0.setBackgroundDrawable(oVar.M.getResources().getDrawable(2131231785));
                                oVar.C0.setAnimationEnabled(false);
                                oVar.C0.setOnTouchListener(new b7(oVar, (byte) 1));
                                oVar.C0.setDispatchKeyEventListener(new xs(oVar));
                                oVar.C0.setShownFromBottom(false);
                                TextView textView = new TextView(oVar.M);
                                oVar.D0 = textView;
                                int i = aob.i6;
                                hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
                                uob M = yob.M(i);
                                textView.setBackground(f0);
                                yob.j(textView, f0, null, M, null);
                                oVar.D0.setGravity(16);
                                oVar.D0.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
                                oVar.D0.setTextSize(1, 15.0f);
                                oVar.D0.setTypeface(hl.o());
                                oVar.D0.setText(ob6.M0(2131751732, null).toUpperCase());
                                oVar.D0.setOnClickListener(new ws(oVar, (byte) 5));
                                oVar.C0.addView(oVar.D0, tre.c(48.0f, -2));
                                n8 n8Var2 = new n8(oVar.C0, -2, -2);
                                oVar.I = n8Var2;
                                n8Var2.b = false;
                                n8Var2.setAnimationStyle(2131755192);
                                oVar.I.setOutsideTouchable(true);
                                oVar.I.setClippingEnabled(true);
                                oVar.I.setInputMethodMode(2);
                                oVar.I.setSoftInputMode(0);
                                oVar.I.getContentView().setFocusableInTouchMode(true);
                                oVar.I.setOnDismissListener(new y6(oVar, (byte) 1));
                            }
                            yob.X(oVar.D0, aob.E8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = oVar.C0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                yob.h(aob.G8, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            }
                            oVar.C0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
                            oVar.I.setFocusable(true);
                            oVar.I.showAtLocation(view3, 48, 0, L);
                            oVar.I.h();
                        }
                        oVar.v0[0].b.setLayoutFrozen(true);
                        oVar.v0[0].b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                bw bwVar = oVar.M0;
                if (bwVar == null) {
                    bwVar = new bw(oVar, (byte) 0);
                    oVar.M0 = bwVar;
                }
                ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(bwVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
