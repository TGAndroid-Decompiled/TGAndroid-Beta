package di;

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
import org.telegram.ui.fh;
public final class p5 implements Utilities.CallbackReturn {
    public final int f7825a;
    public final Object f7826b;
    public final Object f7827c;
    public final Object d;

    public p5(Object obj, Object obj2, Object obj3, int i10) {
        this.f7825a = i10;
        this.f7826b = obj;
        this.f7827c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f7825a) {
            case 0:
                q6 q6Var = (q6) this.f7826b;
                boolean[] zArr = (boolean[]) this.f7827c;
                z5 z5Var = (z5) this.d;
                Integer num = (Integer) obj;
                k6 k6Var = q6Var.R0;
                e6 e6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.L0(null, new ci.u(q6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    od.a(true, new m2(2, q6Var, z5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    z5Var.dismiss();
                    pc pcVar = ((rb) q6Var).A2;
                    pcVar.f7850c1.L.b(true);
                    pcVar.w();
                    pcVar.t(true);
                    pcVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    g8 g8Var = new g8(q6Var.getContext(), false, null, new bi.o1(q6Var, 10), new bi.b());
                    g8Var.setOnDismissListener(new g5(q6Var, 2));
                    g8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    q6Var.f7974l2 = true;
                    q6Var.d0(q6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(q6Var.F1).isPremium()) {
                        try {
                            z5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.yc(z5Var.container, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new g5(q6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                        if (k6Var.getChildAt(i11) instanceof rg.s0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.yc(z5Var.container, e6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    q6Var.K0(null);
                    z5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.f7826b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f7827c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.f25163e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    n70 F = n70.F(f0Var.container, f6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f33034j0 = tL_aiComposeTone2;
                                    zVar.f33032h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.f33025a0.setText(zVar.f33034j0.title);
                                    zVar.f33026b0.setText(zVar.f33034j0.prompt);
                                    if (zVar.f33034j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.f33028d0.a(z10, false);
                                    zVar.f24647e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f33031g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.m0.N(false);
                                    zVar.f33036l0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.m4(18, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.n5(f0Var, tL_aiComposeTone, context, f6Var, 15), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new fh(25, f0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f33034j0 = tL_aiComposeTone2;
                                    zVar.f33032h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.f33025a0.setText(zVar.f33034j0.title);
                                    zVar.f33026b0.setText(zVar.f33034j0.prompt);
                                    if (zVar.f33034j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.f33028d0.a(z10, false);
                                    zVar.f24647e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f33031g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.m0.N(false);
                                    zVar.f33036l0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.m4(18, f0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((sh.g) this.d).f46407b;
                return sh.c.d(view, (String) this.f7826b, (String) this.f7827c, messageObject.getDocument(), messageObject);
            default:
                ll0 ll0Var = (ll0) this.f7826b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f7827c;
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
                        sparseIntArray.put(T.f45742f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
