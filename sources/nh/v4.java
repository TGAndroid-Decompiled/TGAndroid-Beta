package nh;

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
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.gg;
import org.telegram.ui.vf;
public final class v4 implements Utilities.CallbackReturn {
    public final int f18746a;
    public final Object f18747b;
    public final Object f18748c;
    public final Object d;

    public v4(Object obj, Object obj2, Object obj3, int i10) {
        this.f18746a = i10;
        this.f18747b = obj;
        this.f18748c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f18746a) {
            case 0:
                t5 t5Var = (t5) this.f18747b;
                boolean[] zArr = (boolean[]) this.f18748c;
                c5 c5Var = (c5) this.d;
                Integer num = (Integer) obj;
                n5 n5Var = t5Var.N0;
                h5 h5Var = t5Var.C1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    t5Var.L0(null, new th.n2(t5Var, 1));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ec.a(true, new ih.b1(11, t5Var, c5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    c5Var.dismiss();
                    gb gbVar = ((ja) t5Var).f17975w2;
                    gbVar.Y0.H.b(true);
                    gbVar.w();
                    gbVar.t(true);
                    gbVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    g7 g7Var = new g7(t5Var.getContext(), false, null, new b0(t5Var, 4), new lh.b());
                    g7Var.setOnDismissListener(new p4(t5Var, 2));
                    g7Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    t5Var.f18637h2 = true;
                    t5Var.d0(t5Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(t5Var.B1).isPremium()) {
                        try {
                            c5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new tc(c5Var.container, h5Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new p4(t5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < n5Var.getChildCount(); i11++) {
                        if (n5Var.getChildAt(i11) instanceof bg.k1) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new tc(c5Var.container, h5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    t5Var.K0(null);
                    c5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.f18747b;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f18748c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.f27897e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    j70 F = j70.F(g0Var.container, c6Var, e0Var);
                    F.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    a0 a0Var = new a0(g0Var2.getContext(), c6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    a0Var.f26606f0 = tL_aiComposeTone2;
                                    a0Var.f26604d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    a0Var.X();
                                    a0Var.W.setText(a0Var.f26606f0.title);
                                    a0Var.X.setText(a0Var.f26606f0.prompt);
                                    if (a0Var.f26606f0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    a0Var.Z.a(z10, false);
                                    a0Var.f34660e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    a0Var.f26603c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    a0Var.W();
                                    a0Var.f26609i0.N(false);
                                    a0Var.f26608h0 = new e(g0Var2, 2);
                                    a0Var.show();
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, c6Var);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kg.w(27, g0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new gg(g0Var, tL_aiComposeTone, context, c6Var, 8), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new vf(28, g0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    a0 a0Var = new a0(g0Var2.getContext(), c6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    a0Var.f26606f0 = tL_aiComposeTone2;
                                    a0Var.f26604d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    a0Var.X();
                                    a0Var.W.setText(a0Var.f26606f0.title);
                                    a0Var.X.setText(a0Var.f26606f0.prompt);
                                    if (a0Var.f26606f0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    a0Var.Z.a(z10, false);
                                    a0Var.f34660e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    a0Var.f26603c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    a0Var.W();
                                    a0Var.f26609i0.N(false);
                                    a0Var.f26608h0 = new e(g0Var2, 2);
                                    a0Var.show();
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, c6Var);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kg.w(27, g0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((ch.h) this.d).f3501b;
                return ch.c.d(view, (String) this.f18747b, (String) this.f18748c, messageObject.getDocument(), messageObject);
            default:
                jl0 jl0Var = (jl0) this.f18747b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f18748c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != jl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    f2.n1 T = jl0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f6436f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
