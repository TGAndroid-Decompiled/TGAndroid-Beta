package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.o;
public final class aw implements Runnable {
    public final byte a;
    public final o b;

    public aw(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        fib fibVar;
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
                        oVar.X(((thb) oVar.b.i).b);
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
                        if (oVar.f.getTag() != null && oVar.f.getTag() == "bottomSheet" && (fibVar = oVar.R0) != null) {
                            fibVar.k0();
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
                        int L = (iArr[1] + oVar.e) - gl.L(54.0f);
                        if (L < 0) {
                            L = 0;
                        }
                        oVar.f.invalidate();
                        oVar.h = true;
                        View view3 = oVar.f;
                        m8 m8Var = oVar.I;
                        if (m8Var != null && m8Var.isShowing()) {
                            oVar.I.d(true);
                        } else {
                            if (oVar.C0 == null) {
                                oVar.E0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(oVar.M, null);
                                oVar.C0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
                                oVar.C0.setBackgroundDrawable(oVar.M.getResources().getDrawable(2131231785));
                                oVar.C0.setAnimationEnabled(false);
                                oVar.C0.setOnTouchListener(new a7(oVar, (byte) 1));
                                oVar.C0.setDispatchKeyEventListener(new ys(oVar));
                                oVar.C0.setShownFromBottom(false);
                                TextView textView = new TextView(oVar.M);
                                oVar.D0 = textView;
                                int i = bkb.h6;
                                ff0 f0 = bkb.f0(bkb.w0(null, i, false), 2, -1);
                                vkb M = zkb.M(i);
                                textView.setBackground(f0);
                                zkb.j(textView, f0, null, M, null);
                                oVar.D0.setGravity(16);
                                oVar.D0.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
                                oVar.D0.setTextSize(1, 15.0f);
                                oVar.D0.setTypeface(gl.o());
                                oVar.D0.setText(k96.M0(2131751755, null).toUpperCase());
                                oVar.D0.setOnClickListener(new xs(oVar, (byte) 5));
                                oVar.C0.addView(oVar.D0, nme.c(48.0f, -2));
                                m8 m8Var2 = new m8(oVar.C0, -2, -2);
                                oVar.I = m8Var2;
                                m8Var2.b = false;
                                m8Var2.setAnimationStyle(2131755192);
                                oVar.I.setOutsideTouchable(true);
                                oVar.I.setClippingEnabled(true);
                                oVar.I.setInputMethodMode(2);
                                oVar.I.setSoftInputMode(0);
                                oVar.I.getContentView().setFocusableInTouchMode(true);
                                oVar.I.setOnDismissListener(new x6(oVar, (byte) 1));
                            }
                            zkb.X(oVar.D0, bkb.D8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = oVar.C0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                zkb.h(bkb.F8, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            }
                            oVar.C0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
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
                aw awVar = oVar.M0;
                if (awVar == null) {
                    awVar = new aw(oVar, (byte) 0);
                    oVar.M0 = awVar;
                }
                ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(awVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
