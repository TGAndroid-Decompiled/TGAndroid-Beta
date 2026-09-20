package ci;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.gh;
public final class p5 implements Utilities.CallbackReturn {
    public final int f5307a;
    public final Object f5308b;
    public final Object f5309c;
    public final Object d;

    public p5(Object obj, Object obj2, Object obj3, int i10) {
        this.f5307a = i10;
        this.f5308b = obj;
        this.f5309c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5307a) {
            case 0:
                r6 r6Var = (r6) this.f5308b;
                boolean[] zArr = (boolean[]) this.f5309c;
                z5 z5Var = (z5) this.d;
                Integer num = (Integer) obj;
                k6 k6Var = r6Var.R0;
                e6 e6Var = r6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    r6Var.L0(null, new bi.v(r6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    od.a(true, new m2(2, r6Var, z5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    z5Var.dismiss();
                    oc ocVar = ((qb) r6Var).A2;
                    ocVar.f5214c1.L.b(true);
                    ocVar.w();
                    ocVar.t(true);
                    ocVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    g8 g8Var = new g8(r6Var.getContext(), false, null, new ai.y1(r6Var, 10), new ai.d());
                    g8Var.setOnDismissListener(new g5(r6Var, 2));
                    g8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    r6Var.f5431l2 = true;
                    r6Var.d0(r6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(r6Var.F1).isPremium()) {
                        try {
                            z5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.xc(z5Var.container, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new g5(r6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                        if (k6Var.getChildAt(i11) instanceof qg.r0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.xc(z5Var.container, e6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    r6Var.K0(null);
                    z5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f5308b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f5309c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    v70 F = v70.F(e0Var.container, f6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30409j0 = tL_aiComposeTone2;
                                    yVar.f30407h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30400a0.setText(yVar.f30409j0.title);
                                    yVar.f30401b0.setText(yVar.f30409j0.prompt);
                                    if (yVar.f30409j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30403d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30406g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30411l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.l4(18, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.n5(e0Var, tL_aiComposeTone, context, f6Var, 15), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new gh(25, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30409j0 = tL_aiComposeTone2;
                                    yVar.f30407h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30400a0.setText(yVar.f30409j0.title);
                                    yVar.f30401b0.setText(yVar.f30409j0.prompt);
                                    if (yVar.f30409j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30403d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30406g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30411l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.l4(18, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    });
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                MessageObject messageObject = ((rh.g) this.d).f42898b;
                return rh.c.d(view, (String) this.f5308b, (String) this.f5309c, messageObject.getDocument(), messageObject);
            default:
                vl0 vl0Var = (vl0) this.f5308b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f5309c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != vl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 U = vl0Var.U(view2);
                    if (U != null) {
                        sparseIntArray.put(U.f42977f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
