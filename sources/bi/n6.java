package bi;

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
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.qh;
public final class n6 implements Utilities.CallbackReturn {
    public final int f3235a;
    public final Object f3236b;
    public final Object f3237c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i10) {
        this.f3235a = i10;
        this.f3236b = obj;
        this.f3237c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f3235a) {
            case 0:
                r7 r7Var = (r7) this.f3236b;
                boolean[] zArr = (boolean[]) this.f3237c;
                y6 y6Var = (y6) this.d;
                Integer num = (Integer) obj;
                j7 j7Var = r7Var.R0;
                d7 d7Var = r7Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    r7Var.L0(null, new ai.c0(r7Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ef.a(true, new y2(2, r7Var, y6Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    y6Var.dismiss();
                    ce ceVar = ((ad) r7Var).A2;
                    ceVar.f2439c1.L.b(true);
                    ceVar.w();
                    ceVar.t(true);
                    ceVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    i9 i9Var = new i9(r7Var.getContext(), false, null, new ai.b(r7Var, 6), new zh.b());
                    i9Var.setOnDismissListener(new c6(r7Var, 2));
                    i9Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    r7Var.f3521l2 = true;
                    r7Var.d0(r7Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(r7Var.F1).isPremium()) {
                        try {
                            y6Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.wc(y6Var.container, d7Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new c6(r7Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j7Var.getChildCount(); i11++) {
                        if (j7Var.getChildAt(i11) instanceof pg.q0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.wc(y6Var.container, d7Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    r7Var.K0(null);
                    y6Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.f3236b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f3237c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    w70 F = w70.F(g0Var.container, f6Var, e0Var);
                    F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    z zVar = new z(g0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f29547j0 = tL_aiComposeTone2;
                                    zVar.f29545h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.f29538a0.setText(zVar.f29547j0.title);
                                    zVar.f29539b0.setText(zVar.f29547j0.prompt);
                                    if (zVar.f29547j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.f29541d0.a(z10, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f29544g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.m0.N(false);
                                    zVar.f29549l0 = new f(g0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.oe(13, g0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.da(g0Var, tL_aiComposeTone, context, f6Var, 11), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new qh(22, g0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    z zVar = new z(g0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f29547j0 = tL_aiComposeTone2;
                                    zVar.f29545h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.f29538a0.setText(zVar.f29547j0.title);
                                    zVar.f29539b0.setText(zVar.f29547j0.prompt);
                                    if (zVar.f29547j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.f29541d0.a(z10, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f29544g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.m0.N(false);
                                    zVar.f29549l0 = new f(g0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.oe(13, g0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((qh.g) this.d).f41024b;
                return qh.c.d(view, (String) this.f3236b, (String) this.f3237c, messageObject.getDocument(), messageObject);
            default:
                vl0 vl0Var = (vl0) this.f3236b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f3237c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != vl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = vl0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f41613f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
