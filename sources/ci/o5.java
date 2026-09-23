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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.rh;
public final class o5 implements Utilities.CallbackReturn {
    public final int f5240a;
    public final Object f5241b;
    public final Object f5242c;
    public final Object d;

    public o5(Object obj, Object obj2, Object obj3, int i10) {
        this.f5240a = i10;
        this.f5241b = obj;
        this.f5242c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5240a) {
            case 0:
                q6 q6Var = (q6) this.f5241b;
                boolean[] zArr = (boolean[]) this.f5242c;
                y5 y5Var = (y5) this.d;
                Integer num = (Integer) obj;
                j6 j6Var = q6Var.R0;
                d6 d6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.L0(null, new bi.v(q6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ld.a(true, new ai.g3(3, q6Var, y5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    y5Var.dismiss();
                    lc lcVar = ((nb) q6Var).A2;
                    lcVar.f5035c1.L.b(true);
                    lcVar.w();
                    lcVar.t(true);
                    lcVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    d8 d8Var = new d8(q6Var.getContext(), false, null, new ai.y1(q6Var, 12), new ai.d());
                    d8Var.setOnDismissListener(new f5(q6Var, 2));
                    d8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    q6Var.f5352l2 = true;
                    q6Var.d0(q6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(q6Var.F1).isPremium()) {
                        try {
                            y5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.xc(y5Var.container, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new f5(q6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
                        if (j6Var.getChildAt(i11) instanceof qg.t0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.xc(y5Var.container, d6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    q6Var.K0(null);
                    y5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f5241b;
                final org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.f5242c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    o70 F = o70.F(e0Var.container, d6Var2, c0Var);
                    F.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, d6Var2)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30111j0 = tL_aiComposeTone2;
                                    yVar.f30109h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30102a0.setText(yVar.f30111j0.title);
                                    yVar.f30103b0.setText(yVar.f30111j0.prompt);
                                    if (yVar.f30111j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30105d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30108g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30113l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.u(19, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.m5(e0Var, tL_aiComposeTone, context, d6Var2, 15), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new rh(19, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30111j0 = tL_aiComposeTone2;
                                    yVar.f30109h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30102a0.setText(yVar.f30111j0.title);
                                    yVar.f30103b0.setText(yVar.f30111j0.prompt);
                                    if (yVar.f30111j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30105d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30108g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30113l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.u(19, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((rh.g) this.d).f42551b;
                return rh.c.d(view, (String) this.f5241b, (String) this.f5242c, messageObject.getDocument(), messageObject);
            default:
                ml0 ml0Var = (ml0) this.f5241b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f5242c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ml0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = ml0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f42630f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
