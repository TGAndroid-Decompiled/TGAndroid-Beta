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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.uh;
public final class p5 implements Utilities.CallbackReturn {
    public final int f5301a;
    public final Object f5302b;
    public final Object f5303c;
    public final Object d;

    public p5(Object obj, Object obj2, Object obj3, int i10) {
        this.f5301a = i10;
        this.f5302b = obj;
        this.f5303c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5301a) {
            case 0:
                r6 r6Var = (r6) this.f5302b;
                boolean[] zArr = (boolean[]) this.f5303c;
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
                    ocVar.f5208c1.L.b(true);
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
                    r6Var.f5425l2 = true;
                    r6Var.d0(r6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(r6Var.F1).isPremium()) {
                        try {
                            z5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.vc(z5Var.container, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new g5(r6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                        if (k6Var.getChildAt(i11) instanceof qg.t0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.vc(z5Var.container, e6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
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
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f5302b;
                final org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.f5303c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    n70 F = n70.F(e0Var.container, e6Var2, c0Var);
                    F.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var2)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), e6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30108j0 = tL_aiComposeTone2;
                                    yVar.f30106h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30099a0.setText(yVar.f30108j0.title);
                                    yVar.f30100b0.setText(yVar.f30108j0.prompt);
                                    if (yVar.f30108j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30102d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30105g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30110l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, e6Var2);
                                    alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.x5(17, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.n5(e0Var, tL_aiComposeTone, context, e6Var2, 15), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new uh(19, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), e6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f30108j0 = tL_aiComposeTone2;
                                    yVar.f30106h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f30099a0.setText(yVar.f30108j0.title);
                                    yVar.f30100b0.setText(yVar.f30108j0.prompt);
                                    if (yVar.f30108j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f30102d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f30105g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.m0.N(false);
                                    yVar.f30110l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, e6Var2);
                                    alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.x5(17, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((rh.g) this.d).f42600b;
                return rh.c.d(view, (String) this.f5302b, (String) this.f5303c, messageObject.getDocument(), messageObject);
            default:
                ll0 ll0Var = (ll0) this.f5302b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f5303c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ll0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = ll0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f42678f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
