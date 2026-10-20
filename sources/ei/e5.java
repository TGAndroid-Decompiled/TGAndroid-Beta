package ei;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.eh;
public final class e5 implements Utilities.CallbackReturn {
    public final int f8955a;
    public final Object f8956b;
    public final Object f8957c;
    public final Object d;

    public e5(Object obj, Object obj2, Object obj3, int i10) {
        this.f8955a = i10;
        this.f8956b = obj;
        this.f8957c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f8955a) {
            case 0:
                f6 f6Var = (f6) this.f8956b;
                boolean[] zArr = (boolean[]) this.f8957c;
                o5 o5Var = (o5) this.d;
                Integer num = (Integer) obj;
                z5 z5Var = f6Var.R0;
                t5 t5Var = f6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    f6Var.K0(null, new ai.q(f6Var, 16));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    uc.a(true, new ai.o2(9, f6Var, o5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    o5Var.dismiss();
                    vb vbVar = ((xa) f6Var).A2;
                    vbVar.f9956c1.L.b(true);
                    vbVar.v();
                    vbVar.s(true);
                    vbVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    s7 s7Var = new s7(f6Var.getContext(), false, null, new ai.r0(f6Var, 18), new ci.b());
                    s7Var.setOnDismissListener(new w4(f6Var, 2));
                    s7Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    f6Var.f9020l2 = true;
                    f6Var.d0(f6Var.k0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(f6Var.F1).isPremium()) {
                        try {
                            o5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new xc(o5Var.container, t5Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new w4(f6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < z5Var.getChildCount(); i11++) {
                        if (z5Var.getChildAt(i11) instanceof rg.q0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new xc(o5Var.container, t5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    f6Var.J0(null);
                    o5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f8956b;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f8957c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    i80 F = i80.F(e0Var.container, d6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, d6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f32518j0 = tL_aiComposeTone2;
                                    yVar.f32516h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f32509a0.setText(yVar.f32518j0.title);
                                    yVar.f32510b0.setText(yVar.f32518j0.prompt);
                                    if (yVar.f32518j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f32512d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f32515g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f32520l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var);
                                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.w0(24, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.messenger.camera.i(e0Var, tL_aiComposeTone, context, d6Var, 19), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new eh(22, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f32518j0 = tL_aiComposeTone2;
                                    yVar.f32516h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f32509a0.setText(yVar.f32518j0.title);
                                    yVar.f32510b0.setText(yVar.f32518j0.prompt);
                                    if (yVar.f32518j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f32512d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f32515g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f32520l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var);
                                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.w0(24, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((sh.g) this.d).f46548b;
                return sh.c.d(view, (String) this.f8956b, (String) this.f8957c, messageObject.getDocument(), messageObject);
            default:
                jm0 jm0Var = (jm0) this.f8956b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f8957c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != jm0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.b1 T = jm0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f45920f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
